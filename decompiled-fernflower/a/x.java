package a;

public final class x {
   public final r a;
   public final String b;
   public final q c;
   public final y d;
   final Object e;
   private volatile d f;

   x(x.a var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c.a();
      this.d = var1.d;
      Object var2;
      if (var1.e != null) {
         var2 = var1.e;
      } else {
         var2 = this;
      }

      this.e = var2;
   }

   public final x.a a() {
      return new x.a(this);
   }

   public final String a(String var1) {
      return this.c.a(var1);
   }

   public final d b() {
      d var1 = this.f;
      if (var1 != null) {
         return var1;
      } else {
         var1 = a.d.a(this.c);
         this.f = var1;
         return var1;
      }
   }

   public final String toString() {
      StringBuilder var2 = new StringBuilder("Request{method=");
      var2.append(this.b);
      var2.append(", url=");
      var2.append(this.a);
      var2.append(", tag=");
      Object var1;
      if (this.e != this) {
         var1 = this.e;
      } else {
         var1 = null;
      }

      var2.append(var1);
      var2.append('}');
      return var2.toString();
   }

   public static final class a {
      r a;
      String b;
      public q.a c;
      y d;
      Object e;

      public a() {
         this.b = "GET";
         this.c = new q.a();
      }

      a(x var1) {
         this.a = var1.a;
         this.b = var1.b;
         this.d = var1.d;
         this.e = var1.e;
         this.c = var1.c.a();
      }

      public final x.a a(r var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("url == null");
         }
      }

      public final x.a a(String var1) {
         this.c.a(var1);
         return this;
      }

      public final x.a a(String var1, y var2) {
         if (var1 != null) {
            if (var1.length() != 0) {
               StringBuilder var3;
               if (var2 != null && !a.a.c.f.b(var1)) {
                  var3 = new StringBuilder("method ");
                  var3.append(var1);
                  var3.append(" must not have a request body.");
                  throw new IllegalArgumentException(var3.toString());
               } else if (var2 == null && a.a.c.f.a(var1)) {
                  var3 = new StringBuilder("method ");
                  var3.append(var1);
                  var3.append(" must have a request body.");
                  throw new IllegalArgumentException(var3.toString());
               } else {
                  this.b = var1;
                  this.d = var2;
                  return this;
               }
            } else {
               throw new IllegalArgumentException("method.length() == 0");
            }
         } else {
            throw new NullPointerException("method == null");
         }
      }

      public final x.a a(String var1, String var2) {
         q.a var3 = this.c;
         q.a.b(var1, var2);
         var3.a(var1);
         var3.a(var1, var2);
         return this;
      }

      public final x a() {
         if (this.a != null) {
            return new x(this);
         } else {
            throw new IllegalStateException("url == null");
         }
      }
   }
}
