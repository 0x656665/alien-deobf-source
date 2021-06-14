package a;

public static final class a
{
    boolean a;
    String[] b;
    String[] c;
    boolean d;
    
    public a(final j j) {
        super();
        this.a = j.d;
        this.b = j.f;
        this.c = j.g;
        this.d = j.e;
    }
    
    a(final boolean a) {
        super();
        this.a = a;
    }
    
    public final a a() {
        if (this.a) {
            this.d = true;
            return this;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }
    
    public final a a(final ac... array) {
        if (this.a) {
            final String[] array2 = new String[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i].f;
            }
            return this.b(array2);
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }
    
    public final a a(final String... array) {
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (array.length != 0) {
            this.b = array.clone();
            return this;
        }
        throw new IllegalArgumentException("At least one cipher suite is required");
    }
    
    public final a b(final String... array) {
        if (!this.a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (array.length != 0) {
            this.c = array.clone();
            return this;
        }
        throw new IllegalArgumentException("At least one TLS version is required");
    }
    
    public final j b() {
        return new j(this);
    }
}
