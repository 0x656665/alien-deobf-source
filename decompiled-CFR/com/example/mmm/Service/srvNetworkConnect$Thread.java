/*
 * Decompiled with CFR <Could not determine version>.
 */
package com.example.mmm.Service;

import com.example.mmm.Service.srvNetworkConnect;
import com.example.mmm.Utils.utils;

final class srvNetworkConnect$Thread
implements Runnable {
    final srvNetworkConnect headers$;

    srvNetworkConnect$Thread(srvNetworkConnect srvNetworkConnect2) {
        this.headers$ = srvNetworkConnect2;
    }

    @Override
    public final void run() {
        int n2 = 0;
        do {
            utils.chalkTile(3000);
            ++n2;
        } while (true);
    }
}

