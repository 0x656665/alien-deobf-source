package com.example.mmm.Activity;

import com.example.mmm.Utils.utils;

final class actViewInjection$StopThread implements Runnable {
   final actViewInjection kevin$;

   actViewInjection$StopThread(actViewInjection var1) {
      super.kevin$ = var1;
      super();
   }

   public final void run() {
      int var1 = 0;

      while(true) {
         boolean var10001 = true;
         utils.chalkTile(1000);
         if (actViewInjection.d(super.kevin$)) {
            return;
         }

         var10001 = true;
         ++var1;
      }
   }
}
