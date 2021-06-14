package a;

import a.a.*;
import java.util.*;
import a.a.b.*;
import javax.net.ssl.*;
import java.net.*;
import java.lang.ref.*;

static final class u$1 extends a {
    u$1() {
        super();
    }
    
    @Override
    public final int a(final z.a a) {
        return a.c;
    }
    
    @Override
    public final c a(final i i, final a a, final g g) {
        if (!i.g && !Thread.holdsLock(i)) {
            throw new AssertionError();
        }
        for (final c c : i.d) {
            if (c.a(a)) {
                g.a(c);
                return c;
            }
        }
        return null;
    }
    
    @Override
    public final d a(final i i) {
        return i.e;
    }
    
    @Override
    public final void a(j b, final SSLSocket sslSocket, final boolean b2) {
        String[] enabledCipherSuites;
        if (b.f != null) {
            enabledCipherSuites = a.a.c.a(String.class, b.f, sslSocket.getEnabledCipherSuites());
        }
        else {
            enabledCipherSuites = sslSocket.getEnabledCipherSuites();
        }
        String[] enabledProtocols;
        if (b.g != null) {
            enabledProtocols = a.a.c.a(String.class, b.g, sslSocket.getEnabledProtocols());
        }
        else {
            enabledProtocols = sslSocket.getEnabledProtocols();
        }
        String[] a = enabledCipherSuites;
        if (b2) {
            a = enabledCipherSuites;
            if (a.a.c.a(sslSocket.getSupportedCipherSuites(), "TLS_FALLBACK_SCSV") != -1) {
                a = a.a.c.a(enabledCipherSuites, "TLS_FALLBACK_SCSV");
            }
        }
        b = new j.a(b).a(a).b(enabledProtocols).b();
        if (b.g != null) {
            sslSocket.setEnabledProtocols(b.g);
        }
        if (b.f != null) {
            sslSocket.setEnabledCipherSuites(b.f);
        }
    }
    
    @Override
    public final void a(final q.a a, final String s) {
        final int index = s.indexOf(":", 1);
        if (index != -1) {
            a.a(s.substring(0, index), s.substring(index + 1));
            return;
        }
        if (s.startsWith(":")) {
            a.a("", s.substring(1));
            return;
        }
        a.a("", s);
    }
    
    @Override
    public final void a(final q.a a, final String s, final String s2) {
        a.a(s, s2);
    }
    
    @Override
    public final boolean a(final i i, final c c) {
        if (!i.g && !Thread.holdsLock(i)) {
            throw new AssertionError();
        }
        if (!c.g && i.b != 0) {
            i.notifyAll();
            return false;
        }
        i.d.remove(c);
        return true;
    }
    
    @Override
    public final Socket b(final i i, final a a, final g g) {
        if (!i.g && !Thread.holdsLock(i)) {
            throw new AssertionError();
        }
        for (final c c : i.d) {
            if (c.a(a) && c.b() && c != g.b()) {
                if (!g.e && !Thread.holdsLock(g.b)) {
                    throw new AssertionError();
                }
                if (g.d == null && g.c.j.size() == 1) {
                    final Reference<g> reference = g.c.j.get(0);
                    final Socket a2 = g.a(true, false, false);
                    g.c = c;
                    c.j.add(reference);
                    return a2;
                }
                throw new IllegalStateException();
            }
        }
        return null;
    }
    
    @Override
    public final void b(final i i, final c c) {
        if (!i.g && !Thread.holdsLock(i)) {
            throw new AssertionError();
        }
        if (!i.f) {
            i.f = true;
            i.a.execute(i.c);
        }
        i.d.add(c);
    }
}