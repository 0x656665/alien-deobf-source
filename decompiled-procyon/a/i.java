package a;

import java.util.concurrent.*;
import java.lang.ref.*;
import a.a.b.*;
import a.a.g.*;
import java.util.*;

public final class i
{
    static final Executor a;
    static final /* synthetic */ boolean g;
    final int b;
    final Runnable c;
    final Deque<c> d;
    final d e;
    boolean f;
    private final long h;
    
    static {
        g = (i.class.desiredAssertionStatus() ^ true);
        a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), a.a.c.a("OkHttp ConnectionPool", true));
    }
    
    public i() {
        this(TimeUnit.MINUTES);
    }
    
    private i(final TimeUnit timeUnit) {
        super();
        this.c = new Runnable() {
            final /* synthetic */ i a;
            
            i$1() {
                this.a = a;
                super();
            }
            
            @Override
            public final void run() {
                while (true) {
                    final long a = this.a.a(System.nanoTime());
                    if (a == -1L) {
                        break;
                    }
                    if (a <= 0L) {
                        continue;
                    }
                    final long n = a / 1000000L;
                    final i a2 = this.a;
                    // monitorenter(a2)
                    while (true) {
                        try {
                            try {
                                this.a.wait(n, (int)(a - 1000000L * n));
                            }
                            finally {
                            }
                            // monitorexit(a2)
                            // monitorexit(a2)
                        }
                        catch (InterruptedException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        };
        this.d = new ArrayDeque<c>();
        this.e = new d();
        this.b = 5;
        this.h = timeUnit.toNanos(5L);
    }
    
    final long a(long n) {
        Iterator<c> iterator;
        long n2;
        c c;
        int n3;
        int n4 = 0;
        c c2;
        List<Reference<g>> j;
        int i = 0;
        Reference<g> reference;
        g.a a;
        StringBuilder sb;
        long n5;
        Label_0026_Outer:Label_0219_Outer:
        while (true) {
            while (true) {
            Block_8_Outer:
                while (true) {
                    Label_0351: {
                        synchronized (this) {
                            iterator = this.d.iterator();
                            n2 = Long.MIN_VALUE;
                            c = null;
                            n3 = 0;
                            n4 = 0;
                            if (iterator.hasNext()) {
                                c2 = iterator.next();
                                j = c2.j;
                                i = 0;
                                while (i < j.size()) {
                                    reference = j.get(i);
                                    if (reference.get() != null) {
                                        ++i;
                                    }
                                    else {
                                        a = (g.a)reference;
                                        sb = new StringBuilder("A connection to ");
                                        sb.append(c2.a.a.a);
                                        sb.append(" was leaked. Did you forget to close a response body?");
                                        a.a.g.e.b().a(sb.toString(), a.a);
                                        j.remove(i);
                                        c2.g = true;
                                        if (j.isEmpty()) {
                                            c2.k = n - this.h;
                                            i = 0;
                                            break Label_0351;
                                        }
                                        continue Label_0026_Outer;
                                    }
                                }
                                i = j.size();
                                break Label_0351;
                            }
                            if (n2 >= this.h || n3 > this.b) {
                                this.d.remove(c);
                                // monitorexit(this)
                                a.a.c.a(c.b);
                                return 0L;
                            }
                            if (n3 > 0) {
                                n = this.h;
                                // monitorexit(this)
                                return n - n2;
                            }
                            if (n4 > 0) {
                                n = this.h;
                                return n;
                            }
                            this.f = false;
                            return -1L;
                            while (true) {
                                c = c2;
                                n2 = n5;
                                n3 = i;
                                continue Block_8_Outer;
                                i = n3 + 1;
                                n5 = n - c2.k;
                                n3 = i;
                                continue Label_0219_Outer;
                            }
                        }
                        // \u0131ftrue(Label_0026:, n5 <= n2)
                    }
                    if (i > 0) {
                        ++n4;
                        continue Label_0219_Outer;
                    }
                    break;
                }
                continue;
            }
        }
    }
}
