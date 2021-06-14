package a;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class p {
   public final g a;
   public final List b;
   private final ac c;
   private final List d;

   private p(ac var1, g var2, List var3, List var4) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
      this.d = var4;
   }

   public static p a(SSLSession var0) {
      String var1 = var0.getCipherSuite();
      if (var1 != null) {
         g var2 = g.a(var1);
         var1 = var0.getProtocol();
         if (var1 != null) {
            ac var3 = ac.a(var1);

            Certificate[] var7;
            try {
               var7 = var0.getPeerCertificates();
            } catch (SSLPeerUnverifiedException var4) {
               var7 = null;
            }

            List var8;
            if (var7 != null) {
               var8 = a.a.c.a((Object[])var7);
            } else {
               var8 = Collections.emptyList();
            }

            Certificate[] var5 = var0.getLocalCertificates();
            List var6;
            if (var5 != null) {
               var6 = a.a.c.a((Object[])var5);
            } else {
               var6 = Collections.emptyList();
            }

            return new p(var3, var2, var8, var6);
         } else {
            throw new IllegalStateException("tlsVersion == null");
         }
      } else {
         throw new IllegalStateException("cipherSuite == null");
      }
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof p)) {
         return false;
      } else {
         p var2 = (p)var1;
         return a.a.c.a((Object)this.a, (Object)var2.a) && this.a.equals(var2.a) && this.b.equals(var2.b) && this.d.equals(var2.d);
      }
   }

   public final int hashCode() {
      int var1;
      if (this.c != null) {
         var1 = this.c.hashCode();
      } else {
         var1 = 0;
      }

      return (((var1 + 527) * 31 + this.a.hashCode()) * 31 + this.b.hashCode()) * 31 + this.d.hashCode();
   }
}
