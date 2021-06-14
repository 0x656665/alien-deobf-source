package a.a.e;

import b.*;
import a.a.*;
import java.io.*;

public final class e
{
    static final f a;
    static final String[] b;
    static final String[] c;
    private static final String[] d;
    
    static {
        a = f.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        d = new String[] { "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION" };
        b = new String[64];
        c = new String[256];
        final int n = 0;
        for (int i = 0; i < e.c.length; ++i) {
            e.c[i] = a.a.c.a("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        e.b[0] = "";
        e.b[1] = "END_STREAM";
        final int[] array = { 1 };
        e.b[8] = "PADDED";
        for (int j = 0; j <= 0; ++j) {
            final int n2 = array[j];
            final String[] b2 = e.b;
            final StringBuilder sb = new StringBuilder();
            sb.append(e.b[n2]);
            sb.append("|PADDED");
            b2[n2 | 0x8] = sb.toString();
        }
        e.b[4] = "END_HEADERS";
        e.b[32] = "PRIORITY";
        e.b[36] = "END_HEADERS|PRIORITY";
        int n3 = 0;
        int k;
        while (true) {
            k = n;
            if (n3 >= 3) {
                break;
            }
            final int n4 = (new int[] { 4, 32, 36 })[n3];
            for (int l = 0; l <= 0; ++l) {
                final int n5 = array[l];
                final String[] b3 = e.b;
                final int n6 = n5 | n4;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(e.b[n5]);
                sb2.append('|');
                sb2.append(e.b[n4]);
                b3[n6] = sb2.toString();
                final String[] b4 = e.b;
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(e.b[n5]);
                sb3.append('|');
                sb3.append(e.b[n4]);
                sb3.append("|PADDED");
                b4[n6 | 0x8] = sb3.toString();
            }
            ++n3;
        }
        while (k < e.b.length) {
            if (e.b[k] == null) {
                e.b[k] = e.c[k];
            }
            ++k;
        }
    }
    
    private e() {
        super();
    }
    
    static IllegalArgumentException a(final String s, final Object... array) {
        throw new IllegalArgumentException(a.a.c.a(s, array));
    }
    
    static String a(final boolean b, final int n, final int n2, final byte b2, final byte b3) {
        String a;
        if (b2 < e.d.length) {
            a = e.d[b2];
        }
        else {
            a = a.a.c.a("0x%02x", b2);
        }
        String s = null;
        if (b3 == 0) {
            s = "";
        }
        else {
            switch (b2) {
                default: {
                    if (b3 < e.b.length) {
                        s = e.b[b3];
                    }
                    else {
                        s = e.c[b3];
                    }
                    if (b2 == 5 && (b3 & 0x4) != 0x0) {
                        s = s.replace("HEADERS", "PUSH_PROMISE");
                        break;
                    }
                    if (b2 == 0 && (b3 & 0x20) != 0x0) {
                        s = s.replace("PRIORITY", "COMPRESSED");
                        break;
                    }
                    break;
                }
                case 4:
                case 6: {
                    if (b3 == 1) {
                        s = "ACK";
                        break;
                    }
                    s = e.c[b3];
                    break;
                }
                case 2:
                case 3:
                case 7:
                case 8: {
                    s = e.c[b3];
                    break;
                }
            }
        }
        String s2;
        if (b) {
            s2 = "<<";
        }
        else {
            s2 = ">>";
        }
        return a.a.c.a("%s 0x%08x %5d %-13s %s", s2, n, n2, a, s);
    }
    
    static IOException b(final String s, final Object... array) {
        throw new IOException(a.a.c.a(s, array));
    }
}
