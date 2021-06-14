/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.c;

import a.a.c;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class d {
    private static final ThreadLocal<DateFormat> a = new ThreadLocal<DateFormat>(){

        @Override
        protected final /* synthetic */ Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(c.f);
            return simpleDateFormat;
        }
    };
    private static final String[] b = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    private static final DateFormat[] c = new DateFormat[15];

    public static String a(Date date) {
        return a.get().format(date);
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public static Date a(String string) {
        if (string.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Cloneable cloneable = a.get().parse(string, parsePosition);
        if (parsePosition.getIndex() == string.length()) {
            return cloneable;
        }
        String[] arrstring = b;
        synchronized (arrstring) {
            int n2 = b.length;
            int n3 = 0;
            while (n3 < n2) {
                DateFormat dateFormat = c[n3];
                cloneable = dateFormat;
                if (dateFormat == null) {
                    cloneable = new SimpleDateFormat(b[n3], Locale.US);
                    ((DateFormat)cloneable).setTimeZone(c.f);
                    d.c[n3] = cloneable;
                }
                parsePosition.setIndex(0);
                cloneable = ((DateFormat)cloneable).parse(string, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return cloneable;
                }
                ++n3;
            }
            return null;
        }
    }

}

