package a.a.a;

import java.io.*;
import b.*;
import java.util.concurrent.*;

final class a$1 implements r {
    boolean a;
    final /* synthetic */ e b;
    final /* synthetic */ b c;
    final /* synthetic */ d d;
    final /* synthetic */ a e;
    
    a$1(final a e, final e b, final b c, final d d) {
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
        super();
    }
    
    @Override
    public final long a(final c c, long a) {
        try {
            a = this.b.a(c, a);
            if (a == -1L) {
                if (!this.a) {
                    this.a = true;
                    this.d.close();
                }
                return -1L;
            }
            c.a(this.d.b(), c.b - a, a);
            this.d.q();
            return a;
        }
        catch (IOException ex) {
            if (!this.a) {
                this.a = true;
            }
            throw ex;
        }
    }
    
    @Override
    public final b.s a() {
        return this.b.a();
    }
    
    @Override
    public final void close() {
        if (!this.a && !a.a.c.a(this, TimeUnit.MILLISECONDS)) {
            this.a = true;
        }
        this.b.close();
    }
}