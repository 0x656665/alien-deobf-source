/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package a.a.g;

import a.a.c;
import a.a.g.d;
import a.a.g.e;
import a.v;
import android.util.Log;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

final class a
extends e {
    private final Class<?> a;
    private final d<Socket> b;
    private final d<Socket> d;
    private final d<Socket> e;
    private final d<Socket> f;
    private final b g = b.a();

    private a(Class<?> class_, d<Socket> d2, d<Socket> d3, d<Socket> d4, d<Socket> d5) {
        this.a = class_;
        this.b = d2;
        this.d = d3;
        this.e = d4;
        this.f = d5;
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    public static e a() {
        block9 : {
            try {
                var1 = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                ** GOTO lbl7
            }
            catch (ClassNotFoundException var0_1) {}
            try {
                var1 = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
lbl7: // 2 sources:
                var3_5 = new d<Socket>(null, "setUseSessionTickets", new Class[]{Boolean.TYPE});
                var4_6 = new d<Socket>(null, "setHostname", new Class[]{String.class});
            }
            catch (ClassNotFoundException var0_4) {
                return null;
            }
            try {
                Class.forName("android.net.Network");
                var0_2 = new d<Socket>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            }
            catch (ClassNotFoundException var0_3) {}
            try {
                var2_7 = new d<T>(null, "setAlpnProtocols", new Class[]{byte[].class});
                break block9;
            }
            catch (ClassNotFoundException var2_8) {}
            var0_2 = null;
            var2_7 = null;
        }
        return new a(var1, var3_5, var4_6, (d<Socket>)var0_2, (d<Socket>)var2_7);
    }

    @Override
    public final a.a.h.b a(X509TrustManager x509TrustManager) {
        try {
            Class<?> class_ = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(class_.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), class_.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        }
        catch (Exception exception) {
            return super.a(x509TrustManager);
        }
    }

    @Override
    public final Object a(String string) {
        return this.g.a(string);
    }

    @Override
    public final String a(SSLSocket arrby) {
        if (this.e == null) {
            return null;
        }
        if (!this.e.a((Socket)arrby)) {
            return null;
        }
        if ((arrby = (byte[])this.e.b((Socket)arrby, new Object[0])) == null) return null;
        return new String(arrby, c.e);
    }

    @Override
    public final void a(int n2, String string, Throwable throwable) {
        int n3 = 5;
        if (n2 != 5) {
            n3 = 3;
        }
        CharSequence charSequence = string;
        if (throwable != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append('\n');
            ((StringBuilder)charSequence).append(Log.getStackTraceString((Throwable)throwable));
            charSequence = ((StringBuilder)charSequence).toString();
        }
        n2 = 0;
        int n4 = ((String)charSequence).length();
        block0 : while (n2 < n4) {
            int n5 = ((String)charSequence).indexOf(10, n2);
            if (n5 == -1) {
                n5 = n4;
            }
            do {
                int n6 = Math.min(n5, n2 + 4000);
                Log.println((int)n3, (String)"OkHttp", (String)((String)charSequence).substring(n2, n6));
                if (n6 >= n5) {
                    n2 = n6 + 1;
                    continue block0;
                }
                n2 = n6;
            } while (true);
            break;
        }
        return;
    }

    @Override
    public final void a(String string, Object object) {
        if (this.g.a(object)) return;
        this.a(5, string, null);
    }

    @Override
    public final void a(Socket socket, InetSocketAddress serializable, int n2) {
        try {
            socket.connect((SocketAddress)serializable, n2);
            return;
        }
        catch (SecurityException securityException) {
            serializable = new IOException("Exception in connect");
            ((Throwable)serializable).initCause(securityException);
            throw serializable;
        }
        catch (AssertionError assertionError) {
            if (!c.a(assertionError)) throw assertionError;
            throw new IOException((Throwable)((Object)assertionError));
        }
    }

    @Override
    public final void a(SSLSocket sSLSocket, String arrby, List<v> list) {
        if (arrby != null) {
            this.b.a(sSLSocket, Boolean.TRUE);
            this.d.a(sSLSocket, new Object[]{arrby});
        }
        if (this.f == null) return;
        if (!this.f.a(sSLSocket)) return;
        arrby = new b.c();
        int n2 = list.size();
        int n3 = 0;
        do {
            if (n3 >= n2) {
                arrby = arrby.n();
                this.f.b(sSLSocket, new Object[]{arrby});
                return;
            }
            v v2 = list.get(n3);
            if (v2 != v.a) {
                arrby.b(v2.toString().length());
                arrby.a(v2.toString());
            }
            ++n3;
        } while (true);
    }

    @Override
    public final boolean b(String string) {
        try {
            Class<?> class_ = Class.forName("android.security.NetworkSecurityPolicy");
            Object object = class_.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            return (Boolean)class_.getMethod("isCleartextTrafficPermitted", String.class).invoke(object, string);
        }
        catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
            return super.b(string);
        }
        catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
            throw new AssertionError();
        }
    }

    static final class a
    extends a.a.h.b {
        private final Object a;
        private final Method b;

        a(Object object, Method method) {
            this.a = object;
            this.b = method;
        }

        @Override
        public final List<Certificate> a(List<Certificate> object, String object2) {
            try {
                object = object.toArray(new X509Certificate[object.size()]);
                return (List)this.b.invoke(this.a, object, "RSA", object2);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError(illegalAccessException);
            }
            catch (InvocationTargetException invocationTargetException) {
                object2 = new SSLPeerUnverifiedException(invocationTargetException.getMessage());
                ((Throwable)object2).initCause(invocationTargetException);
                throw object2;
            }
        }

        public final boolean equals(Object object) {
            return object instanceof a;
        }

        public final int hashCode() {
            return 0;
        }
    }

    static final class b {
        private final Method a;
        private final Method b;
        private final Method c;

        private b(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }

        static b a() {
            GenericDeclaration genericDeclaration;
            GenericDeclaration genericDeclaration2;
            Method method = null;
            try {
                genericDeclaration2 = Class.forName("dalvik.system.CloseGuard");
                Method method2 = genericDeclaration2.getMethod("get", new Class[0]);
                genericDeclaration = genericDeclaration2.getMethod("open", String.class);
                genericDeclaration2 = genericDeclaration2.getMethod("warnIfOpen", new Class[0]);
                method = method2;
                return new b(method, (Method)genericDeclaration, (Method)genericDeclaration2);
            }
            catch (Exception exception) {}
            genericDeclaration = genericDeclaration2 = null;
            return new b(method, (Method)genericDeclaration, (Method)genericDeclaration2);
        }

        final Object a(String string) {
            if (this.a == null) return null;
            try {
                Object object = this.a.invoke(null, new Object[0]);
                this.b.invoke(object, string);
                return object;
            }
            catch (Exception exception) {
                return null;
            }
        }

        final boolean a(Object object) {
            boolean bl = false;
            if (object == null) return bl;
            try {
                this.c.invoke(object, new Object[0]);
                return true;
            }
            catch (Exception exception) {
                return false;
            }
        }
    }

}

