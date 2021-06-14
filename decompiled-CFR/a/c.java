/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.a.d;
import a.a.a.e;
import java.io.Closeable;
import java.io.Flushable;

public final class c
implements Closeable,
Flushable {
    final e a;
    final d b;

    @Override
    public final void close() {
        this.b.close();
    }

    @Override
    public final void flush() {
        this.b.flush();
    }
}

