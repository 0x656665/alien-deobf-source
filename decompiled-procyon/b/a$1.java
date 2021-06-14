package b;

import java.io.*;

final class a$1 implements q {
    final /* synthetic */ q a;
    final /* synthetic */ a b;
    
    a$1(final a b, final q a) {
        this.b = b;
        this.a = a;
        super();
    }
    
    @Override
    public final s a() {
        return this.b;
    }
    
    @Override
    public final void a_(final c c, long n) {
        t.a(c.b, 0L, n);
    Label_0066_Outer:
        while (true) {
            long n2 = 0L;
            if (n > 0L) {
                while (true) {
                    do {
                        final long n3 = n2;
                        if (n2 < 65536L) {
                            continue Label_0066_Outer;
                        }
                        this.b.a_();
                        try {
                            try {
                                this.a.a_(c, n3);
                                n -= n3;
                                this.b.a(true);
                            }
                            finally {}
                        }
                        catch (IOException ex) {
                            throw this.b.b(ex);
                        }
                        this.b.a(false);
                    } while ((n2 += c.a.c - c.a.b) < n);
                    final long n3 = n;
                    continue;
                }
            }
        }
    }
    
    @Override
    public final void close() {
        this.b.a_();
        try {
            try {
                this.a.close();
                this.b.a(true);
                return;
            }
            finally {}
        }
        catch (IOException ex) {
            throw this.b.b(ex);
        }
        this.b.a(false);
    }
    
    @Override
    public final void flush() {
        this.b.a_();
        try {
            try {
                this.a.flush();
                this.b.a(true);
                return;
            }
            finally {}
        }
        catch (IOException ex) {
            throw this.b.b(ex);
        }
        this.b.a(false);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AsyncTimeout.sink(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}