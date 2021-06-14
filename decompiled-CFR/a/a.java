/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.c;
import a.b;
import a.f;
import a.j;
import a.n;
import a.r;
import a.v;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class a {
    public final r a;
    public final n b;
    public final SocketFactory c;
    final b d;
    public final List<v> e;
    public final List<j> f;
    public final ProxySelector g;
    public final Proxy h;
    public final SSLSocketFactory i;
    public final HostnameVerifier j;
    public final f k;

    public a(String string, int n2, n n3, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f f2, b b2, Proxy proxy, List<v> list, List<j> list2, ProxySelector proxySelector) {
        r.a a2 = new r.a();
        String string2 = sSLSocketFactory != null ? "https" : "http";
        if (string2.equalsIgnoreCase("http")) {
            a2.a = "http";
        } else {
            if (!string2.equalsIgnoreCase("https")) throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(string2)));
            a2.a = "https";
        }
        if (string == null) throw new NullPointerException("host == null");
        string2 = r.a.a(string, 0, string.length());
        if (string2 == null) throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(string)));
        a2.d = string2;
        if (n2 <= 0) throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(n2)));
        if (n2 > 65535) throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(n2)));
        a2.e = n2;
        this.a = a2.b();
        if (n3 == null) throw new NullPointerException("dns == null");
        this.b = n3;
        if (socketFactory == null) throw new NullPointerException("socketFactory == null");
        this.c = socketFactory;
        if (b2 == null) throw new NullPointerException("proxyAuthenticator == null");
        this.d = b2;
        if (list == null) throw new NullPointerException("protocols == null");
        this.e = c.a(list);
        if (list2 == null) throw new NullPointerException("connectionSpecs == null");
        this.f = c.a(list2);
        if (proxySelector == null) throw new NullPointerException("proxySelector == null");
        this.g = proxySelector;
        this.h = proxy;
        this.i = sSLSocketFactory;
        this.j = hostnameVerifier;
        this.k = f2;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof a)) return false;
        object = (a)object;
        if (!this.a.equals(((a)object).a)) return false;
        if (!this.b.equals(((a)object).b)) return false;
        if (!this.d.equals(((a)object).d)) return false;
        if (!this.e.equals(((a)object).e)) return false;
        if (!this.f.equals(((a)object).f)) return false;
        if (!this.g.equals(((a)object).g)) return false;
        if (!c.a(this.h, (Object)((a)object).h)) return false;
        if (!c.a(this.i, (Object)((a)object).i)) return false;
        if (!c.a(this.j, (Object)((a)object).j)) return false;
        if (!c.a(this.k, (Object)((a)object).k)) return false;
        return true;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.b.hashCode();
        int n4 = this.d.hashCode();
        int n5 = this.e.hashCode();
        int n6 = this.f.hashCode();
        int n7 = this.g.hashCode();
        Proxy proxy = this.h;
        int n8 = 0;
        int n9 = proxy != null ? this.h.hashCode() : 0;
        int n10 = this.i != null ? this.i.hashCode() : 0;
        int n11 = this.j != null ? this.j.hashCode() : 0;
        if (this.k == null) return (((((((((n2 + 527) * 31 + n3) * 31 + n4) * 31 + n5) * 31 + n6) * 31 + n7) * 31 + n9) * 31 + n10) * 31 + n11) * 31 + n8;
        n8 = this.k.hashCode();
        return (((((((((n2 + 527) * 31 + n3) * 31 + n4) * 31 + n5) * 31 + n6) * 31 + n7) * 31 + n9) * 31 + n10) * 31 + n11) * 31 + n8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Address{");
        stringBuilder.append(this.a.b);
        stringBuilder.append(":");
        stringBuilder.append(this.a.c);
        if (this.h != null) {
            stringBuilder.append(", proxy=");
            stringBuilder.append(this.h);
        } else {
            stringBuilder.append(", proxySelector=");
            stringBuilder.append(this.g);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

