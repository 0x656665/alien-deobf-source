package a.a.h;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class a extends b {
   private final e a;

   public a(e var1) {
      this.a = var1;
   }

   private static boolean a(X509Certificate var0, X509Certificate var1) {
      if (!var0.getIssuerDN().equals(var1.getSubjectDN())) {
         return false;
      } else {
         try {
            var0.verify(var1.getPublicKey());
            return true;
         } catch (GeneralSecurityException var2) {
            return false;
         }
      }
   }

   public final List a(List var1, String var2) {
      ArrayDeque var8 = new ArrayDeque(var1);
      ArrayList var9 = new ArrayList();
      var9.add(var8.removeFirst());
      int var3 = 0;

      for(boolean var4 = false; var3 < 9; ++var3) {
         X509Certificate var5 = (X509Certificate)var9.get(var9.size() - 1);
         X509Certificate var6 = this.a.a(var5);
         if (var6 == null) {
            Iterator var10 = var8.iterator();

            X509Certificate var7;
            do {
               if (!var10.hasNext()) {
                  if (var4) {
                     return var9;
                  }

                  throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(String.valueOf(var5)));
               }

               var7 = (X509Certificate)var10.next();
            } while(!a(var5, var7));

            var10.remove();
            var9.add(var7);
         } else {
            if (var9.size() > 1 || !var5.equals(var6)) {
               var9.add(var6);
            }

            if (a(var6, var6)) {
               return var9;
            }

            var4 = true;
         }
      }

      throw new SSLPeerUnverifiedException("Certificate chain too long: ".concat(String.valueOf(var9)));
   }

   public final boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return var1 instanceof a && ((a)var1).a.equals(this.a);
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }
}
