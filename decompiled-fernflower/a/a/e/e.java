package a.a.e;

import java.io.IOException;

public final class e {
   static final b.f a = b.f.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
   static final String[] b = new String[64];
   static final String[] c = new String[256];
   private static final String[] d = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

   static {
      byte var2 = 0;

      int var0;
      for(var0 = 0; var0 < c.length; ++var0) {
         c[var0] = a.a.c.a("%8s", Integer.toBinaryString(var0)).replace(' ', '0');
      }

      b[0] = "";
      b[1] = "END_STREAM";
      int[] var6 = new int[]{1};
      b[8] = "PADDED";

      int var1;
      String[] var7;
      StringBuilder var8;
      for(var0 = 0; var0 <= 0; ++var0) {
         var1 = var6[var0];
         var7 = b;
         var8 = new StringBuilder();
         var8.append(b[var1]);
         var8.append("|PADDED");
         var7[var1 | 8] = var8.toString();
      }

      b[4] = "END_HEADERS";
      b[32] = "PRIORITY";
      b[36] = "END_HEADERS|PRIORITY";
      var0 = 0;

      while(true) {
         var1 = var2;
         if (var0 >= 3) {
            for(; var1 < b.length; ++var1) {
               if (b[var1] == null) {
                  b[var1] = c[var1];
               }
            }

            return;
         }

         int var3 = (new int[]{4, 32, 36})[var0];

         for(var1 = 0; var1 <= 0; ++var1) {
            int var4 = var6[var1];
            var7 = b;
            int var5 = var4 | var3;
            var8 = new StringBuilder();
            var8.append(b[var4]);
            var8.append('|');
            var8.append(b[var3]);
            var7[var5] = var8.toString();
            var7 = b;
            var8 = new StringBuilder();
            var8.append(b[var4]);
            var8.append('|');
            var8.append(b[var3]);
            var8.append("|PADDED");
            var7[var5 | 8] = var8.toString();
         }

         ++var0;
      }
   }

   private e() {
   }

   static IllegalArgumentException a(String var0, Object... var1) {
      throw new IllegalArgumentException(a.a.c.a(var0, var1));
   }

   static String a(boolean var0, int var1, int var2, byte var3, byte var4) {
      String var6;
      if (var3 < d.length) {
         var6 = d[var3];
      } else {
         var6 = a.a.c.a("0x%02x", var3);
      }

      String var5;
      if (var4 == 0) {
         var5 = "";
      } else {
         switch(var3) {
         case 2:
         case 3:
         case 7:
         case 8:
            var5 = c[var4];
            break;
         case 4:
         case 6:
            if (var4 == 1) {
               var5 = "ACK";
            } else {
               var5 = c[var4];
            }
            break;
         case 5:
         default:
            if (var4 < b.length) {
               var5 = b[var4];
            } else {
               var5 = c[var4];
            }

            if (var3 == 5 && (var4 & 4) != 0) {
               var5 = var5.replace("HEADERS", "PUSH_PROMISE");
            } else if (var3 == 0 && (var4 & 32) != 0) {
               var5 = var5.replace("PRIORITY", "COMPRESSED");
            }
         }
      }

      String var7;
      if (var0) {
         var7 = "<<";
      } else {
         var7 = ">>";
      }

      return a.a.c.a("%s 0x%08x %5d %-13s %s", var7, var1, var2, var6, var5);
   }

   static IOException b(String var0, Object... var1) {
      throw new IOException(a.a.c.a(var0, var1));
   }
}
