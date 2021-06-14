package a.a.b;

import java.io.*;
import java.lang.reflect.*;

public final class e extends RuntimeException
{
    private static final Method b;
    public IOException a;
    
    static {
    Label_0020_Outer:
        while (true) {
            while (true) {
                try {
                    Method declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
                    while (true) {
                        b = declaredMethod;
                        return;
                        declaredMethod = null;
                        continue Label_0020_Outer;
                    }
                }
                catch (Exception ex) {}
                continue;
            }
        }
    }
    
    public e(final IOException a) {
        super(a);
        this.a = a;
    }
    
    static void a(final IOException ex, final IOException ex2) {
        if (e.b == null) {
            return;
        }
        try {
            e.b.invoke(ex, ex2);
        }
        catch (InvocationTargetException | IllegalAccessException ex3) {}
    }
}
