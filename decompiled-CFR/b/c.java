/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import b.d;
import b.e;
import b.f;
import b.n;
import b.o;
import b.p;
import b.r;
import b.s;
import b.t;
import java.io.EOFException;
import java.nio.charset.Charset;

public final class c
implements d,
e,
Cloneable {
    private static final byte[] c = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    n a;
    public long b;

    private String a(long l2, Charset object) {
        t.a(this.b, 0L, l2);
        if (object == null) throw new IllegalArgumentException("charset == null");
        if (l2 > Integer.MAX_VALUE) throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(l2)));
        if (l2 == 0L) {
            return "";
        }
        n n2 = this.a;
        if ((long)n2.b + l2 > (long)n2.c) {
            return new String(this.e(l2), (Charset)object);
        }
        object = new String(n2.a, n2.b, (int)l2, (Charset)object);
        n2.b = (int)((long)n2.b + l2);
        this.b -= l2;
        if (n2.b != n2.c) return object;
        this.a = n2.a();
        o.a(n2);
        return object;
    }

    private void c(byte[] arrby) {
        int n2 = 0;
        while (n2 < arrby.length) {
            int n3 = arrby.length - n2;
            t.a(arrby.length, n2, n3);
            n n4 = this.a;
            if (n4 == null) {
                n3 = -1;
            } else {
                int n5 = Math.min(n3, n4.c - n4.b);
                System.arraycopy(n4.a, n4.b, arrby, n2, n5);
                n4.b += n5;
                this.b -= (long)n5;
                n3 = n5;
                if (n4.b == n4.c) {
                    this.a = n4.a();
                    o.a(n4);
                    n3 = n5;
                }
            }
            if (n3 == -1) throw new EOFException();
            n2 += n3;
        }
    }

    private String k(long l2) {
        return this.a(l2, t.a);
    }

    public final long a(byte by, long l2) {
        long l3;
        long l4;
        long l5 = 0L;
        if (l2 < 0L) throw new IllegalArgumentException("fromIndex < 0");
        Object object = this.a;
        if (object == null) {
            return -1L;
        }
        byte[] arrby = object;
        if (this.b - l2 < l2) {
            l3 = this.b;
            arrby = object;
            do {
                l5 = l3;
                object = arrby;
                l4 = l2;
                if (l3 > l2) {
                    arrby = arrby.g;
                    l3 -= (long)(arrby.c - arrby.b);
                    continue;
                }
                break;
            } while (true);
        } else {
            do {
                l3 = (long)(arrby.c - arrby.b) + l5;
                object = arrby;
                l4 = l2;
                if (l3 >= l2) break;
                arrby = arrby.f;
                l5 = l3;
            } while (true);
        }
        while (l5 < this.b) {
            arrby = object.a;
            int n2 = object.c;
            for (int i2 = (int)((long)object.b + l4 - l5); i2 < n2; ++i2) {
                if (arrby[i2] != by) continue;
                return (long)(i2 - object.b) + l5;
            }
            l4 = (long)(object.c - object.b) + l5;
            object = object.f;
            l5 = l4;
        }
        return -1L;
    }

    @Override
    public final long a(c c2, long l2) {
        if (c2 == null) throw new IllegalArgumentException("sink == null");
        if (l2 < 0L) throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(l2)));
        if (this.b == 0L) {
            return -1L;
        }
        long l3 = l2;
        if (l2 > this.b) {
            l3 = this.b;
        }
        c2.a_(this, l3);
        return l3;
    }

    public final long a(r r2) {
        long l2;
        if (r2 == null) throw new IllegalArgumentException("source == null");
        long l3 = 0L;
        while ((l2 = r2.a(this, 8192L)) != -1L) {
            l3 += l2;
        }
        return l3;
    }

    public final c a(int n2) {
        if (n2 < 128) {
            this.b(n2);
            return this;
        }
        if (n2 < 2048) {
            this.b(n2 >> 6 | 192);
            this.b(n2 & 63 | 128);
            return this;
        }
        if (n2 < 65536) {
            if (n2 >= 55296 && n2 <= 57343) {
                StringBuilder stringBuilder = new StringBuilder("Unexpected code point: ");
                stringBuilder.append(Integer.toHexString(n2));
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.b(n2 >> 12 | 224);
            this.b(n2 >> 6 & 63 | 128);
            this.b(n2 & 63 | 128);
            return this;
        }
        if (n2 <= 1114111) {
            this.b(n2 >> 18 | 240);
            this.b(n2 >> 12 & 63 | 128);
            this.b(n2 >> 6 & 63 | 128);
            this.b(n2 & 63 | 128);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder("Unexpected code point: ");
        stringBuilder.append(Integer.toHexString(n2));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final c a(c c2, long l2, long l3) {
        long l4;
        long l5;
        n n2;
        if (c2 == null) throw new IllegalArgumentException("out == null");
        t.a(this.b, l2, l3);
        if (l3 == 0L) {
            return this;
        }
        c2.b += l3;
        n n3 = this.a;
        do {
            n2 = n3;
            l5 = l2;
            l4 = l3;
            if (l2 < (long)(n3.c - n3.b)) break;
            l2 -= (long)(n3.c - n3.b);
            n3 = n3.f;
        } while (true);
        while (l4 > 0L) {
            n3 = new n(n2);
            n3.b = (int)((long)n3.b + l5);
            n3.c = Math.min(n3.b + (int)l4, n3.c);
            if (c2.a == null) {
                n3.g = n3;
                n3.f = n3;
                c2.a = n3;
            } else {
                c2.a.g.a(n3);
            }
            l4 -= (long)(n3.c - n3.b);
            n2 = n2.f;
            l5 = 0L;
        }
        return this;
    }

    public final c a(f f2) {
        if (f2 == null) throw new IllegalArgumentException("byteString == null");
        f2.a(this);
        return this;
    }

    public final c a(String string) {
        return this.a(string, 0, string.length());
    }

    public final c a(String charSequence, int n2, int n3) {
        if (charSequence == null) throw new IllegalArgumentException("string == null");
        if (n2 < 0) throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(n2)));
        if (n3 < n2) {
            charSequence = new StringBuilder("endIndex < beginIndex: ");
            ((StringBuilder)charSequence).append(n3);
            ((StringBuilder)charSequence).append(" < ");
            ((StringBuilder)charSequence).append(n2);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
        }
        if (n3 > ((String)charSequence).length()) {
            StringBuilder stringBuilder = new StringBuilder("endIndex > string.length: ");
            stringBuilder.append(n3);
            stringBuilder.append(" > ");
            stringBuilder.append(((String)charSequence).length());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        while (n2 < n3) {
            int n4;
            int n5;
            char c2 = ((String)charSequence).charAt(n2);
            if (c2 < '?') {
                n n6 = this.e(1);
                byte[] arrby = n6.a;
                n5 = n6.c - n2;
                int n7 = Math.min(n3, 8192 - n5);
                n4 = n2 + 1;
                arrby[n2 + n5] = (byte)c2;
                n2 = n4;
                while (n2 < n7 && (c2 = ((String)charSequence).charAt(n2)) < '?') {
                    n4 = n2 + 1;
                    arrby[n2 + n5] = (byte)c2;
                    n2 = n4;
                }
                n4 = n5 + n2 - n6.c;
                n6.c += n4;
                this.b += (long)n4;
                continue;
            }
            if (c2 < '\u0800') {
                this.b(c2 >> 6 | 192);
                this.b(c2 & 63 | 128);
                ++n2;
                continue;
            }
            if (c2 >= '\ud800' && c2 <= '\udfff') {
                n5 = n2 + 1;
                n4 = n5 < n3 ? ((String)charSequence).charAt(n5) : 0;
                if (c2 <= '\udbff' && n4 >= 56320 && n4 <= 57343) {
                    n4 = ((c2 & -55297) << 10 | -56321 & n4) + 65536;
                    this.b(n4 >> 18 | 240);
                    this.b(n4 >> 12 & 63 | 128);
                    this.b(n4 >> 6 & 63 | 128);
                    this.b(n4 & 63 | 128);
                    n2 += 2;
                    continue;
                }
                this.b(63);
                n2 = n5;
                continue;
            }
            this.b(c2 >> 12 | 224);
            this.b(c2 >> 6 & 63 | 128);
            this.b(c2 & 63 | 128);
            ++n2;
        }
        return this;
    }

    public final c a(byte[] arrby) {
        if (arrby == null) throw new IllegalArgumentException("source == null");
        return this.a(arrby, 0, arrby.length);
    }

    public final c a(byte[] arrby, int n2, int n3) {
        if (arrby == null) throw new IllegalArgumentException("source == null");
        long l2 = arrby.length;
        long l3 = n2;
        long l4 = n3;
        t.a(l2, l3, l4);
        n3 += n2;
        do {
            if (n2 >= n3) {
                this.b += l4;
                return this;
            }
            n n4 = this.e(1);
            int n5 = Math.min(n3 - n2, 8192 - n4.c);
            System.arraycopy(arrby, n2, n4.a, n4.c, n5);
            n2 += n5;
            n4.c += n5;
        } while (true);
    }

    @Override
    public final s a() {
        return s.b;
    }

    @Override
    public final String a(Charset object) {
        try {
            return this.a(this.b, (Charset)object);
        }
        catch (EOFException eOFException) {
            throw new AssertionError(eOFException);
        }
    }

    @Override
    public final void a(long l2) {
        if (this.b < l2) throw new EOFException();
    }

    @Override
    public final void a_(c c2, long l2) {
        if (c2 == null) throw new IllegalArgumentException("source == null");
        if (c2 == this) throw new IllegalArgumentException("source == this");
        t.a(c2.b, 0L, l2);
        while (l2 > 0L) {
            n n2;
            int n3;
            n n4;
            long l3 = c2.a.c - c2.a.b;
            int n5 = 0;
            if (l2 < l3) {
                n4 = this.a != null ? this.a.g : null;
                if (n4 != null && n4.e && (l3 = (long)n4.c) + l2 - (long)(n3 = n4.d ? 0 : n4.b) <= 8192L) {
                    c2.a.a(n4, (int)l2);
                    c2.b -= l2;
                    this.b += l2;
                    return;
                }
                n2 = c2.a;
                n3 = (int)l2;
                if (n3 <= 0) throw new IllegalArgumentException();
                if (n3 > n2.c - n2.b) throw new IllegalArgumentException();
                if (n3 >= 1024) {
                    n4 = new n(n2);
                } else {
                    n4 = o.a();
                    System.arraycopy(n2.a, n2.b, n4.a, 0, n3);
                }
                n4.c = n4.b + n3;
                n2.b += n3;
                n2.g.a(n4);
                c2.a = n4;
            }
            n4 = c2.a;
            l3 = n4.c - n4.b;
            c2.a = n4.a();
            if (this.a == null) {
                n n6;
                n4 = this.a = n4;
                n2 = this.a;
                n2.g = n6 = this.a;
                n4.f = n6;
            } else {
                int n7;
                int n8;
                if (n4.g == (n4 = this.a.g.a(n4))) throw new IllegalStateException();
                if (n4.g.e && (n8 = n4.c - n4.b) <= 8192 - (n7 = n4.g.c) + (n3 = n4.g.d ? n5 : n4.g.b)) {
                    n4.a(n4.g, n8);
                    n4.a();
                    o.a(n4);
                }
            }
            c2.b -= l3;
            this.b += l3;
            l2 -= l3;
        }
    }

    public final byte b(long l2) {
        t.a(this.b, l2, 1L);
        n n2 = this.a;
        long l3;
        while (l2 >= (l3 = (long)(n2.c - n2.b))) {
            l2 -= l3;
            n2 = n2.f;
        }
        return n2.a[n2.b + (int)l2];
    }

    @Override
    public final c b() {
        return this;
    }

    public final c b(int n2) {
        n n3 = this.e(1);
        byte[] arrby = n3.a;
        int n4 = n3.c;
        n3.c = n4 + 1;
        arrby[n4] = (byte)n2;
        ++this.b;
        return this;
    }

    @Override
    public final /* synthetic */ d b(String string) {
        return this.a(string);
    }

    @Override
    public final /* synthetic */ d b(byte[] arrby) {
        return this.a(arrby);
    }

    @Override
    public final /* synthetic */ d b(byte[] arrby, int n2, int n3) {
        return this.a(arrby, n2, n3);
    }

    @Override
    public final boolean b(f f2) {
        int n2 = f2.g();
        if (n2 < 0) return false;
        if (this.b - 0L < (long)n2) return false;
        if (f2.g() - 0 < n2) {
            return false;
        }
        int n3 = 0;
        while (n3 < n2) {
            if (this.b((long)n3 + 0L) != f2.a(n3 + 0)) {
                return false;
            }
            ++n3;
        }
        return true;
    }

    public final c c(int n2) {
        n n3 = this.e(2);
        byte[] arrby = n3.a;
        int n4 = n3.c;
        int n5 = n4 + 1;
        arrby[n4] = (byte)(n2 >>> 8 & 255);
        arrby[n5] = (byte)(n2 & 255);
        n3.c = n5 + 1;
        this.b += 2L;
        return this;
    }

    @Override
    public final f c(long l2) {
        return new f(this.e(l2));
    }

    @Override
    public final boolean c() {
        if (this.b != 0L) return false;
        return true;
    }

    public final /* synthetic */ Object clone() {
        n n2;
        c c2 = new c();
        if (this.b == 0L) {
            return c2;
        }
        n n3 = c2.a = new n(this.a);
        n n4 = c2.a;
        n4.g = n2 = c2.a;
        n3.f = n2;
        n3 = this.a;
        do {
            if ((n3 = n3.f) == this.a) {
                c2.b = this.b;
                return c2;
            }
            c2.a.g.a(new n(n3));
        } while (true);
    }

    @Override
    public final void close() {
    }

    public final long d() {
        long l2 = this.b;
        if (l2 == 0L) {
            return 0L;
        }
        n n2 = this.a.g;
        long l3 = l2;
        if (n2.c >= 8192) return l3;
        l3 = l2;
        if (!n2.e) return l3;
        return l2 - (long)(n2.c - n2.b);
    }

    public final c d(int n2) {
        n n3 = this.e(4);
        byte[] arrby = n3.a;
        int n4 = n3.c;
        int n5 = n4 + 1;
        arrby[n4] = (byte)(n2 >>> 24 & 255);
        n4 = n5 + 1;
        arrby[n5] = (byte)(n2 >>> 16 & 255);
        n5 = n4 + 1;
        arrby[n4] = (byte)(n2 >>> 8 & 255);
        arrby[n5] = (byte)(n2 & 255);
        n3.c = n5 + 1;
        this.b += 4L;
        return this;
    }

    final String d(long l2) {
        long l3;
        if (l2 > 0L && this.b(l3 = l2 - 1L) == 13) {
            String string = this.k(l3);
            this.f(2L);
            return string;
        }
        String string = this.k(l2);
        this.f(1L);
        return string;
    }

    @Override
    public final byte e() {
        if (this.b == 0L) throw new IllegalStateException("size == 0");
        n n2 = this.a;
        int n3 = n2.b;
        int n4 = n2.c;
        byte[] arrby = n2.a;
        int n5 = n3 + 1;
        byte by = arrby[n3];
        --this.b;
        if (n5 == n4) {
            this.a = n2.a();
            o.a(n2);
            return by;
        }
        n2.b = n5;
        return by;
    }

    final n e(int n2) {
        if (n2 <= 0) throw new IllegalArgumentException();
        if (n2 > 8192) throw new IllegalArgumentException();
        if (this.a == null) {
            n n3;
            n n4 = this.a = o.a();
            n n5 = this.a;
            n5.g = n3 = this.a;
            n4.f = n3;
            return n3;
        }
        n n6 = this.a.g;
        if (n6.c + n2 > 8192) return n6.a(o.a());
        n n7 = n6;
        if (n6.e) return n7;
        return n6.a(o.a());
    }

    @Override
    public final byte[] e(long l2) {
        t.a(this.b, 0L, l2);
        if (l2 > Integer.MAX_VALUE) throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(l2)));
        byte[] arrby = new byte[(int)l2];
        this.c(arrby);
        return arrby;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        if (this.b != ((c)object).b) {
            return false;
        }
        long l2 = this.b;
        long l3 = 0L;
        if (l2 == 0L) {
            return true;
        }
        n n2 = this.a;
        object = ((c)object).a;
        int n3 = n2.b;
        int n4 = ((n)object).b;
        while (l3 < this.b) {
            l2 = Math.min(n2.c - n3, ((n)object).c - n4);
            int n5 = 0;
            while ((long)n5 < l2) {
                if (n2.a[n3] != ((n)object).a[n4]) {
                    return false;
                }
                ++n5;
                ++n3;
                ++n4;
            }
            if (n3 == n2.c) {
                n2 = n2.f;
                n3 = n2.b;
            }
            if (n4 == ((n)object).c) {
                object = ((n)object).f;
                n4 = ((n)object).b;
            }
            l3 += l2;
        }
        return true;
    }

    @Override
    public final /* synthetic */ d f(int n2) {
        return this.d(n2);
    }

    @Override
    public final short f() {
        if (this.b < 2L) {
            StringBuilder stringBuilder = new StringBuilder("size < 2: ");
            stringBuilder.append(this.b);
            throw new IllegalStateException(stringBuilder.toString());
        }
        n n2 = this.a;
        int n3 = n2.c;
        int n4 = n2.b;
        if (n3 - n4 < 2) {
            return (short)((this.e() & 255) << 8 | this.e() & 255);
        }
        byte[] arrby = n2.a;
        int n5 = n4 + 1;
        n4 = arrby[n4];
        int n6 = n5 + 1;
        n5 = arrby[n5];
        this.b -= 2L;
        if (n6 == n3) {
            this.a = n2.a();
            o.a(n2);
            return (short)((n4 & 255) << 8 | n5 & 255);
        }
        n2.b = n6;
        return (short)((n4 & 255) << 8 | n5 & 255);
    }

    @Override
    public final void f(long l2) {
        while (l2 > 0L) {
            if (this.a == null) throw new EOFException();
            int n2 = (int)Math.min(l2, (long)(this.a.c - this.a.b));
            long l3 = this.b;
            long l4 = n2;
            this.b = l3 - l4;
            l3 = l2 - l4;
            n n3 = this.a;
            n3.b += n2;
            l2 = l3;
            if (this.a.b != this.a.c) continue;
            n3 = this.a;
            this.a = n3.a();
            o.a(n3);
            l2 = l3;
        }
    }

    @Override
    public final void flush() {
    }

    @Override
    public final int g() {
        if (this.b < 4L) {
            StringBuilder stringBuilder = new StringBuilder("size < 4: ");
            stringBuilder.append(this.b);
            throw new IllegalStateException(stringBuilder.toString());
        }
        n n2 = this.a;
        int n3 = n2.c;
        int n4 = n2.b;
        if (n3 - n4 < 4) {
            return (this.e() & 255) << 24 | (this.e() & 255) << 16 | (this.e() & 255) << 8 | this.e() & 255;
        }
        byte[] arrby = n2.a;
        int n5 = n4 + 1;
        n4 = arrby[n4];
        int n6 = n5 + 1;
        n5 = arrby[n5];
        int n7 = n6 + 1;
        byte by = arrby[n6];
        n6 = n7 + 1;
        n4 = (n4 & 255) << 24 | (n5 & 255) << 16 | (by & 255) << 8 | arrby[n7] & 255;
        this.b -= 4L;
        if (n6 == n3) {
            this.a = n2.a();
            o.a(n2);
            return n4;
        }
        n2.b = n6;
        return n4;
    }

    public final c g(long l2) {
        if (l2 == 0L) {
            return this.b(48);
        }
        boolean bl = false;
        int n2 = 1;
        long l3 = l2;
        if (l2 < 0L) {
            l3 = -l2;
            if (l3 < 0L) {
                return this.a("-9223372036854775808");
            }
            bl = true;
        }
        if (l3 < 100000000L) {
            if (l3 < 10000L) {
                if (l3 < 100L) {
                    if (l3 >= 10L) {
                        n2 = 2;
                    }
                } else {
                    n2 = l3 < 1000L ? 3 : 4;
                }
            } else {
                n2 = l3 < 1000000L ? (l3 < 100000L ? 5 : 6) : (l3 < 10000000L ? 7 : 8);
            }
        } else {
            n2 = l3 < 1000000000000L ? (l3 < 10000000000L ? (l3 < 1000000000L ? 9 : 10) : (l3 < 100000000000L ? 11 : 12)) : (l3 < 1000000000000000L ? (l3 < 10000000000000L ? 13 : (l3 < 100000000000000L ? 14 : 15)) : (l3 < 100000000000000000L ? (l3 < 10000000000000000L ? 16 : 17) : (l3 < 1000000000000000000L ? 18 : 19)));
        }
        int n3 = n2;
        if (bl) {
            n3 = n2 + 1;
        }
        n n4 = this.e(n3);
        byte[] arrby = n4.a;
        n2 = n4.c + n3;
        while (l3 != 0L) {
            int n5 = (int)(l3 % 10L);
            arrby[--n2] = c[n5];
            l3 /= 10L;
        }
        if (bl) {
            arrby[n2 - 1] = 45;
        }
        n4.c += n3;
        this.b += (long)n3;
        return this;
    }

    @Override
    public final /* synthetic */ d g(int n2) {
        return this.c(n2);
    }

    public final c h(long l2) {
        if (l2 == 0L) {
            return this.b(48);
        }
        int n2 = Long.numberOfTrailingZeros(Long.highestOneBit(l2)) / 4 + 1;
        n n3 = this.e(n2);
        byte[] arrby = n3.a;
        int n4 = n3.c + n2 - 1;
        int n5 = n3.c;
        do {
            if (n4 < n5) {
                n3.c += n2;
                this.b += (long)n2;
                return this;
            }
            arrby[n4] = c[(int)(15L & l2)];
            l2 >>>= 4;
            --n4;
        } while (true);
    }

    @Override
    public final /* synthetic */ d h(int n2) {
        return this.b(n2);
    }

    @Override
    public final short h() {
        return t.a(this.f());
    }

    public final int hashCode() {
        n n2;
        int n3;
        n n4 = this.a;
        if (n4 == null) {
            return 0;
        }
        int n5 = 1;
        do {
            int n6 = n4.c;
            n3 = n5;
            for (int i2 = n4.b; i2 < n6; ++i2) {
                n3 = n3 * 31 + n4.a[i2];
            }
            n4 = n2 = n4.f;
            n5 = n3;
        } while (n2 != this.a);
        return n3;
    }

    @Override
    public final int i() {
        return t.a(this.g());
    }

    @Override
    public final /* synthetic */ d i(long l2) {
        return this.h(l2);
    }

    @Override
    public final long j() {
        int n2;
        long l2;
        if (this.b == 0L) throw new IllegalStateException("size == 0");
        int n3 = 0;
        long l3 = 0L;
        byte by = 0;
        do {
            int n4;
            byte by2;
            int n5;
            Object object;
            block10 : {
                object = this.a;
                Object object2 = ((n)object).a;
                n5 = ((n)object).b;
                n4 = ((n)object).c;
                l2 = l3;
                n2 = n3;
                do {
                    by2 = by;
                    if (n5 >= n4) break block10;
                    by2 = object2[n5];
                    if (by2 >= 48 && by2 <= 57) {
                        n3 = by2 - 48;
                    } else if (by2 >= 97 && by2 <= 102) {
                        n3 = by2 - 97 + 10;
                    } else {
                        if (by2 < 65 || by2 > 70) break;
                        n3 = by2 - 65 + 10;
                    }
                    if ((-1152921504606846976L & l2) != 0L) {
                        object = new c().h(l2).b(by2);
                        object2 = new StringBuilder("Number too large: ");
                        ((StringBuilder)object2).append(((c)object).l());
                        throw new NumberFormatException(((StringBuilder)object2).toString());
                    }
                    l2 = l2 << 4 | (long)n3;
                    ++n5;
                    ++n2;
                } while (true);
                if (n2 == 0) {
                    object = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                    ((StringBuilder)object).append(Integer.toHexString(by2));
                    throw new NumberFormatException(((StringBuilder)object).toString());
                }
                by2 = 1;
            }
            if (n5 == n4) {
                this.a = ((n)object).a();
                o.a((n)object);
            } else {
                ((n)object).b = n5;
            }
            if (by2 != 0) break;
            n3 = n2;
            by = by2;
            l3 = l2;
        } while (this.a != null);
        this.b -= (long)n2;
        return l2;
    }

    @Override
    public final /* synthetic */ d j(long l2) {
        return this.g(l2);
    }

    public final f k() {
        return new f(this.n());
    }

    public final String l() {
        try {
            return this.a(this.b, t.a);
        }
        catch (EOFException eOFException) {
            throw new AssertionError(eOFException);
        }
    }

    @Override
    public final String m() {
        long l2 = this.a((byte)10, 0L);
        if (l2 != -1L) {
            return this.d(l2);
        }
        c c2 = new c();
        this.a(c2, 0L, Math.min(32L, this.b));
        StringBuilder stringBuilder = new StringBuilder("\\n not found: size=");
        stringBuilder.append(this.b);
        stringBuilder.append(" content=");
        stringBuilder.append(c2.k().e());
        stringBuilder.append("\u2026");
        throw new EOFException(stringBuilder.toString());
    }

    public final byte[] n() {
        try {
            return this.e(this.b);
        }
        catch (EOFException eOFException) {
            throw new AssertionError(eOFException);
        }
    }

    public final void o() {
        try {
            this.f(this.b);
            return;
        }
        catch (EOFException eOFException) {
            throw new AssertionError(eOFException);
        }
    }

    @Override
    public final long p() {
        return this.a((byte)0, 0L);
    }

    public final String toString() {
        f f2;
        if (this.b > Integer.MAX_VALUE) {
            StringBuilder stringBuilder = new StringBuilder("size > Integer.MAX_VALUE: ");
            stringBuilder.append(this.b);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int n2 = (int)this.b;
        if (n2 == 0) {
            f2 = f.b;
            return f2.toString();
        }
        f2 = new p(this, n2);
        return f2.toString();
    }
}

