package a;

import java.io.*;

public final class z implements Closeable
{
    public final x a;
    final v b;
    public final int c;
    final String d;
    public final p e;
    public final q f;
    public final aa g;
    final z h;
    final z i;
    final z j;
    public final long k;
    public final long l;
    private volatile d m;
    
    z(final a a) {
        super();
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
        this.f = a.f.a();
        this.g = a.g;
        this.h = a.h;
        this.i = a.i;
        this.j = a.j;
        this.k = a.k;
        this.l = a.l;
    }
    
    public final a a() {
        return new a(this);
    }
    
    public final String decrypt_str(String a) {
        a = this.f.a(a);
        if (a != null) {
            return a;
        }
        return null;
    }
    
    public final d b() {
        final d m = this.m;
        if (m != null) {
            return m;
        }
        return this.m = a.d.a(this.f);
    }
    
    @Override
    public final void close() {
        this.g.close();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Response{protocol=");
        sb.append(this.b);
        sb.append(", code=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", url=");
        sb.append(this.a.a);
        sb.append('}');
        return sb.toString();
    }
    
    public static final class a
    {
        public x a;
        public v b;
        public int c;
        public String d;
        public p e;
        q.a f;
        public aa g;
        z h;
        z i;
        public z j;
        public long k;
        public long l;
        
        public a() {
            super();
            this.c = -1;
            this.f = new q.a();
        }
        
        a(final z z) {
            super();
            this.c = -1;
            this.a = z.a;
            this.b = z.b;
            this.c = z.c;
            this.d = z.d;
            this.e = z.e;
            this.f = z.f.a();
            this.g = z.g;
            this.h = z.h;
            this.i = z.i;
            this.j = z.j;
            this.k = z.k;
            this.l = z.l;
        }
        
        private static void a(final String s, final z z) {
            if (z.g != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            }
            if (z.h != null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            }
            if (z.i != null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(s);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            }
            if (z.j == null) {
                return;
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(s);
            sb4.append(".priorResponse != null");
            throw new IllegalArgumentException(sb4.toString());
        }
        
        public final a a(final q q) {
            this.f = q.a();
            return this;
        }
        
        public final a a(final z h) {
            if (h != null) {
                a("networkResponse", h);
            }
            this.h = h;
            return this;
        }
        
        public final a a(final String s, final String s2) {
            final q.a f = this.f;
            q.a.b(s, s2);
            f.a(s, s2);
            return this;
        }
        
        public final z a() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.c >= 0) {
                return new z(this);
            }
            final StringBuilder sb = new StringBuilder("code < 0: ");
            sb.append(this.c);
            throw new IllegalStateException(sb.toString());
        }
        
        public final a b(final z i) {
            if (i != null) {
                a("cacheResponse", i);
            }
            this.i = i;
            return this;
        }
    }
}
