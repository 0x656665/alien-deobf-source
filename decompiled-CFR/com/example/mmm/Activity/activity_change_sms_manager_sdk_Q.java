/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
package com.example.mmm.Activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import com.example.mmm.Utils.utils;
import java.io.File;

public class activity_change_sms_manager_sdk_Q
extends Activity {
    protected void onCreate(Bundle object) {
        super.onCreate(object);
        if (Build.VERSION.SDK_INT >= 29) {
            object = new utils();
            this.getDir("apk", 0);
            return;
        }
        this.finish();
    }
}

