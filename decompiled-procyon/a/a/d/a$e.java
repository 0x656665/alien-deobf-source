package a.a.d;

import java.net.*;
import java.util.concurrent.*;
import b.*;

final class e extends a
{
    final /* synthetic */ a d;
    private long e;
    
    public e(final a d, final long e) {
        this.d = d;
        d.super((byte)0);
        this.e = e;
        if (this.e == 0L) {
            ((a)this).a(true);
        }
    }
    
    @Override
    public final long a(final b.c c, long a) {
        if (a < 0L) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(a)));
        }
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        if (this.e == 0L) {
            return -1L;
        }
        a = this.d.c.a(c, Math.min(this.e, a));
        if (a != -1L) {
            this.e -= a;
            if (this.e == 0L) {
                ((a)this).a(true);
            }
            return a;
        }
        ((a)this).a(false);
        throw new ProtocolException("unexpected end of stream");
    }
    
    @Override
    public final void close() {
        if (this.b) {
            return;
        }
        if (this.e != 0L && !a.a.c.a(this, TimeUnit.MILLISECONDS)) {
            ((a)this).a(false);
        }
        this.b = true;
    }
}
