package b;

final class n {
   final byte[] a;
   int b;
   int c;
   boolean d;
   boolean e;
   n f;
   n g;

   n() {
      this.a = new byte[8192];
      this.e = true;
      this.d = false;
   }

   n(n var1) {
      this(var1.a, var1.b, var1.c);
      var1.d = true;
   }

   n(byte[] var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = false;
      this.d = true;
   }

   public final n a() {
      n var1;
      if (this.f != this) {
         var1 = this.f;
      } else {
         var1 = null;
      }

      this.g.f = this.f;
      this.f.g = this.g;
      this.f = null;
      this.g = null;
      return var1;
   }

   public final n a(n var1) {
      var1.g = this;
      var1.f = this.f;
      this.f.g = var1;
      this.f = var1;
      return var1;
   }

   public final void a(n var1, int var2) {
      if (var1.e) {
         if (var1.c + var2 > 8192) {
            if (var1.d) {
               throw new IllegalArgumentException();
            }

            if (var1.c + var2 - var1.b > 8192) {
               throw new IllegalArgumentException();
            }

            System.arraycopy(var1.a, var1.b, var1.a, 0, var1.c - var1.b);
            var1.c -= var1.b;
            var1.b = 0;
         }

         System.arraycopy(this.a, this.b, var1.a, var1.c, var2);
         var1.c += var2;
         this.b += var2;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
