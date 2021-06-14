package a;

import a.a.a.*;
import javax.net.*;
import a.a.h.*;
import a.a.*;
import a.a.b.*;
import java.net.*;
import java.lang.ref.*;
import javax.net.ssl.*;
import java.security.*;
import java.util.*;

public class u implements Cloneable
{
    static final List<v> a;
    static final List<j> b;
    public final int A;
    final int B;
    final m c;
    public final Proxy d;
    public final List<v> e;
    public final List<j> f;
    final List<s> g;
    final List<s> h;
    public final ProxySelector i;
    public final l j;
    final c k;
    final e l;
    public final SocketFactory m;
    public final SSLSocketFactory n;
    final b o;
    public final HostnameVerifier p;
    public final f q;
    public final a.b r;
    final a.b s;
    public final i t;
    public final n u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final int y;
    public final int z;
    
    static {
        a = a.a.c.a(new v[] { v.d, v.b });
        b = a.a.c.a(j.a, j.b, j.c);
        a.a.a.a = new a.a.a() {
            u$1() {
                super();
            }
            
            @Override
            public final int a(final z.a a) {
                return a.c;
            }
            
            @Override
            public final a.a.b.c a(final i i, final a a, final g g) {
                if (!i.g && !Thread.holdsLock(i)) {
                    throw new AssertionError();
                }
                for (final a.a.b.c c : i.d) {
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
            public final boolean a(final i i, final a.a.b.c c) {
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
                for (final a.a.b.c c : i.d) {
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
            public final void b(final i i, final a.a.b.c c) {
                if (!i.g && !Thread.holdsLock(i)) {
                    throw new AssertionError();
                }
                if (!i.f) {
                    i.f = true;
                    i.a.execute(i.c);
                }
                i.d.add(c);
            }
        };
    }
    
    public u() {
        this(new a());
    }
    
    private u(final a a) {
        super();
        this.c = a.a;
        this.d = a.b;
        this.e = a.c;
        this.f = a.d;
        this.g = a.a.c.a(a.e);
        this.h = a.a.c.a(a.f);
        this.i = a.g;
        this.j = a.h;
        this.k = a.i;
        this.l = a.j;
        this.m = a.k;
        final Iterator<j> iterator = this.f.iterator();
        int n = 0;
    Label_0108:
        while (true) {
            n = 0;
            while (iterator.hasNext()) {
                final j j = iterator.next();
                if (n == 0 && !j.d) {
                    continue Label_0108;
                }
                n = 1;
            }
            break;
        }
        if (a.l == null && n != 0) {
            final X509TrustManager b = b();
            this.n = a(b);
            this.o = a.a.g.e.b().a(b);
        }
        else {
            this.n = a.l;
            this.o = a.m;
        }
        this.p = a.n;
        f o = a.o;
        final b o2 = this.o;
        if (!a.a.c.a(o.c, o2)) {
            o = new f(o.b, o2);
        }
        this.q = o;
        this.r = a.p;
        this.s = a.q;
        this.t = a.r;
        this.u = a.s;
        this.v = a.t;
        this.w = a.u;
        this.x = a.v;
        this.y = a.w;
        this.z = a.x;
        this.A = a.y;
        this.B = a.z;
    }
    
    private static SSLSocketFactory a(final X509TrustManager x509TrustManager) {
        try {
            final SSLContext \u0131nstance = SSLContext.getInstance("TLS");
            \u0131nstance.init(null, new TrustManager[] { x509TrustManager }, null);
            return \u0131nstance.getSocketFactory();
        }
        catch (GeneralSecurityException ex) {
            throw new AssertionError();
        }
    }
    
    private static X509TrustManager b() {
        try {
            final TrustManagerFactory \u0131nstance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            \u0131nstance.init((KeyStore)null);
            final TrustManager[] trustManagers = \u0131nstance.getTrustManagers();
            if (trustManagers.length == 1 && trustManagers[0] instanceof X509TrustManager) {
                return (X509TrustManager)trustManagers[0];
            }
            final StringBuilder sb = new StringBuilder("Unexpected default trust managers:");
            sb.append(Arrays.toString(trustManagers));
            throw new IllegalStateException(sb.toString());
        }
        catch (GeneralSecurityException ex) {
            throw new AssertionError();
        }
    }
    
    final e a() {
        if (this.k != null) {
            return this.k.a;
        }
        return this.l;
    }
    
    public static final class a
    {
        m a;
        Proxy b;
        List<v> c;
        List<j> d;
        final List<s> e;
        final List<s> f;
        ProxySelector g;
        l h;
        c i;
        e j;
        SocketFactory k;
        SSLSocketFactory l;
        b m;
        HostnameVerifier n;
        f o;
        a.b p;
        a.b q;
        i r;
        n s;
        boolean t;
        boolean u;
        boolean v;
        int w;
        int x;
        int y;
        int z;
        
        public a() {
            super();
            this.e = new ArrayList<s>();
            this.f = new ArrayList<s>();
            this.a = new m();
            this.c = u.a;
            this.d = u.b;
            this.g = ProxySelector.getDefault();
            this.h = l.a;
            this.k = SocketFactory.getDefault();
            this.n = a.a.h.d.a;
            this.o = f.a;
            this.p = a.b.a;
            this.q = a.b.a;
            this.r = new i();
            this.s = n.a;
            this.t = true;
            this.u = true;
            this.v = true;
            this.w = 10000;
            this.x = 10000;
            this.y = 10000;
            this.z = 0;
        }
    }
}
