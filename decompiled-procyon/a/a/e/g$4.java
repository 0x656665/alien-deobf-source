package a.a.e;

import a.a.*;
import java.util.*;
import java.io.*;

final class g$4 extends b {
    final /* synthetic */ int a;
    final /* synthetic */ List c;
    final /* synthetic */ g d;
    
    g$4(final g d, final String s, final Object[] array, final int a, final List c) {
        this.d = d;
        this.a = a;
        this.c = c;
        super(s, array);
    }
    
    public final void blockBack2() {
        try {
            this.d.q.a(this.a, b.f);
            synchronized (this.d) {
                this.d.s.remove(this.a);
            }
        }
        catch (IOException ex) {}
    }
}