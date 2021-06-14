/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.c;

public final class f {
    public static boolean a(String string) {
        if (string.equals("POST")) return true;
        if (string.equals("PUT")) return true;
        if (string.equals("PATCH")) return true;
        if (string.equals("PROPPATCH")) return true;
        if (!string.equals("REPORT")) return false;
        return true;
    }

    public static boolean b(String string) {
        if (f.a(string)) return true;
        if (string.equals("OPTIONS")) return true;
        if (string.equals("DELETE")) return true;
        if (string.equals("PROPFIND")) return true;
        if (string.equals("MKCOL")) return true;
        if (!string.equals("LOCK")) return false;
        return true;
    }
}

