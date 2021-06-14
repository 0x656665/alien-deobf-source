package a.a.c;

import a.a.*;
import java.util.*;
import java.text.*;

public final class d
{
    private static final ThreadLocal<DateFormat> a;
    private static final String[] b;
    private static final DateFormat[] c;
    
    static {
        a = new ThreadLocal<DateFormat>() {
            d$1() {
                super();
            }
            
            @Override
            protected final /* synthetic */ Object initialValue() {
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(a.a.c.f);
                return simpleDateFormat;
            }
        };
        b = new String[] { "EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z" };
        c = new DateFormat[15];
    }
    
    public static String a(final Date date) {
        return d.a.get().format(date);
    }
    
    public static Date a(final String s) {
        if (s.length() == 0) {
            return null;
        }
        final ParsePosition parsePosition = new ParsePosition(0);
        final Date parse = d.a.get().parse(s, parsePosition);
        if (parsePosition.getIndex() == s.length()) {
            return parse;
        }
        while (true) {
            while (true) {
                int n;
                synchronized (d.b) {
                    final int length = d.b.length;
                    n = 0;
                    if (n >= length) {
                        return null;
                    }
                    DateFormat dateFormat;
                    if ((dateFormat = d.c[n]) == null) {
                        dateFormat = new SimpleDateFormat(d.b[n], Locale.US);
                        dateFormat.setTimeZone(a.a.c.f);
                        d.c[n] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    final Date parse2 = dateFormat.parse(s, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                ++n;
                continue;
            }
        }
    }
}
