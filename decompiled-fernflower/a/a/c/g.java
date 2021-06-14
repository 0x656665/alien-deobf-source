package a.a.c;

import a.r;
import a.s;
import a.x;
import a.z;
import java.util.List;

public final class g implements s.a {
   public final a.a.b.g a;
   final c b;
   public final x c;
   private final List d;
   private final a.h e;
   private final int f;
   private int g;

   public g(List var1, a.a.b.g var2, c var3, a.h var4, int var5, x var6) {
      this.d = var1;
      this.e = var4;
      this.a = var2;
      this.b = var3;
      this.f = var5;
      this.c = var6;
   }

   private boolean a(r var1) {
      return var1.b.equals(this.e.a().a.a.b) && var1.c == this.e.a().a.a.c;
   }

   public final x a() {
      return this.c;
   }

   public final z a(x var1) {
      return this.a(var1, this.a, this.b, this.e);
   }

   public final z a(x var1, a.a.b.g var2, c var3, a.h var4) {
      if (this.f < this.d.size()) {
         ++this.g;
         StringBuilder var6;
         if (this.b != null && !this.a(var1.a)) {
            var6 = new StringBuilder("network interceptor ");
            var6.append(this.d.get(this.f - 1));
            var6.append(" must retain the same host and port");
            throw new IllegalStateException(var6.toString());
         } else if (this.b != null && this.g > 1) {
            var6 = new StringBuilder("network interceptor ");
            var6.append(this.d.get(this.f - 1));
            var6.append(" must call proceed() exactly once");
            throw new IllegalStateException(var6.toString());
         } else {
            g var7 = new g(this.d, var2, var3, var4, this.f + 1, var1);
            s var5 = (s)this.d.get(this.f);
            z var9 = var5.a(var7);
            StringBuilder var8;
            if (var3 != null && this.f + 1 < this.d.size() && var7.g != 1) {
               var8 = new StringBuilder("network interceptor ");
               var8.append(var5);
               var8.append(" must call proceed() exactly once");
               throw new IllegalStateException(var8.toString());
            } else if (var9 != null) {
               return var9;
            } else {
               var8 = new StringBuilder("interceptor ");
               var8.append(var5);
               var8.append(" returned null");
               throw new NullPointerException(var8.toString());
            }
         }
      } else {
         throw new AssertionError();
      }
   }
}
