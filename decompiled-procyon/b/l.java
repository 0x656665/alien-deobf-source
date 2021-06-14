package b;

final class l implements d
{
    public final c a;
    public final q b;
    boolean c;
    
    l(final q b) {
        super();
        this.a = new c();
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("sink == null");
    }
    
    @Override
    public final s a() {
        return this.b.a();
    }
    
    @Override
    public final void a_(final c c, final long n) {
        if (!this.c) {
            this.a.a_(c, n);
            this.q();
            return;
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final c b() {
        return this.a;
    }
    
    @Override
    public final d b(final String s) {
        if (!this.c) {
            this.a.a(s);
            return this.q();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final d b(final byte[] array) {
        if (!this.c) {
            this.a.a(array);
            return this.q();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final d b(final byte[] array, final int n, final int n2) {
        if (!this.c) {
            this.a.a(array, n, n2);
            return this.q();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final void close() {
        if (this.c) {
            return;
        }
        Throwable t2;
        final Throwable t = t2 = null;
        try {
            if (this.a.b > 0L) {
                this.b.a_(this.a, this.a.b);
                t2 = t;
            }
        }
        catch (Throwable t5) {}
        Throwable t3;
        try {
            this.b.close();
            t3 = t2;
        }
        catch (Throwable t4) {
            t3 = t2;
            if (t2 == null) {
                t3 = t4;
            }
        }
        this.c = true;
        if (t3 != null) {
            b.t.a(t3);
        }
    }
    
    @Override
    public final d f(final int n) {
        if (!this.c) {
            this.a.d(n);
            return this.q();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final void flush() {
        if (!this.c) {
            if (this.a.b > 0L) {
                this.b.a_(this.a, this.a.b);
            }
            this.b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final d g(final int n) {
        if (!this.c) {
            this.a.c(n);
            return this.q();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final d h(final int n) {
        if (!this.c) {
            this.a.b(n);
            return this.q();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final d i(final long n) {
        if (!this.c) {
            this.a.h(n);
            return this.q();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final d j(final long n) {
        if (!this.c) {
            this.a.g(n);
            return this.q();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final d q() {
        if (!this.c) {
            final long d = this.a.d();
            if (d > 0L) {
                this.b.a_(this.a, d);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
