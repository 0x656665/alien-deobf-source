package a;

import java.io.Closeable;
import java.io.Flushable;

public final class c implements Closeable, Flushable {
   final a.a.a.e a;
   final a.a.a.d b;

   public final void close() {
      this.b.close();
   }

   public final void flush() {
      this.b.flush();
   }
}
