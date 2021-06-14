/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 */
package com.example.mmm.API;

import android.os.AsyncTask;
import com.example.mmm.unmapped.Geri;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

final class RequestHttp
extends AsyncTask {
    String lincoln$;
    final Geri wooden$;

    RequestHttp(Geri geri) {
        this.wooden$ = geri;
        this.lincoln$ = null;
    }

    private String a(String ... object) {
        Object object2 = object[0];
        object = object[1];
        object2 = (HttpURLConnection)new URL((String)object2).openConnection();
        ((HttpURLConnection)object2).setRequestMethod("POST");
        ((URLConnection)object2).setDoOutput(true);
        ((URLConnection)object2).setDoInput(true);
        ((URLConnection)object2).setRequestProperty("Content-Length", Integer.toString(((String)object).getBytes().length));
        ((URLConnection)object2).getOutputStream().write(((String)object).getBytes("UTF-8"));
        int n2 = ((String)object).length();
        ((URLConnection)object2).connect();
        int n3 = ((HttpURLConnection)object2).getResponseCode();
        object = new ByteArrayOutputStream();
        if (n3 != 200) return this.lincoln$;
        object2 = ((URLConnection)object2).getInputStream();
        byte[] arrby = new byte[n2 + 3000];
        do {
            if ((n2 = ((InputStream)object2).read(arrby)) == -1) {
                this.lincoln$ = new String(((ByteArrayOutputStream)object).toByteArray(), "UTF-8");
                return this.lincoln$;
            }
            ((ByteArrayOutputStream)object).write(arrby, 0, n2);
        } while (true);
    }

    protected final Object doInBackground(Object[] arrobject) {
        return this.a((String[])arrobject);
    }

    protected final void onPostExecute(Object object) {
        super.onPostExecute((Object)((String)object));
    }

    protected final void onPreExecute() {
        super.onPreExecute();
    }
}

