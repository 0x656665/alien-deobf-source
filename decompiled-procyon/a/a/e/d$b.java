package a.a.e;

import b.*;
import java.util.*;

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
