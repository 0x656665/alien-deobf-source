/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.c;

import a.k;
import a.l;
import a.q;
import a.r;
import a.x;
import a.z;
import java.util.regex.Pattern;

public final class e {
    private static final Pattern a = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");

    public static int a(String string, int n2) {
        while (n2 < string.length()) {
            char c2 = string.charAt(n2);
            if (c2 != ' ') {
                if (c2 != '\t') return n2;
            }
            ++n2;
        }
        return n2;
    }

    public static int a(String string, int n2, String string2) {
        while (n2 < string.length()) {
            if (string2.indexOf(string.charAt(n2)) != -1) return n2;
            ++n2;
        }
        return n2;
    }

    public static long a(q q2) {
        return e.a(q2.a("Content-Length"));
    }

    public static long a(z z2) {
        return e.a(z2.f);
    }

    private static long a(String string) {
        if (string == null) {
            return -1L;
        }
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            return -1L;
        }
    }

    public static void a(l l2, r r2, q q2) {
        if (l2 == l.a) {
            return;
        }
        if (!k.a(r2, q2).isEmpty()) return;
    }

    public static int b(String string, int n2) {
        try {
            long l2 = Long.parseLong(string);
            if (l2 > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (l2 >= 0L) return (int)l2;
            return 0;
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public static boolean b(z z2) {
        if (z2.a.b.equals("HEAD")) {
            return false;
        }
        int n2 = z2.c;
        if ((n2 < 100 || n2 >= 200) && n2 != 204 && n2 != 304) {
            return true;
        }
        if (e.a(z2.f) != -1L) return true;
        if (!"chunked".equalsIgnoreCase(z2.decrypt_str("Transfer-Encoding"))) return false;
        return true;
    }
}

