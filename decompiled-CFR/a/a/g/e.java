/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.g;

import a.a.g.a;
import a.a.g.b;
import a.a.g.c;
import a.u;
import a.v;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

public class e {
    private static final Logger a;
    static final e c;

    static {
        e e2 = a.a();
        if (e2 == null && (e2 = b.a()) == null && (e2 = c.a()) == null) {
            e2 = new e();
        }
        c = e2;
        a = Logger.getLogger(u.class.getName());
    }

    public static List<String> a(List<v> list) {
        ArrayList<String> arrayList = new ArrayList<String>(list.size());
        int n2 = list.size();
        int n3 = 0;
        while (n3 < n2) {
            v v2 = list.get(n3);
            if (v2 != v.a) {
                arrayList.add(v2.toString());
            }
            ++n3;
        }
        return arrayList;
    }

    public static e b() {
        return c;
    }

    public a.a.h.b a(X509TrustManager x509TrustManager) {
        return new a.a.h.a(a.a.h.e.a(x509TrustManager));
    }

    public Object a(String string) {
        if (!a.isLoggable(Level.FINE)) return null;
        return new Throwable(string);
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public void a(int n2, String string, Throwable throwable) {
        Level level = n2 == 5 ? Level.WARNING : Level.INFO;
        a.log(level, string, throwable);
    }

    public void a(String string, Object object) {
        CharSequence charSequence = string;
        if (object == null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        this.a(5, (String)charSequence, (Throwable)object);
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int n2) {
        socket.connect(inetSocketAddress, n2);
    }

    public void a(SSLSocket sSLSocket, String string, List<v> list) {
    }

    public void b(SSLSocket sSLSocket) {
    }

    public boolean b(String string) {
        return true;
    }
}

