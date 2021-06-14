package a;

import a.a.h.*;
import java.security.cert.*;
import javax.net.ssl.*;
import java.util.*;
import a.a.*;

public final class f
{
    public static final f a;
    final Set<b> b;
    final a.a.h.b c;
    
    static {
        a = new f(new LinkedHashSet<b>((Collection<? extends b>)new a().a), null);
    }
    
    f(final Set<b> b, final a.a.h.b c) {
        super();
        this.b = b;
        this.c = c;
    }
    
    private static b.f a(final X509Certificate x509Certificate) {
        return b.f.a(x509Certificate.getPublicKey().getEncoded()).d();
    }
    
    public static String a(final Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            final StringBuilder sb = new StringBuilder("sha256/");
            sb.append(a((X509Certificate)certificate).b());
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }
    
    public final void a(final String s, final List<Certificate> list) {
        Object emptyList = Collections.emptyList();
        for (final b b : this.b) {
            boolean b2;
            if (b.a.startsWith("*.")) {
                b2 = s.regionMatches(false, s.indexOf(46) + 1, b.b, 0, b.b.length());
            }
            else {
                b2 = s.equals(b.b);
            }
            if (b2) {
                Object o = emptyList;
                if (((List)emptyList).isEmpty()) {
                    o = new ArrayList<b>();
                }
                ((List<b>)o).add(b);
                emptyList = o;
            }
        }
        if (((List)emptyList).isEmpty()) {
            return;
        }
        List<Certificate> a = list;
        if (this.c != null) {
            a = this.c.a(list, s);
        }
        final int size = a.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            final X509Certificate x509Certificate = a.get(i);
            final int size2 = ((List)emptyList).size();
            b.f f2;
            b.f f = f2 = null;
            for (int j = 0; j < size2; ++j) {
                final b b3 = ((List<b>)emptyList).get(j);
                if (b3.c.equals("sha256/")) {
                    b.f a2;
                    if ((a2 = f) == null) {
                        a2 = a(x509Certificate);
                    }
                    f = a2;
                    if (b3.d.equals(a2)) {
                        return;
                    }
                }
                else {
                    if (!b3.c.equals("sha1/")) {
                        throw new AssertionError();
                    }
                    b.f c;
                    if ((c = f2) == null) {
                        c = b.f.a(x509Certificate.getPublicKey().getEncoded()).c();
                    }
                    f2 = c;
                    if (b3.d.equals(c)) {
                        return;
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (int size3 = a.size(), k = 0; k < size3; ++k) {
            final X509Certificate x509Certificate2 = a.get(k);
            sb.append("\n    ");
            sb.append(a((Certificate)x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(s);
        sb.append(":");
        for (int size4 = ((List)emptyList).size(), l = n; l < size4; ++l) {
            final b b4 = ((List<b>)emptyList).get(l);
            sb.append("\n    ");
            sb.append(b4);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof f) {
            final a.a.h.b c = this.c;
            final f f = (f)o;
            if (a.a.c.a(c, f.c) && this.b.equals(f.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int hashCode;
        if (this.c != null) {
            hashCode = this.c.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode * 31 + this.b.hashCode();
    }
    
    public static final class a
    {
        final List<b> a;
        
        public a() {
            super();
            this.a = new ArrayList<b>();
        }
    }
    
    static final class b
    {
        final String a;
        final String b;
        final String c;
        final b.f d;
        
        @Override
        public final boolean equals(final Object o) {
            if (o instanceof b) {
                final String a = this.a;
                final b b = (b)o;
                if (a.equals(b.a) && this.c.equals(b.c) && this.d.equals(b.d)) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return ((this.a.hashCode() + 527) * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            sb.append(this.d.b());
            return sb.toString();
        }
    }
}
