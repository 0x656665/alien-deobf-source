package a;

import a.a.*;
import java.net.*;
import java.util.*;

public static final class a
{
    String a;
    String b;
    String c;
    String d;
    int e;
    final List<String> f;
    List<String> g;
    String h;
    
    public a() {
        super();
        this.b = "";
        this.c = "";
        this.e = -1;
        (this.f = new ArrayList<String>()).add("");
    }
    
    static String a(String a, final int n, final int n2) {
        a = r.a(a, n, n2, false);
        if (!a.contains(":")) {
            return c.a(a);
        }
        InetAddress \u0131netAddress;
        if (a.startsWith("[") && a.endsWith("]")) {
            \u0131netAddress = f(a, 1, a.length() - 1);
        }
        else {
            \u0131netAddress = f(a, 0, a.length());
        }
        if (\u0131netAddress == null) {
            return null;
        }
        final byte[] address = \u0131netAddress.getAddress();
        if (address.length == 16) {
            return a(address);
        }
        throw new AssertionError();
    }
    
    private static String a(final byte[] array) {
        final int n = 0;
        int i = 0;
        int n2 = 0;
        int n3 = -1;
        while (i < array.length) {
            int n4;
            for (n4 = i; n4 < 16 && array[n4] == 0 && array[n4 + 1] == 0; n4 += 2) {}
            final int n5 = n4 - i;
            int n6;
            if (n5 > (n6 = n2)) {
                n6 = n5;
                n3 = i;
            }
            i = n4 + 2;
            n2 = n6;
        }
        final b.c c = new b.c();
        int j = n;
        while (j < array.length) {
            if (j == n3) {
                c.b(58);
                final int n7 = j + n2;
                if ((j = n7) != 16) {
                    continue;
                }
                c.b(58);
                j = n7;
            }
            else {
                if (j > 0) {
                    c.b(58);
                }
                c.h((long)((array[j] & 0xFF) << 8 | (array[j + 1] & 0xFF)));
                j += 2;
            }
        }
        return c.l();
    }
    
    private void b(final String s, int i, final int n) {
        if (i == n) {
            return;
        }
        final char char1 = s.charAt(i);
        if (char1 != '/' && char1 != '\\') {
            this.f.set(this.f.size() - 1, "");
        }
        else {
            this.f.clear();
            this.f.add("");
            ++i;
        }
        while (i < n) {
            final int a = a.a.c.a(s, i, n, "/\\");
            final int n2 = 0;
            final boolean b = a < n;
            final String a2 = r.a(s, i, a, " \"<>^`{}|/\\?#", true, false, false, true);
            if (!a2.equals(".") && !a2.equalsIgnoreCase("%2e")) {
                i = 0;
            }
            else {
                i = 1;
            }
            if (i == 0) {
                Label_0208: {
                    if (!a2.equals("..") && !a2.equalsIgnoreCase("%2e.") && !a2.equalsIgnoreCase(".%2e")) {
                        i = n2;
                        if (!a2.equalsIgnoreCase("%2e%2e")) {
                            break Label_0208;
                        }
                    }
                    i = 1;
                }
                if (i != 0) {
                    if (this.f.remove(this.f.size() - 1).isEmpty() && !this.f.isEmpty()) {
                        this.f.set(this.f.size() - 1, "");
                    }
                    else {
                        this.f.add("");
                    }
                }
                else {
                    if (this.f.get(this.f.size() - 1).isEmpty()) {
                        this.f.set(this.f.size() - 1, a2);
                    }
                    else {
                        this.f.add(a2);
                    }
                    if (b) {
                        this.f.add("");
                    }
                }
            }
            i = a;
            if (b) {
                i = a + 1;
            }
        }
    }
    
    private static int c(final String s, int n, final int n2) {
        if (n2 - n < 2) {
            return -1;
        }
        final char char1 = s.charAt(n);
        while (true) {
            Label_0032: {
                if (char1 < 'a') {
                    break Label_0032;
                }
                int n3 = n;
                if (char1 > 'z') {
                    break Label_0032;
                }
                while (true) {
                    n = n3 + 1;
                    if (n >= n2) {
                        return -1;
                    }
                    final char char2 = s.charAt(n);
                    if (char2 >= 'a') {
                        n3 = n;
                        if (char2 <= 'z') {
                            continue;
                        }
                    }
                    if (char2 >= 'A') {
                        n3 = n;
                        if (char2 <= 'Z') {
                            continue;
                        }
                    }
                    if (char2 >= '0') {
                        n3 = n;
                        if (char2 <= '9') {
                            continue;
                        }
                    }
                    n3 = n;
                    if (char2 == '+') {
                        continue;
                    }
                    n3 = n;
                    if (char2 == '-') {
                        continue;
                    }
                    n3 = n;
                    if (char2 == '.') {
                        continue;
                    }
                    if (char2 == ':') {
                        return n;
                    }
                    return -1;
                }
            }
            if (char1 < 'A') {
                return -1;
            }
            int n3 = n;
            if (char1 > 'Z') {
                return -1;
            }
            continue;
        }
    }
    
    private static int d(final String s, int i, final int n) {
        int n2 = 0;
        while (i < n) {
            final char char1 = s.charAt(i);
            if (char1 != '\\' && char1 != '/') {
                break;
            }
            ++n2;
            ++i;
        }
        return n2;
    }
    
    private static int e(final String s, int i, final int n) {
        while (i < n) {
            final char char1 = s.charAt(i);
            if (char1 == ':') {
                return i;
            }
            int n2 = i;
            int n3 = 0;
            Label_0058: {
                if (char1 != '[') {
                    n3 = i;
                }
                else {
                    do {
                        i = n2 + 1;
                        if ((n3 = i) >= n) {
                            break Label_0058;
                        }
                        n2 = i;
                    } while (s.charAt(i) != ']');
                    n3 = i;
                }
            }
            i = n3 + 1;
        }
        return n;
    }
    
    private static InetAddress f(final String s, int n, int n2) {
        final byte[] array = new byte[16];
        int i = n;
        n = 0;
        int n3 = -1;
        int n4 = -1;
        int n5;
        int n6;
        while (true) {
            n5 = n;
            n6 = n3;
            if (i >= n2) {
                break;
            }
            if (n == 16) {
                return null;
            }
            final int n7 = i + 2;
            if (n7 <= n2 && s.regionMatches(i, "::", 0, 2)) {
                if (n3 != -1) {
                    return null;
                }
                n += 2;
                if (n7 == n2) {
                    n6 = n;
                    n5 = n;
                    break;
                }
                n3 = n;
                n4 = n7;
            }
            else {
                int n8 = i;
                if (n != 0) {
                    if (s.regionMatches(i, ":", 0, 1)) {
                        n8 = i + 1;
                    }
                    else {
                        if (!s.regionMatches(i, ".", 0, 1)) {
                            return null;
                        }
                        int n10;
                        final int n9 = n10 = n - 2;
                        int j = n4;
                        Label_0331: {
                        Label_0324:
                            while (true) {
                                final int n11 = 0;
                                if (j < n2) {
                                    if (n10 == 16) {
                                        n2 = n11;
                                        break Label_0331;
                                    }
                                    int n12 = j;
                                    if (n10 != n9) {
                                        if (s.charAt(j) != '.') {
                                            n2 = n11;
                                            break Label_0331;
                                        }
                                        n12 = j + 1;
                                    }
                                    j = n12;
                                    int n13 = 0;
                                    while (j < n2) {
                                        final char char1 = s.charAt(j);
                                        if (char1 < '0' || char1 > '9') {
                                            break;
                                        }
                                        if (n13 == 0 && n12 != j) {
                                            break Label_0324;
                                        }
                                        n13 = n13 * 10 + char1 - 48;
                                        if (n13 > 255) {
                                            break Label_0324;
                                        }
                                        ++j;
                                    }
                                    if (j - n12 == 0) {
                                        break;
                                    }
                                    array[n10] = (byte)n13;
                                    ++n10;
                                }
                                else {
                                    if (n10 != n9 + 4) {
                                        break;
                                    }
                                    n2 = 1;
                                    break Label_0331;
                                }
                            }
                            n2 = 0;
                        }
                        if (n2 == 0) {
                            return null;
                        }
                        n5 = n + 2;
                        n6 = n3;
                        break;
                    }
                }
                n4 = n8;
            }
            i = n4;
            int n14 = 0;
            while (i < n2) {
                final int a = r.a(s.charAt(i));
                if (a == -1) {
                    break;
                }
                n14 = (n14 << 4) + a;
                ++i;
            }
            final int n15 = i - n4;
            if (n15 == 0) {
                return null;
            }
            if (n15 > 4) {
                return null;
            }
            final int n16 = n + 1;
            array[n] = (byte)(n14 >>> 8 & 0xFF);
            n = n16 + 1;
            array[n16] = (byte)(n14 & 0xFF);
        }
        if (n5 != 16) {
            if (n6 == -1) {
                return null;
            }
            n = n5 - n6;
            System.arraycopy(array, n6, array, 16 - n, n);
            Arrays.fill(array, n6, 16 - n5 + n6, (byte)0);
        }
        try {
            return InetAddress.getByAddress(array);
        }
        catch (UnknownHostException ex) {
            throw new AssertionError();
        }
    }
    
    private static int g(final String s, int \u0131nt, final int n) {
        try {
            \u0131nt = Integer.parseInt(r.a(s, \u0131nt, n, "", false, false, false, true));
            if (\u0131nt > 0 && \u0131nt <= 65535) {
                return \u0131nt;
            }
            return -1;
        }
        catch (NumberFormatException ex) {
            return -1;
        }
    }
    
    final int a() {
        if (this.e != -1) {
            return this.e;
        }
        return r.a(this.a);
    }
    
    final int a(final r r, final String s) {
        int a = a.a.c.a(s, 0, s.length());
        final int b = a.a.c.b(s, a, s.length());
        if (c(s, a, b) != -1) {
            if (s.regionMatches(true, a, "https:", 0, 6)) {
                this.a = "https";
                a += 6;
            }
            else {
                if (!s.regionMatches(true, a, "http:", 0, 5)) {
                    return a.r.a.a.c;
                }
                this.a = "http";
                a += 5;
            }
        }
        else {
            if (r == null) {
                return a.r.a.a.b;
            }
            this.a = r.a;
        }
        final int d = d(s, a, b);
        int a2 = 0;
        if (d < 2 && r != null && r.a.equals(this.a)) {
            this.b = r.c();
            this.c = r.d();
            this.d = r.b;
            this.e = r.c;
            this.f.clear();
            this.f.addAll(r.f());
            if (a == b || s.charAt(a) == '#') {
                this.a(r.g());
            }
            a2 = a;
        }
        else {
            int n = a + d;
            int n2 = 0;
            int n3 = 0;
        Label_0505:
            while (true) {
                a2 = a.a.c.a(s, n, b, "@/\\?#");
                int char1;
                if (a2 != b) {
                    char1 = s.charAt(a2);
                }
                else {
                    char1 = -1;
                }
                if (char1 == -1 || char1 == 35 || char1 == 47 || char1 == 92) {
                    break;
                }
                switch (char1) {
                    default: {
                        continue;
                    }
                    case 64: {
                        if (n2 == 0) {
                            final int a3 = a.a.c.a(s, n, a2, ':');
                            final int n4 = a2;
                            String b2 = r.a(s, n, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            if (n3 != 0) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append(this.b);
                                sb.append("%40");
                                sb.append(b2);
                                b2 = sb.toString();
                            }
                            this.b = b2;
                            if (a3 != n4) {
                                this.c = r.a(s, a3 + 1, n4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                n2 = 1;
                            }
                            n3 = 1;
                        }
                        else {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.c);
                            sb2.append("%40");
                            sb2.append(r.a(s, n, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true));
                            this.c = sb2.toString();
                        }
                        n = a2 + 1;
                        continue;
                    }
                    case 63: {
                        break Label_0505;
                    }
                }
            }
            final int e = e(s, n, a2);
            final int n5 = e + 1;
            if (n5 < a2) {
                this.d = a(s, n, e);
                this.e = g(s, n5, a2);
                if (this.e == -1) {
                    return a.r.a.a.d;
                }
            }
            else {
                this.d = a(s, n, e);
                this.e = r.a(this.a);
            }
            if (this.d == null) {
                return a.r.a.a.e;
            }
        }
        final int a4 = a.a.c.a(s, a2, b, "?#");
        this.b(s, a2, a4);
        int a5;
        if ((a5 = a4) < b) {
            a5 = a4;
            if (s.charAt(a4) == '?') {
                a5 = a.a.c.a(s, a4, b, '#');
                this.g = r.b(r.a(s, a4 + 1, a5, " \"'<>#", true, false, true, true));
            }
        }
        if (a5 < b && s.charAt(a5) == '#') {
            this.h = r.a(s, 1 + a5, b, "", true, false, false, false);
        }
        return a.r.a.a.a;
    }
    
    public final r.a a(final String s) {
        List<String> b;
        if (s != null) {
            b = r.b(r.a(s, " \"'<>#", true, false, true, true));
        }
        else {
            b = null;
        }
        this.g = b;
        return this;
    }
    
    public final r b() {
        if (this.a == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.d != null) {
            return new r(this);
        }
        throw new IllegalStateException("host == null");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("://");
        if (!this.b.isEmpty() || !this.c.isEmpty()) {
            sb.append(this.b);
            if (!this.c.isEmpty()) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        if (this.d.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.d);
            sb.append(']');
        }
        else {
            sb.append(this.d);
        }
        final int a = this.a();
        if (a != r.a(this.a)) {
            sb.append(':');
            sb.append(a);
        }
        r.a(sb, this.f);
        if (this.g != null) {
            sb.append('?');
            r.b(sb, this.g);
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
    
    enum a
    {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        private static final /* synthetic */ int[] f;
        
        static {
            f = new int[] { r.a.a.a, r.a.a.b, r.a.a.c, r.a.a.d, r.a.a.e };
        }
    }
}
