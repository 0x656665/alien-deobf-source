package a.a.a;

import java.util.regex.*;
import a.a.f.*;
import java.util.*;
import java.util.concurrent.*;
import java.io.*;

public final class d implements Closeable, Flushable
{
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
        j = (d.class.desiredAssertionStatus() ^ true);
        a = Pattern.compile("[a-z0-9_-]{1,120}");
    }
    
    private void a(final a a) {
        synchronized (this) {
            final b a2 = a.a;
            if (a2.f == a) {
                for (int i = 0; i < this.c; ++i) {
                    this.b.a(a2.d[i]);
                }
                ++this.f;
                a2.f = null;
                if (false | a2.e) {
                    a2.e = true;
                    this.d.b("CLEAN").h(32);
                    this.d.b(a2.a);
                    a2.a(this.d);
                    this.d.h(10);
                }
                else {
                    this.e.remove(a2.a);
                    this.d.b("REMOVE").h(32);
                    this.d.b(a2.a);
                    this.d.h(10);
                }
                this.d.flush();
                if (this.l > this.k || this.a()) {
                    this.m.execute(this.n);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }
    
    private boolean a() {
        return this.f >= 2000 && this.f >= this.e.size();
    }
    
    private boolean a(final b b) {
        a a = b.f;
        int n2;
        final int n = n2 = 0;
        Label_0091: {
            if (a == null) {
                break Label_0091;
            }
            a = b.f;
            n2 = n;
            if (a.a.f != a) {
                break Label_0091;
            }
            n2 = 0;
        Label_0073_Outer:
            while (true) {
                Label_0080: {
                    if (n2 >= a.c.c) {
                        break Label_0080;
                    }
                    while (true) {
                        try {
                            a.c.b.a(a.a.d[n2]);
                            ++n2;
                            continue Label_0073_Outer;
                        Block_6_Outer:
                            while (true) {
                                this.b.a(b.c[n2]);
                                this.l -= b.b[n2];
                                b.b[n2] = 0L;
                                ++n2;
                                break Label_0091;
                                while (true) {
                                    this.m.execute(this.n);
                                    return true;
                                    a.a.f = null;
                                    n2 = n;
                                    break Label_0091;
                                    Label_0143: {
                                        ++this.f;
                                    }
                                    this.d.b("REMOVE").h(32).b(b.a).h(10);
                                    this.e.remove(b.a);
                                    continue;
                                }
                                Label_0220: {
                                    return true;
                                }
                                continue Block_6_Outer;
                            }
                        }
                        // \u0131ftrue(Label_0220:, !this.a())
                        // \u0131ftrue(Label_0143:, n2 >= this.c)
                        catch (IOException ex) {
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
    
    private boolean b() {
        synchronized (this) {
            return this.h;
        }
    }
    
    private void c() {
        synchronized (this) {
            if (!this.b()) {
                return;
            }
            throw new IllegalStateException("cache is closed");
        }
    }
    
    private void d() {
        while (this.l > this.k) {
            this.a(this.e.values().iterator().next());
        }
        this.i = false;
    }
    
    @Override
    public final void close() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: mon\u0131torenter   
        //     2: aload_0        
        //     3: getf\u0131eld        a/a/a/d.g:Z
        //     6: \u0131feq            168
        //     9: aload_0        
        //    10: getf\u0131eld        a/a/a/d.h:Z
        //    13: \u0131feq            19
        //    16: goto            168
        //    19: aload_0        
        //    20: getf\u0131eld        a/a/a/d.e:Ljava/util/LinkedHashMap;
        //    23: \u0131nvokev\u0131rtual   java/util/LinkedHashMap.values:()Ljava/util/Collection;
        //    26: aload_0        
        //    27: getf\u0131eld        a/a/a/d.e:Ljava/util/LinkedHashMap;
        //    30: \u0131nvokev\u0131rtual   java/util/LinkedHashMap.size:()I
        //    33: anewarray       La/a/a/d$b;
        //    36: \u0131nvoke\u0131nterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //    41: checkcast       [La/a/a/d$b;
        //    44: astore_3       
        //    45: aload_3        
        //    46: arraylength    
        //    47: \u0131store_2       
        //    48: \u0131const_0       
        //    49: \u0131store_1       
        //    50: \u0131load_1        
        //    51: \u0131load_2        
        //    52: \u0131f_\u0131cmpge       142
        //    55: aload_3        
        //    56: \u0131load_1        
        //    57: aaload         
        //    58: astore          4
        //    60: aload           4
        //    62: getf\u0131eld        a/a/a/d$b.f:La/a/a/d$a;
        //    65: \u0131fnull          181
        //    68: aload           4
        //    70: getf\u0131eld        a/a/a/d$b.f:La/a/a/d$a;
        //    73: astore          5
        //    75: aload           5
        //    77: getf\u0131eld        a/a/a/d$a.c:La/a/a/d;
        //    80: astore          4
        //    82: aload           4
        //    84: mon\u0131torenter   
        //    85: aload           5
        //    87: getf\u0131eld        a/a/a/d$a.b:Z
        //    90: \u0131fne            128
        //    93: aload           5
        //    95: getf\u0131eld        a/a/a/d$a.a:La/a/a/d$b;
        //    98: getf\u0131eld        a/a/a/d$b.f:La/a/a/d$a;
        //   101: aload           5
        //   103: \u0131f_acmpne       116
        //   106: aload           5
        //   108: getf\u0131eld        a/a/a/d$a.c:La/a/a/d;
        //   111: aload           5
        //   113: \u0131nvokespec\u0131al   a/a/a/d.a:(La/a/a/d$a;)V
        //   116: aload           5
        //   118: \u0131const_1       
        //   119: putf\u0131eld        a/a/a/d$a.b:Z
        //   122: aload           4
        //   124: mon\u0131torex\u0131t    
        //   125: goto            181
        //   128: new             Ljava/lang/IllegalStateException;
        //   131: dup            
        //   132: \u0131nvokespec\u0131al   java/lang/IllegalStateException.<init>:()V
        //   135: athrow         
        //   136: astore_3       
        //   137: aload           4
        //   139: mon\u0131torex\u0131t    
        //   140: aload_3        
        //   141: athrow         
        //   142: aload_0        
        //   143: \u0131nvokespec\u0131al   a/a/a/d.d:()V
        //   146: aload_0        
        //   147: getf\u0131eld        a/a/a/d.d:Lb/d;
        //   150: \u0131nvoke\u0131nterface b/d.close:()V
        //   155: aload_0        
        //   156: aconst_null    
        //   157: putf\u0131eld        a/a/a/d.d:Lb/d;
        //   160: aload_0        
        //   161: \u0131const_1       
        //   162: putf\u0131eld        a/a/a/d.h:Z
        //   165: aload_0        
        //   166: mon\u0131torex\u0131t    
        //   167: return         
        //   168: aload_0        
        //   169: \u0131const_1       
        //   170: putf\u0131eld        a/a/a/d.h:Z
        //   173: aload_0        
        //   174: mon\u0131torex\u0131t    
        //   175: return         
        //   176: astore_3       
        //   177: aload_0        
        //   178: mon\u0131torex\u0131t    
        //   179: aload_3        
        //   180: athrow         
        //   181: \u0131load_1        
        //   182: \u0131const_1       
        //   183: \u0131add           
        //   184: \u0131store_1       
        //   185: goto            50
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      16     176    181    Any
        //  19     48     176    181    Any
        //  60     85     176    181    Any
        //  85     116    136    142    Any
        //  116    125    136    142    Any
        //  128    136    136    142    Any
        //  137    140    136    142    Any
        //  140    142    176    181    Any
        //  142    165    176    181    Any
        //  168    173    176    181    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public final void flush() {
        synchronized (this) {
            if (!this.g) {
                return;
            }
            this.c();
            this.d();
            this.d.flush();
        }
    }
    
    public final class a
    {
        final b a;
        boolean b;
        final /* synthetic */ d c;
    }
    
    final class b
    {
        final String a;
        final long[] b;
        final File[] c;
        final File[] d;
        boolean e;
        a f;
        
        final void a(final b.d d) {
            final long[] b = this.b;
            for (int length = b.length, i = 0; i < length; ++i) {
                d.h(32).j(b[i]);
            }
        }
    }
}
