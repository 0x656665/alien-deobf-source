package com.example.mmm.unused;

import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.example.mmm.Activity.actToaskAccessibility;

final class UnusedInner extends WebChromeClient {
   final actToaskAccessibility label$;

   private UnusedInner(actToaskAccessibility var1) {
      this.label$ = var1;
   }

   UnusedInner(actToaskAccessibility var1, byte var2) {
      byte var3 = 0;
      this(var1);
   }

   public final boolean onJsAlert(WebView var1, String var2, String var3, JsResult var4) {
      return true;
   }
}
