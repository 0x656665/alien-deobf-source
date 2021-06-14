package a.a.e;

public final class n
{
    int a;
    final int[] b;
    
    public n() {
        super();
        this.b = new int[10];
    }
    
    final int a() {
        if ((this.a & 0x2) != 0x0) {
            return this.b[1];
        }
        return -1;
    }
    
    final n a(final int n, final int n2) {
        if (n >= this.b.length) {
            return this;
        }
        this.a |= 1 << n;
        this.b[n] = n2;
        return this;
    }
    
    final boolean a(final int n) {
        return (1 << n & this.a) != 0x0;
    }
    
    public final int b() {
        if ((this.a & 0x80) != 0x0) {
            return this.b[7];
        }
        return 65535;
    }
}
