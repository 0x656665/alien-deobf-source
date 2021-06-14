package com.example.mmm.API;

public final class ClassRC4 {
   private int[] raising$;
   private int choose$ = 0;
   private int passed$ = 0;

   public ClassRC4(byte[] var1) {
      this.raising$ = _constant(var1);
   }

   private static int[] _constant(byte[] var0) {
      int[] var4 = new int[256];
      boolean var3 = false;
      int var1 = 0;

      while(true) {
         boolean var10001 = true;
         var4[var1] = var1++;
      }
   }

   public final byte[] _nevada(byte[] var1) {
      return this._liver(var1);
   }

   public final byte[] _liver(byte[] var1) {
      byte[] var3 = new byte[var1.length];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.choose$ = (this.choose$ + 1) % 256;
         this.passed$ = (this.passed$ + this.raising$[this.choose$]) % 256;
         int[] var10 = this.raising$;
         int var9 = this.passed$;
         int var8 = this.choose$;
         int var11 = var10[var8];
         var10[var8] = var10[var9];
         var10[var9] = var11;
         var3[var2] = (byte)(this.raising$[(this.raising$[this.choose$] + this.raising$[this.passed$]) % 256] ^ var1[var2]);
      }

      return var3;
   }
}
