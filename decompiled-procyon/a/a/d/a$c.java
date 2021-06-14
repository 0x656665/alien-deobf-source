package a.a.d;

import a.*;
import java.net.*;
import a.a.c.*;
import java.util.concurrent.*;

final class c extends a
{
    final /* synthetic */ a d;
    private final a.r e;
    private long f;
    private boolean g;
    
    c(final a d, final a.r e) {
        this.d = d;
        d.super((byte)0);
        this.f = -1L;
        this.g = true;
        this.e = e;
    }
    
    @Override
    public final long a(final b.c c, long a) {
        if (a >= 0L) {
            if (!this.b) {
                if (!this.g) {
                    return -1L;
                }
                Label_0186: {
                    if (this.f != 0L && this.f != -1L) {
                        break Label_0186;
                    }
                    if (this.f != -1L) {
                        this.d.c.m();
                    }
                    try {
                        this.f = this.d.c.j();
                        final String trim = this.d.c.m().trim();
                        if (this.f < 0L || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            final StringBuilder sb = new StringBuilder("expected chunk size and optional extensions but was \"");
                            sb.append(this.f);
                            sb.append(trim);
                            sb.append("\"");
                            throw new ProtocolException(sb.toString());
                        }
                        if (this.f == 0L) {
                            this.g = false;
                            a.a.c.e.a(this.d.a.j, this.e, this.d.c());
                            ((a)this).a(true);
                        }
                        if (!this.g) {
                            return -1L;
                        }
                        a = this.d.c.a(c, Math.min(a, this.f));
                        if (a != -1L) {
                            this.f -= a;
                            return a;
                        }
                        ((a)this).a(false);
                        throw new ProtocolException("unexpected end of stream");
                    }
                    catch (NumberFormatException ex) {
                        throw new ProtocolException(ex.getMessage());
                    }
                }
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(a)));
    }
    
    @Override
    public final void close() {
        if (this.b) {
            return;
        }
        if (this.g && !a.a.c.a(this, TimeUnit.MILLISECONDS)) {
            ((a)this).a(false);
        }
        this.b = true;
    }
}
