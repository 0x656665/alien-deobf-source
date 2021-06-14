package b;

import java.io.UnsupportedEncodingException;

final class b {
   private static final byte[] a = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
   private static final byte[] b = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

   public static String a(byte[] var0) {
      return a(var0, a);
   }

   private static String a(byte[] var0, byte[] var1) {
      byte[] var8 = new byte[(var0.length + 2) / 3 * 4];
      int var4 = var0.length - var0.length % 3;
      int var2 = 0;

      int var3;
      for(var3 = 0; var2 < var4; var2 += 3) {
         int var5 = var3 + 1;
         var8[var3] = var1[(var0[var2] & 255) >> 2];
         var3 = var5 + 1;
         byte var7 = var0[var2];
         int var6 = var2 + 1;
         var8[var5] = var1[(var7 & 3) << 4 | (var0[var6] & 255) >> 4];
         var5 = var3 + 1;
         var7 = var0[var6];
         var6 = var2 + 2;
         var8[var3] = var1[(var7 & 15) << 2 | (var0[var6] & 255) >> 6];
         var3 = var5 + 1;
         var8[var5] = var1[var0[var6] & 63];
      }

      switch(var0.length % 3) {
      case 1:
         var2 = var3 + 1;
         var8[var3] = var1[(var0[var4] & 255) >> 2];
         var3 = var2 + 1;
         var8[var2] = var1[(var0[var4] & 3) << 4];
         var8[var3] = 61;
         var8[var3 + 1] = 61;
         break;
      case 2:
         var2 = var3 + 1;
         var8[var3] = var1[(var0[var4] & 255) >> 2];
         var3 = var2 + 1;
         byte var11 = var0[var4];
         ++var4;
         var8[var2] = var1[(var11 & 3) << 4 | (var0[var4] & 255) >> 4];
         var8[var3] = var1[(var0[var4] & 15) << 2];
         var8[var3 + 1] = 61;
      }

      try {
         String var10 = new String(var8, "US-ASCII");
         return var10;
      } catch (UnsupportedEncodingException var9) {
         throw new AssertionError(var9);
      }
   }
}
