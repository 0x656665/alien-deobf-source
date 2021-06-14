package com.example.mmm.unused;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.mmm.Activity.actToaskAccessibility;

final class UnusedInner2 extends WebViewClient {
   final actToaskAccessibility manner$;

   private UnusedInner2(actToaskAccessibility var1) {
      this.manner$ = var1;
   }

   UnusedInner2(actToaskAccessibility var1, byte var2) {
      byte var3 = 0;
      this(var1);
   }

   public final void onPageFinished(WebView var1, String var2) {
   }

   public final boolean shouldOverrideUrlLoading(WebView var1, String var2) {
      return false;
   }
}
