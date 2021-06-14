package a.a.d;

import b.*;

final class b implements q
{
    final /* synthetic */ a a;
    private final h b;
    private boolean c;
    
    b(final a a) {
        this.a = a;
        super();
        this.b = new h(this.a.d.a());
    }
    
    @Override
    public final s a() {
        return this.b;
    }
    
    @Override
    public final void a_(final b.c c, final long n) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (n == 0L) {
            return;
        }
        this.a.d.i(n);
        this.a.d.b("\r\n");
        this.a.d.a_(c, n);
        this.a.d.b("\r\n");
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.a.d.b("0\r\n\r\n");
            a.a.d.a.a(this.b);
            this.a.e = 3;
        }
    }
    
    @Override
    public final void flush() {
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.a.d.flush();
        }
    }
}
