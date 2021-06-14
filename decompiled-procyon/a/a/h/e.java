package a.a.h;

import javax.net.ssl.*;
import java.security.cert.*;
import java.lang.reflect.*;
import javax.security.auth.x500.*;
import java.util.*;
import java.security.*;

public abstract class e
{
    public e() {
        super();
    }
    
    public static e a(final X509TrustManager x509TrustManager) {
        try {
            final Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new a(x509TrustManager, declaredMethod);
        }
        catch (NoSuchMethodException ex) {
            return new b(x509TrustManager.getAcceptedIssuers());
        }
    }
    
    public abstract X509Certificate a(final X509Certificate p0);
    
    static final class a extends e
    {
        private final X509TrustManager a;
        private final Method b;
        
        a(final X509TrustManager a, final Method b) {
            super();
            this.b = b;
            this.a = a;
        }
        
        @Override
        public final X509Certificate a(X509Certificate trustedCert) {
            try {
                final TrustAnchor trustAnchor = (TrustAnchor)this.b.invoke(this.a, trustedCert);
                if (trustAnchor != null) {
                    trustedCert = trustAnchor.getTrustedCert();
                    return trustedCert;
                }
                return null;
            }
            catch (IllegalAccessException ex) {
                throw new AssertionError();
            }
            catch (InvocationTargetException ex2) {
                return null;
            }
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a.equals(a.a) && this.b.equals(a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode() + this.b.hashCode() * 31;
        }
    }
    
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
}
