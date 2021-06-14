package a.a.h;

import java.lang.reflect.Method;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

public abstract class e {
   public static e a(X509TrustManager var0) {
      try {
         Method var1 = var0.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
         var1.setAccessible(true);
         e.a var3 = new e.a(var0, var1);
         return var3;
      } catch (NoSuchMethodException var2) {
         return new e.b(var0.getAcceptedIssuers());
      }
   }

   public abstract X509Certificate a(X509Certificate var1);

   static final class a extends e {
      private final X509TrustManager a;
      private final Method b;

      a(X509TrustManager var1, Method var2) {
         this.b = var2;
         this.a = var1;
      }

      public final X509Certificate a(X509Certificate param1) {
         // $FF: Couldn't be decompiled
      }

      public final boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof e.a)) {
            return false;
         } else {
            e.a var2 = (e.a)var1;
            return this.a.equals(var2.a) && this.b.equals(var2.b);
         }
      }

      public final int hashCode() {
         return this.a.hashCode() + this.b.hashCode() * 31;
      }
   }

   static final class b extends e {
      private final Map a = new LinkedHashMap();

      public b(X509Certificate... var1) {
         int var3 = var1.length;

         for(int var2 = 0; var2 < var3; ++var2) {
            X509Certificate var6 = var1[var2];
            X500Principal var7 = var6.getSubjectX500Principal();
            Set var5 = (Set)this.a.get(var7);
            Object var4 = var5;
            if (var5 == null) {
               var4 = new LinkedHashSet(1);
               this.a.put(var7, var4);
            }

            ((Set)var4).add(var6);
         }

      }

      public final X509Certificate a(X509Certificate var1) {
         X500Principal var2 = var1.getIssuerX500Principal();
         Set var6 = (Set)this.a.get(var2);
         if (var6 == null) {
            return null;
         } else {
            Iterator var7 = var6.iterator();

            while(var7.hasNext()) {
               X509Certificate var3 = (X509Certificate)var7.next();
               PublicKey var4 = var3.getPublicKey();

               try {
                  var1.verify(var4);
                  return var3;
               } catch (Exception var5) {
               }
            }

            return null;
         }
      }

      public final boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else {
            return var1 instanceof e.b && ((e.b)var1).a.equals(this.a);
         }
      }

      public final int hashCode() {
         return this.a.hashCode();
      }
   }
}
