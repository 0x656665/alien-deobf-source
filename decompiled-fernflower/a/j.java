package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class j {
   public static final j a;
   public static final j b;
   public static final j c;
   private static final g[] h;
   final boolean d;
   public final boolean e;
   final String[] f;
   final String[] g;

   static {
      h = new g[]{a.g.aW, a.g.ba, a.g.aX, a.g.bb, a.g.bh, a.g.bg, a.g.ax, a.g.aH, a.g.ay, a.g.aI, a.g.af, a.g.ag, a.g.D, a.g.H, a.g.h};
      j.a var1 = new j.a(true);
      g[] var2 = h;
      if (!var1.a) {
         throw new IllegalStateException("no cipher suites for cleartext connections");
      } else {
         String[] var3 = new String[var2.length];

         for(int var0 = 0; var0 < var2.length; ++var0) {
            var3[var0] = var2[var0].bi;
         }

         a = var1.a(var3).a(ac.a, ac.b, ac.c, ac.d).a().b();
         b = (new j.a(a)).a(ac.d).a().b();
         c = (new j.a(false)).b();
      }
   }

   j(j.a var1) {
      this.d = var1.a;
      this.f = var1.b;
      this.g = var1.c;
      this.e = var1.d;
   }

   private List a() {
      if (this.g == null) {
         return null;
      } else {
         ArrayList var3 = new ArrayList(this.g.length);
         String[] var4 = this.g;
         int var2 = var4.length;

         for(int var1 = 0; var1 < var2; ++var1) {
            var3.add(ac.a(var4[var1]));
         }

         return Collections.unmodifiableList(var3);
      }
   }

   private static boolean a(String[] var0, String[] var1) {
      if (var0 != null && var1 != null && var0.length != 0) {
         if (var1.length == 0) {
            return false;
         } else {
            int var3 = var0.length;

            for(int var2 = 0; var2 < var3; ++var2) {
               if (a.a.c.a((Object[])var1, (Object)var0[var2]) != -1) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public final boolean a(SSLSocket var1) {
      if (!this.d) {
         return false;
      } else if (this.g != null && !a(this.g, var1.getEnabledProtocols())) {
         return false;
      } else {
         return this.f == null || a(this.f, var1.getEnabledCipherSuites());
      }
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof j)) {
         return false;
      } else if (var1 == this) {
         return true;
      } else {
         j var2 = (j)var1;
         if (this.d != var2.d) {
            return false;
         } else {
            if (this.d) {
               if (!Arrays.equals(this.f, var2.f)) {
                  return false;
               }

               if (!Arrays.equals(this.g, var2.g)) {
                  return false;
               }

               if (this.e != var2.e) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public final int hashCode() {
      return this.d ? ((Arrays.hashCode(this.f) + 527) * 31 + Arrays.hashCode(this.g)) * 31 + (this.e ^ 1) : 17;
   }

   public final String toString() {
      if (!this.d) {
         return "ConnectionSpec()";
      } else {
         String var7;
         if (this.f != null) {
            List var6;
            if (this.f == null) {
               var6 = null;
            } else {
               ArrayList var3 = new ArrayList(this.f.length);
               String[] var4 = this.f;
               int var2 = var4.length;

               for(int var1 = 0; var1 < var2; ++var1) {
                  var3.add(a.g.a(var4[var1]));
               }

               var6 = Collections.unmodifiableList(var3);
            }

            var7 = var6.toString();
         } else {
            var7 = "[all enabled]";
         }

         String var8;
         if (this.g != null) {
            var8 = this.a().toString();
         } else {
            var8 = "[all enabled]";
         }

         StringBuilder var5 = new StringBuilder("ConnectionSpec(cipherSuites=");
         var5.append(var7);
         var5.append(", tlsVersions=");
         var5.append(var8);
         var5.append(", supportsTlsExtensions=");
         var5.append(this.e);
         var5.append(")");
         return var5.toString();
      }
   }

   public static final class a {
      boolean a;
      String[] b;
      String[] c;
      boolean d;

      public a(j var1) {
         this.a = var1.d;
         this.b = var1.f;
         this.c = var1.g;
         this.d = var1.e;
      }

      a(boolean var1) {
         this.a = var1;
      }

      public final j.a a() {
         if (this.a) {
            this.d = true;
            return this;
         } else {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
         }
      }

      public final j.a a(ac... var1) {
         if (!this.a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
         } else {
            String[] var3 = new String[var1.length];

            for(int var2 = 0; var2 < var1.length; ++var2) {
               var3[var2] = var1[var2].f;
            }

            return this.b(var3);
         }
      }

      public final j.a a(String... var1) {
         if (this.a) {
            if (var1.length != 0) {
               this.b = (String[])var1.clone();
               return this;
            } else {
               throw new IllegalArgumentException("At least one cipher suite is required");
            }
         } else {
            throw new IllegalStateException("no cipher suites for cleartext connections");
         }
      }

      public final j.a b(String... var1) {
         if (this.a) {
            if (var1.length != 0) {
               this.c = (String[])var1.clone();
               return this;
            } else {
               throw new IllegalArgumentException("At least one TLS version is required");
            }
         } else {
            throw new IllegalStateException("no TLS versions for cleartext connections");
         }
      }

      public final j b() {
         return new j(this);
      }
   }
}
