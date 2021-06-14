package a.a.c;

import java.util.regex.*;
import a.*;

public final class e
{
    private static final Pattern a;
    
    static {
        a = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }
    
    public static int a(final String s, int i) {
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (char1 != ' ' && char1 != '\t') {
                break;
            }
            ++i;
        }
        return i;
    }
    
    public static int a(final String s, int n, final String s2) {
        while (n < s.length() && s2.indexOf(s.charAt(n)) == -1) {
            ++n;
        }
        return n;
    }
    
    public static long a(final q q) {
        return a(q.a("Content-Length"));
    }
    
    public static long a(final z z) {
        return a(z.f);
    }
    
    private static long a(final String s) {
        if (s == null) {
            return -1L;
        }
        try {
            return Long.parseLong(s);
        }
        catch (NumberFormatException ex) {
            return -1L;
        }
    }
    
    public static void a(final l l, final r r, final q q) {
        if (l == l.a) {
            return;
        }
        if (k.a(r, q).isEmpty()) {
            return;
        }
    }
    
    public static int b(final String s, final int n) {
        try {
            final long long1 = Long.parseLong(s);
            if (long1 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (long1 < 0L) {
                return 0;
            }
            return (int)long1;
        }
        catch (NumberFormatException ex) {
            return n;
        }
    }
    
    public static boolean b(final z z) {
        if (z.a.b.equals("HEAD")) {
            return false;
        }
        final int c = z.c;
        return ((c < 100 || c >= 200) && c != 204 && c != 304) || a(z.f) != -1L || "chunked".equalsIgnoreCase(z.decrypt_str("Transfer-Encoding"));
    }
}
