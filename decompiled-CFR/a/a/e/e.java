/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.e;

import a.a.c;
import b.f;
import java.io.IOException;

public final class e {
    static final f a;
    static final String[] b;
    static final String[] c;
    private static final String[] d;

    static {
        StringBuilder stringBuilder;
        int n2;
        String[] arrstring;
        int n3;
        a = f.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        d = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        b = new String[64];
        c = new String[256];
        int n4 = 0;
        for (n3 = 0; n3 < c.length; ++n3) {
            e.c[n3] = c.a("%8s", new Object[]{Integer.toBinaryString(n3)}).replace(' ', '0');
        }
        e.b[0] = "";
        e.b[1] = "END_STREAM";
        int[] arrn = new int[]{1};
        e.b[8] = "PADDED";
        for (n3 = 0; n3 <= 0; ++n3) {
            n2 = arrn[n3];
            arrstring = b;
            stringBuilder = new StringBuilder();
            stringBuilder.append(b[n2]);
            stringBuilder.append("|PADDED");
            arrstring[n2 | 8] = stringBuilder.toString();
        }
        e.b[4] = "END_HEADERS";
        e.b[32] = "PRIORITY";
        e.b[36] = "END_HEADERS|PRIORITY";
        n3 = 0;
        do {
            n2 = n4;
            if (n3 >= 3) break;
            int n5 = new int[]{4, 32, 36}[n3];
            for (n2 = 0; n2 <= 0; ++n2) {
                int n6 = arrn[n2];
                arrstring = b;
                int n7 = n6 | n5;
                stringBuilder = new StringBuilder();
                stringBuilder.append(b[n6]);
                stringBuilder.append('|');
                stringBuilder.append(b[n5]);
                arrstring[n7] = stringBuilder.toString();
                arrstring = b;
                stringBuilder = new StringBuilder();
                stringBuilder.append(b[n6]);
                stringBuilder.append('|');
                stringBuilder.append(b[n5]);
                stringBuilder.append("|PADDED");
                arrstring[n7 | 8] = stringBuilder.toString();
            }
            ++n3;
        } while (true);
        while (n2 < b.length) {
            if (b[n2] == null) {
                e.b[n2] = c[n2];
            }
            ++n2;
        }
    }

    private e() {
    }

    static IllegalArgumentException a(String string, Object ... arrobject) {
        throw new IllegalArgumentException(c.a(string, arrobject));
    }

    static String a(boolean bl, int n2, int n3, byte by, byte by2) {
        String string;
        String string2;
        block8 : {
            block7 : {
                string = by < d.length ? d[by] : c.a("0x%02x", new Object[]{by});
                if (by2 != 0) break block7;
                string2 = "";
                break block8;
            }
            switch (by) {
                default: {
                    string2 = by2 < b.length ? b[by2] : c[by2];
                }
                case 4: 
                case 6: {
                    string2 = by2 == 1 ? "ACK" : c[by2];
                    break block8;
                }
                case 2: 
                case 3: 
                case 7: 
                case 8: {
                    string2 = c[by2];
                    break block8;
                }
            }
            if (by == 5 && (by2 & 4) != 0) {
                string2 = string2.replace("HEADERS", "PUSH_PROMISE");
            } else if (by == 0 && (by2 & 32) != 0) {
                string2 = string2.replace("PRIORITY", "COMPRESSED");
            }
        }
        String string3 = bl ? "<<" : ">>";
        return c.a("%s 0x%08x %5d %-13s %s", new Object[]{string3, n2, n3, string, string2});
    }

    static IOException b(String string, Object ... arrobject) {
        throw new IOException(c.a(string, arrobject));
    }
}

