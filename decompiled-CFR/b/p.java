/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import b.c;
import b.f;
import b.n;
import b.t;
import java.util.Arrays;

final class p
extends f {
    final transient byte[][] f;
    final transient int[] g;

    p(c object, int n2) {
        super(null);
        int n3;
        t.a(((c)object).b, 0L, n2);
        n n4 = ((c)object).a;
        int n5 = 0;
        int n6 = 0;
        for (n3 = 0; n3 < n2; n3 += n4.c - n4.b, ++n6) {
            if (n4.c == n4.b) throw new AssertionError((Object)"s.limit == s.pos");
            n4 = n4.f;
        }
        this.f = new byte[n6][];
        this.g = new int[n6 * 2];
        object = ((c)object).a;
        n3 = 0;
        n6 = n5;
        while (n6 < n2) {
            this.f[n3] = ((n)object).a;
            n6 = n5 = n6 + (((n)object).c - ((n)object).b);
            if (n5 > n2) {
                n6 = n2;
            }
            this.g[n3] = n6;
            this.g[this.f.length + n3] = ((n)object).b;
            ((n)object).d = true;
            ++n3;
            object = ((n)object).f;
        }
    }

    private int b(int n2) {
        if ((n2 = Arrays.binarySearch(this.g, 0, this.f.length, n2 + 1)) < 0) return ~n2;
        return n2;
    }

    private f i() {
        return new f(this.h());
    }

    @Override
    public final byte a(int n2) {
        t.a(this.g[this.f.length - 1], n2, 1L);
        int n3 = this.b(n2);
        int n4 = n3 == 0 ? 0 : this.g[n3 - 1];
        int n5 = this.g[this.f.length + n3];
        return this.f[n3][n2 - n4 + n5];
    }

    @Override
    public final f a(int n2, int n3) {
        return this.i().a(n2, n3);
    }

    @Override
    public final String a() {
        return this.i().a();
    }

    @Override
    final void a(c c2) {
        int n2 = this.f.length;
        int n3 = 0;
        int n4 = 0;
        do {
            if (n3 >= n2) {
                c2.b += (long)n4;
                return;
            }
            int n5 = this.g[n2 + n3];
            int n6 = this.g[n3];
            n n7 = new n(this.f[n3], n5, n5 + n6 - n4);
            if (c2.a == null) {
                n7.g = n7;
                n7.f = n7;
                c2.a = n7;
            } else {
                c2.a.g.a(n7);
            }
            ++n3;
            n4 = n6;
        } while (true);
    }

    @Override
    public final boolean a(int n2, f f2, int n3, int n4) {
        if (this.g() - n4 < 0) {
            return false;
        }
        int n5 = this.b(0);
        int n6 = n2;
        n2 = n5;
        while (n4 > 0) {
            n5 = n2 == 0 ? 0 : this.g[n2 - 1];
            int n7 = Math.min(n4, this.g[n2] - n5 + n5 - n6);
            int n8 = this.g[this.f.length + n2];
            if (!f2.a(n3, this.f[n2], n6 - n5 + n8, n7)) {
                return false;
            }
            n6 += n7;
            n3 += n7;
            n4 -= n7;
            ++n2;
        }
        return true;
    }

    @Override
    public final boolean a(int n2, byte[] arrby, int n3, int n4) {
        if (n2 < 0) return false;
        if (n2 > this.g() - n4) return false;
        if (n3 < 0) return false;
        if (n3 > arrby.length - n4) {
            return false;
        }
        int n5 = this.b(n2);
        int n6 = n2;
        n2 = n5;
        while (n4 > 0) {
            n5 = n2 == 0 ? 0 : this.g[n2 - 1];
            int n7 = Math.min(n4, this.g[n2] - n5 + n5 - n6);
            int n8 = this.g[this.f.length + n2];
            if (!t.a(this.f[n2], n6 - n5 + n8, arrby, n3, n7)) {
                return false;
            }
            n6 += n7;
            n3 += n7;
            n4 -= n7;
            ++n2;
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
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof f)) return false;
        if (((f)(object = (f)object)).g() != this.g()) return false;
        if (!this.a(0, (f)object, 0, this.g())) return false;
        return true;
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
        byte[] arrby = new byte[this.g[this.f.length - 1]];
        int n2 = this.f.length;
        int n3 = 0;
        int n4 = 0;
        while (n3 < n2) {
            int n5 = this.g[n2 + n3];
            int n6 = this.g[n3];
            System.arraycopy(this.f[n3], n5, arrby, n4, n6 - n4);
            ++n3;
            n4 = n6;
        }
        return arrby;
    }

    @Override
    public final int hashCode() {
        int n2 = this.d;
        if (n2 != 0) {
            return n2;
        }
        int n3 = this.f.length;
        int n4 = 0;
        int n5 = 0;
        int n6 = 1;
        do {
            if (n4 >= n3) {
                this.d = n6;
                return n6;
            }
            byte[] arrby = this.f[n4];
            int n7 = this.g[n3 + n4];
            int n8 = this.g[n4];
            for (n2 = n7; n2 < n8 - n5 + n7; ++n2) {
                n6 = n6 * 31 + arrby[n2];
            }
            ++n4;
            n5 = n8;
        } while (true);
    }

    @Override
    public final String toString() {
        return this.i().toString();
    }
}

