/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.c;
import a.ac;
import a.g;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class p {
    public final g a;
    public final List<Certificate> b;
    private final ac c;
    private final List<Certificate> d;

    private p(ac ac2, g g2, List<Certificate> list, List<Certificate> list2) {
        this.c = ac2;
        this.a = g2;
        this.b = list;
        this.d = list2;
    }

    public static p a(SSLSession object) {
        Object object2;
        ac ac2;
        g g2;
        block3 : {
            object2 = object.getCipherSuite();
            if (object2 == null) throw new IllegalStateException("cipherSuite == null");
            g2 = g.a((String)object2);
            object2 = object.getProtocol();
            if (object2 == null) throw new IllegalStateException("tlsVersion == null");
            ac2 = ac.a((String)object2);
            try {
                object2 = object.getPeerCertificates();
                break block3;
            }
            catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {}
            object2 = null;
        }
        object2 = object2 != null ? c.a(object2) : Collections.emptyList();
        object = object.getLocalCertificates();
        if (object != null) {
            object = c.a(object);
            return new p(ac2, g2, (List<Certificate>)object2, (List<Certificate>)object);
        }
        object = Collections.emptyList();
        return new p(ac2, g2, (List<Certificate>)object2, (List<Certificate>)object);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof p)) {
            return false;
        }
        object = (p)object;
        if (!c.a(this.a, (Object)((p)object).a)) return false;
        if (!this.a.equals(((p)object).a)) return false;
        if (!this.b.equals(((p)object).b)) return false;
        if (!this.d.equals(((p)object).d)) return false;
        return true;
    }

    public final int hashCode() {
        int n2;
        if (this.c != null) {
            n2 = this.c.hashCode();
            return (((n2 + 527) * 31 + this.a.hashCode()) * 31 + this.b.hashCode()) * 31 + this.d.hashCode();
        }
        n2 = 0;
        return (((n2 + 527) * 31 + this.a.hashCode()) * 31 + this.b.hashCode()) * 31 + this.d.hashCode();
    }
}

