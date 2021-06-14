/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.example.mmm.Activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.example.mmm.Utils.utils;

public class actDozeMode
extends Activity {
    utils utl;

    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        new utils();
        if (!utils._prayer((Context)this)) {
            object = new StringBuilder("package:");
            ((StringBuilder)object).append(this.getPackageName());
            object = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", Uri.parse((String)((StringBuilder)object).toString()));
            object.addFlags(268435456);
            object.addFlags(1073741824);
            this.startActivity((Intent)object);
        }
        this.finish();
    }
}

