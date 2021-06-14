/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.example.mmm.unused;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.mmm.Activity.actToaskAccessibility;

final class UnusedInner2
extends WebViewClient {
    final actToaskAccessibility manner$;

    private UnusedInner2(actToaskAccessibility actToaskAccessibility2) {
        this.manner$ = actToaskAccessibility2;
    }

    UnusedInner2(actToaskAccessibility actToaskAccessibility2, byte by) {
        by = (byte)0;
        this(actToaskAccessibility2);
    }

    public final void onPageFinished(WebView webView, String string) {
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String string) {
        return false;
    }
}

