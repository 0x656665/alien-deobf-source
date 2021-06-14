/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.e;

import a.a.c;
import a.a.e.b;
import a.a.e.d;
import a.a.e.e;
import a.a.e.n;
import b.f;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class j
implements Closeable {
    private static final Logger c = Logger.getLogger(e.class.getName());
    int a;
    final d.b b;
    private final b.d d;
    private final boolean e;
    private final b.c f;
    private boolean g;

    public j(b.d d2, boolean bl) {
        this.d = d2;
        this.e = bl;
        this.f = new b.c();
        this.b = new d.b(this.f);
        this.a = 16384;
    }

    private void a(int n2, int n3, byte by, byte by2) {
        if (c.isLoggable(Level.FINE)) {
            c.fine(e.a(false, n2, n3, by, by2));
        }
        if (n3 > this.a) {
            throw e.a("FRAME_SIZE_ERROR length > %d: %d", this.a, n3);
        }
        if ((Integer.MIN_VALUE & n2) != 0) throw e.a("reserved bit set: %s", n2);
        j.a(this.d, n3);
        this.d.h(by & 255);
        this.d.h(by2 & 255);
        this.d.f(n2 & Integer.MAX_VALUE);
    }

    private static void a(b.d d2, int n2) {
        d2.h(n2 >>> 16 & 255);
        d2.h(n2 >>> 8 & 255);
        d2.h(n2 & 255);
    }

    private void b(int n2, long l2) {
        while (l2 > 0L) {
            int n3;
            long l3;
            byte by = (l2 -= (l3 = (long)(n3 = (int)Math.min((long)this.a, l2)))) == 0L ? (byte)4 : 0;
            this.a(n2, n3, (byte)9, by);
            this.d.a_(this.f, l3);
        }
    }

    public final void blockBack() {
        synchronized (this) {
            if (this.g) throw new IOException("closed");
            boolean bl = this.e;
            if (!bl) {
                return;
            }
            if (c.isLoggable(Level.FINE)) {
                c.fine(c.a(">> CONNECTION %s", new Object[]{e.a.e()}));
            }
            this.d.b(e.a.h());
            this.d.flush();
            return;
        }
    }

    public final void a(int n2, long l2) {
        synchronized (this) {
            if (this.g) throw new IOException("closed");
            if (l2 == 0L || l2 > Integer.MAX_VALUE) throw e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", l2);
            this.a(n2, 4, (byte)8, (byte)0);
            this.d.f((int)l2);
            this.d.flush();
            return;
        }
    }

    public final void a(int n2, b b2) {
        synchronized (this) {
            if (this.g) throw new IOException("closed");
            if (b2.g == -1) throw new IllegalArgumentException();
            this.a(n2, 4, (byte)3, (byte)0);
            this.d.f(b2.g);
            this.d.flush();
            return;
        }
    }

    public final void a(int n2, b b2, byte[] arrby) {
        synchronized (this) {
            if (this.g) throw new IOException("closed");
            if (b2.g == -1) throw e.a("errorCode.httpCode == -1", new Object[0]);
            this.a(0, arrby.length + 8, (byte)7, (byte)0);
            this.d.f(n2);
            this.d.f(b2.g);
            if (arrby.length > 0) {
                this.d.b(arrby);
            }
            this.d.flush();
            return;
        }
    }

    public final void a(n n2) {
        synchronized (this) {
            if (this.g) throw new IOException("closed");
            int n3 = this.a;
            if ((n2.a & 32) != 0) {
                n3 = n2.b[5];
            }
            this.a = n3;
            if (n2.a() != -1) {
                this.b.a(n2.a());
            }
            this.a(0, 0, (byte)4, (byte)1);
            this.d.flush();
            return;
        }
    }

    public final void a(boolean bl, int n2, int n3) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    public final void a(boolean bl, int n2, b.c c2, int n3) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    public final void a(boolean bl, int n2, List<a.a.e.c> list) {
        synchronized (this) {
            if (this.g) throw new IOException("closed");
            if (this.g) throw new IOException("closed");
            this.b.a(list);
            long l2 = this.f.b;
            int n3 = (int)Math.min((long)this.a, l2);
            long l3 = n3;
            byte by = l2 == l3 ? (byte)4 : 0;
            byte by2 = by;
            if (bl) {
                by2 = (byte)(by | 1);
            }
            this.a(n2, n3, (byte)1, by2);
            this.d.a_(this.f, l3);
            if (l2 <= l3) return;
            this.b(n2, l2 - l3);
            return;
        }
    }

    public final void blockBack2() {
        synchronized (this) {
            if (this.g) throw new IOException("closed");
            this.d.flush();
            return;
        }
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public final void b(n n2) {
        synchronized (this) {
            if (this.g) throw new IOException("closed");
            int n3 = Integer.bitCount(n2.a);
            int n4 = 0;
            this.a(0, n3 * 6, (byte)4, (byte)0);
            do {
                if (n4 >= 10) {
                    this.d.flush();
                    return;
                }
                if (n2.a(n4)) {
                    n3 = n4 == 4 ? 3 : (n4 == 7 ? 4 : n4);
                    this.d.g(n3);
                    this.d.f(n2.b[n4]);
                }
                ++n4;
            } while (true);
        }
    }

    @Override
    public final void close() {
        synchronized (this) {
            this.g = true;
            this.d.close();
            return;
        }
    }
}

