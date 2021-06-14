package a;

import java.io.Closeable;
import java.nio.charset.Charset;

public abstract class aa implements Closeable {
   public static aa a(byte[] var0) {
      final b.c var3 = (new b.c()).a(var0);
      final long var1 = (long)var0.length;
      if (var3 != null) {
         return new aa() {
            // $FF: synthetic field
            final t a = null;

            public final t a() {
               return this.a;
            }

            public final long b() {
               return var1;
            }

            public final b.e c() {
               return var3;
            }
         };
      } else {
         throw new NullPointerException("source == null");
      }
   }

   public abstract t a();

   public abstract long b();

   public abstract b.e c();

   public void close() {
      a.a.c.a((Closeable)this.c());
   }

   public final String d() {
      b.e var2 = this.c();

      String var35;
      label253: {
         Throwable var10000;
         label257: {
            t var3;
            boolean var10001;
            try {
               var3 = this.a();
            } catch (Throwable var33) {
               var10000 = var33;
               var10001 = false;
               break label257;
            }

            Charset var1;
            if (var3 != null) {
               try {
                  var1 = a.a.c.e;
               } catch (Throwable var31) {
                  var10000 = var31;
                  var10001 = false;
                  break label257;
               }

               try {
                  if (var3.a != null) {
                     var1 = Charset.forName(var3.a);
                  }
               } catch (Throwable var32) {
                  var10000 = var32;
                  var10001 = false;
                  break label257;
               }
            } else {
               try {
                  var1 = a.a.c.e;
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label257;
               }
            }

            label238:
            try {
               var35 = var2.a(a.a.c.a(var2, var1));
               break label253;
            } catch (Throwable var29) {
               var10000 = var29;
               var10001 = false;
               break label238;
            }
         }

         Throwable var34 = var10000;
         a.a.c.a((Closeable)var2);
         throw var34;
      }

      a.a.c.a((Closeable)var2);
      return var35;
   }
}
