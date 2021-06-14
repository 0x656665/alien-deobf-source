package a.a.f;

import java.io.*;

public interface a
{
    public static final a a = new a() {
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
    };
    
    void a(final File p0);
}
