package b;

import java.io.*;

final class b
{
    private static final byte[] a;
    private static final byte[] b;
    
    static {
        a = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        b = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
    }
    
    public static String a(final byte[] array) {
        return a(array, b.b.a);
    }
    
    private static String a(final byte[] array, final byte[] array2) {
        final byte[] array3 = new byte[(array.length + 2) / 3 * 4];
        final int n = array.length - array.length % 3;
        int i = 0;
        int n2 = 0;
        while (i < n) {
            final int n3 = n2 + 1;
            array3[n2] = array2[(array[i] & 0xFF) >> 2];
            final int n4 = n3 + 1;
            final byte b = array[i];
            final int n5 = i + 1;
            array3[n3] = array2[(b & 0x3) << 4 | (array[n5] & 0xFF) >> 4];
            final int n6 = n4 + 1;
            final byte b2 = array[n5];
            final int n7 = i + 2;
            array3[n4] = array2[(b2 & 0xF) << 2 | (array[n7] & 0xFF) >> 6];
            n2 = n6 + 1;
            array3[n6] = array2[array[n7] & 0x3F];
            i += 3;
        }
        switch (array.length % 3) {
            case 2: {
                final int n8 = n2 + 1;
                array3[n2] = array2[(array[n] & 0xFF) >> 2];
                final int n9 = n8 + 1;
                final byte b3 = array[n];
                final int n10 = n + 1;
                array3[n8] = array2[(b3 & 0x3) << 4 | (array[n10] & 0xFF) >> 4];
                array3[n9] = array2[(array[n10] & 0xF) << 2];
                array3[n9 + 1] = 61;
                break;
            }
            case 1: {
                final int n11 = n2 + 1;
                array3[n2] = array2[(array[n] & 0xFF) >> 2];
                final int n12 = n11 + 1;
                array3[n11] = array2[(array[n] & 0x3) << 4];
                array3[n12 + 1] = (array3[n12] = 61);
                break;
            }
        }
        try {
            return new String(array3, "US-ASCII");
        }
        catch (UnsupportedEncodingException ex) {
            throw new AssertionError((Object)ex);
        }
    }
}
