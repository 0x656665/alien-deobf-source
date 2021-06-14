package a.a.c;

import a.a.*;
import java.net.*;
import a.*;
import b.*;

public final class b implements s
{
    private final boolean a;
    
    public b(final boolean a) {
        super();
        this.a = a;
    }
    
    @Override
    public final z a(final a a) {
        final g g = (g)a;
        final a.a.c.c b = g.b;
        final a.a.b.g a2 = g.a;
        final x a3 = a.a();
        final long currentTimeMillis = System.currentTimeMillis();
        b.a(a3);
        final boolean b2 = f.b(a3.b);
        final z.a a4 = null;
        z.a a5 = null;
        z.a a6 = a4;
        if (b2) {
            a6 = a4;
            if (a3.d != null) {
                if ("100-continue".equalsIgnoreCase(a3.a("Expect"))) {
                    b.a();
                    a5 = b.a(true);
                }
                if ((a6 = a5) == null) {
                    final d a7 = k.a(b.a(a3, a3.d.b()));
                    a3.d.a(a7);
                    a7.close();
                    a6 = a5;
                }
            }
        }
        b.b();
        z.a a8;
        if ((a8 = a6) == null) {
            a8 = b.a(false);
        }
        a8.a = a3;
        a8.e = a2.b().c;
        a8.k = currentTimeMillis;
        a8.l = System.currentTimeMillis();
        final z a9 = a8.a();
        final int c = a9.c;
        z z;
        if (this.a && c == 101) {
            final z.a a10 = a9.a();
            a10.g = a.a.c.c;
            z = a10.a();
        }
        else {
            final z.a a11 = a9.a();
            a11.g = b.a(a9);
            z = a11.a();
        }
        if ("close".equalsIgnoreCase(z.a.a("Connection")) || "close".equalsIgnoreCase(z.decrypt_str("Connection"))) {
            a2.d();
        }
        if ((c != 204 && c != 205) || z.g.b() <= 0L) {
            return z;
        }
        final StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(c);
        sb.append(" had non-zero Content-Length: ");
        sb.append(z.g.b());
        throw new ProtocolException(sb.toString());
    }
}
