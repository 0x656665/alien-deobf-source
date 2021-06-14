package a.a.c;

import a.s;
import a.x;
import a.z;
import java.net.ProtocolException;

public final class b implements s {
   private final boolean a;

   public b(boolean var1) {
      this.a = var1;
   }

   public final z a(s.a var1) {
      g var6 = (g)var1;
      c var9 = var6.b;
      a.a.b.g var8 = var6.a;
      x var10 = var1.a();
      long var3 = System.currentTimeMillis();
      var9.a(var10);
      boolean var5 = f.b(var10.b);
      Object var7 = null;
      z.a var14 = null;
      z.a var11 = (z.a)var7;
      if (var5) {
         var11 = (z.a)var7;
         if (var10.d != null) {
            if ("100-continue".equalsIgnoreCase(var10.a("Expect"))) {
               var9.a();
               var14 = var9.a(true);
            }

            var11 = var14;
            if (var14 == null) {
               b.d var12 = b.k.a(var9.a(var10, var10.d.b()));
               var10.d.a(var12);
               var12.close();
               var11 = var14;
            }
         }
      }

      var9.b();
      var14 = var11;
      if (var11 == null) {
         var14 = var9.a(false);
      }

      var14.a = var10;
      var14.e = var8.b().c;
      var14.k = var3;
      var14.l = System.currentTimeMillis();
      z var13 = var14.a();
      int var2 = var13.c;
      if (this.a && var2 == 101) {
         var11 = var13.a();
         var11.g = a.a.c.c;
         var13 = var11.a();
      } else {
         var14 = var13.a();
         var14.g = var9.a(var13);
         var13 = var14.a();
      }

      if ("close".equalsIgnoreCase(var13.a.a("Connection")) || "close".equalsIgnoreCase(var13.decrypt_str("Connection"))) {
         var8.d();
      }

      if ((var2 == 204 || var2 == 205) && var13.g.b() > 0L) {
         StringBuilder var15 = new StringBuilder("HTTP ");
         var15.append(var2);
         var15.append(" had non-zero Content-Length: ");
         var15.append(var13.g.b());
         throw new ProtocolException(var15.toString());
      } else {
         return var13;
      }
   }
}
