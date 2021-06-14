package a.a.c;

import java.util.*;
import a.*;

public final class g implements a
{
    public final a.a.b.g a;
    final c b;
    public final x c;
    private final List<s> d;
    private final h e;
    private final int f;
    private int g;
    
    public g(final List<s> d, final a.a.b.g a, final c b, final h e, final int f, final x c) {
        super();
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
    }
    
    private boolean a(final r r) {
        return r.b.equals(this.e.a().a.a.b) && r.c == this.e.a().a.a.c;
    }
    
    @Override
    public final x a() {
        return this.c;
    }
    
    @Override
    public final z a(final x x) {
        return this.a(x, this.a, this.b, this.e);
    }
    
    public final z a(final x x, final a.a.b.g g, final c c, final h h) {
        if (this.f >= this.d.size()) {
            throw new AssertionError();
        }
        ++this.g;
        if (this.b != null && !this.a(x.a)) {
            final StringBuilder sb = new StringBuilder("network interceptor ");
            sb.append(this.d.get(this.f - 1));
            sb.append(" must retain the same host and port");
            throw new IllegalStateException(sb.toString());
        }
        if (this.b != null && this.g > 1) {
            final StringBuilder sb2 = new StringBuilder("network interceptor ");
            sb2.append(this.d.get(this.f - 1));
            sb2.append(" must call proceed() exactly once");
            throw new IllegalStateException(sb2.toString());
        }
        final g g2 = new g(this.d, g, c, h, this.f + 1, x);
        final s s = this.d.get(this.f);
        final z a = s.a((s.a)g2);
        if (c != null && this.f + 1 < this.d.size() && g2.g != 1) {
            final StringBuilder sb3 = new StringBuilder("network interceptor ");
            sb3.append(s);
            sb3.append(" must call proceed() exactly once");
            throw new IllegalStateException(sb3.toString());
        }
        if (a != null) {
            return a;
        }
        final StringBuilder sb4 = new StringBuilder("interceptor ");
        sb4.append(s);
        sb4.append(" returned null");
        throw new NullPointerException(sb4.toString());
    }
}
