package b;

import java.util.concurrent.*;
import java.io.*;

public class a extends s
{
    private static final long a;
    private static final long c;
    private static a d;
    private boolean e;
    private a f;
    private long g;
    
    static {
        a = TimeUnit.SECONDS.toMillis(60L);
        c = TimeUnit.MILLISECONDS.toNanos(b.a.a);
    }
    
    public a() {
        super();
    }
    
    private static void a(final a f, long g, final boolean b) {
        synchronized (a.class) {
            if (b.a.d == null) {
                b.a.d = new a();
                new a().start();
            }
            final long nanoTime = System.nanoTime();
            if (g != 0L && b) {
                f.g = Math.min(g, f.c() - nanoTime) + nanoTime;
            }
            else if (g != 0L) {
                f.g = g + nanoTime;
            }
            else {
                if (!b) {
                    throw new AssertionError();
                }
                f.g = f.c();
            }
            a a;
            for (g = f.g, a = b.a.d; a.f != null && g - nanoTime >= a.f.g - nanoTime; a = a.f) {}
            f.f = a.f;
            a.f = f;
            if (a == b.a.d) {
                a.class.notify();
            }
        }
    }
    
    private static boolean a(final a a) {
        synchronized (a.class) {
            for (a a2 = a.d; a2 != null; a2 = a2.f) {
                if (a2.f == a) {
                    a2.f = a.f;
                    a.f = null;
                    return false;
                }
            }
            return true;
        }
    }
    
    static a e() {
        final a f = b.a.d.f;
        if (f == null) {
            final long nanoTime = System.nanoTime();
            a.class.wait(b.a.a);
            if (b.a.d.f == null && System.nanoTime() - nanoTime >= b.a.c) {
                return b.a.d;
            }
            return null;
        }
        else {
            final long n = f.g - System.nanoTime();
            if (n > 0L) {
                final long n2 = n / 1000000L;
                a.class.wait(n2, (int)(n - 1000000L * n2));
                return null;
            }
            b.a.d.f = f.f;
            f.f = null;
            return f;
        }
    }
    
    static /* synthetic */ a f() {
        return b.a.d;
    }
    
    static /* synthetic */ a g() {
        return b.a.d = null;
    }
    
    protected IOException a(final IOException ex) {
        final InterruptedIOException ex2 = new InterruptedIOException("timeout");
        if (ex != null) {
            ex2.initCause(ex);
        }
        return ex2;
    }
    
    protected void a() {
    }
    
    final void a(final boolean b) {
        if (!this.b_()) {
            return;
        }
        if (!b) {
            return;
        }
        throw this.a((IOException)null);
    }
    
    public final void a_() {
        if (this.e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        final long c_ = this.c_();
        final boolean d_ = this.d_();
        if (c_ == 0L && !d_) {
            return;
        }
        this.e = true;
        a(this, c_, d_);
    }
    
    final IOException b(final IOException ex) {
        if (!this.b_()) {
            return ex;
        }
        return this.a(ex);
    }
    
    public final boolean b_() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return a(this);
    }
    
    static final class a extends Thread
    {
        public a() {
            super("Okio Watchdog");
            this.setDaemon(true);
        }
        
        @Override
        public final void run() {
            while (true) {
                try {
                    while (true) {
                        synchronized (b.a.class) {
                            final b.a e = b.a.e();
                            if (e == null) {
                                continue;
                            }
                            if (e == b.a.d) {
                                b.a.d = null;
                                return;
                            }
                            // monitorexit(a.class)
                            e.a();
                            continue;
                        }
                    }
                }
                catch (InterruptedException ex) {
                    continue;
                }
                break;
            }
        }
    }
}
