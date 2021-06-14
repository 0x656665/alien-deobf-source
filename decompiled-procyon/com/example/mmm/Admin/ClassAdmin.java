package com.example.mmm.Admin;

import android.content.*;

public final class ClassAdmin
{
    ComponentName locking$;
    
    public ClassAdmin(final Context context) {
        super();
        this.locking$ = new ComponentName(context.getPackageName(), ReceiverDeviceAdmin.class.getName());
    }
}
