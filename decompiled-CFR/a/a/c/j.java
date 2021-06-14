/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.c;

import a.a;
import a.a.b.e;
import a.a.c;
import a.a.c.g;
import a.a.c.l;
import a.aa;
import a.ab;
import a.b;
import a.f;
import a.h;
import a.i;
import a.n;
import a.r;
import a.s;
import a.u;
import a.v;
import a.x;
import a.y;
import a.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

public final class j
implements s {
    public Object a;
    public volatile boolean b;
    private final u c;
    private final boolean d;
    private a.a.b.g e;

    public j(u u2, boolean bl) {
        this.c = u2;
        this.d = bl;
    }

    private a a(r r2) {
        HostnameVerifier hostnameVerifier;
        HostnameVerifier hostnameVerifier2;
        Object object;
        Object object2;
        if (r2.b()) {
            object = this.c.n;
            hostnameVerifier = this.c.p;
            f f2 = this.c.q;
            object2 = f2;
            return new a(r2.b, r2.c, this.c.u, this.c.m, (SSLSocketFactory)object, hostnameVerifier, (f)object2, this.c.r, this.c.d, this.c.e, this.c.f, this.c.i);
        }
        hostnameVerifier = hostnameVerifier2 = null;
        object2 = hostnameVerifier;
        object = hostnameVerifier2;
        return new a(r2.b, r2.c, this.c.u, this.c.m, (SSLSocketFactory)object, hostnameVerifier, (f)object2, this.c.r, this.c.d, this.c.e, this.c.f, this.c.i);
    }

    private static boolean a(z object, r r2) {
        object = object.a.a;
        if (!((r)object).b.equals(r2.b)) return false;
        if (((r)object).c != r2.c) return false;
        if (!((r)object).a.equals(r2.a)) return false;
        return true;
    }

    private static boolean a(IOException iOException, boolean bl) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException)) return false;
            if (bl) return false;
            return true;
        }
        if (iOException instanceof SSLHandshakeException && iOException.getCause() instanceof CertificateException) {
            return false;
        }
        if (!(iOException instanceof SSLPeerUnverifiedException)) return true;
        return false;
    }

    private boolean a(IOException iOException, boolean bl, x x2) {
        this.e.a(iOException);
        if (!this.c.x) {
            return false;
        }
        if (bl && x2.d instanceof l) {
            return false;
        }
        if (!j.a(iOException, bl)) {
            return false;
        }
        if (this.e.e()) return true;
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    @Override
    public final z a(s.a var1_1) {
        var5_3 = var1_1.a();
        this.e = new a.a.b.g(this.c.t, this.a(var5_3.a), this.a);
        var6_4 = null;
        var2_5 = 0;
        do {
            block24 : {
                block23 : {
                    if (this.b) {
                        this.e.c();
                        throw new IOException("Canceled");
                    }
                    var4_7 = true;
                    var7_8 = ((g)var1_1).a((x)var5_3, this.e, null, null);
                    if (var6_4 == null) break block23;
                    var5_3 = var7_8.a();
                    var6_4 = var6_4.a();
                    var6_4.g = null;
                    var6_4 = var6_4.a();
                    if (var6_4.g != null) throw new IllegalArgumentException("priorResponse.body != null");
                    var5_3.j = var6_4;
                    var6_4 = var5_3.a();
                    break block24;
                }
                var6_4 = var7_8;
            }
            if (var6_4 == null) throw new IllegalStateException();
            var5_3 = this.e.b();
            var5_3 = var5_3 != null ? var5_3.a() : null;
            var3_6 = var6_4.c;
            var8_11 = var6_4.a.b;
            switch (var3_6) {
                default: {
                    break;
                }
                case 408: {
                    if (var6_4.a.d instanceof l) break;
                    var5_3 = var6_4.a;
                    ** break;
                }
                case 407: {
                    var5_3 = var5_3 != null ? var5_3.b : this.c.d;
                    if (var5_3.type() != Proxy.Type.HTTP) throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    break;
                }
                case 307: 
                case 308: {
                    if (!var8_11.equals("GET") && !var8_11.equals("HEAD")) break;
                }
                case 300: 
                case 301: 
                case 302: 
                case 303: {
                    if (!this.c.w || (var5_3 = var6_4.decrypt_str("Location")) == null || (var5_3 = (var5_3 = var6_4.a.a.c((String)var5_3)) != null ? var5_3.b() : null) == null || !var5_3.a.equals(var6_4.a.a.a) && !this.c.v) break;
                    var9_12 = var6_4.a.a();
                    if (a.a.c.f.b(var8_11)) {
                        var4_7 = var8_11.equals("PROPFIND");
                        if (true ^ var8_11.equals("PROPFIND")) {
                            var9_12.a("GET", (y)null);
                        } else {
                            var7_8 = var4_7 != false ? var6_4.a.d : null;
                            var9_12.a(var8_11, (y)var7_8);
                        }
                        if (!var4_7) {
                            var9_12.a("Transfer-Encoding");
                            var9_12.a("Content-Length");
                            var9_12.a("Content-Type");
                        }
                    }
                    if (!j.a((z)var6_4, (r)var5_3)) {
                        var9_12.a("Authorization");
                    }
                    var5_3 = var9_12.a((r)var5_3).a();
                    ** break;
                }
                case 401: 
            }
            var5_3 = null;
lbl68: // 3 sources:
            if (var5_3 == null) {
                if (this.d != false) return var6_4;
                this.e.c();
                return var6_4;
            }
            c.a(var6_4.g);
            if (++var2_5 > 20) {
                this.e.c();
                throw new ProtocolException("Too many follow-up requests: ".concat(String.valueOf(var2_5)));
            }
            if (var5_3.d instanceof l) {
                this.e.c();
                throw new HttpRetryException("Cannot retry streamed HTTP body", var6_4.c);
            }
            if (!j.a((z)var6_4, var5_3.a)) {
                this.e.c();
                this.e = new a.a.b.g(this.c.t, this.a(var5_3.a), this.a);
                continue;
            }
            if (this.e.a() == null) continue;
            var1_1 = new StringBuilder("Closing the body of ");
            var1_1.append(var6_4);
            var1_1.append(" didn't close its backing stream. Bad interceptor?");
            throw new IllegalStateException(var1_1.toString());
            {
                catch (Throwable var1_2) {
                    ** GOTO lbl98
                }
                catch (IOException var7_9) {}
                {
                    block26 : {
                        block25 : {
                            if (var7_9 instanceof a.a.e.a) break block25;
                            break block26;
                            catch (e var7_10) {
                                if (this.a(var7_10.a, false, (x)var5_3) == false) throw var7_10.a;
                                continue;
                            }
lbl98: // 1 sources:
                            this.e.a((IOException)null);
                            this.e.c();
                            throw var1_2;
                        }
                        var4_7 = false;
                    }
                    if (this.a(var7_9, var4_7, (x)var5_3) == false) throw var7_9;
                    continue;
                }
            }
            break;
        } while (true);
    }
}

