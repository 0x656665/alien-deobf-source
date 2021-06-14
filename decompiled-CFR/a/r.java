/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.c;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class r {
    private static final char[] e = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final int c;
    public final List<String> d;
    private final String f;
    private final String g;
    private final List<String> h;
    private final String i;
    private final String j;

    r(a a2) {
        this.a = a2.a;
        this.f = r.a(a2.b, false);
        this.g = r.a(a2.c, false);
        this.b = a2.d;
        this.c = a2.a();
        this.h = r.a(a2.f, false);
        List<String> list = a2.g;
        Object var3_3 = null;
        list = list != null ? r.a(a2.g, true) : null;
        this.d = list;
        list = var3_3;
        if (a2.h != null) {
            list = r.a(a2.h, false);
        }
        this.i = list;
        this.j = a2.toString();
    }

    static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - 48;
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 97 + 10;
        }
        if (c2 < 'A') return -1;
        if (c2 > 'F') return -1;
        return c2 - 65 + 10;
    }

    public static int a(String string) {
        if (string.equals("http")) {
            return 80;
        }
        if (!string.equals("https")) return -1;
        return 443;
    }

    static String a(String string, int n2, int n3, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n4;
        int n5;
        block10 : {
            n5 = n2;
            while (n5 < n3) {
                n4 = string.codePointAt(n5);
                if (!(n4 < 32 || n4 == 127 || n4 >= 128 && bl4 || string2.indexOf(n4) != -1 || n4 == 37 && (!bl || bl2 && !r.a(string, n5, n3)) || n4 == 43 && bl3)) {
                    n5 += Character.charCount(n4);
                    continue;
                }
                break block10;
            }
            return string.substring(n2, n3);
        }
        b.c c2 = new b.c();
        c2.a(string, n2, n5);
        Object object = null;
        while (n5 < n3) {
            n2 = string.codePointAt(n5);
            if (!bl || n2 != 9 && n2 != 10 && n2 != 12 && n2 != 13) {
                Object object2;
                if (n2 == 43 && bl3) {
                    object2 = bl ? "+" : "%2B";
                    c2.a((String)object2);
                } else if (!(n2 < 32 || n2 == 127 || n2 >= 128 && bl4 || string2.indexOf(n2) != -1 || n2 == 37 && (!bl || bl2 && !r.a(string, n5, n3)))) {
                    c2.a(n2);
                } else {
                    object2 = object;
                    if (object == null) {
                        object2 = new b.c();
                    }
                    ((b.c)object2).a(n2);
                    do {
                        object = object2;
                        if (((b.c)object2).c()) break;
                        n4 = ((b.c)object2).e() & 255;
                        c2.b(37);
                        c2.b(e[n4 >> 4 & 15]);
                        c2.b(e[n4 & 15]);
                    } while (true);
                }
            }
            n5 += Character.charCount(n2);
        }
        return c2.l();
    }

    static String a(String string, int n2, int n3, boolean bl) {
        int n4;
        block2 : {
            n4 = n2;
            while (n4 < n3) {
                char c2 = string.charAt(n4);
                if (!(c2 == '%' || c2 == '+' && bl)) {
                    ++n4;
                    continue;
                }
                break block2;
            }
            return string.substring(n2, n3);
        }
        b.c c3 = new b.c();
        c3.a(string, n2, n4);
        r.a(c3, string, n4, n3, bl);
        return c3.l();
    }

    static String a(String string, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        return r.a(string, 0, string.length(), string2, bl, bl2, bl3, bl4);
    }

    private static String a(String string, boolean bl) {
        return r.a(string, 0, string.length(), bl);
    }

    private static List<String> a(List<String> list, boolean bl) {
        int n2 = list.size();
        ArrayList<String> arrayList = new ArrayList<String>(n2);
        int n3 = 0;
        while (n3 < n2) {
            String string = list.get(n3);
            string = string != null ? r.a(string, bl) : null;
            arrayList.add(string);
            ++n3;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /*
     * Unable to fully structure code
     */
    private static void a(b.c var0, String var1_1, int var2_2, int var3_3, boolean var4_4) {
        while (var2_2 < var3_3) {
            block4 : {
                block3 : {
                    var6_6 = var1_1.codePointAt(var2_2);
                    if (var6_6 != 37 || (var5_5 = var2_2 + 2) >= var3_3) break block3;
                    var7_7 = r.a(var1_1.charAt(var2_2 + 1));
                    var8_8 = r.a(var1_1.charAt(var5_5));
                    if (var7_7 == -1 || var8_8 == -1) ** GOTO lbl-1000
                    var0.b((var7_7 << 4) + var8_8);
                    var2_2 = var5_5;
                    break block4;
                }
                if (var6_6 == 43 && var4_4) {
                    var0.b(32);
                } else lbl-1000: // 2 sources:
                {
                    var0.a(var6_6);
                }
            }
            var2_2 += Character.charCount(var6_6);
        }
    }

    static void a(StringBuilder stringBuilder, List<String> list) {
        int n2 = list.size();
        int n3 = 0;
        while (n3 < n2) {
            stringBuilder.append('/');
            stringBuilder.append(list.get(n3));
            ++n3;
        }
    }

    private static boolean a(String string, int n2, int n3) {
        int n4 = n2 + 2;
        if (n4 >= n3) return false;
        if (string.charAt(n2) != '%') return false;
        if (r.a(string.charAt(n2 + 1)) == -1) return false;
        if (r.a(string.charAt(n4)) == -1) return false;
        return true;
    }

    static List<String> b(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        int n2 = 0;
        while (n2 <= string.length()) {
            int n3;
            int n4 = n3 = string.indexOf(38, n2);
            if (n3 == -1) {
                n4 = string.length();
            }
            if ((n3 = string.indexOf(61, n2)) != -1 && n3 <= n4) {
                arrayList.add(string.substring(n2, n3));
                arrayList.add(string.substring(n3 + 1, n4));
            } else {
                arrayList.add(string.substring(n2, n4));
                arrayList.add(null);
            }
            n2 = n4 + 1;
        }
        return arrayList;
    }

    public static void b(StringBuilder stringBuilder, List<String> list) {
        int n2 = list.size();
        int n3 = 0;
        while (n3 < n2) {
            String string = list.get(n3);
            String string2 = list.get(n3 + 1);
            if (n3 > 0) {
                stringBuilder.append('&');
            }
            stringBuilder.append(string);
            if (string2 != null) {
                stringBuilder.append('=');
                stringBuilder.append(string2);
            }
            n3 += 2;
        }
    }

    public static r d(String string) {
        a a2 = new a();
        if (a2.a(null, string) != a.a.a) return null;
        return a2.b();
    }

    public final URI a() {
        Object object;
        Object object2 = new a();
        ((a)object2).a = this.a;
        ((a)object2).b = this.c();
        ((a)object2).c = this.d();
        ((a)object2).d = this.b;
        int n2 = this.c != r.a(this.a) ? this.c : -1;
        ((a)object2).e = n2;
        ((a)object2).f.clear();
        ((a)object2).f.addAll(this.f());
        ((a)object2).a(this.g());
        if (this.i == null) {
            object = null;
        } else {
            n2 = this.j.indexOf(35);
            object = this.j.substring(n2 + 1);
        }
        ((a)object2).h = object;
        int n3 = ((a)object2).f.size();
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            object = ((a)object2).f.get(n2);
            ((a)object2).f.set(n2, r.a((String)object, "[]", true, true, false, true));
        }
        if (((a)object2).g != null) {
            n3 = ((a)object2).g.size();
            for (n2 = n4; n2 < n3; ++n2) {
                object = ((a)object2).g.get(n2);
                if (object == null) continue;
                ((a)object2).g.set(n2, r.a((String)object, "\\^`{|}", true, true, true, true));
            }
        }
        if (((a)object2).h != null) {
            ((a)object2).h = r.a(((a)object2).h, " \"#<>\\^`{|}", true, true, false, false);
        }
        object2 = ((a)object2).toString();
        try {
            return new URI((String)object2);
        }
        catch (URISyntaxException uRISyntaxException) {
            try {
                return URI.create(((String)object2).replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            }
            catch (Exception exception) {
                throw new RuntimeException(uRISyntaxException);
            }
        }
    }

    public final boolean b() {
        return this.a.equals("https");
    }

    public final a c(String string) {
        a a2 = new a();
        if (a2.a(this, string) != a.a.a) return null;
        return a2;
    }

    public final String c() {
        if (this.f.isEmpty()) {
            return "";
        }
        int n2 = this.a.length() + 3;
        String string = this.j;
        int n3 = c.a(string, n2, string.length(), ":@");
        return this.j.substring(n2, n3);
    }

    public final String d() {
        if (this.g.isEmpty()) {
            return "";
        }
        int n2 = this.j.indexOf(58, this.a.length() + 3);
        int n3 = this.j.indexOf(64);
        return this.j.substring(n2 + 1, n3);
    }

    public final String e() {
        int n2 = this.j.indexOf(47, this.a.length() + 3);
        String string = this.j;
        int n3 = c.a(string, n2, string.length(), "?#");
        return this.j.substring(n2, n3);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof r)) return false;
        if (!((r)object).j.equals(this.j)) return false;
        return true;
    }

    public final List<String> f() {
        int n2 = this.j.indexOf(47, this.a.length() + 3);
        Object object = this.j;
        int n3 = c.a((String)object, n2, ((String)object).length(), "?#");
        object = new ArrayList();
        while (n2 < n3) {
            int n4 = n2 + 1;
            n2 = c.a(this.j, n4, n3, '/');
            object.add(this.j.substring(n4, n2));
        }
        return object;
    }

    public final String g() {
        if (this.d == null) {
            return null;
        }
        int n2 = this.j.indexOf(63) + 1;
        int n3 = c.a(this.j, n2 + 1, this.j.length(), '#');
        return this.j.substring(n2, n3);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final String toString() {
        return this.j;
    }

    public static final class a.r$a {
        String a;
        String b = "";
        String c = "";
        String d;
        int e = -1;
        final List<String> f = new ArrayList<String>();
        List<String> g;
        String h;

        public a.r$a() {
            this.f.add("");
        }

        static String a(String object, int n2, int n3) {
            if (!(object = r.a((String)object, n2, n3, false)).contains(":")) return c.a((String)object);
            object = object.startsWith("[") && object.endsWith("]") ? a.r$a.f((String)object, 1, object.length() - 1) : a.r$a.f((String)object, 0, object.length());
            if (object == null) {
                return null;
            }
            if (((byte[])(object = object.getAddress())).length != 16) throw new AssertionError();
            return a.r$a.a(object);
        }

        private static String a(byte[] arrby) {
            int n2;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            int n6 = -1;
            while (n4 < arrby.length) {
                for (n2 = n4; n2 < 16 && arrby[n2] == 0 && arrby[n2 + 1] == 0; n2 += 2) {
                }
                int n7 = n2 - n4;
                int n8 = n5;
                if (n7 > n5) {
                    n8 = n7;
                    n6 = n4;
                }
                n4 = n2 + 2;
                n5 = n8;
            }
            b.c c2 = new b.c();
            n4 = n3;
            while (n4 < arrby.length) {
                if (n4 == n6) {
                    c2.b(58);
                    n4 = n2 = n4 + n5;
                    if (n2 != 16) continue;
                    c2.b(58);
                    n4 = n2;
                    continue;
                }
                if (n4 > 0) {
                    c2.b(58);
                }
                c2.h((long)((arrby[n4] & 255) << 8 | arrby[n4 + 1] & 255));
                n4 += 2;
            }
            return c2.l();
        }

        private void b(String string, int n2, int n3) {
            if (n2 == n3) {
                return;
            }
            char c2 = string.charAt(n2);
            if (c2 != '/' && c2 != '\\') {
                this.f.set(this.f.size() - 1, "");
            } else {
                this.f.clear();
                this.f.add("");
                ++n2;
            }
            while (n2 < n3) {
                int n4;
                block14 : {
                    String string2;
                    block16 : {
                        block15 : {
                            n4 = c.a(string, n2, n3, "/\\");
                            int n5 = 0;
                            c2 = n4 < n3 ? (char)'\u0001' : '\u0000';
                            string2 = r.a(string, n2, n4, " \"<>^`{}|/\\?#", true, false, false, true);
                            n2 = !string2.equals(".") && !string2.equalsIgnoreCase("%2e") ? 0 : 1;
                            if (n2 != 0) break block14;
                            if (string2.equals("..") || string2.equalsIgnoreCase("%2e.") || string2.equalsIgnoreCase(".%2e")) break block15;
                            n2 = n5;
                            if (!string2.equalsIgnoreCase("%2e%2e")) break block16;
                        }
                        n2 = 1;
                    }
                    if (n2 != 0) {
                        if (this.f.remove(this.f.size() - 1).isEmpty() && !this.f.isEmpty()) {
                            this.f.set(this.f.size() - 1, "");
                        } else {
                            this.f.add("");
                        }
                    } else {
                        if (this.f.get(this.f.size() - 1).isEmpty()) {
                            this.f.set(this.f.size() - 1, string2);
                        } else {
                            this.f.add(string2);
                        }
                        if (c2 != '\u0000') {
                            this.f.add("");
                        }
                    }
                }
                n2 = n4;
                if (c2 == '\u0000') continue;
                n2 = n4 + 1;
            }
        }

        /*
         * Unable to fully structure code
         */
        private static int c(String var0, int var1_1, int var2_2) {
            block7 : {
                block6 : {
                    if (var2_2 - var1_1 < 2) {
                        return -1;
                    }
                    var4_3 = var0.charAt(var1_1);
                    if (var4_3 < 'a') break block6;
                    var3_4 = var1_1;
                    if (var4_3 <= 'z') break block7;
                }
                if (var4_3 < 'A') return -1;
                var3_4 = var1_1;
                if (var4_3 > 'Z') {
                    return -1;
                }
            }
            do lbl-1000: // 7 sources:
            {
                block10 : {
                    block9 : {
                        block8 : {
                            if ((var1_1 = var3_4 + 1) >= var2_2) return -1;
                            var4_3 = var0.charAt(var1_1);
                            if (var4_3 < 'a') break block8;
                            var3_4 = var1_1;
                            if (var4_3 <= 'z') ** GOTO lbl-1000
                        }
                        if (var4_3 < 'A') break block9;
                        var3_4 = var1_1;
                        if (var4_3 <= 'Z') ** GOTO lbl-1000
                    }
                    if (var4_3 < '0') break block10;
                    var3_4 = var1_1;
                    if (var4_3 <= '9') ** GOTO lbl-1000
                }
                var3_4 = var1_1;
                if (var4_3 == '+') ** GOTO lbl-1000
                var3_4 = var1_1;
                if (var4_3 == '-') ** GOTO lbl-1000
                var3_4 = var1_1;
            } while (var4_3 == '.');
            if (var4_3 != ':') return -1;
            return var1_1;
        }

        private static int d(String string, int n2, int n3) {
            int n4 = 0;
            while (n2 < n3) {
                char c2 = string.charAt(n2);
                if (c2 != '\\') {
                    if (c2 != '/') return n4;
                }
                ++n4;
                ++n2;
            }
            return n4;
        }

        private static int e(String string, int n2, int n3) {
            while (n2 < n3) {
                int n4;
                block4 : {
                    char c2 = string.charAt(n2);
                    if (c2 == ':') return n2;
                    n4 = n2;
                    if (c2 != '[') {
                        n4 = n2;
                    } else {
                        do {
                            n4 = n2 = n4 + 1;
                            if (n2 >= n3) break block4;
                            n4 = n2;
                        } while (string.charAt(n2) != ']');
                        n4 = n2;
                    }
                }
                n2 = n4 + 1;
            }
            return n3;
        }

        private static InetAddress f(String object, int n2, int n3) {
            int n4;
            byte[] arrby;
            int n5;
            block21 : {
                int n6;
                arrby = new byte[16];
                int n7 = n2;
                n2 = 0;
                int n8 = -1;
                int n9 = -1;
                do {
                    n5 = n2;
                    n4 = n8;
                    if (n7 >= n3) break block21;
                    if (n2 == 16) {
                        return null;
                    }
                    n5 = n7 + 2;
                    if (n5 <= n3 && ((String)object).regionMatches(n7, "::", 0, 2)) {
                        if (n8 != -1) {
                            return null;
                        }
                        n2 += 2;
                        if (n5 == n3) {
                            n4 = n2;
                            n5 = n2;
                            break block21;
                        }
                        n8 = n2;
                        n9 = n5;
                    } else {
                        n5 = n7;
                        if (n2 != 0) {
                            if (!((String)object).regionMatches(n7, ":", 0, 1)) break;
                            n5 = n7 + 1;
                        }
                        n9 = n5;
                    }
                    n5 = 0;
                    for (n7 = n9; n7 < n3 && (n4 = r.a(((String)object).charAt(n7))) != -1; ++n7) {
                        n5 = (n5 << 4) + n4;
                    }
                    n4 = n7 - n9;
                    if (n4 == 0) return null;
                    if (n4 > 4) {
                        return null;
                    }
                    n4 = n2 + 1;
                    arrby[n2] = (byte)(n5 >>> 8 & 255);
                    n2 = n4 + 1;
                    arrby[n4] = (byte)(n5 & 255);
                } while (true);
                if (!((String)object).regionMatches(n7, ".", 0, 1)) return null;
                n5 = n6 = n2 - 2;
                n7 = n9;
                do {
                    char c2;
                    n4 = 0;
                    if (n7 < n3) {
                        if (n5 == 16) {
                            n3 = n4;
                            break;
                        }
                        n9 = n7;
                        if (n5 != n6) {
                            if (((String)object).charAt(n7) != '.') {
                                n3 = n4;
                                break;
                            }
                            n9 = n7 + 1;
                        }
                        n4 = 0;
                    } else {
                        if (n5 != n6 + 4) return null;
                        n3 = 1;
                        break;
                    }
                    for (n7 = n9; n7 < n3 && (c2 = ((String)object).charAt(n7)) >= '0' && c2 <= '9'; ++n7) {
                        if (n4 == 0 && n9 != n7 || (n4 = n4 * 10 + c2 - 48) > 255) return null;
                    }
                    if (n7 - n9 == 0) return null;
                    arrby[n5] = (byte)n4;
                    ++n5;
                } while (true);
                if (n3 == 0) {
                    return null;
                }
                n5 = n2 + 2;
                n4 = n8;
            }
            if (n5 != 16) {
                if (n4 == -1) {
                    return null;
                }
                n2 = n5 - n4;
                System.arraycopy(arrby, n4, arrby, 16 - n2, n2);
                Arrays.fill(arrby, n4, 16 - n5 + n4, (byte)0);
            }
            try {
                return InetAddress.getByAddress(arrby);
            }
            catch (UnknownHostException unknownHostException) {
                throw new AssertionError();
            }
        }

        private static int g(String string, int n2, int n3) {
            try {
                n2 = Integer.parseInt(r.a(string, n2, n3, "", false, false, false, true));
                if (n2 <= 0) return -1;
                if (n2 > 65535) return -1;
                return n2;
            }
            catch (NumberFormatException numberFormatException) {
                return -1;
            }
        }

        final int a() {
            if (this.e == -1) return r.a(this.a);
            return this.e;
        }

        final int a(r object, String string) {
            int n2;
            int n3;
            int n4 = c.a(string, 0, string.length());
            if (a.r$a.c(string, n4, n2 = c.b(string, n4, string.length())) != -1) {
                if (string.regionMatches(true, n4, "https:", 0, 6)) {
                    this.a = "https";
                    n4 += 6;
                } else {
                    if (!string.regionMatches(true, n4, "http:", 0, 5)) return a.c;
                    this.a = "http";
                    n4 += 5;
                }
            } else {
                if (object == null) return a.b;
                this.a = ((r)object).a;
            }
            int n5 = a.r$a.d(string, n4, n2);
            if (n5 < 2 && object != null && ((r)object).a.equals(this.a)) {
                this.b = ((r)object).c();
                this.c = ((r)object).d();
                this.d = ((r)object).b;
                this.e = ((r)object).c;
                this.f.clear();
                this.f.addAll(((r)object).f());
                if (n4 == n2 || string.charAt(n4) == '#') {
                    this.a(((r)object).g());
                }
                n3 = n4;
            } else {
                int n6;
                n5 = n4 + n5;
                n4 = 0;
                int n7 = 0;
                block4 : while ((n6 = (n3 = c.a(string, n5, n2, "@/\\?#")) != n2 ? (int)string.charAt(n3) : -1) != -1 && n6 != 35 && n6 != 47 && n6 != 92) {
                    switch (n6) {
                        default: {
                            continue block4;
                        }
                        case 64: {
                            if (n4 == 0) {
                                int n8 = c.a(string, n5, n3, ':');
                                n6 = n3;
                                String string2 = r.a(string, n5, n8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                object = string2;
                                if (n7 != 0) {
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append(this.b);
                                    ((StringBuilder)object).append("%40");
                                    ((StringBuilder)object).append(string2);
                                    object = ((StringBuilder)object).toString();
                                }
                                this.b = object;
                                if (n8 != n6) {
                                    this.c = r.a(string, n8 + 1, n6, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                    n4 = 1;
                                }
                                n7 = 1;
                            } else {
                                object = new StringBuilder();
                                ((StringBuilder)object).append(this.c);
                                ((StringBuilder)object).append("%40");
                                ((StringBuilder)object).append(r.a(string, n5, n3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true));
                                this.c = ((StringBuilder)object).toString();
                            }
                            n5 = n3 + 1;
                            continue block4;
                        }
                        case 63: {
                            break block4;
                        }
                    }
                }
                if ((n7 = (n4 = a.r$a.e(string, n5, n3)) + 1) < n3) {
                    this.d = a.r$a.a(string, n5, n4);
                    this.e = a.r$a.g(string, n7, n3);
                    if (this.e == -1) {
                        return a.d;
                    }
                } else {
                    this.d = a.r$a.a(string, n5, n4);
                    this.e = r.a(this.a);
                }
                if (this.d == null) {
                    return a.e;
                }
            }
            n5 = c.a(string, n3, n2, "?#");
            this.b(string, n3, n5);
            n4 = n5;
            if (n5 < n2) {
                n4 = n5;
                if (string.charAt(n5) == '?') {
                    n4 = c.a(string, n5, n2, '#');
                    this.g = r.b(r.a(string, n5 + 1, n4, " \"'<>#", true, false, true, true));
                }
            }
            if (n4 >= n2) return a.a;
            if (string.charAt(n4) != '#') return a.a;
            this.h = r.a(string, 1 + n4, n2, "", true, false, false, false);
            return a.a;
        }

        public final a.r$a a(String list) {
            list = list != null ? r.b(r.a((String)((Object)list), " \"'<>#", true, false, true, true)) : null;
            this.g = list;
            return this;
        }

        public final r b() {
            if (this.a == null) throw new IllegalStateException("scheme == null");
            if (this.d == null) throw new IllegalStateException("host == null");
            return new r(this);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("://");
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                stringBuilder.append(this.b);
                if (!this.c.isEmpty()) {
                    stringBuilder.append(':');
                    stringBuilder.append(this.c);
                }
                stringBuilder.append('@');
            }
            if (this.d.indexOf(58) != -1) {
                stringBuilder.append('[');
                stringBuilder.append(this.d);
                stringBuilder.append(']');
            } else {
                stringBuilder.append(this.d);
            }
            int n2 = this.a();
            if (n2 != r.a(this.a)) {
                stringBuilder.append(':');
                stringBuilder.append(n2);
            }
            r.a(stringBuilder, this.f);
            if (this.g != null) {
                stringBuilder.append('?');
                r.b(stringBuilder, this.g);
            }
            if (this.h == null) return stringBuilder.toString();
            stringBuilder.append('#');
            stringBuilder.append(this.h);
            return stringBuilder.toString();
        }

        static final class a
        extends Enum<a> {
            public static final int a = 1;
            public static final int b = 2;
            public static final int c = 3;
            public static final int d = 4;
            public static final int e = 5;
            private static final /* synthetic */ int[] f;

            static {
                f = new int[]{a, b, c, d, e};
            }
        }

    }

}

