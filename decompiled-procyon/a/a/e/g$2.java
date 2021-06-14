package a.a.e;

import a.a.*;
import java.io.*;

final class g$2 extends b {
    final /* synthetic */ int a;
    final /* synthetic */ long c;
    final /* synthetic */ g d;
    
    g$2(final g d, final String s, final Object[] array, final int a, final long c) {
        this.d = d;
        this.a = a;
        this.c = c;
        super(s, array);
    }
    
    public final void blockBack2() {
        try {
            this.d.q.a(this.a, this.c);
        }
        catch (IOException ex) {}
    }
}