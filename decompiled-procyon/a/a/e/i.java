package a.a.e;

import java.util.*;
import java.io.*;
import b.*;
import java.net.*;

public final class i
{
    static final /* synthetic */ boolean l;
    long a;
    long b;
    final int c;
    final g d;
    List<a.a.e.c> e;
    boolean f;
    final b g;
    final a h;
    final c i;
    final c j;
    a.a.e.b k;
    private final List<a.a.e.c> m;
    
    static {
        l = (i.class.desiredAssertionStatus() ^ true);
    }
    
    i(final int c, final g d, final boolean b, final boolean b2, final List<a.a.e.c> m) {
        super();
        this.a = 0L;
        this.i = new c();
        this.j = new c();
        this.k = null;
        if (d == null) {
            throw new NullPointerException("connection == null");
        }
        if (m != null) {
            this.c = c;
            this.d = d;
            this.b = d.n.b();
            this.g = new b(d.m.b());
            this.h = new a();
            this.g.b = b2;
            this.h.b = b;
            this.m = m;
            return;
        }
        throw new NullPointerException("requestHeaders == null");
    }
    
    private boolean d(final a.a.e.b k) {
        if (!a.a.e.i.l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.g.b && this.h.b) {
                return false;
            }
            this.k = k;
            this.notifyAll();
            // monitorexit(this)
            this.d.b(this.c);
            return true;
        }
    }
    
    final void a(final long n) {
        this.b += n;
        if (n > 0L) {
            this.notifyAll();
        }
    }
    
    public final void a(final a.a.e.b b) {
        if (!this.d(b)) {
            return;
        }
        this.d.b(this.c, b);
    }
    
    public final boolean a() {
        synchronized (this) {
            return this.k == null && ((!this.g.b && !this.g.a) || (!this.h.b && !this.h.a) || !this.f);
        }
    }
    
    public final void b(final a.a.e.b b) {
        if (!this.d(b)) {
            return;
        }
        this.d.a(this.c, b);
    }
    
    public final boolean b() {
        return this.d.b == ((this.c & 0x1) == 0x1);
    }
    
    public final List<a.a.e.c> c() {
        synchronized (this) {
            if (this.b()) {
                this.i.a_();
                try {
                    while (this.e == null && this.k == null) {
                        this.h();
                    }
                    this.i.b();
                    final List<a.a.e.c> e = this.e;
                    if (e != null) {
                        this.e = null;
                        return e;
                    }
                    throw new o(this.k);
                }
                finally {
                    this.i.b();
                }
            }
            throw new IllegalStateException("servers cannot read response headers");
        }
    }
    
    final void c(final a.a.e.b k) {
        synchronized (this) {
            if (this.k == null) {
                this.k = k;
                this.notifyAll();
            }
        }
    }
    
    public final q d() {
        synchronized (this) {
            if (!this.f && !this.b()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
            return this.h;
        }
    }
    
    final void e() {
        if (!a.a.e.i.l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.g.b = true;
            final boolean a = this.a();
            this.notifyAll();
            // monitorexit(this)
            if (!a) {
                this.d.b(this.c);
            }
        }
    }
    
    final void f() {
        if (!a.a.e.i.l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
    Label_0069_Outer:
        while (true) {
            while (true) {
                Label_0115: {
                    Label_0110: {
                        synchronized (this) {
                            if (this.g.b || !this.g.a) {
                                break Label_0115;
                            }
                            if (this.h.b) {
                                break Label_0110;
                            }
                            if (this.h.a) {
                                break Label_0110;
                            }
                            break Label_0115;
                            Label_0104: {
                                return;
                            }
                            // \u0131ftrue(Label_0104:, a)
                            while (true) {
                                this.d.b(this.c);
                                return;
                                Label_0088:
                                continue Label_0069_Outer;
                            }
                            final boolean a = this.a();
                            // monitorexit(this)
                            // \u0131ftrue(Label_0088:, n == 0)
                            this.a(a.a.e.b.f);
                            return;
                        }
                    }
                    final int n = 1;
                    continue;
                }
                final int n = 0;
                continue;
            }
        }
    }
    
    final void g() {
        if (this.h.a) {
            throw new IOException("stream closed");
        }
        if (this.h.b) {
            throw new IOException("stream finished");
        }
        if (this.k == null) {
            return;
        }
        throw new o(this.k);
    }
    
    final void h() {
        try {
            this.wait();
        }
        catch (InterruptedException ex) {
            throw new InterruptedIOException();
        }
    }
    
    final class a implements q
    {
        static final /* synthetic */ boolean c;
        boolean a;
        boolean b;
        final /* synthetic */ i d;
        private final b.c e;
        
        static {
            c = (i.class.desiredAssertionStatus() ^ true);
        }
        
        a(final i d) {
            this.d = d;
            super();
            this.e = new b.c();
        }
        
        private void a(final boolean b) {
            while (true) {
                Object o = this.d;
                while (true) {
                    synchronized (o) {
                        this.d.j.a_();
                        try {
                            while (this.d.b <= 0L && !this.b && !this.a && this.d.k == null) {
                                this.d.h();
                            }
                            this.d.j.b();
                            this.d.g();
                            final long min = Math.min(this.d.b, this.e.b);
                            final i d = this.d;
                            d.b -= min;
                            // monitorexit(o)
                            this.d.j.a_();
                            try {
                                o = this.d.d;
                                final int c = this.d.c;
                                if (b && min == this.e.b) {
                                    final boolean b2 = true;
                                    ((g)o).a(c, b2, this.e, min);
                                    return;
                                }
                            }
                            finally {
                                this.d.j.b();
                            }
                        }
                        finally {
                            this.d.j.b();
                        }
                    }
                    final boolean b2 = false;
                    continue;
                }
            }
        }
        
        @Override
        public final s a() {
            return this.d.j;
        }
        
        @Override
        public final void a_(final b.c c, final long n) {
            if (!a.a.e.i.a.c && Thread.holdsLock(this.d)) {
                throw new AssertionError();
            }
            this.e.a_(c, n);
            while (this.e.b >= 16384L) {
                this.a(false);
            }
        }
        
        @Override
        public final void close() {
            if (!a.a.e.i.a.c && Thread.holdsLock(this.d)) {
                throw new AssertionError();
            }
            synchronized (this.d) {
                if (this.a) {
                    return;
                }
                // monitorexit(this.d)
                if (!this.d.h.b) {
                    if (this.e.b > 0L) {
                        while (this.e.b > 0L) {
                            this.a(true);
                        }
                    }
                    else {
                        this.d.d.a(this.d.c, true, null, 0L);
                    }
                }
                final i d = this.d;
                synchronized (this.d) {
                    this.a = true;
                    // monitorexit(this.d)
                    this.d.d.q.blockBack2();
                    this.d.f();
                }
            }
        }
        
        @Override
        public final void flush() {
            if (!a.a.e.i.a.c && Thread.holdsLock(this.d)) {
                throw new AssertionError();
            }
            synchronized (this.d) {
                this.d.g();
                // monitorexit(this.d)
                while (this.e.b > 0L) {
                    this.a(false);
                    this.d.d.q.blockBack2();
                }
            }
        }
    }
    
    final class b implements r
    {
        static final /* synthetic */ boolean c;
        boolean a;
        boolean b;
        final /* synthetic */ i d;
        private final b.c e;
        private final b.c f;
        private final long g;
        
        static {
            c = (i.class.desiredAssertionStatus() ^ true);
        }
        
        b(final i d, final long g) {
            this.d = d;
            super();
            this.e = new b.c();
            this.f = new b.c();
            this.g = g;
        }
        
        private void blockBack2() {
            this.d.i.a_();
            try {
                while (this.f.b == 0L && !this.b && !this.a && this.d.k == null) {
                    this.d.h();
                }
            }
            finally {
                this.d.i.b();
            }
        }
        
        @Override
        public final long a(final b.c c, long a) {
            if (a >= 0L) {
                synchronized (this.d) {
                    this.blockBack2();
                    if (!this.a) {
                        if (this.d.k == null) {
                            if (this.f.b == 0L) {
                                return -1L;
                            }
                            a = this.f.a(c, Math.min(a, this.f.b));
                            final i d = this.d;
                            d.a += a;
                            if (this.d.a >= this.d.d.m.b() / 2) {
                                this.d.d.a(this.d.c, this.d.a);
                                this.d.a = 0L;
                            }
                            // monitorexit(this.d)
                            synchronized (this.d.d) {
                                final g d2 = this.d.d;
                                d2.k += a;
                                if (this.d.d.k >= this.d.d.m.b() / 2) {
                                    this.d.d.a(0, this.d.d.k);
                                    this.d.d.k = 0L;
                                }
                                return a;
                            }
                        }
                        throw new o(this.d.k);
                    }
                    throw new IOException("stream closed");
                }
            }
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(a)));
        }
        
        @Override
        public final s a() {
            return this.d.i;
        }
        
        final void a(final e e, long n) {
            long n2 = n;
            if (!a.a.e.i.b.c) {
                if (Thread.holdsLock(this.d)) {
                    throw new AssertionError();
                }
                n2 = n;
            }
        Label_0234:
            while (n2 > 0L) {
                while (true) {
                    while (true) {
                        Label_0235: {
                            synchronized (this.d) {
                                final boolean b = this.b;
                                n = this.f.b;
                                final long g = this.g;
                                final int n3 = 0;
                                if (n + n2 <= g) {
                                    break Label_0235;
                                }
                                final int n4 = 1;
                                // monitorexit(this.d)
                                if (n4 != 0) {
                                    e.f(n2);
                                    this.d.b(a.a.e.b.d);
                                    return;
                                }
                                if (b) {
                                    e.f(n2);
                                    return;
                                }
                                n = e.a(this.e, n2);
                                if (n != -1L) {
                                    n2 -= n;
                                    final i d = this.d;
                                    // monitorenter(this.d)
                                    int n5 = n3;
                                    try {
                                        if (this.f.b == 0L) {
                                            n5 = 1;
                                        }
                                        this.f.a(this.e);
                                        if (n5 != 0) {
                                            this.d.notifyAll();
                                        }
                                        break;
                                    }
                                    finally {
                                    }
                                    // monitorexit(this.d)
                                }
                                throw new EOFException();
                            }
                            break Label_0234;
                        }
                        final int n4 = 0;
                        continue;
                    }
                }
            }
        }
        
        @Override
        public final void close() {
            synchronized (this.d) {
                this.a = true;
                this.f.o();
                this.d.notifyAll();
                // monitorexit(this.d)
                this.d.f();
            }
        }
    }
    
    final class c extends a
    {
        final /* synthetic */ i a;
        
        c(final i a) {
            this.a = a;
            super();
        }
        
        public final IOException a(final IOException ex) {
            final SocketTimeoutException ex2 = new SocketTimeoutException("timeout");
            if (ex != null) {
                ex2.initCause(ex);
            }
            return ex2;
        }
        
        public final void a() {
            this.a.b(b.f);
        }
        
        public final void b() {
            if (!this.b_()) {
                return;
            }
            throw this.a((IOException)null);
        }
    }
}
