/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.e;

public enum b {
    a(0),
    b(1),
    c(2),
    d(3),
    e(7),
    f(8);
    
    public final int g;

    private b(int n3) {
        this.g = n3;
    }

    public static b a(int n2) {
        b[] arrb = b.values();
        int n3 = arrb.length;
        int n4 = 0;
        while (n4 < n3) {
            b b2 = arrb[n4];
            if (b2.g == n2) {
                return b2;
            }
            ++n4;
        }
        return null;
    }
}

