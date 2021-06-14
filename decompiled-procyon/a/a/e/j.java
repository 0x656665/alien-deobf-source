package a.a.e;

import b.*;
import java.util.logging.*;
import java.io.*;
import java.util.*;

public final class j implements Closeable
{
    private static final Logger c;
    int a;
    final d.b b;
    private final b.d d;
    private final boolean e;
    private final c f;
    private boolean g;
    
    static {
        c = Logger.getLogger(e.class.getName());
    }
    
    public j(final b.d d, final boolean e) {
        super();
        this.d = d;
        this.e = e;
        this.f = new c();
        this.b = new d.b(this.f);
        this.a = 16384;
    }
    
    private void a(final int n, final int n2, final byte b, final byte b2) {
        if (j.c.isLoggable(Level.FINE)) {
            j.c.fine(a.a.e.e.a(false, n, n2, b, b2));
        }
        if (n2 > this.a) {
            throw a.a.e.e.a("FRAME_SIZE_ERROR length > %d: %d", this.a, n2);
        }
        if ((Integer.MIN_VALUE & n) == 0x0) {
            a(this.d, n2);
            this.d.h(b & 0xFF);
            this.d.h(b2 & 0xFF);
            this.d.f(n & Integer.MAX_VALUE);
            return;
        }
        throw a.a.e.e.a("reserved bit set: %s", n);
    }
    
    private static void a(final b.d d, final int n) {
        d.h(n >>> 16 & 0xFF);
        d.h(n >>> 8 & 0xFF);
        d.h(n & 0xFF);
    }
    
    private void b(final int n, long n2) {
        while (n2 > 0L) {
            final int n3 = (int)Math.min(this.a, n2);
            final long n4 = n3;
            n2 -= n4;
            byte b;
            if (n2 == 0L) {
                b = 4;
            }
            else {
                b = 0;
            }
            this.a(n, n3, (byte)9, b);
            this.d.a_(this.f, n4);
        }
    }
    
    public final void blockBack() {
        synchronized (this) {
            if (this.g) {
                throw new IOException("closed");
            }
            if (!this.e) {
                return;
            }
            if (j.c.isLoggable(Level.FINE)) {
                j.c.fine(a.a.c.a(">> CONNECTION %s", a.a.e.e.a.e()));
            }
            this.d.b(a.a.e.e.a.h());
            this.d.flush();
        }
    }
    
    public final void a(final int n, final long n2) {
        synchronized (this) {
            if (this.g) {
                throw new IOException("closed");
            }
            if (n2 != 0L && n2 <= 2147483647L) {
                this.a(n, 4, (byte)8, (byte)0);
                this.d.f((int)n2);
                this.d.flush();
                return;
            }
            throw a.a.e.e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", n2);
        }
    }
    
    public final void a(final int n, final b b) {
        synchronized (this) {
            if (this.g) {
                throw new IOException("closed");
            }
            if (b.g != -1) {
                this.a(n, 4, (byte)3, (byte)0);
                this.d.f(b.g);
                this.d.flush();
                return;
            }
            throw new IllegalArgumentException();
        }
    }
    
    public final void a(final int n, final b b, final byte[] array) {
        synchronized (this) {
            if (this.g) {
                throw new IOException("closed");
            }
            if (b.g != -1) {
                this.a(0, array.length + 8, (byte)7, (byte)0);
                this.d.f(n);
                this.d.f(b.g);
                if (array.length > 0) {
                    this.d.b(array);
                }
                this.d.flush();
                return;
            }
            throw a.a.e.e.a("errorCode.httpCode == -1", new Object[0]);
        }
    }
    
    public final void a(final n n) {
        synchronized (this) {
            if (!this.g) {
                int a = this.a;
                if ((n.a & 0x20) != 0x0) {
                    a = n.b[5];
                }
                this.a = a;
                if (n.a() != -1) {
                    this.b.a(n.a());
                }
                this.a(0, 0, (byte)4, (byte)1);
                this.d.flush();
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void a(final boolean b, final int n, final int n2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }
    
    public final void a(final boolean b, final int n, final c c, final int n2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }
    
    public final void a(final boolean b, final int n, final List<a.a.e.c> list) {
    Label_0065_Outer:
        while (true) {
            while (true) {
                byte b3 = 0;
                Label_0139: {
                    Label_0136: {
                        synchronized (this) {
                            if (this.g) {
                                throw new IOException("closed");
                            }
                            if (this.g) {
                                throw new IOException("closed");
                            }
                            this.b.a(list);
                            final long b2 = this.f.b;
                            final int n2 = (int)Math.min(this.a, b2);
                            final long n3 = n2;
                            if (b2 == n3) {
                                b3 = 4;
                                break Label_0139;
                            }
                            break Label_0136;
                            Label_0108: {
                                return;
                            }
                            while (true) {
                                this.b(n, b2 - n3);
                                return;
                                final byte b4;
                                this.a(n, n2, (byte)1, b4);
                                this.d.a_(this.f, n3);
                                continue Label_0065_Outer;
                            }
                        }
                        // \u0131ftrue(Label_0108:, b2 <= n3)
                    }
                    b3 = 0;
                }
                byte b4 = b3;
                if (b) {
                    b4 = (byte)(b3 | 0x1);
                    continue;
                }
                continue;
            }
        }
    }
    
    public final void blockBack2() {
        synchronized (this) {
            if (!this.g) {
                this.d.flush();
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void b(final n n) {
        while (true) {
            while (true) {
                int n2 = 0;
                Label_0127: {
                    while (true) {
                        synchronized (this) {
                            if (this.g) {
                                throw new IOException("closed");
                            }
                            final int bitCount = Integer.bitCount(n.a);
                            n2 = 0;
                            this.a(0, bitCount * 6, (byte)4, (byte)0);
                            if (n2 >= 10) {
                                this.d.flush();
                                return;
                            }
                            if (!n.a(n2)) {
                                break Label_0127;
                            }
                            if (n2 == 4) {
                                final int n3 = 3;
                                this.d.g(n3);
                                this.d.f(n.b[n2]);
                                break Label_0127;
                            }
                        }
                        if (n2 == 7) {
                            final int n3 = 4;
                            continue;
                        }
                        final int n3 = n2;
                        continue;
                    }
                }
                ++n2;
                continue;
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.g = true;
            this.d.close();
        }
    }
}
