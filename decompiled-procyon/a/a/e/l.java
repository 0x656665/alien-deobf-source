package a.a.e;

import java.util.concurrent.*;

final class l
{
    final CountDownLatch a;
    long b;
    long c;
    
    l() {
        super();
        this.a = new CountDownLatch(1);
        this.b = -1L;
        this.c = -1L;
    }
    
    final void a() {
        if (this.c == -1L && this.b != -1L) {
            this.c = this.b - 1L;
            this.a.countDown();
            return;
        }
        throw new IllegalStateException();
    }
}
