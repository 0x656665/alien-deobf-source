package a.a.b;

import a.ab;
import a.h;
import a.i;
import a.p;
import a.v;
import b.k;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.Proxy.Type;
import java.util.ArrayList;
import java.util.List;

public final class c extends a.a.e.g.b implements h {
   public final ab a;
   public Socket b;
   public p c;
   a.a.e.g d;
   b.e e;
   b.d f;
   public boolean g;
   public int h;
   public int i = 1;
   public final List j = new ArrayList();
   public long k = Long.MAX_VALUE;
   private final i m;
   private Socket n;
   private v o;

   public c(i var1, ab var2) {
      this.m = var1;
      this.a = var2;
   }

   private void a(int var1, int var2) {
      Proxy var3 = this.a.b;
      a.a var4 = this.a.a;
      Socket var6;
      if (var3.type() != Type.DIRECT && var3.type() != Type.HTTP) {
         var6 = new Socket(var3);
      } else {
         var6 = var4.c.createSocket();
      }

      this.n = var6;
      this.n.setSoTimeout(var2);

      try {
         a.a.g.e.b().a(this.n, this.a.c, var1);
      } catch (ConnectException var5) {
         StringBuilder var7 = new StringBuilder("Failed to connect to ");
         var7.append(this.a.c);
         ConnectException var8 = new ConnectException(var7.toString());
         var8.initCause(var5);
         throw var8;
      }

      this.e = b.k.a(b.k.b(this.n));
      this.f = b.k.a(b.k.a(this.n));
   }

   public final ab a() {
      return this.a;
   }

   public final void a(int param1, int param2, int param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   public final void a(a.a.e.g param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(a.a.e.i var1) {
      var1.a(a.a.e.b.e);
   }

   public final boolean a(a.a var1) {
      return this.j.size() < this.i && var1.equals(this.a.a) && !this.g;
   }

   public final boolean a(boolean var1) {
      if (!this.b.isClosed() && !this.b.isInputShutdown()) {
         if (this.b.isOutputShutdown()) {
            return false;
         } else if (this.d != null) {
            return !this.d.b();
         } else if (var1) {
            boolean var10001;
            int var2;
            try {
               var2 = this.b.getSoTimeout();
            } catch (SocketTimeoutException var21) {
               var10001 = false;
               return true;
            } catch (IOException var22) {
               var10001 = false;
               return false;
            }

            boolean var13 = false;

            try {
               var13 = true;
               this.b.setSoTimeout(1);
               var1 = this.e.c();
               var13 = false;
            } finally {
               if (var13) {
                  try {
                     this.b.setSoTimeout(var2);
                  } catch (SocketTimeoutException var14) {
                     var10001 = false;
                     return true;
                  } catch (IOException var15) {
                     var10001 = false;
                     return false;
                  }
               }
            }

            if (var1) {
               try {
                  this.b.setSoTimeout(var2);
                  return false;
               } catch (SocketTimeoutException var16) {
                  var10001 = false;
               } catch (IOException var17) {
                  var10001 = false;
                  return false;
               }
            } else {
               try {
                  this.b.setSoTimeout(var2);
                  return true;
               } catch (SocketTimeoutException var18) {
                  var10001 = false;
               } catch (IOException var19) {
                  var10001 = false;
                  return false;
               }
            }

            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public final boolean b() {
      return this.d != null;
   }

   public final String toString() {
      StringBuilder var2 = new StringBuilder("Connection{");
      var2.append(this.a.a.a.b);
      var2.append(":");
      var2.append(this.a.a.a.c);
      var2.append(", proxy=");
      var2.append(this.a.b);
      var2.append(" hostAddress=");
      var2.append(this.a.c);
      var2.append(" cipherSuite=");
      Object var1;
      if (this.c != null) {
         var1 = this.c.a;
      } else {
         var1 = "none";
      }

      var2.append(var1);
      var2.append(" protocol=");
      var2.append(this.o);
      var2.append('}');
      return var2.toString();
   }
}
