/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.f;

import java.io.File;
import java.io.IOException;

public interface a {
    public static final a a = new a(){

        @Override
        public final void a(File file) {
            if (file.delete()) return;
            if (file.exists()) throw new IOException("failed to delete ".concat(String.valueOf(file)));
        }
    };

    public void a(File var1);

}

