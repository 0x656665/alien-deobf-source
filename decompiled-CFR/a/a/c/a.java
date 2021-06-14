/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.c;

import a.a.c;
import a.a.c.e;
import a.a.c.h;
import a.aa;
import a.k;
import a.l;
import a.q;
import a.r;
import a.s;
import a.t;
import a.x;
import a.y;
import a.z;
import b.i;
import java.util.List;

public final class a
implements s {
    private final l a;

    public a(l l2) {
        this.a = l2;
    }

    @Override
    public final z a(s.a object) {
        boolean bl;
        Object object2;
        Object object3 = object.a();
        Object object4 = ((x)object3).a();
        Object object5 = ((x)object3).d;
        if (object5 != null) {
            long l2;
            object2 = ((y)object5).a();
            if (object2 != null) {
                ((x.a)object4).a("Content-Type", ((t)object2).toString());
            }
            if ((l2 = ((y)object5).b()) != -1L) {
                ((x.a)object4).a("Content-Length", Long.toString(l2));
                ((x.a)object4).a("Transfer-Encoding");
            } else {
                ((x.a)object4).a("Transfer-Encoding", "chunked");
                ((x.a)object4).a("Content-Length");
            }
        }
        object5 = ((x)object3).a("Host");
        int n2 = 0;
        if (object5 == null) {
            ((x.a)object4).a("Host", c.a(((x)object3).a, false));
        }
        if (((x)object3).a("Connection") == null) {
            ((x.a)object4).a("Connection", "Keep-Alive");
        }
        if (((x)object3).a("Accept-Encoding") == null && ((x)object3).a("Range") == null) {
            ((x.a)object4).a("Accept-Encoding", "gzip");
            bl = true;
        } else {
            bl = false;
        }
        object5 = this.a.a();
        if (!object5.isEmpty()) {
            object2 = new StringBuilder();
            int n3 = object5.size();
            while (n2 < n3) {
                if (n2 > 0) {
                    ((StringBuilder)object2).append("; ");
                }
                k k2 = object5.get(n2);
                ((StringBuilder)object2).append(k2.a);
                ((StringBuilder)object2).append('=');
                ((StringBuilder)object2).append(k2.b);
                ++n2;
            }
            ((x.a)object4).a("Cookie", ((StringBuilder)object2).toString());
        }
        if (((x)object3).a("User-Agent") == null) {
            ((x.a)object4).a("User-Agent", "okhttp/3.6.0");
        }
        object4 = object.a(((x.a)object4).a());
        e.a(this.a, ((x)object3).a, ((z)object4).f);
        object = ((z)object4).a();
        ((z.a)object).a = object3;
        if (!bl) return ((z.a)object).a();
        if (!"gzip".equalsIgnoreCase(((z)object4).decrypt_str("Content-Encoding"))) return ((z.a)object).a();
        if (!e.b((z)object4)) return ((z.a)object).a();
        object3 = new i(((z)object4).g.c());
        object4 = ((z)object4).f.a().a("Content-Encoding").a("Content-Length").a();
        ((z.a)object).a((q)object4);
        ((z.a)object).g = new h((q)object4, b.k.a((b.r)object3));
        return ((z.a)object).a();
    }
}

