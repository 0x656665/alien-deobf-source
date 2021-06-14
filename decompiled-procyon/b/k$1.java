package b;

import java.io.*;

static final class k$1 implements q {
    final /* synthetic */ s a;
    final /* synthetic */ OutputStream b;
    
    k$1(final s a, final OutputStream b) {
        this.a = a;
        this.b = b;
        super();
    }
    
    @Override
    public final s a() {
        return this.a;
    }
    
    @Override
    public final void a_(final c c, long n) {
        t.a(c.b, 0L, n);
        while (n > 0L) {
            this.a.f_();
            final n a = c.a;
            final int n2 = (int)Math.min(n, a.c - a.b);
            this.b.write(a.a, a.b, n2);
            a.b += n2;
            final long n3 = n2;
            final long n4 = n - n3;
            c.b -= n3;
            n = n4;
            if (a.b == a.c) {
                c.a = a.a();
                o.a(a);
                n = n4;
            }
        }
    }
    
    @Override
    public final void close() {
        this.b.close();
    }
    
    @Override
    public final void flush() {
        this.b.flush();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("sink(");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}