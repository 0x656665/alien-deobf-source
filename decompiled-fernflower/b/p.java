package b;

import java.util.Arrays;

final class p extends f {
   final transient byte[][] f;
   final transient int[] g;

   p(c var1, int var2) {
      super((byte[])null);
      t.a(var1.b, 0L, (long)var2);
      n var6 = var1.a;
      byte var5 = 0;
      int var4 = 0;

      int var3;
      for(var3 = 0; var4 < var2; var6 = var6.f) {
         if (var6.c == var6.b) {
            throw new AssertionError("s.limit == s.pos");
         }

         var4 += var6.c - var6.b;
         ++var3;
      }

      this.f = new byte[var3][];
      this.g = new int[var3 * 2];
      n var7 = var1.a;
      var4 = 0;

      for(var3 = var5; var3 < var2; var7 = var7.f) {
         this.f[var4] = var7.a;
         int var8 = var3 + (var7.c - var7.b);
         var3 = var8;
         if (var8 > var2) {
            var3 = var2;
         }

         this.g[var4] = var3;
         this.g[this.f.length + var4] = var7.b;
         var7.d = true;
         ++var4;
      }

   }

   private int b(int var1) {
      var1 = Arrays.binarySearch(this.g, 0, this.f.length, var1 + 1);
      return var1 >= 0 ? var1 : ~var1;
   }

   private f i() {
      return new f(this.h());
   }

   public final byte a(int var1) {
      t.a((long)this.g[this.f.length - 1], (long)var1, 1L);
      int var3 = this.b(var1);
      int var2;
      if (var3 == 0) {
         var2 = 0;
      } else {
         var2 = this.g[var3 - 1];
      }

      int var4 = this.g[this.f.length + var3];
      return this.f[var3][var1 - var2 + var4];
   }

   public final f a(int var1, int var2) {
      return this.i().a(var1, var2);
   }

   public final String a() {
      return this.i().a();
   }

   final void a(c var1) {
      int var5 = this.f.length;
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var2 < var5; var3 = var4) {
         int var6 = this.g[var5 + var2];
         var4 = this.g[var2];
         n var7 = new n(this.f[var2], var6, var6 + var4 - var3);
         if (var1.a == null) {
            var7.g = var7;
            var7.f = var7;
            var1.a = var7;
         } else {
            var1.a.g.a(var7);
         }

         ++var2;
      }

      var1.b += (long)var3;
   }

   public final boolean a(int var1, f var2, int var3, int var4) {
      if (this.g() - var4 < 0) {
         return false;
      } else {
         int var6 = this.b(0);
         int var5 = var1;

         for(var1 = var6; var4 > 0; ++var1) {
            if (var1 == 0) {
               var6 = 0;
            } else {
               var6 = this.g[var1 - 1];
            }

            int var7 = Math.min(var4, this.g[var1] - var6 + var6 - var5);
            int var8 = this.g[this.f.length + var1];
            if (!var2.a(var3, this.f[var1], var5 - var6 + var8, var7)) {
               return false;
            }

            var5 += var7;
            var3 += var7;
            var4 -= var7;
         }

         return true;
      }
   }

   public final boolean a(int var1, byte[] var2, int var3, int var4) {
      if (var1 >= 0 && var1 <= this.g() - var4 && var3 >= 0) {
         if (var3 > var2.length - var4) {
            return false;
         } else {
            int var6 = this.b(var1);
            int var5 = var1;

            for(var1 = var6; var4 > 0; ++var1) {
               if (var1 == 0) {
                  var6 = 0;
               } else {
                  var6 = this.g[var1 - 1];
               }

               int var7 = Math.min(var4, this.g[var1] - var6 + var6 - var5);
               int var8 = this.g[this.f.length + var1];
               if (!t.a(this.f[var1], var5 - var6 + var8, var2, var3, var7)) {
                  return false;
               }

               var5 += var7;
               var3 += var7;
               var4 -= var7;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public final String b() {
      return this.i().b();
   }

   public final f c() {
      return this.i().c();
   }

   public final f d() {
      return this.i().d();
   }

   public final String e() {
      return this.i().e();
   }

   public final boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         if (var1 instanceof f) {
            f var2 = (f)var1;
            if (var2.g() == this.g() && this.a(0, (f)var2, 0, this.g())) {
               return true;
            }
         }

         return false;
      }
   }

   public final f f() {
      return this.i().f();
   }

   public final int g() {
      return this.g[this.f.length - 1];
   }

   public final byte[] h() {
      byte[] var6 = new byte[this.g[this.f.length - 1]];
      int var4 = this.f.length;
      int var1 = 0;

      int var3;
      for(int var2 = 0; var1 < var4; var2 = var3) {
         int var5 = this.g[var4 + var1];
         var3 = this.g[var1];
         System.arraycopy(this.f[var1], var5, var6, var2, var3 - var2);
         ++var1;
      }

      return var6;
   }

   public final int hashCode() {
      int var1 = this.d;
      if (var1 != 0) {
         return var1;
      } else {
         int var7 = this.f.length;
         int var2 = 0;
         int var3 = 0;

         int var4;
         int var5;
         for(var4 = 1; var2 < var7; var3 = var5) {
            byte[] var8 = this.f[var2];
            int var6 = this.g[var7 + var2];
            var5 = this.g[var2];

            for(var1 = var6; var1 < var5 - var3 + var6; ++var1) {
               var4 = var4 * 31 + var8[var1];
            }

            ++var2;
         }

         this.d = var4;
         return var4;
      }
   }

   public final String toString() {
      return this.i().toString();
   }
}
