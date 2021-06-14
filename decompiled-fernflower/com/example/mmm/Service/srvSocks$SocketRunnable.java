package com.example.mmm.Service;

import com.example.mmm.API.SocksThread;
import com.example.mmm.Utils.utils;
import java.net.ServerSocket;
import java.net.Socket;

final class srvSocks$SocketRunnable implements Runnable {
   final srvSocks entering$;

   srvSocks$SocketRunnable(srvSocks var1) {
      this.entering$ = var1;
   }

   public final void run() {
      ServerSocket var1 = new ServerSocket(45555);
      utils var2 = this.entering$.missions$;
      String var3 = "ProxyServer";
      StringBuilder var4 = new StringBuilder();
      var4.append("Port=");
      var4.append(var1.getLocalPort());
      var2.Log(var3, var4.toString());

      while(true) {
         Socket var5 = var1.accept();
         if (Thread.currentThread().isInterrupted()) {
            var1.close();
            var5.close();
            return;
         }

         (new Thread(new SocksThread(var5))).start();
      }
   }
}
