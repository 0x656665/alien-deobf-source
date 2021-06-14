package a.a.b;

import java.io.*;
import a.*;
import java.util.concurrent.*;
import a.a.e.*;
import java.net.*;
import java.lang.ref.*;

public final class g
{
    public static final /* synthetic */ boolean e;
    public final a.a a;
    public final i b;
    public c c;
    public a.a.c.c d;
    private ab f;
    private final Object g;
    private final f h;
    private int i;
    private boolean j;
    private boolean k;
    
    static {
        e = (g.class.desiredAssertionStatus() ^ true);
    }
    
    public g(final i b, final a.a a, final Object g) {
        super();
        this.b = b;
        this.a = a;
        this.h = new f(a, this.f());
        this.g = g;
    }
    
    private c a(final int n, final int n2, final int n3, final boolean b) {
        Object f = this.b;
        synchronized (f) {
            if (this.j) {
                throw new IllegalStateException("released");
            }
            if (this.d == null) {
                if (!this.k) {
                    final c c = this.c;
                    if (c != null && !c.g) {
                        return c;
                    }
                    a.a.a.a.a(this.b, this.a, this);
                    if (this.c != null) {
                        return this.c;
                    }
                    final ab f2 = this.f;
                    // monitorexit(f)
                    if ((f = f2) == null) {
                        f = this.h.a();
                    }
                    Object o = this.b;
                    synchronized (o) {
                        this.f = (ab)f;
                        this.i = 0;
                        final c c2 = new c(this.b, (ab)f);
                        this.a(c2);
                        if (!this.k) {
                            // monitorexit(o)
                            c2.a(n, n2, n3, b);
                            this.f().b(c2.a);
                            o = null;
                            synchronized (this.b) {
                                a.a.a.a.b(this.b, c2);
                                c c3 = c2;
                                if (c2.b()) {
                                    o = a.a.a.a.b(this.b, this.a, this);
                                    c3 = this.c;
                                }
                                // monitorexit(this.b)
                                a.a.c.a((Socket)o);
                                return c3;
                            }
                        }
                        throw new IOException("Canceled");
                    }
                }
                throw new IOException("Canceled");
            }
            throw new IllegalStateException("codec != null");
        }
    }
    
    private c a(final int n, final int n2, final int n3, final boolean b, final boolean b2) {
        while (true) {
            final c a = this.a(n, n2, n3, b);
            synchronized (this.b) {
                if (a.h == 0) {
                    return a;
                }
                // monitorexit(this.b)
                if (a.a(b2)) {
                    return a;
                }
                this.d();
            }
        }
    }
    
    private void b(final c c) {
        for (int size = c.j.size(), i = 0; i < size; ++i) {
            if (c.j.get(i).get() == this) {
                c.j.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }
    
    private d f() {
        return a.a.a.a.a(this.b);
    }
    
    public final a.a.c.c a() {
        synchronized (this.b) {
            return this.d;
        }
    }
    
    public final a.a.c.c a(final u u, final boolean b) {
        final int y = u.y;
        final int z = u.z;
        final int a = u.A;
        final boolean x = u.x;
        try {
            final c a2 = this.a(y, z, a, x, b);
            a.a.c.c d;
            if (a2.d != null) {
                d = new a.a.e.f(u, this, a2.d);
            }
            else {
                a2.b.setSoTimeout(u.z);
                a2.e.a().a(u.z, TimeUnit.MILLISECONDS);
                a2.f.a().a(u.A, TimeUnit.MILLISECONDS);
                d = new a.a.d.a(u, this, a2.e, a2.f);
            }
            synchronized (this.b) {
                return this.d = d;
            }
        }
        catch (IOException ex) {
            throw new e(ex);
        }
    }
    
    public final Socket a(final boolean b, final boolean b2, final boolean b3) {
        if (!a.a.b.g.e && !Thread.holdsLock(this.b)) {
            throw new AssertionError();
        }
        if (b3) {
            this.d = null;
        }
        if (b2) {
            this.j = true;
        }
        if (this.c != null) {
            if (b) {
                this.c.g = true;
            }
            if (this.d == null && (this.j || this.c.g)) {
                this.b(this.c);
                Socket b4 = null;
                Label_0153: {
                    if (this.c.j.isEmpty()) {
                        this.c.k = System.nanoTime();
                        if (a.a.a.a.a(this.b, this.c)) {
                            b4 = this.c.b;
                            break Label_0153;
                        }
                    }
                    b4 = null;
                }
                this.c = null;
                return b4;
            }
        }
        return null;
    }
    
    public final void a(final c c) {
        if (!a.a.b.g.e && !Thread.holdsLock(this.b)) {
            throw new AssertionError();
        }
        if (this.c == null) {
            this.c = c;
            c.j.add(new a(this, this.g));
            return;
        }
        throw new IllegalStateException();
    }
    
    public final void a(final IOException ex) {
        while (true) {
            while (true) {
                Label_0221: {
                    Label_0216: {
                        synchronized (this.b) {
                            if (ex instanceof o) {
                                final o o = (o)ex;
                                if (o.a == a.a.e.b.e) {
                                    ++this.i;
                                }
                                if (o.a != a.a.e.b.e || this.i > 1) {
                                    this.f = null;
                                    break Label_0216;
                                }
                                break Label_0221;
                            }
                            else {
                                if (this.c == null || (this.c.b() && !(ex instanceof a.a.e.a))) {
                                    break Label_0221;
                                }
                                if (this.c.h == 0) {
                                    if (this.f != null && ex != null) {
                                        final f h = this.h;
                                        final ab f = this.f;
                                        if (f.b.type() != Proxy.Type.DIRECT && h.a.g != null) {
                                            h.a.g.connectFailed(h.a.a.a(), f.b.address(), ex);
                                        }
                                        h.b.a(f);
                                    }
                                    this.f = null;
                                }
                                break Label_0216;
                            }
                            final boolean b;
                            final Socket a = this.a(b, false, true);
                            // monitorexit(this.b)
                            a.a.c.a(a);
                            return;
                        }
                    }
                    final boolean b = true;
                    continue;
                }
                final boolean b = false;
                continue;
            }
        }
    }
    
    public final void a(final boolean b, final a.a.c.c c) {
        final i b2 = this.b;
        // monitorenter(b2)
        Label_0057: {
            if (c == null) {
                break Label_0057;
            }
            try {
                if (c == this.d) {
                    if (!b) {
                        final c c2 = this.c;
                        ++c2.h;
                    }
                    final Socket a = this.a(b, false, true);
                    // monitorexit(b2)
                    a.a.c.a(a);
                    return;
                }
                break Label_0057;
            }
            finally {
                // monitorexit(b2)
                final StringBuilder sb = new StringBuilder("expected ");
                sb.append(this.d);
                sb.append(" but was ");
                sb.append(c);
                throw new IllegalStateException(sb.toString());
            }
        }
    }
    
    public final c b() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public final void c() {
        synchronized (this.b) {
            final Socket a = this.a(false, true, false);
            // monitorexit(this.b)
            a.a.c.a(a);
        }
    }
    
    public final void d() {
        synchronized (this.b) {
            final Socket a = this.a(true, false, false);
            // monitorexit(this.b)
            a.a.c.a(a);
        }
    }
    
    public final boolean e() {
        if (this.f == null) {
            final f h = this.h;
            return h.c() || h.b() || h.d();
        }
        return true;
    }
    
    @Override
    public final String toString() {
        final c b = this.b();
        if (b != null) {
            return b.toString();
        }
        return this.a.toString();
    }
    
    public static final class a extends WeakReference<g>
    {
        public final Object a;
        
        a(final g g, final Object a) {
            super(g);
            this.a = a;
        }
    }
}
