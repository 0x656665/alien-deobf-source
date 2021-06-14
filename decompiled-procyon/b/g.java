package b;

public abstract class g implements r
{
    private final r a;
    
    public g(final r a) {
        super();
        if (a != null) {
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
    
    @Override
    public final long a(final c c, final long n) {
        return this.a.a(c, n);
    }
    
    @Override
    public final s a() {
        return this.a.a();
    }
    
    @Override
    public void close() {
        this.a.close();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append("(");
        sb.append(this.a.toString());
        sb.append(")");
        return sb.toString();
    }
}
