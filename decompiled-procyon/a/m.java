package a;

import a.a.*;
import java.util.concurrent.*;
import java.util.*;

public final class m
{
    private int a;
    private int b;
    private Runnable c;
    private ExecutorService d;
    private final Deque<w.a> e;
    private final Deque<w.a> f;
    private final Deque<w> g;
    
    public m() {
        super();
        this.a = 64;
        this.b = 5;
        this.e = new ArrayDeque<w.a>();
        this.f = new ArrayDeque<w.a>();
        this.g = new ArrayDeque<w>();
    }
    
    private ExecutorService a() {
        synchronized (this) {
            if (this.d == null) {
                this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), a.a.c.a("OkHttp Dispatcher", false));
            }
            return this.d;
        }
    }
    
    private <T> void a(final Deque<T> deque, final T t, final boolean b) {
        synchronized (this) {
            if (deque.remove(t)) {
                if (b) {
                    this.b();
                }
                final int c = this.c();
                final Runnable c2 = this.c;
                // monitorexit(this)
                if (c == 0 && c2 != null) {
                    c2.run();
                }
                return;
            }
            throw new AssertionError((Object)"Call wasn't in-flight!");
        }
    }
    
    private void b() {
        if (this.f.size() >= this.a) {
            return;
        }
        if (this.e.isEmpty()) {
            return;
        }
        final Iterator<w.a> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            final w.a a = iterator.next();
            int n = 0;
            final Iterator<w.a> iterator2 = this.f.iterator();
            while (iterator2.hasNext()) {
                if (iterator2.next().a().equals(a.a())) {
                    ++n;
                }
            }
            if (n < this.b) {
                iterator.remove();
                this.f.add(a);
                this.a().execute(a);
            }
            if (this.f.size() >= this.a) {
                return;
            }
        }
    }
    
    private int c() {
        synchronized (this) {
            return this.f.size() + this.g.size();
        }
    }
    
    final void a(final w.a a) {
        this.a(this.f, a, true);
    }
    
    final void a(final w w) {
        synchronized (this) {
            this.g.add(w);
        }
    }
    
    final void b(final w w) {
        this.a(this.g, w, false);
    }
}
