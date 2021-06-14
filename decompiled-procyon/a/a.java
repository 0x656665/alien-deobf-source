package a;

import javax.net.*;
import java.util.*;
import java.net.*;
import javax.net.ssl.*;
import a.a.*;

public final class a
{
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
    
    public a(final String s, final int e, final n b, final SocketFactory c, final SSLSocketFactory i, final HostnameVerifier j, final f k, final b d, final Proxy h, final List<v> list, final List<j> list2, final ProxySelector g) {
        super();
        final r.a a = new r.a();
        String s2;
        if (i != null) {
            s2 = "https";
        }
        else {
            s2 = "http";
        }
        if (s2.equalsIgnoreCase("http")) {
            a.a = "http";
        }
        else {
            if (!s2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(s2)));
            }
            a.a = "https";
        }
        if (s == null) {
            throw new NullPointerException("host == null");
        }
        final String a2 = r.a.a(s, 0, s.length());
        if (a2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(s)));
        }
        a.d = a2;
        if (e <= 0 || e > 65535) {
            throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(e)));
        }
        a.e = e;
        this.a = a.b();
        if (b == null) {
            throw new NullPointerException("dns == null");
        }
        this.b = b;
        if (c == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.c = c;
        if (d == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.d = d;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.e = a.a.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f = a.a.c.a(list2);
        if (g != null) {
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            return;
        }
        throw new NullPointerException("proxySelector == null");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof a) {
            final a a = (a)o;
            return this.a.equals(a.a) && this.b.equals(a.b) && this.d.equals(a.d) && this.e.equals(a.e) && this.f.equals(a.f) && this.g.equals(a.g) && a.a.c.a(this.h, a.h) && a.a.c.a(this.i, a.i) && a.a.c.a(this.j, a.j) && a.a.c.a(this.k, a.k);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.d.hashCode();
        final int hashCode4 = this.e.hashCode();
        final int hashCode5 = this.f.hashCode();
        final int hashCode6 = this.g.hashCode();
        final Proxy h = this.h;
        int hashCode7 = 0;
        int hashCode8;
        if (h != null) {
            hashCode8 = this.h.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        int hashCode9;
        if (this.i != null) {
            hashCode9 = this.i.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        int hashCode10;
        if (this.j != null) {
            hashCode10 = this.j.hashCode();
        }
        else {
            hashCode10 = 0;
        }
        if (this.k != null) {
            hashCode7 = this.k.hashCode();
        }
        return (((((((((hashCode + 527) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode7;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.a.b);
        sb.append(":");
        sb.append(this.a.c);
        if (this.h != null) {
            sb.append(", proxy=");
            sb.append(this.h);
        }
        else {
            sb.append(", proxySelector=");
            sb.append(this.g);
        }
        sb.append("}");
        return sb.toString();
    }
}
