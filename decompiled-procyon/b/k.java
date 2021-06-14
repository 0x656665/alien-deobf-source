package b;

import java.io.*;
import java.net.*;
import java.util.logging.*;

public final class k
{
    static final Logger a;
    
    static {
        a = Logger.getLogger(k.class.getName());
    }
    
    private k() {
        super();
    }
    
    public static d a(final q q) {
        return new l(q);
    }
    
    public static e a(final r r) {
        return new m(r);
    }
    
    public static q a(final Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        final a c = c(socket);
        final OutputStream outputStream = socket.getOutputStream();
        if (outputStream != null) {
            return new q() {
                final /* synthetic */ q a = new q(c, outputStream) {
                    final /* synthetic */ s a;
                    final /* synthetic */ OutputStream b;
                    
                    k$1(final s a, final OutputStream b) {
                        this.a = a;
                        this.b = b;
                        super();
                    }
                    
                    @Override
                    public final s a() {
                        return this.a;
                    }
                    
                    @Override
                    public final void a_(final c c, long n) {
                        t.a(c.b, 0L, n);
                        while (n > 0L) {
                            this.a.f_();
                            final n a = c.a;
                            final int n2 = (int)Math.min(n, a.c - a.b);
                            this.b.write(a.a, a.b, n2);
                            a.b += n2;
                            final long n3 = n2;
                            final long n4 = n - n3;
                            c.b -= n3;
                            n = n4;
                            if (a.b == a.c) {
                                c.a = a.a();
                                o.a(a);
                                n = n4;
                            }
                        }
                    }
                    
                    @Override
                    public final void close() {
                        this.b.close();
                    }
                    
                    @Override
                    public final void flush() {
                        this.b.flush();
                    }
                    
                    @Override
                    public final String toString() {
                        final StringBuilder sb = new StringBuilder("sink(");
                        sb.append(this.b);
                        sb.append(")");
                        return sb.toString();
                    }
                };
                final /* synthetic */ a b;
                
                a$1() {
                    super();
                }
                
                @Override
                public final s a() {
                    return c;
                }
                
                @Override
                public final void a_(final c c, long n) {
                    t.a(c.b, 0L, n);
                Label_0066_Outer:
                    while (true) {
                        long n2 = 0L;
                        if (n > 0L) {
                            while (true) {
                                do {
                                    final long n3 = n2;
                                    if (n2 < 65536L) {
                                        continue Label_0066_Outer;
                                    }
                                    c.a_();
                                    try {
                                        try {
                                            this.a.a_(c, n3);
                                            n -= n3;
                                            c.a(true);
                                        }
                                        finally {}
                                    }
                                    catch (IOException ex) {
                                        throw c.b(ex);
                                    }
                                    c.a(false);
                                } while ((n2 += c.a.c - c.a.b) < n);
                                final long n3 = n;
                                continue;
                            }
                        }
                    }
                }
                
                @Override
                public final void close() {
                    c.a_();
                    try {
                        try {
                            this.a.close();
                            c.a(true);
                            return;
                        }
                        finally {}
                    }
                    catch (IOException ex) {
                        throw c.b(ex);
                    }
                    c.a(false);
                }
                
                @Override
                public final void flush() {
                    c.a_();
                    try {
                        try {
                            this.a.flush();
                            c.a(true);
                            return;
                        }
                        finally {}
                    }
                    catch (IOException ex) {
                        throw c.b(ex);
                    }
                    c.a(false);
                }
                
                @Override
                public final String toString() {
                    final StringBuilder sb = new StringBuilder("AsyncTimeout.sink(");
                    sb.append(this.a);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("out == null");
    }
    
    static boolean a(final AssertionError assertionError) {
        return assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains("getsockname failed");
    }
    
    public static r b(final Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        final a c = c(socket);
        final InputStream \u0131nputStream = socket.getInputStream();
        if (\u0131nputStream != null) {
            return new r() {
                final /* synthetic */ r a = new r(c, \u0131nputStream) {
                    final /* synthetic */ s a;
                    final /* synthetic */ InputStream b;
                    
                    k$2(final s a, final InputStream b) {
                        this.a = a;
                        this.b = b;
                        super();
                    }
                    
                    @Override
                    public final long a(final c c, long b) {
                        if (b >= 0L) {
                            if (b == 0L) {
                                return 0L;
                            }
                            try {
                                this.a.f_();
                                final n e = c.e(1);
                                final int read = this.b.read(e.a, e.c, (int)Math.min(b, 8192 - e.c));
                                if (read == -1) {
                                    return -1L;
                                }
                                e.c += read;
                                b = c.b;
                                final long n = read;
                                c.b = b + n;
                                return n;
                            }
                            catch (AssertionError assertionError) {
                                if (k.a(assertionError)) {
                                    throw new IOException(assertionError);
                                }
                                throw assertionError;
                            }
                        }
                        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(b)));
                    }
                    
                    @Override
                    public final s a() {
                        return this.a;
                    }
                    
                    @Override
                    public final void close() {
                        this.b.close();
                    }
                    
                    @Override
                    public final String toString() {
                        final StringBuilder sb = new StringBuilder("source(");
                        sb.append(this.b);
                        sb.append(")");
                        return sb.toString();
                    }
                };
                final /* synthetic */ a b;
                
                a$2() {
                    super();
                }
                
                @Override
                public final long a(final c c, long a) {
                    c.a_();
                    try {
                        try {
                            a = this.a.a(c, a);
                            c.a(true);
                            return a;
                        }
                        finally {}
                    }
                    catch (IOException ex) {
                        throw c.b(ex);
                    }
                    c.a(false);
                }
                
                @Override
                public final s a() {
                    return c;
                }
                
                @Override
                public final void close() {
                    try {
                        try {
                            this.a.close();
                            c.a(true);
                            return;
                        }
                        finally {}
                    }
                    catch (IOException ex) {
                        throw c.b(ex);
                    }
                    c.a(false);
                }
                
                @Override
                public final String toString() {
                    final StringBuilder sb = new StringBuilder("AsyncTimeout.source(");
                    sb.append(this.a);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("in == null");
    }
    
    private static a c(final Socket socket) {
        return new a() {
            final /* synthetic */ Socket a;
            
            k$3() {
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
                    socket.close();
                }
                catch (AssertionError assertionError) {
                    if (k.a(assertionError)) {
                        final Logger a = k.a;
                        final Level warn\u0131ng = Level.WARNING;
                        final StringBuilder sb = new StringBuilder("Failed to close timed out socket ");
                        sb.append(socket);
                        a.log(warn\u0131ng, sb.toString(), assertionError);
                        return;
                    }
                    throw assertionError;
                }
                catch (Exception ex) {
                    final Logger a2 = k.a;
                    final Level warn\u0131ng2 = Level.WARNING;
                    final StringBuilder sb2 = new StringBuilder("Failed to close timed out socket ");
                    sb2.append(socket);
                    a2.log(warn\u0131ng2, sb2.toString(), ex);
                }
            }
        };
    }
}
