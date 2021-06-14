/*
 * Decompiled with CFR <Could not determine version>.
 */
package com.example.mmm.Service;

import com.example.mmm.API.SocksThread;
import com.example.mmm.Service.srvSocks;
import com.example.mmm.Utils.utils;
import java.net.ServerSocket;
import java.net.Socket;

final class srvSocks$SocketRunnable
implements Runnable {
    final srvSocks entering$;

    srvSocks$SocketRunnable(srvSocks srvSocks2) {
        this.entering$ = srvSocks2;
    }

    @Override
    public final void run() {
        ServerSocket serverSocket = new ServerSocket(45555);
        Object object = this.entering$.missions$;
        String string = "ProxyServer";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Port=");
        stringBuilder.append(serverSocket.getLocalPort());
        ((utils)object).Log(string, stringBuilder.toString());
        do {
            object = serverSocket.accept();
            if (Thread.currentThread().isInterrupted()) {
                serverSocket.close();
                ((Socket)object).close();
                return;
            }
            new Thread(new SocksThread((Socket)object)).start();
        } while (true);
    }
}

