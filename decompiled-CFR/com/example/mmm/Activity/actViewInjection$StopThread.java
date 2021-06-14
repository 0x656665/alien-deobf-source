/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  com.example.mmm.actViewInjection
 *  com.example.mmm.actViewInjection$StopThread
 */
package com.example.mmm.Activity;

import com.example.mmm.Utils.utils;
import com.example.mmm.actViewInjection;

final class actViewInjection$StopThread
implements Runnable {
    final com.example.mmm.Activity.actViewInjection kevin$;

    actViewInjection$StopThread(com.example.mmm.Activity.actViewInjection actViewInjection2) {
        ((actViewInjection.StopThread)this).kevin$ = actViewInjection2;
    }

    @Override
    public final void run() {
        int n2 = 0;
        do {
            utils.chalkTile(1000);
            if (com.example.mmm.Activity.actViewInjection.d(((actViewInjection.StopThread)this).kevin$)) return;
            ++n2;
        } while (true);
    }
}

