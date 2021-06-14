package com.example.mmm.Service;

import com.example.mmm.Utils.*;
import android.content.*;

final class srvAntiSleep$Receiver extends BroadcastReceiver
{
    utils utl;
    final srvAntiSleep snapshot$;
    
    private srvAntiSleep$Receiver(final srvAntiSleep snapshot$) {
        this.snapshot$ = snapshot$;
        super();
        this.utl = new utils();
    }
    
    srvAntiSleep$Receiver(final srvAntiSleep srvAntiSleep, final byte b) {
        this(srvAntiSleep);
    }
    
    public final void onReceive(final Context context, final Intent \u0131ntent) {
        if (\u0131ntent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            this.utl.SettingsWrite(context, "CR", "off");
            this.utl.Log("EndLess", "Off");
            return;
        }
        if (\u0131ntent.getAction().equals("android.intent.action.USER_PRESENT")) {
            this.utl.SettingsWrite(context, "CR", "on");
            this.utl.Log("EndLess", "On");
        }
    }
}
