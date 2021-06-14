/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import b.a;
import b.c;
import b.d;
import b.e;
import b.l;
import b.m;
import b.n;
import b.o;
import b.q;
import b.r;
import b.s;
import b.t;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class k {
    static final Logger a = Logger.getLogger(k.class.getName());

    private k() {
    }

    public static d a(q q2) {
        return new l(q2);
    }

    public static e a(r r2) {
        return new m(r2);
    }

    public static q a(Socket closeable) {
        if (closeable == null) throw new IllegalArgumentException("socket == null");
        final a a2 = k.c(closeable);
        if ((closeable = closeable.getOutputStream()) == null) throw new IllegalArgumentException("out == null");
        return new q(new q((OutputStream)closeable){
            final /* synthetic */ OutputStream b;
            {
                this.b = outputStream;
            }

            @Override
            public final s a() {
                return a2;
            }

            @Override
            public final void a_(c c2, long l2) {
                t.a(c2.b, 0L, l2);
                while (l2 > 0L) {
                    a2.f_();
                    n n2 = c2.a;
                    int n3 = (int)Math.min(l2, (long)(n2.c - n2.b));
                    this.b.write(n2.a, n2.b, n3);
                    n2.b += n3;
                    long l3 = n3;
                    long l4 = l2 - l3;
                    c2.b -= l3;
                    l2 = l4;
                    if (n2.b != n2.c) continue;
                    c2.a = n2.a();
                    o.a(n2);
                    l2 = l4;
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

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("sink(");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }){
            final /* synthetic */ q a;
            {
                this.a = q2;
            }

            @Override
            public final s a() {
                return a.this;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled unnecessary exception pruning
             */
            @Override
            public final void a_(c c2, long l2) {
                Throwable throwable2222;
                t.a(c2.b, 0L, l2);
                do {
                    long l3;
                    block6 : {
                        long l4 = 0L;
                        if (l2 <= 0L) return;
                        do {
                            l3 = l4;
                            if (l4 >= 65536L) break block6;
                            l4 = l3 = l4 + (long)(c2.a.c - c2.a.b);
                        } while (l3 < l2);
                        l3 = l2;
                    }
                    a.this.a_();
                    this.a.a_(c2, l3);
                    l2 -= l3;
                    a.this.a(true);
                    continue;
                    {
                        catch (Throwable throwable2222) {
                            break;
                        }
                        catch (IOException iOException) {}
                        {
                            throw a.this.b(iOException);
                        }
                    }
                } while (true);
                a.this.a(false);
                throw throwable2222;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled unnecessary exception pruning
             */
            @Override
            public final void close() {
                Throwable throwable2222;
                a.this.a_();
                this.a.close();
                a.this.a(true);
                return;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (IOException iOException) {}
                    {
                        throw a.this.b(iOException);
                    }
                }
                a.this.a(false);
                throw throwable2222;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled unnecessary exception pruning
             */
            @Override
            public final void flush() {
                Throwable throwable2222;
                a.this.a_();
                this.a.flush();
                a.this.a(true);
                return;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (IOException iOException) {}
                    {
                        throw a.this.b(iOException);
                    }
                }
                a.this.a(false);
                throw throwable2222;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("AsyncTimeout.sink(");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        };
    }

    static boolean a(AssertionError assertionError) {
        if (((Throwable)((Object)assertionError)).getCause() == null) return false;
        if (((Throwable)((Object)assertionError)).getMessage() == null) return false;
        if (!((Throwable)((Object)assertionError)).getMessage().contains("getsockname failed")) return false;
        return true;
    }

    public static r b(Socket closeable) {
        if (closeable == null) throw new IllegalArgumentException("socket == null");
        final a a2 = k.c(closeable);
        if ((closeable = closeable.getInputStream()) == null) throw new IllegalArgumentException("in == null");
        return new r(new r((InputStream)closeable){
            final /* synthetic */ InputStream b;
            {
                this.b = inputStream;
            }

            @Override
            public final long a(c c2, long l2) {
                if (l2 < 0L) throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(l2)));
                if (l2 == 0L) {
                    return 0L;
                }
                try {
                    a2.f_();
                    n n2 = c2.e(1);
                    int n3 = (int)Math.min(l2, (long)(8192 - n2.c));
                    n3 = this.b.read(n2.a, n2.c, n3);
                    if (n3 == -1) {
                        return -1L;
                    }
                    n2.c += n3;
                    l2 = c2.b;
                    long l3 = n3;
                    c2.b = l2 + l3;
                    return l3;
                }
                catch (AssertionError assertionError) {
                    if (!k.a(assertionError)) throw assertionError;
                    throw new IOException((Throwable)((Object)assertionError));
                }
            }

            @Override
            public final s a() {
                return a2;
            }

            @Override
            public final void close() {
                this.b.close();
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("source(");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }){
            final /* synthetic */ r a;
            {
                this.a = r2;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled unnecessary exception pruning
             */
            @Override
            public final long a(c c2, long l2) {
                Throwable throwable2222;
                a.this.a_();
                l2 = this.a.a(c2, l2);
                a.this.a(true);
                return l2;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (IOException iOException) {}
                    {
                        throw a.this.b(iOException);
                    }
                }
                a.this.a(false);
                throw throwable2222;
            }

            @Override
            public final s a() {
                return a.this;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled unnecessary exception pruning
             */
            @Override
            public final void close() {
                Throwable throwable2222;
                this.a.close();
                a.this.a(true);
                return;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (IOException iOException) {}
                    {
                        throw a.this.b(iOException);
                    }
                }
                a.this.a(false);
                throw throwable2222;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("AsyncTimeout.source(");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        };
    }

    private static a c(final Socket socket) {
        return new a(){

            @Override
            protected final IOException a(IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException == null) return socketTimeoutException;
                socketTimeoutException.initCause(iOException);
                return socketTimeoutException;
            }

            @Override
            protected final void a() {
                try {
                    socket.close();
                    return;
                }
                catch (AssertionError assertionError) {
                    if (!k.a(assertionError)) throw assertionError;
                    Logger logger = a;
                    Level level = Level.WARNING;
                    StringBuilder stringBuilder = new StringBuilder("Failed to close timed out socket ");
                    stringBuilder.append(socket);
                    logger.log(level, stringBuilder.toString(), (Throwable)((Object)assertionError));
                    return;
                }
                catch (Exception exception) {
                    Logger logger = a;
                    Level level = Level.WARNING;
                    StringBuilder stringBuilder = new StringBuilder("Failed to close timed out socket ");
                    stringBuilder.append(socket);
                    logger.log(level, stringBuilder.toString(), exception);
                    return;
                }
            }
        };
    }

}

