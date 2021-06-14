package a;

import java.io.*;
import a.a.a.*;

public final class c implements Closeable, Flushable
{
    final e a;
    final d b;
    
    @Override
    public final void close() {
        this.b.close();
    }
    
    @Override
    public final void flush() {
        this.b.flush();
    }
}
