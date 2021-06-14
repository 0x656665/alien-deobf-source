package a;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class i {
   static final Executor a;
   // $FF: synthetic field
   static final boolean g = i.class.desiredAssertionStatus() ^ true;
   final int b;
   final Runnable c;
   final Deque d;
   final a.a.b.d e;
   boolean f;
   private final long h;

   static {
      a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), a.a.c.a("OkHttp ConnectionPool", true));
   }

   public i() {
      this(TimeUnit.MINUTES);
   }

   private i(TimeUnit var1) {
      this.c = new Runnable() {
         public final void run() {
            while(true) {
               long var1 = i.this.a(System.nanoTime());
               if (var1 == -1L) {
                  return;
               }

               if (var1 > 0L) {
                  long var3 = var1 / 1000000L;
                  i var5 = i.this;
                  synchronized(var5){}

                  Throwable var10000;
                  boolean var10001;
                  label163: {
                     try {
                        try {
                           i.this.wait(var3, (int)(var1 - 1000000L * var3));
                        } catch (InterruptedException var21) {
                        }
                     } catch (Throwable var22) {
                        var10000 = var22;
                        var10001 = false;
                        break label163;
                     }

                     label149:
                     try {
                        continue;
                     } catch (Throwable var20) {
                        var10000 = var20;
                        var10001 = false;
                        break label149;
                     }
                  }

                  while(true) {
                     Throwable var6 = var10000;

                     try {
                        throw var6;
                     } catch (Throwable var19) {
                        var10000 = var19;
                        var10001 = false;
                        continue;
                     }
                  }
               }
            }
         }
      };
      this.d = new ArrayDeque();
      this.e = new a.a.b.d();
      this.b = 5;
      this.h = var1.toNanos(5L);
   }

   final long a(long var1) {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label1576: {
         Iterator var12;
         try {
            var12 = this.d.iterator();
         } catch (Throwable var171) {
            var10000 = var171;
            var10001 = false;
            break label1576;
         }

         long var6 = Long.MIN_VALUE;
         a.a.b.c var10 = null;
         int var3 = 0;
         int var4 = 0;

         while(true) {
            a.a.b.c var11;
            List var13;
            try {
               if (!var12.hasNext()) {
                  break;
               }

               var11 = (a.a.b.c)var12.next();
               var13 = var11.j;
            } catch (Throwable var168) {
               var10000 = var168;
               var10001 = false;
               break label1576;
            }

            int var5 = 0;

            while(true) {
               Reference var14;
               label1562: {
                  while(true) {
                     try {
                        if (var5 >= var13.size()) {
                           break;
                        }

                        var14 = (Reference)var13.get(var5);
                        if (var14.get() == null) {
                           break label1562;
                        }
                     } catch (Throwable var170) {
                        var10000 = var170;
                        var10001 = false;
                        break label1576;
                     }

                     ++var5;
                  }

                  try {
                     var5 = var13.size();
                     break;
                  } catch (Throwable var167) {
                     var10000 = var167;
                     var10001 = false;
                     break label1576;
                  }
               }

               try {
                  a.a.b.g.a var173 = (a.a.b.g.a)var14;
                  StringBuilder var15 = new StringBuilder("A connection to ");
                  var15.append(var11.a.a.a);
                  var15.append(" was leaked. Did you forget to close a response body?");
                  String var174 = var15.toString();
                  a.a.g.e.b().a(var174, var173.a);
                  var13.remove(var5);
                  var11.g = true;
                  if (!var13.isEmpty()) {
                     continue;
                  }

                  var11.k = var1 - this.h;
               } catch (Throwable var169) {
                  var10000 = var169;
                  var10001 = false;
                  break label1576;
               }

               var5 = 0;
               break;
            }

            if (var5 > 0) {
               ++var4;
            } else {
               var5 = var3 + 1;

               long var8;
               try {
                  var8 = var1 - var11.k;
               } catch (Throwable var166) {
                  var10000 = var166;
                  var10001 = false;
                  break label1576;
               }

               var3 = var5;
               if (var8 > var6) {
                  var10 = var11;
                  var6 = var8;
                  var3 = var5;
               }
            }
         }

         label1581: {
            try {
               if (var6 < this.h && var3 <= this.b) {
                  break label1581;
               }
            } catch (Throwable var165) {
               var10000 = var165;
               var10001 = false;
               break label1576;
            }

            try {
               this.d.remove(var10);
            } catch (Throwable var164) {
               var10000 = var164;
               var10001 = false;
               break label1576;
            }

            a.a.c.a(var10.b);
            return 0L;
         }

         if (var3 > 0) {
            label1518: {
               try {
                  var1 = this.h;
               } catch (Throwable var161) {
                  var10000 = var161;
                  var10001 = false;
                  break label1518;
               }

               return var1 - var6;
            }
         } else if (var4 > 0) {
            label1520:
            try {
               var1 = this.h;
               return var1;
            } catch (Throwable var162) {
               var10000 = var162;
               var10001 = false;
               break label1520;
            }
         } else {
            label1522:
            try {
               this.f = false;
               return -1L;
            } catch (Throwable var163) {
               var10000 = var163;
               var10001 = false;
               break label1522;
            }
         }
      }

      while(true) {
         Throwable var172 = var10000;

         try {
            throw var172;
         } catch (Throwable var160) {
            var10000 = var160;
            var10001 = false;
            continue;
         }
      }
   }
}
