package a.a.b;

import a.j;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class b {
   boolean a;
   boolean b;
   private final List c;
   private int d = 0;

   public b(List var1) {
      this.c = var1;
   }

   private boolean b(SSLSocket var1) {
      for(int var2 = this.d; var2 < this.c.size(); ++var2) {
         if (((j)this.c.get(var2)).a(var1)) {
            return true;
         }
      }

      return false;
   }

   public final j a(SSLSocket var1) {
      int var2 = this.d;
      int var3 = this.c.size();

      j var4;
      while(true) {
         if (var2 >= var3) {
            var4 = null;
            break;
         }

         var4 = (j)this.c.get(var2);
         if (var4.a(var1)) {
            this.d = var2 + 1;
            break;
         }

         ++var2;
      }

      if (var4 != null) {
         this.a = this.b(var1);
         a.a.a.a.a(var4, var1, this.b);
         return var4;
      } else {
         StringBuilder var5 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
         var5.append(this.b);
         var5.append(", modes=");
         var5.append(this.c);
         var5.append(", supported protocols=");
         var5.append(Arrays.toString(var1.getEnabledProtocols()));
         throw new UnknownServiceException(var5.toString());
      }
   }
}
