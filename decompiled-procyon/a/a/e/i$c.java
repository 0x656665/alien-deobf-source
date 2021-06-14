package a.a.e;

import b.*;
import java.io.*;
import java.net.*;

final class c extends a
{
    final /* synthetic */ i a;
    
    c(final i a) {
        this.a = a;
        super();
    }
    
    public final IOException a(final IOException ex) {
        final SocketTimeoutException ex2 = new SocketTimeoutException("timeout");
        if (ex != null) {
            ex2.initCause(ex);
        }
        return ex2;
    }
    
    public final void a() {
        this.a.b(b.f);
    }
    
    public final void b() {
        if (!this.b_()) {
            return;
        }
        throw this.a((IOException)null);
    }
}
