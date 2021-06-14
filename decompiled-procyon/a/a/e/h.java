package a.a.e;

import java.util.*;
import java.util.logging.*;
import java.io.*;
import b.*;

final class h implements Closeable
{
    static final Logger a;
    final e b;
    final boolean c;
    final d.a d;
    private final a e;
    
    static {
        a = Logger.getLogger(a.a.e.e.class.getName());
    }
    
    public h(final e b, final boolean c) {
        super();
        this.b = b;
        this.c = c;
        this.e = new a(this.b);
        this.d = new d.a(this.e);
    }
    
    private static int a(final int n, final byte b, final short n2) {
        int n3 = n;
        if ((b & 0x8) != 0x0) {
            n3 = n - 1;
        }
        if (n2 <= n3) {
            return (short)(n3 - n2);
        }
        throw a.a.e.e.b("PROTOCOL_ERROR padding %s > remaining length %s", n2, n3);
    }
    
    static int a(final e e) {
        return (e.e() & 0xFF) | ((e.e() & 0xFF) << 16 | (e.e() & 0xFF) << 8);
    }
    
    private List<c> a(final int n, final short e, final byte b, final int c) {
        final a e2 = this.e;
        this.e.d = n;
        e2.a = n;
        this.e.e = e;
        this.e.b = b;
        this.e.c = c;
        this.d.a();
        return this.d.b();
    }
    
    private void blockBack() {
        this.b.g();
        this.b.e();
    }
    
    public final boolean a(final boolean b, final b b2) {
        short n = 0;
        final short n2 = 0;
        final short n3 = 0;
        final boolean b3 = false;
        try {
            this.b.a(9L);
            final int a = a(this.b);
            if (a < 0 || a > 16384) {
                throw a.a.e.e.b("FRAME_SIZE_ERROR: %s", a);
            }
            final byte b4 = (byte)(this.b.e() & 0xFF);
            if (b && b4 != 4) {
                throw a.a.e.e.b("Expected a SETTINGS frame but was %s", b4);
            }
            final byte b5 = (byte)(this.b.e() & 0xFF);
            final int n4 = this.b.g() & Integer.MAX_VALUE;
            if (h.a.isLoggable(Level.FINE)) {
                h.a.fine(a.a.e.e.a(true, n4, a, b4, b5));
            }
            switch (b4) {
                default: {
                    this.b.f(a);
                    return true;
                }
                case 8: {
                    if (a != 4) {
                        throw a.a.e.e.b("TYPE_WINDOW_UPDATE length !=4: %s", a);
                    }
                    final long n5 = (long)this.b.g() & 0x7FFFFFFFL;
                    if (n5 != 0L) {
                        b2.a(n4, n5);
                        return true;
                    }
                    throw a.a.e.e.b("windowSizeIncrement was 0", n5);
                }
                case 7: {
                    if (a < 8) {
                        throw a.a.e.e.b("TYPE_GOAWAY length < 8: %s", a);
                    }
                    if (n4 != 0) {
                        throw a.a.e.e.b("TYPE_GOAWAY streamId != 0", new Object[0]);
                    }
                    final int g = this.b.g();
                    final int g2 = this.b.g();
                    final int n6 = a - 8;
                    if (b.a(g2) != null) {
                        final f b6 = f.b;
                        if (n6 > 0) {
                            this.b.c(n6);
                        }
                        b2.a(g);
                        return true;
                    }
                    throw a.a.e.e.b("TYPE_GOAWAY unexpected error code: %d", g2);
                }
                case 6: {
                    if (a != 8) {
                        throw a.a.e.e.b("TYPE_PING length != 8: %s", a);
                    }
                    if (n4 == 0) {
                        final int g3 = this.b.g();
                        final int g4 = this.b.g();
                        boolean b7 = b3;
                        if ((b5 & 0x1) != 0x0) {
                            b7 = true;
                        }
                        b2.a(b7, g3, g4);
                        return true;
                    }
                    throw a.a.e.e.b("TYPE_PING streamId != 0", new Object[0]);
                }
                case 5: {
                    if (n4 != 0) {
                        if ((b5 & 0x8) != 0x0) {
                            n = (short)(this.b.e() & 0xFF);
                        }
                        b2.a(this.b.g() & Integer.MAX_VALUE, this.a(a(a - 4, b5, n), n, b5, n4));
                        return true;
                    }
                    throw a.a.e.e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                }
                case 4: {
                    if (n4 != 0) {
                        throw a.a.e.e.b("TYPE_SETTINGS streamId != 0", new Object[0]);
                    }
                    if ((b5 & 0x1) != 0x0) {
                        if (a == 0) {
                            return true;
                        }
                        throw a.a.e.e.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    }
                    else {
                        if (a % 6 == 0) {
                            final n n7 = new n();
                            int i = 0;
                        Label_0811_Outer:
                            while (i < a) {
                                final short f = this.b.f();
                                final int g5 = this.b.g();
                                int n8 = f;
                                while (true) {
                                    switch (f) {
                                        default: {
                                            n8 = f;
                                            break Label_0811;
                                        }
                                        case 5: {
                                            if (g5 >= 16384 && g5 <= 16777215) {
                                                n8 = f;
                                                break Label_0811;
                                            }
                                            throw a.a.e.e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", g5);
                                        }
                                        case 4: {
                                            n8 = 7;
                                            if (g5 >= 0) {
                                                break Label_0811;
                                            }
                                            throw a.a.e.e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                        }
                                        case 2: {
                                            n8 = f;
                                            if (g5 == 0) {
                                                break Label_0811;
                                            }
                                            if (g5 == 1) {
                                                n8 = f;
                                                break Label_0811;
                                            }
                                            throw a.a.e.e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                        }
                                        case 1: {
                                            n7.a(n8, g5);
                                            i += 6;
                                            continue Label_0811_Outer;
                                        }
                                        case 3: {
                                            n8 = 4;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                            }
                            b2.a(n7);
                            return true;
                        }
                        throw a.a.e.e.b("TYPE_SETTINGS length %% 6 != 0: %s", a);
                    }
                    break;
                }
                case 3: {
                    if (a != 4) {
                        throw a.a.e.e.b("TYPE_RST_STREAM length: %d != 4", a);
                    }
                    if (n4 == 0) {
                        throw a.a.e.e.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    }
                    final int g6 = this.b.g();
                    final a.a.e.b a2 = b.a(g6);
                    if (a2 != null) {
                        b2.a(n4, a2);
                        return true;
                    }
                    throw a.a.e.e.b("TYPE_RST_STREAM unexpected error code: %d", g6);
                }
                case 2: {
                    if (a != 5) {
                        throw a.a.e.e.b("TYPE_PRIORITY length: %d != 5", a);
                    }
                    if (n4 != 0) {
                        this.blockBack();
                        return true;
                    }
                    throw a.a.e.e.b("TYPE_PRIORITY streamId == 0", new Object[0]);
                }
                case 1: {
                    if (n4 != 0) {
                        final boolean b8 = (b5 & 0x1) != 0x0;
                        short n9 = n2;
                        if ((b5 & 0x8) != 0x0) {
                            n9 = (short)(this.b.e() & 0xFF);
                        }
                        int n10 = a;
                        if ((b5 & 0x20) != 0x0) {
                            this.blockBack();
                            n10 = a - 5;
                        }
                        b2.a(b8, n4, this.a(a(n10, b5, n9), n9, b5, n4));
                        return true;
                    }
                    throw a.a.e.e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                }
                case 0: {
                    final boolean b9 = (b5 & 0x1) != 0x0;
                    if ((b5 & 0x20) == 0x0) {
                        short n11 = n3;
                        if ((b5 & 0x8) != 0x0) {
                            n11 = (short)(this.b.e() & 0xFF);
                        }
                        b2.a(b9, n4, this.b, a(a, b5, n11));
                        this.b.f(n11);
                        return true;
                    }
                    throw a.a.e.e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                }
            }
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    @Override
    public final void close() {
        this.b.close();
    }
    
    static final class a implements r
    {
        int a;
        byte b;
        int c;
        int d;
        short e;
        private final e f;
        
        public a(final e f) {
            super();
            this.f = f;
        }
        
        @Override
        public final long a(final b.c c, long a) {
            while (this.d == 0) {
                this.f.f(this.e);
                this.e = 0;
                if ((this.b & 0x4) != 0x0) {
                    return -1L;
                }
                final int c2 = this.c;
                final int a2 = h.a(this.f);
                this.d = a2;
                this.a = a2;
                final byte b = (byte)(this.f.e() & 0xFF);
                this.b = (byte)(this.f.e() & 0xFF);
                if (h.a.isLoggable(Level.FINE)) {
                    h.a.fine(a.a.e.e.a(true, this.c, this.a, b, this.b));
                }
                this.c = (this.f.g() & Integer.MAX_VALUE);
                if (b != 9) {
                    throw a.a.e.e.b("%s != TYPE_CONTINUATION", b);
                }
                if (this.c == c2) {
                    continue;
                }
                throw a.a.e.e.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
            a = this.f.a(c, Math.min(a, this.d));
            if (a == -1L) {
                return -1L;
            }
            this.d -= (int)a;
            return a;
        }
        
        @Override
        public final s a() {
            return this.f.a();
        }
        
        @Override
        public final void close() {
        }
    }
    
    interface b
    {
        void a(final int p0);
        
        void a(final int p0, final long p1);
        
        void a(final int p0, final a.a.e.b p1);
        
        void a(final int p0, final List<c> p1);
        
        void a(final n p0);
        
        void a(final boolean p0, final int p1, final int p2);
        
        void a(final boolean p0, final int p1, final e p2, final int p3);
        
        void a(final boolean p0, final int p1, final List<c> p2);
    }
}
