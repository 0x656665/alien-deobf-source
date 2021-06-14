package com.example.mmm.unmapped;

import com.example.mmm.Service.srvAntiSleep;

final class Willie implements Runnable {
   final srvAntiSleep riders$;

   Willie(srvAntiSleep var1) {
      this.riders$ = var1;
   }

   public final void run() {
      while(srvAntiSleep.a(this.riders$)) {
         srvAntiSleep var1 = this.riders$;
         Geri var10000 = new Geri;
         if (var10000._blood(var10000, "{'null':'null'}").isEmpty()) {
            var1.Log(var1, "empty response");
         }

         Thread.sleep(60000L);
         this.riders$.utl.Log("EndLess", "End of the loop for the service");
      }

   }
}
