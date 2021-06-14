package a;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class a {
   public final r a;
   public final n b;
   public final SocketFactory c;
   final b d;
   public final List e;
   public final List f;
   public final ProxySelector g;
   public final Proxy h;
   public final SSLSocketFactory i;
   public final HostnameVerifier j;
   public final f k;

   public a(String var1, int var2, n var3, SocketFactory var4, SSLSocketFactory var5, HostnameVerifier var6, f var7, b var8, Proxy var9, List var10, List var11, ProxySelector var12) {
      r.a var14 = new r.a();
      String var13;
      if (var5 != null) {
         var13 = "https";
      } else {
         var13 = "http";
      }

      if (var13.equalsIgnoreCase("http")) {
         var14.a = "http";
      } else {
         if (!var13.equalsIgnoreCase("https")) {
            throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(var13)));
         }

         var14.a = "https";
      }

      if (var1 != null) {
         var13 = r.a.a(var1, 0, var1.length());
         if (var13 != null) {
            var14.d = var13;
            if (var2 > 0 && var2 <= 65535) {
               var14.e = var2;
               this.a = var14.b();
               if (var3 != null) {
                  this.b = var3;
                  if (var4 != null) {
                     this.c = var4;
                     if (var8 != null) {
                        this.d = var8;
                        if (var10 != null) {
                           this.e = a.a.c.a(var10);
                           if (var11 != null) {
                              this.f = a.a.c.a(var11);
                              if (var12 != null) {
                                 this.g = var12;
                                 this.h = var9;
                                 this.i = var5;
                                 this.j = var6;
                                 this.k = var7;
                              } else {
                                 throw new NullPointerException("proxySelector == null");
                              }
                           } else {
                              throw new NullPointerException("connectionSpecs == null");
                           }
                        } else {
                           throw new NullPointerException("protocols == null");
                        }
                     } else {
                        throw new NullPointerException("proxyAuthenticator == null");
                     }
                  } else {
                     throw new NullPointerException("socketFactory == null");
                  }
               } else {
                  throw new NullPointerException("dns == null");
               }
            } else {
               throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(var2)));
            }
         } else {
            throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(var1)));
         }
      } else {
         throw new NullPointerException("host == null");
      }
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof a) {
         a var2 = (a)var1;
         return this.a.equals(var2.a) && this.b.equals(var2.b) && this.d.equals(var2.d) && this.e.equals(var2.e) && this.f.equals(var2.f) && this.g.equals(var2.g) && a.a.c.a((Object)this.h, (Object)var2.h) && a.a.c.a((Object)this.i, (Object)var2.i) && a.a.c.a((Object)this.j, (Object)var2.j) && a.a.c.a((Object)this.k, (Object)var2.k);
      } else {
         return false;
      }
   }

   public final int hashCode() {
      int var5 = this.a.hashCode();
      int var6 = this.b.hashCode();
      int var7 = this.d.hashCode();
      int var8 = this.e.hashCode();
      int var9 = this.f.hashCode();
      int var10 = this.g.hashCode();
      Proxy var11 = this.h;
      int var4 = 0;
      int var1;
      if (var11 != null) {
         var1 = this.h.hashCode();
      } else {
         var1 = 0;
      }

      int var2;
      if (this.i != null) {
         var2 = this.i.hashCode();
      } else {
         var2 = 0;
      }

      int var3;
      if (this.j != null) {
         var3 = this.j.hashCode();
      } else {
         var3 = 0;
      }

      if (this.k != null) {
         var4 = this.k.hashCode();
      }

      return (((((((((var5 + 527) * 31 + var6) * 31 + var7) * 31 + var8) * 31 + var9) * 31 + var10) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("Address{");
      var1.append(this.a.b);
      var1.append(":");
      var1.append(this.a.c);
      if (this.h != null) {
         var1.append(", proxy=");
         var1.append(this.h);
      } else {
         var1.append(", proxySelector=");
         var1.append(this.g);
      }

      var1.append("}");
      return var1.toString();
   }
}
