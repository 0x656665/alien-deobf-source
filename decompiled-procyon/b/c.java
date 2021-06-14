package b;

import java.nio.charset.*;
import java.io.*;

public final class c implements d, e, Cloneable
{
    private static final byte[] c;
    n a;
    public long b;
    
    static {
        c = new byte[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    }
    
    public c() {
        super();
    }
    
    private String a(final long n, final Charset charset) {
        t.a(this.b, 0L, n);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (n > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(n)));
        }
        if (n == 0L) {
            return "";
        }
        final n a = this.a;
        if (a.b + n > a.c) {
            return new String(this.e(n), charset);
        }
        final String s = new String(a.a, a.b, (int)n, charset);
        a.b += (int)n;
        this.b -= n;
        if (a.b == a.c) {
            this.a = a.a();
            o.a(a);
        }
        return s;
    }
    
    private void c(final byte[] array) {
        int n2;
        for (int i = 0; i < array.length; i += n2) {
            final int n = array.length - i;
            t.a(array.length, i, n);
            final n a = this.a;
            if (a == null) {
                n2 = -1;
            }
            else {
                final int min = Math.min(n, a.c - a.b);
                System.arraycopy(a.a, a.b, array, i, min);
                a.b += min;
                this.b -= min;
                n2 = min;
                if (a.b == a.c) {
                    this.a = a.a();
                    o.a(a);
                    n2 = min;
                }
            }
            if (n2 == -1) {
                throw new EOFException();
            }
        }
    }
    
    private String k(final long n) {
        return this.a(n, t.a);
    }
    
    public final long a(final byte b, final long n) {
        long n2 = 0L;
        if (n < 0L) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        final n a = this.a;
        if (a == null) {
            return -1L;
        }
        n f = a;
        n f2;
        long n3;
        if (this.b - n < n) {
            long b2 = this.b;
            n g = a;
            while (true) {
                n2 = b2;
                f2 = g;
                n3 = n;
                if (b2 <= n) {
                    break;
                }
                g = g.g;
                b2 -= g.c - g.b;
            }
        }
        else {
            while (true) {
                final long n4 = f.c - f.b + n2;
                f2 = f;
                n3 = n;
                if (n4 >= n) {
                    break;
                }
                f = f.f;
                n2 = n4;
            }
        }
        while (n2 < this.b) {
            final byte[] a2 = f2.a;
            for (int i = (int)(f2.b + n3 - n2); i < f2.c; ++i) {
                if (a2[i] == b) {
                    return i - f2.b + n2;
                }
            }
            n3 = f2.c - f2.b + n2;
            f2 = f2.f;
            n2 = n3;
        }
        return -1L;
    }
    
    @Override
    public final long a(final c c, final long n) {
        if (c == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(n)));
        }
        if (this.b == 0L) {
            return -1L;
        }
        long b = n;
        if (n > this.b) {
            b = this.b;
        }
        c.a_(this, b);
        return b;
    }
    
    public final long a(final r r) {
        if (r != null) {
            long n = 0L;
            while (true) {
                final long a = r.a(this, 8192L);
                if (a == -1L) {
                    break;
                }
                n += a;
            }
            return n;
        }
        throw new IllegalArgumentException("source == null");
    }
    
    public final c a(final int n) {
        if (n < 128) {
            this.b(n);
            return this;
        }
        if (n < 2048) {
            this.b(n >> 6 | 0xC0);
            this.b((n & 0x3F) | 0x80);
            return this;
        }
        if (n < 65536) {
            if (n >= 55296 && n <= 57343) {
                final StringBuilder sb = new StringBuilder("Unexpected code point: ");
                sb.append(Integer.toHexString(n));
                throw new IllegalArgumentException(sb.toString());
            }
            this.b(n >> 12 | 0xE0);
            this.b((n >> 6 & 0x3F) | 0x80);
            this.b((n & 0x3F) | 0x80);
            return this;
        }
        else {
            if (n <= 1114111) {
                this.b(n >> 18 | 0xF0);
                this.b((n >> 12 & 0x3F) | 0x80);
                this.b((n >> 6 & 0x3F) | 0x80);
                this.b((n & 0x3F) | 0x80);
                return this;
            }
            final StringBuilder sb2 = new StringBuilder("Unexpected code point: ");
            sb2.append(Integer.toHexString(n));
            throw new IllegalArgumentException(sb2.toString());
        }
    }
    
    public final c a(final c c, long n, final long n2) {
        if (c == null) {
            throw new IllegalArgumentException("out == null");
        }
        t.a(this.b, n, n2);
        if (n2 == 0L) {
            return this;
        }
        c.b += n2;
        n n3 = this.a;
        n f;
        long n4;
        long n5;
        while (true) {
            f = n3;
            n4 = n;
            n5 = n2;
            if (n < n3.c - n3.b) {
                break;
            }
            n -= n3.c - n3.b;
            n3 = n3.f;
        }
        while (n5 > 0L) {
            final n a = new n(f);
            a.b += (int)n4;
            a.c = Math.min(a.b + (int)n5, a.c);
            if (c.a == null) {
                a.g = a;
                a.f = a;
                c.a = a;
            }
            else {
                c.a.g.a(a);
            }
            n5 -= a.c - a.b;
            f = f.f;
            n4 = 0L;
        }
        return this;
    }
    
    public final c a(final f f) {
        if (f != null) {
            f.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }
    
    public final c a(final String s) {
        return this.a(s, 0, s.length());
    }
    
    public final c a(final String s, int i, final int n) {
        if (s == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (n < i) {
            final StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
            sb.append(n);
            sb.append(" < ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n <= s.length()) {
            while (i < n) {
                final char char1 = s.charAt(i);
                if (char1 < '\u0080') {
                    final n e = this.e(1);
                    final byte[] a = e.a;
                    final int n2 = e.c - i;
                    final int min = Math.min(n, 8192 - n2);
                    final int n3 = i + 1;
                    a[i + n2] = (byte)char1;
                    char char2;
                    int n4;
                    for (i = n3; i < min; i = n4) {
                        char2 = s.charAt(i);
                        if (char2 >= '\u0080') {
                            break;
                        }
                        n4 = i + 1;
                        a[i + n2] = (byte)char2;
                    }
                    final int n5 = n2 + i - e.c;
                    e.c += n5;
                    this.b += n5;
                }
                else if (char1 < '\u0800') {
                    this.b(char1 >> 6 | 0xC0);
                    this.b((char1 & '?') | 0x80);
                    ++i;
                }
                else if (char1 >= '\ud800' && char1 <= '\udfff') {
                    final int n6 = i + 1;
                    char char3;
                    if (n6 < n) {
                        char3 = s.charAt(n6);
                    }
                    else {
                        char3 = '\0';
                    }
                    if (char1 <= '\udbff' && char3 >= '\udc00' && char3 <= '\udfff') {
                        final int n7 = ((char1 & 0xFFFF27FF) << 10 | (0xFFFF23FF & char3)) + 65536;
                        this.b(n7 >> 18 | 0xF0);
                        this.b((n7 >> 12 & 0x3F) | 0x80);
                        this.b((n7 >> 6 & 0x3F) | 0x80);
                        this.b((n7 & 0x3F) | 0x80);
                        i += 2;
                    }
                    else {
                        this.b(63);
                        i = n6;
                    }
                }
                else {
                    this.b(char1 >> 12 | 0xE0);
                    this.b((char1 >> 6 & 0x3F) | 0x80);
                    this.b((char1 & '?') | 0x80);
                    ++i;
                }
            }
            return this;
        }
        final StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
        sb2.append(n);
        sb2.append(" > ");
        sb2.append(s.length());
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public final c a(final byte[] array) {
        if (array != null) {
            return this.a(array, 0, array.length);
        }
        throw new IllegalArgumentException("source == null");
    }
    
    public final c a(final byte[] array, int i, int n) {
        if (array != null) {
            final long n2 = array.length;
            final long n3 = i;
            final long n4 = n;
            t.a(n2, n3, n4);
            n e;
            int min;
            for (n += i; i < n; i += min, e.c += min) {
                e = this.e(1);
                min = Math.min(n - i, 8192 - e.c);
                System.arraycopy(array, i, e.a, e.c, min);
            }
            this.b += n4;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }
    
    @Override
    public final s a() {
        return s.b;
    }
    
    @Override
    public final String a(final Charset charset) {
        try {
            return this.a(this.b, charset);
        }
        catch (EOFException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final void a(final long n) {
        if (this.b >= n) {
            return;
        }
        throw new EOFException();
    }
    
    @Override
    public final void a_(final c c, long n) {
        if (c == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c != this) {
            t.a(c.b, 0L, n);
            while (n > 0L) {
                final long n2 = c.a.c - c.a.b;
                final int n3 = 0;
                if (n < n2) {
                    n g;
                    if (this.a != null) {
                        g = this.a.g;
                    }
                    else {
                        g = null;
                    }
                    if (g != null && g.e) {
                        final long n4 = g.c;
                        int b;
                        if (g.d) {
                            b = 0;
                        }
                        else {
                            b = g.b;
                        }
                        if (n4 + n - b <= 8192L) {
                            c.a.a(g, (int)n);
                            c.b -= n;
                            this.b += n;
                            return;
                        }
                    }
                    final n a = c.a;
                    final int n5 = (int)n;
                    if (n5 <= 0 || n5 > a.c - a.b) {
                        throw new IllegalArgumentException();
                    }
                    n a2;
                    if (n5 >= 1024) {
                        a2 = new n(a);
                    }
                    else {
                        a2 = o.a();
                        System.arraycopy(a.a, a.b, a2.a, 0, n5);
                    }
                    a2.c = a2.b + n5;
                    a.b += n5;
                    a.g.a(a2);
                    c.a = a2;
                }
                final n a3 = c.a;
                final long n6 = a3.c - a3.b;
                c.a = a3.a();
                if (this.a == null) {
                    this.a = a3;
                    final n a4 = this.a;
                    final n a5 = this.a;
                    final n a6 = this.a;
                    a5.g = a6;
                    a4.f = a6;
                }
                else {
                    final n a7 = this.a.g.a(a3);
                    if (a7.g == a7) {
                        throw new IllegalStateException();
                    }
                    if (a7.g.e) {
                        final int n7 = a7.c - a7.b;
                        final int c2 = a7.g.c;
                        int b2;
                        if (a7.g.d) {
                            b2 = n3;
                        }
                        else {
                            b2 = a7.g.b;
                        }
                        if (n7 <= 8192 - c2 + b2) {
                            a7.a(a7.g, n7);
                            a7.a();
                            o.a(a7);
                        }
                    }
                }
                c.b -= n6;
                this.b += n6;
                n -= n6;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }
    
    public final byte b(long n) {
        t.a(this.b, n, 1L);
        n n2 = this.a;
        while (true) {
            final long n3 = n2.c - n2.b;
            if (n < n3) {
                break;
            }
            n -= n3;
            n2 = n2.f;
        }
        return n2.a[n2.b + (int)n];
    }
    
    @Override
    public final c b() {
        return this;
    }
    
    public final c b(final int n) {
        final n e = this.e(1);
        e.a[e.c++] = (byte)n;
        ++this.b;
        return this;
    }
    
    @Override
    public final /* synthetic */ d b(final String s) {
        return this.a(s);
    }
    
    @Override
    public final /* synthetic */ d b(final byte[] array) {
        return this.a(array);
    }
    
    @Override
    public final /* synthetic */ d b(final byte[] array, final int n, final int n2) {
        return this.a(array, n, n2);
    }
    
    @Override
    public final boolean b(final f f) {
        final int g = f.g();
        if (g < 0 || this.b - 0L < g) {
            return false;
        }
        if (f.g() - 0 < g) {
            return false;
        }
        for (int i = 0; i < g; ++i) {
            if (this.b(i + 0L) != f.a(i + 0)) {
                return false;
            }
        }
        return true;
    }
    
    public final c c(final int n) {
        final n e = this.e(2);
        final byte[] a = e.a;
        final int c = e.c;
        final int n2 = c + 1;
        a[c] = (byte)(n >>> 8 & 0xFF);
        a[n2] = (byte)(n & 0xFF);
        e.c = n2 + 1;
        this.b += 2L;
        return this;
    }
    
    @Override
    public final f c(final long n) {
        return new f(this.e(n));
    }
    
    @Override
    public final boolean c() {
        return this.b == 0L;
    }
    
    public final /* synthetic */ Object clone() {
        final c c = new c();
        if (this.b == 0L) {
            return c;
        }
        c.a = new n(this.a);
        final n a = c.a;
        final n a2 = c.a;
        final n a3 = c.a;
        a2.g = a3;
        a.f = a3;
        n n = this.a;
        while (true) {
            n = n.f;
            if (n == this.a) {
                break;
            }
            c.a.g.a(new n(n));
        }
        c.b = this.b;
        return c;
    }
    
    @Override
    public final void close() {
    }
    
    public final long d() {
        final long b = this.b;
        if (b == 0L) {
            return 0L;
        }
        final n g = this.a.g;
        long n = b;
        if (g.c < 8192) {
            n = b;
            if (g.e) {
                n = b - (g.c - g.b);
            }
        }
        return n;
    }
    
    public final c d(final int n) {
        final n e = this.e(4);
        final byte[] a = e.a;
        final int c = e.c;
        final int n2 = c + 1;
        a[c] = (byte)(n >>> 24 & 0xFF);
        final int n3 = n2 + 1;
        a[n2] = (byte)(n >>> 16 & 0xFF);
        final int n4 = n3 + 1;
        a[n3] = (byte)(n >>> 8 & 0xFF);
        a[n4] = (byte)(n & 0xFF);
        e.c = n4 + 1;
        this.b += 4L;
        return this;
    }
    
    final String d(final long n) {
        if (n > 0L) {
            final long n2 = n - 1L;
            if (this.b(n2) == 13) {
                final String k = this.k(n2);
                this.f(2L);
                return k;
            }
        }
        final String i = this.k(n);
        this.f(1L);
        return i;
    }
    
    @Override
    public final byte e() {
        if (this.b == 0L) {
            throw new IllegalStateException("size == 0");
        }
        final n a = this.a;
        final int b = a.b;
        final int c = a.c;
        final byte[] a2 = a.a;
        final int b2 = b + 1;
        final byte b3 = a2[b];
        --this.b;
        if (b2 == c) {
            this.a = a.a();
            o.a(a);
            return b3;
        }
        a.b = b2;
        return b3;
    }
    
    final n e(final int n) {
        if (n <= 0 || n > 8192) {
            throw new IllegalArgumentException();
        }
        if (this.a == null) {
            this.a = o.a();
            final n a = this.a;
            final n a2 = this.a;
            final n a3 = this.a;
            a2.g = a3;
            return a.f = a3;
        }
        final n g = this.a.g;
        if (g.c + n <= 8192) {
            final n a4 = g;
            if (g.e) {
                return a4;
            }
        }
        return g.a(o.a());
    }
    
    @Override
    public final byte[] e(final long n) {
        t.a(this.b, 0L, n);
        if (n <= 2147483647L) {
            final byte[] array = new byte[(int)n];
            this.c(array);
            return array;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(n)));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        if (this.b != c.b) {
            return false;
        }
        final long b = this.b;
        long n = 0L;
        if (b == 0L) {
            return true;
        }
        n n2 = this.a;
        n n3 = c.a;
        int n4 = n2.b;
        int n5 = n3.b;
        while (n < this.b) {
            final long n6 = Math.min(n2.c - n4, n3.c - n5);
            for (int n7 = 0; n7 < n6; ++n7, ++n4, ++n5) {
                if (n2.a[n4] != n3.a[n5]) {
                    return false;
                }
            }
            if (n4 == n2.c) {
                n2 = n2.f;
                n4 = n2.b;
            }
            if (n5 == n3.c) {
                n3 = n3.f;
                n5 = n3.b;
            }
            n += n6;
        }
        return true;
    }
    
    @Override
    public final /* synthetic */ d f(final int n) {
        return this.d(n);
    }
    
    @Override
    public final short f() {
        if (this.b < 2L) {
            final StringBuilder sb = new StringBuilder("size < 2: ");
            sb.append(this.b);
            throw new IllegalStateException(sb.toString());
        }
        final n a = this.a;
        final int b = a.b;
        final int c = a.c;
        if (c - b < 2) {
            return (short)((this.e() & 0xFF) << 8 | (this.e() & 0xFF));
        }
        final byte[] a2 = a.a;
        final int n = b + 1;
        final byte b2 = a2[b];
        final int b3 = n + 1;
        final byte b4 = a2[n];
        this.b -= 2L;
        if (b3 == c) {
            this.a = a.a();
            o.a(a);
        }
        else {
            a.b = b3;
        }
        return (short)((b2 & 0xFF) << 8 | (b4 & 0xFF));
    }
    
    @Override
    public final void f(long n) {
        while (n > 0L) {
            if (this.a == null) {
                throw new EOFException();
            }
            final int n2 = (int)Math.min(n, this.a.c - this.a.b);
            final long b = this.b;
            final long n3 = n2;
            this.b = b - n3;
            final long n4 = n - n3;
            final n a = this.a;
            a.b += n2;
            n = n4;
            if (this.a.b != this.a.c) {
                continue;
            }
            final n a2 = this.a;
            this.a = a2.a();
            o.a(a2);
            n = n4;
        }
    }
    
    @Override
    public final void flush() {
    }
    
    @Override
    public final int g() {
        if (this.b < 4L) {
            final StringBuilder sb = new StringBuilder("size < 4: ");
            sb.append(this.b);
            throw new IllegalStateException(sb.toString());
        }
        final n a = this.a;
        final int b = a.b;
        final int c = a.c;
        if (c - b < 4) {
            return (this.e() & 0xFF) << 24 | (this.e() & 0xFF) << 16 | (this.e() & 0xFF) << 8 | (this.e() & 0xFF);
        }
        final byte[] a2 = a.a;
        final int n = b + 1;
        final byte b2 = a2[b];
        final int n2 = n + 1;
        final byte b3 = a2[n];
        final int n3 = n2 + 1;
        final byte b4 = a2[n2];
        final int b5 = n3 + 1;
        final int n4 = (b2 & 0xFF) << 24 | (b3 & 0xFF) << 16 | (b4 & 0xFF) << 8 | (a2[n3] & 0xFF);
        this.b -= 4L;
        if (b5 == c) {
            this.a = a.a();
            o.a(a);
            return n4;
        }
        a.b = b5;
        return n4;
    }
    
    public final c g(final long n) {
        if (n == 0L) {
            return this.b(48);
        }
        boolean b = false;
        int n2 = 1;
        long n3 = n;
        if (n < 0L) {
            n3 = -n;
            if (n3 < 0L) {
                return this.a("-9223372036854775808");
            }
            b = true;
        }
        if (n3 < 100000000L) {
            if (n3 < 10000L) {
                if (n3 < 100L) {
                    if (n3 >= 10L) {
                        n2 = 2;
                    }
                }
                else if (n3 < 1000L) {
                    n2 = 3;
                }
                else {
                    n2 = 4;
                }
            }
            else if (n3 < 1000000L) {
                if (n3 < 100000L) {
                    n2 = 5;
                }
                else {
                    n2 = 6;
                }
            }
            else if (n3 < 10000000L) {
                n2 = 7;
            }
            else {
                n2 = 8;
            }
        }
        else if (n3 < 1000000000000L) {
            if (n3 < 10000000000L) {
                if (n3 < 1000000000L) {
                    n2 = 9;
                }
                else {
                    n2 = 10;
                }
            }
            else if (n3 < 100000000000L) {
                n2 = 11;
            }
            else {
                n2 = 12;
            }
        }
        else if (n3 < 1000000000000000L) {
            if (n3 < 10000000000000L) {
                n2 = 13;
            }
            else if (n3 < 100000000000000L) {
                n2 = 14;
            }
            else {
                n2 = 15;
            }
        }
        else if (n3 < 100000000000000000L) {
            if (n3 < 10000000000000000L) {
                n2 = 16;
            }
            else {
                n2 = 17;
            }
        }
        else if (n3 < 1000000000000000000L) {
            n2 = 18;
        }
        else {
            n2 = 19;
        }
        int n4 = n2;
        if (b) {
            n4 = n2 + 1;
        }
        final n e = this.e(n4);
        final byte[] a = e.a;
        int n5 = e.c + n4;
        while (n3 != 0L) {
            final int n6 = (int)(n3 % 10L);
            --n5;
            a[n5] = b.c.c[n6];
            n3 /= 10L;
        }
        if (b) {
            a[n5 - 1] = 45;
        }
        e.c += n4;
        this.b += n4;
        return this;
    }
    
    @Override
    public final /* synthetic */ d g(final int n) {
        return this.c(n);
    }
    
    public final c h(long n) {
        if (n == 0L) {
            return this.b(48);
        }
        final int n2 = Long.numberOfTrailingZeros(Long.highestOneBit(n)) / 4 + 1;
        final n e = this.e(n2);
        final byte[] a = e.a;
        for (int i = e.c + n2 - 1; i >= e.c; --i) {
            a[i] = b.c.c[(int)(0xFL & n)];
            n >>>= 4;
        }
        e.c += n2;
        this.b += n2;
        return this;
    }
    
    @Override
    public final /* synthetic */ d h(final int n) {
        return this.b(n);
    }
    
    @Override
    public final short h() {
        return t.a(this.f());
    }
    
    @Override
    public final int hashCode() {
        n n = this.a;
        if (n == null) {
            return 0;
        }
        int n2 = 1;
        n n3;
        int n4;
        do {
            int i = n.b;
            final int c = n.c;
            n4 = n2;
            while (i < c) {
                n4 = n4 * 31 + n.a[i];
                ++i;
            }
            n3 = (n = n.f);
            n2 = n4;
        } while (n3 != this.a);
        return n4;
    }
    
    @Override
    public final int i() {
        return t.a(this.g());
    }
    
    @Override
    public final /* synthetic */ d i(final long n) {
        return this.h(n);
    }
    
    @Override
    public final long j() {
        if (this.b != 0L) {
            int n = 0;
            long n2 = 0L;
            int n3 = 0;
            long n4;
            int n5;
            do {
                final n a = this.a;
                final byte[] a2 = a.a;
                int b = a.b;
                final int c = a.c;
                n4 = n2;
                n5 = n;
                int n6;
                while (true) {
                    n6 = n3;
                    if (b >= c) {
                        break;
                    }
                    final byte b2 = a2[b];
                    int n7;
                    if (b2 >= 48 && b2 <= 57) {
                        n7 = b2 - 48;
                    }
                    else if (b2 >= 97 && b2 <= 102) {
                        n7 = b2 - 97 + 10;
                    }
                    else if (b2 >= 65 && b2 <= 70) {
                        n7 = b2 - 65 + 10;
                    }
                    else {
                        if (n5 != 0) {
                            n6 = 1;
                            break;
                        }
                        final StringBuilder sb = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                        sb.append(Integer.toHexString(b2));
                        throw new NumberFormatException(sb.toString());
                    }
                    if ((0xF000000000000000L & n4) != 0x0L) {
                        final c b3 = new c().h(n4).b(b2);
                        final StringBuilder sb2 = new StringBuilder("Number too large: ");
                        sb2.append(b3.l());
                        throw new NumberFormatException(sb2.toString());
                    }
                    n4 = (n4 << 4 | (long)n7);
                    ++b;
                    ++n5;
                }
                if (b == c) {
                    this.a = a.a();
                    o.a(a);
                }
                else {
                    a.b = b;
                }
                if (n6 != 0) {
                    break;
                }
                n = n5;
                n3 = n6;
                n2 = n4;
            } while (this.a != null);
            this.b -= n5;
            return n4;
        }
        throw new IllegalStateException("size == 0");
    }
    
    @Override
    public final /* synthetic */ d j(final long n) {
        return this.g(n);
    }
    
    public final f k() {
        return new f(this.n());
    }
    
    public final String l() {
        try {
            return this.a(this.b, t.a);
        }
        catch (EOFException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final String m() {
        final long a = this.a((byte)10, 0L);
        if (a != -1L) {
            return this.d(a);
        }
        final c c = new c();
        this.a(c, 0L, Math.min(32L, this.b));
        final StringBuilder sb = new StringBuilder("\\n not found: size=");
        sb.append(this.b);
        sb.append(" content=");
        sb.append(c.k().e());
        sb.append("\u2026");
        throw new EOFException(sb.toString());
    }
    
    public final byte[] n() {
        try {
            return this.e(this.b);
        }
        catch (EOFException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final void o() {
        try {
            this.f(this.b);
        }
        catch (EOFException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final long p() {
        return this.a((byte)0, 0L);
    }
    
    @Override
    public final /* bridge */ d q() {
        return this;
    }
    
    @Override
    public final String toString() {
        if (this.b <= 2147483647L) {
            final int n = (int)this.b;
            f b;
            if (n == 0) {
                b = f.b;
            }
            else {
                b = new p(this, n);
            }
            return b.toString();
        }
        final StringBuilder sb = new StringBuilder("size > Integer.MAX_VALUE: ");
        sb.append(this.b);
        throw new IllegalArgumentException(sb.toString());
    }
}
