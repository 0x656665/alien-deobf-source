package com.example.mmm.Activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.example.mmm.Utils.utils;

public class actDozeMode extends Activity {
   utils utl;

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      new utils();
      if (!utils._prayer(this)) {
         StringBuilder var2 = new StringBuilder("package:");
         var2.append(this.getPackageName());
         Intent var3 = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", Uri.parse(var2.toString()));
         var3.addFlags(268435456);
         var3.addFlags(1073741824);
         this.startActivity(var3);
      }

      this.finish();
   }
}
