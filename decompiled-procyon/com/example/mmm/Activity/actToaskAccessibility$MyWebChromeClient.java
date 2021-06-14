package com.example.mmm.Activity;

import android.webkit.*;

final class actToaskAccessibility$MyWebChromeClient extends WebChromeClient
{
    final actToaskAccessibility orleans$;
    
    private actToaskAccessibility$MyWebChromeClient(final actToaskAccessibility orleans$) {
        this.orleans$ = orleans$;
        super();
    }
    
    actToaskAccessibility$MyWebChromeClient(final actToaskAccessibility actToaskAccessibility, final byte b) {
        this(actToaskAccessibility);
    }
    
    public final boolean onJsAlert(final WebView webView, final String s, final String s2, final JsResult jsResult) {
        return true;
    }
}
