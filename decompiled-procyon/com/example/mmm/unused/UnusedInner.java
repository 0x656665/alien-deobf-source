package com.example.mmm.unused;

import com.example.mmm.Activity.*;
import android.webkit.*;

final class UnusedInner extends WebChromeClient
{
    final actToaskAccessibility label$;
    
    private UnusedInner(final actToaskAccessibility label$) {
        this.label$ = label$;
        super();
    }
    
    UnusedInner(final actToaskAccessibility actToaskAccessibility, final byte b) {
        this(actToaskAccessibility);
    }
    
    public final boolean onJsAlert(final WebView webView, final String s, final String s2, final JsResult jsResult) {
        return true;
    }
}
