/*
 * Decompiled with CFR <Could not determine version>.
 */
package com.example.mmm.unmapped;

import java.io.InputStream;
import java.io.OutputStream;

public final class Hollyanne
extends Thread {
    private InputStream actors$;
    private OutputStream response$;
    private int jacob$ = 102400;

    public Hollyanne(InputStream inputStream, OutputStream outputStream) {
        this.actors$ = inputStream;
        this.response$ = outputStream;
    }

    @Override
    public final void run() {
        byte[] arrby = new byte[this.jacob$];
        int n2 = 0;
        do {
            int n3;
            if ((n3 = this.actors$.read(arrby, 0, this.jacob$)) > 0) {
                this.response$.write(arrby, 0, n3);
            }
            this.response$.flush();
            n2 = n3;
        } while (true);
    }
}

