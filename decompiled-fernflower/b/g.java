package b;

public abstract class g implements r {
   private final r a;

   public g(r var1) {
      if (var1 != null) {
         this.a = var1;
      } else {
         throw new IllegalArgumentException("delegate == null");
      }
   }

   public final long a(c var1, long var2) {
      return this.a.a(var1, var2);
   }

   public final s a() {
      return this.a.a();
   }

   public void close() {
      this.a.close();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.getClass().getSimpleName());
      var1.append("(");
      var1.append(this.a.toString());
      var1.append(")");
      return var1.toString();
   }
}
