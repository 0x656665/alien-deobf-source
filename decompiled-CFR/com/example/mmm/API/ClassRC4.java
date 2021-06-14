/*
 * Decompiled with CFR <Could not determine version>.
 */
package com.example.mmm.API;

public final class ClassRC4 {
    private int[] raising$;
    private int choose$ = 0;
    private int passed$ = 0;

    public ClassRC4(byte[] arrby) {
        this.raising$ = ClassRC4._constant(arrby);
    }

    private static int[] _constant(byte[] arrby) {
        int[] arrn = new int[256];
        boolean bl = false;
        int n2 = 0;
        do {
            arrn[n2] = n2;
            ++n2;
        } while (true);
    }

    public final byte[] _nevada(byte[] arrby) {
        return this._liver(arrby);
    }

    public final byte[] _liver(byte[] arrby) {
        byte[] arrby2 = new byte[arrby.length];
        int n2 = 0;
        while (n2 < arrby.length) {
            this.choose$ = (this.choose$ + 1) % 256;
            this.passed$ = (this.passed$ + this.raising$[this.choose$]) % 256;
            int[] arrn = this.raising$;
            int n3 = this.passed$;
            int n4 = this.choose$;
            int n5 = arrn[n4];
            arrn[n4] = arrn[n3];
            arrn[n3] = n5;
            arrby2[n2] = (byte)(this.raising$[(this.raising$[this.choose$] + this.raising$[this.passed$]) % 256] ^ arrby[n2]);
            ++n2;
        }
        return arrby2;
    }
}

