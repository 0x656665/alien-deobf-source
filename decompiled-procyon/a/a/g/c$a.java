package a.a.g;

import java.util.*;
import java.lang.reflect.*;
import a.a.*;

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
