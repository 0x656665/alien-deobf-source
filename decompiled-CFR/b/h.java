/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import b.s;
import java.util.concurrent.TimeUnit;

public final class h
extends s {
    public s a;

    public h(s s2) {
        if (s2 == null) throw new IllegalArgumentException("delegate == null");
        this.a = s2;
    }

    @Override
    public final s a(long l2) {
        return this.a.a(l2);
    }

    @Override
    public final s a(long l2, TimeUnit timeUnit) {
        return this.a.a(l2, timeUnit);
    }

    @Override
    public final long c() {
        return this.a.c();
    }

    @Override
    public final long c_() {
        return this.a.c_();
    }

    @Override
    public final s d() {
        return this.a.d();
    }

    @Override
    public final boolean d_() {
        return this.a.d_();
    }

    @Override
    public final s e_() {
        return this.a.e_();
    }

    @Override
    public final void f_() {
        this.a.f_();
    }
}

