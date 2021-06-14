package a;

import java.io.Closeable;

public final class z implements Closeable {
   public final x a;
   final v b;
   public final int c;
   final String d;
   public final p e;
   public final q f;
   public final aa g;
   final z h;
   final z i;
   final z j;
   public final long k;
   public final long l;
   private volatile d m;

   z(z.a var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f.a();
      this.g = var1.g;
      this.h = var1.h;
      this.i = var1.i;
      this.j = var1.j;
      this.k = var1.k;
      this.l = var1.l;
   }

   public final z.a a() {
      return new z.a(this);
   }

   public final String decrypt_str(String var1) {
      var1 = this.f.a(var1);
      return var1 != null ? var1 : null;
   }

   public final d b() {
      d var1 = this.m;
      if (var1 != null) {
         return var1;
      } else {
         var1 = a.d.a(this.f);
         this.m = var1;
         return var1;
      }
   }

   public final void close() {
      this.g.close();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("Response{protocol=");
      var1.append(this.b);
      var1.append(", code=");
      var1.append(this.c);
      var1.append(", message=");
      var1.append(this.d);
      var1.append(", url=");
      var1.append(this.a.a);
      var1.append('}');
      return var1.toString();
   }

   public static final class a {
      public x a;
      public v b;
      public int c = -1;
      public String d;
      public p e;
      q.a f;
      public aa g;
      z h;
      z i;
      public z j;
      public long k;
      public long l;

      public a() {
         this.f = new q.a();
      }

      a(z var1) {
         this.a = var1.a;
         this.b = var1.b;
         this.c = var1.c;
         this.d = var1.d;
         this.e = var1.e;
         this.f = var1.f.a();
         this.g = var1.g;
         this.h = var1.h;
         this.i = var1.i;
         this.j = var1.j;
         this.k = var1.k;
         this.l = var1.l;
      }

      private static void a(String var0, z var1) {
         StringBuilder var2;
         if (var1.g == null) {
            if (var1.h == null) {
               if (var1.i == null) {
                  if (var1.j != null) {
                     var2 = new StringBuilder();
                     var2.append(var0);
                     var2.append(".priorResponse != null");
                     throw new IllegalArgumentException(var2.toString());
                  }
               } else {
                  var2 = new StringBuilder();
                  var2.append(var0);
                  var2.append(".cacheResponse != null");
                  throw new IllegalArgumentException(var2.toString());
               }
            } else {
               var2 = new StringBuilder();
               var2.append(var0);
               var2.append(".networkResponse != null");
               throw new IllegalArgumentException(var2.toString());
            }
         } else {
            var2 = new StringBuilder();
            var2.append(var0);
            var2.append(".body != null");
            throw new IllegalArgumentException(var2.toString());
         }
      }

      public final z.a a(q var1) {
         this.f = var1.a();
         return this;
      }

      public final z.a a(z var1) {
         if (var1 != null) {
            a("networkResponse", var1);
         }

         this.h = var1;
         return this;
      }

      public final z.a a(String var1, String var2) {
         q.a var3 = this.f;
         q.a.b(var1, var2);
         var3.a(var1, var2);
         return this;
      }

      public final z a() {
         if (this.a != null) {
            if (this.b != null) {
               if (this.c >= 0) {
                  return new z(this);
               } else {
                  StringBuilder var1 = new StringBuilder("code < 0: ");
                  var1.append(this.c);
                  throw new IllegalStateException(var1.toString());
               }
            } else {
               throw new IllegalStateException("protocol == null");
            }
         } else {
            throw new IllegalStateException("request == null");
         }
      }

      public final z.a b(z var1) {
         if (var1 != null) {
            a("cacheResponse", var1);
         }

         this.i = var1;
         return this;
      }
   }
}
