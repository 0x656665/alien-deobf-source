/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.a;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

public final class d
implements Closeable,
Flushable {
    static final Pattern a;
    static final /* synthetic */ boolean j;
    final a.a.f.a b;
    final int c;
    b.d d;
    final LinkedHashMap<String, b> e;
    int f;
    boolean g;
    boolean h;
    boolean i;
    private long k;
    private long l;
    private final Executor m;
    private final Runnable n;

    static {
        j = d.class.desiredAssertionStatus() ^ true;
        a = Pattern.compile("[a-z0-9_-]{1,120}");
    }

    private void a(a object) {
        synchronized (this) {
            b b2 = ((a)object).a;
            if (b2.f != object) throw new IllegalStateException();
            for (int i2 = 0; i2 < this.c; ++i2) {
                object = b2.d[i2];
                this.b.a((File)object);
            }
            ++this.f;
            b2.f = null;
            if (false | b2.e) {
                b2.e = true;
                this.d.b("CLEAN").h(32);
                this.d.b(b2.a);
                b2.a(this.d);
                this.d.h(10);
            } else {
                this.e.remove(b2.a);
                this.d.b("REMOVE").h(32);
                this.d.b(b2.a);
                this.d.h(10);
            }
            this.d.flush();
            if (this.l <= this.k) {
                if (!this.a()) return;
            }
            this.m.execute(this.n);
            return;
        }
    }

    private boolean a() {
        if (this.f < 2000) return false;
        if (this.f < this.e.size()) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    private boolean a(b var1_1) {
        block6 : {
            var4_2 = var1_1.f;
            var2_4 = var3_3 = 0;
            if (var4_2 == null) break block6;
            var4_2 = var1_1.f;
            var2_4 = var3_3;
            if (var4_2.a.f != var4_2) break block6;
            var2_4 = 0;
            block2 : do {
                if (var2_4 >= var4_2.c.c) ** GOTO lbl13
                try {
                    block7 : {
                        var4_2.c.b.a(var4_2.a.d[var2_4]);
                        break block7;
lbl13: // 1 sources:
                        var4_2.a.f = null;
                        var2_4 = var3_3;
                        break;
                    }
lbl17: // 2 sources:
                    do {
                        ++var2_4;
                        continue block2;
                        break;
                    } while (true);
                }
                catch (IOException var5_5) {
                    ** continue;
                }
            } while (true);
        }
        do {
            if (var2_4 >= this.c) {
                ++this.f;
                this.d.b("REMOVE").h(32).b(var1_1.a).h(10);
                this.e.remove(var1_1.a);
                if (this.a() == false) return true;
                this.m.execute(this.n);
                return true;
            }
            this.b.a(var1_1.c[var2_4]);
            this.l -= var1_1.b[var2_4];
            var1_1.b[var2_4] = 0L;
            ++var2_4;
        } while (true);
    }

    private boolean b() {
        synchronized (this) {
            return this.h;
        }
    }

    private void c() {
        synchronized (this) {
            boolean bl = this.b();
            if (bl) throw new IllegalStateException("cache is closed");
            return;
        }
    }

    private void d() {
        do {
            if (this.l <= this.k) {
                this.i = false;
                return;
            }
            this.a(this.e.values().iterator().next());
        } while (true);
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    @Override
    public final void close() {
        synchronized (this) {
            if (!this.g || this.h) {
                this.h = true;
                return;
            }
            b[] arrb = this.e.values().toArray(new b[this.e.size()]);
            int n2 = arrb.length;
            int n3 = 0;
            do {
                if (n3 >= n2) {
                    this.d();
                    this.d.close();
                    this.d = null;
                    this.h = true;
                    return;
                }
                Object object = arrb[n3];
                if (((b)object).f != null) {
                    a a2 = ((b)object).f;
                    object = a2.c;
                    synchronized (object) {
                        if (a2.b) throw new IllegalStateException();
                        if (a2.a.f == a2) {
                            a2.c.a(a2);
                        }
                        a2.b = true;
                    }
                }
                ++n3;
            } while (true);
        }
    }

    @Override
    public final void flush() {
        synchronized (this) {
            boolean bl = this.g;
            if (!bl) {
                return;
            }
            this.c();
            this.d();
            this.d.flush();
            return;
        }
    }

    public final class a {
        final b a;
        boolean b;
        final /* synthetic */ d c;
    }

    final class b {
        final String a;
        final long[] b;
        final File[] c;
        final File[] d;
        boolean e;
        a f;

        final void a(b.d d2) {
            long[] arrl = this.b;
            int n2 = arrl.length;
            int n3 = 0;
            while (n3 < n2) {
                long l2 = arrl[n3];
                d2.h(32).j(l2);
                ++n3;
            }
        }
    }

}

