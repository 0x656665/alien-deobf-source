package a.a.d;

import b.*;
import a.a.c.*;

abstract class a implements r
{
    protected final h a;
    protected boolean b;
    final /* synthetic */ a.a.d.a c;
    
    private a(final a.a.d.a c) {
        this.c = c;
        super();
        this.a = new h(this.c.c.a());
    }
    
    a(final a.a.d.a a, final byte b) {
        this(a);
    }
    
    @Override
    public final s a() {
        return this.a;
    }
    
    protected final void a(final boolean b) {
        if (this.c.e == 6) {
            return;
        }
        if (this.c.e == 5) {
            a.a.d.a.a(this.a);
            this.c.e = 6;
            if (this.c.b != null) {
                this.c.b.a(b ^ true, this.c);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.c.e);
        throw new IllegalStateException(sb.toString());
    }
}
