/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.c;
import a.t;
import b.e;
import java.io.Closeable;
import java.nio.charset.Charset;

public abstract class aa
implements Closeable {
    public static aa a(byte[] arrby) {
        b.c c2 = new b.c().a(arrby);
        long l2 = arrby.length;
        if (c2 == null) throw new NullPointerException("source == null");
        return new aa(l2, c2){
            final /* synthetic */ t a;
            final /* synthetic */ long b;
            final /* synthetic */ e c;
            {
                this.a = null;
                this.b = l2;
                this.c = e2;
            }

            @Override
            public final t a() {
                return this.a;
            }

            @Override
            public final long b() {
                return this.b;
            }

            @Override
            public final e c() {
                return this.c;
            }
        };
    }

    public abstract t a();

    public abstract long b();

    public abstract e c();

    @Override
    public void close() {
        c.a(this.c());
    }

    public final String d() {
        e e2 = this.c();
        try {
            Object object;
            t t2 = this.a();
            if (t2 != null) {
                object = c.e;
                if (t2.a != null) {
                    object = Charset.forName(t2.a);
                }
            } else {
                object = c.e;
            }
            object = e2.a(c.a(e2, (Charset)object));
            return object;
        }
        finally {
            c.a(e2);
        }
    }

}

