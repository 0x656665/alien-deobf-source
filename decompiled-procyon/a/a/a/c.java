package a.a.a;

import java.util.*;
import a.a.c.*;
import a.*;

public final class c
{
    public final x a;
    public final z b;
    
    c(final x a, final z b) {
        super();
        this.a = a;
        this.b = b;
    }
    
    public static boolean a(final z z, final x x) {
        switch (z.c) {
            default: {
                return false;
            }
            case 302:
            case 307: {
                if (z.decrypt_str("Expires") == null && z.b().e == -1 && !z.b().g && !z.b().f) {
                    return false;
                }
                return !z.b().d && !x.b().d;
            }
            case 200:
            case 203:
            case 204:
            case 300:
            case 301:
            case 308:
            case 404:
            case 405:
            case 410:
            case 414:
            case 501: {
                return !z.b().d && !x.b().d;
            }
        }
    }
    
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
}
