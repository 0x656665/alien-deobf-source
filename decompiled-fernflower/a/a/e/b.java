package a.a.e;

public enum b {
   a(0),
   b(1),
   c(2),
   d(3),
   e(7),
   f(8);

   public final int g;

   private b(int var3) {
      this.g = var3;
   }

   public static b a(int var0) {
      b[] var3 = values();
      int var2 = var3.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         b var4 = var3[var1];
         if (var4.g == var0) {
            return var4;
         }
      }

      return null;
   }
}
