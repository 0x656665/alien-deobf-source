/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 */
package com.example.mmm.unmapped;

import android.os.AsyncTask;
import com.example.mmm.API.RequestHttp;
import com.example.mmm.constants;

public final class Geri {
    constants consts = new constants();

    public final String _blood(String string, String string2) {
        string2 = "{'null':'null'}";
        RequestHttp requestHttp = new RequestHttp(this);
        requestHttp.execute((Object[])new String[]{string, string2});
        return (String)requestHttp.get();
    }
}

