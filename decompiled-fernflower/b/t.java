package b;

import java.nio.charset.Charset;

final class t {
   public static final Charset a = Charset.forName("UTF-8");

   public static int a(int var0) {
      return (var0 & 255) << 24 | (-16777216 & var0) >>> 24 | (16711680 & var0) >>> 8 | ('\uff00' & var0) << 8;
   }

   public static short a(short var0) {
      int var1 = var0 & '\uffff';
      return (short)((var1 & 255) << 8 | ('\uff00' & var1) >>> 8);
   }

   public static void a(long var0, long var2, long var4) {
      if ((var2 | var4) < 0L || var2 > var0 || var0 - var2 < var4) {
         throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", var0, var2, var4));
      }
   }

   public static void a(Throwable var0) {
      throw var0;
   }

   public static boolean a(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      for(int var5 = 0; var5 < var4; ++var5) {
         if (var0[var5 + var1] != var2[var5 + var3]) {
            return false;
         }
      }

      return true;
   }
}
