/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.example.mmm.Activity;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.mmm.Activity.actViewInjection;

final class actViewInjection$MyWebViewClient
extends WebViewClient {
    final actViewInjection opponent$;

    private actViewInjection$MyWebViewClient(actViewInjection actViewInjection2) {
        this.opponent$ = actViewInjection2;
    }

    actViewInjection$MyWebViewClient(actViewInjection actViewInjection2, byte by) {
        by = (byte)0;
        this(actViewInjection2);
    }

    public final void onPageFinished(WebView webView, String string) {
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String string) {
        return false;
    }
}

