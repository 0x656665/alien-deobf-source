/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import b.c;
import b.d;
import b.q;
import b.s;
import b.t;

final class l
implements d {
    public final c a = new c();
    public final q b;
    boolean c;

    l(q q2) {
        if (q2 == null) throw new NullPointerException("sink == null");
        this.b = q2;
    }

    @Override
    public final s a() {
        return this.b.a();
    }

    @Override
    public final void a_(c c2, long l2) {
        if (this.c) throw new IllegalStateException("closed");
        this.a.a_(c2, l2);
        this.q();
    }

    @Override
    public final c b() {
        return this.a;
    }

    @Override
    public final d b(String string) {
        if (this.c) throw new IllegalStateException("closed");
        this.a.a(string);
        return this.q();
    }

    @Override
    public final d b(byte[] arrby) {
        if (this.c) throw new IllegalStateException("closed");
        this.a.a(arrby);
        return this.q();
    }

    @Override
    public final d b(byte[] arrby, int n2, int n3) {
        if (this.c) throw new IllegalStateException("closed");
        this.a.a(arrby, n2, n3);
        return this.q();
    }

    @Override
    public final void close() {
        Throwable throwable;
        block6 : {
            if (this.c) {
                return;
            }
            Throwable throwable2 = throwable = null;
            try {
                if (this.a.b > 0L) {
                    this.b.a_(this.a, this.a.b);
                    throwable2 = throwable;
                }
            }
            catch (Throwable throwable3) {
                // empty catch block
            }
            try {
                this.b.close();
                throwable = throwable2;
            }
            catch (Throwable throwable4) {
                throwable = throwable2;
                if (throwable2 != null) break block6;
                throwable = throwable4;
            }
        }
        this.c = true;
        if (throwable == null) return;
        t.a(throwable);
    }

    @Override
    public final d f(int n2) {
        if (this.c) throw new IllegalStateException("closed");
        this.a.d(n2);
        return this.q();
    }

    @Override
    public final void flush() {
        if (this.c) throw new IllegalStateException("closed");
        if (this.a.b > 0L) {
            this.b.a_(this.a, this.a.b);
        }
        this.b.flush();
    }

    @Override
    public final d g(int n2) {
        if (this.c) throw new IllegalStateException("closed");
        this.a.c(n2);
        return this.q();
    }

    @Override
    public final d h(int n2) {
        if (this.c) throw new IllegalStateException("closed");
        this.a.b(n2);
        return this.q();
    }

    @Override
    public final d i(long l2) {
        if (this.c) throw new IllegalStateException("closed");
        this.a.h(l2);
        return this.q();
    }

    @Override
    public final d j(long l2) {
        if (this.c) throw new IllegalStateException("closed");
        this.a.g(l2);
        return this.q();
    }

    @Override
    public final d q() {
        if (this.c) throw new IllegalStateException("closed");
        long l2 = this.a.d();
        if (l2 <= 0L) return this;
        this.b.a_(this.a, l2);
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("buffer(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

