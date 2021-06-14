package a;

import b.*;

static final class b
{
    final String a;
    final String b;
    final String c;
    final b.f d;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof b) {
            final String a = this.a;
            final b b = (b)o;
            if (a.equals(b.a) && this.c.equals(b.c) && this.d.equals(b.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(this.d.b());
        return sb.toString();
    }
}
