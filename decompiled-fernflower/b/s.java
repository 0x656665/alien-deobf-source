package b;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class s {
   public static final s b = new s() {
      public final s a(long var1) {
         return this;
      }

      public final s a(long var1, TimeUnit var3) {
         return this;
      }

      public final void f_() {
      }
   };
   private boolean a;
   private long c;
   private long d;

   public s a(long var1) {
      this.a = true;
      this.c = var1;
      return this;
   }

   public s a(long var1, TimeUnit var3) {
      if (var1 >= 0L) {
         if (var3 != null) {
            this.d = var3.toNanos(var1);
            return this;
         } else {
            throw new IllegalArgumentException("unit == null");
         }
      } else {
         throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(var1)));
      }
   }

   public long c() {
      if (this.a) {
         return this.c;
      } else {
         throw new IllegalStateException("No deadline");
      }
   }

   public long c_() {
      return this.d;
   }

   public s d() {
      this.d = 0L;
      return this;
   }

   public boolean d_() {
      return this.a;
   }

   public s e_() {
      this.a = false;
      return this;
   }

   public void f_() {
      if (!Thread.interrupted()) {
         if (this.a) {
            if (this.c - System.nanoTime() <= 0L) {
               throw new InterruptedIOException("deadline reached");
            }
         }
      } else {
         throw new InterruptedIOException("thread interrupted");
      }
   }
}
