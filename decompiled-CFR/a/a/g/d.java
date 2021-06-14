/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.g;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class d<T> {
    private final Class<?> a;
    private final String b;
    private final Class[] c;

    public d(Class<?> class_, String string, Class ... arrclass) {
        this.a = class_;
        this.b = string;
        this.c = arrclass;
    }

    private Method a(Class<?> class_) {
        String string = this.b;
        Method method = null;
        if (string == null) return method;
        method = d.a(class_, this.b, this.c);
        if (method == null) return method;
        if (this.a == null) return method;
        if (this.a.isAssignableFrom(method.getReturnType())) return method;
        return null;
    }

    private static Method a(Class<?> genericDeclaration, String string, Class[] arrclass) {
        try {
            genericDeclaration = ((Class)genericDeclaration).getMethod(string, arrclass);
        }
        catch (NoSuchMethodException noSuchMethodException) {}
        try {
            int n2 = ((Method)genericDeclaration).getModifiers();
            if ((n2 & 1) != 0) return genericDeclaration;
            return null;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return genericDeclaration;
        }
        return null;
    }

    private Object c(T object, Object ... arrobject) {
        Method method = this.a(object.getClass());
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(object, arrobject);
        }
        catch (IllegalAccessException illegalAccessException) {
            return null;
        }
    }

    private Object d(T object, Object ... object2) {
        Method method = this.a(object.getClass());
        if (method == null) {
            object2 = new StringBuilder("Method ");
            ((StringBuilder)object2).append(this.b);
            ((StringBuilder)object2).append(" not supported for object ");
            ((StringBuilder)object2).append(object);
            throw new AssertionError((Object)((StringBuilder)object2).toString());
        }
        try {
            return method.invoke(object, (Object[])object2);
        }
        catch (IllegalAccessException illegalAccessException) {
            object2 = new AssertionError((Object)"Unexpectedly could not call: ".concat(String.valueOf(method)));
            ((Throwable)object2).initCause(illegalAccessException);
            throw object2;
        }
    }

    public final Object a(T object, Object ... object2) {
        try {
            return this.c(object, (Object[])object2);
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getTargetException();
            if (throwable instanceof RuntimeException) {
                throw (RuntimeException)throwable;
            }
            object2 = new AssertionError((Object)"Unexpected exception");
            ((Throwable)object2).initCause(throwable);
            throw object2;
        }
    }

    public final boolean a(T t2) {
        if (this.a(t2.getClass()) == null) return false;
        return true;
    }

    public final Object b(T object, Object ... object2) {
        try {
            return this.d(object, (Object[])object2);
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getTargetException();
            if (throwable instanceof RuntimeException) {
                throw (RuntimeException)throwable;
            }
            object2 = new AssertionError((Object)"Unexpected exception");
            ((Throwable)object2).initCause(throwable);
            throw object2;
        }
    }
}

