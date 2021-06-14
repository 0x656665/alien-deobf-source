package b;

import java.io.*;

static final class k$2 implements r {
    final /* synthetic */ s a;
    final /* synthetic */ InputStream b;
    
    k$2(final s a, final InputStream b) {
        this.a = a;
        this.b = b;
        super();
    }
    
    @Override
    public final long a(final c c, long b) {
        if (b >= 0L) {
            if (b == 0L) {
                return 0L;
            }
            try {
                this.a.f_();
                final n e = c.e(1);
                final int read = this.b.read(e.a, e.c, (int)Math.min(b, 8192 - e.c));
                if (read == -1) {
                    return -1L;
                }
                e.c += read;
                b = c.b;
                final long n = read;
                c.b = b + n;
                return n;
            }
            catch (AssertionError assertionError) {
                if (k.a(assertionError)) {
                    throw new IOException(assertionError);
                }
                throw assertionError;
            }
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(b)));
    }
    
    @Override
    public final s a() {
        return this.a;
    }
    
    @Override
    public final void close() {
        this.b.close();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("source(");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}