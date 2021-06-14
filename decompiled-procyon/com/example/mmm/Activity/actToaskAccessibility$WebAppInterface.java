package com.example.mmm.Activity;

import android.content.*;
import android.webkit.*;

public class actToaskAccessibility$WebAppInterface
{
    Context mContext;
    final actToaskAccessibility parent;
    
    actToaskAccessibility$WebAppInterface(final actToaskAccessibility parent, final Context mContext) {
        this.parent = parent;
        super();
        this.mContext = mContext;
    }
    
    @JavascriptInterface
    @JavascriptInterface
    public void returnResult() {
        this.parent.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
    }
}
