package a.a.e;

import a.a.b.*;
import b.*;
import a.a.c.*;
import a.a.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;
import a.*;

public final class f implements c
{
    private static final b.f b;
    private static final b.f c;
    private static final b.f d;
    private static final b.f e;
    private static final b.f f;
    private static final b.f g;
    private static final b.f h;
    private static final b.f i;
    private static final List<b.f> j;
    private static final List<b.f> k;
    final g a;
    private final u l;
    private final a.a.e.g m;
    private i n;
    
    static {
        b = b.f.a("connection");
        c = b.f.a("host");
        d = b.f.a("keep-alive");
        e = b.f.a("proxy-connection");
        f = b.f.a("transfer-encoding");
        g = b.f.a("te");
        h = b.f.a("encoding");
        i = b.f.a("upgrade");
        j = a.a.c.a(a.a.e.f.b, a.a.e.f.c, a.a.e.f.d, a.a.e.f.e, a.a.e.f.g, a.a.e.f.f, a.a.e.f.h, a.a.e.f.i, a.a.e.c.c, a.a.e.c.d, a.a.e.c.e, a.a.e.c.f);
        k = a.a.c.a(a.a.e.f.b, a.a.e.f.c, a.a.e.f.d, a.a.e.f.e, a.a.e.f.g, a.a.e.f.f, a.a.e.f.h, a.a.e.f.i);
    }
    
    public f(final u l, final g a, final a.a.e.g m) {
        super();
        this.l = l;
        this.a = a;
        this.m = m;
    }
    
    @Override
    public final aa a(final z z) {
        return new h(z.f, b.k.a(new a(this.n.g)));
    }
    
    @Override
    public final z.a a(final boolean b) {
        final List<a.a.e.c> c = this.n.c();
        q.a a = new q.a();
        final int size = c.size();
        int i = 0;
        a.a.c.k k = null;
        while (i < size) {
            final a.a.e.c c2 = c.get(i);
            a.a.c.k a2;
            q.a a3;
            if (c2 == null) {
                a2 = k;
                a3 = a;
                if (k != null) {
                    a2 = k;
                    a3 = a;
                    if (k.b == 100) {
                        a3 = new q.a();
                        a2 = null;
                    }
                }
            }
            else {
                final b.f g = c2.g;
                final String a4 = c2.h.a();
                if (g.equals(a.a.e.c.b)) {
                    a2 = a.a.c.k.a("HTTP/1.1 ".concat(String.valueOf(a4)));
                    a3 = a;
                }
                else {
                    a2 = k;
                    a3 = a;
                    if (!a.a.e.f.k.contains(g)) {
                        a.a.a.a.a(a, g.a(), a4);
                        a3 = a;
                        a2 = k;
                    }
                }
            }
            ++i;
            k = a2;
            a = a3;
        }
        if (k == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        final z.a a5 = new z.a();
        a5.b = v.d;
        a5.c = k.b;
        a5.d = k.c;
        final z.a a6 = a5.a(a.a());
        if (b && a.a.a.a.a(a6) == 100) {
            return null;
        }
        return a6;
    }
    
    @Override
    public final b.q a(final x x, final long n) {
        return this.n.d();
    }
    
    @Override
    public final void a() {
        this.m.q.blockBack2();
    }
    
    @Override
    public final void a(final x x) {
        if (this.n != null) {
            return;
        }
        final y d = x.d;
        int i = 0;
        final boolean b = d != null;
        final q c = x.c;
        final ArrayList list = new ArrayList<a.a.e.c>(c.a.length / 2 + 4);
        list.add(new a.a.e.c(a.a.e.c.c, x.b));
        list.add(new a.a.e.c(a.a.e.c.d, a.a.c.i.a(x.a)));
        final String a = x.a("Host");
        if (a != null) {
            list.add(new a.a.e.c(a.a.e.c.f, a));
        }
        list.add(new a.a.e.c(a.a.e.c.e, x.a.a));
        while (i < c.a.length / 2) {
            final b.f a2 = b.f.a(c.a(i).toLowerCase(Locale.US));
            if (!a.a.e.f.j.contains(a2)) {
                list.add(new a.a.e.c(a2, c.b(i)));
            }
            ++i;
        }
        this.n = this.m.a((List<a.a.e.c>)list, b);
        this.n.i.a(this.l.z, TimeUnit.MILLISECONDS);
        this.n.j.a(this.l.A, TimeUnit.MILLISECONDS);
    }
    
    @Override
    public final void b() {
        this.n.d().close();
    }
    
    final class a extends g
    {
        final /* synthetic */ f a;
        
        public a(final f a, final r r) {
            this.a = a;
            super(r);
        }
        
        @Override
        public final void close() {
            this.a.a.a(false, this.a);
            super.close();
        }
    }
}
