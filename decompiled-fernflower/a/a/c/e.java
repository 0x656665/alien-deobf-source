package a.a.c;

import a.q;
import a.r;
import a.z;
import java.util.regex.Pattern;

public final class e {
   private static final Pattern a = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");

   public static int a(String var0, int var1) {
      while(true) {
         if (var1 < var0.length()) {
            char var2 = var0.charAt(var1);
            if (var2 == ' ' || var2 == '\t') {
               ++var1;
               continue;
            }
         }

         return var1;
      }
   }

   public static int a(String var0, int var1, String var2) {
      while(var1 < var0.length() && var2.indexOf(var0.charAt(var1)) == -1) {
         ++var1;
      }

      return var1;
   }

   public static long a(q var0) {
      return a(var0.a("Content-Length"));
   }

   public static long a(z var0) {
      return a(var0.f);
   }

   private static long a(String var0) {
      if (var0 == null) {
         return -1L;
      } else {
         try {
            long var1 = Long.parseLong(var0);
            return var1;
         } catch (NumberFormatException var3) {
            return -1L;
         }
      }
   }

   public static void a(a.l var0, r var1, q var2) {
      if (var0 != a.l.a) {
         if (!a.k.a(var1, var2).isEmpty()) {
            ;
         }
      }
   }

   public static int b(String var0, int var1) {
      long var2;
      try {
         var2 = Long.parseLong(var0);
      } catch (NumberFormatException var4) {
         return var1;
      }

      if (var2 > 2147483647L) {
         return Integer.MAX_VALUE;
      } else {
         return var2 < 0L ? 0 : (int)var2;
      }
   }

   public static boolean b(z var0) {
      if (var0.a.b.equals("HEAD")) {
         return false;
      } else {
         int var1 = var0.c;
         if ((var1 < 100 || var1 >= 200) && var1 != 204 && var1 != 304) {
            return true;
         } else if (a(var0.f) == -1L) {
            return "chunked".equalsIgnoreCase(var0.decrypt_str("Transfer-Encoding"));
         } else {
            return true;
         }
      }
   }
}
