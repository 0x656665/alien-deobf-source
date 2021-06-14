package a;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class m {
   private int a = 64;
   private int b = 5;
   private Runnable c;
   private ExecutorService d;
   private final Deque e = new ArrayDeque();
   private final Deque f = new ArrayDeque();
   private final Deque g = new ArrayDeque();

   private ExecutorService a() {
      synchronized(this){}

      ExecutorService var1;
      try {
         if (this.d == null) {
            this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), a.a.c.a("OkHttp Dispatcher", false));
         }

         var1 = this.d;
      } finally {
         ;
      }

      return var1;
   }

   private void a(Deque var1, Object var2, boolean var3) {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label300: {
         label295: {
            try {
               if (var1.remove(var2)) {
                  break label295;
               }
            } catch (Throwable var34) {
               var10000 = var34;
               var10001 = false;
               break label300;
            }

            try {
               throw new AssertionError("Call wasn't in-flight!");
            } catch (Throwable var33) {
               var10000 = var33;
               var10001 = false;
               break label300;
            }
         }

         if (var3) {
            try {
               this.b();
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label300;
            }
         }

         int var4;
         Runnable var36;
         try {
            var4 = this.c();
            var36 = this.c;
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            break label300;
         }

         if (var4 == 0 && var36 != null) {
            var36.run();
         }

         return;
      }

      while(true) {
         Throwable var35 = var10000;

         try {
            throw var35;
         } catch (Throwable var30) {
            var10000 = var30;
            var10001 = false;
            continue;
         }
      }
   }

   private void b() {
      if (this.f.size() < this.a) {
         if (!this.e.isEmpty()) {
            Iterator var2 = this.e.iterator();

            do {
               if (!var2.hasNext()) {
                  return;
               }

               w.a var3 = (w.a)var2.next();
               int var1 = 0;
               Iterator var4 = this.f.iterator();

               while(var4.hasNext()) {
                  if (((w.a)var4.next()).a().equals(var3.a())) {
                     ++var1;
                  }
               }

               if (var1 < this.b) {
                  var2.remove();
                  this.f.add(var3);
                  this.a().execute(var3);
               }
            } while(this.f.size() < this.a);

         }
      }
   }

   private int c() {
      synchronized(this){}

      int var1;
      int var2;
      try {
         var1 = this.f.size();
         var2 = this.g.size();
      } finally {
         ;
      }

      return var1 + var2;
   }

   final void a(w.a var1) {
      this.a(this.f, var1, true);
   }

   final void a(w var1) {
      synchronized(this){}

      try {
         this.g.add(var1);
      } finally {
         ;
      }

   }

   final void b(w var1) {
      this.a(this.g, var1, false);
   }
}
