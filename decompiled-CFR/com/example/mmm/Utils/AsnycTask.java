/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 */
package com.example.mmm.Utils;

import android.os.AsyncTask;
import com.example.mmm.Utils.utils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

final class AsnycTask
extends AsyncTask {
    HttpURLConnection linux$;
    BufferedReader embassy$;
    String hidden$;
    final utils rebates$;

    private AsnycTask(utils utils3) {
        this.rebates$ = utils3;
        this.linux$ = null;
        this.embassy$ = null;
        this.hidden$ = "";
    }

    AsnycTask(utils utils3, byte by) {
        by = (byte)0;
        this(utils3);
    }

    private String a() {
        this.linux$ = (HttpURLConnection)new URL("https://").openConnection();
        this.linux$.setRequestMethod("GET");
        this.linux$.connect();
        InputStream inputStream = this.linux$.getInputStream();
        StringBuffer stringBuffer = new StringBuffer();
        this.embassy$ = null;
        do {
            if ((inputStream = null) == null) {
                System.out.println(stringBuffer.toString());
                this.hidden$ = stringBuffer.toString().replace(" ", "");
                this.hidden$ = utils._anaheim(this.hidden$, "&lt;url_connect&gt;", "&lt;/url_connect&gt;");
                return this.hidden$;
            }
            stringBuffer.append((String)((Object)inputStream));
        } while (true);
    }

    protected final Object doInBackground(Object[] arrobject) {
        return this.a();
    }

    protected final void onPostExecute(Object object) {
        super.onPostExecute((Object)((String)object));
    }
}

