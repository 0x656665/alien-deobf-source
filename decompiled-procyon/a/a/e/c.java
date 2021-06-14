package a.a.e;

import b.*;

public final class c
{
    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    public final f g;
    public final f h;
    final int i;
    
    static {
        a = b.f.a(":");
        b = b.f.a(":status");
        c = b.f.a(":method");
        d = b.f.a(":path");
        e = b.f.a(":scheme");
        f = b.f.a(":authority");
    }
    
    public c(final f g, final f h) {
        super();
        this.g = g;
        this.h = h;
        this.i = g.g() + 32 + h.g();
    }
    
    public c(final f f, final String s) {
        this(f, b.f.a(s));
    }
    
    public c(final String s, final String s2) {
        this(b.f.a(s), b.f.a(s2));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof c) {
            final c c = (c)o;
            return this.g.equals(c.g) && this.h.equals(c.h);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.g.hashCode() + 527) * 31 + this.h.hashCode();
    }
    
    @Override
    public final String toString() {
        return a.a.c.a("%s: %s", this.g.a(), this.h.a());
    }
}
