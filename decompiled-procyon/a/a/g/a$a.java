package a.a.g;

import a.a.h.*;
import java.util.*;
import java.security.cert.*;
import javax.net.ssl.*;
import java.lang.reflect.*;

static final class a extends b
{
    private final Object a;
    private final Method b;
    
    a(final Object a, final Method b) {
        super();
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final List<Certificate> a(final List<Certificate> list, final String s) {
        try {
            return (List<Certificate>)this.b.invoke(this.a, list.toArray(new X509Certificate[list.size()]), "RSA", s);
        }
        catch (IllegalAccessException ex) {
            throw new AssertionError((Object)ex);
        }
        catch (InvocationTargetException ex3) {
            final SSLPeerUnverifiedException ex2 = new SSLPeerUnverifiedException(ex3.getMessage());
            ex2.initCause(ex3);
            throw ex2;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof a;
    }
    
    @Override
    public final int hashCode() {
        return 0;
    }
}
