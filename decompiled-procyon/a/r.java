package a;

import b.*;
import java.util.*;
import java.net.*;

public final class r
{
    private static final char[] e;
    public final String a;
    public final String b;
    public final int c;
    public final List<String> d;
    private final String f;
    private final String g;
    private final List<String> h;
    private final String i;
    private final String j;
    
    static {
        e = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    }
    
    r(final a a) {
        super();
        this.a = a.a;
        this.f = a(a.b, false);
        this.g = a(a.c, false);
        this.b = a.d;
        this.c = a.a();
        this.h = a(a.f, false);
        final List<String> g = a.g;
        final String s = null;
        List<String> a2;
        if (g != null) {
            a2 = a(a.g, true);
        }
        else {
            a2 = null;
        }
        this.d = a2;
        String a3 = s;
        if (a.h != null) {
            a3 = a(a.h, false);
        }
        this.i = a3;
        this.j = a.toString();
    }
    
    static int a(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'a' + 10;
        }
        if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        }
        return -1;
    }
    
    public static int a(final String s) {
        if (s.equals("http")) {
            return 80;
        }
        if (s.equals("https")) {
            return 443;
        }
        return -1;
    }
    
    static String a(final String s, int codePoint, final int n, final String s2, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        int codePoint2;
        for (int i = codePoint; i < n; i += Character.charCount(codePoint2)) {
            codePoint2 = s.codePointAt(i);
            if (codePoint2 < 32 || codePoint2 == 127 || (codePoint2 >= 128 && b4) || s2.indexOf(codePoint2) != -1 || (codePoint2 == 37 && (!b || (b2 && !a(s, i, n)))) || (codePoint2 == 43 && b3)) {
                final c c = new c();
                c.a(s, codePoint, i);
                c c2 = null;
                while (i < n) {
                    codePoint = s.codePointAt(i);
                    Label_0380: {
                        if (!b || (codePoint != 9 && codePoint != 10 && codePoint != 12 && codePoint != 13)) {
                            if (codePoint == 43 && b3) {
                                String s3;
                                if (b) {
                                    s3 = "+";
                                }
                                else {
                                    s3 = "%2B";
                                }
                                c.a(s3);
                            }
                            else {
                                Label_0289: {
                                    if (codePoint >= 32 && codePoint != 127 && (codePoint < 128 || !b4) && s2.indexOf(codePoint) == -1) {
                                        if (codePoint == 37) {
                                            if (!b) {
                                                break Label_0289;
                                            }
                                            if (b2 && !a(s, i, n)) {
                                                break Label_0289;
                                            }
                                        }
                                        c.a(codePoint);
                                        break Label_0380;
                                    }
                                }
                                c c3;
                                if ((c3 = c2) == null) {
                                    c3 = new c();
                                }
                                c3.a(codePoint);
                                while (true) {
                                    c2 = c3;
                                    if (c3.c()) {
                                        break;
                                    }
                                    final int n2 = c3.e() & 0xFF;
                                    c.b(37);
                                    c.b(r.e[n2 >> 4 & 0xF]);
                                    c.b(r.e[n2 & 0xF]);
                                }
                            }
                        }
                    }
                    i += Character.charCount(codePoint);
                }
                return c.l();
            }
        }
        return s.substring(codePoint, n);
    }
    
    static String a(final String s, final int n, final int n2, final boolean b) {
        for (int i = n; i < n2; ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '%' || (char1 == '+' && b)) {
                final c c = new c();
                c.a(s, n, i);
                a(c, s, i, n2, b);
                return c.l();
            }
        }
        return s.substring(n, n2);
    }
    
    static String a(final String s, final String s2, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        return a(s, 0, s.length(), s2, b, b2, b3, b4);
    }
    
    private static String a(final String s, final boolean b) {
        return a(s, 0, s.length(), b);
    }
    
    private static List<String> a(final List<String> list, final boolean b) {
        final int size = list.size();
        final ArrayList list2 = new ArrayList<String>(size);
        for (int i = 0; i < size; ++i) {
            final String s = list.get(i);
            String a;
            if (s != null) {
                a = a(s, b);
            }
            else {
                a = null;
            }
            list2.add(a);
        }
        return Collections.unmodifiableList((List<? extends String>)list2);
    }
    
    private static void a(final c c, final String s, int i, final int n, final boolean b) {
        while (i < n) {
            final int codePoint = s.codePointAt(i);
            Label_0112: {
                Label_0105: {
                    if (codePoint == 37) {
                        final int n2 = i + 2;
                        if (n2 < n) {
                            final int a = a(s.charAt(i + 1));
                            final int a2 = a(s.charAt(n2));
                            if (a != -1 && a2 != -1) {
                                c.b((a << 4) + a2);
                                i = n2;
                                break Label_0112;
                            }
                            break Label_0105;
                        }
                    }
                    if (codePoint == 43 && b) {
                        c.b(32);
                        break Label_0112;
                    }
                }
                c.a(codePoint);
            }
            i += Character.charCount(codePoint);
        }
    }
    
    static void a(final StringBuilder sb, final List<String> list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }
    
    private static boolean a(final String s, final int n, final int n2) {
        final int n3 = n + 2;
        return n3 < n2 && s.charAt(n) == '%' && a(s.charAt(n + 1)) != -1 && a(s.charAt(n3)) != -1;
    }
    
    static List<String> b(final String s) {
        final ArrayList<String> list = new ArrayList<String>();
        int n;
        for (int i = 0; i <= s.length(); i = n + 1) {
            if ((n = s.indexOf(38, i)) == -1) {
                n = s.length();
            }
            final int index = s.indexOf(61, i);
            if (index != -1 && index <= n) {
                list.add(s.substring(i, index));
                list.add(s.substring(index + 1, n));
            }
            else {
                list.add(s.substring(i, n));
                list.add(null);
            }
        }
        return list;
    }
    
    public static void b(final StringBuilder sb, final List<String> list) {
        for (int size = list.size(), i = 0; i < size; i += 2) {
            final String s = list.get(i);
            final String s2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(s);
            if (s2 != null) {
                sb.append('=');
                sb.append(s2);
            }
        }
    }
    
    public static r d(final String s) {
        final a a = new a();
        if (a.a(null, s) == r.a.a.a) {
            return a.b();
        }
        return null;
    }
    
    public final URI a() {
        final a a = new a();
        a.a = this.a;
        a.b = this.c();
        a.c = this.d();
        a.d = this.b;
        int c;
        if (this.c != a(this.a)) {
            c = this.c;
        }
        else {
            c = -1;
        }
        a.e = c;
        a.f.clear();
        a.f.addAll(this.f());
        a.a(this.g());
        String substring;
        if (this.i == null) {
            substring = null;
        }
        else {
            substring = this.j.substring(this.j.indexOf(35) + 1);
        }
        a.h = substring;
        final int size = a.f.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            a.f.set(i, a(a.f.get(i), "[]", true, true, false, true));
        }
        if (a.g != null) {
            for (int size2 = a.g.size(), j = n; j < size2; ++j) {
                final String s = a.g.get(j);
                if (s != null) {
                    a.g.set(j, a(s, "\\^`{|}", true, true, true, true));
                }
            }
        }
        if (a.h != null) {
            a.h = a(a.h, " \"#<>\\^`{|}", true, true, false, false);
        }
        final String string = a.toString();
        try {
            return new URI(string);
        }
        catch (URISyntaxException ex) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            }
            catch (Exception ex2) {}
        }
    }
    
    public final boolean b() {
        return this.a.equals("https");
    }
    
    public final a c(final String s) {
        final a a = new a();
        if (a.a(this, s) == r.a.a.a) {
            return a;
        }
        return null;
    }
    
    public final String c() {
        if (this.f.isEmpty()) {
            return "";
        }
        final int n = this.a.length() + 3;
        final String j = this.j;
        return this.j.substring(n, a.a.c.a(j, n, j.length(), ":@"));
    }
    
    public final String d() {
        if (this.g.isEmpty()) {
            return "";
        }
        return this.j.substring(this.j.indexOf(58, this.a.length() + 3) + 1, this.j.indexOf(64));
    }
    
    public final String e() {
        final int index = this.j.indexOf(47, this.a.length() + 3);
        final String j = this.j;
        return this.j.substring(index, a.a.c.a(j, index, j.length(), "?#"));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof r && ((r)o).j.equals(this.j);
    }
    
    public final List<String> f() {
        int i = this.j.indexOf(47, this.a.length() + 3);
        final String j = this.j;
        final int a = a.a.c.a(j, i, j.length(), "?#");
        final ArrayList<String> list = new ArrayList<String>();
        while (i < a) {
            final int n = i + 1;
            i = a.a.c.a(this.j, n, a, '/');
            list.add(this.j.substring(n, i));
        }
        return list;
    }
    
    public final String g() {
        if (this.d == null) {
            return null;
        }
        final int n = this.j.indexOf(63) + 1;
        return this.j.substring(n, a.a.c.a(this.j, n + 1, this.j.length(), '#'));
    }
    
    @Override
    public final int hashCode() {
        return this.j.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.j;
    }
    
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
                return a.a.c.a(a);
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
            final c c = new c();
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
}
