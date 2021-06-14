package a.a.a;

import java.util.concurrent.*;
import a.*;
import b.*;
import java.io.*;
import a.a.c.*;
import java.util.*;

public final class a implements s
{
    final e a;
    
    public a(final e a) {
        super();
        this.a = a;
    }
    
    private static q a(final q q, final q q2) {
        final q.a a = new q.a();
        final int n = q.a.length / 2;
        final int n2 = 0;
        for (int i = 0; i < n; ++i) {
            final String a2 = q.a(i);
            final String b = q.b(i);
            if ((!"Warning".equalsIgnoreCase(a2) || !b.startsWith("1")) && (!a(a2) || q2.a(a2) == null)) {
                a.a.a.a.a(a, a2, b);
            }
        }
        for (int n3 = q2.a.length / 2, j = n2; j < n3; ++j) {
            final String a3 = q2.a(j);
            if (!"Content-Length".equalsIgnoreCase(a3) && a(a3)) {
                a.a.a.a.a(a, a3, q2.b(j));
            }
        }
        return a.a();
    }
    
    private static z a(final z z) {
        if (z != null && z.g != null) {
            final z.a a = z.a();
            a.g = null;
            return a.a();
        }
        return z;
    }
    
    private static boolean a(final String s) {
        return !"Connection".equalsIgnoreCase(s) && !"Keep-Alive".equalsIgnoreCase(s) && !"Proxy-Authenticate".equalsIgnoreCase(s) && !"Proxy-Authorization".equalsIgnoreCase(s) && !"TE".equalsIgnoreCase(s) && !"Trailers".equalsIgnoreCase(s) && !"Transfer-Encoding".equalsIgnoreCase(s) && !"Upgrade".equalsIgnoreCase(s);
    }
    
    @Override
    public final z a(final s.a a) {
        Object o;
        if (this.a != null) {
            o = this.a.a();
        }
        else {
            o = null;
        }
        final c.a a2 = new c.a(System.currentTimeMillis(), a.a(), (z)o);
        c c = null;
        Label_0908: {
            if (a2.c == null) {
                c = new c(a2.b, null);
            }
            else if (a2.b.a.b() && a2.c.e == null) {
                c = new c(a2.b, null);
            }
            else if (!a.a.a.c.a(a2.c, a2.b)) {
                c = new c(a2.b, null);
            }
            else {
                final a.d b = a2.b.b();
                if (!b.c) {
                    final x b2 = a2.b;
                    if (b2.a("If-Modified-Since") == null && b2.a("If-None-Match") == null) {
                        final Date d = a2.d;
                        final long n = 0L;
                        long max;
                        if (d != null) {
                            max = Math.max(0L, a2.j - a2.d.getTime());
                        }
                        else {
                            max = 0L;
                        }
                        long max2 = max;
                        if (a2.l != -1) {
                            max2 = Math.max(max, TimeUnit.SECONDS.toMillis(a2.l));
                        }
                        final long n2 = max2 + (a2.j - a2.i) + (a2.a - a2.j);
                        final a.d b3 = a2.c.b();
                        long millis = 0L;
                        Label_0515: {
                            if (b3.e != -1) {
                                millis = TimeUnit.SECONDS.toMillis(b3.e);
                            }
                            else {
                                if (a2.h != null) {
                                    long n3;
                                    if (a2.d != null) {
                                        n3 = a2.d.getTime();
                                    }
                                    else {
                                        n3 = a2.j;
                                    }
                                    millis = a2.h.getTime() - n3;
                                    if (millis > 0L) {
                                        break Label_0515;
                                    }
                                }
                                else if (a2.f != null) {
                                    final r a3 = a2.c.a.a;
                                    String string;
                                    if (a3.d == null) {
                                        string = null;
                                    }
                                    else {
                                        final StringBuilder sb = new StringBuilder();
                                        r.b(sb, a3.d);
                                        string = sb.toString();
                                    }
                                    if (string == null) {
                                        long n4;
                                        if (a2.d != null) {
                                            n4 = a2.d.getTime();
                                        }
                                        else {
                                            n4 = a2.i;
                                        }
                                        final long n5 = n4 - a2.f.getTime();
                                        if (n5 > 0L) {
                                            millis = n5 / 10L;
                                            break Label_0515;
                                        }
                                    }
                                }
                                millis = 0L;
                            }
                        }
                        long min = millis;
                        if (b.e != -1) {
                            min = Math.min(millis, TimeUnit.SECONDS.toMillis(b.e));
                        }
                        long millis2;
                        if (b.j != -1) {
                            millis2 = TimeUnit.SECONDS.toMillis(b.j);
                        }
                        else {
                            millis2 = 0L;
                        }
                        final a.d b4 = a2.c.b();
                        long millis3 = n;
                        if (!b4.h) {
                            millis3 = n;
                            if (b.i != -1) {
                                millis3 = TimeUnit.SECONDS.toMillis(b.i);
                            }
                        }
                        if (!b4.c) {
                            final long n6 = millis2 + n2;
                            if (n6 < millis3 + min) {
                                final z.a a4 = a2.c.a();
                                if (n6 >= min) {
                                    a4.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (n2 > 86400000L && (a2.c.b().e == -1 && a2.h == null)) {
                                    a4.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                c = new c(null, a4.a());
                                break Label_0908;
                            }
                        }
                        String s;
                        String s2;
                        if (a2.k != null) {
                            s = "If-None-Match";
                            s2 = a2.k;
                        }
                        else if (a2.f != null) {
                            s = "If-Modified-Since";
                            s2 = a2.g;
                        }
                        else {
                            if (a2.d == null) {
                                c = new c(a2.b, null);
                                break Label_0908;
                            }
                            s = "If-Modified-Since";
                            s2 = a2.e;
                        }
                        final q.a a5 = a2.b.c.a();
                        a.a.a(a5, s, s2);
                        final x.a a6 = a2.b.a();
                        a6.c = a5.a().a();
                        c = new c(a6.a(), a2.c);
                        break Label_0908;
                    }
                }
                c = new c(a2.b, null);
            }
        }
        final b b5 = null;
        c c2 = c;
        if (c.a != null) {
            c2 = c;
            if (a2.b.b().k) {
                c2 = new c(null, null);
            }
        }
        final x a7 = c2.a;
        final z b6 = c2.b;
        if (o != null && b6 == null) {
            a.a.c.a(((z)o).g);
        }
        if (a7 == null && b6 == null) {
            final z.a a8 = new z.a();
            a8.a = a.a();
            a8.b = v.b;
            a8.c = 504;
            a8.d = "Unsatisfiable Request (only-if-cached)";
            a8.g = a.a.c.c;
            a8.k = -1L;
            a8.l = System.currentTimeMillis();
            return a8.a();
        }
        if (a7 == null) {
            return b6.a().b(a(b6)).a();
        }
        try {
            final z a9 = a.a(a7);
            if (a9 == null && o != null) {
                a.a.c.a(((z)o).g);
            }
            if (b6 != null) {
                if (a9.c == 304) {
                    final z.a a10 = b6.a().a(a(b6.f, a9.f));
                    a10.k = a9.k;
                    a10.l = a9.l;
                    final z a11 = a10.b(a(b6)).a(a(a9)).a();
                    a9.g.close();
                    return a11;
                }
                a.a.c.a(b6.g);
            }
            z z2;
            final z z = z2 = a9.a().b(a(b6)).a(a(a9)).a();
            if (a.a.c.e.b(z)) {
                final x a12 = a9.a;
                o = this.a;
                b b7;
                if (o == null) {
                    b7 = b5;
                }
                else if (!a.a.a.c.a(z, a12)) {
                    o = a12.b;
                    b7 = b5;
                    if (!((String)o).equals("POST")) {
                        b7 = b5;
                        if (!((String)o).equals("PATCH")) {
                            b7 = b5;
                            if (!((String)o).equals("PUT")) {
                                b7 = b5;
                                if (!((String)o).equals("DELETE")) {
                                    ((String)o).equals("MOVE");
                                    b7 = b5;
                                }
                            }
                        }
                    }
                }
                else {
                    b7 = ((e)o).b();
                }
                if (b7 == null) {
                    return z;
                }
                o = b7.a();
                if (o == null) {
                    return z;
                }
                final b.r r = new b.r() {
                    boolean a;
                    final /* synthetic */ b.e b = z.g.c();
                    final /* synthetic */ b c;
                    final /* synthetic */ d d = k.a((b.q)o);
                    final /* synthetic */ a e;
                    
                    a$1() {
                        this.e = e;
                        super();
                    }
                    
                    @Override
                    public final long a(final b.c c, long a) {
                        try {
                            a = this.b.a(c, a);
                            if (a == -1L) {
                                if (!this.a) {
                                    this.a = true;
                                    this.d.close();
                                }
                                return -1L;
                            }
                            c.a(this.d.b(), c.b - a, a);
                            this.d.q();
                            return a;
                        }
                        catch (IOException ex) {
                            if (!this.a) {
                                this.a = true;
                            }
                            throw ex;
                        }
                    }
                    
                    @Override
                    public final b.s a() {
                        return this.b.a();
                    }
                    
                    @Override
                    public final void close() {
                        if (!this.a && !a.a.c.a(this, TimeUnit.MILLISECONDS)) {
                            this.a = true;
                        }
                        this.b.close();
                    }
                };
                o = z.a();
                ((z.a)o).g = new h(z.f, k.a(r));
                z2 = ((z.a)o).a();
            }
            return z2;
        }
        finally {
            if (o != null) {
                a.a.c.a(((z)o).g);
            }
        }
    }
}
