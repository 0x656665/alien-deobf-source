package a.a.e;

import a.a.*;
import java.io.*;

final class g$3 extends b {
    final /* synthetic */ boolean a;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ l e;
    final /* synthetic */ g f;
    
    g$3(final g f, final String s, final Object[] array, final int c, final int d) {
        this.f = f;
        this.a = true;
        this.c = c;
        this.d = d;
        this.e = null;
        super(s, array);
    }
    
    public final void blockBack2() {
        try {
            this.f.a(this.a, this.c, this.d, this.e);
        }
        catch (IOException ex) {}
    }
}