/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.aa;
import a.d;
import a.p;
import a.q;
import a.r;
import a.v;
import a.x;
import java.io.Closeable;

public final class z
implements Closeable {
    public final x a;
    final v b;
    public final int c;
    final String d;
    public final p e;
    public final q f;
    public final aa g;
    final z h;
    final z i;
    final z j;
    public final long k;
    public final long l;
    private volatile d m;

    z(a a2) {
        this.a = a2.a;
        this.b = a2.b;
        this.c = a2.c;
        this.d = a2.d;
        this.e = a2.e;
        this.f = a2.f.a();
        this.g = a2.g;
        this.h = a2.h;
        this.i = a2.i;
        this.j = a2.j;
        this.k = a2.k;
        this.l = a2.l;
    }

    public final a a() {
        return new a(this);
    }

    public final String decrypt_str(String string) {
        if ((string = this.f.a(string)) == null) return null;
        return string;
    }

    public final d b() {
        d d2 = this.m;
        if (d2 != null) {
            return d2;
        }
        this.m = d2 = d.a(this.f);
        return d2;
    }

    @Override
    public final void close() {
        this.g.close();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Response{protocol=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", code=");
        stringBuilder.append(this.c);
        stringBuilder.append(", message=");
        stringBuilder.append(this.d);
        stringBuilder.append(", url=");
        stringBuilder.append(this.a.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class a {
        public x a;
        public v b;
        public int c = -1;
        public String d;
        public p e;
        q.a f;
        public aa g;
        z h;
        z i;
        public z j;
        public long k;
        public long l;

        public a() {
            this.f = new q.a();
        }

        a(z z2) {
            this.a = z2.a;
            this.b = z2.b;
            this.c = z2.c;
            this.d = z2.d;
            this.e = z2.e;
            this.f = z2.f.a();
            this.g = z2.g;
            this.h = z2.h;
            this.i = z2.i;
            this.j = z2.j;
            this.k = z2.k;
            this.l = z2.l;
        }

        private static void a(String string, z object) {
            if (((z)object).g != null) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(".body != null");
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            if (((z)object).h != null) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(".networkResponse != null");
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            if (((z)object).i != null) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(".cacheResponse != null");
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            if (((z)object).j == null) {
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(".priorResponse != null");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        public final a a(q q2) {
            this.f = q2.a();
            return this;
        }

        public final a a(z z2) {
            if (z2 != null) {
                a.a("networkResponse", z2);
            }
            this.h = z2;
            return this;
        }

        public final a a(String string, String string2) {
            q.a a2 = this.f;
            q.a.b(string, string2);
            a2.a(string, string2);
            return this;
        }

        public final z a() {
            if (this.a == null) throw new IllegalStateException("request == null");
            if (this.b == null) throw new IllegalStateException("protocol == null");
            if (this.c >= 0) {
                return new z(this);
            }
            StringBuilder stringBuilder = new StringBuilder("code < 0: ");
            stringBuilder.append(this.c);
            throw new IllegalStateException(stringBuilder.toString());
        }

        public final a b(z z2) {
            if (z2 != null) {
                a.a("cacheResponse", z2);
            }
            this.i = z2;
            return this;
        }
    }

}

