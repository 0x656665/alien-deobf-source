package com.example.mmm.Activity;

import android.webkit.*;

final class actViewInjection$MyWebViewClient extends WebViewClient
{
    final actViewInjection opponent$;
    
    private actViewInjection$MyWebViewClient(final actViewInjection opponent$) {
        this.opponent$ = opponent$;
        super();
    }
    
    actViewInjection$MyWebViewClient(final actViewInjection actViewInjection, final byte b) {
        this(actViewInjection);
    }
    
    public final void onPageFinished(final WebView webView, final String s) {
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        return false;
    }
}
