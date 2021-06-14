package com.example.mmm.unmapped;

import java.io.InputStream;
import java.io.OutputStream;

public final class Hollyanne extends Thread {
   private InputStream actors$;
   private OutputStream response$;
   private int jacob$ = 102400;

   public Hollyanne(InputStream var1, OutputStream var2) {
      this.actors$ = var1;
      this.response$ = var2;
   }

   public final void run() {
      byte[] var4 = new byte[this.jacob$];
      boolean var1 = false;

      while(true) {
         boolean var10001 = true;
         int var2 = this.actors$.read(var4, 0, this.jacob$);
         if (var2 > 0) {
            this.response$.write(var4, 0, var2);
         }

         this.response$.flush();
      }
   }
}
