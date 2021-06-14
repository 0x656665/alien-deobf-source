package com.example.mmm.unmapped;

import java.io.*;

public final class Hollyanne extends Thread
{
    private InputStream actors$;
    private OutputStream response$;
    private int jacob$;
    
    public Hollyanne(final InputStream actors$, final OutputStream response$) {
        super();
        this.jacob$ = 102400;
        this.actors$ = actors$;
        this.response$ = response$;
    }
    
    @Override
    public final void run() {
        final byte[] array = new byte[this.jacob$];
        while (true) {
            final int read = this.actors$.read(array, 0, this.jacob$);
            if (read > 0) {
                this.response$.write(array, 0, read);
            }
            this.response$.flush();
        }
    }
}
