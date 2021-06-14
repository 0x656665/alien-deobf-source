/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.c;

import a.v;
import java.net.ProtocolException;

public final class k {
    public final v a;
    public final int b;
    public final String c;

    private k(v v2, int n2, String string) {
        this.a = v2;
        this.b = n2;
        this.c = string;
    }

    public static k a(String string) {
        String string2;
        int n2;
        v v2;
        boolean bl = string.startsWith("HTTP/1.");
        int n3 = 9;
        if (bl) {
            if (string.length() < 9) throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(string)));
            if (string.charAt(8) != ' ') throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(string)));
            n2 = string.charAt(7) - 48;
            if (n2 == 0) {
                v2 = v.a;
            } else {
                if (n2 != 1) throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(string)));
                v2 = v.b;
            }
        } else {
            if (!string.startsWith("ICY ")) throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(string)));
            v2 = v.a;
            n3 = 4;
        }
        int n4 = string.length();
        n2 = n3 + 3;
        if (n4 < n2) throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(string)));
        try {
            n4 = Integer.parseInt(string.substring(n3, n2));
            string2 = "";
        }
        catch (NumberFormatException numberFormatException) {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(string)));
        }
        if (string.length() <= n2) return new k(v2, n4, string2);
        if (string.charAt(n2) != ' ') throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(string)));
        string2 = string.substring(n3 + 4);
        return new k(v2, n4, string2);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = this.a == v.a ? "HTTP/1.0" : "HTTP/1.1";
        stringBuilder.append(string);
        stringBuilder.append(' ');
        stringBuilder.append(this.b);
        if (this.c == null) return stringBuilder.toString();
        stringBuilder.append(' ');
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

