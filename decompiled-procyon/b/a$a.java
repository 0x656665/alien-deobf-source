package b;

static final class a extends Thread
{
    public a() {
        super("Okio Watchdog");
        this.setDaemon(true);
    }
    
    @Override
    public final void run() {
        while (true) {
            try {
                while (true) {
                    synchronized (b.a.class) {
                        final b.a e = b.a.e();
                        if (e == null) {
                            continue;
                        }
                        if (e == b.a.f()) {
                            b.a.g();
                            return;
                        }
                        // monitorexit(a.class)
                        e.a();
                        continue;
                    }
                }
            }
            catch (InterruptedException ex) {
                continue;
            }
            break;
        }
    }
}
