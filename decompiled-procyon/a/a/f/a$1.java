package a.a.f;

import java.io.*;

static final class a$1 implements a {
    a$1() {
        super();
    }
    
    @Override
    public final void a(final File file) {
        if (file.delete()) {
            return;
        }
        if (!file.exists()) {
            return;
        }
        throw new IOException("failed to delete ".concat(String.valueOf(file)));
    }
}