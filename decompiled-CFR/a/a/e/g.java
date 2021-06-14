/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.e;

import a.a.e.h;
import a.a.e.i;
import a.a.e.j;
import a.a.e.l;
import a.a.e.m;
import a.a.e.n;
import a.a.g.e;
import b.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class g
implements Closeable {
    static final ExecutorService a;
    static final /* synthetic */ boolean t;
    final boolean b;
    final b c;
    final Map<Integer, i> d = new LinkedHashMap<Integer, i>();
    final String e;
    int f;
    int g;
    boolean h;
    final ExecutorService i;
    final m j;
    long k = 0L;
    long l;
    public n m = new n();
    final n n = new n();
    boolean o = false;
    final Socket p;
    public final j q;
    public final c r;
    final Set<Integer> s = new LinkedHashSet<Integer>();
    private Map<Integer, l> u;
    private int v;

    static {
        t = g.class.desiredAssertionStatus() ^ true;
        a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), a.a.c.a("OkHttp Http2Connection", true));
    }

    public g(a a2) {
        this.j = a2.f;
        this.b = a2.g;
        this.c = a2.e;
        boolean bl = a2.g;
        int n2 = 2;
        int n3 = bl ? 1 : 2;
        this.g = n3;
        if (a2.g) {
            this.g += 2;
        }
        n3 = n2;
        if (a2.g) {
            n3 = 1;
        }
        this.v = n3;
        if (a2.g) {
            this.m.a(7, 16777216);
        }
        this.e = a2.b;
        this.i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), a.a.c.a(a.a.c.a("OkHttp %s Push Observer", new Object[]{this.e}), true));
        this.n.a(7, 65535);
        this.n.a(5, 16384);
        this.l = this.n.b();
        this.p = a2.a;
        this.q = new j(a2.d, this.b);
        this.r = new c(new h(a2.c, this.b));
    }

    /*
     * Enabled unnecessary exception pruning
     */
    private void a(a.a.e.b b2) {
        j j2 = this.q;
        synchronized (j2) {
            int n2;
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.h = true;
                n2 = this.f;
            }
            this.q.a(n2, b2, a.a.c.a);
            return;
        }
    }

    static boolean d(int n2) {
        if (n2 == 0) return false;
        if ((n2 & 1) != 0) return false;
        return true;
    }

    public final int a() {
        synchronized (this) {
            n n2 = this.n;
            if ((n2.a & 16) == 0) return Integer.MAX_VALUE;
            int n3 = n2.b[4];
            return n3;
        }
    }

    final i a(int n2) {
        synchronized (this) {
            return this.d.get(n2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled unnecessary exception pruning
     */
    final i a(List<a.a.e.c> list, boolean bl) {
        boolean bl2;
        i i2;
        void var2_2;
        boolean bl3 = var2_2 ^ true;
        j j2 = this.q;
        synchronized (j2) {
            int n2;
            synchronized (this) {
                if (this.h) throw new a.a.e.a();
                n2 = this.g;
                this.g += 2;
                i2 = new i(n2, this, bl3, false, list);
                bl2 = var2_2 == false || this.l == 0L || i2.b == 0L;
                if (i2.a()) {
                    this.d.put(n2, i2);
                }
            }
            this.q.a(bl3, n2, list);
        }
        if (!bl2) return i2;
        this.q.blockBack2();
        return i2;
    }

    final void a(final int n2, final long l2) {
        a.execute(new a.a.b("OkHttp Window Update %s stream %d", new Object[]{this.e, n2}){

            @Override
            public final void blockBack2() {
                try {
                    g.this.q.a(n2, l2);
                    return;
                }
                catch (IOException iOException) {
                    return;
                }
            }
        });
    }

    final void a(final int n2, final a.a.e.b b2) {
        a.execute(new a.a.b("OkHttp %s stream %d", new Object[]{this.e, n2}){

            @Override
            public final void blockBack2() {
                try {
                    g.this.b(n2, b2);
                    return;
                }
                catch (IOException iOException) {
                    return;
                }
            }
        });
    }

    /*
     * Loose catch block
     * Enabled unnecessary exception pruning
     * Converted monitor instructions to comments
     */
    public final void a(int n2, boolean bl, b.c c2, long l2) {
        long l3 = l2;
        if (l2 == 0L) {
            this.q.a(bl, n2, c2, 0);
            return;
        }
        while (l3 > 0L) {
            // MONITORENTER : this
            while (this.l <= 0L) {
                if (!this.d.containsKey(n2)) throw new IOException("stream closed");
                this.wait();
            }
            int n3 = Math.min((int)Math.min(l3, this.l), this.q.a);
            l2 = this.l;
            long l4 = n3;
            this.l = l2 - l4;
            // MONITOREXIT : this
            j j2 = this.q;
            boolean bl2 = bl && (l3 -= l4) == 0L;
            j2.a(bl2, n2, c2, n3);
        }
        return;
        {
            catch (InterruptedException interruptedException) {}
            throw new InterruptedIOException();
        }
        catch (Throwable throwable) {
            throw throwable;
        }
    }

    /*
     * Enabled unnecessary exception pruning
     */
    final void a(a.a.e.b object, a.a.e.b b2) {
        block20 : {
            i[] arri;
            if (!t) {
                if (Thread.holdsLock(this)) throw new AssertionError();
            }
            l[] arrl = null;
            try {
                this.a((a.a.e.b)((Object)object));
                object = null;
            }
            catch (IOException iOException) {
                // empty catch block
            }
            synchronized (this) {
                if (!this.d.isEmpty()) {
                    arri = this.d.values().toArray(new i[this.d.size()]);
                    this.d.clear();
                } else {
                    arri = null;
                }
                if (this.u != null) {
                    arrl = this.u.values().toArray(new l[this.u.size()]);
                    this.u = null;
                }
            }
            int n2 = 0;
            Object object22 = object;
            if (arri != null) {
                for (Object object22 : arri) {
                    block19 : {
                        try {
                            ((i)object22).a(b2);
                            object22 = object;
                        }
                        catch (IOException iOException) {
                            object22 = object;
                            if (object == null) break block19;
                            object22 = iOException;
                        }
                    }
                    object = object22;
                }
                object22 = object;
            }
            if (arrl != null) {
                int n3 = arrl.length;
                for (int i2 = n2; i2 < n3; ++i2) {
                    arrl[i2].a();
                }
            }
            try {
                this.q.close();
                object = object22;
            }
            catch (IOException iOException) {
                object = object22;
                if (object22 != null) break block20;
                object = iOException;
            }
        }
        try {
            this.p.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (object != null) throw object;
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     * Converted monitor instructions to comments
     */
    final void a(boolean var1_1, int var2_2, int var3_3, l var4_4) {
        var5_6 = this.q;
        // MONITORENTER : var5_6
        if (var4_4 == null) ** GOTO lbl7
        if (var4_4.b != -1L) throw new IllegalStateException();
        var4_4.b = System.nanoTime();
lbl7: // 2 sources:
        this.q.a(var1_1, var2_2, var3_3);
        // MONITOREXIT : var5_6
        return;
    }

    final i b(int n2) {
        synchronized (this) {
            i i2 = this.d.remove(n2);
            this.notifyAll();
            return i2;
        }
    }

    final void b(int n2, a.a.e.b b2) {
        this.q.a(n2, b2);
    }

    public final boolean b() {
        synchronized (this) {
            return this.h;
        }
    }

    final l c(int n2) {
        synchronized (this) {
            if (this.u == null) return null;
            l l2 = this.u.remove(n2);
            return l2;
        }
    }

    @Override
    public final void close() {
        this.a(a.a.e.b.a, a.a.e.b.f);
    }

    public static final class a {
        public Socket a;
        public String b;
        public b.e c;
        public d d;
        public b e = b.l;
        m f = m.a;
        boolean g = true;
    }

    public static abstract class b {
        public static final b l = new b(){

            @Override
            public final void a(i i2) {
                i2.a(a.a.e.b.e);
            }
        };

        public void a(g g2) {
        }

        public abstract void a(i var1);

    }

    final class c
    extends a.a.b
    implements h.b {
        final h a;

        c(h h2) {
            super("OkHttp %s", g.this.e);
            this.a = h2;
        }

        /*
         * Enabled unnecessary exception pruning
         */
        @Override
        public final void a(int n2) {
            i[] arri;
            Object object = g.this;
            synchronized (object) {
                arri = g.this.d.values().toArray(new i[g.this.d.size()]);
                g.this.h = true;
            }
            int n3 = arri.length;
            int n4 = 0;
            while (n4 < n3) {
                object = arri[n4];
                if (((i)object).c > n2 && ((i)object).b()) {
                    ((i)object).c(a.a.e.b.e);
                    g.this.b(((i)object).c);
                }
                ++n4;
            }
        }

        @Override
        public final void a(int n2, long l2) {
            if (n2 == 0) {
                g g2 = g.this;
                synchronized (g2) {
                    g g3 = g.this;
                    g3.l += l2;
                    g.this.notifyAll();
                    return;
                }
            }
            i i2 = g.this.a(n2);
            if (i2 == null) return;
            synchronized (i2) {
                i2.a(l2);
                return;
            }
        }

        @Override
        public final void a(final int n2, final a.a.e.b b2) {
            if (g.d(n2)) {
                g g2 = g.this;
                g2.i.execute(new a.a.b("OkHttp %s Push Reset[%s]", new Object[]{g2.e, n2}){

                    @Override
                    public final void blockBack2() {
                        g g2 = g.this;
                        synchronized (g2) {
                            g.this.s.remove(n2);
                            return;
                        }
                    }
                });
                return;
            }
            i i2 = g.this.b(n2);
            if (i2 == null) return;
            i2.c(b2);
        }

        /*
         * Enabled unnecessary exception pruning
         */
        @Override
        public final void a(final int n2, final List<a.a.e.c> list) {
            g g2 = g.this;
            synchronized (g2) {
                if (g2.s.contains(n2)) {
                    g2.a(n2, a.a.e.b.b);
                    return;
                }
                g2.s.add(n2);
            }
            g2.i.execute(new a.a.b("OkHttp %s Push Request[%s]", new Object[]{g2.e, n2}){

                /*
                 * Enabled unnecessary exception pruning
                 */
                @Override
                public final void blockBack2() {
                    try {
                        g.this.q.a(n2, a.a.e.b.f);
                        g g2 = g.this;
                        synchronized (g2) {
                            g.this.s.remove(n2);
                        }
                    }
                    catch (IOException iOException) {
                        return;
                    }
                    {
                        return;
                    }
                }
            });
        }

        /*
         * Enabled unnecessary exception pruning
         */
        @Override
        public final void a(n arri) {
            int n2;
            long l2;
            int n3;
            int n4;
            Object object = g.this;
            synchronized (object) {
                block14 : {
                    n4 = g.this.n.b();
                    Object object2 = g.this.n;
                    n2 = 0;
                    n3 = 0;
                    do {
                        if (n3 < 10) {
                            if (arri.a(n3)) {
                                ((n)object2).a(n3, arri.b[n3]);
                            }
                        } else {
                            a.execute(new a.a.b("OkHttp %s ACK Settings", new Object[]{g.this.e}, (n)arri){
                                final /* synthetic */ n a;
                                {
                                    this.a = n2;
                                    super(string, arrobject);
                                }

                                @Override
                                public final void blockBack2() {
                                    try {
                                        g.this.q.a(this.a);
                                        return;
                                    }
                                    catch (IOException iOException) {
                                        return;
                                    }
                                }
                            });
                            n3 = g.this.n.b();
                            arri = null;
                            if (n3 == -1 || n3 == n4) break;
                            long l3 = n3 - n4;
                            if (!g.this.o) {
                                object2 = g.this;
                                ((g)object2).l += l3;
                                if (l3 > 0L) {
                                    object2.notifyAll();
                                }
                                g.this.o = true;
                            }
                            l2 = l3;
                            if (!g.this.d.isEmpty()) {
                                arri = g.this.d.values().toArray(new i[g.this.d.size()]);
                                l2 = l3;
                            }
                            break block14;
                        }
                        ++n3;
                    } while (true);
                    l2 = 0L;
                }
                a.execute(new a.a.b("OkHttp %s settings", new Object[]{g.this.e}){

                    @Override
                    public final void blockBack2() {
                        g.this.c.a(g.this);
                    }
                });
            }
            if (arri == null) return;
            if (l2 == 0L) return;
            n4 = arri.length;
            n3 = n2;
            while (n3 < n4) {
                object = arri[n3];
                synchronized (object) {
                    ((i)object).a(l2);
                }
                ++n3;
            }
        }

        @Override
        public final void a(boolean bl, int n2, int n3) {
            if (bl) {
                l l2 = g.this.c(n2);
                if (l2 == null) return;
                if (l2.c != -1L) throw new IllegalStateException();
                if (l2.b == -1L) throw new IllegalStateException();
                l2.c = System.nanoTime();
                l2.a.countDown();
                return;
            }
            g g2 = g.this;
            a.execute(new a.a.b("OkHttp %s ping %08x%08x", new Object[]{g2.e, n2, n3}, n2, n3){
                final /* synthetic */ boolean a;
                final /* synthetic */ int c;
                final /* synthetic */ int d;
                final /* synthetic */ l e;
                {
                    this.a = true;
                    this.c = n2;
                    this.d = n3;
                    this.e = null;
                    super(string, arrobject);
                }

                @Override
                public final void blockBack2() {
                    try {
                        g.this.a(this.a, this.c, this.d, this.e);
                        return;
                    }
                    catch (IOException iOException) {
                        return;
                    }
                }
            });
        }

        @Override
        public final void a(final boolean bl, final int n2, b.e object, final int n3) {
            if (g.d(n2)) {
                g g2 = g.this;
                final b.c c2 = new b.c();
                long l2 = n3;
                object.a(l2);
                object.a(c2, l2);
                if (c2.b == l2) {
                    g2.i.execute(new a.a.b("OkHttp %s Push Data[%s]", new Object[]{g2.e, n2}){

                        /*
                         * Enabled unnecessary exception pruning
                         */
                        @Override
                        public final void blockBack2() {
                            try {
                                g.this.j.a(c2, n3);
                                g.this.q.a(n2, a.a.e.b.f);
                                g g2 = g.this;
                                synchronized (g2) {
                                    g.this.s.remove(n2);
                                }
                            }
                            catch (IOException iOException) {
                                return;
                            }
                            {
                                return;
                            }
                        }
                    });
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append(c2.b);
                ((StringBuilder)object).append(" != ");
                ((StringBuilder)object).append(n3);
                throw new IOException(((StringBuilder)object).toString());
            }
            i i2 = g.this.a(n2);
            if (i2 == null) {
                g.this.a(n2, a.a.e.b.b);
                object.f(n3);
                return;
            }
            if (!i.l) {
                if (Thread.holdsLock(i2)) throw new AssertionError();
            }
            i2.g.a((b.e)object, (long)n3);
            if (!bl) return;
            i2.e();
        }

        /*
         * Enabled unnecessary exception pruning
         * Converted monitor instructions to comments
         */
        @Override
        public final void a(boolean bl, final int n2, List<a.a.e.c> object) {
            boolean bl2 = g.d(n2);
            boolean bl3 = true;
            if (bl2) {
                g g2 = g.this;
                g2.i.execute(new a.a.b("OkHttp %s Push Headers[%s]", new Object[]{g2.e, n2}, (List)object, bl){
                    final /* synthetic */ List c;
                    final /* synthetic */ boolean d;
                    {
                        this.c = list;
                        this.d = bl;
                        super(string, arrobject);
                    }

                    /*
                     * Enabled unnecessary exception pruning
                     */
                    @Override
                    public final void blockBack2() {
                        try {
                            g.this.q.a(n2, a.a.e.b.f);
                            g g2 = g.this;
                            synchronized (g2) {
                                g.this.s.remove(n2);
                            }
                        }
                        catch (IOException iOException) {
                            return;
                        }
                        {
                            return;
                        }
                    }
                });
                return;
            }
            Object object2 = g.this;
            // MONITORENTER : object2
            if (g.this.h) {
                // MONITOREXIT : object2
                return;
            }
            i i2 = g.this.a(n2);
            if (i2 == null) {
                if (n2 <= g.this.f) {
                    // MONITOREXIT : object2
                    return;
                }
                if (n2 % 2 == g.this.g % 2) {
                    // MONITOREXIT : object2
                    return;
                }
                object = new i(n2, g.this, false, bl, (List<a.a.e.c>)object);
                g.this.f = n2;
                g.this.d.put(n2, (i)object);
                a.execute(new a.a.b("OkHttp %s stream %d", new Object[]{g.this.e, n2}, (i)object){
                    final /* synthetic */ i a;
                    {
                        this.a = i2;
                        super(string, arrobject);
                    }

                    @Override
                    public final void blockBack2() {
                        try {
                            g.this.c.a(this.a);
                            return;
                        }
                        catch (IOException iOException) {
                            e e2 = e.b();
                            StringBuilder stringBuilder = new StringBuilder("Http2Connection.Listener failure for ");
                            stringBuilder.append(g.this.e);
                            e2.a(4, stringBuilder.toString(), iOException);
                            try {
                                this.a.a(a.a.e.b.b);
                                return;
                            }
                            catch (IOException iOException2) {
                                return;
                            }
                        }
                    }
                });
                // MONITOREXIT : object2
                return;
            }
            // MONITOREXIT : object2
            if (!i.l) {
                if (Thread.holdsLock(i2)) throw new AssertionError();
            }
            // MONITORENTER : i2
            i2.f = true;
            if (i2.e == null) {
                i2.e = object;
                bl3 = i2.a();
                i2.notifyAll();
            } else {
                object2 = new ArrayList();
                object2.addAll(i2.e);
                object2.add(null);
                object2.addAll(object);
                i2.e = object2;
            }
            // MONITOREXIT : i2
            if (!bl3) {
                i2.d.b(i2.c);
            }
            if (!bl) return;
            i2.e();
        }

        /*
         * Exception decompiling
         */
        @Override
        public final void blockBack2() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 15[UNCONDITIONALDOLOOP]
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:427)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:479)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:607)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:696)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:184)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:129)
            // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.Method.analyse(Method.java:397)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:906)
            // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:778)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:886)
            // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:797)
            // org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:225)
            // org.benf.cfr.reader.Driver.doJar(Driver.java:109)
            // org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
            // org.benf.cfr.reader.Main.main(Main.java:48)
            // the.bytecode.club.bytecodeviewer.decompilers.CFRDecompiler.decompileToZip(CFRDecompiler.java:311)
            // the.bytecode.club.bytecodeviewer.gui.MainViewerGUI$14$1$3.run(MainViewerGUI.java:1211)
            throw new IllegalStateException("Decompilation failed");
        }

    }

}

