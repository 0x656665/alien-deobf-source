/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import java.io.IOException;

public enum v {
    a("http/1.0"),
    b("http/1.1"),
    c("spdy/3.1"),
    d("h2");
    
    private final String e;

    private v(String string2) {
        this.e = string2;
    }

    public static v a(String string) {
        if (string.equals(v.a.e)) {
            return a;
        }
        if (string.equals(v.b.e)) {
            return b;
        }
        if (string.equals(v.d.e)) {
            return d;
        }
        if (!string.equals(v.c.e)) throw new IOException("Unexpected protocol: ".concat(String.valueOf(string)));
        return c;
    }

    public final String toString() {
        return this.e;
    }
}

