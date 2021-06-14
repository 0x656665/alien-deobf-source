/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import java.io.UnsupportedEncodingException;

final class b {
    private static final byte[] a = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] b = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    public static String a(byte[] arrby) {
        return b.a(arrby, a);
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    private static String a(byte[] var0, byte[] var1_2) {
        var8_4 = new byte[(var0 /* !! */ .length + 2) / 3 * 4];
        var4_5 = var0 /* !! */ .length - var0 /* !! */ .length % 3;
        var3_7 = 0;
        for (var2_6 = 0; var2_6 < var4_5; var2_6 += 3) {
            var5_8 = var3_7 + 1;
            var8_4[var3_7] = var1_3[(var0 /* !! */ [var2_6] & 255) >> 2];
            var3_7 = var5_8 + 1;
            var7_10 = var0 /* !! */ [var2_6];
            var6_9 = var2_6 + 1;
            var8_4[var5_8] = var1_3[(var7_10 & 3) << 4 | (var0 /* !! */ [var6_9] & 255) >> 4];
            var5_8 = var3_7 + 1;
            var7_10 = var0 /* !! */ [var6_9];
            var6_9 = var2_6 + 2;
            var8_4[var3_7] = var1_3[(var7_10 & 15) << 2 | (var0 /* !! */ [var6_9] & 255) >> 6];
            var3_7 = var5_8 + 1;
            var8_4[var5_8] = var1_3[var0 /* !! */ [var6_9] & 63];
        }
        switch (var0 /* !! */ .length % 3) {
            default: {
                ** break;
            }
            case 2: {
                var2_6 = var3_7 + 1;
                var8_4[var3_7] = var1_3[(var0 /* !! */ [var4_5] & 255) >> 2];
                var3_7 = var2_6 + 1;
                var5_8 = var0 /* !! */ [var4_5];
                var8_4[var2_6] = var1_3[(var5_8 & 3) << 4 | (var0 /* !! */ [++var4_5] & 255) >> 4];
                var8_4[var3_7] = var1_3[(var0 /* !! */ [var4_5] & 15) << 2];
                var8_4[var3_7 + 1] = 61;
                ** break;
            }
            case 1: 
        }
        var2_6 = var3_7 + 1;
        var8_4[var3_7] = var1_3[(var0 /* !! */ [var4_5] & 255) >> 2];
        var3_7 = var2_6 + 1;
        var8_4[var2_6] = var1_3[(var0 /* !! */ [var4_5] & 3) << 4];
        var8_4[var3_7] = 61;
        var8_4[var3_7 + 1] = 61;
lbl37: // 3 sources:
        try {
            return new String(var8_4, "US-ASCII");
        }
        catch (UnsupportedEncodingException var0_2) {
            throw new AssertionError(var0_2);
        }
    }
}

