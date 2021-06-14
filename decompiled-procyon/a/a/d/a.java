package a.a.d;

import a.a.b.*;
import java.io.*;
import a.*;
import b.*;
import a.a.c.*;
import java.net.*;
import java.util.concurrent.*;

public final class a implements a.a.c.c
{
    final u a;
    final g b;
    final b.e c;
    final b.d d;
    int e;
    
    public a(final u a, final g b, final b.e c, final b.d d) {
        super();
        this.e = 0;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    static void a(final h h) {
        final s a = h.a;
        final s b = s.b;
        if (b != null) {
            h.a = b;
            a.e_();
            a.d();
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
    
    @Override
    public final aa a(final z z) {
        r r;
        if (!a.a.c.e.b(z)) {
            r = this.a(0L);
        }
        else if ("chunked".equalsIgnoreCase(z.decrypt_str("Transfer-Encoding"))) {
            final a.r a = z.a.a;
            if (this.e != 4) {
                final StringBuilder sb = new StringBuilder("state: ");
                sb.append(this.e);
                throw new IllegalStateException(sb.toString());
            }
            this.e = 5;
            r = new c(a);
        }
        else {
            final long a2 = a.a.c.e.a(z);
            if (a2 != -1L) {
                r = this.a(a2);
            }
            else {
                if (this.e != 4) {
                    final StringBuilder sb2 = new StringBuilder("state: ");
                    sb2.append(this.e);
                    throw new IllegalStateException(sb2.toString());
                }
                if (this.b == null) {
                    throw new IllegalStateException("streamAllocation == null");
                }
                this.e = 5;
                this.b.d();
                r = new f();
            }
        }
        return new a.a.c.h(z.f, k.a(r));
    }
    
    @Override
    public final z.a a(final boolean b) {
        if (this.e != 1) {
            if (this.e != 3) {
                final StringBuilder sb = new StringBuilder("state: ");
                sb.append(this.e);
                throw new IllegalStateException(sb.toString());
            }
        }
        try {
            final a.a.c.k a = a.a.c.k.a(this.c.m());
            final z.a a2 = new z.a();
            a2.b = a.a;
            a2.c = a.b;
            a2.d = a.c;
            final z.a a3 = a2.a(this.c());
            if (b && a.b == 100) {
                return null;
            }
            this.e = 4;
            return a3;
        }
        catch (EOFException ex2) {
            final StringBuilder sb2 = new StringBuilder("unexpected end of stream on ");
            sb2.append(this.b);
            final IOException ex = new IOException(sb2.toString());
            ex.initCause(ex2);
            throw ex;
        }
    }
    
    @Override
    public final q a(final x x, final long n) {
        if ("chunked".equalsIgnoreCase(x.a("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new b();
            }
            final StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.e);
            throw new IllegalStateException(sb.toString());
        }
        else {
            if (n == -1L) {
                throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
            }
            if (this.e == 1) {
                this.e = 2;
                return new d(n);
            }
            final StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.e);
            throw new IllegalStateException(sb2.toString());
        }
    }
    
    public final r a(final long n) {
        if (this.e == 4) {
            this.e = 5;
            return new e(n);
        }
        final StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.e);
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public final void a() {
        this.d.flush();
    }
    
    public final void a(final a.q q, final String s) {
        if (this.e == 0) {
            this.d.b(s).b("\r\n");
            for (int i = 0; i < q.a.length / 2; ++i) {
                this.d.b(q.a(i)).b(": ").b(q.b(i)).b("\r\n");
            }
            this.d.b("\r\n");
            this.e = 1;
            return;
        }
        final StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.e);
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public final void a(final x x) {
        final Proxy.Type type = this.b.b().a.b.type();
        final StringBuilder sb = new StringBuilder();
        sb.append(x.b);
        sb.append(' ');
        if (!x.a.b() && type == Proxy.Type.HTTP) {
            sb.append(x.a);
        }
        else {
            sb.append(i.a(x.a));
        }
        sb.append(" HTTP/1.1");
        this.a(x.c, sb.toString());
    }
    
    @Override
    public final void b() {
        this.d.flush();
    }
    
    public final a.q c() {
        final a.q.a a = new a.q.a();
        while (true) {
            final String m = this.c.m();
            if (m.length() == 0) {
                break;
            }
            a.a.a.a.a(a, m);
        }
        return a.a();
    }
    
    abstract class a implements r
    {
        protected final h a;
        protected boolean b;
        final /* synthetic */ a.a.d.a c;
        
        private a(final a.a.d.a c) {
            this.c = c;
            super();
            this.a = new h(this.c.c.a());
        }
        
        a(final a.a.d.a a, final byte b) {
            this(a);
        }
        
        @Override
        public final s a() {
            return this.a;
        }
        
        protected final void a(final boolean b) {
            if (this.c.e == 6) {
                return;
            }
            if (this.c.e == 5) {
                a.a.d.a.a(this.a);
                this.c.e = 6;
                if (this.c.b != null) {
                    this.c.b.a(b ^ true, this.c);
                }
                return;
            }
            final StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.c.e);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    final class b implements q
    {
        final /* synthetic */ a a;
        private final h b;
        private boolean c;
        
        b(final a a) {
            this.a = a;
            super();
            this.b = new h(this.a.d.a());
        }
        
        @Override
        public final s a() {
            return this.b;
        }
        
        @Override
        public final void a_(final b.c c, final long n) {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            if (n == 0L) {
                return;
            }
            this.a.d.i(n);
            this.a.d.b("\r\n");
            this.a.d.a_(c, n);
            this.a.d.b("\r\n");
        }
        
        @Override
        public final void close() {
            synchronized (this) {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.a.d.b("0\r\n\r\n");
                a.a.d.a.a(this.b);
                this.a.e = 3;
            }
        }
        
        @Override
        public final void flush() {
            synchronized (this) {
                if (this.c) {
                    return;
                }
                this.a.d.flush();
            }
        }
    }
    
    final class c extends a
    {
        final /* synthetic */ a d;
        private final a.r e;
        private long f;
        private boolean g;
        
        c(final a d, final a.r e) {
            this.d = d;
            d.super((byte)0);
            this.f = -1L;
            this.g = true;
            this.e = e;
        }
        
        @Override
        public final long a(final b.c c, long a) {
            if (a >= 0L) {
                if (!this.b) {
                    if (!this.g) {
                        return -1L;
                    }
                    Label_0186: {
                        if (this.f != 0L && this.f != -1L) {
                            break Label_0186;
                        }
                        if (this.f != -1L) {
                            this.d.c.m();
                        }
                        try {
                            this.f = this.d.c.j();
                            final String trim = this.d.c.m().trim();
                            if (this.f < 0L || (!trim.isEmpty() && !trim.startsWith(";"))) {
                                final StringBuilder sb = new StringBuilder("expected chunk size and optional extensions but was \"");
                                sb.append(this.f);
                                sb.append(trim);
                                sb.append("\"");
                                throw new ProtocolException(sb.toString());
                            }
                            if (this.f == 0L) {
                                this.g = false;
                                a.a.c.e.a(this.d.a.j, this.e, this.d.c());
                                ((a)this).a(true);
                            }
                            if (!this.g) {
                                return -1L;
                            }
                            a = this.d.c.a(c, Math.min(a, this.f));
                            if (a != -1L) {
                                this.f -= a;
                                return a;
                            }
                            ((a)this).a(false);
                            throw new ProtocolException("unexpected end of stream");
                        }
                        catch (NumberFormatException ex) {
                            throw new ProtocolException(ex.getMessage());
                        }
                    }
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(a)));
        }
        
        @Override
        public final void close() {
            if (this.b) {
                return;
            }
            if (this.g && !a.a.c.a(this, TimeUnit.MILLISECONDS)) {
                ((a)this).a(false);
            }
            this.b = true;
        }
    }
    
    final class d implements q
    {
        final /* synthetic */ a a;
        private final h b;
        private boolean c;
        private long d;
        
        d(final a a, final long d) {
            this.a = a;
            super();
            this.b = new h(this.a.d.a());
            this.d = d;
        }
        
        @Override
        public final s a() {
            return this.b;
        }
        
        @Override
        public final void a_(final b.c c, final long n) {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            a.a.c.a(c.b, n);
            if (n <= this.d) {
                this.a.d.a_(c, n);
                this.d -= n;
                return;
            }
            final StringBuilder sb = new StringBuilder("expected ");
            sb.append(this.d);
            sb.append(" bytes but received ");
            sb.append(n);
            throw new ProtocolException(sb.toString());
        }
        
        @Override
        public final void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            if (this.d <= 0L) {
                a.a.d.a.a(this.b);
                this.a.e = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }
        
        @Override
        public final void flush() {
            if (this.c) {
                return;
            }
            this.a.d.flush();
        }
    }
    
    final class e extends a
    {
        final /* synthetic */ a d;
        private long e;
        
        public e(final a d, final long e) {
            this.d = d;
            d.super((byte)0);
            this.e = e;
            if (this.e == 0L) {
                ((a)this).a(true);
            }
        }
        
        @Override
        public final long a(final b.c c, long a) {
            if (a < 0L) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(a)));
            }
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (this.e == 0L) {
                return -1L;
            }
            a = this.d.c.a(c, Math.min(this.e, a));
            if (a != -1L) {
                this.e -= a;
                if (this.e == 0L) {
                    ((a)this).a(true);
                }
                return a;
            }
            ((a)this).a(false);
            throw new ProtocolException("unexpected end of stream");
        }
        
        @Override
        public final void close() {
            if (this.b) {
                return;
            }
            if (this.e != 0L && !a.a.c.a(this, TimeUnit.MILLISECONDS)) {
                ((a)this).a(false);
            }
            this.b = true;
        }
    }
    
    final class f extends a
    {
        final /* synthetic */ a d;
        private boolean e;
        
        f(final a d) {
            this.d = d;
            d.super((byte)0);
        }
        
        @Override
        public final long a(final b.c c, long a) {
            if (a < 0L) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(a)));
            }
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (this.e) {
                return -1L;
            }
            a = this.d.c.a(c, a);
            if (a == -1L) {
                ((a)this).a(this.e = true);
                return -1L;
            }
            return a;
        }
        
        @Override
        public final void close() {
            if (this.b) {
                return;
            }
            if (!this.e) {
                ((a)this).a(false);
            }
            this.b = true;
        }
    }
}
