package a.a.f;

import java.io.File;
import java.io.IOException;

public interface a {
   a a = new a() {
      public final void a(File var1) {
         if (!var1.delete()) {
            if (var1.exists()) {
               throw new IOException("failed to delete ".concat(String.valueOf(var1)));
            }
         }
      }
   };

   void a(File var1);
}
