package a.a.d;

import b.*;

final class f extends a
{
    final /* synthetic */ a d;
    private boolean e;
    
    f(final a d) {
        this.d = d;
        d.super((byte)0);
    }
    
    @Override
    public final long a(final b.c c, long a) {
        if (a < 0L) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(a)));
        }
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        if (this.e) {
            return -1L;
        }
        a = this.d.c.a(c, a);
        if (a == -1L) {
            ((a)this).a(this.e = true);
            return -1L;
        }
        return a;
    }
    
    @Override
    public final void close() {
        if (this.b) {
            return;
        }
        if (!this.e) {
            ((a)this).a(false);
        }
        this.b = true;
    }
}
