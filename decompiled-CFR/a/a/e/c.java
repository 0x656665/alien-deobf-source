/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.e;

import b.f;

public final class c {
    public static final f a = f.a(":");
    public static final f b = f.a(":status");
    public static final f c = f.a(":method");
    public static final f d = f.a(":path");
    public static final f e = f.a(":scheme");
    public static final f f = f.a(":authority");
    public final f g;
    public final f h;
    final int i;

    public c(f f2, f f3) {
        this.g = f2;
        this.h = f3;
        this.i = f2.g() + 32 + f3.g();
    }

    public c(f f2, String string) {
        this(f2, f.a(string));
    }

    public c(String string, String string2) {
        this(f.a(string), f.a(string2));
    }

    public final boolean equals(Object object) {
        if (!(object instanceof c)) return false;
        object = (c)object;
        if (!this.g.equals(((c)object).g)) return false;
        if (!this.h.equals(((c)object).h)) return false;
        return true;
    }

    public final int hashCode() {
        return (this.g.hashCode() + 527) * 31 + this.h.hashCode();
    }

    public final String toString() {
        return a.a.c.a("%s: %s", new Object[]{this.g.a(), this.h.a()});
    }
}

