package a;

import a.a.*;
import b.*;
import java.util.*;

public final class o extends y
{
    private static final t a;
    private final List<String> b;
    private final List<String> c;
    
    static {
        a = t.a("application/x-www-form-urlencoded");
    }
    
    public o(final List<String> list, final List<String> list2) {
        super();
        this.b = a.a.c.a(list);
        this.c = a.a.c.a(list2);
    }
    
    private long a(final d d, final boolean b) {
        b.c b2;
        if (b) {
            b2 = new b.c();
        }
        else {
            b2 = d.b();
        }
        for (int i = 0; i < this.b.size(); ++i) {
            if (i > 0) {
                b2.b(38);
            }
            b2.a(this.b.get(i));
            b2.b(61);
            b2.a(this.c.get(i));
        }
        if (b) {
            final long b3 = b2.b;
            b2.o();
            return b3;
        }
        return 0L;
    }
    
    @Override
    public final t a() {
        return o.a;
    }
    
    @Override
    public final void a(final d d) {
        this.a(d, false);
    }
    
    @Override
    public final long b() {
        return this.a(null, true);
    }
    
    public static final class a
    {
        public final List<String> a;
        public final List<String> b;
        
        public a() {
            super();
            this.a = new ArrayList<String>();
            this.b = new ArrayList<String>();
        }
        
        public final a a(final String s, final String s2) {
            this.a.add(r.a(s, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            this.b.add(r.a(s2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            return this;
        }
    }
}
