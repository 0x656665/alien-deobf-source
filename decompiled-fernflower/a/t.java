package a;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class t {
   private static final Pattern b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
   private static final Pattern c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
   final String a;
   private final String d;
   private final String e;
   private final String f;

   private t(String var1, String var2, String var3, String var4) {
      this.d = var1;
      this.e = var2;
      this.f = var3;
      this.a = var4;
   }

   public static t a(String var0) {
      Matcher var2 = b.matcher(var0);
      if (!var2.lookingAt()) {
         return null;
      } else {
         String var5 = var2.group(1).toLowerCase(Locale.US);
         String var6 = var2.group(2).toLowerCase(Locale.US);
         Matcher var7 = c.matcher(var0);
         int var1 = var2.end();

         String var3;
         String var8;
         for(var3 = null; var1 < var0.length(); var3 = var8) {
            var7.region(var1, var0.length());
            if (!var7.lookingAt()) {
               return null;
            }

            String var4 = var7.group(1);
            var8 = var3;
            if (var4 != null) {
               var8 = var3;
               if (var4.equalsIgnoreCase("charset")) {
                  var4 = var7.group(2);
                  if (var4 != null) {
                     var8 = var4;
                     if (var4.startsWith("'")) {
                        var8 = var4;
                        if (var4.endsWith("'")) {
                           var8 = var4;
                           if (var4.length() > 2) {
                              var8 = var4.substring(1, var4.length() - 1);
                           }
                        }
                     }
                  } else {
                     var8 = var7.group(3);
                  }

                  if (var3 != null && !var8.equalsIgnoreCase(var3)) {
                     throw new IllegalArgumentException("Multiple different charsets: ".concat(String.valueOf(var0)));
                  }
               }
            }

            var1 = var7.end();
         }

         return new t(var0, var5, var6, var3);
      }
   }

   public final boolean equals(Object var1) {
      return var1 instanceof t && ((t)var1).d.equals(this.d);
   }

   public final int hashCode() {
      return this.d.hashCode();
   }

   public final String toString() {
      return this.d;
   }
}
