package a.a.e;

public final class c {
   public static final b.f a = b.f.a(":");
   public static final b.f b = b.f.a(":status");
   public static final b.f c = b.f.a(":method");
   public static final b.f d = b.f.a(":path");
   public static final b.f e = b.f.a(":scheme");
   public static final b.f f = b.f.a(":authority");
   public final b.f g;
   public final b.f h;
   final int i;

   public c(b.f var1, b.f var2) {
      this.g = var1;
      this.h = var2;
      this.i = var1.g() + 32 + var2.g();
   }

   public c(b.f var1, String var2) {
      this(var1, b.f.a(var2));
   }

   public c(String var1, String var2) {
      this(b.f.a(var1), b.f.a(var2));
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof c) {
         c var2 = (c)var1;
         return this.g.equals(var2.g) && this.h.equals(var2.h);
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return (this.g.hashCode() + 527) * 31 + this.h.hashCode();
   }

   public final String toString() {
      return a.a.c.a("%s: %s", this.g.a(), this.h.a());
   }
}
