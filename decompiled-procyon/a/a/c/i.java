package a.a.c;

import a.*;

public final class i
{
    public static String a(final r r) {
        final String e = r.e();
        final String g = r.g();
        if (g != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append('?');
            sb.append(g);
            return sb.toString();
        }
        return e;
    }
}
