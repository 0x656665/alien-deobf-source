/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.e;

import a.a.c;
import a.a.c.h;
import a.a.c.k;
import a.a.e.g;
import a.a.e.i;
import a.a.e.j;
import a.aa;
import a.q;
import a.r;
import a.u;
import a.v;
import a.x;
import a.y;
import a.z;
import b.e;
import b.s;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class f
implements a.a.c.c {
    private static final b.f b = b.f.a("connection");
    private static final b.f c = b.f.a("host");
    private static final b.f d = b.f.a("keep-alive");
    private static final b.f e = b.f.a("proxy-connection");
    private static final b.f f = b.f.a("transfer-encoding");
    private static final b.f g = b.f.a("te");
    private static final b.f h = b.f.a("encoding");
    private static final b.f i = b.f.a("upgrade");
    private static final List<b.f> j = c.a(b, c, d, e, g, f, h, i, a.a.e.c.c, a.a.e.c.d, a.a.e.c.e, a.a.e.c.f);
    private static final List<b.f> k = c.a(b, c, d, e, g, f, h, i);
    final a.a.b.g a;
    private final u l;
    private final g m;
    private i n;

    public f(u u2, a.a.b.g g2, g g3) {
        this.l = u2;
        this.a = g2;
        this.m = g3;
    }

    @Override
    public final aa a(z z2) {
        a a2 = new a(this.n.g);
        return new h(z2.f, b.k.a(a2));
    }

    @Override
    public final z.a a(boolean bl) {
        List<a.a.e.c> list = this.n.c();
        q.a a2 = new q.a();
        int n2 = list.size();
        int n3 = 0;
        Object object = null;
        do {
            q.a a3;
            Object object2;
            if (n3 >= n2) {
                if (object == null) throw new ProtocolException("Expected ':status' header not present");
                object2 = new z.a();
                ((z.a)object2).b = v.d;
                ((z.a)object2).c = ((k)object).b;
                ((z.a)object2).d = ((k)object).c;
                object2 = ((z.a)object2).a(a2.a());
                if (!bl) return object2;
                if (a.a.a.a.a((z.a)object2) != 100) return object2;
                return null;
            }
            object2 = list.get(n3);
            if (object2 == null) {
                object2 = object;
                a3 = a2;
                if (object != null) {
                    object2 = object;
                    a3 = a2;
                    if (((k)object).b == 100) {
                        a3 = new q.a();
                        object2 = null;
                    }
                }
            } else {
                b.f f2 = ((a.a.e.c)object2).g;
                String string = ((a.a.e.c)object2).h.a();
                if (f2.equals(a.a.e.c.b)) {
                    object2 = k.a("HTTP/1.1 ".concat(String.valueOf(string)));
                    a3 = a2;
                } else {
                    object2 = object;
                    a3 = a2;
                    if (!k.contains(f2)) {
                        a.a.a.a.a(a2, f2.a(), string);
                        a3 = a2;
                        object2 = object;
                    }
                }
            }
            ++n3;
            object = object2;
            a2 = a3;
        } while (true);
    }

    @Override
    public final b.q a(x x2, long l2) {
        return this.n.d();
    }

    @Override
    public final void a() {
        this.m.q.blockBack2();
    }

    @Override
    public final void a(x object) {
        if (this.n != null) {
            return;
        }
        Object object2 = ((x)object).d;
        int n2 = 0;
        boolean bl = object2 != null;
        object2 = ((x)object).c;
        ArrayList<a.a.e.c> arrayList = new ArrayList<a.a.e.c>(((q)object2).a.length / 2 + 4);
        arrayList.add(new a.a.e.c(a.a.e.c.c, ((x)object).b));
        arrayList.add(new a.a.e.c(a.a.e.c.d, a.a.c.i.a(((x)object).a)));
        String string = ((x)object).a("Host");
        if (string != null) {
            arrayList.add(new a.a.e.c(a.a.e.c.f, string));
        }
        arrayList.add(new a.a.e.c(a.a.e.c.e, object.a.a));
        int n3 = ((q)object2).a.length / 2;
        do {
            if (n2 >= n3) {
                this.n = this.m.a(arrayList, bl);
                this.n.i.a(this.l.z, TimeUnit.MILLISECONDS);
                this.n.j.a(this.l.A, TimeUnit.MILLISECONDS);
                return;
            }
            object = b.f.a(((q)object2).a(n2).toLowerCase(Locale.US));
            if (!j.contains(object)) {
                arrayList.add(new a.a.e.c((b.f)object, ((q)object2).b(n2)));
            }
            ++n2;
        } while (true);
    }

    @Override
    public final void b() {
        this.n.d().close();
    }

    final class a
    extends b.g {
        public a(b.r r2) {
            super(r2);
        }

        @Override
        public final void close() {
            f.this.a.a(false, f.this);
            super.close();
        }
    }

}

