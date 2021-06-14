package a.a.e;

import a.a.*;
import a.a.g.*;
import java.io.*;

final class g$c$1 extends b {
    final /* synthetic */ i a;
    final /* synthetic */ c c;
    
    g$c$1(final c c, final String s, final Object[] array, final i a) {
        this.c = c;
        this.a = a;
        super(s, array);
    }
    
    public final void blockBack2() {
        try {
            this.c.c.c.a(this.a);
        }
        catch (IOException ex) {
            final e b = e.b();
            final StringBuilder sb = new StringBuilder("Http2Connection.Listener failure for ");
            sb.append(this.c.c.e);
            b.a(4, sb.toString(), ex);
            try {
                this.a.a(a.a.e.b.b);
            }
            catch (IOException ex2) {}
        }
    }
}