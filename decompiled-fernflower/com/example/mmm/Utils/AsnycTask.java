package com.example.mmm.Utils;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

final class AsnycTask extends AsyncTask {
   HttpURLConnection linux$;
   BufferedReader embassy$;
   String hidden$;
   final utils rebates$;

   private AsnycTask(utils var1) {
      this.rebates$ = var1;
      this.linux$ = null;
      this.embassy$ = null;
      this.hidden$ = "";
   }

   AsnycTask(utils var1, byte var2) {
      byte var3 = 0;
      this(var1);
   }

   private String a() {
      this.linux$ = (HttpURLConnection)(new URL("https://")).openConnection();
      this.linux$.setRequestMethod("GET");
      this.linux$.connect();
      InputStream var2 = this.linux$.getInputStream();
      StringBuffer var1 = new StringBuffer();
      this.embassy$ = null;

      while(true) {
         BufferedReader var10000 = this.embassy$;
         var2 = null;
         if (var2 == null) {
            System.out.println(var1.toString());
            this.hidden$ = var1.toString().replace(" ", "");
            this.hidden$ = utils._anaheim(this.hidden$, "&lt;url_connect&gt;", "&lt;/url_connect&gt;");
            return this.hidden$;
         }

         var1.append(var2);
      }
   }

   protected final Object doInBackground(Object[] var1) {
      // $FF: Couldn't be decompiled
   }

   protected final void onPostExecute(Object var1) {
      super.onPostExecute((String)var1);
   }
}
