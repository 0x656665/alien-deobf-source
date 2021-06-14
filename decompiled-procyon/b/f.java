package b;

import java.io.*;
import java.security.*;
import java.util.*;

public class f implements Serializable, Comparable<f>
{
    static final char[] a;
    public static final f b;
    final byte[] c;
    transient int d;
    transient String e;
    
    static {
        a = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        b = a(new byte[0]);
    }
    
    f(final byte[] c) {
        super();
        this.c = c;
    }
    
    private static int a(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'a' + 10;
        }
        if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        }
        throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c)));
    }
    
    public static f a(final String e) {
        if (e != null) {
            final f f = new f(e.getBytes(t.a));
            f.e = e;
            return f;
        }
        throw new IllegalArgumentException("s == null");
    }
    
    public static f a(final byte... array) {
        if (array != null) {
            return new f(array.clone());
        }
        throw new IllegalArgumentException("data == null");
    }
    
    public static f b(final String s) {
        if (s.length() % 2 == 0) {
            final byte[] array = new byte[s.length() / 2];
            for (int i = 0; i < array.length; ++i) {
                final int n = i * 2;
                array[i] = (byte)((a(s.charAt(n)) << 4) + a(s.charAt(n + 1)));
            }
            return a(array);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(String.valueOf(s)));
    }
    
    private f c(final String s) {
        try {
            return a(MessageDigest.getInstance(s).digest(this.c));
        }
        catch (NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public byte a(final int n) {
        return this.c[n];
    }
    
    public f a(final int n, final int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (n2 > this.c.length) {
            final StringBuilder sb = new StringBuilder("endIndex > length(");
            sb.append(this.c.length);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        final int n3 = n2 - n;
        if (n3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (n == 0 && n2 == this.c.length) {
            return this;
        }
        final byte[] array = new byte[n3];
        System.arraycopy(this.c, n, array, 0, n3);
        return new f(array);
    }
    
    public String a() {
        final String e = this.e;
        if (e != null) {
            return e;
        }
        return this.e = new String(this.c, t.a);
    }
    
    void a(final c c) {
        c.a(this.c, 0, this.c.length);
    }
    
    public boolean a(final int n, final f f, final int n2, final int n3) {
        return f.a(0, this.c, 0, n3);
    }
    
    public boolean a(final int n, final byte[] array, final int n2, final int n3) {
        return n >= 0 && n <= this.c.length - n3 && n2 >= 0 && n2 <= array.length - n3 && t.a(this.c, n, array, n2, n3);
    }
    
    public String b() {
        return b.b.a(this.c);
    }
    
    public f c() {
        return this.c("SHA-1");
    }
    
    @Override
    public /* synthetic */ int compareTo(final Object o) {
        final f f = (f)o;
        final int g = this.g();
        final int g2 = f.g();
        final int min = Math.min(g, g2);
        int i = 0;
        while (i < min) {
            final int n = this.a(i) & 0xFF;
            final int n2 = f.a(i) & 0xFF;
            if (n != n2) {
                if (n < n2) {
                    return -1;
                }
                return 1;
            }
            else {
                ++i;
            }
        }
        if (g == g2) {
            return 0;
        }
        if (g < g2) {
            return -1;
        }
        return 1;
    }
    
    public f d() {
        return this.c("SHA-256");
    }
    
    public String e() {
        final char[] array = new char[this.c.length * 2];
        final byte[] c = this.c;
        final int length = c.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final byte b = c[i];
            final int n2 = n + 1;
            array[n] = f.a[b >> 4 & 0xF];
            n = n2 + 1;
            array[n2] = f.a[b & 0xF];
            ++i;
        }
        return new String(array);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof f) {
            final f f = (f)o;
            if (f.g() == this.c.length && f.a(0, this.c, 0, this.c.length)) {
                return true;
            }
        }
        return false;
    }
    
    public f f() {
        for (int i = 0; i < this.c.length; ++i) {
            final byte b = this.c[i];
            if (b >= 65 && b <= 90) {
                final byte[] array = this.c.clone();
                final int n = i + 1;
                array[i] = (byte)(b + 32);
                for (int j = n; j < array.length; ++j) {
                    final byte b2 = array[j];
                    if (b2 >= 65 && b2 <= 90) {
                        array[j] = (byte)(b2 + 32);
                    }
                }
                return new f(array);
            }
        }
        return this;
    }
    
    public int g() {
        return this.c.length;
    }
    
    public byte[] h() {
        return this.c.clone();
    }
    
    @Override
    public int hashCode() {
        final int d = this.d;
        if (d != 0) {
            return d;
        }
        return this.d = Arrays.hashCode(this.c);
    }
    
    @Override
    public String toString() {
        if (this.c.length == 0) {
            return "[size=0]";
        }
        final String a = this.a();
        final int length = a.length();
        int i = 0;
        int n = 0;
        while (true) {
            while (i < length) {
                if (n != 64) {
                    final int codePoint = a.codePointAt(i);
                    if ((Character.isISOControl(codePoint) || codePoint == 10 || codePoint == 13) && codePoint != 65533) {
                        ++n;
                        i += Character.charCount(codePoint);
                        continue;
                    }
                    i = -1;
                }
                if (i != -1) {
                    final String replace = a.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
                    StringBuilder sb;
                    String s;
                    if (i < a.length()) {
                        sb = new StringBuilder("[size=");
                        sb.append(this.c.length);
                        sb.append(" text=");
                        sb.append(replace);
                        s = "\u2026]";
                    }
                    else {
                        sb = new StringBuilder("[text=");
                        sb.append(replace);
                        s = "]";
                    }
                    sb.append(s);
                    return sb.toString();
                }
                if (this.c.length <= 64) {
                    final StringBuilder sb2 = new StringBuilder("[hex=");
                    sb2.append(this.e());
                    sb2.append("]");
                    return sb2.toString();
                }
                final StringBuilder sb3 = new StringBuilder("[size=");
                sb3.append(this.c.length);
                sb3.append(" hex=");
                sb3.append(this.a(0, 64).e());
                sb3.append("\u2026]");
                return sb3.toString();
            }
            i = a.length();
            continue;
        }
    }
}
