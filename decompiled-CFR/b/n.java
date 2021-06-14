/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

final class n {
    final byte[] a;
    int b;
    int c;
    boolean d;
    boolean e;
    n f;
    n g;

    n() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    n(n n2) {
        this(n2.a, n2.b, n2.c);
        n2.d = true;
    }

    n(byte[] arrby, int n2, int n3) {
        this.a = arrby;
        this.b = n2;
        this.c = n3;
        this.e = false;
        this.d = true;
    }

    public final n a() {
        n n2 = this.f != this ? this.f : null;
        this.g.f = this.f;
        this.f.g = this.g;
        this.f = null;
        this.g = null;
        return n2;
    }

    public final n a(n n2) {
        n2.g = this;
        n2.f = this.f;
        this.f.g = n2;
        this.f = n2;
        return n2;
    }

    public final void a(n n2, int n3) {
        if (!n2.e) throw new IllegalArgumentException();
        if (n2.c + n3 > 8192) {
            if (n2.d) throw new IllegalArgumentException();
            if (n2.c + n3 - n2.b > 8192) throw new IllegalArgumentException();
            System.arraycopy(n2.a, n2.b, n2.a, 0, n2.c - n2.b);
            n2.c -= n2.b;
            n2.b = 0;
        }
        System.arraycopy(this.a, this.b, n2.a, n2.c, n3);
        n2.c += n3;
        this.b += n3;
    }
}

