package a.a.g;

import java.lang.reflect.*;

static final class b
{
    private final Method a;
    private final Method b;
    private final Method c;
    
    private b(final Method a, final Method b, final Method c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    static b a() {
        Method method = null;
        while (true) {
            try {
                final Class<?> forName = Class.forName("dalvik.system.CloseGuard");
                final Method method2 = forName.getMethod("get", (Class<?>[])new Class[0]);
                Method method3 = forName.getMethod("open", String.class);
                Method method4 = forName.getMethod("warnIfOpen", (Class<?>[])new Class[0]);
                method = method2;
                return new b(method, method3, method4);
                method4 = (method3 = null);
                return new b(method, method3, method4);
            }
            catch (Exception ex) {}
            continue;
        }
    }
    
    final Object a(final String s) {
        Label_0039: {
            if (this.a == null) {
                break Label_0039;
            }
            try {
                final Object invoke = this.a.invoke(null, new Object[0]);
                this.b.invoke(invoke, s);
                return invoke;
                return null;
            }
            catch (Exception ex) {
                return null;
            }
        }
    }
    
    final boolean a(final Object o) {
        boolean b = false;
        if (o == null) {
            return b;
        }
        try {
            this.c.invoke(o, new Object[0]);
            b = true;
            return b;
        }
        catch (Exception ex) {
            return false;
        }
    }
}
