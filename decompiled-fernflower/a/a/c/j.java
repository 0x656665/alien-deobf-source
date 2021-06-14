package a.a.c;

import a.ab;
import a.r;
import a.s;
import a.u;
import a.x;
import a.y;
import a.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.Proxy.Type;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

public final class j implements s {
   public Object a;
   public volatile boolean b;
   private final u c;
   private final boolean d;
   private a.a.b.g e;

   public j(u var1, boolean var2) {
      this.c = var1;
      this.d = var2;
   }

   private a.a a(r var1) {
      HostnameVerifier var2;
      a.f var3;
      SSLSocketFactory var4;
      a.f var5;
      if (var1.b()) {
         var4 = this.c.n;
         var2 = this.c.p;
         var3 = this.c.q;
         var5 = var3;
      } else {
         var3 = null;
         var2 = var3;
         var5 = var3;
         var4 = var3;
      }

      return new a.a(var1.b, var1.c, this.c.u, this.c.m, var4, var2, var5, this.c.r, this.c.d, this.c.e, this.c.f, this.c.i);
   }

   private static boolean a(z var0, r var1) {
      r var2 = var0.a.a;
      return var2.b.equals(var1.b) && var2.c == var1.c && var2.a.equals(var1.a);
   }

   private static boolean a(IOException var0, boolean var1) {
      if (var0 instanceof ProtocolException) {
         return false;
      } else if (var0 instanceof InterruptedIOException) {
         return var0 instanceof SocketTimeoutException && !var1;
      } else if (var0 instanceof SSLHandshakeException && var0.getCause() instanceof CertificateException) {
         return false;
      } else {
         return !(var0 instanceof SSLPeerUnverifiedException);
      }
   }

   private boolean a(IOException var1, boolean var2, x var3) {
      this.e.a(var1);
      if (!this.c.x) {
         return false;
      } else if (var2 && var3.d instanceof l) {
         return false;
      } else if (!a(var1, var2)) {
         return false;
      } else {
         return this.e.e();
      }
   }

   public final z a(s.a var1) {
      x var5 = var1.a();
      this.e = new a.a.b.g(this.c.t, this.a(var5.a), this.a);
      z var6 = null;
      int var2 = 0;

      while(true) {
         if (!this.b) {
            boolean var4 = true;

            z var74;
            label1180: {
               Throwable var10000;
               label1192: {
                  IOException var7;
                  boolean var10001;
                  label1189: {
                     a.a.b.e var72;
                     try {
                        try {
                           var74 = ((g)var1).a(var5, this.e, (c)null, (a.h)null);
                           break label1180;
                        } catch (a.a.b.e var63) {
                           var72 = var63;
                        } catch (IOException var64) {
                           var7 = var64;
                           break label1189;
                        }
                     } catch (Throwable var65) {
                        var10000 = var65;
                        var10001 = false;
                        break label1192;
                     }

                     try {
                        if (this.a(var72.a, false, var5)) {
                           continue;
                        }
                     } catch (Throwable var59) {
                        var10000 = var59;
                        var10001 = false;
                        break label1192;
                     }

                     try {
                        throw var72.a;
                     } catch (Throwable var58) {
                        var10000 = var58;
                        var10001 = false;
                        break label1192;
                     }
                  }

                  label1170: {
                     try {
                        if (!(var7 instanceof a.a.e.a)) {
                           break label1170;
                        }
                     } catch (Throwable var62) {
                        var10000 = var62;
                        var10001 = false;
                        break label1192;
                     }

                     var4 = false;
                  }

                  try {
                     if (this.a(var7, var4, var5)) {
                        continue;
                     }
                  } catch (Throwable var61) {
                     var10000 = var61;
                     var10001 = false;
                     break label1192;
                  }

                  label1161:
                  try {
                     throw var7;
                  } catch (Throwable var60) {
                     var10000 = var60;
                     var10001 = false;
                     break label1161;
                  }
               }

               Throwable var66 = var10000;
               this.e.a((IOException)null);
               this.e.c();
               throw var66;
            }

            if (var6 != null) {
               z.a var68 = var74.a();
               z.a var71 = var6.a();
               var71.g = null;
               var6 = var71.a();
               if (var6.g != null) {
                  throw new IllegalArgumentException("priorResponse.body != null");
               }

               var68.j = var6;
               var6 = var68.a();
            } else {
               var6 = var74;
            }

            if (var6 != null) {
               a.a.b.c var69 = this.e.b();
               ab var70;
               if (var69 != null) {
                  var70 = var69.a();
               } else {
                  var70 = null;
               }

               label1147: {
                  int var3 = var6.c;
                  String var8 = var6.a.b;
                  switch(var3) {
                  case 307:
                  case 308:
                     if (!var8.equals("GET") && !var8.equals("HEAD")) {
                        break;
                     }
                  case 300:
                  case 301:
                  case 302:
                  case 303:
                     if (this.c.w) {
                        String var76 = var6.decrypt_str("Location");
                        if (var76 != null) {
                           r.a var77 = var6.a.a.c(var76);
                           r var78;
                           if (var77 != null) {
                              var78 = var77.b();
                           } else {
                              var78 = null;
                           }

                           if (var78 != null && (var78.a.equals(var6.a.a.a) || this.c.v)) {
                              x.a var9 = var6.a.a();
                              if (f.b(var8)) {
                                 var4 = var8.equals("PROPFIND");
                                 if (true ^ var8.equals("PROPFIND")) {
                                    var9.a("GET", (y)null);
                                 } else {
                                    y var75;
                                    if (var4) {
                                       var75 = var6.a.d;
                                    } else {
                                       var75 = null;
                                    }

                                    var9.a(var8, var75);
                                 }

                                 if (!var4) {
                                    var9.a("Transfer-Encoding");
                                    var9.a("Content-Length");
                                    var9.a("Content-Type");
                                 }
                              }

                              if (!a(var6, var78)) {
                                 var9.a("Authorization");
                              }

                              var5 = var9.a(var78).a();
                              break label1147;
                           }
                        }
                     }
                  case 401:
                  default:
                     break;
                  case 407:
                     Proxy var73;
                     if (var70 != null) {
                        var73 = var70.b;
                     } else {
                        var73 = this.c.d;
                     }

                     if (var73.type() != Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                     }
                     break;
                  case 408:
                     if (!(var6.a.d instanceof l)) {
                        var5 = var6.a;
                        break label1147;
                     }
                  }

                  var5 = null;
               }

               if (var5 == null) {
                  if (!this.d) {
                     this.e.c();
                  }

                  return var6;
               }

               a.a.c.a((Closeable)var6.g);
               ++var2;
               if (var2 > 20) {
                  this.e.c();
                  throw new ProtocolException("Too many follow-up requests: ".concat(String.valueOf(var2)));
               }

               if (var5.d instanceof l) {
                  this.e.c();
                  throw new HttpRetryException("Cannot retry streamed HTTP body", var6.c);
               }

               if (!a(var6, var5.a)) {
                  this.e.c();
                  this.e = new a.a.b.g(this.c.t, this.a(var5.a), this.a);
               } else if (this.e.a() != null) {
                  StringBuilder var67 = new StringBuilder("Closing the body of ");
                  var67.append(var6);
                  var67.append(" didn't close its backing stream. Bad interceptor?");
                  throw new IllegalStateException(var67.toString());
               }
               continue;
            }

            throw new IllegalStateException();
         }

         this.e.c();
         throw new IOException("Canceled");
      }
   }
}
