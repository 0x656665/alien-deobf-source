/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.e;

import java.util.concurrent.CountDownLatch;

final class l {
    final CountDownLatch a = new CountDownLatch(1);
    long b = -1L;
    long c = -1L;

    l() {
    }

    final void a() {
        if (this.c != -1L) throw new IllegalStateException();
        if (this.b == -1L) throw new IllegalStateException();
        this.c = this.b - 1L;
        this.a.countDown();
    }
}

