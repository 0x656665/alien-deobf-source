/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.c;
import a.ac;
import a.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class j {
    public static final j a;
    public static final j b;
    public static final j c;
    private static final g[] h;
    final boolean d;
    public final boolean e;
    final String[] f;
    final String[] g;

    static {
        h = new g[]{g.aW, g.ba, g.aX, g.bb, g.bh, g.bg, g.ax, g.aH, g.ay, g.aI, g.af, g.ag, g.D, g.H, g.h};
        a a2 = new a(true);
        g[] arrg = h;
        if (!a2.a) throw new IllegalStateException("no cipher suites for cleartext connections");
        String[] arrstring = new String[arrg.length];
        int n2 = 0;
        do {
            if (n2 >= arrg.length) {
                a = a2.a(arrstring).a(ac.a, ac.b, ac.c, ac.d).a().b();
                b = new a(a).a(ac.d).a().b();
                c = new a(false).b();
                return;
            }
            arrstring[n2] = arrg[n2].bi;
            ++n2;
        } while (true);
    }

    j(a a2) {
        this.d = a2.a;
        this.f = a2.b;
        this.g = a2.c;
        this.e = a2.d;
    }

    private List<ac> a() {
        if (this.g == null) {
            return null;
        }
        ArrayList<ac> arrayList = new ArrayList<ac>(this.g.length);
        String[] arrstring = this.g;
        int n2 = arrstring.length;
        int n3 = 0;
        while (n3 < n2) {
            arrayList.add(ac.a(arrstring[n3]));
            ++n3;
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static boolean a(String[] arrstring, String[] arrstring2) {
        if (arrstring == null) return false;
        if (arrstring2 == null) return false;
        if (arrstring.length == 0) return false;
        if (arrstring2.length == 0) {
            return false;
        }
        int n2 = arrstring.length;
        int n3 = 0;
        while (n3 < n2) {
            if (c.a(arrstring2, arrstring[n3]) != -1) {
                return true;
            }
            ++n3;
        }
        return false;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.d) {
            return false;
        }
        if (this.g != null && !j.a(this.g, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        if (this.f == null) return true;
        if (j.a(this.f, sSLSocket.getEnabledCipherSuites())) return true;
        return false;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof j)) {
            return false;
        }
        if (object == this) {
            return true;
        }
        object = (j)object;
        if (this.d != ((j)object).d) {
            return false;
        }
        if (!this.d) return true;
        if (!Arrays.equals(this.f, ((j)object).f)) {
            return false;
        }
        if (!Arrays.equals(this.g, ((j)object).g)) {
            return false;
        }
        if (this.e == ((j)object).e) return true;
        return false;
    }

    public final int hashCode() {
        if (!this.d) return 17;
        return ((Arrays.hashCode(this.f) + 527) * 31 + Arrays.hashCode(this.g)) * 31 + (this.e ^ true);
    }

    public final String toString() {
        List list;
        Object object;
        if (!this.d) {
            return "ConnectionSpec()";
        }
        if (this.f != null) {
            if (this.f == null) {
                list = null;
            } else {
                list = new ArrayList(this.f.length);
                object = this.f;
                int n2 = ((String[])object).length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    list.add(g.a(object[i2]));
                }
                list = Collections.unmodifiableList(list);
            }
            list = list.toString();
        } else {
            list = "[all enabled]";
        }
        object = this.g != null ? this.a().toString() : "[all enabled]";
        StringBuilder stringBuilder = new StringBuilder("ConnectionSpec(cipherSuites=");
        stringBuilder.append((String)((Object)list));
        stringBuilder.append(", tlsVersions=");
        stringBuilder.append((String)object);
        stringBuilder.append(", supportsTlsExtensions=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public static final class a {
        boolean a;
        String[] b;
        String[] c;
        boolean d;

        public a(j j2) {
            this.a = j2.d;
            this.b = j2.f;
            this.c = j2.g;
            this.d = j2.e;
        }

        a(boolean bl) {
            this.a = bl;
        }

        public final a a() {
            if (!this.a) throw new IllegalStateException("no TLS extensions for cleartext connections");
            this.d = true;
            return this;
        }

        public final a a(ac ... arrac) {
            if (!this.a) throw new IllegalStateException("no TLS versions for cleartext connections");
            String[] arrstring = new String[arrac.length];
            int n2 = 0;
            while (n2 < arrac.length) {
                arrstring[n2] = arrac[n2].f;
                ++n2;
            }
            return this.b(arrstring);
        }

        public final a a(String ... arrstring) {
            if (!this.a) throw new IllegalStateException("no cipher suites for cleartext connections");
            if (arrstring.length == 0) throw new IllegalArgumentException("At least one cipher suite is required");
            this.b = (String[])arrstring.clone();
            return this;
        }

        public final a b(String ... arrstring) {
            if (!this.a) throw new IllegalStateException("no TLS versions for cleartext connections");
            if (arrstring.length == 0) throw new IllegalArgumentException("At least one TLS version is required");
            this.c = (String[])arrstring.clone();
            return this;
        }

        public final j b() {
            return new j(this);
        }
    }

}

