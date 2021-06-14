package b;

import java.io.*;
import java.util.zip.*;

public final class j implements r
{
    private final e a;
    private final Inflater b;
    private int c;
    private boolean d;
    
    j(final e a, final Inflater b) {
        super();
        if (a == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (b != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("inflater == null");
    }
    
    private void blockBack2() {
        if (this.c == 0) {
            return;
        }
        final int n = this.c - this.b.getRemaining();
        this.c -= n;
        this.a.f(n);
    }
    
    @Override
    public final long a(final c c, long b) {
        if (b < 0L) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(b)));
        }
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        if (b == 0L) {
            return 0L;
        }
    Label_0275:
        while (true) {
            final boolean needsInput = this.b.needsInput();
            boolean b2 = false;
            Label_0123: {
                if (!needsInput) {
                    break Label_0123;
                }
                this.blockBack2();
                if (this.b.getRemaining() != 0) {
                    break;
                }
                if (this.a.c()) {
                    b2 = true;
                    break Label_0123;
                }
                final n a = this.a.b().a;
                this.c = a.c - a.b;
                this.b.setInput(a.a, a.b, this.c);
                Block_7: {
                    break Block_7;
                Label_0312:
                    while (true) {
                        do {
                            Label_0220: {
                                break Label_0220;
                                try {
                                    final n e = c.e(1);
                                    final int inflate = this.b.inflate(e.a, e.c, 8192 - e.c);
                                    if (inflate > 0) {
                                        e.c += inflate;
                                        b = c.b;
                                        final long n = inflate;
                                        c.b = b + n;
                                        return n;
                                    }
                                    if (!this.b.finished() && !this.b.needsDictionary()) {
                                        continue Label_0312;
                                    }
                                    this.blockBack2();
                                    if (e.b == e.c) {
                                        c.a = e.a();
                                        o.a(e);
                                    }
                                    return -1L;
                                    throw new EOFException("source exhausted prematurely");
                                }
                                catch (DataFormatException ex) {
                                    throw new IOException(ex);
                                }
                            }
                            break Label_0275;
                        } while (b2);
                        break;
                    }
                }
            }
        }
        throw new IllegalStateException("?");
    }
    
    @Override
    public final s a() {
        return this.a.a();
    }
    
    @Override
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }
}
