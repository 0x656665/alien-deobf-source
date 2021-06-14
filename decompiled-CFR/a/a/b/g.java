/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.b;

import a.a.b.d;
import a.a.b.e;
import a.a.b.f;
import a.a.c;
import a.a.e.b;
import a.a.e.o;
import a.ab;
import a.i;
import a.r;
import a.u;
import b.s;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class g {
    public static final /* synthetic */ boolean e;
    public final a.a a;
    public final i b;
    public a.a.b.c c;
    public a.a.c.c d;
    private ab f;
    private final Object g;
    private final f h;
    private int i;
    private boolean j;
    private boolean k;

    static {
        e = g.class.desiredAssertionStatus() ^ true;
    }

    public g(i i2, a.a a2, Object object) {
        this.b = i2;
        this.a = a2;
        this.h = new f(a2, this.f());
        this.g = object;
    }

    /*
     * Enabled unnecessary exception pruning
     */
    private a.a.b.c a(int n2, int n3, int n4, boolean bl) {
        Object object;
        a.a.b.c c2;
        Object object2 = this.b;
        synchronized (object2) {
            if (this.j) throw new IllegalStateException("released");
            if (this.d != null) throw new IllegalStateException("codec != null");
            if (this.k) throw new IOException("Canceled");
            object = this.c;
            if (object != null && !((a.a.b.c)object).g) {
                return object;
            }
            a.a.a.a.a(this.b, this.a, this);
            if (this.c != null) {
                return this.c;
            }
            object = this.f;
        }
        object2 = object;
        if (object == null) {
            object2 = this.h.a();
        }
        object = this.b;
        synchronized (object) {
            this.f = object2;
            this.i = 0;
            c2 = new a.a.b.c(this.b, (ab)object2);
            this.a(c2);
            if (this.k) throw new IOException("Canceled");
        }
        c2.a(n2, n3, n4, bl);
        this.f().b(c2.a);
        object = null;
        i i2 = this.b;
        synchronized (i2) {
            a.a.a.a.b(this.b, c2);
            object2 = c2;
            if (c2.b()) {
                object = a.a.a.a.b(this.b, this.a, this);
                object2 = this.c;
            }
        }
        c.a((Socket)object);
        return object2;
    }

    /*
     * Enabled unnecessary exception pruning
     */
    private a.a.b.c a(int n2, int n3, int n4, boolean bl, boolean bl2) {
        do {
            a.a.b.c c2 = this.a(n2, n3, n4, bl);
            i i2 = this.b;
            synchronized (i2) {
                if (c2.h == 0) {
                    return c2;
                }
            }
            if (c2.a(bl2)) return c2;
            this.d();
        } while (true);
    }

    private void b(a.a.b.c c2) {
        int n2 = c2.j.size();
        int n3 = 0;
        while (n3 < n2) {
            if (c2.j.get(n3).get() == this) {
                c2.j.remove(n3);
                return;
            }
            ++n3;
        }
        throw new IllegalStateException();
    }

    private d f() {
        return a.a.a.a.a(this.b);
    }

    public final a.a.c.c a() {
        i i2 = this.b;
        synchronized (i2) {
            return this.d;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled unnecessary exception pruning
     */
    public final a.a.c.c a(u object, boolean bl) {
        int n2 = ((u)object).y;
        int n3 = ((u)object).z;
        int n4 = ((u)object).A;
        boolean bl2 = ((u)object).x;
        try {
            void var2_3;
            Object object2 = this.a(n2, n3, n4, bl2, (boolean)var2_3);
            if (((a.a.b.c)object2).d != null) {
                object = new a.a.e.f((u)object, this, ((a.a.b.c)object2).d);
            } else {
                ((a.a.b.c)object2).b.setSoTimeout(((u)object).z);
                ((a.a.b.c)object2).e.a().a(((u)object).z, TimeUnit.MILLISECONDS);
                ((a.a.b.c)object2).f.a().a(((u)object).A, TimeUnit.MILLISECONDS);
                object = new a.a.d.a((u)object, this, ((a.a.b.c)object2).e, ((a.a.b.c)object2).f);
            }
            object2 = this.b;
            synchronized (object2) {
                this.d = object;
            }
        }
        catch (IOException iOException) {
            throw new e(iOException);
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public final Socket a(boolean var1_1, boolean var2_2, boolean var3_3) {
        if (!g.e) {
            if (Thread.holdsLock(this.b) == false) throw new AssertionError();
        }
        if (var3_3) {
            this.d = null;
        }
        if (var2_2) {
            this.j = true;
        }
        if (this.c == null) return null;
        if (var1_1) {
            this.c.g = true;
        }
        if (this.d != null) return null;
        if (!this.j) {
            if (this.c.g == false) return null;
        }
        this.b(this.c);
        if (!this.c.j.isEmpty()) ** GOTO lbl-1000
        this.c.k = System.nanoTime();
        if (a.a.a.a.a(this.b, this.c)) {
            var4_4 = this.c.b;
        } else lbl-1000: // 2 sources:
        {
            var4_4 = null;
        }
        this.c = null;
        return var4_4;
    }

    public final void a(a.a.b.c c2) {
        if (!e) {
            if (!Thread.holdsLock(this.b)) throw new AssertionError();
        }
        if (this.c != null) throw new IllegalStateException();
        this.c = c2;
        c2.j.add(new a(this, this.g));
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     * Converted monitor instructions to comments
     */
    public final void a(IOException var1_1) {
        block9 : {
            var3_2 = this.b;
            // MONITORENTER : var3_2
            if (!(var1_1 instanceof o)) break block9;
            var1_1 = (o)var1_1;
            if (var1_1.a == b.e) {
                ++this.i;
            }
            if (var1_1.a == b.e && this.i <= 1) ** GOTO lbl-1000
            this.f = null;
            ** GOTO lbl20
        }
        if (this.c != null && (!this.c.b() || var1_1 instanceof a.a.e.a)) {
            if (this.c.h == 0) {
                if (this.f != null && var1_1 != null) {
                    var4_3 = this.h;
                    var5_4 = this.f;
                    if (var5_4.b.type() != Proxy.Type.DIRECT && var4_3.a.g != null) {
                        var4_3.a.g.connectFailed(var4_3.a.a.a(), var5_4.b.address(), (IOException)var1_1);
                    }
                    var4_3.b.a(var5_4);
                }
                this.f = null;
            }
lbl20: // 4 sources:
            var2_5 = true;
        } else lbl-1000: // 2 sources:
        {
            var2_5 = false;
        }
        var1_1 = this.a(var2_5, false, true);
        // MONITOREXIT : var3_2
        c.a((Socket)var1_1);
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public final void a(boolean bl, a.a.c.c object) {
        i i2 = this.b;
        synchronized (i2) {
            block6 : {
                if (object != null) {
                    if (object != this.d) break block6;
                    if (!bl) {
                        object = this.c;
                        ++((a.a.b.c)object).h;
                    }
                    object = this.a(bl, false, true);
                    // MONITOREXIT [0, 2, 5] lbl10 : MonitorExitStatement: MONITOREXIT : var3_4
                    c.a((Socket)object);
                    return;
                }
            }
            try {
                StringBuilder stringBuilder = new StringBuilder("expected ");
                stringBuilder.append(this.d);
                stringBuilder.append(" but was ");
                stringBuilder.append(object);
                throw new IllegalStateException(stringBuilder.toString());
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final a.a.b.c b() {
        synchronized (this) {
            return this.c;
        }
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public final void c() {
        Socket socket;
        i i2 = this.b;
        synchronized (i2) {
            socket = this.a(false, true, false);
        }
        c.a(socket);
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public final void d() {
        Socket socket;
        i i2 = this.b;
        synchronized (i2) {
            socket = this.a(true, false, false);
        }
        c.a(socket);
    }

    public final boolean e() {
        if (this.f != null) return true;
        f f2 = this.h;
        boolean bl = f2.c() || f2.b() || f2.d();
        if (!bl) return false;
        return true;
    }

    public final String toString() {
        a.a.b.c c2 = this.b();
        if (c2 == null) return this.a.toString();
        return c2.toString();
    }

    public static final class a
    extends WeakReference<g> {
        public final Object a;

        a(g g2, Object object) {
            super(g2);
            this.a = object;
        }
    }

}

