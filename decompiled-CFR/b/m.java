/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import b.c;
import b.e;
import b.f;
import b.r;
import b.s;
import b.t;
import java.io.EOFException;
import java.nio.charset.Charset;

final class m
implements e {
    public final c a = new c();
    public final r b;
    boolean c;

    m(r r2) {
        if (r2 == null) throw new NullPointerException("source == null");
        this.b = r2;
    }

    private long a(byte by, long l2) {
        if (this.c) throw new IllegalStateException("closed");
        long l3;
        while ((l3 = this.a.a(by, l2)) == -1L) {
            l3 = this.a.b;
            if (this.b.a(this.a, 8192L) == -1L) {
                return -1L;
            }
            l2 = Math.max(l2, l3);
        }
        return l3;
    }

    private boolean b(long l2) {
        if (l2 < 0L) throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(l2)));
        if (this.c) throw new IllegalStateException("closed");
        do {
            if (this.a.b >= l2) return true;
        } while (this.b.a(this.a, 8192L) != -1L);
        return false;
    }

    @Override
    public final long a(c c2, long l2) {
        if (c2 == null) throw new IllegalArgumentException("sink == null");
        if (l2 < 0L) throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(l2)));
        if (this.c) throw new IllegalStateException("closed");
        if (this.a.b == 0L && this.b.a(this.a, 8192L) == -1L) {
            return -1L;
        }
        l2 = Math.min(l2, this.a.b);
        return this.a.a(c2, l2);
    }

    @Override
    public final s a() {
        return this.b.a();
    }

    @Override
    public final String a(Charset charset) {
        if (charset == null) throw new IllegalArgumentException("charset == null");
        this.a.a(this.b);
        return this.a.a(charset);
    }

    @Override
    public final void a(long l2) {
        if (!this.b(l2)) throw new EOFException();
    }

    @Override
    public final c b() {
        return this.a;
    }

    @Override
    public final boolean b(f f2) {
        int n2 = f2.g();
        if (this.c) throw new IllegalStateException("closed");
        if (n2 < 0) return false;
        if (f2.g() - 0 < n2) {
            return false;
        }
        int n3 = 0;
        while (n3 < n2) {
            long l2 = (long)n3 + 0L;
            if (!this.b(1L + l2)) {
                return false;
            }
            if (this.a.b(l2) != f2.a(n3 + 0)) {
                return false;
            }
            ++n3;
        }
        return true;
    }

    @Override
    public final f c(long l2) {
        this.a(l2);
        return this.a.c(l2);
    }

    @Override
    public final boolean c() {
        if (this.c) throw new IllegalStateException("closed");
        if (!this.a.c()) return false;
        if (this.b.a(this.a, 8192L) != -1L) return false;
        return true;
    }

    @Override
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.a.o();
    }

    @Override
    public final byte e() {
        this.a(1L);
        return this.a.e();
    }

    @Override
    public final byte[] e(long l2) {
        this.a(l2);
        return this.a.e(l2);
    }

    @Override
    public final short f() {
        this.a(2L);
        return this.a.f();
    }

    @Override
    public final void f(long l2) {
        if (this.c) throw new IllegalStateException("closed");
        while (l2 > 0L) {
            if (this.a.b == 0L) {
                if (this.b.a(this.a, 8192L) == -1L) throw new EOFException();
            }
            long l3 = Math.min(l2, this.a.b);
            this.a.f(l3);
            l2 -= l3;
        }
    }

    @Override
    public final int g() {
        this.a(4L);
        return this.a.g();
    }

    @Override
    public final short h() {
        this.a(2L);
        return t.a(this.a.f());
    }

    @Override
    public final int i() {
        this.a(4L);
        return t.a(this.a.g());
    }

    @Override
    public final long j() {
        int n2;
        byte by;
        block2 : {
            int n3;
            this.a(1L);
            n2 = 0;
            while (this.b(n3 = n2 + 1)) {
                by = this.a.b((long)n2);
                if (by >= 48 && by <= 57 || by >= 97 && by <= 102 || by >= 65 && by <= 70) {
                    n2 = n3;
                    continue;
                }
                break block2;
            }
            return this.a.j();
        }
        if (n2 == 0) throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", by));
        return this.a.j();
    }

    @Override
    public final String m() {
        long l2 = this.a((byte)10, 0L);
        if (l2 != -1L) {
            return this.a.d(l2);
        }
        c c2 = new c();
        this.a.a(c2, 0L, Math.min(32L, this.a.b));
        StringBuilder stringBuilder = new StringBuilder("\\n not found: size=");
        stringBuilder.append(this.a.b);
        stringBuilder.append(" content=");
        stringBuilder.append(c2.k().e());
        stringBuilder.append("\u2026");
        throw new EOFException(stringBuilder.toString());
    }

    @Override
    public final long p() {
        return this.a((byte)0, 0L);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("buffer(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

