package a;

public enum ac {
   a("TLSv1.3"),
   b("TLSv1.2"),
   c("TLSv1.1"),
   d("TLSv1"),
   e("SSLv3");

   final String f;

   private ac(String var3) {
      this.f = var3;
   }

   public static ac a(String var0) {
      byte var2;
      label38: {
         int var1 = var0.hashCode();
         if (var1 != 79201641) {
            if (var1 != 79923350) {
               switch(var1) {
               case -503070503:
                  if (var0.equals("TLSv1.1")) {
                     var2 = 2;
                     break label38;
                  }
                  break;
               case -503070502:
                  if (var0.equals("TLSv1.2")) {
                     var2 = 1;
                     break label38;
                  }
                  break;
               case -503070501:
                  if (var0.equals("TLSv1.3")) {
                     var2 = 0;
                     break label38;
                  }
               }
            } else if (var0.equals("TLSv1")) {
               var2 = 3;
               break label38;
            }
         } else if (var0.equals("SSLv3")) {
            var2 = 4;
            break label38;
         }

         var2 = -1;
      }

      switch(var2) {
      case 0:
         return a;
      case 1:
         return b;
      case 2:
         return c;
      case 3:
         return d;
      case 4:
         return e;
      default:
         throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(var0)));
      }
   }
}
