/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import java.nio.charset.Charset;

final class t {
    public static final Charset a = Charset.forName("UTF-8");

    public static int a(int n2) {
        return (n2 & 255) << 24 | ((-16777216 & n2) >>> 24 | (16711680 & n2) >>> 8 | (65280 & n2) << 8);
    }

    public static short a(short s2) {
        s2 = (short)(s2 & 65535);
        return (short)((s2 & 255) << 8 | (65280 & s2) >>> 8);
    }

    public static void a(long l2, long l3, long l4) {
        if ((l3 | l4) < 0L || l3 > l2 || l2 - l3 < l4) throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", l2, l3, l4));
    }

    public static void a(Throwable throwable) {
        throw throwable;
    }

    public static boolean a(byte[] arrby, int n2, byte[] arrby2, int n3, int n4) {
        int n5 = 0;
        while (n5 < n4) {
            if (arrby[n5 + n2] != arrby2[n5 + n3]) {
                return false;
            }
            ++n5;
        }
        return true;
    }
}

