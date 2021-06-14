/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.c;
import a.w;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class m {
    private int a = 64;
    private int b = 5;
    private Runnable c;
    private ExecutorService d;
    private final Deque<w.a> e = new ArrayDeque<w.a>();
    private final Deque<w.a> f = new ArrayDeque<w.a>();
    private final Deque<w> g = new ArrayDeque<w>();

    private ExecutorService a() {
        synchronized (this) {
            if (this.d != null) return this.d;
            this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), c.a("OkHttp Dispatcher", false));
            return this.d;
        }
    }

    private <T> void a(Deque<T> object, T t2, boolean bl) {
        synchronized (this) {
            if (!object.remove(t2)) throw new AssertionError((Object)"Call wasn't in-flight!");
            if (bl) {
                this.b();
            }
            int n2 = this.c();
            object = this.c;
            // MONITOREXIT [0, 2] lbl8 : MonitorExitStatement: MONITOREXIT : this
            if (n2 != 0) return;
            if (object == null) return;
            object.run();
            return;
        }
    }

    private void b() {
        if (this.f.size() >= this.a) {
            return;
        }
        if (this.e.isEmpty()) {
            return;
        }
        Iterator<w.a> iterator = this.e.iterator();
        do {
            if (!iterator.hasNext()) return;
            w.a a2 = iterator.next();
            int n2 = 0;
            Iterator<w.a> iterator2 = this.f.iterator();
            while (iterator2.hasNext()) {
                if (!iterator2.next().a().equals(a2.a())) continue;
                ++n2;
            }
            if (n2 >= this.b) continue;
            iterator.remove();
            this.f.add(a2);
            this.a().execute(a2);
        } while (this.f.size() < this.a);
    }

    private int c() {
        synchronized (this) {
            int n2 = this.f.size();
            int n3 = this.g.size();
            return n2 + n3;
        }
    }

    final void a(w.a a2) {
        this.a(this.f, a2, true);
    }

    final void a(w w2) {
        synchronized (this) {
            this.g.add(w2);
            return;
        }
    }

    final void b(w w2) {
        this.a(this.g, w2, false);
    }
}

