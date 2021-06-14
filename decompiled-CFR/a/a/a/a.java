/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.a;

import a.a.a.b;
import a.a.a.c;
import a.a.a.e;
import a.a.c;
import a.a.c.h;
import a.aa;
import a.d;
import a.p;
import a.q;
import a.r;
import a.s;
import a.v;
import a.x;
import a.z;
import b.k;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class a
implements s {
    final e a;

    public a(e e2) {
        this.a = e2;
    }

    private static q a(q object, q q2) {
        int n2;
        q.a a2 = new q.a();
        int n3 = ((q)object).a.length / 2;
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            String string = ((q)object).a(n2);
            String string2 = ((q)object).b(n2);
            if ("Warning".equalsIgnoreCase(string) && string2.startsWith("1") || a.a(string) && q2.a(string) != null) continue;
            a.a.a.a.a(a2, string, string2);
        }
        n3 = q2.a.length / 2;
        n2 = n4;
        while (n2 < n3) {
            object = q2.a(n2);
            if (!"Content-Length".equalsIgnoreCase((String)object) && a.a((String)object)) {
                a.a.a.a.a(a2, (String)object, q2.b(n2));
            }
            ++n2;
        }
        return a2.a();
    }

    private static z a(z object) {
        if (object == null) return object;
        if (((z)object).g == null) return object;
        object = ((z)object).a();
        ((z.a)object).g = null;
        return ((z.a)object).a();
    }

    private static boolean a(String string) {
        if ("Connection".equalsIgnoreCase(string)) return false;
        if ("Keep-Alive".equalsIgnoreCase(string)) return false;
        if ("Proxy-Authenticate".equalsIgnoreCase(string)) return false;
        if ("Proxy-Authorization".equalsIgnoreCase(string)) return false;
        if ("TE".equalsIgnoreCase(string)) return false;
        if ("Trailers".equalsIgnoreCase(string)) return false;
        if ("Transfer-Encoding".equalsIgnoreCase(string)) return false;
        if ("Upgrade".equalsIgnoreCase(string)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    @Override
    public final z a(s.a var1_1) {
        block31 : {
            block33 : {
                block36 : {
                    block42 : {
                        block41 : {
                            block40 : {
                                block38 : {
                                    block39 : {
                                        block37 : {
                                            block35 : {
                                                block34 : {
                                                    block32 : {
                                                        var14_3 = this.a != null ? this.a.a() : null;
                                                        var17_4 = new c.a(System.currentTimeMillis(), var1_1.a(), (z)var14_3);
                                                        if (var17_4.c != null) break block32;
                                                        var13_5 = new a.a.a.c(var17_4.b, null);
                                                        break block33;
                                                    }
                                                    if (!var17_4.b.a.b() || var17_4.c.e != null) break block34;
                                                    var13_5 = new a.a.a.c(var17_4.b, null);
                                                    break block33;
                                                }
                                                if (a.a.a.c.a(var17_4.c, var17_4.b)) break block35;
                                                var13_5 = new a.a.a.c(var17_4.b, null);
                                                break block33;
                                            }
                                            var15_6 = var17_4.b.b();
                                            if (var15_6.c) break block36;
                                            var13_5 = var17_4.b;
                                            var2_7 = var13_5.a("If-Modified-Since") != null || var13_5.a("If-None-Match") != null;
                                            if (var2_7) break block36;
                                            var13_5 = var17_4.d;
                                            var9_8 = 0L;
                                            var3_9 = var13_5 != null ? Math.max(0L, var17_4.j - var17_4.d.getTime()) : 0L;
                                            var5_10 = var3_9;
                                            if (var17_4.l != -1) {
                                                var5_10 = Math.max(var3_9, TimeUnit.SECONDS.toMillis(var17_4.l));
                                            }
                                            var11_11 = var5_10 + (var17_4.j - var17_4.i) + (var17_4.a - var17_4.j);
                                            var13_5 = var17_4.c.b();
                                            if (var13_5.e == -1) break block37;
                                            var3_9 = TimeUnit.SECONDS.toMillis(var13_5.e);
                                            break block38;
                                        }
                                        if (var17_4.h == null) break block39;
                                        var3_9 = var17_4.d != null ? var17_4.d.getTime() : var17_4.j;
                                        var3_9 = var17_4.h.getTime() - var3_9;
                                        if (var3_9 <= 0L) ** GOTO lbl-1000
                                        break block38;
                                    }
                                    if (var17_4.f == null) ** GOTO lbl-1000
                                    var13_5 = var17_4.c.a.a;
                                    if (var13_5.d == null) {
                                        var13_5 = null;
                                    } else {
                                        var16_12 = new StringBuilder();
                                        r.b((StringBuilder)var16_12, var13_5.d);
                                        var13_5 = var16_12.toString();
                                    }
                                    if (var13_5 != null) ** GOTO lbl-1000
                                    var3_9 = var17_4.d != null ? var17_4.d.getTime() : var17_4.i;
                                    if ((var3_9 -= var17_4.f.getTime()) > 0L) {
                                        var3_9 /= 10L;
                                    } else lbl-1000: // 4 sources:
                                    {
                                        var3_9 = 0L;
                                    }
                                }
                                var5_10 = var3_9;
                                if (var15_6.e != -1) {
                                    var5_10 = Math.min(var3_9, TimeUnit.SECONDS.toMillis(var15_6.e));
                                }
                                var3_9 = var15_6.j != -1 ? TimeUnit.SECONDS.toMillis(var15_6.j) : 0L;
                                var13_5 = var17_4.c.b();
                                var7_13 = var9_8;
                                if (!var13_5.h) {
                                    var7_13 = var9_8;
                                    if (var15_6.i != -1) {
                                        var7_13 = TimeUnit.SECONDS.toMillis(var15_6.i);
                                    }
                                }
                                if (var13_5.c || (var3_9 += var11_11) >= var7_13 + var5_10) break block40;
                                var13_5 = var17_4.c.a();
                                if (var3_9 >= var5_10) {
                                    var13_5.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (var11_11 > 86400000L && (var2_7 = var17_4.c.b().e == -1 && var17_4.h == null)) {
                                    var13_5.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                var13_5 = new a.a.a.c(null, var13_5.a());
                                break block33;
                            }
                            if (var17_4.k == null) break block41;
                            var13_5 = "If-None-Match";
                            var15_6 = var17_4.k;
                            ** GOTO lbl87
                        }
                        if (var17_4.f == null) break block42;
                        var13_5 = "If-Modified-Since";
                        var15_6 = var17_4.g;
                        ** GOTO lbl87
                    }
                    if (var17_4.d != null) {
                        var13_5 = "If-Modified-Since";
                        var15_6 = var17_4.e;
lbl87: // 3 sources:
                        var16_12 = var17_4.b.c.a();
                        a.a.a.a.a((q.a)var16_12, (String)var13_5, (String)var15_6);
                        var13_5 = var17_4.b.a();
                        var13_5.c = var16_12.a().a();
                        var13_5 = new a.a.a.c(var13_5.a(), var17_4.c);
                    } else {
                        var13_5 = new a.a.a.c(var17_4.b, null);
                    }
                    break block33;
                }
                var13_5 = new a.a.a.c(var17_4.b, null);
            }
            var16_12 = null;
            var15_6 = var13_5;
            if (var13_5.a != null) {
                var15_6 = var13_5;
                if (var17_4.b.b().k) {
                    var15_6 = new a.a.a.c(null, null);
                }
            }
            var17_4 = var15_6.a;
            var13_5 = var15_6.b;
            if (var14_3 != null && var13_5 == null) {
                c.a(var14_3.g);
            }
            if (var17_4 == null && var13_5 == null) {
                var13_5 = new z.a();
                var13_5.a = var1_1.a();
                var13_5.b = v.b;
                var13_5.c = 504;
                var13_5.d = "Unsatisfiable Request (only-if-cached)";
                var13_5.g = c.c;
                var13_5.k = -1L;
                var13_5.l = System.currentTimeMillis();
                return var13_5.a();
            }
            if (var17_4 == null) {
                return var13_5.a().b(a.a((z)var13_5)).a();
            }
            try {
                var15_6 = var1_1.a((x)var17_4);
                if (var15_6 != null || var14_3 == null) break block31;
            }
            catch (Throwable var1_2) {
                if (var14_3 == null) throw var1_2;
                c.a(var14_3.g);
                throw var1_2;
            }
            c.a(var14_3.g);
        }
        if (var13_5 != null) {
            if (var15_6.c == 304) {
                var1_1 = var13_5.a().a(a.a(var13_5.f, var15_6.f));
                var1_1.k = var15_6.k;
                var1_1.l = var15_6.l;
                var1_1 = var1_1.b(a.a((z)var13_5)).a(a.a((z)var15_6)).a();
                var15_6.g.close();
                return var1_1;
            }
            c.a(var13_5.g);
        }
        var1_1 = var13_5 = var15_6.a().b(a.a((z)var13_5)).a(a.a((z)var15_6)).a();
        if (a.a.c.e.b((z)var13_5) == false) return var1_1;
        var1_1 = var15_6.a;
        var14_3 = this.a;
        if (var14_3 == null) {
            var1_1 = var16_12;
        } else if (!a.a.a.c.a((z)var13_5, (x)var1_1)) {
            var14_3 = var1_1.b;
            var1_1 = var16_12;
            if (!var14_3.equals("POST")) {
                var1_1 = var16_12;
                if (!var14_3.equals("PATCH")) {
                    var1_1 = var16_12;
                    if (!var14_3.equals("PUT")) {
                        var1_1 = var16_12;
                        if (!var14_3.equals("DELETE")) {
                            var14_3.equals("MOVE");
                            var1_1 = var16_12;
                        }
                    }
                }
            }
        } else {
            var1_1 = var14_3.b();
        }
        if (var1_1 == null) {
            return var13_5;
        }
        var14_3 = var1_1.a();
        if (var14_3 == null) {
            return var13_5;
        }
        var1_1 = new b.r(var13_5.g.c(), (b)var1_1, k.a((b.q)var14_3)){
            boolean a;
            final /* synthetic */ b.e b;
            final /* synthetic */ b c;
            final /* synthetic */ b.d d;
            {
                this.b = e2;
                this.c = b2;
                this.d = d2;
            }

            @Override
            public final long a(b.c c2, long l2) {
                block2 : {
                    try {
                        l2 = this.b.a(c2, l2);
                        if (l2 != -1L) break block2;
                        if (this.a) return -1L;
                        this.a = true;
                    }
                    catch (IOException iOException) {
                        if (this.a) throw iOException;
                        this.a = true;
                        throw iOException;
                    }
                    this.d.close();
                    return -1L;
                }
                c2.a(this.d.b(), c2.b - l2, l2);
                this.d.q();
                return l2;
            }

            @Override
            public final b.s a() {
                return this.b.a();
            }

            @Override
            public final void close() {
                if (!this.a && !c.a(this, TimeUnit.MILLISECONDS)) {
                    this.a = true;
                }
                this.b.close();
            }
        };
        var14_3 = var13_5.a();
        var14_3.g = new h(var13_5.f, k.a((b.r)var1_1));
        return var14_3.a();
    }

}

