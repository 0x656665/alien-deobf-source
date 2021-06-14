package a.a.b;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class e extends RuntimeException {
   private static final Method b;
   public IOException a;

   static {
      Method var0;
      try {
         var0 = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
      } catch (Exception var1) {
         var0 = null;
      }

      b = var0;
   }

   public e(IOException var1) {
      super(var1);
      this.a = var1;
   }

   static void a(IOException var0, IOException var1) {
      if (b != null) {
         try {
            b.invoke(var0, var1);
         } catch (IllegalAccessException | InvocationTargetException var2) {
         }
      }
   }
}
