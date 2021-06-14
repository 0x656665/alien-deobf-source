package a.a.g;

import a.u;
import a.v;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

public class e {
   private static final Logger a;
   static final e c;

   static {
      Object var0 = a.a.g.a.a();
      if (var0 == null) {
         var0 = b.a();
         if (var0 == null) {
            var0 = a.a.g.c.a();
            if (var0 == null) {
               var0 = new e();
            }
         }
      }

      c = (e)var0;
      a = Logger.getLogger(u.class.getName());
   }

   public static List a(List var0) {
      ArrayList var3 = new ArrayList(var0.size());
      int var2 = var0.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         v var4 = (v)var0.get(var1);
         if (var4 != v.a) {
            var3.add(var4.toString());
         }
      }

      return var3;
   }

   public static e b() {
      return c;
   }

   public a.a.h.b a(X509TrustManager var1) {
      return new a.a.h.a(a.a.h.e.a(var1));
   }

   public Object a(String var1) {
      return a.isLoggable(Level.FINE) ? new Throwable(var1) : null;
   }

   public String a(SSLSocket var1) {
      return null;
   }

   public void a(int var1, String var2, Throwable var3) {
      Level var4;
      if (var1 == 5) {
         var4 = Level.WARNING;
      } else {
         var4 = Level.INFO;
      }

      a.log(var4, var2, var3);
   }

   public void a(String var1, Object var2) {
      String var3 = var1;
      if (var2 == null) {
         StringBuilder var4 = new StringBuilder();
         var4.append(var1);
         var4.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
         var3 = var4.toString();
      }

      this.a(5, var3, (Throwable)var2);
   }

   public void a(Socket var1, InetSocketAddress var2, int var3) {
      var1.connect(var2, var3);
   }

   public void a(SSLSocket var1, String var2, List var3) {
   }

   public void b(SSLSocket var1) {
   }

   public boolean b(String var1) {
      return true;
   }
}
