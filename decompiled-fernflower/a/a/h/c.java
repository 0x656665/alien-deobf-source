package a.a.h;

import javax.security.auth.x500.X500Principal;

final class c {
   final String a;
   final int b;
   int c;
   int d;
   int e;
   int f;
   char[] g;

   public c(X500Principal var1) {
      this.a = var1.getName("RFC2253");
      this.b = this.a.length();
   }

   private int a(int var1) {
      int var2 = var1 + 1;
      StringBuilder var3;
      if (var2 >= this.b) {
         var3 = new StringBuilder("Malformed DN: ");
         var3.append(this.a);
         throw new IllegalStateException(var3.toString());
      } else {
         char var4 = this.g[var1];
         if (var4 >= '0' && var4 <= '9') {
            var1 = var4 - 48;
         } else if (var4 >= 'a' && var4 <= 'f') {
            var1 = var4 - 87;
         } else {
            if (var4 < 'A' || var4 > 'F') {
               var3 = new StringBuilder("Malformed DN: ");
               var3.append(this.a);
               throw new IllegalStateException(var3.toString());
            }

            var1 = var4 - 55;
         }

         char var5 = this.g[var2];
         if (var5 >= '0' && var5 <= '9') {
            var2 = var5 - 48;
         } else if (var5 >= 'a' && var5 <= 'f') {
            var2 = var5 - 87;
         } else {
            if (var5 < 'A' || var5 > 'F') {
               var3 = new StringBuilder("Malformed DN: ");
               var3.append(this.a);
               throw new IllegalStateException(var3.toString());
            }

            var2 = var5 - 55;
         }

         return (var1 << 4) + var2;
      }
   }

   private char e() {
      int var1 = this.a(this.c);
      ++this.c;
      if (var1 < 128) {
         return (char)var1;
      } else if (var1 >= 192 && var1 <= 247) {
         byte var2;
         if (var1 <= 223) {
            var1 &= 31;
            var2 = 1;
         } else if (var1 <= 239) {
            var2 = 2;
            var1 &= 15;
         } else {
            var2 = 3;
            var1 &= 7;
         }

         for(int var3 = 0; var3 < var2; ++var3) {
            ++this.c;
            if (this.c == this.b) {
               return '?';
            }

            if (this.g[this.c] != '\\') {
               return '?';
            }

            ++this.c;
            int var4 = this.a(this.c);
            ++this.c;
            if ((var4 & 192) != 128) {
               return '?';
            }

            var1 = (var1 << 6) + (var4 & 63);
         }

         return (char)var1;
      } else {
         return '?';
      }
   }

   final String a() {
      while(this.c < this.b && this.g[this.c] == ' ') {
         ++this.c;
      }

      if (this.c == this.b) {
         return null;
      } else {
         for(this.d = this.c++; this.c < this.b && this.g[this.c] != '=' && this.g[this.c] != ' '; ++this.c) {
         }

         StringBuilder var1;
         if (this.c >= this.b) {
            var1 = new StringBuilder("Unexpected end of DN: ");
            var1.append(this.a);
            throw new IllegalStateException(var1.toString());
         } else {
            this.e = this.c;
            if (this.g[this.c] == ' ') {
               while(true) {
                  if (this.c >= this.b || this.g[this.c] == '=' || this.g[this.c] != ' ') {
                     if (this.g[this.c] != '=' || this.c == this.b) {
                        var1 = new StringBuilder("Unexpected end of DN: ");
                        var1.append(this.a);
                        throw new IllegalStateException(var1.toString());
                     }
                     break;
                  }

                  ++this.c;
               }
            }

            do {
               ++this.c;
            } while(this.c < this.b && this.g[this.c] == ' ');

            if (this.e - this.d > 4 && this.g[this.d + 3] == '.' && (this.g[this.d] == 'O' || this.g[this.d] == 'o') && (this.g[this.d + 1] == 'I' || this.g[this.d + 1] == 'i') && (this.g[this.d + 2] == 'D' || this.g[this.d + 2] == 'd')) {
               this.d += 4;
            }

            return new String(this.g, this.d, this.e - this.d);
         }
      }
   }

   final String b() {
      StringBuilder var5;
      if (this.c + 4 >= this.b) {
         var5 = new StringBuilder("Unexpected end of DN: ");
         var5.append(this.a);
         throw new IllegalStateException(var5.toString());
      } else {
         this.d = this.c++;

         int var1;
         label58:
         while(true) {
            if (this.c == this.b || this.g[this.c] == '+' || this.g[this.c] == ',' || this.g[this.c] == ';') {
               this.e = this.c;
               break;
            }

            if (this.g[this.c] == ' ') {
               this.e = this.c++;

               while(true) {
                  if (this.c >= this.b || this.g[this.c] != ' ') {
                     break label58;
                  }

                  ++this.c;
               }
            }

            if (this.g[this.c] >= 'A' && this.g[this.c] <= 'F') {
               char[] var4 = this.g;
               var1 = this.c;
               var4[var1] = (char)(var4[var1] + 32);
            }

            ++this.c;
         }

         int var3 = this.e - this.d;
         if (var3 >= 5 && (var3 & 1) != 0) {
            byte[] var6 = new byte[var3 / 2];
            var1 = 0;

            for(int var2 = this.d + 1; var1 < var6.length; ++var1) {
               var6[var1] = (byte)this.a(var2);
               var2 += 2;
            }

            return new String(this.g, this.d, var3);
         } else {
            var5 = new StringBuilder("Unexpected end of DN: ");
            var5.append(this.a);
            throw new IllegalStateException(var5.toString());
         }
      }
   }

   final String c() {
      this.d = this.c;
      this.e = this.c;

      while(this.c < this.b) {
         char var1 = this.g[this.c];
         char[] var2;
         int var3;
         if (var1 != ' ') {
            if (var1 != ';') {
               if (var1 == '\\') {
                  var2 = this.g;
                  var3 = this.e++;
                  var2[var3] = this.d();
                  ++this.c;
                  continue;
               }

               switch(var1) {
               case '+':
               case ',':
                  break;
               default:
                  var2 = this.g;
                  var3 = this.e++;
                  var2[var3] = this.g[this.c];
                  ++this.c;
                  continue;
               }
            }

            return new String(this.g, this.d, this.e - this.d);
         } else {
            this.f = this.e;
            ++this.c;
            var2 = this.g;
            var3 = this.e++;

            for(var2[var3] = ' '; this.c < this.b && this.g[this.c] == ' '; ++this.c) {
               var2 = this.g;
               var3 = this.e++;
               var2[var3] = ' ';
            }

            if (this.c == this.b || this.g[this.c] == ',' || this.g[this.c] == '+' || this.g[this.c] == ';') {
               return new String(this.g, this.d, this.f - this.d);
            }
         }
      }

      return new String(this.g, this.d, this.e - this.d);
   }

   final char d() {
      ++this.c;
      if (this.c != this.b) {
         char var1 = this.g[this.c];
         if (var1 != ' ' && var1 != '%' && var1 != '\\' && var1 != '_') {
            switch(var1) {
            case '"':
            case '#':
               break;
            default:
               switch(var1) {
               case '*':
               case '+':
               case ',':
                  break;
               default:
                  switch(var1) {
                  case ';':
                  case '<':
                  case '=':
                  case '>':
                     break;
                  default:
                     return this.e();
                  }
               }
            }
         }

         return this.g[this.c];
      } else {
         StringBuilder var2 = new StringBuilder("Unexpected end of DN: ");
         var2.append(this.a);
         throw new IllegalStateException(var2.toString());
      }
   }
}
