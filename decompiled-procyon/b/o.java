package b;

final class o
{
    static n a;
    static long b;
    
    private o() {
        super();
    }
    
    static n a() {
        synchronized (o.class) {
            if (o.a != null) {
                final n a = o.a;
                o.a = a.f;
                a.f = null;
                o.b -= 8192L;
                return a;
            }
            // monitorexit(o.class)
            return new n();
        }
    }
    
    static void a(final n a) {
        if (a.f == null && a.g == null) {
            if (a.d) {
                return;
            }
            synchronized (o.class) {
                if (o.b + 8192L > 65536L) {
                    return;
                }
                o.b += 8192L;
                a.f = o.a;
                a.c = 0;
                a.b = 0;
                o.a = a;
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
