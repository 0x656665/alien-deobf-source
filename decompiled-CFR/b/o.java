/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import b.n;

final class o {
    static n a;
    static long b;

    private o() {
    }

    /*
     * Enabled unnecessary exception pruning
     */
    static n a() {
        synchronized (o.class) {
            if (a == null) return new n();
            n n2 = a;
            a = n2.f;
            n2.f = null;
            b -= 8192L;
            return n2;
        }
    }

    static void a(n n2) {
        if (n2.f != null) throw new IllegalArgumentException();
        if (n2.g != null) throw new IllegalArgumentException();
        if (n2.d) {
            return;
        }
        synchronized (o.class) {
            if (b + 8192L > 65536L) {
                return;
            }
            b += 8192L;
            n2.f = a;
            n2.c = 0;
            n2.b = 0;
            a = n2;
            return;
        }
    }
}

