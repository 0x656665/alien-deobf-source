package com.example.mmm.unmapped;

import com.example.mmm.Service.*;
import com.example.mmm.Utils.*;

final class Willie implements Runnable
{
    final srvAntiSleep riders$;
    
    Willie(final srvAntiSleep riders$) {
        this.riders$ = riders$;
        super();
    }
    
    @Override
    public final void run() {
        while (srvAntiSleep.a(this.riders$)) {
            final srvAntiSleep riders$ = this.riders$;
            final Geri geri = new(com.example.mmm.unmapped.Geri.class);
            if (geri._blood((String)geri, "{'null':'null'}").isEmpty()) {
                ((utils)riders$).Log((String)riders$, "empty response");
            }
            Thread.sleep(60000L);
            this.riders$.utl.Log("EndLess", "End of the loop for the service");
        }
    }
}
