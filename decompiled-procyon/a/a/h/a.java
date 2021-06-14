package a.a.h;

import java.security.*;
import java.security.cert.*;
import javax.net.ssl.*;
import java.util.*;

public final class a extends b
{
    private final e a;
    
    public a(final e a) {
        super();
        this.a = a;
    }
    
    private static boolean a(final X509Certificate x509Certificate, final X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        }
        catch (GeneralSecurityException ex) {
            return false;
        }
    }
    
    @Override
    public final List<Certificate> a(final List<Certificate> list, final String s) {
        final ArrayDeque<X509Certificate> arrayDeque = (ArrayDeque<X509Certificate>)new ArrayDeque<Certificate>(list);
        final ArrayList<X509Certificate> list2 = (ArrayList<X509Certificate>)new ArrayList<Certificate>();
        list2.add(arrayDeque.removeFirst());
        int i = 0;
        boolean b = false;
        while (i < 9) {
            final X509Certificate x509Certificate = list2.get(list2.size() - 1);
            final X509Certificate a = this.a.a(x509Certificate);
            Label_0179: {
                if (a != null) {
                    if (list2.size() > 1 || !x509Certificate.equals(a)) {
                        list2.add(a);
                    }
                    if (a(a, a)) {
                        return (List<Certificate>)list2;
                    }
                    b = true;
                }
                else {
                    final Iterator<X509Certificate> iterator = (Iterator<X509Certificate>)arrayDeque.iterator();
                    while (iterator.hasNext()) {
                        final X509Certificate x509Certificate2 = iterator.next();
                        if (a(x509Certificate, x509Certificate2)) {
                            iterator.remove();
                            list2.add(x509Certificate2);
                            break Label_0179;
                        }
                    }
                    if (b) {
                        return (List<Certificate>)list2;
                    }
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(String.valueOf(x509Certificate)));
                }
            }
            ++i;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: ".concat(String.valueOf(list2)));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof a && ((a)o).a.equals(this.a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
