package a.a.c;

import java.security.cert.*;
import javax.net.ssl.*;
import java.io.*;
import java.net.*;
import a.a.b.*;
import a.*;

public final class j implements s
{
    public Object a;
    public volatile boolean b;
    private final u c;
    private final boolean d;
    private g e;
    
    public j(final u c, final boolean d) {
        super();
        this.c = c;
        this.d = d;
    }
    
    private a.a a(final r r) {
        SSLSocketFactory n;
        Object p;
        f q;
        if (r.b()) {
            n = this.c.n;
            p = this.c.p;
            q = this.c.q;
        }
        else {
            final SSLSocketFactory sslSocketFactory = null;
            p = (q = (f)sslSocketFactory);
            n = sslSocketFactory;
        }
        return new a.a(r.b, r.c, this.c.u, this.c.m, n, (HostnameVerifier)p, q, this.c.r, this.c.d, this.c.e, this.c.f, this.c.i);
    }
    
    private static boolean a(final z z, final r r) {
        final r a = z.a.a;
        return a.b.equals(r.b) && a.c == r.c && a.a.equals(r.a);
    }
    
    private static boolean a(final IOException ex, final boolean b) {
        if (ex instanceof ProtocolException) {
            return false;
        }
        if (ex instanceof InterruptedIOException) {
            return ex instanceof SocketTimeoutException && !b;
        }
        return (!(ex instanceof SSLHandshakeException) || !(ex.getCause() instanceof CertificateException)) && !(ex instanceof SSLPeerUnverifiedException);
    }
    
    private boolean a(final IOException ex, final boolean b, final x x) {
        this.e.a(ex);
        return this.c.x && (!b || !(x.d instanceof l)) && a(ex, b) && this.e.e();
    }
    
    @Override
    public final z a(final a a) {
        Object o = a.a();
        this.e = new g(this.c.t, this.a(((x)o).a), this.a);
        Object j = null;
        int n = 0;
    Label_0044:
        while (!this.b) {
            while (true) {
                boolean equals = true;
                while (true) {
                    Label_0927: {
                        try {
                            try {
                                final z a2 = ((a.a.c.g)a).a((x)o, this.e, null, null);
                                if (j != null) {
                                    o = a2.a();
                                    j = ((z)j).a();
                                    ((z.a)j).g = null;
                                    j = ((z.a)j).a();
                                    if (((z)j).g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    ((z.a)o).j = (z)j;
                                    j = ((z.a)o).a();
                                }
                                else {
                                    j = a2;
                                }
                                if (j == null) {
                                    throw new IllegalStateException();
                                }
                                o = this.e.b();
                                if (o != null) {
                                    o = ((h)o).a();
                                }
                                else {
                                    o = null;
                                }
                                final int c = ((z)j).c;
                                final String b = ((z)j).a.b;
                                Label_0371: {
                                    switch (c) {
                                        default: {
                                            break Label_0371;
                                        }
                                        case 408: {
                                            if (!(((z)j).a.d instanceof l)) {
                                                o = ((z)j).a;
                                                break;
                                            }
                                            break Label_0371;
                                        }
                                        case 407: {
                                            if (o != null) {
                                                o = ((ab)o).b;
                                            }
                                            else {
                                                o = this.c.d;
                                            }
                                            if (((Proxy)o).type() == Proxy.Type.HTTP) {
                                                break Label_0371;
                                            }
                                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                                        }
                                        case 307:
                                        case 308: {
                                            if (b.equals("GET") || b.equals("HEAD")) {
                                                break Label_0371;
                                            }
                                            break Label_0371;
                                        }
                                        case 300:
                                        case 301:
                                        case 302:
                                        case 303: {
                                            if (!this.c.w) {
                                                break Label_0371;
                                            }
                                            o = ((z)j).decrypt_str("Location");
                                            if (o == null) {
                                                break Label_0371;
                                            }
                                            o = ((z)j).a.a.c((String)o);
                                            if (o != null) {
                                                o = ((r.a)o).b();
                                            }
                                            else {
                                                o = null;
                                            }
                                            if (o != null && (((r)o).a.equals(((z)j).a.a.a) || this.c.v)) {
                                                final x.a a3 = ((z)j).a.a();
                                                if (a.a.c.f.b(b)) {
                                                    equals = b.equals("PROPFIND");
                                                    if (true ^ b.equals("PROPFIND")) {
                                                        a3.a("GET", (y)null);
                                                    }
                                                    else {
                                                        y d;
                                                        if (equals) {
                                                            d = ((z)j).a.d;
                                                        }
                                                        else {
                                                            d = null;
                                                        }
                                                        a3.a(b, d);
                                                    }
                                                    if (!equals) {
                                                        a3.a("Transfer-Encoding");
                                                        a3.a("Content-Length");
                                                        a3.a("Content-Type");
                                                    }
                                                }
                                                if (!a((z)j, (r)o)) {
                                                    a3.a("Authorization");
                                                }
                                                o = a3.a((r)o).a();
                                                break;
                                            }
                                            break Label_0371;
                                        }
                                        case 401: {
                                            o = null;
                                            break;
                                        }
                                    }
                                }
                                if (o == null) {
                                    if (!this.d) {
                                        this.e.c();
                                    }
                                    return (z)j;
                                }
                                a.a.c.a(((z)j).g);
                                ++n;
                                if (n > 20) {
                                    this.e.c();
                                    throw new ProtocolException("Too many follow-up requests: ".concat(String.valueOf(n)));
                                }
                                if (((x)o).d instanceof l) {
                                    this.e.c();
                                    throw new HttpRetryException("Cannot retry streamed HTTP body", ((z)j).c);
                                }
                                if (!a((z)j, ((x)o).a)) {
                                    this.e.c();
                                    this.e = new g(this.c.t, this.a(((x)o).a), this.a);
                                    continue Label_0044;
                                }
                                if (this.e.a() == null) {
                                    continue Label_0044;
                                }
                                final StringBuilder sb = new StringBuilder("Closing the body of ");
                                sb.append(j);
                                sb.append(" didn't close its backing stream. Bad interceptor?");
                                throw new IllegalStateException(sb.toString());
                            }
                            finally {}
                        }
                        catch (IOException ex) {
                            if (ex instanceof a.a.e.a) {
                                break Label_0927;
                            }
                            if (this.a(ex, equals, (x)o)) {
                                continue Label_0044;
                            }
                            throw ex;
                        }
                        catch (e e) {
                            if (this.a(e.a, false, (x)o)) {
                                continue Label_0044;
                            }
                            throw e.a;
                        }
                        break;
                    }
                    equals = false;
                    continue;
                }
            }
            this.e.a((IOException)null);
            this.e.c();
            throw a;
        }
        this.e.c();
        throw new IOException("Canceled");
    }
}
