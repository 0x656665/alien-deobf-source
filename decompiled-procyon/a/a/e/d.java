package a.a.e;

import java.io.*;
import b.*;
import java.util.*;

final class d
{
    static final c[] a;
    static final Map<f, Integer> b;
    
    static {
        final c c = new c(a.a.e.c.f, "");
        int i = 0;
        a = new c[] { c, new c(a.a.e.c.c, "GET"), new c(a.a.e.c.c, "POST"), new c(a.a.e.c.d, "/"), new c(a.a.e.c.d, "/index.html"), new c(a.a.e.c.e, "http"), new c(a.a.e.c.e, "https"), new c(a.a.e.c.b, "200"), new c(a.a.e.c.b, "204"), new c(a.a.e.c.b, "206"), new c(a.a.e.c.b, "304"), new c(a.a.e.c.b, "400"), new c(a.a.e.c.b, "404"), new c(a.a.e.c.b, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "") };
        final LinkedHashMap<f, Integer> linkedHashMap = new LinkedHashMap<f, Integer>(d.a.length);
        while (i < d.a.length) {
            if (!linkedHashMap.containsKey(d.a[i].g)) {
                linkedHashMap.put(d.a[i].g, i);
            }
            ++i;
        }
        b = Collections.unmodifiableMap((Map<?, ?>)linkedHashMap);
    }
    
    static f a(final f f) {
        for (int g = f.g(), i = 0; i < g; ++i) {
            final byte a = f.a(i);
            if (a >= 65 && a <= 90) {
                final StringBuilder sb = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(f.a());
                throw new IOException(sb.toString());
            }
        }
        return f;
    }
    
    static final class a
    {
        c[] a;
        int b;
        int c;
        int d;
        private final List<c> e;
        private final e f;
        private final int g;
        private int h;
        
        a(final r r) {
            this(r, (byte)0);
        }
        
        private a(final r r, final byte b) {
            super();
            this.e = new ArrayList<c>();
            this.a = new c[8];
            this.b = this.a.length - 1;
            this.c = 0;
            this.d = 0;
            this.g = 4096;
            this.h = 4096;
            this.f = k.a(r);
        }
        
        private int a(int n) {
            int n2 = 0;
            final int n3 = 0;
            if (n > 0) {
                int n4;
                int n5;
                for (n4 = this.a.length - 1, n5 = n, n = n3; n4 >= this.b && n5 > 0; n5 -= this.a[n4].i, this.d -= this.a[n4].i, --this.c, ++n, --n4) {}
                System.arraycopy(this.a, this.b + 1, this.a, this.b + 1 + n, this.c);
                this.b += n;
                n2 = n;
            }
            return n2;
        }
        
        private int a(int n, int n2) {
            n &= n2;
            if (n < n2) {
                return n;
            }
            n = 0;
            int e;
            while (true) {
                e = this.e();
                if ((e & 0x80) == 0x0) {
                    break;
                }
                n2 += (e & 0x7F) << n;
                n += 7;
            }
            return n2 + (e << n);
        }
        
        private void a(final c c) {
            this.e.add(c);
            final int i = c.i;
            if (i > this.h) {
                this.d();
                return;
            }
            this.a(this.d + i - this.h);
            if (this.c + 1 > this.a.length) {
                final c[] a = new c[this.a.length * 2];
                System.arraycopy(this.a, 0, a, this.a.length, this.a.length);
                this.b = this.a.length - 1;
                this.a = a;
            }
            this.a[this.b--] = c;
            ++this.c;
            this.d += i;
        }
        
        private int b(final int n) {
            return this.b + 1 + n;
        }
        
        private f c(final int n) {
            if (d(n)) {
                return a.a.e.d.a[n].g;
            }
            return this.a[this.b(n - a.a.e.d.a.length)].g;
        }
        
        private void c() {
            if (this.h < this.d) {
                if (this.h == 0) {
                    this.d();
                    return;
                }
                this.a(this.d - this.h);
            }
        }
        
        private void d() {
            Arrays.fill(this.a, null);
            this.b = this.a.length - 1;
            this.c = 0;
            this.d = 0;
        }
        
        private static boolean d(final int n) {
            return n >= 0 && n <= d.a.length - 1;
        }
        
        private int e() {
            return this.f.e() & 0xFF;
        }
        
        private f f() {
            final int e = this.e();
            final boolean b = (e & 0x80) == 0x80;
            final int a = this.a(e, 127);
            if (b) {
                return b.f.a(a.a.e.k.a().a(this.f.e(a)));
            }
            return this.f.c(a);
        }
        
        final void a() {
            while (!this.f.c()) {
                final int n = this.f.e() & 0xFF;
                if (n == 128) {
                    throw new IOException("index == 0");
                }
                if ((n & 0x80) == 0x80) {
                    final int n2 = this.a(n, 127) - 1;
                    if (d(n2)) {
                        this.e.add(a.a.e.d.a[n2]);
                    }
                    else {
                        final int b = this.b(n2 - a.a.e.d.a.length);
                        if (b < 0 || b > this.a.length - 1) {
                            final StringBuilder sb = new StringBuilder("Header index too large ");
                            sb.append(n2 + 1);
                            throw new IOException(sb.toString());
                        }
                        this.e.add(this.a[b]);
                    }
                }
                else if (n == 64) {
                    this.a(new c(a.a.e.d.a(this.f()), this.f()));
                }
                else if ((n & 0x40) == 0x40) {
                    this.a(new c(this.c(this.a(n, 63) - 1), this.f()));
                }
                else if ((n & 0x20) == 0x20) {
                    this.h = this.a(n, 31);
                    if (this.h < 0 || this.h > this.g) {
                        final StringBuilder sb2 = new StringBuilder("Invalid dynamic table size update ");
                        sb2.append(this.h);
                        throw new IOException(sb2.toString());
                    }
                    this.c();
                }
                else if (n != 16 && n != 0) {
                    this.e.add(new c(this.c(this.a(n, 15) - 1), this.f()));
                }
                else {
                    this.e.add(new c(a.a.e.d.a(this.f()), this.f()));
                }
            }
        }
        
        public final List<c> b() {
            final ArrayList<c> list = new ArrayList<c>(this.e);
            this.e.clear();
            return list;
        }
    }
    
    static final class b
    {
        int a;
        int b;
        c[] c;
        int d;
        int e;
        int f;
        private final b.c g;
        private final boolean h;
        private int i;
        private boolean j;
        
        b(final b.c c) {
            this(c, (byte)0);
        }
        
        private b(final b.c g, final byte b) {
            super();
            this.i = Integer.MAX_VALUE;
            this.c = new c[8];
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
            this.a = 4096;
            this.b = 4096;
            this.h = true;
            this.g = g;
        }
        
        private void a() {
            Arrays.fill(this.c, null);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
        }
        
        private void a(int i, final int n, final int n2) {
            if (i < n) {
                this.g.b(i | n2);
                return;
            }
            this.g.b(n2 | n);
            for (i -= n; i >= 128; i >>>= 7) {
                this.g.b(0x80 | (i & 0x7F));
            }
            this.g.b(i);
        }
        
        private void a(final c c) {
            final int i = c.i;
            if (i > this.b) {
                this.a();
                return;
            }
            this.b(this.f + i - this.b);
            if (this.e + 1 > this.c.length) {
                final c[] c2 = new c[this.c.length * 2];
                System.arraycopy(this.c, 0, c2, this.c.length, this.c.length);
                this.d = this.c.length - 1;
                this.c = c2;
            }
            this.c[this.d--] = c;
            ++this.e;
            this.f += i;
        }
        
        private void a(f k) {
            if (this.h) {
                k.a();
                if (k.a(k) < k.g()) {
                    final b.c c = new b.c();
                    k.a();
                    k.a(k, c);
                    k = c.k();
                    this.a(k.g(), 127, 128);
                    this.g.a(k);
                    return;
                }
            }
            this.a(k.g(), 127, 0);
            this.g.a(k);
        }
        
        private int b(int n) {
            int n2 = 0;
            final int n3 = 0;
            if (n > 0) {
                int n4;
                int n5;
                for (n4 = this.c.length - 1, n5 = n, n = n3; n4 >= this.d && n5 > 0; n5 -= this.c[n4].i, this.f -= this.c[n4].i, --this.e, ++n, --n4) {}
                System.arraycopy(this.c, this.d + 1, this.c, this.d + 1 + n, this.e);
                Arrays.fill(this.c, this.d + 1, this.d + 1 + n, null);
                this.d += n;
                n2 = n;
            }
            return n2;
        }
        
        final void a(int min) {
            this.a = min;
            min = Math.min(min, 16384);
            if (this.b == min) {
                return;
            }
            if (min < this.b) {
                this.i = Math.min(this.i, min);
            }
            this.j = true;
            this.b = min;
            if (this.b < this.f) {
                if (this.b == 0) {
                    this.a();
                    return;
                }
                this.b(this.f - this.b);
            }
        }
        
        final void a(final List<c> list) {
            if (this.j) {
                if (this.i < this.b) {
                    this.a(this.i, 31, 32);
                }
                this.j = false;
                this.i = Integer.MAX_VALUE;
                this.a(this.b, 31, 32);
            }
            for (int size = list.size(), i = 0; i < size; ++i) {
                final c c = list.get(i);
                final f f = c.g.f();
                final f h = c.h;
                final Integer n = a.a.e.d.b.get(f);
                int n2 = 0;
                int n3 = 0;
                Label_0199: {
                    if (n != null) {
                        n2 = n + 1;
                        if (n2 > 1 && n2 < 8) {
                            if (a.a.c.a(a.a.e.d.a[n2 - 1].h, h)) {
                                n3 = n2;
                                break Label_0199;
                            }
                            if (a.a.c.a(a.a.e.d.a[n2].h, h)) {
                                n3 = n2;
                                ++n2;
                                break Label_0199;
                            }
                        }
                        n3 = n2;
                        n2 = -1;
                    }
                    else {
                        n2 = -1;
                        n3 = -1;
                    }
                }
                int n4 = n2;
                int n5 = n3;
                if (n2 == -1) {
                    int n6 = this.d + 1;
                    final int length = this.c.length;
                    while (true) {
                        n4 = n2;
                        n5 = n3;
                        if (n6 >= length) {
                            break;
                        }
                        int n7 = n3;
                        if (a.a.c.a(this.c[n6].g, f)) {
                            if (a.a.c.a(this.c[n6].h, h)) {
                                n4 = a.a.e.d.a.length + (n6 - this.d);
                                n5 = n3;
                                break;
                            }
                            if ((n7 = n3) == -1) {
                                n7 = n6 - this.d + a.a.e.d.a.length;
                            }
                        }
                        ++n6;
                        n3 = n7;
                    }
                }
                if (n4 != -1) {
                    this.a(n4, 127, 128);
                }
                else if (n5 == -1) {
                    this.g.b(64);
                    this.a(f);
                    this.a(h);
                    this.a(c);
                }
                else {
                    final f a = a.a.e.c.a;
                    if (f.a(0, a, 0, a.g()) && !a.a.e.c.f.equals(f)) {
                        this.a(n5, 15, 0);
                        this.a(h);
                    }
                    else {
                        this.a(n5, 63, 64);
                        this.a(h);
                        this.a(c);
                    }
                }
            }
        }
    }
}
