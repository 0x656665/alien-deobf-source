package a.a.g;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class d {
   private final Class a;
   private final String b;
   private final Class[] c;

   public d(Class var1, String var2, Class... var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   private Method a(Class var1) {
      String var3 = this.b;
      Method var2 = null;
      if (var3 != null) {
         var2 = a(var1, this.b, this.c);
         if (var2 != null && this.a != null && !this.a.isAssignableFrom(var2.getReturnType())) {
            return null;
         }
      }

      return var2;
   }

   private static Method a(Class var0, String var1, Class[] var2) {
      Method var6;
      label23: {
         try {
            var6 = var0.getMethod(var1, var2);
         } catch (NoSuchMethodException var5) {
            break label23;
         }

         int var3;
         try {
            var3 = var6.getModifiers();
         } catch (NoSuchMethodException var4) {
            return var6;
         }

         if ((var3 & 1) != 0) {
            return var6;
         }
      }

      var6 = null;
      return var6;
   }

   private Object c(Object var1, Object... var2) {
      Method var3 = this.a(var1.getClass());
      if (var3 == null) {
         return null;
      } else {
         try {
            var1 = var3.invoke(var1, var2);
            return var1;
         } catch (IllegalAccessException var4) {
            return null;
         }
      }
   }

   private Object d(Object var1, Object... var2) {
      Method var3 = this.a(var1.getClass());
      if (var3 != null) {
         try {
            var1 = var3.invoke(var1, var2);
            return var1;
         } catch (IllegalAccessException var4) {
            AssertionError var6 = new AssertionError("Unexpectedly could not call: ".concat(String.valueOf(var3)));
            var6.initCause(var4);
            throw var6;
         }
      } else {
         StringBuilder var5 = new StringBuilder("Method ");
         var5.append(this.b);
         var5.append(" not supported for object ");
         var5.append(var1);
         throw new AssertionError(var5.toString());
      }
   }

   public final Object a(Object var1, Object... var2) {
      try {
         var1 = this.c(var1, var2);
         return var1;
      } catch (InvocationTargetException var3) {
         Throwable var4 = var3.getTargetException();
         if (var4 instanceof RuntimeException) {
            throw (RuntimeException)var4;
         } else {
            AssertionError var5 = new AssertionError("Unexpected exception");
            var5.initCause(var4);
            throw var5;
         }
      }
   }

   public final boolean a(Object var1) {
      return this.a(var1.getClass()) != null;
   }

   public final Object b(Object var1, Object... var2) {
      try {
         var1 = this.d(var1, var2);
         return var1;
      } catch (InvocationTargetException var3) {
         Throwable var4 = var3.getTargetException();
         if (var4 instanceof RuntimeException) {
            throw (RuntimeException)var4;
         } else {
            AssertionError var5 = new AssertionError("Unexpected exception");
            var5.initCause(var4);
            throw var5;
         }
      }
   }
}
