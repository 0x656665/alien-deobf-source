package com.example.mmm.API;

import android.os.AsyncTask;
import com.example.mmm.unmapped.Geri;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

final class RequestHttp extends AsyncTask {
   String lincoln$;
   final Geri wooden$;

   RequestHttp(Geri var1) {
      this.wooden$ = var1;
      this.lincoln$ = null;
   }

   private String a(String... var1) {
      String var4 = var1[0];
      String var6 = var1[1];
      HttpURLConnection var8 = (HttpURLConnection)(new URL(var4)).openConnection();
      var8.setRequestMethod("POST");
      var8.setDoOutput(true);
      var8.setDoInput(true);
      var8.setRequestProperty("Content-Length", Integer.toString(var6.getBytes().length));
      var8.getOutputStream().write(var6.getBytes("UTF-8"));
      int var2 = var6.length();
      var8.connect();
      int var3 = var8.getResponseCode();
      ByteArrayOutputStream var7 = new ByteArrayOutputStream();
      if (var3 == 200) {
         InputStream var9 = var8.getInputStream();
         byte[] var5 = new byte[var2 + 3000];

         while(true) {
            var2 = var9.read(var5);
            if (var2 == -1) {
               this.lincoln$ = new String(var7.toByteArray(), "UTF-8");
               break;
            }

            var7.write(var5, 0, var2);
         }
      }

      return this.lincoln$;
   }

   protected final Object doInBackground(Object[] var1) {
      return this.a((String[])var1);
   }

   protected final void onPostExecute(Object var1) {
      super.onPostExecute((String)var1);
   }

   protected final void onPreExecute() {
      super.onPreExecute();
   }
}
