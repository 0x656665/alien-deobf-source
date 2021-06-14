package a;

import java.net.*;

public final class ab
{
    public final a a;
    public final Proxy b;
    public final InetSocketAddress c;
    
    public ab(final a a, final Proxy b, final InetSocketAddress c) {
        super();
        if (a == null) {
            throw new NullPointerException("address == null");
        }
        if (b == null) {
            throw new NullPointerException("proxy == null");
        }
        if (c != null) {
            this.a = a;
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("inetSocketAddress == null");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof ab) {
            final ab ab = (ab)o;
            return this.a.equals(ab.a) && this.b.equals(ab.b) && this.c.equals(ab.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Route{");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
