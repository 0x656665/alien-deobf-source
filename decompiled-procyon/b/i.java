package b;

import java.util.zip.*;
import java.io.*;

public final class i implements r
{
    private int a;
    private final e b;
    private final Inflater c;
    private final j d;
    private final CRC32 e;
    
    public i(final r r) {
        super();
        this.a = 0;
        this.e = new CRC32();
        if (r != null) {
            this.c = new Inflater(true);
            this.b = k.a(r);
            this.d = new j(this.b, this.c);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }
    
    private void a(final c c, long n, long n2) {
        n n3;
        for (n3 = c.a; n >= n3.c - n3.b; n -= n3.c - n3.b, n3 = n3.f) {}
        while (n2 > 0L) {
            final int n4 = (int)(n3.b + n);
            final int n5 = (int)Math.min(n3.c - n4, n2);
            this.e.update(n3.a, n4, n5);
            n2 -= n5;
            n3 = n3.f;
            n = 0L;
        }
    }
    
    private static void a(final String s, final int n, final int n2) {
        if (n2 == n) {
            return;
        }
        throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", s, n2, n));
    }
    
    @Override
    public final long a(final c c, long a) {
        if (a < 0L) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(a)));
        }
        if (a == 0L) {
            return 0L;
        }
        if (this.a == 0) {
            this.b.a(10L);
            final byte b = this.b.b().b(3L);
            final boolean b2 = (b >> 1 & 0x1) == 0x1;
            if (b2) {
                this.a(this.b.b(), 0L, 10L);
            }
            a("ID1ID2", 8075, this.b.f());
            this.b.f(8L);
            if ((b >> 2 & 0x1) == 0x1) {
                this.b.a(2L);
                if (b2) {
                    this.a(this.b.b(), 0L, 2L);
                }
                final short h = this.b.b().h();
                final e b3 = this.b;
                final long n = h;
                b3.a(n);
                if (b2) {
                    this.a(this.b.b(), 0L, n);
                }
                this.b.f(n);
            }
            if ((b >> 3 & 0x1) == 0x1) {
                final long p2 = this.b.p();
                if (p2 == -1L) {
                    throw new EOFException();
                }
                if (b2) {
                    this.a(this.b.b(), 0L, p2 + 1L);
                }
                this.b.f(p2 + 1L);
            }
            if ((b >> 4 & 0x1) == 0x1) {
                final long p3 = this.b.p();
                if (p3 == -1L) {
                    throw new EOFException();
                }
                if (b2) {
                    this.a(this.b.b(), 0L, p3 + 1L);
                }
                this.b.f(p3 + 1L);
            }
            if (b2) {
                a("FHCRC", this.b.h(), (short)this.e.getValue());
                this.e.reset();
            }
            this.a = 1;
        }
        if (this.a == 1) {
            final long b4 = c.b;
            a = this.d.a(c, a);
            if (a != -1L) {
                this.a(c, b4, a);
                return a;
            }
            this.a = 2;
        }
        if (this.a != 2) {
            return -1L;
        }
        a("CRC", this.b.i(), (int)this.e.getValue());
        a("ISIZE", this.b.i(), (int)this.c.getBytesWritten());
        this.a = 3;
        if (this.b.c()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
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
