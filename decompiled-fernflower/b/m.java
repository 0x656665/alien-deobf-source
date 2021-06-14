package b;

import java.io.EOFException;
import java.nio.charset.Charset;

final class m implements e {
   public final c a = new c();
   public final r b;
   boolean c;

   m(r var1) {
      if (var1 != null) {
         this.b = var1;
      } else {
         throw new NullPointerException("source == null");
      }
   }

   private long a(byte var1, long var2) {
      if (this.c) {
         throw new IllegalStateException("closed");
      } else {
         while(true) {
            long var4 = this.a.a(var1, var2);
            if (var4 != -1L) {
               return var4;
            }

            var4 = this.a.b;
            if (this.b.a(this.a, 8192L) == -1L) {
               return -1L;
            }

            var2 = Math.max(var2, var4);
         }
      }
   }

   private boolean b(long var1) {
      if (var1 >= 0L) {
         if (!this.c) {
            do {
               if (this.a.b >= var1) {
                  return true;
               }
            } while(this.b.a(this.a, 8192L) != -1L);

            return false;
         } else {
            throw new IllegalStateException("closed");
         }
      } else {
         throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(var1)));
      }
   }

   public final long a(c var1, long var2) {
      if (var1 != null) {
         if (var2 >= 0L) {
            if (!this.c) {
               if (this.a.b == 0L && this.b.a(this.a, 8192L) == -1L) {
                  return -1L;
               } else {
                  var2 = Math.min(var2, this.a.b);
                  return this.a.a(var1, var2);
               }
            } else {
               throw new IllegalStateException("closed");
            }
         } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(var2)));
         }
      } else {
         throw new IllegalArgumentException("sink == null");
      }
   }

   public final s a() {
      return this.b.a();
   }

   public final String a(Charset var1) {
      if (var1 != null) {
         this.a.a(this.b);
         return this.a.a(var1);
      } else {
         throw new IllegalArgumentException("charset == null");
      }
   }

   public final void a(long var1) {
      if (!this.b(var1)) {
         throw new EOFException();
      }
   }

   public final c b() {
      return this.a;
   }

   public final boolean b(f var1) {
      int var3 = var1.g();
      if (!this.c) {
         if (var3 >= 0) {
            if (var1.g() - 0 < var3) {
               return false;
            } else {
               for(int var2 = 0; var2 < var3; ++var2) {
                  long var4 = (long)var2 + 0L;
                  if (!this.b(1L + var4)) {
                     return false;
                  }

                  if (this.a.b(var4) != var1.a(var2 + 0)) {
                     return false;
                  }
               }

               return true;
            }
         } else {
            return false;
         }
      } else {
         throw new IllegalStateException("closed");
      }
   }

   public final f c(long var1) {
      this.a(var1);
      return this.a.c(var1);
   }

   public final boolean c() {
      if (!this.c) {
         return this.a.c() && this.b.a(this.a, 8192L) == -1L;
      } else {
         throw new IllegalStateException("closed");
      }
   }

   public final void close() {
      if (!this.c) {
         this.c = true;
         this.b.close();
         this.a.o();
      }
   }

   public final byte e() {
      this.a(1L);
      return this.a.e();
   }

   public final byte[] e(long var1) {
      this.a(var1);
      return this.a.e(var1);
   }

   public final short f() {
      this.a(2L);
      return this.a.f();
   }

   public final void f(long var1) {
      if (!this.c) {
         while(var1 > 0L) {
            if (this.a.b == 0L && this.b.a(this.a, 8192L) == -1L) {
               throw new EOFException();
            }

            long var3 = Math.min(var1, this.a.b);
            this.a.f(var3);
            var1 -= var3;
         }

      } else {
         throw new IllegalStateException("closed");
      }
   }

   public final int g() {
      this.a(4L);
      return this.a.g();
   }

   public final short h() {
      this.a(2L);
      return t.a(this.a.f());
   }

   public final int i() {
      this.a(4L);
      return t.a(this.a.g());
   }

   public final long j() {
      this.a(1L);
      int var2 = 0;

      while(true) {
         int var3 = var2 + 1;
         if (!this.b((long)var3)) {
            break;
         }

         byte var1 = this.a.b((long)var2);
         if ((var1 < 48 || var1 > 57) && (var1 < 97 || var1 > 102) && (var1 < 65 || var1 > 70)) {
            if (var2 == 0) {
               throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", var1));
            }
            break;
         }

         var2 = var3;
      }

      return this.a.j();
   }

   public final String m() {
      long var1 = this.a((byte)10, 0L);
      if (var1 != -1L) {
         return this.a.d(var1);
      } else {
         c var3 = new c();
         this.a.a(var3, 0L, Math.min(32L, this.a.b));
         StringBuilder var4 = new StringBuilder("\\n not found: size=");
         var4.append(this.a.b);
         var4.append(" content=");
         var4.append(var3.k().e());
         var4.append("…");
         throw new EOFException(var4.toString());
      }
   }

   public final long p() {
      return this.a((byte)0, 0L);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("buffer(");
      var1.append(this.b);
      var1.append(")");
      return var1.toString();
   }
}
