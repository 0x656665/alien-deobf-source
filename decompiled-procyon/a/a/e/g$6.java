package a.a.e;

import a.a.*;
import b.*;
import java.io.*;

final class g$6 extends b {
    final /* synthetic */ int a;
    final /* synthetic */ b.c c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ g f;
    
    g$6(final g f, final String s, final Object[] array, final int a, final b.c c, final int d, final boolean e) {
        this.f = f;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        super(s, array);
    }
    
    public final void blockBack2() {
        try {
            this.f.j.a(this.c, this.d);
            this.f.q.a(this.a, b.f);
            synchronized (this.f) {
                this.f.s.remove(this.a);
            }
        }
        catch (IOException ex) {}
    }
}