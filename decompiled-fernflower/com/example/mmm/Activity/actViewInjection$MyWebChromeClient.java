package com.example.mmm.Activity;

import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

final class actViewInjection$MyWebChromeClient extends WebChromeClient {
   final actViewInjection daughter$;

   private actViewInjection$MyWebChromeClient(actViewInjection var1) {
      this.daughter$ = var1;
   }

   actViewInjection$MyWebChromeClient(actViewInjection var1, byte var2) {
      byte var3 = 0;
      this(var1);
   }

   public final boolean onJsAlert(WebView var1, String var2, String var3, JsResult var4) {
      return true;
   }
}
