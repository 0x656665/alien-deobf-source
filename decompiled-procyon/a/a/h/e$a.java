package a.a.h;

import javax.net.ssl.*;
import java.security.cert.*;
import java.lang.reflect.*;

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
