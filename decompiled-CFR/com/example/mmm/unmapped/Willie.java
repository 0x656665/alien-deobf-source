/*
 * Decompiled with CFR <Could not determine version>.
 */
package com.example.mmm.unmapped;

import com.example.mmm.Service.srvAntiSleep;
import com.example.mmm.Utils.utils;
import com.example.mmm.unmapped.Geri;

final class Willie
implements Runnable {
    final srvAntiSleep riders$;

    Willie(srvAntiSleep srvAntiSleep2) {
        this.riders$ = srvAntiSleep2;
    }

    @Override
    public final void run() {
        while (srvAntiSleep.a(this.riders$)) {
            Geri geri;
            srvAntiSleep srvAntiSleep2 = this.riders$;
            if (geri._blood((String)((Object)geri), "{'null':'null'}").isEmpty()) {
                ((utils)((Object)srvAntiSleep2)).Log((String)((Object)srvAntiSleep2), "empty response");
            }
            Thread.sleep(60000L);
            this.riders$.utl.Log("EndLess", "End of the loop for the service");
        }
    }
}

