package a.a.c;

import a.q;
import a.s;
import a.t;
import a.x;
import a.y;
import a.z;
import b.r;
import java.util.List;

public final class a implements s {
   private final a.l a;

   public a(a.l var1) {
      this.a = var1;
   }

   public final z a(s.a var1) {
      x var7 = var1.a();
      x.a var8 = var7.a();
      y var9 = var7.d;
      if (var9 != null) {
         t var10 = var9.a();
         if (var10 != null) {
            var8.a("Content-Type", var10.toString());
         }

         long var5 = var9.b();
         if (var5 != -1L) {
            var8.a("Content-Length", Long.toString(var5));
            var8.a("Transfer-Encoding");
         } else {
            var8.a("Transfer-Encoding", "chunked");
            var8.a("Content-Length");
         }
      }

      String var16 = var7.a("Host");
      int var3 = 0;
      if (var16 == null) {
         var8.a("Host", a.a.c.a(var7.a, false));
      }

      if (var7.a("Connection") == null) {
         var8.a("Connection", "Keep-Alive");
      }

      boolean var2;
      if (var7.a("Accept-Encoding") == null && var7.a("Range") == null) {
         var8.a("Accept-Encoding", "gzip");
         var2 = true;
      } else {
         var2 = false;
      }

      List var17 = this.a.a();
      if (!var17.isEmpty()) {
         StringBuilder var18 = new StringBuilder();

         for(int var4 = var17.size(); var3 < var4; ++var3) {
            if (var3 > 0) {
               var18.append("; ");
            }

            a.k var11 = (a.k)var17.get(var3);
            var18.append(var11.a);
            var18.append('=');
            var18.append(var11.b);
         }

         var8.a("Cookie", var18.toString());
      }

      if (var7.a("User-Agent") == null) {
         var8.a("User-Agent", "okhttp/3.6.0");
      }

      z var14 = var1.a(var8.a());
      e.a(this.a, var7.a, var14.f);
      z.a var12 = var14.a();
      var12.a = var7;
      if (var2 && "gzip".equalsIgnoreCase(var14.decrypt_str("Content-Encoding")) && e.b(var14)) {
         b.i var13 = new b.i(var14.g.c());
         q var15 = var14.f.a().a("Content-Encoding").a("Content-Length").a();
         var12.a(var15);
         var12.g = new h(var15, b.k.a((r)var13));
      }

      return var12.a();
   }
}
