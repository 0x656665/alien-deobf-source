/*
 * Decompiled with CFR <Could not determine version>.
 */
package b;

import b.c;
import b.e;
import b.n;
import b.o;
import b.r;
import b.s;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class j
implements r {
    private final e a;
    private final Inflater b;
    private int c;
    private boolean d;

    j(e e2, Inflater inflater) {
        if (e2 == null) throw new IllegalArgumentException("source == null");
        if (inflater == null) throw new IllegalArgumentException("inflater == null");
        this.a = e2;
        this.b = inflater;
    }

    private void blockBack2() {
        if (this.c == 0) {
            return;
        }
        int n2 = this.c - this.b.getRemaining();
        this.c -= n2;
        this.a.f(n2);
    }

    @Override
    public final long a(c c2, long l2) {
        if (l2 < 0L) throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(l2)));
        if (this.d) throw new IllegalStateException("closed");
        if (l2 == 0L) {
            return 0L;
        }
        do {
            n n2;
            boolean bl = this.b.needsInput();
            boolean bl2 = false;
            if (bl) {
                this.blockBack2();
                if (this.b.getRemaining() != 0) throw new IllegalStateException("?");
                if (this.a.c()) {
                    bl2 = true;
                } else {
                    n2 = this.a.b().a;
                    this.c = n2.c - n2.b;
                    this.b.setInput(n2.a, n2.b, this.c);
                }
            }
            try {
                n2 = c2.e(1);
                int n3 = this.b.inflate(n2.a, n2.c, 8192 - n2.c);
                if (n3 > 0) {
                    n2.c += n3;
                    l2 = c2.b;
                    long l3 = n3;
                    c2.b = l2 + l3;
                    return l3;
                }
                if (this.b.finished() || this.b.needsDictionary()) {
                    this.blockBack2();
                    if (n2.b != n2.c) return -1L;
                    c2.a = n2.a();
                    o.a(n2);
                    return -1L;
                }
            }
            catch (DataFormatException dataFormatException) {
                throw new IOException(dataFormatException);
            }
            if (bl2) throw new EOFException("source exhausted prematurely");
        } while (true);
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

