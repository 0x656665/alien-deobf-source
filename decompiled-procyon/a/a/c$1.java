package a.a;

import java.util.concurrent.*;

static final class c$1 implements ThreadFactory {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    
    c$1(final String a, final boolean b) {
        this.a = a;
        this.b = b;
        super();
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = new Thread(runnable, this.a);
        thread.setDaemon(this.b);
        return thread;
    }
}