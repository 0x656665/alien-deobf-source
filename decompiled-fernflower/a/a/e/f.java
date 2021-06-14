package a.a.e;

import a.aa;
import a.q;
import a.u;
import a.v;
import a.x;
import a.y;
import a.z;
import b.r;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class f implements a.a.c.c {
   private static final b.f b = b.f.a("connection");
   private static final b.f c = b.f.a("host");
   private static final b.f d = b.f.a("keep-alive");
   private static final b.f e = b.f.a("proxy-connection");
   private static final b.f f = b.f.a("transfer-encoding");
   private static final b.f g = b.f.a("te");
   private static final b.f h = b.f.a("encoding");
   private static final b.f i = b.f.a("upgrade");
   private static final List j;
   private static final List k;
   final a.a.b.g a;
   private final u l;
   private final g m;
   private i n;

   static {
      j = a.a.c.a((Object[])(b, c, d, e, g, f, h, i, a.a.e.c.c, a.a.e.c.d, a.a.e.c.e, a.a.e.c.f));
      k = a.a.c.a((Object[])(b, c, d, e, g, f, h, i));
   }

   public f(u var1, a.a.b.g var2, g var3) {
      this.l = var1;
      this.a = var2;
      this.m = var3;
   }

   public final aa a(z var1) {
      f.a var2 = new f.a(this.n.g);
      return new a.a.c.h(var1.f, b.k.a((r)var2));
   }

   public final z.a a(boolean var1) {
      List var8 = this.n.c();
      q.a var5 = new q.a();
      int var3 = var8.size();
      int var2 = 0;

      a.a.c.k var6;
      q.a var7;
      for(var6 = null; var2 < var3; var5 = var7) {
         c var4 = (c)var8.get(var2);
         a.a.c.k var11;
         if (var4 == null) {
            var11 = var6;
            var7 = var5;
            if (var6 != null) {
               var11 = var6;
               var7 = var5;
               if (var6.b == 100) {
                  var7 = new q.a();
                  var11 = null;
               }
            }
         } else {
            b.f var9 = var4.g;
            String var10 = var4.h.a();
            if (var9.equals(a.a.e.c.b)) {
               var11 = a.a.c.k.a("HTTP/1.1 ".concat(String.valueOf(var10)));
               var7 = var5;
            } else {
               var11 = var6;
               var7 = var5;
               if (!k.contains(var9)) {
                  a.a.a.a.a(var5, var9.a(), var10);
                  var7 = var5;
                  var11 = var6;
               }
            }
         }

         ++var2;
         var6 = var11;
      }

      if (var6 != null) {
         z.a var12 = new z.a();
         var12.b = v.d;
         var12.c = var6.b;
         var12.d = var6.c;
         var12 = var12.a(var5.a());
         if (var1 && a.a.a.a.a(var12) == 100) {
            return null;
         } else {
            return var12;
         }
      } else {
         throw new ProtocolException("Expected ':status' header not present");
      }
   }

   public final b.q a(x var1, long var2) {
      return this.n.d();
   }

   public final void a() {
      this.m.q.blockBack2();
   }

   public final void a(x var1) {
      if (this.n == null) {
         y var5 = var1.d;
         int var2 = 0;
         boolean var4;
         if (var5 != null) {
            var4 = true;
         } else {
            var4 = false;
         }

         q var9 = var1.c;
         ArrayList var6 = new ArrayList(var9.a.length / 2 + 4);
         var6.add(new c(a.a.e.c.c, var1.b));
         var6.add(new c(a.a.e.c.d, a.a.c.i.a(var1.a)));
         String var7 = var1.a("Host");
         if (var7 != null) {
            var6.add(new c(a.a.e.c.f, var7));
         }

         var6.add(new c(a.a.e.c.e, var1.a.a));

         for(int var3 = var9.a.length / 2; var2 < var3; ++var2) {
            b.f var8 = b.f.a(var9.a(var2).toLowerCase(Locale.US));
            if (!j.contains(var8)) {
               var6.add(new c(var8, var9.b(var2)));
            }
         }

         this.n = this.m.a(var6, var4);
         this.n.i.a((long)this.l.z, TimeUnit.MILLISECONDS);
         this.n.j.a((long)this.l.A, TimeUnit.MILLISECONDS);
      }
   }

   public final void b() {
      this.n.d().close();
   }

   final class a extends b.g {
      public a(r var2) {
         super(var2);
      }

      public final void close() {
         f.this.a.a(false, f.this);
         super.close();
      }
   }
}
