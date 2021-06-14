/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.c;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class f {
    public static final f a = new f(new LinkedHashSet<b>(new a().a), null);
    final Set<b> b;
    final a.a.h.b c;

    f(Set<b> set, a.a.h.b b2) {
        this.b = set;
        this.c = b2;
    }

    private static b.f a(X509Certificate x509Certificate) {
        return b.f.a(x509Certificate.getPublicKey().getEncoded()).d();
    }

    public static String a(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        StringBuilder stringBuilder = new StringBuilder("sha256/");
        stringBuilder.append(f.a((X509Certificate)certificate).b());
        return stringBuilder.toString();
    }

    /*
     * WARNING - void declaration
     */
    public final void a(String object, List<Certificate> list) {
        void var12_10;
        Object object2;
        List list3 = Collections.emptyList();
        for (b list22 : this.b) {
            boolean bl = list22.a.startsWith("*.") ? ((String)object).regionMatches(false, ((String)object).indexOf(46) + 1, list22.b, 0, list22.b.length()) : ((String)object).equals(list22.b);
            if (!bl) continue;
            object2 = list3;
            if (list3.isEmpty()) {
                object2 = new ArrayList();
            }
            object2.add(list22);
            list3 = object2;
        }
        if (list3.isEmpty()) {
            return;
        }
        List<Certificate> list2 = list;
        if (this.c != null) {
            List<Certificate> list4 = this.c.a(list, (String)object);
        }
        int n2 = var12_10.size();
        int n3 = 0;
        int n4 = 0;
        do {
            int n5;
            X509Certificate x509Certificate;
            int n6;
            if (n4 < n2) {
                x509Certificate = (X509Certificate)var12_10.get(n4);
                n6 = list3.size();
                object2 = null;
                list = object2;
            } else {
                list = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
                n5 = var12_10.size();
                for (n4 = 0; n4 < n5; ++n4) {
                    object2 = (X509Certificate)var12_10.get(n4);
                    ((StringBuilder)((Object)list)).append("\n    ");
                    ((StringBuilder)((Object)list)).append(f.a((Certificate)object2));
                    ((StringBuilder)((Object)list)).append(": ");
                    ((StringBuilder)((Object)list)).append(((X509Certificate)object2).getSubjectDN().getName());
                }
                ((StringBuilder)((Object)list)).append("\n  Pinned certificates for ");
                ((StringBuilder)((Object)list)).append((String)object);
                ((StringBuilder)((Object)list)).append(":");
                n5 = list3.size();
                n4 = n3;
                while (n4 < n5) {
                    object = (b)list3.get(n4);
                    ((StringBuilder)((Object)list)).append("\n    ");
                    ((StringBuilder)((Object)list)).append(object);
                    ++n4;
                }
                throw new SSLPeerUnverifiedException(((StringBuilder)((Object)list)).toString());
            }
            for (n5 = 0; n5 < n6; ++n5) {
                Object object3;
                b b2 = (b)list3.get(n5);
                if (b2.c.equals("sha256/")) {
                    object3 = object2;
                    if (object2 == null) {
                        object3 = f.a(x509Certificate);
                    }
                    object2 = object3;
                    if (!b2.d.equals(object3)) continue;
                    return;
                }
                if (!b2.c.equals("sha1/")) throw new AssertionError();
                object3 = list;
                if (list == null) {
                    object3 = b.f.a(x509Certificate.getPublicKey().getEncoded()).c();
                }
                list = object3;
                if (!b2.d.equals(object3)) continue;
                return;
            }
            ++n4;
        } while (true);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof f)) return false;
        a.a.h.b b2 = this.c;
        object = (f)object;
        if (!c.a(b2, (Object)((f)object).c)) return false;
        if (!this.b.equals(((f)object).b)) return false;
        return true;
    }

    public final int hashCode() {
        int n2;
        if (this.c != null) {
            n2 = this.c.hashCode();
            return n2 * 31 + this.b.hashCode();
        }
        n2 = 0;
        return n2 * 31 + this.b.hashCode();
    }

    public static final class a {
        final List<b> a = new ArrayList<b>();
    }

    static final class b {
        final String a;
        final String b;
        final String c;
        final b.f d;

        public final boolean equals(Object object) {
            if (!(object instanceof b)) return false;
            String string = this.a;
            object = (b)object;
            if (!string.equals(((b)object).a)) return false;
            if (!this.c.equals(((b)object).c)) return false;
            if (!this.d.equals(((b)object).d)) return false;
            return true;
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 527) * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append(this.d.b());
            return stringBuilder.toString();
        }
    }

}

