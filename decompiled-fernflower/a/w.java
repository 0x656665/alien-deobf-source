package a;

import java.io.IOException;
import java.util.ArrayList;

public final class w implements e {
   final u a;
   final a.a.c.j b;
   final x c;
   final boolean d;
   private boolean e;

   public w(u var1, x var2, boolean var3) {
      this.a = var1;
      this.c = var2;
      this.d = var3;
      this.b = new a.a.c.j(var1, var3);
   }

   public final z a() {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      Throwable var33;
      label311: {
         label315: {
            try {
               if (this.e) {
                  break label315;
               }

               this.e = true;
            } catch (Throwable var31) {
               var10000 = var31;
               var10001 = false;
               break label311;
            }

            Object var1 = a.a.g.e.b().a("response.body().close()");
            this.b.a = var1;

            label316: {
               z var32;
               try {
                  this.a.c.a(this);
                  var32 = this.b();
               } catch (Throwable var29) {
                  var10000 = var29;
                  var10001 = false;
                  break label316;
               }

               if (var32 != null) {
                  this.a.c.b(this);
                  return var32;
               }

               label294:
               try {
                  throw new IOException("Canceled");
               } catch (Throwable var28) {
                  var10000 = var28;
                  var10001 = false;
                  break label294;
               }
            }

            var33 = var10000;
            this.a.c.b(this);
            throw var33;
         }

         label304:
         try {
            throw new IllegalStateException("Already Executed");
         } catch (Throwable var30) {
            var10000 = var30;
            var10001 = false;
            break label304;
         }
      }

      while(true) {
         var33 = var10000;

         try {
            throw var33;
         } catch (Throwable var27) {
            var10000 = var27;
            var10001 = false;
            continue;
         }
      }
   }

   final z b() {
      ArrayList var1 = new ArrayList();
      var1.addAll(this.a.g);
      var1.add(this.b);
      var1.add(new a.a.c.a(this.a.j));
      var1.add(new a.a.a.a(this.a.a()));
      var1.add(new a.a.b.a(this.a));
      if (!this.d) {
         var1.addAll(this.a.h);
      }

      var1.add(new a.a.c.b(this.d));
      return (new a.a.c.g(var1, (a.a.b.g)null, (a.a.c.c)null, (h)null, 0, this.c)).a(this.c);
   }

   // $FF: synthetic method
   public final Object clone() {
      return new w(this.a, this.c, this.d);
   }

   final class a extends a.a.b {
      // $FF: synthetic field
      final w a;

      final String a() {
         return this.a.c.a.b;
      }

      public final void blockBack2() {
         // $FF: Couldn't be decompiled
      }
   }
}
