/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import b.c;
import b.e;
import b.j;
import b.k;
import b.n;
import b.r;
import b.s;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class i
implements r {
    private int a = 0;
    private final e b;
    private final Inflater c;
    private final j d;
    private final CRC32 e = new CRC32();

    public i(r r2) {
        if (r2 == null) throw new IllegalArgumentException("source == null");
        this.c = new Inflater(true);
        this.b = k.a(r2);
        this.d = new j(this.b, this.c);
    }

    private void a(c object, long l2, long l3) {
        object = ((c)object).a;
        do {
            if (l2 < (long)(((n)object).c - ((n)object).b)) {
                while (l3 > 0L) {
                    int n2 = (int)((long)((n)object).b + l2);
                    int n3 = (int)Math.min((long)(((n)object).c - n2), l3);
                    this.e.update(((n)object).a, n2, n3);
                    l3 -= (long)n3;
                    object = ((n)object).f;
                    l2 = 0L;
                }
                return;
            }
            l2 -= (long)(((n)object).c - ((n)object).b);
            object = ((n)object).f;
        } while (true);
    }

    private static void a(String string, int n2, int n3) {
        if (n3 != n2) throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", string, n3, n2));
    }

    @Override
    public final long a(c c2, long l2) {
        long l3;
        if (l2 < 0L) throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(l2)));
        if (l2 == 0L) {
            return 0L;
        }
        if (this.a == 0) {
            this.b.a(10L);
            byte by = this.b.b().b(3L);
            boolean bl = (by >> 1 & 1) == 1;
            if (bl) {
                this.a(this.b.b(), 0L, 10L);
            }
            i.a("ID1ID2", 8075, this.b.f());
            this.b.f(8L);
            if ((by >> 2 & 1) == 1) {
                this.b.a(2L);
                if (bl) {
                    this.a(this.b.b(), 0L, 2L);
                }
                short s2 = this.b.b().h();
                e e2 = this.b;
                l3 = s2;
                e2.a(l3);
                if (bl) {
                    this.a(this.b.b(), 0L, l3);
                }
                this.b.f(l3);
            }
            if ((by >> 3 & 1) == 1) {
                l3 = this.b.p();
                if (l3 == -1L) throw new EOFException();
                if (bl) {
                    this.a(this.b.b(), 0L, l3 + 1L);
                }
                this.b.f(l3 + 1L);
            }
            if ((by >> 4 & 1) == 1) {
                l3 = this.b.p();
                if (l3 == -1L) throw new EOFException();
                if (bl) {
                    this.a(this.b.b(), 0L, l3 + 1L);
                }
                this.b.f(l3 + 1L);
            }
            if (bl) {
                i.a("FHCRC", this.b.h(), (short)this.e.getValue());
                this.e.reset();
            }
            this.a = 1;
        }
        if (this.a == 1) {
            l3 = c2.b;
            if ((l2 = this.d.a(c2, l2)) != -1L) {
                this.a(c2, l3, l2);
                return l2;
            }
            this.a = 2;
        }
        if (this.a != 2) return -1L;
        i.a("CRC", this.b.i(), (int)this.e.getValue());
        i.a("ISIZE", this.b.i(), (int)this.c.getBytesWritten());
        this.a = 3;
        if (!this.b.c()) throw new IOException("gzip finished without exhausting source");
        return -1L;
    }

    @Override
    public final s a() {
        return this.b.a();
    }

    @Override
    public final void close() {
        this.d.close();
    }
}

