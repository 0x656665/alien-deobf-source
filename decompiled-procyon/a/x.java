package a;

import a.a.c.*;

public final class x
{
    public final r a;
    public final String b;
    public final q c;
    public final y d;
    final Object e;
    private volatile d f;
    
    x(final a a) {
        super();
        this.a = a.a;
        this.b = a.b;
        this.c = a.c.a();
        this.d = a.d;
        Object e;
        if (a.e != null) {
            e = a.e;
        }
        else {
            e = this;
        }
        this.e = e;
    }
    
    public final a a() {
        return new a(this);
    }
    
    public final String a(final String s) {
        return this.c.a(s);
    }
    
    public final d b() {
        final d f = this.f;
        if (f != null) {
            return f;
        }
        return this.f = a.d.a(this.c);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        sb.append(", tag=");
        Object e;
        if (this.e != this) {
            e = this.e;
        }
        else {
            e = null;
        }
        sb.append(e);
        sb.append('}');
        return sb.toString();
    }
    
    public static final class a
    {
        r a;
        String b;
        public q.a c;
        y d;
        Object e;
        
        public a() {
            super();
            this.b = "GET";
            this.c = new q.a();
        }
        
        a(final x x) {
            super();
            this.a = x.a;
            this.b = x.b;
            this.d = x.d;
            this.e = x.e;
            this.c = x.c.a();
        }
        
        public final a a(final r a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("url == null");
        }
        
        public final a a(final String s) {
            this.c.a(s);
            return this;
        }
        
        public final a a(final String b, final y d) {
            if (b == null) {
                throw new NullPointerException("method == null");
            }
            if (b.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (d != null && !a.a.c.f.b(b)) {
                final StringBuilder sb = new StringBuilder("method ");
                sb.append(b);
                sb.append(" must not have a request body.");
                throw new IllegalArgumentException(sb.toString());
            }
            if (d == null && a.a.c.f.a(b)) {
                final StringBuilder sb2 = new StringBuilder("method ");
                sb2.append(b);
                sb2.append(" must have a request body.");
                throw new IllegalArgumentException(sb2.toString());
            }
            this.b = b;
            this.d = d;
            return this;
        }
        
        public final a a(final String s, final String s2) {
            final q.a c = this.c;
            q.a.b(s, s2);
            c.a(s);
            c.a(s, s2);
            return this;
        }
        
        public final x a() {
            if (this.a != null) {
                return new x(this);
            }
            throw new IllegalStateException("url == null");
        }
    }
}
