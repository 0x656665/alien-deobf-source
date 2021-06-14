package a.a.e;

import b.*;
import java.io.*;

final class b implements r
{
    static final /* synthetic */ boolean c;
    boolean a;
    boolean b;
    final /* synthetic */ i d;
    private final b.c e;
    private final b.c f;
    private final long g;
    
    static {
        c = (i.class.desiredAssertionStatus() ^ true);
    }
    
    b(final i d, final long g) {
        this.d = d;
        super();
        this.e = new b.c();
        this.f = new b.c();
        this.g = g;
    }
    
    private void blockBack2() {
        this.d.i.a_();
        try {
            while (this.f.b == 0L && !this.b && !this.a && this.d.k == null) {
                this.d.h();
            }
        }
        finally {
            this.d.i.b();
        }
    }
    
    @Override
    public final long a(final b.c c, long a) {
        if (a >= 0L) {
            synchronized (this.d) {
                this.blockBack2();
                if (!this.a) {
                    if (this.d.k == null) {
                        if (this.f.b == 0L) {
                            return -1L;
                        }
                        a = this.f.a(c, Math.min(a, this.f.b));
                        final i d = this.d;
                        d.a += a;
                        if (this.d.a >= this.d.d.m.b() / 2) {
                            this.d.d.a(this.d.c, this.d.a);
                            this.d.a = 0L;
                        }
                        // monitorexit(this.d)
                        synchronized (this.d.d) {
                            final g d2 = this.d.d;
                            d2.k += a;
                            if (this.d.d.k >= this.d.d.m.b() / 2) {
                                this.d.d.a(0, this.d.d.k);
                                this.d.d.k = 0L;
                            }
                            return a;
                        }
                    }
                    throw new o(this.d.k);
                }
                throw new IOException("stream closed");
            }
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(a)));
    }
    
    @Override
    public final s a() {
        return this.d.i;
    }
    
    final void a(final e e, long n) {
        long n2 = n;
        if (!a.a.e.i.b.c) {
            if (Thread.holdsLock(this.d)) {
                throw new AssertionError();
            }
            n2 = n;
        }
    Label_0234:
        while (n2 > 0L) {
            while (true) {
                while (true) {
                    Label_0235: {
                        synchronized (this.d) {
                            final boolean b = this.b;
                            n = this.f.b;
                            final long g = this.g;
                            final int n3 = 0;
                            if (n + n2 <= g) {
                                break Label_0235;
                            }
                            final int n4 = 1;
                            // monitorexit(this.d)
                            if (n4 != 0) {
                                e.f(n2);
                                this.d.b(a.a.e.b.d);
                                return;
                            }
                            if (b) {
                                e.f(n2);
                                return;
                            }
                            n = e.a(this.e, n2);
                            if (n != -1L) {
                                n2 -= n;
                                final i d = this.d;
                                // monitorenter(this.d)
                                int n5 = n3;
                                try {
                                    if (this.f.b == 0L) {
                                        n5 = 1;
                                    }
                                    this.f.a(this.e);
                                    if (n5 != 0) {
                                        this.d.notifyAll();
                                    }
                                    break;
                                }
                                finally {
                                }
                                // monitorexit(this.d)
                            }
                            throw new EOFException();
                        }
                        break Label_0234;
                    }
                    final int n4 = 0;
                    continue;
                }
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.d) {
            this.a = true;
            this.f.o();
            this.d.notifyAll();
            // monitorexit(this.d)
            this.d.f();
        }
    }
}
