/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.e;

import a.a.e.c;
import a.a.e.d;
import a.a.e.e;
import a.a.e.n;
import b.f;
import b.r;
import b.s;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class h
implements Closeable {
    static final Logger a = Logger.getLogger(e.class.getName());
    final b.e b;
    final boolean c;
    final d.a d;
    private final a e;

    public h(b.e e2, boolean bl) {
        this.b = e2;
        this.c = bl;
        this.e = new a(this.b);
        this.d = new d.a(this.e);
    }

    private static int a(int n2, byte by, short s2) {
        int n3 = n2;
        if ((by & 8) != 0) {
            n3 = n2 - 1;
        }
        if (s2 > n3) throw e.b("PROTOCOL_ERROR padding %s > remaining length %s", s2, n3);
        return (short)(n3 - s2);
    }

    static int a(b.e e2) {
        byte by = e2.e();
        byte by2 = e2.e();
        return e2.e() & 255 | ((by & 255) << 16 | (by2 & 255) << 8);
    }

    private List<c> a(int n2, short s2, byte by, int n3) {
        a a2 = this.e;
        this.e.d = n2;
        a2.a = n2;
        this.e.e = s2;
        this.e.b = by;
        this.e.c = n3;
        this.d.a();
        return this.d.b();
    }

    private void blockBack() {
        this.b.g();
        this.b.e();
    }

    public final boolean a(boolean bl, b b2) {
        short s2 = 0;
        short s3 = 0;
        short s4 = 0;
        boolean bl2 = false;
        try {
            this.b.a(9L);
        }
        catch (IOException iOException) {
            return false;
        }
        int n2 = h.a(this.b);
        if (n2 < 0 || n2 > 16384) throw e.b("FRAME_SIZE_ERROR: %s", n2);
        byte by = (byte)(this.b.e() & 255);
        if (bl && by != 4) {
            throw e.b("Expected a SETTINGS frame but was %s", by);
        }
        byte by2 = (byte)(this.b.e() & 255);
        int n3 = this.b.g() & Integer.MAX_VALUE;
        if (a.isLoggable(Level.FINE)) {
            a.fine(e.a(true, n3, n2, by, by2));
        }
        switch (by) {
            default: {
                this.b.f(n2);
                return true;
            }
            case 8: {
                if (n2 != 4) {
                    throw e.b("TYPE_WINDOW_UPDATE length !=4: %s", n2);
                }
                long l2 = (long)this.b.g() & Integer.MAX_VALUE;
                if (l2 == 0L) throw e.b("windowSizeIncrement was 0", l2);
                b2.a(n3, l2);
                return true;
            }
            case 7: {
                if (n2 < 8) {
                    throw e.b("TYPE_GOAWAY length < 8: %s", n2);
                }
                if (n3 != 0) throw e.b("TYPE_GOAWAY streamId != 0", new Object[0]);
                int n4 = this.b.g();
                n3 = this.b.g();
                n2 -= 8;
                if (a.a.e.b.a(n3) == null) {
                    throw e.b("TYPE_GOAWAY unexpected error code: %d", n3);
                }
                f f2 = f.b;
                if (n2 > 0) {
                    this.b.c(n2);
                }
                b2.a(n4);
                return true;
            }
            case 6: {
                if (n2 != 8) {
                    throw e.b("TYPE_PING length != 8: %s", n2);
                }
                if (n3 != 0) throw e.b("TYPE_PING streamId != 0", new Object[0]);
                int n5 = this.b.g();
                n3 = this.b.g();
                bl = bl2;
                if ((by2 & 1) != 0) {
                    bl = true;
                }
                b2.a(bl, n5, n3);
                return true;
            }
            case 5: {
                if (n3 == 0) throw e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                if ((by2 & 8) != 0) {
                    s2 = (short)(this.b.e() & 255);
                }
                b2.a(this.b.g() & Integer.MAX_VALUE, this.a(h.a(n2 - 4, by2, s2), s2, by2, n3));
                return true;
            }
            case 4: {
                if (n3 != 0) throw e.b("TYPE_SETTINGS streamId != 0", new Object[0]);
                if ((by2 & 1) != 0) {
                    if (n2 != 0) throw e.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    return true;
                }
                if (n2 % 6 != 0) {
                    throw e.b("TYPE_SETTINGS length %% 6 != 0: %s", n2);
                }
                n n6 = new n();
                n3 = 0;
                do {
                    if (n3 >= n2) {
                        b2.a(n6);
                        return true;
                    }
                    int n7 = this.b.f();
                    int n8 = this.b.g();
                    int n9 = n7;
                    switch (n7) {
                        default: {
                            n9 = n7;
                            break;
                        }
                        case 5: {
                            if (n8 < 16384 || n8 > 16777215) throw e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", n8);
                            n9 = n7;
                            break;
                        }
                        case 4: {
                            n9 = 7;
                            if (n8 < 0) throw e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            break;
                        }
                        case 3: {
                            n9 = 4;
                            break;
                        }
                        case 2: {
                            n9 = n7;
                            if (n8 == 0) break;
                            if (n8 != 1) throw e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            n9 = n7;
                            break;
                        }
                        case 1: 
                    }
                    n6.a(n9, n8);
                    n3 += 6;
                } while (true);
            }
            case 3: {
                if (n2 != 4) {
                    throw e.b("TYPE_RST_STREAM length: %d != 4", n2);
                }
                if (n3 == 0) throw e.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                int n10 = this.b.g();
                a.a.e.b b3 = a.a.e.b.a(n10);
                if (b3 == null) throw e.b("TYPE_RST_STREAM unexpected error code: %d", n10);
                b2.a(n3, b3);
                return true;
            }
            case 2: {
                if (n2 != 5) throw e.b("TYPE_PRIORITY length: %d != 5", n2);
                if (n3 == 0) throw e.b("TYPE_PRIORITY streamId == 0", new Object[0]);
                this.blockBack();
                return true;
            }
            case 1: {
                if (n3 == 0) throw e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                bl = (by2 & 1) != 0;
                s2 = s3;
                if ((by2 & 8) != 0) {
                    s2 = (short)(this.b.e() & 255);
                }
                int n11 = n2;
                if ((by2 & 32) != 0) {
                    this.blockBack();
                    n11 = n2 - 5;
                }
                b2.a(bl, n3, this.a(h.a(n11, by2, s2), s2, by2, n3));
                return true;
            }
            case 0: 
        }
        bl = (by2 & 1) != 0;
        int n12 = (by2 & 32) != 0 ? 1 : 0;
        if (n12 != 0) throw e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        s2 = s4;
        if ((by2 & 8) != 0) {
            s2 = (short)(this.b.e() & 255);
        }
        n12 = h.a(n2, by2, s2);
        b2.a(bl, n3, this.b, n12);
        this.b.f(s2);
        return true;
    }

    @Override
    public final void close() {
        this.b.close();
    }

    static final class a
    implements r {
        int a;
        byte b;
        int c;
        int d;
        short e;
        private final b.e f;

        public a(b.e e2) {
            this.f = e2;
        }

        @Override
        public final long a(b.c c2, long l2) {
            while (this.d == 0) {
                int n2;
                this.f.f(this.e);
                this.e = 0;
                if ((this.b & 4) != 0) {
                    return -1L;
                }
                int n3 = this.c;
                this.d = n2 = h.a(this.f);
                this.a = n2;
                byte by = (byte)(this.f.e() & 255);
                this.b = (byte)(this.f.e() & 255);
                if (a.isLoggable(Level.FINE)) {
                    a.fine(e.a(true, this.c, this.a, by, this.b));
                }
                this.c = this.f.g() & Integer.MAX_VALUE;
                if (by != 9) {
                    throw e.b("%s != TYPE_CONTINUATION", by);
                }
                if (this.c != n3) throw e.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
            if ((l2 = this.f.a(c2, Math.min(l2, (long)this.d))) == -1L) {
                return -1L;
            }
            this.d = (int)((long)this.d - l2);
            return l2;
        }

        @Override
        public final s a() {
            return this.f.a();
        }

        @Override
        public final void close() {
        }
    }

    static interface b {
        public void a(int var1);

        public void a(int var1, long var2);

        public void a(int var1, a.a.e.b var2);

        public void a(int var1, List<c> var2);

        public void a(n var1);

        public void a(boolean var1, int var2, int var3);

        public void a(boolean var1, int var2, b.e var3, int var4);

        public void a(boolean var1, int var2, List<c> var3);
    }

}

