package b;

import java.util.concurrent.*;
import java.io.*;

public class s
{
    public static final s b;
    private boolean a;
    private long c;
    private long d;
    
    static {
        b = new s() {
            s$1() {
                super();
            }
            
            @Override
            public final s a(final long n) {
                return this;
            }
            
            @Override
            public final s a(final long n, final TimeUnit timeUnit) {
                return this;
            }
            
            @Override
            public final void f_() {
            }
        };
    }
    
    public s() {
        super();
    }
    
    public s a(final long c) {
        this.a = true;
        this.c = c;
        return this;
    }
    
    public s a(final long n, final TimeUnit timeUnit) {
        if (n < 0L) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(n)));
        }
        if (timeUnit != null) {
            this.d = timeUnit.toNanos(n);
            return this;
        }
        throw new IllegalArgumentException("unit == null");
    }
    
    public long c() {
        if (this.a) {
            return this.c;
        }
        throw new IllegalStateException("No deadline");
    }
    
    public long c_() {
        return this.d;
    }
    
    public s d() {
        this.d = 0L;
        return this;
    }
    
    public boolean d_() {
        return this.a;
    }
    
    public s e_() {
        this.a = false;
        return this;
    }
    
    public void f_() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (!this.a) {
            return;
        }
        if (this.c - System.nanoTime() > 0L) {
            return;
        }
        throw new InterruptedIOException("deadline reached");
    }
}
