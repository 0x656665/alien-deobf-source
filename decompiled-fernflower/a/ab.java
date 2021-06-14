package a;

import java.net.InetSocketAddress;
import java.net.Proxy;

public final class ab {
   public final a a;
   public final Proxy b;
   public final InetSocketAddress c;

   public ab(a var1, Proxy var2, InetSocketAddress var3) {
      if (var1 != null) {
         if (var2 != null) {
            if (var3 != null) {
               this.a = var1;
               this.b = var2;
               this.c = var3;
            } else {
               throw new NullPointerException("inetSocketAddress == null");
            }
         } else {
            throw new NullPointerException("proxy == null");
         }
      } else {
         throw new NullPointerException("address == null");
      }
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof ab) {
         ab var2 = (ab)var1;
         return this.a.equals(var2.a) && this.b.equals(var2.b) && this.c.equals(var2.c);
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return ((this.a.hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("Route{");
      var1.append(this.c);
      var1.append("}");
      return var1.toString();
   }
}
