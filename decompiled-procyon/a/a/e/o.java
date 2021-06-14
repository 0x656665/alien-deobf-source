package a.a.e;

import java.io.*;

public final class o extends IOException
{
    public final b a;
    
    public o(final b a) {
        super("stream was reset: ".concat(String.valueOf(a)));
        this.a = a;
    }
}
