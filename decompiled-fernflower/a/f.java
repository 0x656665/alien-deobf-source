package a;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class f {
   public static final f a;
   final Set b;
   final a.a.h.b c;

   static {
      a = new f(new LinkedHashSet((new f.a()).a), (a.a.h.b)null);
   }

   f(Set var1, a.a.h.b var2) {
      this.b = var1;
      this.c = var2;
   }

   private static b.f a(X509Certificate var0) {
      return b.f.a(var0.getPublicKey().getEncoded()).d();
   }

   public static String a(Certificate var0) {
      if (var0 instanceof X509Certificate) {
         StringBuilder var1 = new StringBuilder("sha256/");
         var1.append(a((X509Certificate)var0).b());
         return var1.toString();
      } else {
         throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
      }
   }

   public final void a(String var1, List var2) {
      Object var11 = Collections.emptyList();
      Iterator var10 = this.b.iterator();

      while(var10.hasNext()) {
         f.b var12 = (f.b)var10.next();
         boolean var8;
         if (var12.a.startsWith("*.")) {
            var8 = var1.regionMatches(false, var1.indexOf(46) + 1, var12.b, 0, var12.b.length());
         } else {
            var8 = var1.equals(var12.b);
         }

         if (var8) {
            Object var9 = var11;
            if (((List)var11).isEmpty()) {
               var9 = new ArrayList();
            }

            ((List)var9).add(var12);
            var11 = var9;
         }
      }

      if (!((List)var11).isEmpty()) {
         List var21 = var2;
         if (this.c != null) {
            var21 = this.c.a(var2, var1);
         }

         int var6 = var21.size();
         byte var5 = 0;

         int var3;
         int var4;
         for(var3 = 0; var3 < var6; ++var3) {
            X509Certificate var13 = (X509Certificate)var21.get(var3);
            int var7 = ((List)var11).size();
            b.f var18 = null;
            b.f var16 = var18;

            for(var4 = 0; var4 < var7; ++var4) {
               f.b var14 = (f.b)((List)var11).get(var4);
               b.f var19;
               if (var14.c.equals("sha256/")) {
                  var19 = var18;
                  if (var18 == null) {
                     var19 = a(var13);
                  }

                  var18 = var19;
                  if (var14.d.equals(var19)) {
                     return;
                  }
               } else {
                  if (!var14.c.equals("sha1/")) {
                     throw new AssertionError();
                  }

                  var19 = var16;
                  if (var16 == null) {
                     var19 = b.f.a(var13.getPublicKey().getEncoded()).c();
                  }

                  var16 = var19;
                  if (var14.d.equals(var19)) {
                     return;
                  }
               }
            }
         }

         StringBuilder var17 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
         var4 = var21.size();

         for(var3 = 0; var3 < var4; ++var3) {
            X509Certificate var20 = (X509Certificate)var21.get(var3);
            var17.append("\n    ");
            var17.append(a((Certificate)var20));
            var17.append(": ");
            var17.append(var20.getSubjectDN().getName());
         }

         var17.append("\n  Pinned certificates for ");
         var17.append(var1);
         var17.append(":");
         var4 = ((List)var11).size();

         for(var3 = var5; var3 < var4; ++var3) {
            f.b var15 = (f.b)((List)var11).get(var3);
            var17.append("\n    ");
            var17.append(var15);
         }

         throw new SSLPeerUnverifiedException(var17.toString());
      }
   }

   public final boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         if (var1 instanceof f) {
            a.a.h.b var2 = this.c;
            f var3 = (f)var1;
            if (a.a.c.a((Object)var2, (Object)var3.c) && this.b.equals(var3.b)) {
               return true;
            }
         }

         return false;
      }
   }

   public final int hashCode() {
      int var1;
      if (this.c != null) {
         var1 = this.c.hashCode();
      } else {
         var1 = 0;
      }

      return var1 * 31 + this.b.hashCode();
   }

   public static final class a {
      final List a = new ArrayList();
   }

   static final class b {
      final String a;
      final String b;
      final String c;
      final b.f d;

      public final boolean equals(Object var1) {
         if (var1 instanceof f.b) {
            String var2 = this.a;
            f.b var3 = (f.b)var1;
            if (var2.equals(var3.a) && this.c.equals(var3.c) && this.d.equals(var3.d)) {
               return true;
            }
         }

         return false;
      }

      public final int hashCode() {
         return ((this.a.hashCode() + 527) * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
      }

      public final String toString() {
         StringBuilder var1 = new StringBuilder();
         var1.append(this.c);
         var1.append(this.d.b());
         return var1.toString();
      }
   }
}
