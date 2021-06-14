package a.a.e;

public final class n {
   int a;
   final int[] b = new int[10];

   final int a() {
      return (this.a & 2) != 0 ? this.b[1] : -1;
   }

   final n a(int var1, int var2) {
      if (var1 >= this.b.length) {
         return this;
      } else {
         this.a |= 1 << var1;
         this.b[var1] = var2;
         return this;
      }
   }

   final boolean a(int var1) {
      return (1 << var1 & this.a) != 0;
   }

   public final int b() {
      return (this.a & 128) != 0 ? this.b[7] : '\uffff';
   }
}
