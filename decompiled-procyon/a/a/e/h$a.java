package a.a.e;

import java.util.logging.*;
import b.*;

static final class a implements r
{
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final e f;
    
    public a(final e f) {
        super();
        this.f = f;
    }
    
    @Override
    public final long a(final c c, long a) {
        while (this.d == 0) {
            this.f.f(this.e);
            this.e = 0;
            if ((this.b & 0x4) != 0x0) {
                return -1L;
            }
            final int c2 = this.c;
            final int a2 = h.a(this.f);
            this.d = a2;
            this.a = a2;
            final byte b = (byte)(this.f.e() & 0xFF);
            this.b = (byte)(this.f.e() & 0xFF);
            if (h.a.isLoggable(Level.FINE)) {
                h.a.fine(a.a.e.e.a(true, this.c, this.a, b, this.b));
            }
            this.c = (this.f.g() & Integer.MAX_VALUE);
            if (b != 9) {
                throw a.a.e.e.b("%s != TYPE_CONTINUATION", b);
            }
            if (this.c == c2) {
                continue;
            }
            throw a.a.e.e.b("TYPE_CONTINUATION streamId changed", new Object[0]);
        }
        a = this.f.a(c, Math.min(a, this.d));
        if (a == -1L) {
            return -1L;
        }
        this.d -= (int)a;
        return a;
    }
    
    @Override
    public final s a() {
        return this.f.a();
    }
    
    @Override
    public final void close() {
    }
}
