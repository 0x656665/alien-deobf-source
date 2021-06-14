package a.a.g;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

final class c extends e {
   private final Method a;
   private final Method b;
   private final Method d;
   private final Class e;
   private final Class f;

   private c(Method var1, Method var2, Method var3, Class var4, Class var5) {
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
   }

   public static e a() {
      try {
         Class var0 = Class.forName("org.eclipse.jetty.alpn.ALPN");
         StringBuilder var1 = new StringBuilder();
         var1.append("org.eclipse.jetty.alpn.ALPN");
         var1.append("$Provider");
         Class var6 = Class.forName(var1.toString());
         StringBuilder var2 = new StringBuilder();
         var2.append("org.eclipse.jetty.alpn.ALPN");
         var2.append("$ClientProvider");
         Class var7 = Class.forName(var2.toString());
         StringBuilder var3 = new StringBuilder();
         var3.append("org.eclipse.jetty.alpn.ALPN");
         var3.append("$ServerProvider");
         Class var8 = Class.forName(var3.toString());
         c var5 = new c(var0.getMethod("put", SSLSocket.class, var6), var0.getMethod("get", SSLSocket.class), var0.getMethod("remove", SSLSocket.class), var7, var8);
         return var5;
      } catch (NoSuchMethodException | ClassNotFoundException var4) {
         return null;
      }
   }

   public final String a(SSLSocket var1) {
      try {
         c.a var3 = (c.a)Proxy.getInvocationHandler(this.b.invoke((Object)null, var1));
         if (!var3.a && var3.b == null) {
            a.a.g.e.c.a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable)null);
            return null;
         } else if (var3.a) {
            return null;
         } else {
            String var4 = var3.b;
            return var4;
         }
      } catch (IllegalAccessException | InvocationTargetException var2) {
         throw new AssertionError();
      }
   }

   public final void a(SSLSocket var1, String var2, List var3) {
      List var5 = a(var3);

      try {
         ClassLoader var7 = e.class.getClassLoader();
         Class var9 = this.e;
         Class var4 = this.f;
         c.a var10 = new c.a(var5);
         Object var8 = Proxy.newProxyInstance(var7, new Class[]{var9, var4}, var10);
         this.a.invoke((Object)null, var1, var8);
      } catch (IllegalAccessException | InvocationTargetException var6) {
         throw new AssertionError(var6);
      }
   }

   public final void b(SSLSocket var1) {
      try {
         this.d.invoke((Object)null, var1);
      } catch (InvocationTargetException | IllegalAccessException var2) {
         throw new AssertionError();
      }
   }

   static final class a implements InvocationHandler {
      boolean a;
      String b;
      private final List c;

      public a(List var1) {
         this.c = var1;
      }

      public final Object invoke(Object var1, Method var2, Object[] var3) {
         String var6 = var2.getName();
         Class var7 = var2.getReturnType();
         var1 = var3;
         if (var3 == null) {
            var1 = a.a.c.b;
         }

         if (var6.equals("supports") && Boolean.TYPE == var7) {
            return Boolean.TRUE;
         } else if (var6.equals("unsupported") && Void.TYPE == var7) {
            this.a = true;
            return null;
         } else if (var6.equals("protocols") && ((Object[])var1).length == 0) {
            return this.c;
         } else if ((var6.equals("selectProtocol") || var6.equals("select")) && String.class == var7 && ((Object[])var1).length == 1 && ((Object[])var1)[0] instanceof List) {
            List var8 = (List)((Object[])var1)[0];
            int var5 = var8.size();

            String var9;
            for(int var4 = 0; var4 < var5; ++var4) {
               if (this.c.contains(var8.get(var4))) {
                  var9 = (String)var8.get(var4);
                  this.b = var9;
                  return var9;
               }
            }

            var9 = (String)this.c.get(0);
            this.b = var9;
            return var9;
         } else if ((var6.equals("protocolSelected") || var6.equals("selected")) && ((Object[])var1).length == 1) {
            this.b = (String)((Object[])var1)[0];
            return null;
         } else {
            return var2.invoke(this, (Object[])var1);
         }
      }
   }
}
