/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.g;

import a.a.g.e;
import a.v;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

final class c
extends e {
    private final Method a;
    private final Method b;
    private final Method d;
    private final Class<?> e;
    private final Class<?> f;

    private c(Method method, Method method2, Method method3, Class<?> class_, Class<?> class_2) {
        this.a = method;
        this.b = method2;
        this.d = method3;
        this.e = class_;
        this.f = class_2;
    }

    public static e a() {
        try {
            Class<?> class_ = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Serializable serializable = new StringBuilder();
            serializable.append("org.eclipse.jetty.alpn.ALPN");
            serializable.append("$Provider");
            serializable = Class.forName(serializable.toString());
            Serializable serializable2 = new StringBuilder();
            serializable2.append("org.eclipse.jetty.alpn.ALPN");
            serializable2.append("$ClientProvider");
            serializable2 = Class.forName(serializable2.toString());
            Serializable serializable3 = new StringBuilder();
            serializable3.append("org.eclipse.jetty.alpn.ALPN");
            serializable3.append("$ServerProvider");
            serializable3 = Class.forName(serializable3.toString());
            return new c(class_.getMethod("put", new Class[]{SSLSocket.class, serializable}), class_.getMethod("get", SSLSocket.class), class_.getMethod("remove", SSLSocket.class), (Class<?>)serializable2, (Class<?>)serializable3);
        }
        catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
            return null;
        }
    }

    @Override
    public final String a(SSLSocket object) {
        try {
            object = (a)Proxy.getInvocationHandler(this.b.invoke(null, object));
            if (!((a)object).a && ((a)object).b == null) {
                e.c.a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (!((a)object).a) return ((a)object).b;
            return null;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            throw new AssertionError();
        }
    }

    @Override
    public final void a(SSLSocket sSLSocket, String object, List<v> object2) {
        Object object3 = c.a(object2);
        try {
            object = e.class.getClassLoader();
            object2 = this.e;
            Class<?> class_ = this.f;
            object3 = new a((List<String>)object3);
            object = Proxy.newProxyInstance((ClassLoader)object, new Class[]{object2, class_}, (InvocationHandler)object3);
            this.a.invoke(null, sSLSocket, object);
            return;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            throw new AssertionError(reflectiveOperationException);
        }
    }

    @Override
    public final void b(SSLSocket sSLSocket) {
        try {
            this.d.invoke(null, sSLSocket);
            return;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            throw new AssertionError();
        }
    }

    static final class a
    implements InvocationHandler {
        boolean a;
        String b;
        private final List<String> c;

        public a(List<String> list) {
            this.c = list;
        }

        @Override
        public final Object invoke(Object object, Method method, Object[] arrobject) {
            String string = method.getName();
            Class<?> class_ = method.getReturnType();
            object = arrobject;
            if (arrobject == null) {
                object = a.a.c.b;
            }
            if (string.equals("supports") && Boolean.TYPE == class_) {
                return Boolean.TRUE;
            }
            if (string.equals("unsupported") && Void.TYPE == class_) {
                this.a = true;
                return null;
            }
            if (string.equals("protocols") && ((Object[])object).length == 0) {
                return this.c;
            }
            if (!string.equals("selectProtocol") && !string.equals("select") || String.class != class_ || ((Object[])object).length != 1 || !(object[0] instanceof List)) {
                if (!string.equals("protocolSelected")) {
                    if (!string.equals("selected")) return method.invoke(this, (Object[])object);
                }
                if (((Object[])object).length != 1) return method.invoke(this, (Object[])object);
                this.b = (String)object[0];
                return null;
            }
            object = (List)object[0];
            int n2 = object.size();
            int n3 = 0;
            do {
                if (n3 >= n2) {
                    this.b = object = this.c.get(0);
                    return object;
                }
                if (this.c.contains(object.get(n3))) {
                    this.b = object = (String)object.get(n3);
                    return object;
                }
                ++n3;
            } while (true);
        }
    }

}

