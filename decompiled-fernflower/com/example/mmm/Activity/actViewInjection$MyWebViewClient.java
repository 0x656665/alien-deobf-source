package com.example.mmm.Activity;

import android.webkit.WebView;
import android.webkit.WebViewClient;

final class actViewInjection$MyWebViewClient extends WebViewClient {
   final actViewInjection opponent$;

   private actViewInjection$MyWebViewClient(actViewInjection var1) {
      this.opponent$ = var1;
   }

   actViewInjection$MyWebViewClient(actViewInjection var1, byte var2) {
      byte var3 = 0;
      this(var1);
   }

   public final void onPageFinished(WebView var1, String var2) {
   }

   public final boolean shouldOverrideUrlLoading(WebView var1, String var2) {
      return false;
   }
}
