package a;

final class i$1 implements Runnable {
    final /* synthetic */ i a;
    
    i$1(final i a) {
        this.a = a;
        super();
    }
    
    @Override
    public final void run() {
        while (true) {
            final long a = this.a.a(System.nanoTime());
            if (a == -1L) {
                break;
            }
            if (a <= 0L) {
                continue;
            }
            final long n = a / 1000000L;
            final i a2 = this.a;
            // monitorenter(a2)
            while (true) {
                try {
                    try {
                        this.a.wait(n, (int)(a - 1000000L * n));
                    }
                    finally {
                    }
                    // monitorexit(a2)
                    // monitorexit(a2)
                }
                catch (InterruptedException ex) {
                    continue;
                }
                break;
            }
        }
    }
}