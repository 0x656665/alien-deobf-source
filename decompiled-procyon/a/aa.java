package a;

import java.io.*;
import b.*;
import java.nio.charset.*;

public abstract class aa implements Closeable
{
    public aa() {
        super();
    }
    
    public static aa a(final byte[] array) {
        final c a = new c().a(array);
        final long n = array.length;
        if (a != null) {
            return new aa() {
                final /* synthetic */ t a;
                final /* synthetic */ long b;
                final /* synthetic */ e c = a;
                
                aa$1() {
                    this.a = null;
                    super();
                }
                
                @Override
                public final t a() {
                    return this.a;
                }
                
                @Override
                public final long b() {
                    return n;
                }
                
                @Override
                public final e c() {
                    return this.c;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
    
    public abstract t a();
    
    public abstract long b();
    
    public abstract e c();
    
    @Override
    public void close() {
        a.a.c.a(this.c());
    }
    
    public final String d() {
        final e c = this.c();
        try {
            final t a = this.a();
            Charset charset;
            if (a != null) {
                charset = a.a.c.e;
                if (a.a != null) {
                    charset = Charset.forName(a.a);
                }
            }
            else {
                charset = a.a.c.e;
            }
            return c.a(a.a.c.a(c, charset));
        }
        finally {
            a.a.c.a(c);
        }
    }
}
