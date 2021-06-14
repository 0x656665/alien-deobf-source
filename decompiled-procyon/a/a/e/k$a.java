package a.a.e;

static final class a
{
    final a[] a;
    final int b;
    final int c;
    
    a() {
        super();
        this.a = new a[256];
        this.b = 0;
        this.c = 0;
    }
    
    a(int n, int n2) {
        super();
        this.a = null;
        this.b = n;
        n2 = (n = (n2 & 0x7));
        if (n2 == 0) {
            n = 8;
        }
        this.c = n;
    }
}
