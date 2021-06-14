package a.a.e;

import java.util.concurrent.CountDownLatch;

final class l {
   final CountDownLatch a = new CountDownLatch(1);
   long b = -1L;
   long c = -1L;

   final void a() {
      if (this.c == -1L && this.b != -1L) {
         this.c = this.b - 1L;
         this.a.countDown();
      } else {
         throw new IllegalStateException();
      }
   }
}
