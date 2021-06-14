/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.b;

import a.ab;
import java.util.LinkedHashSet;
import java.util.Set;

public final class d {
    private final Set<ab> a = new LinkedHashSet<ab>();

    public final void a(ab ab2) {
        synchronized (this) {
            this.a.add(ab2);
            return;
        }
    }

    public final void b(ab ab2) {
        synchronized (this) {
            this.a.remove(ab2);
            return;
        }
    }

    public final boolean c(ab ab2) {
        synchronized (this) {
            return this.a.contains(ab2);
        }
    }
}

