package a.a.e;

import b.*;

final class a implements q
{
    static final /* synthetic */ boolean c;
    boolean a;
    boolean b;
    final /* synthetic */ i d;
    private final b.c e;
    
    static {
        c = (i.class.desiredAssertionStatus() ^ true);
    }
    
    a(final i d) {
        this.d = d;
        super();
        this.e = new b.c();
    }
    
    private void a(final boolean b) {
        while (true) {
            Object o = this.d;
            while (true) {
                synchronized (o) {
                    this.d.j.a_();
                    try {
                        while (this.d.b <= 0L && !this.b && !this.a && this.d.k == null) {
                            this.d.h();
                        }
                        this.d.j.b();
                        this.d.g();
                        final long min = Math.min(this.d.b, this.e.b);
                        final i d = this.d;
                        d.b -= min;
                        // monitorexit(o)
                        this.d.j.a_();
                        try {
                            o = this.d.d;
                            final int c = this.d.c;
                            if (b && min == this.e.b) {
                                final boolean b2 = true;
                                ((g)o).a(c, b2, this.e, min);
                                return;
                            }
                        }
                        finally {
                            this.d.j.b();
                        }
                    }
                    finally {
                        this.d.j.b();
                    }
                }
                final boolean b2 = false;
                continue;
            }
        }
    }
    
    @Override
    public final s a() {
        return this.d.j;
    }
    
    @Override
    public final void a_(final b.c c, final long n) {
        if (!a.a.e.i.a.c && Thread.holdsLock(this.d)) {
            throw new AssertionError();
        }
        this.e.a_(c, n);
        while (this.e.b >= 16384L) {
            this.a(false);
        }
    }
    
    @Override
    public final void close() {
        if (!a.a.e.i.a.c && Thread.holdsLock(this.d)) {
            throw new AssertionError();
        }
        synchronized (this.d) {
            if (this.a) {
                return;
            }
            // monitorexit(this.d)
            if (!this.d.h.b) {
                if (this.e.b > 0L) {
                    while (this.e.b > 0L) {
                        this.a(true);
                    }
                }
                else {
                    this.d.d.a(this.d.c, true, null, 0L);
                }
            }
            final i d = this.d;
            synchronized (this.d) {
                this.a = true;
                // monitorexit(this.d)
                this.d.d.q.blockBack2();
                this.d.f();
            }
        }
    }
    
    @Override
    public final void flush() {
        if (!a.a.e.i.a.c && Thread.holdsLock(this.d)) {
            throw new AssertionError();
        }
        synchronized (this.d) {
            this.d.g();
            // monitorexit(this.d)
            while (this.e.b > 0L) {
                this.a(false);
                this.d.d.q.blockBack2();
            }
        }
    }
}
