/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.e;

import a.a.e.g;
import a.a.e.j;
import a.a.e.n;
import a.a.e.o;
import b.e;
import b.q;
import b.r;
import b.s;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;

public final class i {
    static final /* synthetic */ boolean l;
    long a = 0L;
    long b;
    final int c;
    final g d;
    List<a.a.e.c> e;
    boolean f;
    final b g;
    final a h;
    final c i = new c();
    final c j = new c();
    a.a.e.b k = null;
    private final List<a.a.e.c> m;

    static {
        l = i.class.desiredAssertionStatus() ^ true;
    }

    i(int n2, g g2, boolean bl, boolean bl2, List<a.a.e.c> list) {
        if (g2 == null) throw new NullPointerException("connection == null");
        if (list == null) throw new NullPointerException("requestHeaders == null");
        this.c = n2;
        this.d = g2;
        this.b = g2.n.b();
        this.g = new b(g2.m.b());
        this.h = new a();
        this.g.b = bl2;
        this.h.b = bl;
        this.m = list;
    }

    /*
     * Enabled unnecessary exception pruning
     */
    private boolean d(a.a.e.b b2) {
        if (!l) {
            if (Thread.holdsLock(this)) throw new AssertionError();
        }
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.g.b && this.h.b) {
                return false;
            }
            this.k = b2;
            this.notifyAll();
        }
        this.d.b(this.c);
        return true;
    }

    final void a(long l2) {
        this.b += l2;
        if (l2 <= 0L) return;
        this.notifyAll();
    }

    public final void a(a.a.e.b b2) {
        if (!this.d(b2)) {
            return;
        }
        this.d.b(this.c, b2);
    }

    public final boolean a() {
        synchronized (this) {
            boolean bl;
            a.a.e.b b2 = this.k;
            if (b2 != null) {
                return false;
            }
            if (!this.g.b) {
                if (!this.g.a) return true;
            }
            if (!this.h.b) {
                if (!this.h.a) return true;
            }
            if (!(bl = this.f)) return true;
            return false;
        }
    }

    public final void b(a.a.e.b b2) {
        if (!this.d(b2)) {
            return;
        }
        this.d.a(this.c, b2);
    }

    public final boolean b() {
        boolean bl = (this.c & 1) == 1;
        if (this.d.b != bl) return false;
        return true;
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public final List<a.a.e.c> c() {
        synchronized (this) {
            if (!this.b()) throw new IllegalStateException("servers cannot read response headers");
            this.i.a_();
            while (this.e == null && this.k == null) {
                this.h();
            }
            List<a.a.e.c> list = this.e;
            if (list == null) throw new o(this.k);
            this.e = null;
            return list;
            finally {
                this.i.b();
            }
        }
    }

    final void c(a.a.e.b b2) {
        synchronized (this) {
            if (this.k != null) return;
            this.k = b2;
            this.notifyAll();
            return;
        }
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public final q d() {
        synchronized (this) {
            if (this.f) return this.h;
            if (!this.b()) throw new IllegalStateException("reply before requesting the sink");
            return this.h;
        }
    }

    /*
     * Enabled unnecessary exception pruning
     */
    final void e() {
        boolean bl;
        if (!l) {
            if (Thread.holdsLock(this)) throw new AssertionError();
        }
        synchronized (this) {
            this.g.b = true;
            bl = this.a();
            this.notifyAll();
        }
        if (bl) return;
        this.d.b(this.c);
    }

    /*
     * Enabled unnecessary exception pruning
     * Converted monitor instructions to comments
     */
    final void f() {
        if (!l) {
            if (Thread.holdsLock(this)) throw new AssertionError();
        }
        // MONITORENTER : this
        boolean bl = !this.g.b && this.g.a && (this.h.b || this.h.a);
        boolean bl2 = this.a();
        // MONITOREXIT : this
        if (bl) {
            this.a(a.a.e.b.f);
            return;
        }
        if (bl2) return;
        this.d.b(this.c);
    }

    final void g() {
        if (this.h.a) throw new IOException("stream closed");
        if (this.h.b) throw new IOException("stream finished");
        if (this.k != null) throw new o(this.k);
    }

    final void h() {
        try {
            this.wait();
            return;
        }
        catch (InterruptedException interruptedException) {
            throw new InterruptedIOException();
        }
    }

    final class a
    implements q {
        static final /* synthetic */ boolean c;
        boolean a;
        boolean b;
        private final b.c e = new b.c();

        static {
            c = i.class.desiredAssertionStatus() ^ true;
        }

        a() {
        }

        /*
         * Enabled unnecessary exception pruning
         */
        private void a(boolean bl) {
            long l2;
            Object object = i.this;
            synchronized (object) {
                i.this.j.a_();
                while (i.this.b <= 0L && !this.b && !this.a && i.this.k == null) {
                    i.this.h();
                }
                i.this.g();
                l2 = Math.min(i.this.b, this.e.b);
                i i2 = i.this;
                i2.b -= l2;
            }
            i.this.j.a_();
            try {
                object = i.this.d;
                int n2 = i.this.c;
                bl = bl && l2 == this.e.b;
                ((g)object).a(n2, bl, this.e, l2);
                i.this.j.b();
                return;
            }
            catch (Throwable throwable) {
                i.this.j.b();
                throw throwable;
            }
            {
                finally {
                    i.this.j.b();
                }
            }
        }

        @Override
        public final s a() {
            return i.this.j;
        }

        @Override
        public final void a_(b.c c2, long l2) {
            if (!c) {
                if (Thread.holdsLock(i.this)) throw new AssertionError();
            }
            this.e.a_(c2, l2);
            while (this.e.b >= 16384L) {
                this.a(false);
            }
        }

        /*
         * Enabled unnecessary exception pruning
         * Converted monitor instructions to comments
         */
        @Override
        public final void close() {
            if (!c) {
                if (Thread.holdsLock(i.this)) throw new AssertionError();
            }
            i i2 = i.this;
            // MONITORENTER : i2
            if (this.a) {
                // MONITOREXIT : i2
                return;
            }
            // MONITOREXIT : i2
            if (!i.this.h.b) {
                if (this.e.b > 0L) {
                    while (this.e.b > 0L) {
                        this.a(true);
                    }
                } else {
                    i.this.d.a(i.this.c, true, null, 0L);
                }
            }
            i2 = i.this;
            // MONITORENTER : i2
            this.a = true;
            // MONITOREXIT : i2
            i.this.d.q.blockBack2();
            i.this.f();
        }

        /*
         * Enabled unnecessary exception pruning
         */
        @Override
        public final void flush() {
            if (!c) {
                if (Thread.holdsLock(i.this)) throw new AssertionError();
            }
            i i2 = i.this;
            synchronized (i2) {
                i.this.g();
            }
            while (this.e.b > 0L) {
                this.a(false);
                i.this.d.q.blockBack2();
            }
        }
    }

    final class b
    implements r {
        static final /* synthetic */ boolean c;
        boolean a;
        boolean b;
        private final b.c e = new b.c();
        private final b.c f = new b.c();
        private final long g;

        static {
            c = i.class.desiredAssertionStatus() ^ true;
        }

        b(long l2) {
            this.g = l2;
        }

        private void blockBack2() {
            i.this.i.a_();
            try {
                while (this.f.b == 0L) {
                    if (this.b) return;
                    if (this.a) return;
                    if (i.this.k != null) return;
                    i.this.h();
                }
                return;
            }
            finally {
                i.this.i.b();
            }
        }

        /*
         * Enabled unnecessary exception pruning
         */
        @Override
        public final long a(b.c object, long l2) {
            long l3;
            if (l3 < 0L) throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(l3)));
            Object object2 = i.this;
            synchronized (object2) {
                this.blockBack2();
                if (this.a) throw new IOException("stream closed");
                if (i.this.k != null) throw new o(i.this.k);
                if (this.f.b == 0L) {
                    return -1L;
                }
                l3 = this.f.a((b.c)object, Math.min(l3, this.f.b));
                object = i.this;
                ((i)object).a += l3;
                if (i.this.a >= (long)(i.this.d.m.b() / 2)) {
                    i.this.d.a(i.this.c, i.this.a);
                    i.this.a = 0L;
                }
            }
            object = i.this.d;
            synchronized (object) {
                object2 = i.this.d;
                ((g)object2).k += l3;
                if (i.this.d.k < (long)(i.this.d.m.b() / 2)) return l3;
                i.this.d.a(0, i.this.d.k);
                i.this.d.k = 0L;
                return l3;
            }
        }

        @Override
        public final s a() {
            return i.this.i;
        }

        /*
         * Enabled unnecessary exception pruning
         * Converted monitor instructions to comments
         */
        final void a(e e2, long l2) {
            long l3 = l2;
            if (!c) {
                if (Thread.holdsLock(i.this)) throw new AssertionError();
                l3 = l2;
            }
            while (l3 > 0L) {
                i i2 = i.this;
                // MONITORENTER : i2
                boolean bl = this.b;
                l2 = this.f.b;
                long l4 = this.g;
                boolean bl2 = false;
                boolean bl3 = l2 + l3 > l4;
                // MONITOREXIT : i2
                if (bl3) {
                    e2.f(l3);
                    i.this.b(a.a.e.b.d);
                    return;
                }
                if (bl) {
                    e2.f(l3);
                    return;
                }
                l2 = e2.a(this.e, l3);
                if (l2 == -1L) throw new EOFException();
                l3 -= l2;
                i2 = i.this;
                // MONITORENTER : i2
                bl3 = bl2;
                if (this.f.b == 0L) {
                    bl3 = true;
                }
                this.f.a(this.e);
                if (bl3) {
                    i.this.notifyAll();
                }
                // MONITOREXIT : i2
            }
        }

        /*
         * Enabled unnecessary exception pruning
         */
        @Override
        public final void close() {
            i i2 = i.this;
            synchronized (i2) {
                this.a = true;
                this.f.o();
                i.this.notifyAll();
            }
            i.this.f();
        }
    }

    final class c
    extends b.a {
        c() {
        }

        @Override
        public final IOException a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException == null) return socketTimeoutException;
            socketTimeoutException.initCause(iOException);
            return socketTimeoutException;
        }

        @Override
        public final void a() {
            i.this.b(a.a.e.b.f);
        }

        public final void b() {
            if (this.b_()) throw this.a(null);
        }
    }

}

