package a.a.e;

import java.io.IOException;

public final class o extends IOException {
   public final b a;

   public o(b var1) {
      super("stream was reset: ".concat(String.valueOf(var1)));
      this.a = var1;
   }
}
