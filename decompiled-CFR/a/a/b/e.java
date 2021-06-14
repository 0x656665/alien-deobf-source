/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.b;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class e
extends RuntimeException {
    private static final Method b;
    public IOException a;

    static {
        Method method;
        block2 : {
            try {
                method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
                break block2;
            }
            catch (Exception exception) {}
            method = null;
        }
        b = method;
    }

    public e(IOException iOException) {
        super(iOException);
        this.a = iOException;
    }

    static void a(IOException iOException, IOException iOException2) {
        if (b == null) return;
        try {
            b.invoke(iOException, iOException2);
            return;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return;
        }
    }
}

