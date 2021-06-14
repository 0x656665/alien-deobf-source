/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.d;

import a.a.b.g;
import a.a.c.h;
import a.a.c.i;
import a.a.c.k;
import a.aa;
import a.ab;
import a.l;
import a.q;
import a.r;
import a.u;
import a.v;
import a.x;
import a.z;
import b.s;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

public final class a
implements a.a.c.c {
    final u a;
    final g b;
    final b.e c;
    final b.d d;
    int e = 0;

    public a(u u2, g g2, b.e e2, b.d d2) {
        this.a = u2;
        this.b = g2;
        this.c = e2;
        this.d = d2;
    }

    static void a(b.h h2) {
        s s2 = h2.a;
        s s3 = s.b;
        if (s3 == null) throw new IllegalArgumentException("delegate == null");
        h2.a = s3;
        s2.e_();
        s2.d();
    }

    @Override
    public final aa a(z object) {
        Object object2;
        if (!a.a.c.e.b((z)object)) {
            object2 = this.a(0L);
            return new h(((z)object).f, b.k.a((b.r)object2));
        }
        if ("chunked".equalsIgnoreCase(((z)object).decrypt_str("Transfer-Encoding"))) {
            object2 = object.a.a;
            if (this.e == 4) {
                this.e = 5;
                object2 = new c((r)object2);
                return new h(((z)object).f, b.k.a((b.r)object2));
            }
            object = new StringBuilder("state: ");
            ((StringBuilder)object).append(this.e);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        long l2 = a.a.c.e.a((z)object);
        if (l2 != -1L) {
            object2 = this.a(l2);
            return new h(((z)object).f, b.k.a((b.r)object2));
        }
        if (this.e == 4) {
            if (this.b == null) throw new IllegalStateException("streamAllocation == null");
            this.e = 5;
            this.b.d();
            object2 = new f();
            return new h(((z)object).f, b.k.a((b.r)object2));
        }
        object = new StringBuilder("state: ");
        ((StringBuilder)object).append(this.e);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    @Override
    public final z.a a(boolean bl) {
        if (this.e != 1 && this.e != 3) {
            StringBuilder stringBuilder = new StringBuilder("state: ");
            stringBuilder.append(this.e);
            throw new IllegalStateException(stringBuilder.toString());
        }
        try {
            k k2 = k.a(this.c.m());
            z.a a2 = new z.a();
            a2.b = k2.a;
            a2.c = k2.b;
            a2.d = k2.c;
            a2 = a2.a(this.c());
            if (bl && k2.b == 100) {
                return null;
            }
            this.e = 4;
            return a2;
        }
        catch (EOFException eOFException) {
            Serializable serializable = new StringBuilder("unexpected end of stream on ");
            ((StringBuilder)serializable).append(this.b);
            serializable = new IOException(((StringBuilder)serializable).toString());
            ((Throwable)serializable).initCause(eOFException);
            throw serializable;
        }
    }

    @Override
    public final b.q a(x object, long l2) {
        if ("chunked".equalsIgnoreCase(((x)object).a("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new b();
            }
            object = new StringBuilder("state: ");
            ((StringBuilder)object).append(this.e);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        if (l2 == -1L) throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        if (this.e == 1) {
            this.e = 2;
            return new d(l2);
        }
        object = new StringBuilder("state: ");
        ((StringBuilder)object).append(this.e);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public final b.r a(long l2) {
        if (this.e == 4) {
            this.e = 5;
            return new e(l2);
        }
        StringBuilder stringBuilder = new StringBuilder("state: ");
        stringBuilder.append(this.e);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public final void a() {
        this.d.flush();
    }

    public final void a(q object, String string) {
        if (this.e != 0) {
            object = new StringBuilder("state: ");
            ((StringBuilder)object).append(this.e);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        this.d.b(string).b("\r\n");
        int n2 = 0;
        int n3 = ((q)object).a.length / 2;
        do {
            if (n2 >= n3) {
                this.d.b("\r\n");
                this.e = 1;
                return;
            }
            this.d.b(((q)object).a(n2)).b(": ").b(((q)object).b(n2)).b("\r\n");
            ++n2;
        } while (true);
    }

    @Override
    public final void a(x x2) {
        Object object = this.b.b().a.b.type();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x2.b);
        stringBuilder.append(' ');
        boolean bl = !x2.a.b() && object == Proxy.Type.HTTP;
        if (bl) {
            stringBuilder.append(x2.a);
        } else {
            stringBuilder.append(i.a(x2.a));
        }
        stringBuilder.append(" HTTP/1.1");
        object = stringBuilder.toString();
        this.a(x2.c, (String)object);
    }

    @Override
    public final void b() {
        this.d.flush();
    }

    public final q c() {
        String string;
        q.a a2 = new q.a();
        while ((string = this.c.m()).length() != 0) {
            a.a.a.a.a(a2, string);
        }
        return a2.a();
    }

    abstract class a
    implements b.r {
        protected final b.h a;
        protected boolean b;

        private a() {
            this.a = new b.h(a.this.c.a());
        }

        /* synthetic */ a(byte by) {
            this();
        }

        @Override
        public final s a() {
            return this.a;
        }

        protected final void a(boolean bl) {
            if (a.this.e == 6) {
                return;
            }
            if (a.this.e == 5) {
                a.a(this.a);
                a.this.e = 6;
                if (a.this.b == null) return;
                a.this.b.a(bl ^ true, a.this);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("state: ");
            stringBuilder.append(a.this.e);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    final class b
    implements b.q {
        private final b.h b;
        private boolean c;

        b() {
            this.b = new b.h(a.this.d.a());
        }

        @Override
        public final s a() {
            return this.b;
        }

        @Override
        public final void a_(b.c c2, long l2) {
            if (this.c) throw new IllegalStateException("closed");
            if (l2 == 0L) {
                return;
            }
            a.this.d.i(l2);
            a.this.d.b("\r\n");
            a.this.d.a_(c2, l2);
            a.this.d.b("\r\n");
        }

        @Override
        public final void close() {
            synchronized (this) {
                boolean bl = this.c;
                if (bl) {
                    return;
                }
                this.c = true;
                a.this.d.b("0\r\n\r\n");
                a.a(this.b);
                a.this.e = 3;
                return;
            }
        }

        @Override
        public final void flush() {
            synchronized (this) {
                boolean bl = this.c;
                if (bl) {
                    return;
                }
                a.this.d.flush();
                return;
            }
        }
    }

    final class c
    extends a {
        private final r e;
        private long f;
        private boolean g;

        c(r r2) {
            super((byte)0);
            this.f = -1L;
            this.g = true;
            this.e = r2;
        }

        @Override
        public final long a(b.c object, long l2) {
            String string;
            block8 : {
                if (l2 < 0L) throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(l2)));
                if (this.b) throw new IllegalStateException("closed");
                if (!this.g) {
                    return -1L;
                }
                if (this.f == 0L || this.f == -1L) {
                    block9 : {
                        boolean bl;
                        if (this.f != -1L) {
                            a.this.c.m();
                        }
                        this.f = a.this.c.j();
                        string = a.this.c.m().trim();
                        if (this.f < 0L || !string.isEmpty() && !(bl = string.startsWith(";"))) break block8;
                        if (this.f != 0L) break block9;
                        this.g = false;
                        a.a.c.e.a(a.this.a.j, this.e, a.this.c());
                        this.a(true);
                    }
                    if (!this.g) {
                        return -1L;
                    }
                }
                if ((l2 = a.this.c.a((b.c)object, Math.min(l2, this.f))) != -1L) {
                    this.f -= l2;
                    return l2;
                }
                this.a(false);
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                object = new StringBuilder("expected chunk size and optional extensions but was \"");
                ((StringBuilder)object).append(this.f);
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append("\"");
                throw new ProtocolException(((StringBuilder)object).toString());
            }
            catch (NumberFormatException numberFormatException) {
                throw new ProtocolException(numberFormatException.getMessage());
            }
        }

        @Override
        public final void close() {
            if (this.b) {
                return;
            }
            if (this.g && !a.a.c.a(this, TimeUnit.MILLISECONDS)) {
                this.a(false);
            }
            this.b = true;
        }
    }

    final class d
    implements b.q {
        private final b.h b;
        private boolean c;
        private long d;

        d(long l2) {
            this.b = new b.h(a.this.d.a());
            this.d = l2;
        }

        @Override
        public final s a() {
            return this.b;
        }

        @Override
        public final void a_(b.c object, long l2) {
            if (this.c) throw new IllegalStateException("closed");
            a.a.c.a(((b.c)object).b, l2);
            if (l2 <= this.d) {
                a.this.d.a_((b.c)object, l2);
                this.d -= l2;
                return;
            }
            object = new StringBuilder("expected ");
            ((StringBuilder)object).append(this.d);
            ((StringBuilder)object).append(" bytes but received ");
            ((StringBuilder)object).append(l2);
            throw new ProtocolException(((StringBuilder)object).toString());
        }

        @Override
        public final void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            if (this.d > 0L) throw new ProtocolException("unexpected end of stream");
            a.a(this.b);
            a.this.e = 3;
        }

        @Override
        public final void flush() {
            if (this.c) {
                return;
            }
            a.this.d.flush();
        }
    }

    final class e
    extends a {
        private long e;

        public e(long l2) {
            super((byte)0);
            this.e = l2;
            if (this.e != 0L) return;
            this.a(true);
        }

        @Override
        public final long a(b.c c2, long l2) {
            if (l2 < 0L) throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(l2)));
            if (this.b) throw new IllegalStateException("closed");
            if (this.e == 0L) {
                return -1L;
            }
            if ((l2 = a.this.c.a(c2, Math.min(this.e, l2))) != -1L) {
                this.e -= l2;
                if (this.e != 0L) return l2;
                this.a(true);
                return l2;
            }
            this.a(false);
            throw new ProtocolException("unexpected end of stream");
        }

        @Override
        public final void close() {
            if (this.b) {
                return;
            }
            if (this.e != 0L && !a.a.c.a(this, TimeUnit.MILLISECONDS)) {
                this.a(false);
            }
            this.b = true;
        }
    }

    final class f
    extends a {
        private boolean e;

        f() {
            super((byte)0);
        }

        @Override
        public final long a(b.c c2, long l2) {
            if (l2 < 0L) throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(l2)));
            if (this.b) throw new IllegalStateException("closed");
            if (this.e) {
                return -1L;
            }
            if ((l2 = a.this.c.a(c2, l2)) != -1L) return l2;
            this.e = true;
            this.a(true);
            return -1L;
        }

        @Override
        public final void close() {
            if (this.b) {
                return;
            }
            if (!this.e) {
                this.a(false);
            }
            this.b = true;
        }
    }

}

