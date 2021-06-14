package a;

import java.security.cert.*;
import a.a.*;
import java.util.*;
import javax.net.ssl.*;

public final class p
{
    public final g a;
    public final List<Certificate> b;
    private final ac c;
    private final List<Certificate> d;
    
    private p(final ac c, final g a, final List<Certificate> b, final List<Certificate> d) {
        super();
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public static p a(SSLSession sslSession) {
        final String cipherSuite = sslSession.getCipherSuite();
        while (true) {
            Label_0105: {
                if (cipherSuite == null) {
                    break Label_0105;
                }
                final g a = g.a(cipherSuite);
                final String protocol = sslSession.getProtocol();
                Label_0095: {
                    if (protocol == null) {
                        break Label_0095;
                    }
                    final ac a2 = ac.a(protocol);
                    try {
                        Certificate[] peerCertificates = sslSession.getPeerCertificates();
                        while (true) {
                            List<Certificate> list;
                            if (peerCertificates != null) {
                                list = c.a(peerCertificates);
                            }
                            else {
                                list = Collections.emptyList();
                            }
                            sslSession = (SSLSession)(Object)sslSession.getLocalCertificates();
                            if (sslSession != null) {
                                sslSession = (SSLSession)c.a((Object[])(Object)sslSession);
                            }
                            else {
                                sslSession = (SSLSession)Collections.emptyList();
                            }
                            return new p(a2, a, list, (List<Certificate>)sslSession);
                            throw new IllegalStateException("tlsVersion == null");
                            throw new IllegalStateException("cipherSuite == null");
                            peerCertificates = null;
                            continue;
                        }
                    }
                    catch (SSLPeerUnverifiedException ex) {}
                }
            }
            continue;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof p)) {
            return false;
        }
        final p p = (p)o;
        return a.a.c.a(this.a, p.a) && this.a.equals(p.a) && this.b.equals(p.b) && this.d.equals(p.d);
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
        return (((hashCode + 527) * 31 + this.a.hashCode()) * 31 + this.b.hashCode()) * 31 + this.d.hashCode();
    }
}
