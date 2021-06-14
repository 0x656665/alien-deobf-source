package b;

import java.io.*;

final class a$2 implements r {
    final /* synthetic */ r a;
    final /* synthetic */ a b;
    
    a$2(final a b, final r a) {
        this.b = b;
        this.a = a;
        super();
    }
    
    @Override
    public final long a(final c c, long a) {
        this.b.a_();
        try {
            try {
                a = this.a.a(c, a);
                this.b.a(true);
                return a;
            }
            finally {}
        }
        catch (IOException ex) {
            throw this.b.b(ex);
        }
        this.b.a(false);
    }
    
    @Override
    public final s a() {
        return this.b;
    }
    
    @Override
    public final void close() {
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
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AsyncTimeout.source(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}