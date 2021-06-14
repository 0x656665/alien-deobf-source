/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.h;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

public abstract class e {
    public static e a(X509TrustManager x509TrustManager) {
        try {
            Method method = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            return new a(x509TrustManager, method);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return new b(x509TrustManager.getAcceptedIssuers());
        }
    }

    public abstract X509Certificate a(X509Certificate var1);

    static final class a
    extends e {
        private final X509TrustManager a;
        private final Method b;

        a(X509TrustManager x509TrustManager, Method method) {
            this.b = method;
            this.a = x509TrustManager;
        }

        @Override
        public final X509Certificate a(X509Certificate object) {
            try {
                object = (TrustAnchor)this.b.invoke(this.a, object);
                if (object == null) return null;
                return ((TrustAnchor)object).getTrustedCert();
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError();
            }
            catch (InvocationTargetException invocationTargetException) {
                return null;
            }
        }

        public final boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof a)) {
                return false;
            }
            object = (a)object;
            if (!this.a.equals(((a)object).a)) return false;
            if (!this.b.equals(((a)object).b)) return false;
            return true;
        }

        public final int hashCode() {
            return this.a.hashCode() + this.b.hashCode() * 31;
        }
    }

    static final class b
    extends e {
        private final Map<X500Principal, Set<X509Certificate>> a = new LinkedHashMap<X500Principal, Set<X509Certificate>>();

        public b(X509Certificate ... arrx509Certificate) {
            int n2 = arrx509Certificate.length;
            int n3 = 0;
            while (n3 < n2) {
                Set<X509Certificate> set;
                X509Certificate x509Certificate = arrx509Certificate[n3];
                X500Principal x500Principal = x509Certificate.getSubjectX500Principal();
                Set<X509Certificate> set2 = set = this.a.get(x500Principal);
                if (set == null) {
                    set2 = new LinkedHashSet<X509Certificate>(1);
                    this.a.put(x500Principal, set2);
                }
                set2.add(x509Certificate);
                ++n3;
            }
        }

        @Override
        public final X509Certificate a(X509Certificate x509Certificate) {
            Iterator iterator = x509Certificate.getIssuerX500Principal();
            if ((iterator = this.a.get(iterator)) == null) {
                return null;
            }
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                X509Certificate x509Certificate2 = (X509Certificate)iterator.next();
                PublicKey publicKey = x509Certificate2.getPublicKey();
                try {
                    x509Certificate.verify(publicKey);
                    return x509Certificate2;
                }
                catch (Exception exception) {
                }
            }
            return null;
        }

        public final boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof b)) return false;
            if (!((b)object).a.equals(this.a)) return false;
            return true;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

}

