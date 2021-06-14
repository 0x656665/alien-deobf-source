package a.a.g;

import a.*;
import java.util.*;
import java.util.logging.*;
import javax.net.ssl.*;
import java.net.*;

public class e
{
    private static final Logger a;
    static final e c;
    
    static {
        e c2 = a.a.g.a.a();
        if (c2 == null) {
            c2 = b.a();
            if (c2 == null) {
                c2 = a.a.g.c.a();
                if (c2 == null) {
                    c2 = new e();
                }
            }
        }
        c = c2;
        a = Logger.getLogger(u.class.getName());
    }
    
    public e() {
        super();
    }
    
    public static List<String> a(final List<v> list) {
        final ArrayList<String> list2 = new ArrayList<String>(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            final v v = list.get(i);
            if (v != a.v.a) {
                list2.add(v.toString());
            }
        }
        return list2;
    }
    
    public static e b() {
        return e.c;
    }
    
    public a.a.h.b a(final X509TrustManager x509TrustManager) {
        return new a.a.h.a(a.a.h.e.a(x509TrustManager));
    }
    
    public Object a(final String s) {
        if (e.a.isLoggable(Level.FINE)) {
            return new Throwable(s);
        }
        return null;
    }
    
    public String a(final SSLSocket sslSocket) {
        return null;
    }
    
    public void a(final int n, final String s, final Throwable t) {
        Level level;
        if (n == 5) {
            level = Level.WARNING;
        }
        else {
            level = Level.INFO;
        }
        e.a.log(level, s, t);
    }
    
    public void a(final String s, final Object o) {
        String string = s;
        if (o == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            string = sb.toString();
        }
        this.a(5, string, (Throwable)o);
    }
    
    public void a(final Socket socket, final InetSocketAddress \u0131netSocketAddress, final int n) {
        socket.connect(\u0131netSocketAddress, n);
    }
    
    public void a(final SSLSocket sslSocket, final String s, final List<v> list) {
    }
    
    public void b(final SSLSocket sslSocket) {
    }
    
    public boolean b(final String s) {
        return true;
    }
}
