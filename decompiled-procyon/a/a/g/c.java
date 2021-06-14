package a.a.g;

import javax.net.ssl.*;
import java.util.*;
import a.*;
import java.lang.reflect.*;

final class c extends e
{
    private final Method a;
    private final Method b;
    private final Method d;
    private final Class<?> e;
    private final Class<?> f;
    
    private c(final Method a, final Method b, final Method d, final Class<?> e, final Class<?> f) {
        super();
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static e a() {
        try {
            final Class<?> forName = Class.forName("org.eclipse.jetty.alpn.ALPN");
            final StringBuilder sb = new StringBuilder();
            sb.append("org.eclipse.jetty.alpn.ALPN");
            sb.append("$Provider");
            final Class<?> forName2 = Class.forName(sb.toString());
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("org.eclipse.jetty.alpn.ALPN");
            sb2.append("$ClientProvider");
            final Class<?> forName3 = Class.forName(sb2.toString());
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("org.eclipse.jetty.alpn.ALPN");
            sb3.append("$ServerProvider");
            return new c(forName.getMethod("put", SSLSocket.class, forName2), forName.getMethod("get", SSLSocket.class), forName.getMethod("remove", SSLSocket.class), forName3, Class.forName(sb3.toString()));
        }
        catch (ClassNotFoundException | NoSuchMethodException ex) {
            return null;
        }
    }
    
    @Override
    public final String a(final SSLSocket sslSocket) {
        try {
            final a a = (a)Proxy.getInvocationHandler(this.b.invoke(null, sslSocket));
            if (!a.a && a.b == null) {
                a.a.g.e.c.a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (a.a) {
                return null;
            }
            return a.b;
        }
        catch (InvocationTargetException | IllegalAccessException ex) {
            throw new AssertionError();
        }
    }
    
    @Override
    public final void a(final SSLSocket sslSocket, final String s, final List<v> list) {
        final List<String> a = a.a.g.e.a(list);
        try {
            this.a.invoke(null, sslSocket, Proxy.newProxyInstance(e.class.getClassLoader(), new Class[] { this.e, this.f }, new a(a)));
        }
        catch (InvocationTargetException | IllegalAccessException ex) {
            final Object o;
            throw new AssertionError(o);
        }
    }
    
    @Override
    public final void b(final SSLSocket sslSocket) {
        try {
            this.d.invoke(null, sslSocket);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            throw new AssertionError();
        }
    }
    
    static final class a implements InvocationHandler
    {
        boolean a;
        String b;
        private final List<String> c;
        
        public a(final List<String> c) {
            super();
            this.c = c;
        }
        
        @Override
        public final Object invoke(final Object o, final Method method, final Object[] array) {
            final String name = method.getName();
            final Class<?> returnType = method.getReturnType();
            Object[] b = array;
            if (array == null) {
                b = a.a.c.b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.a = true;
                return null;
            }
            if (name.equals("protocols") && b.length == 0) {
                return this.c;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && b.length == 1 && b[0] instanceof List) {
                final List list = (List)b[0];
                for (int size = list.size(), i = 0; i < size; ++i) {
                    if (this.c.contains(list.get(i))) {
                        return this.b = list.get(i);
                    }
                }
                return this.b = this.c.get(0);
            }
            if ((name.equals("protocolSelected") || name.equals("selected")) && b.length == 1) {
                this.b = (String)b[0];
                return null;
            }
            return method.invoke(this, b);
        }
    }
}
