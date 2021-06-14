/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a;

import a.a.c;

public abstract class b
implements Runnable {
    protected final String b;

    public b(String string, Object ... arrobject) {
        this.b = c.a(string, arrobject);
    }

    protected abstract void blockBack2();

    @Override
    public final void run() {
        String string = Thread.currentThread().getName();
        Thread.currentThread().setName(this.b);
        try {
            this.blockBack2();
            return;
        }
        finally {
            Thread.currentThread().setName(string);
        }
    }
}

