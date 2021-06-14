package a.a.c;

import a.v;
import java.net.ProtocolException;

public final class k {
   public final v a;
   public final int b;
   public final String c;

   private k(v var1, int var2, String var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public static k a(String var0) {
      boolean var4 = var0.startsWith("HTTP/1.");
      byte var1 = 9;
      int var2;
      v var5;
      if (var4) {
         if (var0.length() < 9 || var0.charAt(8) != ' ') {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(var0)));
         }

         var2 = var0.charAt(7) - 48;
         if (var2 == 0) {
            var5 = v.a;
         } else {
            if (var2 != 1) {
               throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(var0)));
            }

            var5 = v.b;
         }
      } else {
         if (!var0.startsWith("ICY ")) {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(var0)));
         }

         var5 = v.a;
         var1 = 4;
      }

      int var3 = var0.length();
      var2 = var1 + 3;
      if (var3 >= var2) {
         try {
            var3 = Integer.parseInt(var0.substring(var1, var2));
         } catch (NumberFormatException var7) {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(var0)));
         }

         String var6 = "";
         if (var0.length() > var2) {
            if (var0.charAt(var2) != ' ') {
               throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(var0)));
            }

            var6 = var0.substring(var1 + 4);
         }

         return new k(var5, var3, var6);
      } else {
         throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(var0)));
      }
   }

   public final String toString() {
      StringBuilder var2 = new StringBuilder();
      String var1;
      if (this.a == v.a) {
         var1 = "HTTP/1.0";
      } else {
         var1 = "HTTP/1.1";
      }

      var2.append(var1);
      var2.append(' ');
      var2.append(this.b);
      if (this.c != null) {
         var2.append(' ');
         var2.append(this.c);
      }

      return var2.toString();
   }
}
