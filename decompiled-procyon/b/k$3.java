package b;

import java.io.*;
import java.net.*;
import java.util.logging.*;

static final class k$3 extends a {
    final /* synthetic */ Socket a;
    
    k$3(final Socket a) {
        this.a = a;
        super();
    }
    
    @Override
    protected final IOException a(final IOException ex) {
        final SocketTimeoutException ex2 = new SocketTimeoutException("timeout");
        if (ex != null) {
            ex2.initCause(ex);
        }
        return ex2;
    }
    
    @Override
    protected final void a() {
        try {
            this.a.close();
        }
        catch (AssertionError assertionError) {
            if (k.a(assertionError)) {
                final Logger a = k.a;
                final Level warn\u0131ng = Level.WARNING;
                final StringBuilder sb = new StringBuilder("Failed to close timed out socket ");
                sb.append(this.a);
                a.log(warn\u0131ng, sb.toString(), assertionError);
                return;
            }
            throw assertionError;
        }
        catch (Exception ex) {
            final Logger a2 = k.a;
            final Level warn\u0131ng2 = Level.WARNING;
            final StringBuilder sb2 = new StringBuilder("Failed to close timed out socket ");
            sb2.append(this.a);
            a2.log(warn\u0131ng2, sb2.toString(), ex);
        }
    }
}