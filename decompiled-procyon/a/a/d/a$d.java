package a.a.d;

import b.*;
import java.net.*;

final class d implements q
{
    final /* synthetic */ a a;
    private final h b;
    private boolean c;
    private long d;
    
    d(final a a, final long d) {
        this.a = a;
        super();
        this.b = new h(this.a.d.a());
        this.d = d;
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
        a.a.c.a(c.b, n);
        if (n <= this.d) {
            this.a.d.a_(c, n);
            this.d -= n;
            return;
        }
        final StringBuilder sb = new StringBuilder("expected ");
        sb.append(this.d);
        sb.append(" bytes but received ");
        sb.append(n);
        throw new ProtocolException(sb.toString());
    }
    
    @Override
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.d <= 0L) {
            a.a.d.a.a(this.b);
            this.a.e = 3;
            return;
        }
        throw new ProtocolException("unexpected end of stream");
    }
    
    @Override
    public final void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }
}
