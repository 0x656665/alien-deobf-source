package a.a.a;

import java.util.*;
import a.a.c.*;
import a.*;

public static final class a
{
    final long a;
    final x b;
    final z c;
    Date d;
    String e;
    Date f;
    String g;
    Date h;
    long i;
    long j;
    String k;
    int l;
    
    public a(final long a, final x b, final z c) {
        super();
        this.l = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        if (c != null) {
            this.i = c.k;
            this.j = c.l;
            final q f = c.f;
            for (int i = 0; i < f.a.length / 2; ++i) {
                final String a2 = f.a(i);
                final String b2 = f.b(i);
                if ("Date".equalsIgnoreCase(a2)) {
                    this.d = d.a(b2);
                    this.e = b2;
                }
                else if ("Expires".equalsIgnoreCase(a2)) {
                    this.h = d.a(b2);
                }
                else if ("Last-Modified".equalsIgnoreCase(a2)) {
                    this.f = d.a(b2);
                    this.g = b2;
                }
                else if ("ETag".equalsIgnoreCase(a2)) {
                    this.k = b2;
                }
                else if ("Age".equalsIgnoreCase(a2)) {
                    this.l = e.b(b2, -1);
                }
            }
        }
    }
}
