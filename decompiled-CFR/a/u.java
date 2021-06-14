/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.b.g;
import a.a.g.e;
import a.a.h.b;
import a.a.h.d;
import a.c;
import a.f;
import a.i;
import a.j;
import a.l;
import a.m;
import a.n;
import a.q;
import a.s;
import a.v;
import a.z;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class u
implements Cloneable {
    static final List<v> a = a.a.c.a(new v[]{v.d, v.b});
    static final List<j> b = a.a.c.a(j.a, j.b, j.c);
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
    final a.a.a.e l;
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
        a.a.a.a = new a.a.a(){

            @Override
            public final int a(z.a a2) {
                return a2.c;
            }

            @Override
            public final a.a.b.c a(i object, a.a a2, g g2) {
                a.a.b.c c2;
                if (!i.g) {
                    if (!Thread.holdsLock(object)) throw new AssertionError();
                }
                object = ((i)object).d.iterator();
                do {
                    if (!object.hasNext()) return null;
                } while (!(c2 = (a.a.b.c)object.next()).a(a2));
                g2.a(c2);
                return c2;
            }

            @Override
            public final a.a.b.d a(i i2) {
                return i2.e;
            }

            @Override
            public final void a(j j2, SSLSocket sSLSocket, boolean bl) {
                String[] arrstring = j2.f != null ? a.a.c.a(String.class, j2.f, sSLSocket.getEnabledCipherSuites()) : sSLSocket.getEnabledCipherSuites();
                String[] arrstring2 = j2.g != null ? a.a.c.a(String.class, j2.g, sSLSocket.getEnabledProtocols()) : sSLSocket.getEnabledProtocols();
                String[] arrstring3 = arrstring;
                if (bl) {
                    arrstring3 = arrstring;
                    if (a.a.c.a(sSLSocket.getSupportedCipherSuites(), "TLS_FALLBACK_SCSV") != -1) {
                        arrstring3 = a.a.c.a(arrstring, "TLS_FALLBACK_SCSV");
                    }
                }
                j2 = new j.a(j2).a(arrstring3).b(arrstring2).b();
                if (j2.g != null) {
                    sSLSocket.setEnabledProtocols(j2.g);
                }
                if (j2.f == null) return;
                sSLSocket.setEnabledCipherSuites(j2.f);
            }

            @Override
            public final void a(q.a a2, String string) {
                int n2 = string.indexOf(":", 1);
                if (n2 != -1) {
                    a2.a(string.substring(0, n2), string.substring(n2 + 1));
                    return;
                }
                if (string.startsWith(":")) {
                    a2.a("", string.substring(1));
                    return;
                }
                a2.a("", string);
            }

            @Override
            public final void a(q.a a2, String string, String string2) {
                a2.a(string, string2);
            }

            @Override
            public final boolean a(i i2, a.a.b.c c2) {
                if (!i.g) {
                    if (!Thread.holdsLock(i2)) throw new AssertionError();
                }
                if (!c2.g && i2.b != 0) {
                    i2.notifyAll();
                    return false;
                }
                i2.d.remove(c2);
                return true;
            }

            @Override
            public final Socket b(i object, a.a object2, g g2) {
                if (!i.g) {
                    if (!Thread.holdsLock(object)) throw new AssertionError();
                }
                Object object3 = ((i)object).d.iterator();
                do {
                    if (!object3.hasNext()) return null;
                } while (!((a.a.b.c)(object = object3.next())).a((a.a)object2) || !((a.a.b.c)object).b() || object == g2.b());
                if (!g.e) {
                    if (!Thread.holdsLock(g2.b)) throw new AssertionError();
                }
                if (g2.d != null) throw new IllegalStateException();
                if (g2.c.j.size() != 1) throw new IllegalStateException();
                object2 = g2.c.j.get(0);
                object3 = g2.a(true, false, false);
                g2.c = object;
                ((a.a.b.c)object).j.add((Reference<g>)object2);
                return object3;
            }

            @Override
            public final void b(i i2, a.a.b.c c2) {
                if (!i.g) {
                    if (!Thread.holdsLock(i2)) throw new AssertionError();
                }
                if (!i2.f) {
                    i2.f = true;
                    i.a.execute(i2.c);
                }
                i2.d.add(c2);
            }
        };
    }

    public u() {
        this(new a());
    }

    private u(a a2) {
        Object object;
        boolean bl;
        this.c = a2.a;
        this.d = a2.b;
        this.e = a2.c;
        this.f = a2.d;
        this.g = a.a.c.a(a2.e);
        this.h = a.a.c.a(a2.f);
        this.i = a2.g;
        this.j = a2.h;
        this.k = a2.i;
        this.l = a2.j;
        this.m = a2.k;
        Object object2 = this.f.iterator();
        block0 : do {
            bl = false;
            while (object2.hasNext()) {
                object = object2.next();
                if (!bl && !((j)object).d) continue block0;
                bl = true;
            }
            break;
        } while (true);
        if (a2.l == null && bl) {
            object2 = u.b();
            this.n = u.a((X509TrustManager)object2);
            this.o = e.b().a((X509TrustManager)object2);
        } else {
            this.n = a2.l;
            this.o = a2.m;
        }
        this.p = a2.n;
        object2 = a2.o;
        object = this.o;
        if (!a.a.c.a(((f)object2).c, object)) {
            object2 = new f(((f)object2).b, (b)object);
        }
        this.q = object2;
        this.r = a2.p;
        this.s = a2.q;
        this.t = a2.r;
        this.u = a2.s;
        this.v = a2.t;
        this.w = a2.u;
        this.x = a2.v;
        this.y = a2.w;
        this.z = a2.x;
        this.A = a2.y;
        this.B = a2.z;
    }

    private static SSLSocketFactory a(X509TrustManager object) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{object}, null);
            return sSLContext.getSocketFactory();
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new AssertionError();
        }
    }

    private static X509TrustManager b() {
        try {
            Object[] arrobject = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            arrobject.init((KeyStore)null);
            arrobject = arrobject.getTrustManagers();
            if (arrobject.length == 1 && arrobject[0] instanceof X509TrustManager) {
                return (X509TrustManager)arrobject[0];
            }
            StringBuilder stringBuilder = new StringBuilder("Unexpected default trust managers:");
            stringBuilder.append(Arrays.toString(arrobject));
            throw new IllegalStateException(stringBuilder.toString());
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new AssertionError();
        }
    }

    final a.a.a.e a() {
        if (this.k == null) return this.l;
        return this.k.a;
    }

    public static final class a {
        m a = new m();
        Proxy b;
        List<v> c = a;
        List<j> d = b;
        final List<s> e = new ArrayList<s>();
        final List<s> f = new ArrayList<s>();
        ProxySelector g = ProxySelector.getDefault();
        l h = l.a;
        c i;
        a.a.a.e j;
        SocketFactory k = SocketFactory.getDefault();
        SSLSocketFactory l;
        b m;
        HostnameVerifier n = d.a;
        f o = f.a;
        a.b p = a.b.a;
        a.b q = a.b.a;
        i r = new i();
        n s = n.a;
        boolean t = true;
        boolean u = true;
        boolean v = true;
        int w = 10000;
        int x = 10000;
        int y = 10000;
        int z = 0;
    }

}

