package a.a.b;

import a.ab;
import a.r;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.Proxy.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public final class f {
   final a.a a;
   final d b;
   private Proxy c;
   private InetSocketAddress d;
   private List e = Collections.emptyList();
   private int f;
   private List g = Collections.emptyList();
   private int h;
   private final List i = new ArrayList();

   public f(a.a var1, d var2) {
      this.a = var1;
      this.b = var2;
      r var5 = var1.a;
      Proxy var3 = var1.h;
      List var4;
      if (var3 != null) {
         var4 = Collections.singletonList(var3);
      } else {
         var4 = this.a.g.select(var5.a());
         if (var4 != null && !var4.isEmpty()) {
            var4 = a.a.c.a(var4);
         } else {
            var4 = a.a.c.a((Object[])(Proxy.NO_PROXY));
         }
      }

      this.e = var4;
      this.f = 0;
   }

   private void a(Proxy var1) {
      this.g = new ArrayList();
      int var2;
      String var5;
      StringBuilder var7;
      InetAddress var10;
      if (var1.type() != Type.DIRECT && var1.type() != Type.SOCKS) {
         SocketAddress var9 = var1.address();
         if (!(var9 instanceof InetSocketAddress)) {
            var7 = new StringBuilder("Proxy.address() is not an InetSocketAddress: ");
            var7.append(var9.getClass());
            throw new IllegalArgumentException(var7.toString());
         }

         InetSocketAddress var6 = (InetSocketAddress)var9;
         var10 = var6.getAddress();
         if (var10 == null) {
            var5 = var6.getHostName();
         } else {
            var5 = var10.getHostAddress();
         }

         var2 = var6.getPort();
      } else {
         var5 = this.a.a.b;
         var2 = this.a.a.c;
      }

      if (var2 > 0 && var2 <= 65535) {
         if (var1.type() == Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(var5, var2));
         } else {
            List var8 = this.a.b.a(var5);
            int var4 = var8.size();

            for(int var3 = 0; var3 < var4; ++var3) {
               var10 = (InetAddress)var8.get(var3);
               this.g.add(new InetSocketAddress(var10, var2));
            }
         }

         this.h = 0;
      } else {
         var7 = new StringBuilder("No route to ");
         var7.append(var5);
         var7.append(":");
         var7.append(var2);
         var7.append("; port is out of range");
         throw new SocketException(var7.toString());
      }
   }

   public final ab a() {
      while(true) {
         int var1;
         List var2;
         StringBuilder var4;
         if (!this.c()) {
            if (!this.b()) {
               if (this.d()) {
                  return (ab)this.i.remove(0);
               }

               throw new NoSuchElementException();
            }

            if (!this.b()) {
               var4 = new StringBuilder("No route to ");
               var4.append(this.a.a.b);
               var4.append("; exhausted proxy configurations: ");
               var4.append(this.e);
               throw new SocketException(var4.toString());
            }

            var2 = this.e;
            var1 = this.f++;
            Proxy var3 = (Proxy)var2.get(var1);
            this.a(var3);
            this.c = var3;
         }

         if (this.c()) {
            var2 = this.g;
            var1 = this.h++;
            this.d = (InetSocketAddress)var2.get(var1);
            ab var5 = new ab(this.a, this.c, this.d);
            if (this.b.c(var5)) {
               this.i.add(var5);
               continue;
            }

            return var5;
         }

         var4 = new StringBuilder("No route to ");
         var4.append(this.a.a.b);
         var4.append("; exhausted inet socket addresses: ");
         var4.append(this.g);
         throw new SocketException(var4.toString());
      }
   }

   final boolean b() {
      return this.f < this.e.size();
   }

   final boolean c() {
      return this.h < this.g.size();
   }

   final boolean d() {
      return !this.i.isEmpty();
   }
}
