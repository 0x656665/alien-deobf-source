package a.a.e;

public enum b
{
    a(0), 
    b(1), 
    c(2), 
    d(3), 
    e(7), 
    f(8);
    
    private static final /* synthetic */ b[] h;
    public final int g;
    
    static {
        h = new b[] { b.a, b.b, b.c, b.d, b.e, b.f };
    }
    
    private b(final int g) {
        this.g = g;
    }
    
    public static b a(final int n) {
        final b[] values = values();
        for (int length = values.length, i = 0; i < length; ++i) {
            final b b = values[i];
            if (b.g == n) {
                return b;
            }
        }
        return null;
    }
    
    public static b valueOf(final String s) {
        return Enum.valueOf(b.class, s);
    }
    
    public static b[] values() {
        return b.h.clone();
    }
}
