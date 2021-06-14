package com.example.mmm.Service;

import com.example.mmm.Utils.*;

final class srvNetworkConnect$Thread implements Runnable
{
    final srvNetworkConnect headers$;
    
    srvNetworkConnect$Thread(final srvNetworkConnect headers$) {
        this.headers$ = headers$;
        super();
    }
    
    @Override
    public final void run() {
        int n = 0;
        while (true) {
            utils.chalkTile(3000);
            ++n;
        }
    }
}
