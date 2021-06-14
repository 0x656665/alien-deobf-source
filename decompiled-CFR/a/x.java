/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.c.f;
import a.d;
import a.q;
import a.r;
import a.y;

public final class x {
    public final r a;
    public final String b;
    public final q c;
    public final y d;
    final Object e;
    private volatile d f;

    x(a object) {
        this.a = ((a)object).a;
        this.b = ((a)object).b;
        this.c = ((a)object).c.a();
        this.d = ((a)object).d;
        object = ((a)object).e != null ? ((a)object).e : this;
        this.e = object;
    }

    public final a a() {
        return new a(this);
    }

    public final String a(String string) {
        return this.c.a(string);
    }

    public final d b() {
        d d2 = this.f;
        if (d2 != null) {
            return d2;
        }
        this.f = d2 = d.a(this.c);
        return d2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Request{method=");
        stringBuilder.append(this.b);
        stringBuilder.append(", url=");
        stringBuilder.append(this.a);
        stringBuilder.append(", tag=");
        Object object = this.e != this ? this.e : null;
        stringBuilder.append(object);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class a {
        r a;
        String b;
        public q.a c;
        y d;
        Object e;

        public a() {
            this.b = "GET";
            this.c = new q.a();
        }

        a(x x2) {
            this.a = x2.a;
            this.b = x2.b;
            this.d = x2.d;
            this.e = x2.e;
            this.c = x2.c.a();
        }

        public final a a(r r2) {
            if (r2 == null) throw new NullPointerException("url == null");
            this.a = r2;
            return this;
        }

        public final a a(String string) {
            this.c.a(string);
            return this;
        }

        public final a a(String string, y object) {
            if (string == null) throw new NullPointerException("method == null");
            if (string.length() == 0) throw new IllegalArgumentException("method.length() == 0");
            if (object != null && !f.b(string)) {
                object = new StringBuilder("method ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" must not have a request body.");
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            if (object == null && f.a(string)) {
                object = new StringBuilder("method ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" must have a request body.");
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            this.b = string;
            this.d = object;
            return this;
        }

        public final a a(String string, String string2) {
            q.a a2 = this.c;
            q.a.b(string, string2);
            a2.a(string);
            a2.a(string, string2);
            return this;
        }

        public final x a() {
            if (this.a == null) throw new IllegalStateException("url == null");
            return new x(this);
        }
    }

}

