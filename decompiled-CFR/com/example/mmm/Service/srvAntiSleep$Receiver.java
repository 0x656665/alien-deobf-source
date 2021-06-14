/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.example.mmm.Service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.example.mmm.Service.srvAntiSleep;
import com.example.mmm.Utils.utils;

final class srvAntiSleep$Receiver
extends BroadcastReceiver {
    utils utl;
    final srvAntiSleep snapshot$;

    private srvAntiSleep$Receiver(srvAntiSleep srvAntiSleep2) {
        this.snapshot$ = srvAntiSleep2;
        this.utl = new utils();
    }

    srvAntiSleep$Receiver(srvAntiSleep srvAntiSleep2, byte by) {
        by = (byte)0;
        this(srvAntiSleep2);
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            this.utl.SettingsWrite(context, "CR", "off");
            this.utl.Log("EndLess", "Off");
            return;
        }
        if (!intent.getAction().equals("android.intent.action.USER_PRESENT")) return;
        this.utl.SettingsWrite(context, "CR", "on");
        this.utl.Log("EndLess", "On");
    }
}

