package a;

import a.a.*;
import javax.net.ssl.*;
import java.util.*;

public final class j
{
    public static final j a;
    public static final j b;
    public static final j c;
    private static final g[] h;
    final boolean d;
    public final boolean e;
    final String[] f;
    final String[] g;
    
    static {
        h = new g[] { g.aW, g.ba, g.aX, g.bb, g.bh, g.bg, g.ax, g.aH, g.ay, g.aI, g.af, g.ag, g.D, g.H, g.h };
        final a a2 = new a(true);
        final g[] h2 = j.h;
        if (a2.a) {
            final String[] array = new String[h2.length];
            for (int i = 0; i < h2.length; ++i) {
                array[i] = h2[i].bi;
            }
            a = a2.a(array).a(ac.a, ac.b, ac.c, ac.d).a().b();
            b = new a(j.a).a(ac.d).a().b();
            c = new a(false).b();
            return;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }
    
    j(final a a) {
        super();
        this.d = a.a;
        this.f = a.b;
        this.g = a.c;
        this.e = a.d;
    }
    
    private List<ac> a() {
        if (this.g == null) {
            return null;
        }
        final ArrayList<ac> list = new ArrayList<ac>(this.g.length);
        final String[] g = this.g;
        for (int length = g.length, i = 0; i < length; ++i) {
            list.add(ac.a(g[i]));
        }
        return (List<ac>)Collections.unmodifiableList((List<?>)list);
    }
    
    private static boolean a(final String[] array, final String[] array2) {
        if (array == null || array2 == null || array.length == 0) {
            return false;
        }
        if (array2.length == 0) {
            return false;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            if (a.a.c.a(array2, array[i]) != -1) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean a(final SSLSocket sslSocket) {
        return this.d && (this.g == null || a(this.g, sslSocket.getEnabledProtocols())) && (this.f == null || a(this.f, sslSocket.getEnabledCipherSuites()));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof j)) {
            return false;
        }
        if (o == this) {
            return true;
        }
        final j j = (j)o;
        if (this.d != j.d) {
            return false;
        }
        if (this.d) {
            if (!Arrays.equals(this.f, j.f)) {
                return false;
            }
            if (!Arrays.equals(this.g, j.g)) {
                return false;
            }
            if (this.e != j.e) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        if (this.d) {
            return ((Arrays.hashCode(this.f) + 527) * 31 + Arrays.hashCode(this.g)) * 31 + ((this.e ^ true) ? 1 : 0);
        }
        return 17;
    }
    
    @Override
    public final String toString() {
        if (!this.d) {
            return "ConnectionSpec()";
        }
        String string;
        if (this.f != null) {
            Object unmodifiableList;
            if (this.f == null) {
                unmodifiableList = null;
            }
            else {
                final ArrayList<g> list = new ArrayList<g>(this.f.length);
                final String[] f = this.f;
                for (int length = f.length, i = 0; i < length; ++i) {
                    list.add(a.g.a(f[i]));
                }
                unmodifiableList = Collections.unmodifiableList((List<?>)list);
            }
            string = unmodifiableList.toString();
        }
        else {
            string = "[all enabled]";
        }
        String string2;
        if (this.g != null) {
            string2 = this.a().toString();
        }
        else {
            string2 = "[all enabled]";
        }
        final StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(string);
        sb.append(", tlsVersions=");
        sb.append(string2);
        sb.append(", supportsTlsExtensions=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        boolean a;
        String[] b;
        String[] c;
        boolean d;
        
        public a(final j j) {
            super();
            this.a = j.d;
            this.b = j.f;
            this.c = j.g;
            this.d = j.e;
        }
        
        a(final boolean a) {
            super();
            this.a = a;
        }
        
        public final a a() {
            if (this.a) {
                this.d = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        
        public final a a(final ac... array) {
            if (this.a) {
                final String[] array2 = new String[array.length];
                for (int i = 0; i < array.length; ++i) {
                    array2[i] = array[i].f;
                }
                return this.b(array2);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        
        public final a a(final String... array) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (array.length != 0) {
                this.b = array.clone();
                return this;
            }
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        
        public final a b(final String... array) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (array.length != 0) {
                this.c = array.clone();
                return this;
            }
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        
        public final j b() {
            return new j(this);
        }
    }
}
