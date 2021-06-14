/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import b.c;
import b.n;
import b.q;
import b.r;
import b.s;
import b.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class a
extends s {
    private static final long a = TimeUnit.SECONDS.toMillis(60L);
    private static final long c = TimeUnit.MILLISECONDS.toNanos(a);
    private static a d;
    private boolean e;
    private a f;
    private long g;

    private static void a(a a2, long l2, boolean bl) {
        synchronized (a.class) {
            if (d == null) {
                d = new a();
                new a().start();
            }
            long l3 = System.nanoTime();
            if (l2 != 0L && bl) {
                a2.g = Math.min(l2, a2.c() - l3) + l3;
            } else if (l2 != 0L) {
                a2.g = l2 + l3;
            } else {
                if (!bl) throw new AssertionError();
                a2.g = a2.c();
            }
            l2 = a2.g;
            a a3 = d;
            while (a3.f != null && l2 - l3 >= a3.f.g - l3) {
                a3 = a3.f;
            }
            a2.f = a3.f;
            a3.f = a2;
            if (a3 != d) return;
            a.class.notify();
            return;
        }
    }

    private static boolean a(a a2) {
        synchronized (a.class) {
            a a3 = d;
            while (a3 != null) {
                if (a3.f == a2) {
                    a3.f = a2.f;
                    a2.f = null;
                    return false;
                }
                a3 = a3.f;
            }
            return true;
        }
    }

    static a e() {
        a a2 = a.d.f;
        if (a2 == null) {
            long l2 = System.nanoTime();
            a.class.wait(a);
            if (a.d.f != null) return null;
            if (System.nanoTime() - l2 < c) return null;
            return d;
        }
        long l3 = System.nanoTime();
        if ((l3 = a2.g - l3) > 0L) {
            long l4 = l3 / 1000000L;
            a.class.wait(l4, (int)(l3 - 1000000L * l4));
            return null;
        }
        a.d.f = a2.f;
        a2.f = null;
        return a2;
    }

    protected IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException == null) return interruptedIOException;
        interruptedIOException.initCause(iOException);
        return interruptedIOException;
    }

    protected void a() {
    }

    final void a(boolean bl) {
        if (!this.b_()) return;
        if (bl) throw this.a(null);
    }

    public final void a_() {
        if (this.e) throw new IllegalStateException("Unbalanced enter/exit");
        long l2 = this.c_();
        boolean bl = this.d_();
        if (l2 == 0L && !bl) {
            return;
        }
        this.e = true;
        a.a(this, l2, bl);
    }

    final IOException b(IOException iOException) {
        if (this.b_()) return this.a(iOException);
        return iOException;
    }

    public final boolean b_() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return a.a(this);
    }

    static final class a
    extends Thread {
        public a() {
            super("Okio Watchdog");
            this.setDaemon(true);
        }

        /*
         * Enabled unnecessary exception pruning
         * Converted monitor instructions to comments
         */
        @Override
        public final void run() {
            do {
                a a2;
                if ((a2 = a.e()) == null) {
                    // MONITOREXIT : b.a.class
                    continue;
                }
                if (a2 == d) {
                    d = null;
                    // MONITOREXIT : b.a.class
                    return;
                }
                // MONITOREXIT : b.a.class
                try {
                    a2.a();
                }
                catch (InterruptedException interruptedException) {
                }
            } while (true);
        }
    }

}

