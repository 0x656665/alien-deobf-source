package a;

import java.util.ArrayList;
import java.util.List;

public final class o extends y {
   private static final t a = t.a("application/x-www-form-urlencoded");
   private final List b;
   private final List c;

   public o(List var1, List var2) {
      this.b = a.a.c.a(var1);
      this.c = a.a.c.a(var2);
   }

   private long a(b.d var1, boolean var2) {
      b.c var7;
      if (var2) {
         var7 = new b.c();
      } else {
         var7 = var1.b();
      }

      int var3 = 0;

      for(int var4 = this.b.size(); var3 < var4; ++var3) {
         if (var3 > 0) {
            var7.b(38);
         }

         var7.a((String)this.b.get(var3));
         var7.b(61);
         var7.a((String)this.c.get(var3));
      }

      if (var2) {
         long var5 = var7.b;
         var7.o();
         return var5;
      } else {
         return 0L;
      }
   }

   public final t a() {
      return a;
   }

   public final void a(b.d var1) {
      this.a(var1, false);
   }

   public final long b() {
      return this.a((b.d)null, true);
   }

   public static final class a {
      public final List a = new ArrayList();
      public final List b = new ArrayList();

      public final o.a a(String var1, String var2) {
         this.a.add(r.a(var1, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
         this.b.add(r.a(var2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
         return this;
      }
   }
}
