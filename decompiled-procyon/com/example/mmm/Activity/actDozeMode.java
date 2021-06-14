package com.example.mmm.Activity;

import android.app.*;
import com.example.mmm.Utils.*;
import android.os.*;
import android.net.*;
import android.content.*;

public class actDozeMode extends Activity
{
    utils utl;
    
    public actDozeMode() {
        super();
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        new utils();
        if (!utils._prayer((Context)this)) {
            final StringBuilder sb = new StringBuilder("package:");
            sb.append(this.getPackageName());
            final Intent \u0131ntent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", Uri.parse(sb.toString()));
            \u0131ntent.addFlags(268435456);
            \u0131ntent.addFlags(1073741824);
            this.startActivity(\u0131ntent);
        }
        this.finish();
    }
}
