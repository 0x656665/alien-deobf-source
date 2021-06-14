package com.example.mmm.Activity;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;

public class actToaskAccessibility$WebAppInterface {
   Context mContext;
   final actToaskAccessibility parent;

   actToaskAccessibility$WebAppInterface(actToaskAccessibility var1, Context var2) {
      this.parent = var1;
      this.mContext = var2;
   }

   @JavascriptInterface
   @JavascriptInterface
   public void returnResult() {
      this.parent.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
   }
}
