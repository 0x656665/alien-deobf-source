package b;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class f implements Serializable, Comparable {
   static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
   public static final f b = a();
   final byte[] c;
   transient int d;
   transient String e;

   f(byte[] var1) {
      this.c = var1;
   }

   private static int a(char var0) {
      if (var0 >= '0' && var0 <= '9') {
         return var0 - 48;
      } else if (var0 >= 'a' && var0 <= 'f') {
         return var0 - 97 + 10;
      } else if (var0 >= 'A' && var0 <= 'F') {
         return var0 - 65 + 10;
      } else {
         throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(var0)));
      }
   }

   public static f a(String var0) {
      if (var0 != null) {
         f var1 = new f(var0.getBytes(t.a));
         var1.e = var0;
         return var1;
      } else {
         throw new IllegalArgumentException("s == null");
      }
   }

   public static f a(byte... var0) {
      if (var0 != null) {
         return new f((byte[])var0.clone());
      } else {
         throw new IllegalArgumentException("data == null");
      }
   }

   public static f b(String var0) {
      if (var0.length() % 2 != 0) {
         throw new IllegalArgumentException("Unexpected hex string: ".concat(String.valueOf(var0)));
      } else {
         byte[] var3 = new byte[var0.length() / 2];

         for(int var1 = 0; var1 < var3.length; ++var1) {
            int var2 = var1 * 2;
            var3[var1] = (byte)((a(var0.charAt(var2)) << 4) + a(var0.charAt(var2 + 1)));
         }

         return a(var3);
      }
   }

   private f c(String var1) {
      try {
         f var3 = a(MessageDigest.getInstance(var1).digest(this.c));
         return var3;
      } catch (NoSuchAlgorithmException var2) {
         throw new AssertionError(var2);
      }
   }

   public byte a(int var1) {
      return this.c[var1];
   }

   public f a(int var1, int var2) {
      if (var1 >= 0) {
         if (var2 <= this.c.length) {
            int var3 = var2 - var1;
            if (var3 >= 0) {
               if (var1 == 0 && var2 == this.c.length) {
                  return this;
               } else {
                  byte[] var5 = new byte[var3];
                  System.arraycopy(this.c, var1, var5, 0, var3);
                  return new f(var5);
               }
            } else {
               throw new IllegalArgumentException("endIndex < beginIndex");
            }
         } else {
            StringBuilder var4 = new StringBuilder("endIndex > length(");
            var4.append(this.c.length);
            var4.append(")");
            throw new IllegalArgumentException(var4.toString());
         }
      } else {
         throw new IllegalArgumentException("beginIndex < 0");
      }
   }

   public String a() {
      String var1 = this.e;
      if (var1 != null) {
         return var1;
      } else {
         var1 = new String(this.c, t.a);
         this.e = var1;
         return var1;
      }
   }

   void a(c var1) {
      var1.a((byte[])this.c, 0, this.c.length);
   }

   public boolean a(int var1, f var2, int var3, int var4) {
      return var2.a(0, (byte[])this.c, 0, var4);
   }

   public boolean a(int var1, byte[] var2, int var3, int var4) {
      return var1 >= 0 && var1 <= this.c.length - var4 && var3 >= 0 && var3 <= var2.length - var4 && t.a(this.c, var1, var2, var3, var4);
   }

   public String b() {
      return b.b.a(this.c);
   }

   public f c() {
      return this.c("SHA-1");
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      f var8 = (f)var1;
      int var3 = this.g();
      int var4 = var8.g();
      int var5 = Math.min(var3, var4);

      for(int var2 = 0; var2 < var5; ++var2) {
         int var6 = this.a(var2) & 255;
         int var7 = var8.a(var2) & 255;
         if (var6 != var7) {
            if (var6 < var7) {
               return -1;
            }

            return 1;
         }
      }

      if (var3 == var4) {
         return 0;
      } else if (var3 < var4) {
         return -1;
      } else {
         return 1;
      }
   }

   public f d() {
      return this.c("SHA-256");
   }

   public String e() {
      char[] var6 = new char[this.c.length * 2];
      byte[] var7 = this.c;
      int var3 = var7.length;
      int var1 = 0;

      for(int var2 = 0; var1 < var3; ++var1) {
         byte var4 = var7[var1];
         int var5 = var2 + 1;
         var6[var2] = a[var4 >> 4 & 15];
         var2 = var5 + 1;
         var6[var5] = a[var4 & 15];
      }

      return new String(var6);
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         if (var1 instanceof f) {
            f var2 = (f)var1;
            if (var2.g() == this.c.length && var2.a(0, (byte[])this.c, 0, this.c.length)) {
               return true;
            }
         }

         return false;
      }
   }

   public f f() {
      for(int var1 = 0; var1 < this.c.length; ++var1) {
         byte var3 = this.c[var1];
         if (var3 >= 65 && var3 <= 90) {
            byte[] var4 = (byte[])this.c.clone();
            int var2 = var1 + 1;
            var4[var1] = (byte)(var3 + 32);

            for(var1 = var2; var1 < var4.length; ++var1) {
               byte var5 = var4[var1];
               if (var5 >= 65 && var5 <= 90) {
                  var4[var1] = (byte)(var5 + 32);
               }
            }

            return new f(var4);
         }
      }

      return this;
   }

   public int g() {
      return this.c.length;
   }

   public byte[] h() {
      return (byte[])this.c.clone();
   }

   public int hashCode() {
      int var1 = this.d;
      if (var1 != 0) {
         return var1;
      } else {
         var1 = Arrays.hashCode(this.c);
         this.d = var1;
         return var1;
      }
   }

   public String toString() {
      if (this.c.length == 0) {
         return "[size=0]";
      } else {
         String var5 = this.a();
         int var3 = var5.length();
         int var1 = 0;
         int var2 = 0;

         while(true) {
            if (var1 < var3) {
               if (var2 == 64) {
                  break;
               }

               int var4 = var5.codePointAt(var1);
               if ((!Character.isISOControl(var4) || var4 == 10 || var4 == 13) && var4 != 65533) {
                  ++var2;
                  var1 += Character.charCount(var4);
                  continue;
               }

               var1 = -1;
               break;
            }

            var1 = var5.length();
            break;
         }

         StringBuilder var7;
         if (var1 == -1) {
            if (this.c.length <= 64) {
               var7 = new StringBuilder("[hex=");
               var7.append(this.e());
               var7.append("]");
               return var7.toString();
            } else {
               var7 = new StringBuilder("[size=");
               var7.append(this.c.length);
               var7.append(" hex=");
               var7.append(this.a(0, 64).e());
               var7.append("…]");
               return var7.toString();
            }
         } else {
            String var6 = var5.substring(0, var1).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (var1 < var5.length()) {
               var7 = new StringBuilder("[size=");
               var7.append(this.c.length);
               var7.append(" text=");
               var7.append(var6);
               var6 = "…]";
            } else {
               var7 = new StringBuilder("[text=");
               var7.append(var6);
               var6 = "]";
            }

            var7.append(var6);
            return var7.toString();
         }
      }
   }
}
