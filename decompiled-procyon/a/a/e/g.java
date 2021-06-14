package a.a.e;

import java.net.*;
import a.a.*;
import java.util.concurrent.*;
import java.io.*;
import b.*;
import java.util.*;

public final class g implements Closeable
{
    static final ExecutorService a;
    static final /* synthetic */ boolean t;
    final boolean b;
    final b c;
    final Map<Integer, i> d;
    final String e;
    int f;
    int g;
    boolean h;
    final ExecutorService i;
    final m j;
    long k;
    long l;
    public n m;
    final n n;
    boolean o;
    final Socket p;
    public final j q;
    public final c r;
    final Set<Integer> s;
    private Map<Integer, l> u;
    private int v;
    
    static {
        t = (g.class.desiredAssertionStatus() ^ true);
        a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), a.a.c.a("OkHttp Http2Connection", true));
    }
    
    public g(final a a) {
        super();
        this.d = new LinkedHashMap<Integer, i>();
        this.k = 0L;
        this.m = new n();
        this.n = new n();
        this.o = false;
        this.s = new LinkedHashSet<Integer>();
        this.j = a.f;
        this.b = a.g;
        this.c = a.e;
        final boolean g = a.g;
        final int n = 2;
        int g2;
        if (g) {
            g2 = 1;
        }
        else {
            g2 = 2;
        }
        this.g = g2;
        if (a.g) {
            this.g += 2;
        }
        int v = n;
        if (a.g) {
            v = 1;
        }
        this.v = v;
        if (a.g) {
            this.m.a(7, 16777216);
        }
        this.e = a.b;
        this.i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), a.a.c.a(a.a.c.a("OkHttp %s Push Observer", this.e), true));
        this.n.a(7, 65535);
        this.n.a(5, 16384);
        this.l = this.n.b();
        this.p = a.a;
        this.q = new j(a.d, this.b);
        this.r = new c(new h(a.c, this.b));
    }
    
    private void a(final a.a.e.b b) {
        synchronized (this.q) {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.h = true;
                final int f = this.f;
                // monitorexit(this)
                this.q.a(f, b, a.a.c.a);
            }
        }
    }
    
    static boolean d(final int n) {
        return n != 0 && (n & 0x1) == 0x0;
    }
    
    public final int a() {
        synchronized (this) {
            final n n = this.n;
            if ((n.a & 0x10) != 0x0) {
                return n.b[4];
            }
            return Integer.MAX_VALUE;
        }
    }
    
    final i a(final int n) {
        synchronized (this) {
            return this.d.get(n);
        }
    }
    
    final i a(final List<a.a.e.c> list, final boolean b) {
        while (true) {
            final boolean b2 = b ^ true;
            while (true) {
                Label_0161: {
                    Label_0156: {
                        synchronized (this.q) {
                            synchronized (this) {
                                if (this.h) {
                                    throw new a.a.e.a();
                                }
                                final int g = this.g;
                                this.g += 2;
                                final i i = new i(g, this, b2, false, list);
                                if (b && this.l != 0L && i.b != 0L) {
                                    break Label_0156;
                                }
                                break Label_0161;
                                // \u0131ftrue(Label_0106:, !i.a())
                                // monitorexit(this)
                                // monitorexit(this.q)
                                // \u0131ftrue(Label_0134:, n == 0)
                                Block_10: {
                                    while (true) {
                                        Block_9: {
                                            break Block_9;
                                            final List<a.a.e.c> list2;
                                            this.q.a(b2, g, list2);
                                            break Block_10;
                                        }
                                        this.d.put(g, i);
                                        continue;
                                    }
                                    Label_0134: {
                                        return i;
                                    }
                                }
                                this.q.blockBack2();
                            }
                        }
                    }
                    final int n = 0;
                    continue;
                }
                final int n = 1;
                continue;
            }
        }
    }
    
    final void a(final int n, final long n2) {
        a.a.e.g.a.execute(new a.a.b("OkHttp Window Update %s stream %d", new Object[] { this.e, n }) {
            final /* synthetic */ int a;
            final /* synthetic */ long c;
            final /* synthetic */ g d;
            
            g$2(final String s, final Object[] array) {
                this.d = d;
                super(s, array);
            }
            
            public final void blockBack2() {
                try {
                    this.d.q.a(n, n2);
                }
                catch (IOException ex) {}
            }
        });
    }
    
    final void a(final int n, final a.a.e.b b) {
        a.a.e.g.a.execute(new a.a.b("OkHttp %s stream %d", new Object[] { this.e, n }) {
            final /* synthetic */ int a;
            final /* synthetic */ b c;
            final /* synthetic */ g d;
            
            g$1(final String s, final Object[] array) {
                this.d = d;
                super(s, array);
            }
            
            public final void blockBack2() {
                try {
                    this.d.b(n, b);
                }
                catch (IOException ex) {}
            }
        });
    }
    
    public final void a(final int n, final boolean b, final b.c c, long l) {
        long n2 = l;
        if (l == 0L) {
            this.q.a(b, n, c, 0);
            return;
        }
    Label_0170_Outer:
        while (true) {
            if (n2 > 0L) {
                // monitorenter(this)
                while (true) {
                    try {
                        try {
                            while (this.l <= 0L) {
                                if (!this.d.containsKey(n)) {
                                    throw new IOException("stream closed");
                                }
                                this.wait();
                            }
                            final int min = Math.min((int)Math.min(n2, this.l), this.q.a);
                            l = this.l;
                            final long n3 = min;
                            this.l = l - n3;
                            // monitorexit(this)
                            n2 -= n3;
                            this.q.a(b && n2 == 0L, n, c, min);
                            continue Label_0170_Outer;
                        }
                        finally {
                            // monitorexit(this)
                            throw new InterruptedIOException();
                        }
                        return;
                    }
                    catch (InterruptedException ex) {}
                    continue;
                }
            }
        }
    }
    
    final void a(a.a.e.b b, final a.a.e.b ex) {
        if (!a.a.e.g.t && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        l[] array = null;
        try {
            this.a(b);
            b = null;
        }
        catch (IOException ex3) {}
        while (true) {
            while (true) {
                synchronized (this) {
                    if (!this.d.isEmpty()) {
                        final i[] array2 = this.d.values().toArray(new i[this.d.size()]);
                        this.d.clear();
                        if (this.u != null) {
                            array = this.u.values().toArray(new l[this.u.size()]);
                            this.u = null;
                        }
                        // monitorexit(this)
                        final int n = 0;
                        a.a.e.b b2 = b;
                        if (array2 != null) {
                            a.a.e.b b3;
                            for (int length = array2.length, i = 0; i < length; ++i, b = b3) {
                                final i j = array2[i];
                                try {
                                    j.a((a.a.e.b)ex);
                                    b3 = b;
                                }
                                catch (IOException ex2) {
                                    b3 = b;
                                    if (b != null) {
                                        b3 = (a.a.e.b)ex2;
                                    }
                                }
                            }
                            b2 = b;
                        }
                        if (array != null) {
                            for (int length2 = array.length, k = n; k < length2; ++k) {
                                array[k].a();
                            }
                        }
                        try {
                            this.q.close();
                            b = b2;
                        }
                        catch (IOException ex) {
                            b = b2;
                            if (b2 == null) {
                                b = (a.a.e.b)ex;
                            }
                        }
                        try {
                            this.p.close();
                        }
                        catch (IOException ex4) {}
                        if (b == null) {
                            return;
                        }
                        throw b;
                    }
                }
                final i[] array2 = null;
                continue;
            }
        }
    }
    
    final void a(final boolean b, final int n, final int n2, final l l) {
        final j q = this.q;
        // monitorenter(q)
        Label_0045: {
            if (l == null) {
                break Label_0045;
            }
            while (true) {
                try {
                    if (l.b == -1L) {
                        l.b = System.nanoTime();
                        this.q.a(b, n, n2);
                        // monitorexit(q)
                        return;
                    }
                    throw new IllegalStateException();
                    // monitorexit(q)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
    
    final i b(final int n) {
        synchronized (this) {
            final i i = this.d.remove(n);
            this.notifyAll();
            return i;
        }
    }
    
    final void b(final int n, final a.a.e.b b) {
        this.q.a(n, b);
    }
    
    public final boolean b() {
        synchronized (this) {
            return this.h;
        }
    }
    
    final l c(final int n) {
        synchronized (this) {
            if (this.u != null) {
                return this.u.remove(n);
            }
            return null;
        }
    }
    
    @Override
    public final void close() {
        this.a(a.a.e.b.a, a.a.e.b.f);
    }
    
    public static final class a
    {
        public Socket a;
        public String b;
        public e c;
        public d d;
        public b e;
        m f;
        boolean g;
        
        public a() {
            super();
            this.e = b.l;
            this.f = m.a;
            this.g = true;
        }
    }
    
    public abstract static class b
    {
        public static final b l;
        
        static {
            l = new b() {
                g$b$1() {
                    super();
                }
                
                @Override
                public final void a(final i i) {
                    i.a(a.a.e.b.e);
                }
            };
        }
        
        public b() {
            super();
        }
        
        public void a(final g g) {
        }
        
        public abstract void a(final i p0);
    }
    
    final class c extends a.a.b implements h.b
    {
        final h a;
        final /* synthetic */ g c;
        
        c(final g c, final h a) {
            this.c = c;
            super("OkHttp %s", new Object[] { c.e });
            this.a = a;
        }
        
        @Override
        public final void a(final int n) {
            Object c = this.c;
            synchronized (c) {
                final i[] array = this.c.d.values().toArray(new i[this.c.d.size()]);
                this.c.h = true;
                // monitorexit(c)
                for (int length = array.length, i = 0; i < length; ++i) {
                    c = array[i];
                    if (((i)c).c > n && ((i)c).b()) {
                        ((i)c).c(b.e);
                        this.c.b(((i)c).c);
                    }
                }
            }
        }
        
        @Override
        public final void a(final int n, final long n2) {
            if (n == 0) {
                synchronized (this.c) {
                    final g c = this.c;
                    c.l += n2;
                    this.c.notifyAll();
                    return;
                }
            }
            final i a = this.c.a(n);
            if (a != null) {
                synchronized (a) {
                    a.a(n2);
                }
            }
        }
        
        @Override
        public final void a(final int n, final b b) {
            if (a.a.e.g.d(n)) {
                final g c = this.c;
                c.i.execute(new a.a.b(new Object[] { c.e, n }) {
                    final /* synthetic */ int a;
                    final /* synthetic */ b c;
                    final /* synthetic */ g d;
                    
                    g$7(final String s, final Object[] array) {
                        super(s, array);
                    }
                    
                    public final void blockBack2() {
                        synchronized (c) {
                            c.s.remove(n);
                        }
                    }
                });
                return;
            }
            final i b2 = this.c.b(n);
            if (b2 != null) {
                b2.c(b);
            }
        }
        
        @Override
        public final void a(final int n, final List<a.a.e.c> list) {
            final g c = this.c;
            synchronized (c) {
                if (c.s.contains(n)) {
                    c.a(n, b.b);
                    return;
                }
                c.s.add(n);
                // monitorexit(c)
                c.i.execute(new a.a.b(new Object[] { c.e, n }) {
                    final /* synthetic */ int a;
                    final /* synthetic */ List c = list;
                    final /* synthetic */ g d;
                    
                    g$4(final String s, final Object[] array) {
                        super(s, array);
                    }
                    
                    public final void blockBack2() {
                        try {
                            c.q.a(n, b.f);
                            synchronized (c) {
                                c.s.remove(n);
                            }
                        }
                        catch (IOException ex) {}
                    }
                });
            }
        }
        
        @Override
        public final void a(final n p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //     4: astore          9
            //     6: aload           9
            //     8: mon\u0131torenter   
            //     9: aload_0        
            //    10: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //    13: getf\u0131eld        a/a/e/g.n:La/a/e/n;
            //    16: \u0131nvokev\u0131rtual   a/a/e/n.b:()I
            //    19: \u0131store          4
            //    21: aload_0        
            //    22: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //    25: getf\u0131eld        a/a/e/g.n:La/a/e/n;
            //    28: astore          10
            //    30: \u0131const_0       
            //    31: \u0131store_3       
            //    32: \u0131const_0       
            //    33: \u0131store_2       
            //    34: \u0131load_2        
            //    35: b\u0131push          10
            //    37: \u0131f_\u0131cmpge       64
            //    40: aload_1        
            //    41: \u0131load_2        
            //    42: \u0131nvokev\u0131rtual   a/a/e/n.a:(I)Z
            //    45: \u0131feq            335
            //    48: aload           10
            //    50: \u0131load_2        
            //    51: aload_1        
            //    52: getf\u0131eld        a/a/e/n.b:[I
            //    55: \u0131load_2        
            //    56: \u0131aload         
            //    57: \u0131nvokev\u0131rtual   a/a/e/n.a:(II)La/a/e/n;
            //    60: pop            
            //    61: goto            335
            //    64: getstat\u0131c       a/a/e/g.a:Ljava/util/concurrent/ExecutorService;
            //    67: new             La/a/e/g$c$3;
            //    70: dup            
            //    71: aload_0        
            //    72: ldc             "OkHttp %s ACK Settings"
            //    74: \u0131const_1       
            //    75: anewarray       Ljava/lang/Object;
            //    78: dup            
            //    79: \u0131const_0       
            //    80: aload_0        
            //    81: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //    84: getf\u0131eld        a/a/e/g.e:Ljava/lang/String;
            //    87: aastore        
            //    88: aload_1        
            //    89: \u0131nvokespec\u0131al   a/a/e/g$c$3.<init>:(La/a/e/g$c;Ljava/lang/String;[Ljava/lang/Object;La/a/e/n;)V
            //    92: \u0131nvoke\u0131nterface java/util/concurrent/ExecutorService.execute:(Ljava/lang/Runnable;)V
            //    97: aload_0        
            //    98: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //   101: getf\u0131eld        a/a/e/g.n:La/a/e/n;
            //   104: \u0131nvokev\u0131rtual   a/a/e/n.b:()I
            //   107: \u0131store_2       
            //   108: aconst_null    
            //   109: astore_1       
            //   110: \u0131load_2        
            //   111: \u0131const_m1      
            //   112: \u0131f_\u0131cmpeq       342
            //   115: \u0131load_2        
            //   116: \u0131load           4
            //   118: \u0131f_\u0131cmpeq       342
            //   121: \u0131load_2        
            //   122: \u0131load           4
            //   124: \u0131sub           
            //   125: \u01312l            
            //   126: lstore          7
            //   128: aload_0        
            //   129: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //   132: getf\u0131eld        a/a/e/g.o:Z
            //   135: \u0131fne            177
            //   138: aload_0        
            //   139: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //   142: astore          10
            //   144: aload           10
            //   146: aload           10
            //   148: getf\u0131eld        a/a/e/g.l:J
            //   151: lload           7
            //   153: ladd           
            //   154: putf\u0131eld        a/a/e/g.l:J
            //   157: lload           7
            //   159: lconst_0       
            //   160: lcmp           
            //   161: \u0131fle            169
            //   164: aload           10
            //   166: \u0131nvokev\u0131rtual   java/lang/Object.notifyAll:()V
            //   169: aload_0        
            //   170: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //   173: \u0131const_1       
            //   174: putf\u0131eld        a/a/e/g.o:Z
            //   177: lload           7
            //   179: lstore          5
            //   181: aload_0        
            //   182: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //   185: getf\u0131eld        a/a/e/g.d:Ljava/util/Map;
            //   188: \u0131nvoke\u0131nterface java/util/Map.isEmpty:()Z
            //   193: \u0131fne            239
            //   196: aload_0        
            //   197: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //   200: getf\u0131eld        a/a/e/g.d:Ljava/util/Map;
            //   203: \u0131nvoke\u0131nterface java/util/Map.values:()Ljava/util/Collection;
            //   208: aload_0        
            //   209: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //   212: getf\u0131eld        a/a/e/g.d:Ljava/util/Map;
            //   215: \u0131nvoke\u0131nterface java/util/Map.size:()I
            //   220: anewarray       La/a/e/i;
            //   223: \u0131nvoke\u0131nterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
            //   228: checkcast       [La/a/e/i;
            //   231: astore_1       
            //   232: lload           7
            //   234: lstore          5
            //   236: goto            239
            //   239: getstat\u0131c       a/a/e/g.a:Ljava/util/concurrent/ExecutorService;
            //   242: new             La/a/e/g$c$2;
            //   245: dup            
            //   246: aload_0        
            //   247: ldc             "OkHttp %s settings"
            //   249: \u0131const_1       
            //   250: anewarray       Ljava/lang/Object;
            //   253: dup            
            //   254: \u0131const_0       
            //   255: aload_0        
            //   256: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //   259: getf\u0131eld        a/a/e/g.e:Ljava/lang/String;
            //   262: aastore        
            //   263: \u0131nvokespec\u0131al   a/a/e/g$c$2.<init>:(La/a/e/g$c;Ljava/lang/String;[Ljava/lang/Object;)V
            //   266: \u0131nvoke\u0131nterface java/util/concurrent/ExecutorService.execute:(Ljava/lang/Runnable;)V
            //   271: aload           9
            //   273: mon\u0131torex\u0131t    
            //   274: aload_1        
            //   275: \u0131fnull          328
            //   278: lload           5
            //   280: lconst_0       
            //   281: lcmp           
            //   282: \u0131feq            328
            //   285: aload_1        
            //   286: arraylength    
            //   287: \u0131store          4
            //   289: \u0131load_3        
            //   290: \u0131store_2       
            //   291: \u0131load_2        
            //   292: \u0131load           4
            //   294: \u0131f_\u0131cmpge       328
            //   297: aload_1        
            //   298: \u0131load_2        
            //   299: aaload         
            //   300: astore          9
            //   302: aload           9
            //   304: mon\u0131torenter   
            //   305: aload           9
            //   307: lload           5
            //   309: \u0131nvokev\u0131rtual   a/a/e/i.a:(J)V
            //   312: aload           9
            //   314: mon\u0131torex\u0131t    
            //   315: \u0131load_2        
            //   316: \u0131const_1       
            //   317: \u0131add           
            //   318: \u0131store_2       
            //   319: goto            291
            //   322: astore_1       
            //   323: aload           9
            //   325: mon\u0131torex\u0131t    
            //   326: aload_1        
            //   327: athrow         
            //   328: return         
            //   329: astore_1       
            //   330: aload           9
            //   332: mon\u0131torex\u0131t    
            //   333: aload_1        
            //   334: athrow         
            //   335: \u0131load_2        
            //   336: \u0131const_1       
            //   337: \u0131add           
            //   338: \u0131store_2       
            //   339: goto            34
            //   342: lconst_0       
            //   343: lstore          5
            //   345: goto            239
            //    StackMapTable: 00 0B FF 00 22 00 0B 07 00 02 07 00 9E 01 01 01 00 00 00 00 07 00 08 07 00 9E 00 00 1D FF 00 68 00 0A 07 00 02 05 01 01 01 00 00 04 07 00 08 07 00 08 00 00 FF 00 07 00 0A 07 00 02 05 01 01 01 00 00 04 07 00 08 07 00 1A 00 00 FF 00 3D 00 0A 07 00 02 07 00 3C 01 01 01 04 00 00 07 00 08 07 00 1A 00 00 FF 00 33 00 0A 07 00 02 07 00 3C 01 01 01 04 00 00 07 00 1A 07 00 1A 00 00 FF 00 1E 00 0A 07 00 02 07 00 1A 01 01 01 04 00 00 07 00 34 07 00 1A 00 01 07 00 54 FF 00 05 00 0A 07 00 02 07 00 3C 01 01 01 04 00 00 07 00 1A 07 00 1A 00 00 FF 00 00 00 0A 07 00 02 07 00 1A 00 00 00 00 00 00 00 07 00 08 00 01 07 00 54 FF 00 05 00 0B 07 00 02 07 00 9E 01 01 01 00 00 00 00 07 00 08 07 00 9E 00 00 FF 00 06 00 0B 07 00 02 05 01 01 01 00 00 00 00 07 00 08 07 00 9E 00 00
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  9      30     329    335    Any
            //  40     61     329    335    Any
            //  64     108    329    335    Any
            //  128    157    329    335    Any
            //  164    169    329    335    Any
            //  169    177    329    335    Any
            //  181    232    329    335    Any
            //  239    274    329    335    Any
            //  305    315    322    328    Any
            //  323    326    322    328    Any
            //  330    333    329    335    Any
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public final void a(final boolean b, final int n, final int n2) {
            if (!b) {
                final g c = this.c;
                a.a.e.g.a.execute(new a.a.b(new Object[] { c.e, n, n2 }) {
                    final /* synthetic */ boolean a;
                    final /* synthetic */ int c;
                    final /* synthetic */ int d;
                    final /* synthetic */ l e;
                    final /* synthetic */ g f;
                    
                    g$3(final String s, final Object[] array) {
                        this.a = true;
                        this.e = null;
                        super(s, array);
                    }
                    
                    public final void blockBack2() {
                        try {
                            c.a(this.a, n, n2, this.e);
                        }
                        catch (IOException ex) {}
                    }
                });
                return;
            }
            final l c2 = this.c.c(n);
            if (c2 == null) {
                return;
            }
            if (c2.c == -1L && c2.b != -1L) {
                c2.c = System.nanoTime();
                c2.a.countDown();
                return;
            }
            throw new IllegalStateException();
        }
        
        @Override
        public final void a(final boolean b, final int n, final e e, final int n2) {
            if (a.a.e.g.d(n)) {
                final g c = this.c;
                final b.c c2 = new b.c();
                final long n3 = n2;
                e.a(n3);
                e.a(c2, n3);
                if (c2.b == n3) {
                    c.i.execute(new a.a.b(new Object[] { c.e, n }) {
                        final /* synthetic */ int a;
                        final /* synthetic */ b.c c;
                        final /* synthetic */ int d;
                        final /* synthetic */ boolean e;
                        final /* synthetic */ g f;
                        
                        g$6(final String s, final Object[] array) {
                            super(s, array);
                        }
                        
                        public final void blockBack2() {
                            try {
                                c.j.a(c2, n2);
                                c.q.a(n, b.f);
                                synchronized (c) {
                                    c.s.remove(n);
                                }
                            }
                            catch (IOException ex) {}
                        }
                    });
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(c2.b);
                sb.append(" != ");
                sb.append(n2);
                throw new IOException(sb.toString());
            }
            else {
                final i a = this.c.a(n);
                if (a == null) {
                    this.c.a(n, b.b);
                    e.f(n2);
                    return;
                }
                if (!a.a.e.i.l && Thread.holdsLock(a)) {
                    throw new AssertionError();
                }
                a.g.a(e, n2);
                if (b) {
                    a.e();
                }
            }
        }
        
        @Override
        public final void a(final boolean b, final int f, final List<a.a.e.c> e) {
            final boolean d = a.a.e.g.d(f);
            boolean a = true;
            if (d) {
                final g c = this.c;
                c.i.execute(new a.a.b(new Object[] { c.e, f }) {
                    final /* synthetic */ int a;
                    final /* synthetic */ List c = e;
                    final /* synthetic */ boolean d;
                    final /* synthetic */ g e;
                    
                    g$5(final String s, final Object[] array) {
                        super(s, array);
                    }
                    
                    public final void blockBack2() {
                        try {
                            c.q.a(f, b.f);
                            synchronized (c) {
                                c.s.remove(f);
                            }
                        }
                        catch (IOException ex) {}
                    }
                });
                return;
            }
            Object c2 = this.c;
            synchronized (c2) {
                if (this.c.h) {
                    return;
                }
                final i a2 = this.c.a(f);
                if (a2 == null) {
                    if (f <= this.c.f) {
                        return;
                    }
                    if (f % 2 == this.c.g % 2) {
                        return;
                    }
                    final i i = new i(f, this.c, false, b, e);
                    this.c.f = f;
                    this.c.d.put(f, i);
                    a.a.e.g.a.execute(new a.a.b("OkHttp %s stream %d", new Object[] { this.c.e, f }) {
                        final /* synthetic */ i a;
                        final /* synthetic */ c c;
                        
                        g$c$1(final String s, final Object[] array) {
                            this.c = c;
                            super(s, array);
                        }
                        
                        public final void blockBack2() {
                            try {
                                this.c.c.c.a(i);
                            }
                            catch (IOException ex) {
                                final a.a.g.e b = a.a.g.e.b();
                                final StringBuilder sb = new StringBuilder("Http2Connection.Listener failure for ");
                                sb.append(this.c.c.e);
                                b.a(4, sb.toString(), ex);
                                try {
                                    i.a(a.a.e.b.b);
                                }
                                catch (IOException ex2) {}
                            }
                        }
                    });
                }
                else {
                    // monitorexit(c2)
                    if (!a.a.e.i.l && Thread.holdsLock(a2)) {
                        throw new AssertionError();
                    }
                    synchronized (a2) {
                        a2.f = true;
                        if (a2.e == null) {
                            a2.e = e;
                            a = a2.a();
                            a2.notifyAll();
                        }
                        else {
                            c2 = new ArrayList<a.a.e.c>();
                            ((List<a.a.e.c>)c2).addAll(a2.e);
                            ((List<a.a.e.c>)c2).add(null);
                            ((List<a.a.e.c>)c2).addAll(e);
                            a2.e = (List<a.a.e.c>)c2;
                        }
                        // monitorexit(a2)
                        if (!a) {
                            a2.d.b(a2.c);
                        }
                        if (b) {
                            a2.e();
                        }
                    }
                }
            }
        }
        
        public final void blockBack2() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: astore_3       
            //     4: getstat\u0131c       a/a/e/b.c:La/a/e/b;
            //     7: astore          5
            //     9: aload_3        
            //    10: astore_2       
            //    11: aload_0        
            //    12: getf\u0131eld        a/a/e/g$c.a:La/a/e/h;
            //    15: astore_1       
            //    16: aload_3        
            //    17: astore_2       
            //    18: aload_1        
            //    19: getf\u0131eld        a/a/e/h.c:Z
            //    22: \u0131feq            52
            //    25: aload_3        
            //    26: astore_2       
            //    27: aload_1        
            //    28: \u0131const_1       
            //    29: aload_0        
            //    30: \u0131nvokev\u0131rtual   a/a/e/h.a:(ZLa/a/e/h$b;)Z
            //    33: \u0131feq            39
            //    36: goto            122
            //    39: aload_3        
            //    40: astore_2       
            //    41: ldc_w           "Required SETTINGS preface not received"
            //    44: \u0131const_0       
            //    45: anewarray       Ljava/lang/Object;
            //    48: \u0131nvokestat\u0131c    a/a/e/e.b:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;
            //    51: athrow         
            //    52: aload_3        
            //    53: astore_2       
            //    54: aload_1        
            //    55: getf\u0131eld        a/a/e/h.b:Lb/e;
            //    58: getstat\u0131c       a/a/e/e.a:Lb/f;
            //    61: \u0131nvokev\u0131rtual   b/f.g:()I
            //    64: \u01312l            
            //    65: \u0131nvoke\u0131nterface b/e.c:(J)Lb/f;
            //    70: astore_1       
            //    71: aload_3        
            //    72: astore_2       
            //    73: getstat\u0131c       a/a/e/h.a:Ljava/util/logging/Logger;
            //    76: getstat\u0131c       java/util/logging/Level.FINE:Ljava/util/logging/Level;
            //    79: \u0131nvokev\u0131rtual   java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
            //    82: \u0131feq            110
            //    85: aload_3        
            //    86: astore_2       
            //    87: getstat\u0131c       a/a/e/h.a:Ljava/util/logging/Logger;
            //    90: ldc_w           "<< CONNECTION %s"
            //    93: \u0131const_1       
            //    94: anewarray       Ljava/lang/Object;
            //    97: dup            
            //    98: \u0131const_0       
            //    99: aload_1        
            //   100: \u0131nvokev\u0131rtual   b/f.e:()Ljava/lang/String;
            //   103: aastore        
            //   104: \u0131nvokestat\u0131c    a/a/c.a:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            //   107: \u0131nvokev\u0131rtual   java/util/logging/Logger.fine:(Ljava/lang/String;)V
            //   110: aload_3        
            //   111: astore_2       
            //   112: getstat\u0131c       a/a/e/e.a:Lb/f;
            //   115: aload_1        
            //   116: \u0131nvokev\u0131rtual   b/f.equals:(Ljava/lang/Object;)Z
            //   119: \u0131feq            176
            //   122: aload_3        
            //   123: astore_2       
            //   124: aload_0        
            //   125: getf\u0131eld        a/a/e/g$c.a:La/a/e/h;
            //   128: \u0131const_0       
            //   129: aload_0        
            //   130: \u0131nvokev\u0131rtual   a/a/e/h.a:(ZLa/a/e/h$b;)Z
            //   133: \u0131fne            122
            //   136: aload_3        
            //   137: astore_2       
            //   138: getstat\u0131c       a/a/e/b.a:La/a/e/b;
            //   141: astore_1       
            //   142: aload_1        
            //   143: astore_2       
            //   144: getstat\u0131c       a/a/e/b.f:La/a/e/b;
            //   147: astore          4
            //   149: aload_0        
            //   150: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //   153: astore_3       
            //   154: aload           4
            //   156: astore_2       
            //   157: aload_3        
            //   158: aload_1        
            //   159: aload_2        
            //   160: \u0131nvokev\u0131rtual   a/a/e/g.a:(La/a/e/b;La/a/e/b;)V
            //   163: aload_0        
            //   164: getf\u0131eld        a/a/e/g$c.a:La/a/e/h;
            //   167: \u0131nvokestat\u0131c    a/a/c.a:(Ljava/io/Closeable;)V
            //   170: return         
            //   171: aload_1        
            //   172: astore_2       
            //   173: goto            200
            //   176: aload_3        
            //   177: astore_2       
            //   178: ldc_w           "Expected a connection header but was %s"
            //   181: \u0131const_1       
            //   182: anewarray       Ljava/lang/Object;
            //   185: dup            
            //   186: \u0131const_0       
            //   187: aload_1        
            //   188: \u0131nvokev\u0131rtual   b/f.a:()Ljava/lang/String;
            //   191: aastore        
            //   192: \u0131nvokestat\u0131c    a/a/e/e.b:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;
            //   195: athrow         
            //   196: astore_1       
            //   197: goto            225
            //   200: getstat\u0131c       a/a/e/b.b:La/a/e/b;
            //   203: astore_1       
            //   204: aload_1        
            //   205: astore_2       
            //   206: getstat\u0131c       a/a/e/b.b:La/a/e/b;
            //   209: astore_3       
            //   210: aload_0        
            //   211: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //   214: astore          4
            //   216: aload_3        
            //   217: astore_2       
            //   218: aload           4
            //   220: astore_3       
            //   221: goto            157
            //   224: astore_1       
            //   225: aload_0        
            //   226: getf\u0131eld        a/a/e/g$c.c:La/a/e/g;
            //   229: aload_2        
            //   230: aload           5
            //   232: \u0131nvokev\u0131rtual   a/a/e/g.a:(La/a/e/b;La/a/e/b;)V
            //   235: aload_0        
            //   236: getf\u0131eld        a/a/e/g$c.a:La/a/e/h;
            //   239: \u0131nvokestat\u0131c    a/a/c.a:(Ljava/io/Closeable;)V
            //   242: aload_1        
            //   243: athrow         
            //   244: astore_1       
            //   245: aload_3        
            //   246: astore_2       
            //   247: goto            200
            //   250: astore_2       
            //   251: goto            171
            //   254: astore_1       
            //   255: goto            163
            //   258: astore_2       
            //   259: goto            235
            //    StackMapTable: 00 11 FF 00 27 00 06 07 00 02 07 01 52 07 00 49 07 00 49 00 07 00 49 00 00 0C FF 00 39 00 06 07 00 02 07 01 66 07 00 49 07 00 49 00 07 00 49 00 00 FF 00 0B 00 06 07 00 02 07 00 1A 07 00 49 07 00 49 00 07 00 49 00 00 FF 00 22 00 06 07 00 02 07 00 49 07 00 49 07 00 08 07 00 1A 07 00 49 00 00 FF 00 05 00 06 07 00 02 07 00 1A 07 00 49 07 00 1A 00 07 00 49 00 00 FF 00 07 00 06 07 00 02 07 00 49 07 01 02 07 00 49 00 07 00 49 00 00 FF 00 04 00 06 07 00 02 07 01 66 07 00 49 07 00 49 00 07 00 49 00 00 FF 00 13 00 06 07 00 02 00 07 00 49 07 00 49 00 07 00 49 00 01 07 00 54 FF 00 03 00 06 07 00 02 07 00 1A 07 00 49 07 00 49 00 07 00 49 00 00 FF 00 17 00 06 07 00 02 07 00 49 07 00 49 07 00 49 00 07 00 49 00 01 07 00 54 FF 00 00 00 06 07 00 02 07 00 54 07 00 49 07 00 49 00 07 00 49 00 00 FF 00 09 00 06 07 00 02 07 00 54 07 00 1A 07 00 49 00 07 00 49 00 00 FF 00 08 00 06 07 00 02 00 07 00 49 07 00 49 00 07 00 49 00 01 07 01 02 FF 00 05 00 06 07 00 02 07 00 49 07 00 49 07 00 49 00 07 00 49 00 01 07 01 02 FF 00 03 00 06 07 00 02 07 00 49 07 00 49 07 00 1A 00 07 00 49 00 01 07 01 02 FF 00 03 00 06 07 00 02 07 00 54 07 00 49 07 00 49 00 07 00 49 00 01 07 01 02
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  11     16     244    250    Ljava/io/IOException;
            //  11     16     196    200    Any
            //  18     25     244    250    Ljava/io/IOException;
            //  18     25     196    200    Any
            //  27     36     244    250    Ljava/io/IOException;
            //  27     36     196    200    Any
            //  41     52     244    250    Ljava/io/IOException;
            //  41     52     196    200    Any
            //  54     71     244    250    Ljava/io/IOException;
            //  54     71     196    200    Any
            //  73     85     244    250    Ljava/io/IOException;
            //  73     85     196    200    Any
            //  87     110    244    250    Ljava/io/IOException;
            //  87     110    196    200    Any
            //  112    122    244    250    Ljava/io/IOException;
            //  112    122    196    200    Any
            //  124    136    244    250    Ljava/io/IOException;
            //  124    136    196    200    Any
            //  138    142    244    250    Ljava/io/IOException;
            //  138    142    196    200    Any
            //  144    149    250    176    Ljava/io/IOException;
            //  144    149    224    225    Any
            //  149    154    254    258    Ljava/io/IOException;
            //  157    163    254    258    Ljava/io/IOException;
            //  178    196    244    250    Ljava/io/IOException;
            //  178    196    196    200    Any
            //  200    204    196    200    Any
            //  206    210    224    225    Any
            //  210    216    254    258    Ljava/io/IOException;
            //  225    235    258    262    Ljava/io/IOException;
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
    }
}
