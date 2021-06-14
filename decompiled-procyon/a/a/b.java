package a.a;

public abstract class b implements Runnable
{
    protected final String b;
    
    public b(final String s, final Object... array) {
        super();
        this.b = c.a(s, array);
    }
    
    protected abstract void blockBack2();
    
    @Override
    public final void run() {
        final String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.b);
        try {
            this.blockBack2();
        }
        finally {
            Thread.currentThread().setName(name);
        }
    }
}
