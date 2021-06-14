package a.a.h;

import javax.security.auth.x500.*;
import java.security.cert.*;
import java.util.*;
import java.security.*;

static final class b extends e
{
    private final Map<X500Principal, Set<X509Certificate>> a;
    
    public b(final X509Certificate... array) {
        super();
        this.a = new LinkedHashMap<X500Principal, Set<X509Certificate>>();
        for (int length = array.length, i = 0; i < length; ++i) {
            final X509Certificate x509Certificate = array[i];
            final X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> set;
            if ((set = this.a.get(subjectX500Principal)) == null) {
                set = new LinkedHashSet<X509Certificate>(1);
                this.a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }
    
    @Override
    public final X509Certificate a(final X509Certificate x509Certificate) {
        final Set<X509Certificate> set = this.a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        final Iterator<X509Certificate> iterator = set.iterator();
        while (true) {
            Label_0065: {
                if (!iterator.hasNext()) {
                    break Label_0065;
                }
                final X509Certificate x509Certificate2 = iterator.next();
                final PublicKey publicKey = x509Certificate2.getPublicKey();
                try {
                    x509Certificate.verify(publicKey);
                    return x509Certificate2;
                    return null;
                }
                catch (Exception ex) {}
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof b && ((b)o).a.equals(this.a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
