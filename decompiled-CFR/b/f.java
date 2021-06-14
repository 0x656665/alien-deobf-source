/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import b.b;
import b.c;
import b.t;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class f
implements Serializable,
Comparable<f> {
    static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final f b = f.a(new byte[0]);
    final byte[] c;
    transient int d;
    transient String e;

    f(byte[] arrby) {
        this.c = arrby;
    }

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - 48;
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 97 + 10;
        }
        if (c2 < 'A') throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c2)));
        if (c2 > 'F') throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c2)));
        return c2 - 65 + 10;
    }

    public static f a(String string) {
        if (string == null) throw new IllegalArgumentException("s == null");
        f f2 = new f(string.getBytes(t.a));
        f2.e = string;
        return f2;
    }

    public static f a(byte ... arrby) {
        if (arrby == null) throw new IllegalArgumentException("data == null");
        return new f((byte[])arrby.clone());
    }

    public static f b(String string) {
        if (string.length() % 2 != 0) throw new IllegalArgumentException("Unexpected hex string: ".concat(String.valueOf(string)));
        byte[] arrby = new byte[string.length() / 2];
        int n2 = 0;
        while (n2 < arrby.length) {
            int n3 = n2 * 2;
            arrby[n2] = (byte)((f.a(string.charAt(n3)) << 4) + f.a(string.charAt(n3 + 1)));
            ++n2;
        }
        return f.a(arrby);
    }

    private f c(String object) {
        try {
            return f.a(MessageDigest.getInstance((String)object).digest(this.c));
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new AssertionError(noSuchAlgorithmException);
        }
    }

    public byte a(int n2) {
        return this.c[n2];
    }

    public f a(int n2, int n3) {
        if (n2 < 0) throw new IllegalArgumentException("beginIndex < 0");
        if (n3 > this.c.length) {
            StringBuilder stringBuilder = new StringBuilder("endIndex > length(");
            stringBuilder.append(this.c.length);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int n4 = n3 - n2;
        if (n4 < 0) throw new IllegalArgumentException("endIndex < beginIndex");
        if (n2 == 0 && n3 == this.c.length) {
            return this;
        }
        byte[] arrby = new byte[n4];
        System.arraycopy(this.c, n2, arrby, 0, n4);
        return new f(arrby);
    }

    public String a() {
        String string = this.e;
        if (string != null) {
            return string;
        }
        this.e = string = new String(this.c, t.a);
        return string;
    }

    void a(c c2) {
        c2.a(this.c, 0, this.c.length);
    }

    public boolean a(int n2, f f2, int n3, int n4) {
        return f2.a(0, this.c, 0, n4);
    }

    public boolean a(int n2, byte[] arrby, int n3, int n4) {
        if (n2 < 0) return false;
        if (n2 > this.c.length - n4) return false;
        if (n3 < 0) return false;
        if (n3 > arrby.length - n4) return false;
        if (!t.a(this.c, n2, arrby, n3, n4)) return false;
        return true;
    }

    public String b() {
        return b.a(this.c);
    }

    public f c() {
        return this.c("SHA-1");
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        object = (f)object;
        int n2 = this.g();
        int n3 = ((f)object).g();
        int n4 = Math.min(n2, n3);
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5;
            int n6 = this.a(i2) & 255;
            if (n6 == (n5 = ((f)object).a(i2) & 255)) continue;
            if (n6 >= n5) return 1;
            return -1;
        }
        if (n2 == n3) {
            return 0;
        }
        if (n2 >= n3) return 1;
        return -1;
    }

    public f d() {
        return this.c("SHA-256");
    }

    public String e() {
        char[] arrc = new char[this.c.length * 2];
        byte[] arrby = this.c;
        int n2 = arrby.length;
        int n3 = 0;
        int n4 = 0;
        while (n3 < n2) {
            byte by = arrby[n3];
            int n5 = n4 + 1;
            arrc[n4] = a[by >> 4 & 15];
            n4 = n5 + 1;
            arrc[n5] = a[by & 15];
            ++n3;
        }
        return new String(arrc);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof f)) return false;
        if (((f)(object = (f)object)).g() != this.c.length) return false;
        if (!((f)object).a(0, this.c, 0, this.c.length)) return false;
        return true;
    }

    public f f() {
        int n2 = 0;
        while (n2 < this.c.length) {
            byte by = this.c[n2];
            if (by >= 65 && by <= 90) {
                byte[] arrby = (byte[])this.c.clone();
                int n3 = n2 + 1;
                arrby[n2] = (byte)(by + 32);
                n2 = n3;
                while (n2 < arrby.length) {
                    n3 = arrby[n2];
                    if (n3 >= 65 && n3 <= 90) {
                        arrby[n2] = (byte)(n3 + 32);
                    }
                    ++n2;
                }
                return new f(arrby);
            }
            ++n2;
        }
        return this;
    }

    public int g() {
        return this.c.length;
    }

    public byte[] h() {
        return (byte[])this.c.clone();
    }

    public int hashCode() {
        int n2 = this.d;
        if (n2 != 0) {
            return n2;
        }
        this.d = n2 = Arrays.hashCode(this.c);
        return n2;
    }

    public String toString() {
        int n2;
        CharSequence charSequence;
        block7 : {
            int n3;
            if (this.c.length == 0) {
                return "[size=0]";
            }
            charSequence = this.a();
            int n4 = ((String)charSequence).length();
            int n5 = 0;
            for (n2 = 0; n2 < n4; ++n5, n2 += Character.charCount((int)n3)) {
                if (n5 != 64) {
                    n3 = ((String)charSequence).codePointAt(n2);
                    if ((!Character.isISOControl(n3) || n3 == 10 || n3 == 13) && n3 != 65533) continue;
                    n2 = -1;
                }
                break block7;
            }
            n2 = ((String)charSequence).length();
        }
        if (n2 == -1) {
            if (this.c.length <= 64) {
                charSequence = new StringBuilder("[hex=");
                ((StringBuilder)charSequence).append(this.e());
                ((StringBuilder)charSequence).append("]");
                return ((StringBuilder)charSequence).toString();
            }
            charSequence = new StringBuilder("[size=");
            ((StringBuilder)charSequence).append(this.c.length);
            ((StringBuilder)charSequence).append(" hex=");
            ((StringBuilder)charSequence).append(this.a(0, 64).e());
            ((StringBuilder)charSequence).append("\u2026]");
            return ((StringBuilder)charSequence).toString();
        }
        String string = ((String)charSequence).substring(0, n2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (n2 < ((String)charSequence).length()) {
            charSequence = new StringBuilder("[size=");
            ((StringBuilder)charSequence).append(this.c.length);
            ((StringBuilder)charSequence).append(" text=");
            ((StringBuilder)charSequence).append(string);
            string = "\u2026]";
        } else {
            charSequence = new StringBuilder("[text=");
            ((StringBuilder)charSequence).append(string);
            string = "]";
        }
        ((StringBuilder)charSequence).append(string);
        return ((StringBuilder)charSequence).toString();
    }
}

