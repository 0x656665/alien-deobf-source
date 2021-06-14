package a.a.e;

import b.*;
import java.io.*;
import java.util.*;

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
