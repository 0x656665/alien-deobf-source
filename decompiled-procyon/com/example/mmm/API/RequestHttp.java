package com.example.mmm.API;

import android.os.*;
import com.example.mmm.unmapped.*;
import java.net.*;
import java.io.*;

final class RequestHttp extends AsyncTask
{
    String lincoln$;
    final Geri wooden$;
    
    RequestHttp(final Geri wooden$) {
        this.wooden$ = wooden$;
        super();
        this.lincoln$ = null;
    }
    
    private String a(final String... array) {
        final String s = array[0];
        final String s2 = array[1];
        final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(s).openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("Content-Length", Integer.toString(s2.getBytes().length));
        httpURLConnection.getOutputStream().write(s2.getBytes("UTF-8"));
        final int length = s2.length();
        httpURLConnection.connect();
        final int responseCode = httpURLConnection.getResponseCode();
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (responseCode == 200) {
            final InputStream \u0131nputStream = httpURLConnection.getInputStream();
            final byte[] array2 = new byte[length + 3000];
            while (true) {
                final int read = \u0131nputStream.read(array2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(array2, 0, read);
            }
            this.lincoln$ = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
        }
        return this.lincoln$;
    }
    
    protected final Object doInBackground(final Object[] array) {
        return this.a((String[])array);
    }
    
    protected final void onPostExecute(final Object o) {
        super.onPostExecute((Object)o);
    }
    
    protected final void onPreExecute() {
        super.onPreExecute();
    }
}
