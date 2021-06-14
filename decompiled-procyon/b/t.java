package b;

import java.nio.charset.*;

final class t
{
    public static final Charset a;
    
    static {
        a = Charset.forName("UTF-8");
    }
    
    public static int a(final int n) {
        return (n & 0xFF) << 24 | ((0xFF000000 & n) >>> 24 | (0xFF0000 & n) >>> 8 | (0xFF00 & n) << 8);
    }
    
    public static short a(final short n) {
        final int n2 = n & 0xFFFF;
        return (short)((n2 & 0xFF) << 8 | (0xFF00 & n2) >>> 8);
    }
    
    public static void a(final long n, final long n2, final long n3) {
        if ((n2 | n3) >= 0L && n2 <= n && n - n2 >= n3) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", n, n2, n3));
    }
    
    public static void a(final Throwable t) {
        throw t;
    }
    
    public static boolean a(final byte[] array, final int n, final byte[] array2, final int n2, final int n3) {
        for (int i = 0; i < n3; ++i) {
            if (array[i + n] != array2[i + n2]) {
                return false;
            }
        }
        return true;
    }
}
