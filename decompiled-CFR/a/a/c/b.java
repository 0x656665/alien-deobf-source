/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.c;

import a.a.c;
import a.a.c.f;
import a.a.c.g;
import a.aa;
import a.p;
import a.s;
import a.x;
import a.y;
import a.z;
import b.d;
import b.k;
import b.q;
import java.net.ProtocolException;

public final class b
implements s {
    private final boolean a;

    public b(boolean bl) {
        this.a = bl;
    }

    @Override
    public final z a(s.a object) {
        Object object2 = (g)object;
        a.a.c.c c2 = ((g)object2).b;
        a.a.b.g g2 = ((g)object2).a;
        x x2 = object.a();
        long l2 = System.currentTimeMillis();
        c2.a(x2);
        boolean bl = f.b(x2.b);
        Object var7_8 = null;
        object2 = null;
        object = var7_8;
        if (bl) {
            object = var7_8;
            if (x2.d != null) {
                if ("100-continue".equalsIgnoreCase(x2.a("Expect"))) {
                    c2.a();
                    object2 = c2.a(true);
                }
                object = object2;
                if (object2 == null) {
                    object = k.a(c2.a(x2, x2.d.b()));
                    x2.d.a((d)object);
                    object.close();
                    object = object2;
                }
            }
        }
        c2.b();
        object2 = object;
        if (object == null) {
            object2 = c2.a(false);
        }
        ((z.a)object2).a = x2;
        ((z.a)object2).e = g2.b().c;
        ((z.a)object2).k = l2;
        ((z.a)object2).l = System.currentTimeMillis();
        object = ((z.a)object2).a();
        int n2 = ((z)object).c;
        if (this.a && n2 == 101) {
            object = ((z)object).a();
            ((z.a)object).g = c.c;
            object = ((z.a)object).a();
        } else {
            object2 = ((z)object).a();
            ((z.a)object2).g = c2.a((z)object);
            object = ((z.a)object2).a();
        }
        if ("close".equalsIgnoreCase(((z)object).a.a("Connection")) || "close".equalsIgnoreCase(((z)object).decrypt_str("Connection"))) {
            g2.d();
        }
        if (n2 != 204) {
            if (n2 != 205) return object;
        }
        if (((z)object).g.b() <= 0L) {
            return object;
        }
        object2 = new StringBuilder("HTTP ");
        ((StringBuilder)object2).append(n2);
        ((StringBuilder)object2).append(" had non-zero Content-Length: ");
        ((StringBuilder)object2).append(((z)object).g.b());
        throw new ProtocolException(((StringBuilder)object2).toString());
    }
}

