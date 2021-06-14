/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a;
import java.net.InetSocketAddress;
import java.net.Proxy;

public final class ab {
    public final a a;
    public final Proxy b;
    public final InetSocketAddress c;

    public ab(a a2, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (a2 == null) throw new NullPointerException("address == null");
        if (proxy == null) throw new NullPointerException("proxy == null");
        if (inetSocketAddress == null) throw new NullPointerException("inetSocketAddress == null");
        this.a = a2;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof ab)) return false;
        object = (ab)object;
        if (!this.a.equals(((ab)object).a)) return false;
        if (!this.b.equals(((ab)object).b)) return false;
        if (!this.c.equals(((ab)object).c)) return false;
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Route{");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

