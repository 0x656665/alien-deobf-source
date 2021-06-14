package a.a;

public abstract class b implements Runnable {
   protected final String b;

   public b(String var1, Object... var2) {
      this.b = c.a(var1, var2);
   }

   protected abstract void blockBack2();

   public final void run() {
      String var1 = Thread.currentThread().getName();
      Thread.currentThread().setName(this.b);

      try {
         this.blockBack2();
      } finally {
         Thread.currentThread().setName(var1);
      }

   }
}
