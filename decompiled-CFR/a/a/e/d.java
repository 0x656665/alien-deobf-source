/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.e;

import a.a.c;
import a.a.e.k;
import b.e;
import b.f;
import b.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class d {
    static final a.a.e.c[] a;
    static final Map<f, Integer> b;

    static {
        Object object = new a.a.e.c(a.a.e.c.f, "");
        int n2 = 0;
        a = new a.a.e.c[]{object, new a.a.e.c(a.a.e.c.c, "GET"), new a.a.e.c(a.a.e.c.c, "POST"), new a.a.e.c(a.a.e.c.d, "/"), new a.a.e.c(a.a.e.c.d, "/index.html"), new a.a.e.c(a.a.e.c.e, "http"), new a.a.e.c(a.a.e.c.e, "https"), new a.a.e.c(a.a.e.c.b, "200"), new a.a.e.c(a.a.e.c.b, "204"), new a.a.e.c(a.a.e.c.b, "206"), new a.a.e.c(a.a.e.c.b, "304"), new a.a.e.c(a.a.e.c.b, "400"), new a.a.e.c(a.a.e.c.b, "404"), new a.a.e.c(a.a.e.c.b, "500"), new a.a.e.c("accept-charset", ""), new a.a.e.c("accept-encoding", "gzip, deflate"), new a.a.e.c("accept-language", ""), new a.a.e.c("accept-ranges", ""), new a.a.e.c("accept", ""), new a.a.e.c("access-control-allow-origin", ""), new a.a.e.c("age", ""), new a.a.e.c("allow", ""), new a.a.e.c("authorization", ""), new a.a.e.c("cache-control", ""), new a.a.e.c("content-disposition", ""), new a.a.e.c("content-encoding", ""), new a.a.e.c("content-language", ""), new a.a.e.c("content-length", ""), new a.a.e.c("content-location", ""), new a.a.e.c("content-range", ""), new a.a.e.c("content-type", ""), new a.a.e.c("cookie", ""), new a.a.e.c("date", ""), new a.a.e.c("etag", ""), new a.a.e.c("expect", ""), new a.a.e.c("expires", ""), new a.a.e.c("from", ""), new a.a.e.c("host", ""), new a.a.e.c("if-match", ""), new a.a.e.c("if-modified-since", ""), new a.a.e.c("if-none-match", ""), new a.a.e.c("if-range", ""), new a.a.e.c("if-unmodified-since", ""), new a.a.e.c("last-modified", ""), new a.a.e.c("link", ""), new a.a.e.c("location", ""), new a.a.e.c("max-forwards", ""), new a.a.e.c("proxy-authenticate", ""), new a.a.e.c("proxy-authorization", ""), new a.a.e.c("range", ""), new a.a.e.c("referer", ""), new a.a.e.c("refresh", ""), new a.a.e.c("retry-after", ""), new a.a.e.c("server", ""), new a.a.e.c("set-cookie", ""), new a.a.e.c("strict-transport-security", ""), new a.a.e.c("transfer-encoding", ""), new a.a.e.c("user-agent", ""), new a.a.e.c("vary", ""), new a.a.e.c("via", ""), new a.a.e.c("www-authenticate", "")};
        object = new LinkedHashMap(a.length);
        do {
            if (n2 >= a.length) {
                b = Collections.unmodifiableMap(object);
                return;
            }
            if (!object.containsKey(d.a[n2].g)) {
                object.put(d.a[n2].g, n2);
            }
            ++n2;
        } while (true);
    }

    static f a(f f2) {
        int n2 = f2.g();
        int n3 = 0;
        while (n3 < n2) {
            byte by = f2.a(n3);
            if (by >= 65 && by <= 90) {
                StringBuilder stringBuilder = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                stringBuilder.append(f2.a());
                throw new IOException(stringBuilder.toString());
            }
            ++n3;
        }
        return f2;
    }

    static final class a {
        a.a.e.c[] a = new a.a.e.c[8];
        int b = this.a.length - 1;
        int c = 0;
        int d = 0;
        private final List<a.a.e.c> e = new ArrayList<a.a.e.c>();
        private final e f;
        private final int g;
        private int h = 4096;

        a(r r2) {
            this(r2, 0);
        }

        private a(r r2, byte by) {
            this.g = 4096;
            this.f = b.k.a(r2);
        }

        private int a(int n2) {
            int n3 = 0;
            int n4 = 0;
            if (n2 <= 0) return n3;
            int n5 = n2;
            n2 = n4;
            for (n3 = this.a.length - 1; n3 >= this.b && n5 > 0; n5 -= this.a[n3].i, this.d -= this.a[n3].i, --this.c, ++n2, --n3) {
            }
            System.arraycopy(this.a, this.b + 1, this.a, this.b + 1 + n2, this.c);
            this.b += n2;
            return n2;
        }

        private int a(int n2, int n3) {
            int n4;
            if ((n2 &= n3) < n3) {
                return n2;
            }
            n2 = 0;
            while (((n4 = this.e()) & 128) != 0) {
                n3 += (n4 & 127) << n2;
                n2 += 7;
            }
            return n3 + (n4 << n2);
        }

        private void a(a.a.e.c c2) {
            this.e.add(c2);
            int n2 = c2.i;
            if (n2 > this.h) {
                this.d();
                return;
            }
            this.a(this.d + n2 - this.h);
            if (this.c + 1 > this.a.length) {
                a.a.e.c[] arrc = new a.a.e.c[this.a.length * 2];
                System.arraycopy(this.a, 0, arrc, this.a.length, this.a.length);
                this.b = this.a.length - 1;
                this.a = arrc;
            }
            int n3 = this.b;
            this.b = n3 - 1;
            this.a[n3] = c2;
            ++this.c;
            this.d += n2;
        }

        private int b(int n2) {
            return this.b + 1 + n2;
        }

        private f c(int n2) {
            if (!a.d(n2)) return this.a[this.b((int)(n2 - d.a.length))].g;
            return d.a[n2].g;
        }

        private void c() {
            if (this.h >= this.d) return;
            if (this.h == 0) {
                this.d();
                return;
            }
            this.a(this.d - this.h);
        }

        private void d() {
            Arrays.fill(this.a, null);
            this.b = this.a.length - 1;
            this.c = 0;
            this.d = 0;
        }

        private static boolean d(int n2) {
            if (n2 < 0) return false;
            if (n2 > a.length - 1) return false;
            return true;
        }

        private int e() {
            return this.f.e() & 255;
        }

        private f f() {
            int n2 = this.e();
            boolean bl = (n2 & 128) == 128;
            n2 = this.a(n2, 127);
            if (!bl) return this.f.c(n2);
            return f.a(k.a().a(this.f.e(n2)));
        }

        final void a() {
            while (!this.f.c()) {
                f f2;
                Object object;
                int n2 = this.f.e() & 255;
                if (n2 == 128) throw new IOException("index == 0");
                if ((n2 & 128) == 128) {
                    if (a.d(n2 = this.a(n2, 127) - 1)) {
                        object = a[n2];
                        this.e.add((a.a.e.c)object);
                        continue;
                    }
                    int n3 = this.b(n2 - a.length);
                    if (n3 >= 0 && n3 <= this.a.length - 1) {
                        this.e.add(this.a[n3]);
                        continue;
                    }
                    object = new StringBuilder("Header index too large ");
                    ((StringBuilder)object).append(n2 + 1);
                    throw new IOException(((StringBuilder)object).toString());
                }
                if (n2 == 64) {
                    this.a(new a.a.e.c(d.a(this.f()), this.f()));
                    continue;
                }
                if ((n2 & 64) == 64) {
                    this.a(new a.a.e.c(this.c(this.a(n2, 63) - 1), this.f()));
                    continue;
                }
                if ((n2 & 32) == 32) {
                    this.h = this.a(n2, 31);
                    if (this.h >= 0 && this.h <= this.g) {
                        this.c();
                        continue;
                    }
                    object = new StringBuilder("Invalid dynamic table size update ");
                    ((StringBuilder)object).append(this.h);
                    throw new IOException(((StringBuilder)object).toString());
                }
                if (n2 != 16 && n2 != 0) {
                    object = this.c(this.a(n2, 15) - 1);
                    f2 = this.f();
                    this.e.add(new a.a.e.c((f)object, f2));
                    continue;
                }
                object = d.a(this.f());
                f2 = this.f();
                this.e.add(new a.a.e.c((f)object, f2));
            }
        }

        public final List<a.a.e.c> b() {
            ArrayList<a.a.e.c> arrayList = new ArrayList<a.a.e.c>(this.e);
            this.e.clear();
            return arrayList;
        }
    }

    static final class b {
        int a = 4096;
        int b = 4096;
        a.a.e.c[] c = new a.a.e.c[8];
        int d = this.c.length - 1;
        int e = 0;
        int f = 0;
        private final b.c g;
        private final boolean h;
        private int i = Integer.MAX_VALUE;
        private boolean j;

        b(b.c c2) {
            this(c2, 0);
        }

        private b(b.c c2, byte by) {
            this.h = true;
            this.g = c2;
        }

        private void a() {
            Arrays.fill(this.c, null);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
        }

        private void a(int n2, int n3, int n4) {
            if (n2 < n3) {
                this.g.b(n2 | n4);
                return;
            }
            this.g.b(n4 | n3);
            n2 -= n3;
            do {
                if (n2 < 128) {
                    this.g.b(n2);
                    return;
                }
                this.g.b(128 | n2 & 127);
                n2 >>>= 7;
            } while (true);
        }

        private void a(a.a.e.c c2) {
            int n2 = c2.i;
            if (n2 > this.b) {
                this.a();
                return;
            }
            this.b(this.f + n2 - this.b);
            if (this.e + 1 > this.c.length) {
                a.a.e.c[] arrc = new a.a.e.c[this.c.length * 2];
                System.arraycopy(this.c, 0, arrc, this.c.length, this.c.length);
                this.d = this.c.length - 1;
                this.c = arrc;
            }
            int n3 = this.d;
            this.d = n3 - 1;
            this.c[n3] = c2;
            ++this.e;
            this.f += n2;
        }

        private void a(f f2) {
            if (this.h) {
                k.a();
                if (k.a(f2) < f2.g()) {
                    b.c c2 = new b.c();
                    k.a();
                    k.a(f2, c2);
                    f2 = c2.k();
                    this.a(f2.g(), 127, 128);
                    this.g.a(f2);
                    return;
                }
            }
            this.a(f2.g(), 127, 0);
            this.g.a(f2);
        }

        private int b(int n2) {
            int n3 = 0;
            int n4 = 0;
            if (n2 <= 0) return n3;
            int n5 = n2;
            n2 = n4;
            for (n3 = this.c.length - 1; n3 >= this.d && n5 > 0; n5 -= this.c[n3].i, this.f -= this.c[n3].i, --this.e, ++n2, --n3) {
            }
            System.arraycopy(this.c, this.d + 1, this.c, this.d + 1 + n2, this.e);
            Arrays.fill(this.c, this.d + 1, this.d + 1 + n2, null);
            this.d += n2;
            return n2;
        }

        final void a(int n2) {
            this.a = n2;
            if (this.b == (n2 = Math.min(n2, 16384))) {
                return;
            }
            if (n2 < this.b) {
                this.i = Math.min(this.i, n2);
            }
            this.j = true;
            this.b = n2;
            if (this.b >= this.f) return;
            if (this.b == 0) {
                this.a();
                return;
            }
            this.b(this.f - this.b);
        }

        /*
         * Unable to fully structure code
         */
        final void a(List<a.a.e.c> var1_1) {
            if (this.j) {
                if (this.i < this.b) {
                    this.a(this.i, 31, 32);
                }
                this.j = false;
                this.i = Integer.MAX_VALUE;
                this.a(this.b, 31, 32);
            }
            var8_2 = var1_1.size();
            var4_3 = 0;
            while (var4_3 < var8_2) {
                block19 : {
                    block18 : {
                        var10_10 = var1_1.get(var4_3);
                        var11_11 = var10_10.g.f();
                        var12_12 = var10_10.h;
                        var13_13 = d.b.get(var11_11);
                        if (var13_13 == null) break block18;
                        var3_5 = var13_13.intValue() + 1;
                        if (var3_5 <= 1 || var3_5 >= 8) ** GOTO lbl-1000
                        if (c.a(d.a[var3_5 - 1].h, (Object)var12_12)) {
                            var2_4 = var3_5;
                        } else if (c.a(d.a[var3_5].h, (Object)var12_12)) {
                            var2_4 = var3_5++;
                        } else lbl-1000: // 2 sources:
                        {
                            var2_4 = var3_5;
                            var3_5 = -1;
                        }
                        break block19;
                    }
                    var3_5 = -1;
                    var2_4 = -1;
                }
                var6_7 = var3_5;
                var7_8 = var2_4;
                if (var3_5 == -1) {
                    var5_6 = this.d + 1;
                    var9_9 = this.c.length;
                    do {
                        var6_7 = var3_5;
                        var7_8 = var2_4;
                        if (var5_6 >= var9_9) break;
                        var6_7 = var2_4;
                        if (c.a(this.c[var5_6].g, (Object)var11_11)) {
                            if (c.a(this.c[var5_6].h, (Object)var12_12)) {
                                var3_5 = this.d;
                                var6_7 = d.a.length + (var5_6 - var3_5);
                                var7_8 = var2_4;
                                break;
                            }
                            var6_7 = var2_4;
                            if (var2_4 == -1) {
                                var6_7 = var5_6 - this.d + d.a.length;
                            }
                        }
                        ++var5_6;
                        var2_4 = var6_7;
                    } while (true);
                }
                if (var6_7 != -1) {
                    this.a(var6_7, 127, 128);
                } else if (var7_8 == -1) {
                    this.g.b(64);
                    this.a(var11_11);
                    this.a(var12_12);
                    this.a(var10_10);
                } else {
                    var13_13 = a.a.e.c.a;
                    if (var11_11.a(0, (f)var13_13, 0, var13_13.g()) && !a.a.e.c.f.equals(var11_11)) {
                        this.a(var7_8, 15, 0);
                        this.a(var12_12);
                    } else {
                        this.a(var7_8, 63, 64);
                        this.a(var12_12);
                        this.a(var10_10);
                    }
                }
                ++var4_3;
            }
        }
    }

}

