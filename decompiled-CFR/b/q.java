/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import b.c;
import b.s;
import java.io.Closeable;
import java.io.Flushable;

public interface q
extends Closeable,
Flushable {
    public s a();

    public void a_(c var1, long var2);

    @Override
    public void close();

    @Override
    public void flush();
}

