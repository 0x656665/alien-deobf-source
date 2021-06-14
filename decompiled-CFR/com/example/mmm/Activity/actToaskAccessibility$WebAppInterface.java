/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.webkit.JavascriptInterface
 */
package com.example.mmm.Activity;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import com.example.mmm.Activity.actToaskAccessibility;

public class actToaskAccessibility$WebAppInterface {
    Context mContext;
    final actToaskAccessibility parent;

    actToaskAccessibility$WebAppInterface(actToaskAccessibility actToaskAccessibility2, Context context) {
        this.parent = actToaskAccessibility2;
        this.mContext = context;
    }

    @JavascriptInterface
    @JavascriptInterface
    public void returnResult() {
        this.parent.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
    }
}

