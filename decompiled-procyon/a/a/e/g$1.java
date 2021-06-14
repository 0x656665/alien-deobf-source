package a.a.e;

import a.a.*;
import java.io.*;

final class g$1 extends b {
    final /* synthetic */ int a;
    final /* synthetic */ b c;
    final /* synthetic */ g d;
    
    g$1(final g d, final String s, final Object[] array, final int a, final b c) {
        this.d = d;
        this.a = a;
        this.c = c;
        super(s, array);
    }
    
    public final void blockBack2() {
        try {
            this.d.b(this.a, this.c);
        }
        catch (IOException ex) {}
    }
}