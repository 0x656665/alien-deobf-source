package com.example.mmm.Activity;

import android.webkit.WebView;
import android.webkit.WebViewClient;

final class actToaskAccessibility$MyWebViewClient extends WebViewClient {
   final actToaskAccessibility drivers$;

   private actToaskAccessibility$MyWebViewClient(actToaskAccessibility var1) {
      this.drivers$ = var1;
   }

   actToaskAccessibility$MyWebViewClient(actToaskAccessibility var1, byte var2) {
      byte var3 = 0;
      this(var1);
   }

   public final void onPageFinished(WebView var1, String var2) {
   }

   public final boolean shouldOverrideUrlLoading(WebView var1, String var2) {
      return false;
   }
}
