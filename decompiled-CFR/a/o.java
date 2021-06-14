/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.c;
import a.r;
import a.t;
import a.y;
import b.d;
import java.util.ArrayList;
import java.util.List;

public final class o
extends y {
    private static final t a = t.a("application/x-www-form-urlencoded");
    private final List<String> b;
    private final List<String> c;

    public o(List<String> list, List<String> list2) {
        this.b = c.a(list);
        this.c = c.a(list2);
    }

    private long a(d d2, boolean bl) {
        d2 = bl ? new b.c() : d2.b();
        int n2 = 0;
        int n3 = this.b.size();
        do {
            if (n2 >= n3) {
                if (!bl) return 0L;
                long l2 = ((b.c)d2).b;
                ((b.c)d2).o();
                return l2;
            }
            if (n2 > 0) {
                ((b.c)d2).b(38);
            }
            ((b.c)d2).a(this.b.get(n2));
            ((b.c)d2).b(61);
            ((b.c)d2).a(this.c.get(n2));
            ++n2;
        } while (true);
    }

    @Override
    public final t a() {
        return a;
    }

    @Override
    public final void a(d d2) {
        this.a(d2, false);
    }

    @Override
    public final long b() {
        return this.a(null, true);
    }

    public static final class a {
        public final List<String> a = new ArrayList<String>();
        public final List<String> b = new ArrayList<String>();

        public final a a(String string, String string2) {
            this.a.add(r.a(string, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            this.b.add(r.a(string2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            return this;
        }
    }

}

