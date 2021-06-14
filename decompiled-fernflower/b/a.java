package b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class a extends s {
   private static final long a;
   private static final long c;
   private static b.a d;
   private boolean e;
   private b.a f;
   private long g;

   static {
      a = TimeUnit.SECONDS.toMillis(60L);
      c = TimeUnit.MILLISECONDS.toNanos(a);
   }

   private static void a(b.a var0, long var1, boolean var3) {
      synchronized(b.a.class){}

      Throwable var10000;
      label1025: {
         boolean var10001;
         try {
            if (d == null) {
               d = new b.a();
               (new b.a.a()).start();
            }
         } catch (Throwable var116) {
            var10000 = var116;
            var10001 = false;
            break label1025;
         }

         long var4;
         try {
            var4 = System.nanoTime();
         } catch (Throwable var115) {
            var10000 = var115;
            var10001 = false;
            break label1025;
         }

         if (var1 != 0L && var3) {
            try {
               var0.g = Math.min(var1, var0.c() - var4) + var4;
            } catch (Throwable var114) {
               var10000 = var114;
               var10001 = false;
               break label1025;
            }
         } else if (var1 != 0L) {
            try {
               var0.g = var1 + var4;
            } catch (Throwable var113) {
               var10000 = var113;
               var10001 = false;
               break label1025;
            }
         } else {
            if (!var3) {
               try {
                  throw new AssertionError();
               } catch (Throwable var111) {
                  var10000 = var111;
                  var10001 = false;
                  break label1025;
               }
            }

            try {
               var0.g = var0.c();
            } catch (Throwable var112) {
               var10000 = var112;
               var10001 = false;
               break label1025;
            }
         }

         b.a var6;
         try {
            var1 = var0.g;
            var6 = d;
         } catch (Throwable var109) {
            var10000 = var109;
            var10001 = false;
            break label1025;
         }

         while(true) {
            try {
               if (var6.f == null || var1 - var4 < var6.f.g - var4) {
                  break;
               }
            } catch (Throwable var110) {
               var10000 = var110;
               var10001 = false;
               break label1025;
            }

            try {
               var6 = var6.f;
            } catch (Throwable var108) {
               var10000 = var108;
               var10001 = false;
               break label1025;
            }
         }

         label980: {
            try {
               var0.f = var6.f;
               var6.f = var0;
               if (var6 == d) {
                  b.a.class.notify();
                  break label980;
               }
            } catch (Throwable var107) {
               var10000 = var107;
               var10001 = false;
               break label1025;
            }

            return;
         }

         return;
      }

      Throwable var117 = var10000;
      throw var117;
   }

   private static boolean a(b.a var0) {
      synchronized(b.a.class){}

      label141: {
         Throwable var10000;
         label140: {
            b.a var1;
            boolean var10001;
            try {
               var1 = d;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label140;
            }

            while(true) {
               if (var1 == null) {
                  return true;
               }

               try {
                  if (var1.f == var0) {
                     var1.f = var0.f;
                     var0.f = null;
                     break label141;
                  }
               } catch (Throwable var12) {
                  var10000 = var12;
                  var10001 = false;
                  break;
               }

               try {
                  var1 = var1.f;
               } catch (Throwable var11) {
                  var10000 = var11;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var14 = var10000;
         throw var14;
      }

      return false;
   }

   static b.a e() {
      b.a var4 = d.f;
      long var0;
      if (var4 == null) {
         var0 = System.nanoTime();
         b.a.class.wait(a);
         return d.f == null && System.nanoTime() - var0 >= c ? d : null;
      } else {
         var0 = System.nanoTime();
         var0 = var4.g - var0;
         if (var0 > 0L) {
            long var2 = var0 / 1000000L;
            b.a.class.wait(var2, (int)(var0 - 1000000L * var2));
            return null;
         } else {
            d.f = var4.f;
            var4.f = null;
            return var4;
         }
      }
   }

   // $FF: synthetic method
   static b.a f() {
      return d;
   }

   // $FF: synthetic method
   static b.a g() {
      d = null;
      return null;
   }

   protected IOException a(IOException var1) {
      InterruptedIOException var2 = new InterruptedIOException("timeout");
      if (var1 != null) {
         var2.initCause(var1);
      }

      return var2;
   }

   protected void a() {
   }

   final void a(boolean var1) {
      if (this.b_()) {
         if (var1) {
            throw this.a((IOException)null);
         }
      }
   }

   public final void a_() {
      if (!this.e) {
         long var1 = this.c_();
         boolean var3 = this.d_();
         if (var1 != 0L || var3) {
            this.e = true;
            a(this, var1, var3);
         }
      } else {
         throw new IllegalStateException("Unbalanced enter/exit");
      }
   }

   final IOException b(IOException var1) {
      return !this.b_() ? var1 : this.a(var1);
   }

   public final boolean b_() {
      if (!this.e) {
         return false;
      } else {
         this.e = false;
         return a(this);
      }
   }

   static final class a extends Thread {
      public a() {
         super("Okio Watchdog");
         this.setDaemon(true);
      }

      public final void run() {
         // $FF: Couldn't be decompiled
      }
   }
}
