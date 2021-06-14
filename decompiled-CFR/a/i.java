/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a;
import a.a.b.d;
import a.a.b.g;
import a.a.c;
import a.a.g.e;
import a.ab;
import a.r;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class i {
    static final Executor a;
    static final /* synthetic */ boolean g;
    final int b;
    final Runnable c = new Runnable(){

        @Override
        public final void run() {
            Throwable throwable2;
            do {
                long l2;
                if ((l2 = i.this.a(System.nanoTime())) == -1L) {
                    return;
                }
                if (l2 <= 0L) continue;
                long l3 = l2 / 1000000L;
                i i2 = i.this;
                synchronized (i2) {
                    try {
                        try {
                            i.this.wait(l3, (int)(l2 - 1000000L * l3));
                        }
                        catch (InterruptedException interruptedException) {}
                        continue;
                    }
                    catch (Throwable throwable2) {}
                    break;
                }
            } while (true);
            {
                throw throwable2;
            }
        }
    };
    final Deque<a.a.b.c> d = new ArrayDeque<a.a.b.c>();
    final d e = new d();
    boolean f;
    private final long h;

    static {
        g = i.class.desiredAssertionStatus() ^ true;
        a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), c.a("OkHttp ConnectionPool", true));
    }

    public i() {
        this(TimeUnit.MINUTES);
    }

    private i(TimeUnit timeUnit) {
        this.b = 5;
        this.h = timeUnit.toNanos(5L);
    }

    /*
     * Enabled unnecessary exception pruning
     */
    final long a(long l2) {
        synchronized (this) {
            Iterator<a.a.b.c> iterator = this.d.iterator();
            long l3 = Long.MIN_VALUE;
            a.a.b.c c2 = null;
            int n2 = 0;
            int n3 = 0;
            do {
                a.a.b.c c3;
                int n4;
                block13 : {
                    List<Reference<g>> list;
                    if (iterator.hasNext()) {
                        c3 = iterator.next();
                        list = c3.j;
                        n4 = 0;
                    } else {
                        if (l3 < this.h && n2 <= this.b) {
                            if (n2 > 0) {
                                l2 = this.h;
                                return l2 - l3;
                            }
                            if (n3 > 0) {
                                return this.h;
                            }
                            this.f = false;
                            return -1L;
                        }
                        this.d.remove(c2);
                        // MONITOREXIT [3, 4, 11] lbl25 : MonitorExitStatement: MONITOREXIT : this
                        c.a(c2.b);
                        return 0L;
                    }
                    while (n4 < list.size()) {
                        g.a a2 = list.get(n4);
                        if (a2.get() != null) {
                            ++n4;
                            continue;
                        }
                        a2 = a2;
                        CharSequence charSequence = new StringBuilder("A connection to ");
                        charSequence.append(c3.a.a.a);
                        charSequence.append(" was leaked. Did you forget to close a response body?");
                        charSequence = charSequence.toString();
                        e.b().a((String)charSequence, a2.a);
                        list.remove(n4);
                        c3.g = true;
                        if (!list.isEmpty()) continue;
                        c3.k = l2 - this.h;
                        n4 = 0;
                        break block13;
                    }
                    n4 = list.size();
                }
                if (n4 > 0) {
                    ++n3;
                    continue;
                }
                n4 = n2 + 1;
                long l4 = l2 - c3.k;
                n2 = n4;
                if (l4 <= l3) continue;
                c2 = c3;
                l3 = l4;
                n2 = n4;
            } while (true);
        }
    }

}

