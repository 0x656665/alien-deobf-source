package com.example.mmm.Service;

import com.example.mmm.API.*;
import com.example.mmm.Utils.*;
import java.net.*;

final class srvSocks$SocketRunnable implements Runnable
{
    final srvSocks entering$;
    
    srvSocks$SocketRunnable(final srvSocks entering$) {
        this.entering$ = entering$;
        super();
    }
    
    @Override
    public final void run() {
        final ServerSocket serverSocket = new ServerSocket(45555);
        final utils missions$ = this.entering$.missions$;
        final String s = "ProxyServer";
        final StringBuilder sb = new StringBuilder();
        sb.append("Port=");
        sb.append(serverSocket.getLocalPort());
        missions$.Log(s, sb.toString());
        Socket accept;
        while (true) {
            accept = serverSocket.accept();
            if (Thread.currentThread().isInterrupted()) {
                break;
            }
            new Thread(new SocksThread(accept)).start();
        }
        serverSocket.close();
        accept.close();
    }
}
