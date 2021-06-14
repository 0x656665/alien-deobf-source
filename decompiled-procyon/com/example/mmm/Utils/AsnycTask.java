package com.example.mmm.Utils;

import android.os.*;
import java.io.*;
import java.net.*;

final class AsnycTask extends AsyncTask
{
    HttpURLConnection linux$;
    BufferedReader embassy$;
    String hidden$;
    final utils rebates$;
    
    private AsnycTask(final utils rebates$) {
        this.rebates$ = rebates$;
        super();
        this.linux$ = null;
        this.embassy$ = null;
        this.hidden$ = "";
    }
    
    AsnycTask(final utils utils, final byte b) {
        this(utils);
    }
    
    private String a() {
        (this.linux$ = (HttpURLConnection)new URL("https://").openConnection()).setRequestMethod("GET");
        this.linux$.connect();
        this.linux$.getInputStream();
        final StringBuffer sb = new StringBuffer();
        this.embassy$ = null;
        while (true) {
            final BufferedReader embassy$ = this.embassy$;
            final String s = null;
            if (s == null) {
                break;
            }
            sb.append(s);
        }
        System.out.println(sb.toString());
        this.hidden$ = sb.toString().replace(" ", "");
        return this.hidden$ = utils._anaheim(this.hidden$, "&lt;url_connect&gt;", "&lt;/url_connect&gt;");
    }
    
    protected final Object doInBackground(final Object[] array) {
        return this.a();
    }
    
    protected final void onPostExecute(final Object o) {
        super.onPostExecute((Object)o);
    }
}
