package b;

final class n
{
    final byte[] a;
    int b;
    int c;
    boolean d;
    boolean e;
    n f;
    n g;
    
    n() {
        super();
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
    
    n(final n n) {
        this(n.a, n.b, n.c);
        n.d = true;
    }
    
    n(final byte[] a, final int b, final int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = false;
        this.d = true;
    }
    
    public final n a() {
        n f;
        if (this.f != this) {
            f = this.f;
        }
        else {
            f = null;
        }
        this.g.f = this.f;
        this.f.g = this.g;
        this.f = null;
        this.g = null;
        return f;
    }
    
    public final n a(final n n) {
        n.g = this;
        n.f = this.f;
        this.f.g = n;
        return this.f = n;
    }
    
    public final void a(final n n, final int n2) {
        if (n.e) {
            if (n.c + n2 > 8192) {
                if (n.d) {
                    throw new IllegalArgumentException();
                }
                if (n.c + n2 - n.b > 8192) {
                    throw new IllegalArgumentException();
                }
                System.arraycopy(n.a, n.b, n.a, 0, n.c - n.b);
                n.c -= n.b;
                n.b = 0;
            }
            System.arraycopy(this.a, this.b, n.a, n.c, n2);
            n.c += n2;
            this.b += n2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
