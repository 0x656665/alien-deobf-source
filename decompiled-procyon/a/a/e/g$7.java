package a.a.e;

import a.a.*;

final class g$7 extends b {
    final /* synthetic */ int a;
    final /* synthetic */ b c;
    final /* synthetic */ g d;
    
    g$7(final g d, final String s, final Object[] array, final int a, final b c) {
        this.d = d;
        this.a = a;
        this.c = c;
        super(s, array);
    }
    
    public final void blockBack2() {
        synchronized (this.d) {
            this.d.s.remove(this.a);
        }
    }
}