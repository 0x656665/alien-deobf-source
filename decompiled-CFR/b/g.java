/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import b.c;
import b.r;
import b.s;

public abstract class g
implements r {
    private final r a;

    public g(r r2) {
        if (r2 == null) throw new IllegalArgumentException("delegate == null");
        this.a = r2;
    }

    @Override
    public final long a(c c2, long l2) {
        return this.a.a(c2, l2);
    }

    @Override
    public final s a() {
        return this.a.a();
    }

    @Override
    public void close() {
        this.a.close();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("(");
        stringBuilder.append(this.a.toString());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

