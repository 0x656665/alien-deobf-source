package a;

import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class u implements Cloneable {
   static final List a;
   static final List b;
   public final int A;
   final int B;
   final m c;
   public final Proxy d;
   public final List e;
   public final List f;
   final List g;
   final List h;
   public final ProxySelector i;
   public final l j;
   final c k;
   final a.a.a.e l;
   public final SocketFactory m;
   public final SSLSocketFactory n;
   final a.a.h.b o;
   public final HostnameVerifier p;
   public final f q;
   public final b r;
   final b s;
   public final i t;
   public final n u;
   public final boolean v;
   public final boolean w;
   public final boolean x;
   public final int y;
   public final int z;

   static {
      a = a.a.c.a((Object[])(a.v.d, a.v.b));
      b = a.a.c.a((Object[])(a.j.a, a.j.b, a.j.c));
      a.a.a.a = new a.a.a() {
         public final int a(z.a var1) {
            return var1.c;
         }

         public final a.a.b.c a(i var1, a.a var2, a.a.b.g var3) {
            if (!a.i.g && !Thread.holdsLock(var1)) {
               throw new AssertionError();
            } else {
               Iterator var5 = var1.d.iterator();

               a.a.b.c var4;
               do {
                  if (!var5.hasNext()) {
                     return null;
                  }

                  var4 = (a.a.b.c)var5.next();
               } while(!var4.a(var2));

               var3.a(var4);
               return var4;
            }
         }

         public final a.a.b.d a(i var1) {
            return var1.e;
         }

         public final void a(j var1, SSLSocket var2, boolean var3) {
            String[] var4;
            if (var1.f != null) {
               var4 = (String[])a.a.c.a(String.class, var1.f, var2.getEnabledCipherSuites());
            } else {
               var4 = var2.getEnabledCipherSuites();
            }

            String[] var5;
            if (var1.g != null) {
               var5 = (String[])a.a.c.a(String.class, var1.g, var2.getEnabledProtocols());
            } else {
               var5 = var2.getEnabledProtocols();
            }

            String[] var6 = var4;
            if (var3) {
               var6 = var4;
               if (a.a.c.a((Object[])var2.getSupportedCipherSuites(), (Object)"TLS_FALLBACK_SCSV") != -1) {
                  var6 = a.a.c.a(var4, "TLS_FALLBACK_SCSV");
               }
            }

            var1 = (new j.a(var1)).a(var6).b(var5).b();
            if (var1.g != null) {
               var2.setEnabledProtocols(var1.g);
            }

            if (var1.f != null) {
               var2.setEnabledCipherSuites(var1.f);
            }

         }

         public final void a(q.a var1, String var2) {
            int var3 = var2.indexOf(":", 1);
            if (var3 != -1) {
               var1.a(var2.substring(0, var3), var2.substring(var3 + 1));
            } else if (var2.startsWith(":")) {
               var1.a("", var2.substring(1));
            } else {
               var1.a("", var2);
            }
         }

         public final void a(q.a var1, String var2, String var3) {
            var1.a(var2, var3);
         }

         public final boolean a(i var1, a.a.b.c var2) {
            if (!a.i.g && !Thread.holdsLock(var1)) {
               throw new AssertionError();
            } else if (!var2.g && var1.b != 0) {
               var1.notifyAll();
               return false;
            } else {
               var1.d.remove(var2);
               return true;
            }
         }

         public final Socket b(i var1, a.a var2, a.a.b.g var3) {
            if (!a.i.g && !Thread.holdsLock(var1)) {
               throw new AssertionError();
            } else {
               Iterator var4 = var1.d.iterator();

               a.a.b.c var5;
               do {
                  if (!var4.hasNext()) {
                     return null;
                  }

                  var5 = (a.a.b.c)var4.next();
               } while(!var5.a(var2) || !var5.b() || var5 == var3.b());

               if (!a.a.b.g.e && !Thread.holdsLock(var3.b)) {
                  throw new AssertionError();
               } else if (var3.d == null && var3.c.j.size() == 1) {
                  Reference var6 = (Reference)var3.c.j.get(0);
                  Socket var7 = var3.a(true, false, false);
                  var3.c = var5;
                  var5.j.add(var6);
                  return var7;
               } else {
                  throw new IllegalStateException();
               }
            }
         }

         public final void b(i var1, a.a.b.c var2) {
            if (!a.i.g && !Thread.holdsLock(var1)) {
               throw new AssertionError();
            } else {
               if (!var1.f) {
                  var1.f = true;
                  a.i.a.execute(var1.c);
               }

               var1.d.add(var2);
            }
         }
      };
   }

   public u() {
      this(new u.a());
   }

   private u(u.a var1) {
      this.c = var1.a;
      this.d = var1.b;
      this.e = var1.c;
      this.f = var1.d;
      this.g = a.a.c.a(var1.e);
      this.h = a.a.c.a(var1.f);
      this.i = var1.g;
      this.j = var1.h;
      this.k = var1.i;
      this.l = var1.j;
      this.m = var1.k;
      Iterator var3 = this.f.iterator();

      label34:
      while(true) {
         boolean var2;
         for(var2 = false; var3.hasNext(); var2 = true) {
            j var4 = (j)var3.next();
            if (!var2 && !var4.d) {
               continue label34;
            }
         }

         if (var1.l == null && var2) {
            X509TrustManager var5 = b();
            this.n = a(var5);
            this.o = a.a.g.e.b().a(var5);
         } else {
            this.n = var1.l;
            this.o = var1.m;
         }

         this.p = var1.n;
         f var6 = var1.o;
         a.a.h.b var7 = this.o;
         if (!a.a.c.a((Object)var6.c, (Object)var7)) {
            var6 = new f(var6.b, var7);
         }

         this.q = var6;
         this.r = var1.p;
         this.s = var1.q;
         this.t = var1.r;
         this.u = var1.s;
         this.v = var1.t;
         this.w = var1.u;
         this.x = var1.v;
         this.y = var1.w;
         this.z = var1.x;
         this.A = var1.y;
         this.B = var1.z;
         return;
      }
   }

   private static SSLSocketFactory a(X509TrustManager var0) {
      try {
         SSLContext var1 = SSLContext.getInstance("TLS");
         var1.init((KeyManager[])null, new TrustManager[]{var0}, (SecureRandom)null);
         SSLSocketFactory var3 = var1.getSocketFactory();
         return var3;
      } catch (GeneralSecurityException var2) {
         throw new AssertionError();
      }
   }

   private static X509TrustManager b() {
      try {
         TrustManagerFactory var0 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
         var0.init((KeyStore)null);
         TrustManager[] var3 = var0.getTrustManagers();
         if (var3.length == 1 && var3[0] instanceof X509TrustManager) {
            return (X509TrustManager)var3[0];
         } else {
            StringBuilder var1 = new StringBuilder("Unexpected default trust managers:");
            var1.append(Arrays.toString(var3));
            throw new IllegalStateException(var1.toString());
         }
      } catch (GeneralSecurityException var2) {
         throw new AssertionError();
      }
   }

   final a.a.a.e a() {
      return this.k != null ? this.k.a : this.l;
   }

   public static final class a {
      m a = new m();
      Proxy b;
      List c;
      List d;
      final List e = new ArrayList();
      final List f = new ArrayList();
      ProxySelector g;
      l h;
      c i;
      a.a.a.e j;
      SocketFactory k;
      SSLSocketFactory l;
      a.a.h.b m;
      HostnameVerifier n;
      f o;
      b p;
      b q;
      i r;
      n s;
      boolean t;
      boolean u;
      boolean v;
      int w;
      int x;
      int y;
      int z;

      public a() {
         this.c = a.u.a;
         this.d = a.u.b;
         this.g = ProxySelector.getDefault();
         this.h = a.l.a;
         this.k = SocketFactory.getDefault();
         this.n = a.a.h.d.a;
         this.o = a.f.a;
         this.p = a.b.a;
         this.q = a.b.a;
         this.r = new i();
         this.s = a.n.a;
         this.t = true;
         this.u = true;
         this.v = true;
         this.w = 10000;
         this.x = 10000;
         this.y = 10000;
         this.z = 0;
      }
   }
}
