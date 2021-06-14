package b;

import java.util.concurrent.*;

public final class h extends s
{
    public s a;
    
    public h(final s a) {
        super();
        if (a != null) {
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
    
    @Override
    public final s a(final long n) {
        return this.a.a(n);
    }
    
    @Override
    public final s a(final long n, final TimeUnit timeUnit) {
        return this.a.a(n, timeUnit);
    }
    
    @Override
    public final long c() {
        return this.a.c();
    }
    
    @Override
    public final long c_() {
        return this.a.c_();
    }
    
    @Override
    public final s d() {
        return this.a.d();
    }
    
    @Override
    public final boolean d_() {
        return this.a.d_();
    }
    
    @Override
    public final s e_() {
        return this.a.e_();
    }
    
    @Override
    public final void f_() {
        this.a.f_();
    }
}
