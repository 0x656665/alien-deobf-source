package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class q {
   public final String[] a;

   q(q.a var1) {
      this.a = (String[])var1.a.toArray(new String[var1.a.size()]);
   }

   public final q.a a() {
      q.a var1 = new q.a();
      Collections.addAll(var1.a, this.a);
      return var1;
   }

   public final String a(int var1) {
      return this.a[var1 * 2];
   }

   public final String a(String var1) {
      String[] var3 = this.a;

      for(int var2 = var3.length - 2; var2 >= 0; var2 -= 2) {
         if (var1.equalsIgnoreCase(var3[var2])) {
            return var3[var2 + 1];
         }
      }

      return null;
   }

   public final String b(int var1) {
      return this.a[var1 * 2 + 1];
   }

   public final boolean equals(Object var1) {
      return var1 instanceof q && Arrays.equals(((q)var1).a, this.a);
   }

   public final int hashCode() {
      return Arrays.hashCode(this.a);
   }

   public final String toString() {
      StringBuilder var3 = new StringBuilder();
      int var2 = this.a.length / 2;

      for(int var1 = 0; var1 < var2; ++var1) {
         var3.append(this.a(var1));
         var3.append(": ");
         var3.append(this.b(var1));
         var3.append("\n");
      }

      return var3.toString();
   }

   public static final class a {
      final List a = new ArrayList(20);

      static void b(String var0, String var1) {
         if (var0 == null) {
            throw new NullPointerException("name == null");
         } else if (var0.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
         } else {
            int var3 = var0.length();

            int var2;
            char var4;
            for(var2 = 0; var2 < var3; ++var2) {
               var4 = var0.charAt(var2);
               if (var4 <= ' ' || var4 >= 127) {
                  throw new IllegalArgumentException(a.a.c.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(var4), var2, var0));
               }
            }

            if (var1 == null) {
               throw new NullPointerException("value == null");
            } else {
               var3 = var1.length();

               for(var2 = 0; var2 < var3; ++var2) {
                  var4 = var1.charAt(var2);
                  if (var4 <= 31 && var4 != '\t' || var4 >= 127) {
                     throw new IllegalArgumentException(a.a.c.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(var4), var2, var0, var1));
                  }
               }

            }
         }
      }

      public final q.a a(String var1) {
         int var3;
         for(int var2 = 0; var2 < this.a.size(); var2 = var3 + 2) {
            var3 = var2;
            if (var1.equalsIgnoreCase((String)this.a.get(var2))) {
               this.a.remove(var2);
               this.a.remove(var2);
               var3 = var2 - 2;
            }
         }

         return this;
      }

      final q.a a(String var1, String var2) {
         this.a.add(var1);
         this.a.add(var2.trim());
         return this;
      }

      public final q a() {
         return new q(this);
      }
   }
}
