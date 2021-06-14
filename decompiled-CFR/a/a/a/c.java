/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.a;

import a.a.c.e;
import a.d;
import a.q;
import a.x;
import a.z;
import java.util.Date;

public final class c {
    public final x a;
    public final z b;

    c(x x2, z z2) {
        this.a = x2;
        this.b = z2;
    }

    public static boolean a(z z2, x x2) {
        switch (z2.c) {
            default: {
                return false;
            }
            case 302: 
            case 307: {
                if (z2.decrypt_str("Expires") != null || z2.b().e != -1 || z2.b().g || z2.b().f) break;
                return false;
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
            case 501: 
        }
        if (z2.b().d) return false;
        if (x2.b().d) return false;
        return true;
    }

    public static final class a {
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
        int l = -1;

        public a(long l2, x object, z object2) {
            this.a = l2;
            this.b = object;
            this.c = object2;
            if (object2 == null) return;
            this.i = ((z)object2).k;
            this.j = ((z)object2).l;
            object = ((z)object2).f;
            int n2 = 0;
            int n3 = ((q)object).a.length / 2;
            while (n2 < n3) {
                object2 = ((q)object).a(n2);
                String string = ((q)object).b(n2);
                if ("Date".equalsIgnoreCase((String)object2)) {
                    this.d = a.a.c.d.a(string);
                    this.e = string;
                } else if ("Expires".equalsIgnoreCase((String)object2)) {
                    this.h = a.a.c.d.a(string);
                } else if ("Last-Modified".equalsIgnoreCase((String)object2)) {
                    this.f = a.a.c.d.a(string);
                    this.g = string;
                } else if ("ETag".equalsIgnoreCase((String)object2)) {
                    this.k = string;
                } else if ("Age".equalsIgnoreCase((String)object2)) {
                    this.l = e.b(string, -1);
                }
                ++n2;
            }
        }
    }

}

