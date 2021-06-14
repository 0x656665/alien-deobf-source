package b;

import java.util.*;

final class p extends f
{
    final transient byte[][] f;
    final transient int[] g;
    
    p(final c c, final int n) {
        super(null);
        t.a(c.b, 0L, n);
        n n2 = c.a;
        final int n3 = 0;
        int i;
        int n4;
        for (i = 0, n4 = 0; i < n; i += n2.c - n2.b, ++n4, n2 = n2.f) {
            if (n2.c == n2.b) {
                throw new AssertionError((Object)"s.limit == s.pos");
            }
        }
        this.f = new byte[n4][];
        this.g = new int[n4 * 2];
        n n5 = c.a;
        int n6 = 0;
        int j = n3;
        while (j < n) {
            this.f[n6] = n5.a;
            if ((j += n5.c - n5.b) > n) {
                j = n;
            }
            this.g[n6] = j;
            this.g[this.f.length + n6] = n5.b;
            n5.d = true;
            ++n6;
            n5 = n5.f;
        }
    }
    
    private int b(int binarySearch) {
        binarySearch = Arrays.binarySearch(this.g, 0, this.f.length, binarySearch + 1);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return ~binarySearch;
    }
    
    private f i() {
        return new f(this.h());
    }
    
    @Override
    public final byte a(final int n) {
        t.a(this.g[this.f.length - 1], n, 1L);
        final int b = this.b(n);
        int n2;
        if (b == 0) {
            n2 = 0;
        }
        else {
            n2 = this.g[b - 1];
        }
        return this.f[b][n - n2 + this.g[this.f.length + b]];
    }
    
    @Override
    public final f a(final int n, final int n2) {
        return this.i().a(n, n2);
    }
    
    @Override
    public final String a() {
        return this.i().a();
    }
    
    @Override
    final void a(final c c) {
        final int length = this.f.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int n2 = this.g[length + i];
            final int n3 = this.g[i];
            final n a = new n(this.f[i], n2, n2 + n3 - n);
            if (c.a == null) {
                a.g = a;
                a.f = a;
                c.a = a;
            }
            else {
                c.a.g.a(a);
            }
            ++i;
            n = n3;
        }
        c.b += n;
    }
    
    @Override
    public final boolean a(int n, final f f, int n2, int i) {
        if (this.g() - i < 0) {
            return false;
        }
        final int b = this.b(0);
        int n3 = n;
        int n4;
        int min;
        for (n = b; i > 0; i -= min, ++n) {
            if (n == 0) {
                n4 = 0;
            }
            else {
                n4 = this.g[n - 1];
            }
            min = Math.min(i, this.g[n] - n4 + n4 - n3);
            if (!f.a(n2, this.f[n], n3 - n4 + this.g[this.f.length + n], min)) {
                return false;
            }
            n3 += min;
            n2 += min;
        }
        return true;
    }
    
    @Override
    public final boolean a(int n, final byte[] array, int n2, int i) {
        if (n < 0 || n > this.g() - i || n2 < 0) {
            return false;
        }
        if (n2 > array.length - i) {
            return false;
        }
        final int b = this.b(n);
        int n3 = n;
        int n4;
        int min;
        for (n = b; i > 0; i -= min, ++n) {
            if (n == 0) {
                n4 = 0;
            }
            else {
                n4 = this.g[n - 1];
            }
            min = Math.min(i, this.g[n] - n4 + n4 - n3);
            if (!t.a(this.f[n], n3 - n4 + this.g[this.f.length + n], array, n2, min)) {
                return false;
            }
            n3 += min;
            n2 += min;
        }
        return true;
    }
    
    @Override
    public final String b() {
        return this.i().b();
    }
    
    @Override
    public final f c() {
        return this.i().c();
    }
    
    @Override
    public final f d() {
        return this.i().d();
    }
    
    @Override
    public final String e() {
        return this.i().e();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof f) {
            final f f = (f)o;
            if (f.g() == this.g() && this.a(0, f, 0, this.g())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final f f() {
        return this.i().f();
    }
    
    @Override
    public final int g() {
        return this.g[this.f.length - 1];
    }
    
    @Override
    public final byte[] h() {
        final byte[] array = new byte[this.g[this.f.length - 1]];
        final int length = this.f.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int n2 = this.g[length + i];
            final int n3 = this.g[i];
            System.arraycopy(this.f[i], n2, array, n, n3 - n);
            ++i;
            n = n3;
        }
        return array;
    }
    
    @Override
    public final int hashCode() {
        final int d = this.d;
        if (d != 0) {
            return d;
        }
        final int length = this.f.length;
        int i = 0;
        int n = 0;
        int d2 = 1;
        while (i < length) {
            final byte[] array = this.f[i];
            final int n2 = this.g[length + i];
            final int n3 = this.g[i];
            for (int j = n2; j < n3 - n + n2; ++j) {
                d2 = d2 * 31 + array[j];
            }
            ++i;
            n = n3;
        }
        return this.d = d2;
    }
    
    @Override
    public final String toString() {
        return this.i().toString();
    }
}
