package com.example.mmm.Activity;

import android.webkit.*;

final class actToaskAccessibility$MyWebViewClient extends WebViewClient
{
    final actToaskAccessibility drivers$;
    
    private actToaskAccessibility$MyWebViewClient(final actToaskAccessibility drivers$) {
        this.drivers$ = drivers$;
        super();
    }
    
    actToaskAccessibility$MyWebViewClient(final actToaskAccessibility actToaskAccessibility, final byte b) {
        this(actToaskAccessibility);
    }
    
    public final void onPageFinished(final WebView webView, final String s) {
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        return false;
    }
}
