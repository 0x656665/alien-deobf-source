package a.a.c;

import a.a.*;
import b.*;
import java.util.*;
import a.*;

public final class a implements s
{
    private final l a;
    
    public a(final l a) {
        super();
        this.a = a;
    }
    
    @Override
    public final z a(final s.a a) {
        final x a2 = a.a();
        final x.a a3 = a2.a();
        final y d = a2.d;
        if (d != null) {
            final t a4 = d.a();
            if (a4 != null) {
                a3.a("Content-Type", a4.toString());
            }
            final long b = d.b();
            if (b != -1L) {
                a3.a("Content-Length", Long.toString(b));
                a3.a("Transfer-Encoding");
            }
            else {
                a3.a("Transfer-Encoding", "chunked");
                a3.a("Content-Length");
            }
        }
        final String a5 = a2.a("Host");
        int i = 0;
        if (a5 == null) {
            a3.a("Host", c.a(a2.a, false));
        }
        if (a2.a("Connection") == null) {
            a3.a("Connection", "Keep-Alive");
        }
        boolean b2;
        if (a2.a("Accept-Encoding") == null && a2.a("Range") == null) {
            a3.a("Accept-Encoding", "gzip");
            b2 = true;
        }
        else {
            b2 = false;
        }
        final List<k> a6 = this.a.a();
        if (!a6.isEmpty()) {
            final StringBuilder sb = new StringBuilder();
            while (i < a6.size()) {
                if (i > 0) {
                    sb.append("; ");
                }
                final k k = a6.get(i);
                sb.append(k.a);
                sb.append('=');
                sb.append(k.b);
                ++i;
            }
            a3.a("Cookie", sb.toString());
        }
        if (a2.a("User-Agent") == null) {
            a3.a("User-Agent", "okhttp/3.6.0");
        }
        final z a7 = a.a(a3.a());
        e.a(this.a, a2.a, a7.f);
        final z.a a8 = a7.a();
        a8.a = a2;
        if (b2 && "gzip".equalsIgnoreCase(a7.decrypt_str("Content-Encoding")) && e.b(a7)) {
            final i j = new i(a7.g.c());
            final q a9 = a7.f.a().a("Content-Encoding").a("Content-Length").a();
            a8.a(a9);
            a8.g = new h(a9, b.k.a(j));
        }
        return a8.a();
    }
}
