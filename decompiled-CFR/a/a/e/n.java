/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.e;

public final class n {
    int a;
    final int[] b = new int[10];

    final int a() {
        if ((this.a & 2) == 0) return -1;
        return this.b[1];
    }

    final n a(int n2, int n3) {
        if (n2 >= this.b.length) {
            return this;
        }
        this.a = 1 << n2 | this.a;
        this.b[n2] = n3;
        return this;
    }

    final boolean a(int n2) {
        if ((1 << n2 & this.a) == 0) return false;
        return true;
    }

    public final int b() {
        if ((this.a & 128) == 0) return 65535;
        return this.b[7];
    }
}

