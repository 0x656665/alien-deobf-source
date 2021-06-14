package b;

final class o {
   static n a;
   static long b;

   private o() {
   }

   static n a() {
      synchronized(o.class){}

      Throwable var10000;
      boolean var10001;
      label137: {
         try {
            if (a != null) {
               n var13 = a;
               a = var13.f;
               var13.f = null;
               b -= 8192L;
               return var13;
            }
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            break label137;
         }

         try {
            ;
         } catch (Throwable var11) {
            var10000 = var11;
            var10001 = false;
            break label137;
         }

         return new n();
      }

      while(true) {
         Throwable var0 = var10000;

         try {
            throw var0;
         } catch (Throwable var10) {
            var10000 = var10;
            var10001 = false;
            continue;
         }
      }
   }

   static void a(n var0) {
      if (var0.f == null && var0.g == null) {
         if (!var0.d) {
            synchronized(o.class){}

            Throwable var10000;
            boolean var10001;
            label158: {
               try {
                  if (b + 8192L > 65536L) {
                     return;
                  }
               } catch (Throwable var12) {
                  var10000 = var12;
                  var10001 = false;
                  break label158;
               }

               label152:
               try {
                  b += 8192L;
                  var0.f = a;
                  var0.c = 0;
                  var0.b = 0;
                  a = var0;
                  return;
               } catch (Throwable var11) {
                  var10000 = var11;
                  var10001 = false;
                  break label152;
               }
            }

            while(true) {
               Throwable var13 = var10000;

               try {
                  throw var13;
               } catch (Throwable var10) {
                  var10000 = var10;
                  var10001 = false;
                  continue;
               }
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
