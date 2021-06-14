package a.a.e;

import a.a.*;
import java.util.*;
import java.io.*;

final class g$5 extends b {
    final /* synthetic */ int a;
    final /* synthetic */ List c;
    final /* synthetic */ boolean d;
    final /* synthetic */ g e;
    
    g$5(final g e, final String s, final Object[] array, final int a, final List c, final boolean d) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = d;
        super(s, array);
    }
    
    public final void blockBack2() {
        try {
            this.e.q.a(this.a, b.f);
            synchronized (this.e) {
                this.e.s.remove(this.a);
            }
        }
        catch (IOException ex) {}
    }
}