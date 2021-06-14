package a.a.b;

import a.*;
import java.util.*;

public final class d
{
    private final Set<ab> a;
    
    public d() {
        super();
        this.a = new LinkedHashSet<ab>();
    }
    
    public final void a(final ab ab) {
        synchronized (this) {
            this.a.add(ab);
        }
    }
    
    public final void b(final ab ab) {
        synchronized (this) {
            this.a.remove(ab);
        }
    }
    
    public final boolean c(final ab ab) {
        synchronized (this) {
            return this.a.contains(ab);
        }
    }
}
