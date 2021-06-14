/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class s {
    public static final s b = new s(){

        @Override
        public final s a(long l2) {
            return this;
        }

        @Override
        public final s a(long l2, TimeUnit timeUnit) {
            return this;
        }

        @Override
        public final void f_() {
        }
    };
    private boolean a;
    private long c;
    private long d;

    public s a(long l2) {
        this.a = true;
        this.c = l2;
        return this;
    }

    public s a(long l2, TimeUnit timeUnit) {
        if (l2 < 0L) throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(l2)));
        if (timeUnit == null) throw new IllegalArgumentException("unit == null");
        this.d = timeUnit.toNanos(l2);
        return this;
    }

    public long c() {
        if (!this.a) throw new IllegalStateException("No deadline");
        return this.c;
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
        if (Thread.interrupted()) throw new InterruptedIOException("thread interrupted");
        if (!this.a) return;
        if (this.c - System.nanoTime() <= 0L) throw new InterruptedIOException("deadline reached");
    }

}

