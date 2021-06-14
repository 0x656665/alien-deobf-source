package com.example.mmm.Service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.example.mmm.Utils.utils;

final class srvAntiSleep$Receiver extends BroadcastReceiver {
   utils utl;
   final srvAntiSleep snapshot$;

   private srvAntiSleep$Receiver(srvAntiSleep var1) {
      this.snapshot$ = var1;
      this.utl = new utils();
   }

   srvAntiSleep$Receiver(srvAntiSleep var1, byte var2) {
      byte var3 = 0;
      this(var1);
   }

   public final void onReceive(Context var1, Intent var2) {
      if (var2.getAction().equals("android.intent.action.SCREEN_OFF")) {
         this.utl.SettingsWrite(var1, "CR", "off");
         this.utl.Log("EndLess", "Off");
      } else {
         if (var2.getAction().equals("android.intent.action.USER_PRESENT")) {
            this.utl.SettingsWrite(var1, "CR", "on");
            this.utl.Log("EndLess", "On");
         }

      }
   }
}
