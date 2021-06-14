/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 */
package com.example.mmm.Admin;

import android.content.ComponentName;
import android.content.Context;
import com.example.mmm.Admin.ReceiverDeviceAdmin;

public final class ClassAdmin {
    ComponentName locking$;

    public ClassAdmin(Context context) {
        this.locking$ = new ComponentName(context.getPackageName(), ReceiverDeviceAdmin.class.getName());
    }
}

