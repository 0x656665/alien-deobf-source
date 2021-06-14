package a.a.g;

import java.lang.reflect.*;

final class d<T>
{
    private final Class<?> a;
    private final String b;
    private final Class[] c;
    
    public d(final Class<?> a, final String b, final Class... c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private Method a(final Class<?> clazz) {
        final String b = this.b;
        Method a = null;
        if (b != null) {
            a = a(clazz, this.b, this.c);
            if (a != null && this.a != null && !this.a.isAssignableFrom(a.getReturnType())) {
                return null;
            }
        }
        return a;
    }
    
    private static Method a(final Class<?> p0, final String p1, final Class[] p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: aload_2        
        //     3: \u0131nvokev\u0131rtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //     6: astore_0       
        //     7: aload_0        
        //     8: \u0131nvokev\u0131rtual   java/lang/reflect/Method.getModifiers:()I
        //    11: \u0131store_3       
        //    12: \u0131load_3        
        //    13: \u0131const_1       
        //    14: \u0131and           
        //    15: \u0131fne            20
        //    18: aconst_null    
        //    19: astore_0       
        //    20: aload_0        
        //    21: areturn        
        //    22: astore_0       
        //    23: goto            18
        //    26: astore_1       
        //    27: aload_0        
        //    28: areturn        
        //    Signature:
        //  (Ljava/lang/Class<*>;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      7      22     26     Ljava/lang/NoSuchMethodException;
        //  7      12     26     29     Ljava/lang/NoSuchMethodException;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private Object c(final T t, final Object... array) {
        final Method a = this.a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(t, array);
        }
        catch (IllegalAccessException ex) {
            return null;
        }
    }
    
    private Object d(final T t, final Object... array) {
        final Method a = this.a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, array);
            }
            catch (IllegalAccessException ex) {
                final AssertionError assertionError = new AssertionError((Object)"Unexpectedly could not call: ".concat(String.valueOf(a)));
                assertionError.initCause(ex);
                throw assertionError;
            }
        }
        final StringBuilder sb = new StringBuilder("Method ");
        sb.append(this.b);
        sb.append(" not supported for object ");
        sb.append(t);
        throw new AssertionError((Object)sb.toString());
    }
    
    public final Object a(final T t, final Object... array) {
        try {
            return this.c(t, array);
        }
        catch (InvocationTargetException ex) {
            final Throwable targetException = ex.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw (RuntimeException)targetException;
            }
            final AssertionError assertionError = new AssertionError((Object)"Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
    
    public final boolean a(final T t) {
        return this.a(t.getClass()) != null;
    }
    
    public final Object b(final T t, final Object... array) {
        try {
            return this.d(t, array);
        }
        catch (InvocationTargetException ex) {
            final Throwable targetException = ex.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw (RuntimeException)targetException;
            }
            final AssertionError assertionError = new AssertionError((Object)"Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
