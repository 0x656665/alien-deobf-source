package a.a.g;

import a.v;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

final class a extends e {
   private final Class a;
   private final d b;
   private final d d;
   private final d e;
   private final d f;
   private final a.a.g.a.b g = a.a.g.a.b.a();

   private a(Class var1, d var2, d var3, d var4, d var5) {
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
   }

   public static e a() {
      Class var1;
      boolean var10001;
      try {
         var1 = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
      } catch (ClassNotFoundException var10) {
         try {
            var1 = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
         } catch (ClassNotFoundException var9) {
            var10001 = false;
            return null;
         }
      }

      d var3;
      d var4;
      try {
         var3 = new d((Class)null, "setUseSessionTickets", new Class[]{Boolean.TYPE});
         var4 = new d((Class)null, "setHostname", new Class[]{String.class});
      } catch (ClassNotFoundException var8) {
         var10001 = false;
         return null;
      }

      d var0;
      d var2;
      label36: {
         label35: {
            try {
               Class.forName("android.net.Network");
               var0 = new d(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            } catch (ClassNotFoundException var6) {
               var0 = null;
               break label35;
            }

            try {
               var2 = new d((Class)null, "setAlpnProtocols", new Class[]{byte[].class});
               break label36;
            } catch (ClassNotFoundException var5) {
            }
         }

         var2 = null;
      }

      try {
         a.a.g.a var11 = new a.a.g.a(var1, var3, var4, var0, var2);
         return var11;
      } catch (ClassNotFoundException var7) {
         var10001 = false;
         return null;
      }
   }

   public final a.a.h.b a(X509TrustManager var1) {
      try {
         Class var2 = Class.forName("android.net.http.X509TrustManagerExtensions");
         a.a.g.a.a var4 = new a.a.g.a.a(var2.getConstructor(X509TrustManager.class).newInstance(var1), var2.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
         return var4;
      } catch (Exception var3) {
         return super.a(var1);
      }
   }

   public final Object a(String var1) {
      return this.g.a(var1);
   }

   public final String a(SSLSocket var1) {
      if (this.e == null) {
         return null;
      } else if (!this.e.a((Object)var1)) {
         return null;
      } else {
         byte[] var2 = (byte[])this.e.b(var1);
         return var2 != null ? new String(var2, a.a.c.e) : null;
      }
   }

   public final void a(int var1, String var2, Throwable var3) {
      byte var4 = 5;
      if (var1 != 5) {
         var4 = 3;
      }

      String var8 = var2;
      if (var3 != null) {
         StringBuilder var9 = new StringBuilder();
         var9.append(var2);
         var9.append('\n');
         var9.append(Log.getStackTraceString(var3));
         var8 = var9.toString();
      }

      var1 = 0;

      int var7;
      for(int var6 = var8.length(); var1 < var6; var1 = var7 + 1) {
         int var5 = var8.indexOf(10, var1);
         if (var5 == -1) {
            var5 = var6;
         }

         while(true) {
            var7 = Math.min(var5, var1 + 4000);
            Log.println(var4, "OkHttp", var8.substring(var1, var7));
            if (var7 >= var5) {
               break;
            }

            var1 = var7;
         }
      }

   }

   public final void a(String var1, Object var2) {
      if (!this.g.a(var2)) {
         this.a(5, var1, (Throwable)null);
      }

   }

   public final void a(Socket var1, InetSocketAddress var2, int var3) {
      try {
         var1.connect(var2, var3);
      } catch (AssertionError var4) {
         if (a.a.c.a(var4)) {
            throw new IOException(var4);
         } else {
            throw var4;
         }
      } catch (SecurityException var5) {
         IOException var6 = new IOException("Exception in connect");
         var6.initCause(var5);
         throw var6;
      }
   }

   public final void a(SSLSocket var1, String var2, List var3) {
      if (var2 != null) {
         this.b.a(var1, Boolean.TRUE);
         this.d.a(var1, var2);
      }

      if (this.f != null && this.f.a((Object)var1)) {
         b.c var7 = new b.c();
         int var5 = var3.size();

         for(int var4 = 0; var4 < var5; ++var4) {
            v var6 = (v)var3.get(var4);
            if (var6 != v.a) {
               var7.b(var6.toString().length());
               var7.a(var6.toString());
            }
         }

         byte[] var8 = var7.n();
         this.f.b(var1, var8);
      }

   }

   public final boolean b(String var1) {
      try {
         Class var3 = Class.forName("android.security.NetworkSecurityPolicy");
         Object var4 = var3.getMethod("getInstance").invoke((Object)null);
         boolean var2 = (Boolean)var3.getMethod("isCleartextTrafficPermitted", String.class).invoke(var4, var1);
         return var2;
      } catch (NoSuchMethodException | ClassNotFoundException var5) {
         return super.b(var1);
      } catch (IllegalArgumentException | InvocationTargetException | IllegalAccessException var6) {
         throw new AssertionError();
      }
   }

   static final class a extends a.a.h.b {
      private final Object a;
      private final Method b;

      a(Object var1, Method var2) {
         this.a = var1;
         this.b = var2;
      }

      public final List a(List var1, String var2) {
         try {
            X509Certificate[] var5 = (X509Certificate[])var1.toArray(new X509Certificate[var1.size()]);
            var1 = (List)this.b.invoke(this.a, var5, "RSA", var2);
            return var1;
         } catch (InvocationTargetException var3) {
            SSLPeerUnverifiedException var6 = new SSLPeerUnverifiedException(var3.getMessage());
            var6.initCause(var3);
            throw var6;
         } catch (IllegalAccessException var4) {
            throw new AssertionError(var4);
         }
      }

      public final boolean equals(Object var1) {
         return var1 instanceof a.a.g.a.a;
      }

      public final int hashCode() {
         return 0;
      }
   }

   static final class b {
      private final Method a;
      private final Method b;
      private final Method c;

      private b(Method var1, Method var2, Method var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
      }

      static a.a.g.a.b a() {
         Method var0 = null;

         Method var1;
         Method var2;
         Method var3;
         try {
            Class var5 = Class.forName("dalvik.system.CloseGuard");
            var3 = var5.getMethod("get");
            var2 = var5.getMethod("open", String.class);
            var1 = var5.getMethod("warnIfOpen");
         } catch (Exception var4) {
            var1 = null;
            var2 = var1;
            return new a.a.g.a.b(var0, var2, var1);
         }

         var0 = var3;
         return new a.a.g.a.b(var0, var2, var1);
      }

      final Object a(String var1) {
         if (this.a != null) {
            try {
               Object var2 = this.a.invoke((Object)null);
               this.b.invoke(var2, var1);
               return var2;
            } catch (Exception var3) {
               return null;
            }
         } else {
            return null;
         }
      }

      final boolean a(Object var1) {
         boolean var2 = false;
         if (var1 != null) {
            try {
               this.c.invoke(var1);
            } catch (Exception var3) {
               return false;
            }

            var2 = true;
         }

         return var2;
      }
   }
}
