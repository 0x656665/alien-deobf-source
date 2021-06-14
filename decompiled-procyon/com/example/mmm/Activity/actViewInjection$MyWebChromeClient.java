package com.example.mmm.Activity;

import android.webkit.*;

final class actViewInjection$MyWebChromeClient extends WebChromeClient
{
    final actViewInjection daughter$;
    
    private actViewInjection$MyWebChromeClient(final actViewInjection daughter$) {
        this.daughter$ = daughter$;
        super();
    }
    
    actViewInjection$MyWebChromeClient(final actViewInjection actViewInjection, final byte b) {
        this(actViewInjection);
    }
    
    public final boolean onJsAlert(final WebView webView, final String s, final String s2, final JsResult jsResult) {
        return true;
    }
}
