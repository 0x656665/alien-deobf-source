package b;

import java.util.concurrent.TimeUnit;

public final class h extends s {
   public s a;

   public h(s var1) {
      if (var1 != null) {
         this.a = var1;
      } else {
         throw new IllegalArgumentException("delegate == null");
      }
   }

   public final s a(long var1) {
      return this.a.a(var1);
   }

   public final s a(long var1, TimeUnit var3) {
      return this.a.a(var1, var3);
   }

   public final long c() {
      return this.a.c();
   }

   public final long c_() {
      return this.a.c_();
   }

   public final s d() {
      return this.a.d();
   }

   public final boolean d_() {
      return this.a.d_();
   }

   public final s e_() {
      return this.a.e_();
   }

   public final void f_() {
      this.a.f_();
   }
}
