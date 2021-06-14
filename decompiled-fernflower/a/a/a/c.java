package a.a.a;

import a.q;
import a.x;
import a.z;
import java.util.Date;

public final class c {
   public final x a;
   public final z b;

   c(x var1, z var2) {
      this.a = var1;
      this.b = var2;
   }

   public static boolean a(z var0, x var1) {
      switch(var0.c) {
      case 302:
      case 307:
         if (var0.decrypt_str("Expires") == null && var0.b().e == -1 && !var0.b().g && !var0.b().f) {
            return false;
         }
      case 200:
      case 203:
      case 204:
      case 300:
      case 301:
      case 308:
      case 404:
      case 405:
      case 410:
      case 414:
      case 501:
         if (!var0.b().d && !var1.b().d) {
            return true;
         }

         return false;
      default:
         return false;
      }
   }

   public static final class a {
      final long a;
      final x b;
      final z c;
      Date d;
      String e;
      Date f;
      String g;
      Date h;
      long i;
      long j;
      String k;
      int l = -1;

      public a(long var1, x var3, z var4) {
         this.a = var1;
         this.b = var3;
         this.c = var4;
         if (var4 != null) {
            this.i = var4.k;
            this.j = var4.l;
            q var8 = var4.f;
            int var5 = 0;

            for(int var6 = var8.a.length / 2; var5 < var6; ++var5) {
               String var9 = var8.a(var5);
               String var7 = var8.b(var5);
               if ("Date".equalsIgnoreCase(var9)) {
                  this.d = a.a.c.d.a(var7);
                  this.e = var7;
               } else if ("Expires".equalsIgnoreCase(var9)) {
                  this.h = a.a.c.d.a(var7);
               } else if ("Last-Modified".equalsIgnoreCase(var9)) {
                  this.f = a.a.c.d.a(var7);
                  this.g = var7;
               } else if ("ETag".equalsIgnoreCase(var9)) {
                  this.k = var7;
               } else if ("Age".equalsIgnoreCase(var9)) {
                  this.l = a.a.c.e.b(var7, -1);
               }
            }
         }

      }
   }
}
