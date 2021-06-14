/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.e;

import a.a.e.b;
import java.io.IOException;

public final class o
extends IOException {
    public final b a;

    public o(b b2) {
        super("stream was reset: ".concat(String.valueOf((Object)b2)));
        this.a = b2;
    }
}

