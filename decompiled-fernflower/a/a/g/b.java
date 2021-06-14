package a.a.g;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

final class b extends e {
   final Method a;
   final Method b;

   private b(Method var1, Method var2) {
      this.a = var1;
      this.b = var2;
   }

   public static b a() {
      try {
         b var0 = new b(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol"));
         return var0;
      } catch (NoSuchMethodException var1) {
         return null;
      }
   }

   public final String a(SSLSocket param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(SSLSocket var1, String var2, List var3) {
      try {
         SSLParameters var5 = var1.getSSLParameters();
         var3 = a(var3);
         this.a.invoke(var5, (Object)var3.toArray(new String[var3.size()]));
         var1.setSSLParameters(var5);
      } catch (InvocationTargetException | IllegalAccessException var4) {
         throw new AssertionError();
      }
   }
}
