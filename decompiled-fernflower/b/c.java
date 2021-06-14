package b;

import java.io.EOFException;
import java.nio.charset.Charset;

public final class c implements d, e, Cloneable {
   private static final byte[] c = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
   n a;
   public long b;

   private String a(long var1, Charset var3) {
      t.a(this.b, 0L, var1);
      if (var3 != null) {
         if (var1 <= 2147483647L) {
            if (var1 == 0L) {
               return "";
            } else {
               n var4 = this.a;
               if ((long)var4.b + var1 > (long)var4.c) {
                  return new String(this.e(var1), var3);
               } else {
                  String var5 = new String(var4.a, var4.b, (int)var1, var3);
                  var4.b = (int)((long)var4.b + var1);
                  this.b -= var1;
                  if (var4.b == var4.c) {
                     this.a = var4.a();
                     o.a(var4);
                  }

                  return var5;
               }
            }
         } else {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(var1)));
         }
      } else {
         throw new IllegalArgumentException("charset == null");
      }
   }

   private void c(byte[] var1) {
      int var3;
      for(int var2 = 0; var2 < var1.length; var2 += var3) {
         var3 = var1.length - var2;
         t.a((long)var1.length, (long)var2, (long)var3);
         n var5 = this.a;
         if (var5 == null) {
            var3 = -1;
         } else {
            int var4 = Math.min(var3, var5.c - var5.b);
            System.arraycopy(var5.a, var5.b, var1, var2, var4);
            var5.b += var4;
            this.b -= (long)var4;
            var3 = var4;
            if (var5.b == var5.c) {
               this.a = var5.a();
               o.a(var5);
               var3 = var4;
            }
         }

         if (var3 == -1) {
            throw new EOFException();
         }
      }

   }

   private String k(long var1) {
      return this.a(var1, t.a);
   }

   public final long a(byte var1, long var2) {
      long var6 = 0L;
      if (var2 >= 0L) {
         n var12 = this.a;
         if (var12 == null) {
            return -1L;
         } else {
            n var13 = var12;
            long var8;
            long var10;
            if (this.b - var2 < var2) {
               var8 = this.b;
               var13 = var12;

               while(true) {
                  var6 = var8;
                  var12 = var13;
                  var10 = var2;
                  if (var8 <= var2) {
                     break;
                  }

                  var13 = var13.g;
                  var8 -= (long)(var13.c - var13.b);
               }
            } else {
               while(true) {
                  var8 = (long)(var13.c - var13.b) + var6;
                  var12 = var13;
                  var10 = var2;
                  if (var8 >= var2) {
                     break;
                  }

                  var13 = var13.f;
                  var6 = var8;
               }
            }

            while(var6 < this.b) {
               byte[] var14 = var12.a;
               int var4 = (int)((long)var12.b + var10 - var6);

               for(int var5 = var12.c; var4 < var5; ++var4) {
                  if (var14[var4] == var1) {
                     return (long)(var4 - var12.b) + var6;
                  }
               }

               var10 = (long)(var12.c - var12.b) + var6;
               var12 = var12.f;
               var6 = var10;
            }

            return -1L;
         }
      } else {
         throw new IllegalArgumentException("fromIndex < 0");
      }
   }

   public final long a(c var1, long var2) {
      if (var1 != null) {
         if (var2 >= 0L) {
            if (this.b == 0L) {
               return -1L;
            } else {
               long var4 = var2;
               if (var2 > this.b) {
                  var4 = this.b;
               }

               var1.a_(this, var4);
               return var4;
            }
         } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(var2)));
         }
      } else {
         throw new IllegalArgumentException("sink == null");
      }
   }

   public final long a(r var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("source == null");
      } else {
         long var2 = 0L;

         while(true) {
            long var4 = var1.a(this, 8192L);
            if (var4 == -1L) {
               return var2;
            }

            var2 += var4;
         }
      }
   }

   public final c a(int var1) {
      if (var1 < 128) {
         this.b(var1);
         return this;
      } else if (var1 < 2048) {
         this.b(var1 >> 6 | 192);
         this.b(var1 & 63 | 128);
         return this;
      } else {
         StringBuilder var2;
         if (var1 < 65536) {
            if (var1 >= 55296 && var1 <= 57343) {
               var2 = new StringBuilder("Unexpected code point: ");
               var2.append(Integer.toHexString(var1));
               throw new IllegalArgumentException(var2.toString());
            } else {
               this.b(var1 >> 12 | 224);
               this.b(var1 >> 6 & 63 | 128);
               this.b(var1 & 63 | 128);
               return this;
            }
         } else if (var1 <= 1114111) {
            this.b(var1 >> 18 | 240);
            this.b(var1 >> 12 & 63 | 128);
            this.b(var1 >> 6 & 63 | 128);
            this.b(var1 & 63 | 128);
            return this;
         } else {
            var2 = new StringBuilder("Unexpected code point: ");
            var2.append(Integer.toHexString(var1));
            throw new IllegalArgumentException(var2.toString());
         }
      }
   }

   public final c a(c var1, long var2, long var4) {
      if (var1 == null) {
         throw new IllegalArgumentException("out == null");
      } else {
         t.a(this.b, var2, var4);
         if (var4 == 0L) {
            return this;
         } else {
            var1.b += var4;
            n var10 = this.a;

            while(true) {
               n var11 = var10;
               long var6 = var2;
               long var8 = var4;
               if (var2 < (long)(var10.c - var10.b)) {
                  while(var8 > 0L) {
                     var10 = new n(var11);
                     var10.b = (int)((long)var10.b + var6);
                     var10.c = Math.min(var10.b + (int)var8, var10.c);
                     if (var1.a == null) {
                        var10.g = var10;
                        var10.f = var10;
                        var1.a = var10;
                     } else {
                        var1.a.g.a(var10);
                     }

                     var8 -= (long)(var10.c - var10.b);
                     var11 = var11.f;
                     var6 = 0L;
                  }

                  return this;
               }

               var2 -= (long)(var10.c - var10.b);
               var10 = var10.f;
            }
         }
      }
   }

   public final c a(f var1) {
      if (var1 != null) {
         var1.a(this);
         return this;
      } else {
         throw new IllegalArgumentException("byteString == null");
      }
   }

   public final c a(String var1) {
      return this.a((String)var1, 0, var1.length());
   }

   public final c a(String var1, int var2, int var3) {
      if (var1 == null) {
         throw new IllegalArgumentException("string == null");
      } else if (var2 < 0) {
         throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(var2)));
      } else if (var3 < var2) {
         StringBuilder var10 = new StringBuilder("endIndex < beginIndex: ");
         var10.append(var3);
         var10.append(" < ");
         var10.append(var2);
         throw new IllegalArgumentException(var10.toString());
      } else if (var3 > var1.length()) {
         StringBuilder var12 = new StringBuilder("endIndex > string.length: ");
         var12.append(var3);
         var12.append(" > ");
         var12.append(var1.length());
         throw new IllegalArgumentException(var12.toString());
      } else {
         while(true) {
            while(var2 < var3) {
               char var6 = var1.charAt(var2);
               int var5;
               int var11;
               if (var6 < 128) {
                  n var8 = this.e(1);
                  byte[] var9 = var8.a;
                  var5 = var8.c - var2;
                  int var7 = Math.min(var3, 8192 - var5);
                  var11 = var2 + 1;
                  var9[var2 + var5] = (byte)var6;

                  for(var2 = var11; var2 < var7; var2 = var11) {
                     var6 = var1.charAt(var2);
                     if (var6 >= 128) {
                        break;
                     }

                     var11 = var2 + 1;
                     var9[var2 + var5] = (byte)var6;
                  }

                  var11 = var5 + var2 - var8.c;
                  var8.c += var11;
                  this.b += (long)var11;
               } else if (var6 < 2048) {
                  this.b(var6 >> 6 | 192);
                  this.b(var6 & 63 | 128);
                  ++var2;
               } else if (var6 >= '\ud800' && var6 <= '\udfff') {
                  var5 = var2 + 1;
                  char var4;
                  if (var5 < var3) {
                     var4 = var1.charAt(var5);
                  } else {
                     var4 = 0;
                  }

                  if (var6 <= '\udbff' && var4 >= '\udc00' && var4 <= '\udfff') {
                     var11 = ((var6 & -55297) << 10 | -56321 & var4) + 65536;
                     this.b(var11 >> 18 | 240);
                     this.b(var11 >> 12 & 63 | 128);
                     this.b(var11 >> 6 & 63 | 128);
                     this.b(var11 & 63 | 128);
                     var2 += 2;
                  } else {
                     this.b(63);
                     var2 = var5;
                  }
               } else {
                  this.b(var6 >> 12 | 224);
                  this.b(var6 >> 6 & 63 | 128);
                  this.b(var6 & 63 | 128);
                  ++var2;
               }
            }

            return this;
         }
      }
   }

   public final c a(byte[] var1) {
      if (var1 != null) {
         return this.a((byte[])var1, 0, var1.length);
      } else {
         throw new IllegalArgumentException("source == null");
      }
   }

   public final c a(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new IllegalArgumentException("source == null");
      } else {
         long var5 = (long)var1.length;
         long var7 = (long)var2;
         long var9 = (long)var3;
         t.a(var5, var7, var9);

         int var4;
         n var11;
         for(var3 += var2; var2 < var3; var11.c += var4) {
            var11 = this.e(1);
            var4 = Math.min(var3 - var2, 8192 - var11.c);
            System.arraycopy(var1, var2, var11.a, var11.c, var4);
            var2 += var4;
         }

         this.b += var9;
         return this;
      }
   }

   public final s a() {
      return s.b;
   }

   public final String a(Charset var1) {
      try {
         String var3 = this.a(this.b, var1);
         return var3;
      } catch (EOFException var2) {
         throw new AssertionError(var2);
      }
   }

   public final void a(long var1) {
      if (this.b < var1) {
         throw new EOFException();
      }
   }

   public final void a_(c var1, long var2) {
      if (var1 == null) {
         throw new IllegalArgumentException("source == null");
      } else if (var1 == this) {
         throw new IllegalArgumentException("source == this");
      } else {
         t.a(var1.b, 0L, var2);

         while(var2 > 0L) {
            long var8 = (long)(var1.a.c - var1.a.b);
            byte var5 = 0;
            int var4;
            n var10;
            n var11;
            if (var2 < var8) {
               if (this.a != null) {
                  var10 = this.a.g;
               } else {
                  var10 = null;
               }

               if (var10 != null && var10.e) {
                  var8 = (long)var10.c;
                  if (var10.d) {
                     var4 = 0;
                  } else {
                     var4 = var10.b;
                  }

                  if (var8 + var2 - (long)var4 <= 8192L) {
                     var1.a.a(var10, (int)var2);
                     var1.b -= var2;
                     this.b += var2;
                     return;
                  }
               }

               var11 = var1.a;
               var4 = (int)var2;
               if (var4 <= 0 || var4 > var11.c - var11.b) {
                  throw new IllegalArgumentException();
               }

               if (var4 >= 1024) {
                  var10 = new n(var11);
               } else {
                  var10 = o.a();
                  System.arraycopy(var11.a, var11.b, var10.a, 0, var4);
               }

               var10.c = var10.b + var4;
               var11.b += var4;
               var11.g.a(var10);
               var1.a = var10;
            }

            var10 = var1.a;
            var8 = (long)(var10.c - var10.b);
            var1.a = var10.a();
            if (this.a == null) {
               this.a = var10;
               var10 = this.a;
               var11 = this.a;
               n var12 = this.a;
               var11.g = var12;
               var10.f = var12;
            } else {
               var10 = this.a.g.a(var10);
               if (var10.g == var10) {
                  throw new IllegalStateException();
               }

               if (var10.g.e) {
                  int var6 = var10.c - var10.b;
                  int var7 = var10.g.c;
                  if (var10.g.d) {
                     var4 = var5;
                  } else {
                     var4 = var10.g.b;
                  }

                  if (var6 <= 8192 - var7 + var4) {
                     var10.a(var10.g, var6);
                     var10.a();
                     o.a(var10);
                  }
               }
            }

            var1.b -= var8;
            this.b += var8;
            var2 -= var8;
         }

      }
   }

   public final byte b(long var1) {
      t.a(this.b, var1, 1L);
      n var5 = this.a;

      while(true) {
         long var3 = (long)(var5.c - var5.b);
         if (var1 < var3) {
            return var5.a[var5.b + (int)var1];
         }

         var1 -= var3;
         var5 = var5.f;
      }
   }

   public final c b() {
      return this;
   }

   public final c b(int var1) {
      n var3 = this.e(1);
      byte[] var4 = var3.a;
      int var2 = var3.c++;
      var4[var2] = (byte)var1;
      ++this.b;
      return this;
   }

   // $FF: synthetic method
   public final d b(String var1) {
      return this.a(var1);
   }

   // $FF: synthetic method
   public final d b(byte[] var1) {
      return this.a(var1);
   }

   // $FF: synthetic method
   public final d b(byte[] var1, int var2, int var3) {
      return this.a(var1, var2, var3);
   }

   public final boolean b(f var1) {
      int var3 = var1.g();
      if (var3 >= 0 && this.b - 0L >= (long)var3) {
         if (var1.g() - 0 < var3) {
            return false;
         } else {
            for(int var2 = 0; var2 < var3; ++var2) {
               if (this.b((long)var2 + 0L) != var1.a(var2 + 0)) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public final c c(int var1) {
      n var4 = this.e(2);
      byte[] var5 = var4.a;
      int var2 = var4.c;
      int var3 = var2 + 1;
      var5[var2] = (byte)(var1 >>> 8 & 255);
      var5[var3] = (byte)(var1 & 255);
      var4.c = var3 + 1;
      this.b += 2L;
      return this;
   }

   public final f c(long var1) {
      return new f(this.e(var1));
   }

   public final boolean c() {
      return this.b == 0L;
   }

   // $FF: synthetic method
   public final Object clone() {
      c var2 = new c();
      if (this.b == 0L) {
         return var2;
      } else {
         var2.a = new n(this.a);
         n var1 = var2.a;
         n var3 = var2.a;
         n var4 = var2.a;
         var3.g = var4;
         var1.f = var4;
         var1 = this.a;

         while(true) {
            var1 = var1.f;
            if (var1 == this.a) {
               var2.b = this.b;
               return var2;
            }

            var2.a.g.a(new n(var1));
         }
      }
   }

   public final void close() {
   }

   public final long d() {
      long var3 = this.b;
      if (var3 == 0L) {
         return 0L;
      } else {
         n var5 = this.a.g;
         long var1 = var3;
         if (var5.c < 8192) {
            var1 = var3;
            if (var5.e) {
               var1 = var3 - (long)(var5.c - var5.b);
            }
         }

         return var1;
      }
   }

   public final c d(int var1) {
      n var4 = this.e(4);
      byte[] var5 = var4.a;
      int var3 = var4.c;
      int var2 = var3 + 1;
      var5[var3] = (byte)(var1 >>> 24 & 255);
      var3 = var2 + 1;
      var5[var2] = (byte)(var1 >>> 16 & 255);
      var2 = var3 + 1;
      var5[var3] = (byte)(var1 >>> 8 & 255);
      var5[var2] = (byte)(var1 & 255);
      var4.c = var2 + 1;
      this.b += 4L;
      return this;
   }

   final String d(long var1) {
      String var5;
      if (var1 > 0L) {
         long var3 = var1 - 1L;
         if (this.b(var3) == 13) {
            var5 = this.k(var3);
            this.f(2L);
            return var5;
         }
      }

      var5 = this.k(var1);
      this.f(1L);
      return var5;
   }

   public final byte e() {
      if (this.b != 0L) {
         n var5 = this.a;
         int var2 = var5.b;
         int var3 = var5.c;
         byte[] var6 = var5.a;
         int var4 = var2 + 1;
         byte var1 = var6[var2];
         --this.b;
         if (var4 == var3) {
            this.a = var5.a();
            o.a(var5);
            return var1;
         } else {
            var5.b = var4;
            return var1;
         }
      } else {
         throw new IllegalStateException("size == 0");
      }
   }

   final n e(int var1) {
      if (var1 > 0 && var1 <= 8192) {
         n var2;
         n var3;
         if (this.a == null) {
            this.a = o.a();
            var2 = this.a;
            var3 = this.a;
            n var4 = this.a;
            var3.g = var4;
            var2.f = var4;
            return var4;
         } else {
            var3 = this.a.g;
            if (var3.c + var1 <= 8192) {
               var2 = var3;
               if (var3.e) {
                  return var2;
               }
            }

            var2 = var3.a(o.a());
            return var2;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public final byte[] e(long var1) {
      t.a(this.b, 0L, var1);
      if (var1 <= 2147483647L) {
         byte[] var3 = new byte[(int)var1];
         this.c(var3);
         return var3;
      } else {
         throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(var1)));
      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof c)) {
         return false;
      } else {
         c var10 = (c)var1;
         if (this.b != var10.b) {
            return false;
         } else {
            long var7 = this.b;
            long var5 = 0L;
            if (var7 == 0L) {
               return true;
            } else {
               n var9 = this.a;
               n var11 = var10.a;
               int var3 = var9.b;

               for(int var2 = var11.b; var5 < this.b; var5 += var7) {
                  var7 = (long)Math.min(var9.c - var3, var11.c - var2);

                  for(int var4 = 0; (long)var4 < var7; ++var2) {
                     if (var9.a[var3] != var11.a[var2]) {
                        return false;
                     }

                     ++var4;
                     ++var3;
                  }

                  if (var3 == var9.c) {
                     var9 = var9.f;
                     var3 = var9.b;
                  }

                  if (var2 == var11.c) {
                     var11 = var11.f;
                     var2 = var11.b;
                  }
               }

               return true;
            }
         }
      }
   }

   // $FF: synthetic method
   public final d f(int var1) {
      return this.d(var1);
   }

   public final short f() {
      if (this.b >= 2L) {
         n var9 = this.a;
         int var3 = var9.b;
         int var1 = var9.c;
         if (var1 - var3 < 2) {
            return (short)((this.e() & 255) << 8 | this.e() & 255);
         } else {
            byte[] var6 = var9.a;
            int var2 = var3 + 1;
            byte var8 = var6[var3];
            int var4 = var2 + 1;
            byte var7 = var6[var2];
            this.b -= 2L;
            if (var4 == var1) {
               this.a = var9.a();
               o.a(var9);
            } else {
               var9.b = var4;
            }

            return (short)((var8 & 255) << 8 | var7 & 255);
         }
      } else {
         StringBuilder var5 = new StringBuilder("size < 2: ");
         var5.append(this.b);
         throw new IllegalStateException(var5.toString());
      }
   }

   public final void f(long var1) {
      while(true) {
         if (var1 > 0L) {
            if (this.a != null) {
               int var3 = (int)Math.min(var1, (long)(this.a.c - this.a.b));
               long var4 = this.b;
               long var6 = (long)var3;
               this.b = var4 - var6;
               var4 = var1 - var6;
               n var8 = this.a;
               var8.b += var3;
               var1 = var4;
               if (this.a.b == this.a.c) {
                  var8 = this.a;
                  this.a = var8.a();
                  o.a(var8);
                  var1 = var4;
               }
               continue;
            }

            throw new EOFException();
         }

         return;
      }
   }

   public final void flush() {
   }

   public final int g() {
      if (this.b >= 4L) {
         n var11 = this.a;
         int var2 = var11.b;
         int var1 = var11.c;
         if (var1 - var2 < 4) {
            return (this.e() & 255) << 24 | (this.e() & 255) << 16 | (this.e() & 255) << 8 | this.e() & 255;
         } else {
            byte[] var8 = var11.a;
            int var3 = var2 + 1;
            byte var9 = var8[var2];
            int var5 = var3 + 1;
            byte var10 = var8[var3];
            int var4 = var5 + 1;
            byte var6 = var8[var5];
            var5 = var4 + 1;
            var2 = (var9 & 255) << 24 | (var10 & 255) << 16 | (var6 & 255) << 8 | var8[var4] & 255;
            this.b -= 4L;
            if (var5 == var1) {
               this.a = var11.a();
               o.a(var11);
               return var2;
            } else {
               var11.b = var5;
               return var2;
            }
         }
      } else {
         StringBuilder var7 = new StringBuilder("size < 4: ");
         var7.append(this.b);
         throw new IllegalStateException(var7.toString());
      }
   }

   public final c g(long var1) {
      if (var1 == 0L) {
         return this.b(48);
      } else {
         boolean var4 = false;
         byte var3 = 1;
         long var7 = var1;
         if (var1 < 0L) {
            var7 = -var1;
            if (var7 < 0L) {
               return this.a("-9223372036854775808");
            }

            var4 = true;
         }

         if (var7 < 100000000L) {
            if (var7 < 10000L) {
               if (var7 < 100L) {
                  if (var7 >= 10L) {
                     var3 = 2;
                  }
               } else if (var7 < 1000L) {
                  var3 = 3;
               } else {
                  var3 = 4;
               }
            } else if (var7 < 1000000L) {
               if (var7 < 100000L) {
                  var3 = 5;
               } else {
                  var3 = 6;
               }
            } else if (var7 < 10000000L) {
               var3 = 7;
            } else {
               var3 = 8;
            }
         } else if (var7 < 1000000000000L) {
            if (var7 < 10000000000L) {
               if (var7 < 1000000000L) {
                  var3 = 9;
               } else {
                  var3 = 10;
               }
            } else if (var7 < 100000000000L) {
               var3 = 11;
            } else {
               var3 = 12;
            }
         } else if (var7 < 1000000000000000L) {
            if (var7 < 10000000000000L) {
               var3 = 13;
            } else if (var7 < 100000000000000L) {
               var3 = 14;
            } else {
               var3 = 15;
            }
         } else if (var7 < 100000000000000000L) {
            if (var7 < 10000000000000000L) {
               var3 = 16;
            } else {
               var3 = 17;
            }
         } else if (var7 < 1000000000000000000L) {
            var3 = 18;
         } else {
            var3 = 19;
         }

         int var5 = var3;
         if (var4) {
            var5 = var3 + 1;
         }

         n var9 = this.e(var5);
         byte[] var10 = var9.a;

         int var11;
         for(var11 = var9.c + var5; var7 != 0L; var7 /= 10L) {
            int var6 = (int)(var7 % 10L);
            --var11;
            var10[var11] = c[var6];
         }

         if (var4) {
            var10[var11 - 1] = 45;
         }

         var9.c += var5;
         this.b += (long)var5;
         return this;
      }
   }

   // $FF: synthetic method
   public final d g(int var1) {
      return this.c(var1);
   }

   public final c h(long var1) {
      if (var1 == 0L) {
         return this.b(48);
      } else {
         int var4 = Long.numberOfTrailingZeros(Long.highestOneBit(var1)) / 4 + 1;
         n var6 = this.e(var4);
         byte[] var7 = var6.a;
         int var3 = var6.c + var4 - 1;

         for(int var5 = var6.c; var3 >= var5; --var3) {
            var7[var3] = c[(int)(15L & var1)];
            var1 >>>= 4;
         }

         var6.c += var4;
         this.b += (long)var4;
         return this;
      }
   }

   // $FF: synthetic method
   public final d h(int var1) {
      return this.b(var1);
   }

   public final short h() {
      return t.a(this.f());
   }

   public final int hashCode() {
      n var5 = this.a;
      if (var5 == null) {
         return 0;
      } else {
         int var1 = 1;

         int var2;
         n var6;
         do {
            int var3 = var5.b;
            int var4 = var5.c;

            for(var2 = var1; var3 < var4; ++var3) {
               var2 = var2 * 31 + var5.a[var3];
            }

            var6 = var5.f;
            var5 = var6;
            var1 = var2;
         } while(var6 != this.a);

         return var2;
      }
   }

   public final int i() {
      return t.a(this.g());
   }

   // $FF: synthetic method
   public final d i(long var1) {
      return this.h(var1);
   }

   public final long j() {
      if (this.b == 0L) {
         throw new IllegalStateException("size == 0");
      } else {
         int var1 = 0;
         long var7 = 0L;
         boolean var2 = false;

         int var3;
         long var9;
         do {
            n var11 = this.a;
            byte[] var12 = var11.a;
            int var4 = var11.b;
            int var6 = var11.c;
            var9 = var7;
            var3 = var1;

            boolean var5;
            while(true) {
               var5 = var2;
               if (var4 >= var6) {
                  break;
               }

               byte var13 = var12[var4];
               if (var13 >= 48 && var13 <= 57) {
                  var1 = var13 - 48;
               } else if (var13 >= 97 && var13 <= 102) {
                  var1 = var13 - 97 + 10;
               } else {
                  if (var13 < 65 || var13 > 70) {
                     if (var3 == 0) {
                        StringBuilder var14 = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                        var14.append(Integer.toHexString(var13));
                        throw new NumberFormatException(var14.toString());
                     }

                     var5 = true;
                     break;
                  }

                  var1 = var13 - 65 + 10;
               }

               if ((-1152921504606846976L & var9) != 0L) {
                  c var15 = (new c()).h(var9).b(var13);
                  StringBuilder var16 = new StringBuilder("Number too large: ");
                  var16.append(var15.l());
                  throw new NumberFormatException(var16.toString());
               }

               var9 = var9 << 4 | (long)var1;
               ++var4;
               ++var3;
            }

            if (var4 == var6) {
               this.a = var11.a();
               o.a(var11);
            } else {
               var11.b = var4;
            }

            if (var5) {
               break;
            }

            var1 = var3;
            var2 = var5;
            var7 = var9;
         } while(this.a != null);

         this.b -= (long)var3;
         return var9;
      }
   }

   // $FF: synthetic method
   public final d j(long var1) {
      return this.g(var1);
   }

   public final f k() {
      return new f(this.n());
   }

   public final String l() {
      try {
         String var1 = this.a(this.b, t.a);
         return var1;
      } catch (EOFException var2) {
         throw new AssertionError(var2);
      }
   }

   public final String m() {
      long var1 = this.a((byte)10, 0L);
      if (var1 != -1L) {
         return this.d(var1);
      } else {
         c var3 = new c();
         this.a(var3, 0L, Math.min(32L, this.b));
         StringBuilder var4 = new StringBuilder("\\n not found: size=");
         var4.append(this.b);
         var4.append(" content=");
         var4.append(var3.k().e());
         var4.append("…");
         throw new EOFException(var4.toString());
      }
   }

   public final byte[] n() {
      try {
         byte[] var1 = this.e(this.b);
         return var1;
      } catch (EOFException var2) {
         throw new AssertionError(var2);
      }
   }

   public final void o() {
      try {
         this.f(this.b);
      } catch (EOFException var2) {
         throw new AssertionError(var2);
      }
   }

   public final long p() {
      return this.a((byte)0, 0L);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public final d q() {
      return this;
   }

   public final String toString() {
      if (this.b <= 2147483647L) {
         int var1 = (int)this.b;
         Object var3;
         if (var1 == 0) {
            var3 = f.b;
         } else {
            var3 = new p(this, var1);
         }

         return ((f)var3).toString();
      } else {
         StringBuilder var2 = new StringBuilder("size > Integer.MAX_VALUE: ");
         var2.append(this.b);
         throw new IllegalArgumentException(var2.toString());
      }
   }
}
