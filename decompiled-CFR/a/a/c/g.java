/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.c;

import a.a;
import a.a.c.c;
import a.ab;
import a.h;
import a.r;
import a.s;
import a.x;
import a.z;
import java.util.List;

public final class g
implements s.a {
    public final a.a.b.g a;
    final c b;
    public final x c;
    private final List<s> d;
    private final h e;
    private final int f;
    private int g;

    public g(List<s> list, a.a.b.g g2, c c2, h h2, int n2, x x2) {
        this.d = list;
        this.e = h2;
        this.a = g2;
        this.b = c2;
        this.f = n2;
        this.c = x2;
    }

    private boolean a(r r2) {
        if (!r2.b.equals(this.e.a().a.a.b)) return false;
        if (r2.c != this.e.a().a.a.c) return false;
        return true;
    }

    @Override
    public final x a() {
        return this.c;
    }

    @Override
    public final z a(x x2) {
        return this.a(x2, this.a, this.b, this.e);
    }

    public final z a(x object, a.a.b.g object2, c c2, h object3) {
        if (this.f >= this.d.size()) throw new AssertionError();
        ++this.g;
        if (this.b != null && !this.a(((x)object).a)) {
            object = new StringBuilder("network interceptor ");
            ((StringBuilder)object).append(this.d.get(this.f - 1));
            ((StringBuilder)object).append(" must retain the same host and port");
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        if (this.b != null && this.g > 1) {
            object = new StringBuilder("network interceptor ");
            ((StringBuilder)object).append(this.d.get(this.f - 1));
            ((StringBuilder)object).append(" must call proceed() exactly once");
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        object2 = new g(this.d, (a.a.b.g)object2, c2, (h)object3, this.f + 1, (x)object);
        object = this.d.get(this.f);
        object3 = object.a((s.a)object2);
        if (c2 != null && this.f + 1 < this.d.size() && ((g)object2).g != 1) {
            object2 = new StringBuilder("network interceptor ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(" must call proceed() exactly once");
            throw new IllegalStateException(((StringBuilder)object2).toString());
        }
        if (object3 != null) {
            return object3;
        }
        object2 = new StringBuilder("interceptor ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(" returned null");
        throw new NullPointerException(((StringBuilder)object2).toString());
    }
}

