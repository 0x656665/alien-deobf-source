package a;

import java.io.*;

public enum v
{
    a("http/1.0"), 
    b("http/1.1"), 
    c("spdy/3.1"), 
    d("h2");
    
    private static final /* synthetic */ v[] f;
    private final String e;
    
    static {
        f = new v[] { v.a, v.b, v.c, v.d };
    }
    
    private v(final String e) {
        this.e = e;
    }
    
    public static v a(final String s) {
        if (s.equals(v.a.e)) {
            return v.a;
        }
        if (s.equals(v.b.e)) {
            return v.b;
        }
        if (s.equals(v.d.e)) {
            return v.d;
        }
        if (s.equals(v.c.e)) {
            return v.c;
        }
        throw new IOException("Unexpected protocol: ".concat(String.valueOf(s)));
    }
    
    public static v valueOf(final String s) {
        return Enum.valueOf(v.class, s);
    }
    
    public static v[] values() {
        return v.f.clone();
    }
    
    @Override
    public final String toString() {
        return this.e;
    }
}
