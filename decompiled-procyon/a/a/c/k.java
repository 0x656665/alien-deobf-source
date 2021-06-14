package a.a.c;

import a.*;
import java.net.*;

public final class k
{
    public final v a;
    public final int b;
    public final String c;
    
    private k(final v a, final int b, final String c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static k a(final String s) {
        final boolean startsWith = s.startsWith("HTTP/1.");
        int n = 9;
        while (true) {
            while (true) {
                Label_0243: {
                    v v;
                    if (startsWith) {
                        if (s.length() < 9 || s.charAt(8) != ' ') {
                            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(s)));
                        }
                        final int n2 = s.charAt(7) - '0';
                        if (n2 == 0) {
                            v = a.v.a;
                            break Label_0243;
                        }
                        if (n2 == 1) {
                            v = a.v.b;
                            break Label_0243;
                        }
                        throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(s)));
                    }
                    else {
                        if (s.startsWith("ICY ")) {
                            v = a.v.a;
                            n = 4;
                            break Label_0243;
                        }
                        break Label_0243;
                    }
                    while (true) {
                        while (true) {
                            try {
                                final int n3;
                                final int \u0131nt = Integer.parseInt(s.substring(n, n3));
                                String substring = "";
                                if (s.length() > n3) {
                                    if (s.charAt(n3) != ' ') {
                                        throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(s)));
                                    }
                                    substring = s.substring(n + 4);
                                }
                                return new k(v, \u0131nt, substring);
                                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(s)));
                                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(s)));
                                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(s)));
                            }
                            catch (NumberFormatException ex) {}
                            continue;
                        }
                    }
                }
                final int length = s.length();
                final int n3 = n + 3;
                if (length >= n3) {
                    continue;
                }
                break;
            }
            continue;
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        String s;
        if (this.a == v.a) {
            s = "HTTP/1.0";
        }
        else {
            s = "HTTP/1.1";
        }
        sb.append(s);
        sb.append(' ');
        sb.append(this.b);
        if (this.c != null) {
            sb.append(' ');
            sb.append(this.c);
        }
        return sb.toString();
    }
}
