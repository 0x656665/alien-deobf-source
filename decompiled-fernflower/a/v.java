package a;

import java.io.IOException;

public enum v {
   a("http/1.0"),
   b("http/1.1"),
   c("spdy/3.1"),
   d("h2");

   private final String e;

   private v(String var3) {
      this.e = var3;
   }

   public static v a(String var0) {
      if (var0.equals(a.e)) {
         return a;
      } else if (var0.equals(b.e)) {
         return b;
      } else if (var0.equals(d.e)) {
         return d;
      } else if (var0.equals(c.e)) {
         return c;
      } else {
         throw new IOException("Unexpected protocol: ".concat(String.valueOf(var0)));
      }
   }

   public final String toString() {
      return this.e;
   }
}
