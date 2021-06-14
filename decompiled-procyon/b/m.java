package b;

import java.nio.charset.*;
import java.io.*;

final class m implements e
{
    public final c a;
    public final r b;
    boolean c;
    
    m(final r b) {
        super();
        this.a = new c();
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("source == null");
    }
    
    private long a(final byte b, long max) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            final long a = this.a.a(b, max);
            if (a != -1L) {
                return a;
            }
            final long b2 = this.a.b;
            if (this.b.a(this.a, 8192L) == -1L) {
                return -1L;
            }
            max = Math.max(max, b2);
        }
    }
    
    private boolean b(final long n) {
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(n)));
        }
        if (!this.c) {
            while (this.a.b < n) {
                if (this.b.a(this.a, 8192L) == -1L) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final long a(final c c, long min) {
        if (c == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (min < 0L) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(min)));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.a.b == 0L && this.b.a(this.a, 8192L) == -1L) {
            return -1L;
        }
        min = Math.min(min, this.a.b);
        return this.a.a(c, min);
    }
    
    @Override
    public final s a() {
        return this.b.a();
    }
    
    @Override
    public final String a(final Charset charset) {
        if (charset != null) {
            this.a.a(this.b);
            return this.a.a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }
    
    @Override
    public final void a(final long n) {
        if (this.b(n)) {
            return;
        }
        throw new EOFException();
    }
    
    @Override
    public final c b() {
        return this.a;
    }
    
    @Override
    public final boolean b(final f f) {
        final int g = f.g();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (g < 0) {
            return false;
        }
        if (f.g() - 0 < g) {
            return false;
        }
        for (int i = 0; i < g; ++i) {
            final long n = i + 0L;
            if (!this.b(1L + n)) {
                return false;
            }
            if (this.a.b(n) != f.a(i + 0)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final f c(final long n) {
        this.a(n);
        return this.a.c(n);
    }
    
    @Override
    public final boolean c() {
        if (!this.c) {
            return this.a.c() && this.b.a(this.a, 8192L) == -1L;
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.a.o();
    }
    
    @Override
    public final byte e() {
        this.a(1L);
        return this.a.e();
    }
    
    @Override
    public final byte[] e(final long n) {
        this.a(n);
        return this.a.e(n);
    }
    
    @Override
    public final short f() {
        this.a(2L);
        return this.a.f();
    }
    
    @Override
    public final void f(long n) {
        if (!this.c) {
            while (n > 0L) {
                if (this.a.b == 0L && this.b.a(this.a, 8192L) == -1L) {
                    throw new EOFException();
                }
                final long min = Math.min(n, this.a.b);
                this.a.f(min);
                n -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final int g() {
        this.a(4L);
        return this.a.g();
    }
    
    @Override
    public final short h() {
        this.a(2L);
        return t.a(this.a.f());
    }
    
    @Override
    public final int i() {
        this.a(4L);
        return t.a(this.a.g());
    }
    
    @Override
    public final long j() {
        this.a(1L);
        int n = 0;
        while (true) {
            final int n2 = n + 1;
            if (!this.b(n2)) {
                break;
            }
            final byte b = this.a.b((long)n);
            if ((b < 48 || b > 57) && (b < 97 || b > 102) && (b < 65 || b > 70)) {
                if (n != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", b));
            }
            else {
                n = n2;
            }
        }
        return this.a.j();
    }
    
    @Override
    public final String m() {
        final long a = this.a((byte)10, 0L);
        if (a != -1L) {
            return this.a.d(a);
        }
        final c c = new c();
        this.a.a(c, 0L, Math.min(32L, this.a.b));
        final StringBuilder sb = new StringBuilder("\\n not found: size=");
        sb.append(this.a.b);
        sb.append(" content=");
        sb.append(c.k().e());
        sb.append("\u2026");
        throw new EOFException(sb.toString());
    }
    
    @Override
    public final long p() {
        return this.a((byte)0, 0L);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
