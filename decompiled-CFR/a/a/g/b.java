/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.g;

import a.a.g.e;
import a.v;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

final class b
extends e {
    final Method a;
    final Method b;

    private b(Method method, Method method2) {
        this.a = method;
        this.b = method2;
    }

    public static b a() {
        try {
            return new b(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    @Override
    public final String a(SSLSocket object) {
        try {
            object = (String)this.b.invoke(object, new Object[0]);
            if (object == null) return null;
            boolean bl = ((String)object).equals("");
            if (!bl) return object;
            return null;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            throw new AssertionError();
        }
    }

    @Override
    public final void a(SSLSocket sSLSocket, String object, List<v> list) {
        try {
            object = sSLSocket.getSSLParameters();
            list = b.a(list);
            this.a.invoke(object, new Object[]{list.toArray(new String[list.size()])});
            sSLSocket.setSSLParameters((SSLParameters)object);
            return;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            throw new AssertionError();
        }
    }
}

