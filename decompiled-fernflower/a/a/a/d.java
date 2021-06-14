package a.a.a;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

public final class d implements Closeable, Flushable {
   static final Pattern a = Pattern.compile("[a-z0-9_-]{1,120}");
   // $FF: synthetic field
   static final boolean j = d.class.desiredAssertionStatus() ^ true;
   final a.a.f.a b;
   final int c;
   b.d d;
   final LinkedHashMap e;
   int f;
   boolean g;
   boolean h;
   boolean i;
   private long k;
   private long l;
   private final Executor m;
   private final Runnable n;

   private void a(d.a var1) {
      synchronized(this){}

      Throwable var10000;
      label551: {
         boolean var10001;
         label559: {
            d.b var3;
            try {
               var3 = var1.a;
               if (var3.f != var1) {
                  break label559;
               }
            } catch (Throwable var59) {
               var10000 = var59;
               var10001 = false;
               break label551;
            }

            int var2 = 0;

            while(true) {
               try {
                  if (var2 >= this.c) {
                     break;
                  }

                  File var60 = var3.d[var2];
                  this.b.a(var60);
               } catch (Throwable var57) {
                  var10000 = var57;
                  var10001 = false;
                  break label551;
               }

               ++var2;
            }

            label532: {
               try {
                  ++this.f;
                  var3.f = null;
                  if (false | var3.e) {
                     var3.e = true;
                     this.d.b("CLEAN").h(32);
                     this.d.b(var3.a);
                     var3.a(this.d);
                     this.d.h(10);
                     break label532;
                  }
               } catch (Throwable var56) {
                  var10000 = var56;
                  var10001 = false;
                  break label551;
               }

               try {
                  this.e.remove(var3.a);
                  this.d.b("REMOVE").h(32);
                  this.d.b(var3.a);
                  this.d.h(10);
               } catch (Throwable var55) {
                  var10000 = var55;
                  var10001 = false;
                  break label551;
               }
            }

            try {
               this.d.flush();
               if (this.l <= this.k && !this.a()) {
                  return;
               }
            } catch (Throwable var54) {
               var10000 = var54;
               var10001 = false;
               break label551;
            }

            try {
               this.m.execute(this.n);
            } catch (Throwable var53) {
               var10000 = var53;
               var10001 = false;
               break label551;
            }

            return;
         }

         label545:
         try {
            throw new IllegalStateException();
         } catch (Throwable var58) {
            var10000 = var58;
            var10001 = false;
            break label545;
         }
      }

      Throwable var61 = var10000;
      throw var61;
   }

   private boolean a() {
      return this.f >= 2000 && this.f >= this.e.size();
   }

   private boolean a(d.b var1) {
      d.a var4 = var1.f;
      byte var3 = 0;
      int var2 = var3;
      if (var4 != null) {
         var4 = var1.f;
         var2 = var3;
         if (var4.a.f == var4) {
            for(var2 = 0; var2 < var4.c.c; ++var2) {
               try {
                  var4.c.b.a(var4.a.d[var2]);
               } catch (IOException var6) {
               }
            }

            var4.a.f = null;
            var2 = var3;
         }
      }

      while(var2 < this.c) {
         this.b.a(var1.c[var2]);
         this.l -= var1.b[var2];
         var1.b[var2] = 0L;
         ++var2;
      }

      ++this.f;
      this.d.b("REMOVE").h(32).b(var1.a).h(10);
      this.e.remove(var1.a);
      if (this.a()) {
         this.m.execute(this.n);
      }

      return true;
   }

   private boolean b() {
      synchronized(this){}

      boolean var1;
      try {
         var1 = this.h;
      } finally {
         ;
      }

      return var1;
   }

   private void c() {
      synchronized(this){}

      Throwable var10000;
      label72: {
         boolean var1;
         boolean var10001;
         try {
            var1 = this.b();
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label72;
         }

         if (!var1) {
            return;
         }

         label63:
         try {
            throw new IllegalStateException("cache is closed");
         } catch (Throwable var7) {
            var10000 = var7;
            var10001 = false;
            break label63;
         }
      }

      Throwable var2 = var10000;
      throw var2;
   }

   private void d() {
      while(this.l > this.k) {
         this.a((d.b)this.e.values().iterator().next());
      }

      this.i = false;
   }

   public final void close() {
      // $FF: Couldn't be decompiled
   }

   public final void flush() {
      synchronized(this){}

      Throwable var10000;
      label78: {
         boolean var1;
         boolean var10001;
         try {
            var1 = this.g;
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label78;
         }

         if (!var1) {
            return;
         }

         try {
            this.c();
            this.d();
            this.d.flush();
         } catch (Throwable var7) {
            var10000 = var7;
            var10001 = false;
            break label78;
         }

         return;
      }

      Throwable var2 = var10000;
      throw var2;
   }

   public final class a {
      final d.b a;
      boolean b;
      // $FF: synthetic field
      final d c;
   }

   final class b {
      final String a;
      final long[] b;
      final File[] c;
      final File[] d;
      boolean e;
      d.a f;

      final void a(b.d var1) {
         long[] var6 = this.b;
         int var3 = var6.length;

         for(int var2 = 0; var2 < var3; ++var2) {
            long var4 = var6[var2];
            var1.h(32).j(var4);
         }

      }
   }
}
