/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.h;

import a.a.h.b;
import a.a.h.e;
import java.security.GeneralSecurityException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class a
extends b {
    private final e a;

    public a(e e2) {
        this.a = e2;
    }

    private static boolean a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        }
        catch (GeneralSecurityException generalSecurityException) {
            return false;
        }
    }

    @Override
    public final List<Certificate> a(List<Certificate> collection, String object) {
        collection = new ArrayDeque<Certificate>(collection);
        object = new ArrayList();
        object.add(collection.removeFirst());
        int n2 = 0;
        boolean bl = false;
        while (n2 < 9) {
            X509Certificate x509Certificate = (X509Certificate)object.get(object.size() - 1);
            Object object2 = this.a.a(x509Certificate);
            if (object2 != null) {
                if (object.size() > 1 || !x509Certificate.equals(object2)) {
                    object.add(object2);
                }
                if (a.a((X509Certificate)object2, (X509Certificate)object2)) {
                    return object;
                }
                bl = true;
            } else {
                X509Certificate x509Certificate2;
                object2 = collection.iterator();
                do {
                    if (object2.hasNext()) continue;
                    if (!bl) throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(String.valueOf(x509Certificate)));
                    return object;
                } while (!a.a(x509Certificate, x509Certificate2 = (X509Certificate)object2.next()));
                object2.remove();
                object.add(x509Certificate2);
            }
            ++n2;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: ".concat(String.valueOf(object)));
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof a)) return false;
        if (!((a)object).a.equals(this.a)) return false;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

