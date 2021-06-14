/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.c;

import a.a.c.e;
import a.aa;
import a.q;
import a.t;

public final class h
extends aa {
    private final q a;
    private final b.e b;

    public h(q q2, b.e e2) {
        this.a = q2;
        this.b = e2;
    }

    @Override
    public final t a() {
        String string = this.a.a("Content-Type");
        if (string == null) return null;
        return t.a(string);
    }

    @Override
    public final long b() {
        return e.a(this.a);
    }

    @Override
    public final b.e c() {
        return this.b;
    }
}

