package a.a.g;

import javax.net.ssl.*;
import java.lang.reflect.*;
import java.util.*;
import a.*;

final class b extends e
{
    final Method a;
    final Method b;
    
    private b(final Method a, final Method b) {
        super();
        this.a = a;
        this.b = b;
    }
    
    public static b a() {
        try {
            return new b(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", (Class<?>[])new Class[0]));
        }
        catch (NoSuchMethodException ex) {
            return null;
        }
    }
    
    @Override
    public final String a(final SSLSocket sslSocket) {
        try {
            final String s = (String)this.b.invoke(sslSocket, new Object[0]);
            if (s != null && !s.equals("")) {
                return s;
            }
            return null;
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            throw new AssertionError();
        }
    }
    
    @Override
    public final void a(final SSLSocket sslSocket, final String s, final List<v> list) {
        try {
            final SSLParameters sslParameters = sslSocket.getSSLParameters();
            final List<String> a = e.a(list);
            this.a.invoke(sslParameters, a.toArray(new String[a.size()]));
            sslSocket.setSSLParameters(sslParameters);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            throw new AssertionError();
        }
    }
}
