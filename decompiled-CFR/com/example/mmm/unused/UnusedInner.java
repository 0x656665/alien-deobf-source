/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.webkit.JsResult
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 */
package com.example.mmm.unused;

import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.example.mmm.Activity.actToaskAccessibility;

final class UnusedInner
extends WebChromeClient {
    final actToaskAccessibility label$;

    private UnusedInner(actToaskAccessibility actToaskAccessibility2) {
        this.label$ = actToaskAccessibility2;
    }

    UnusedInner(actToaskAccessibility actToaskAccessibility2, byte by) {
        by = (byte)0;
        this(actToaskAccessibility2);
    }

    public final boolean onJsAlert(WebView webView, String string, String string2, JsResult jsResult) {
        return true;
    }
}

