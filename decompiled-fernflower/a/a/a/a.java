package a.a.a;

import a.q;
import a.r;
import a.s;
import a.v;
import a.x;
import a.z;
import a.a.c.h;
import b.k;
import java.io.Closeable;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public final class a implements s {
   final e a;

   public a(e var1) {
      this.a = var1;
   }

   private static q a(q var0, q var1) {
      q.a var5 = new q.a();
      int var4 = var0.a.length / 2;
      byte var3 = 0;

      int var2;
      for(var2 = 0; var2 < var4; ++var2) {
         String var6 = var0.a(var2);
         String var7 = var0.b(var2);
         if ((!"Warning".equalsIgnoreCase(var6) || !var7.startsWith("1")) && (!a(var6) || var1.a(var6) == null)) {
            a.a.a.a.a(var5, var6, var7);
         }
      }

      var4 = var1.a.length / 2;

      for(var2 = var3; var2 < var4; ++var2) {
         String var8 = var1.a(var2);
         if (!"Content-Length".equalsIgnoreCase(var8) && a(var8)) {
            a.a.a.a.a(var5, var8, var1.b(var2));
         }
      }

      return var5.a();
   }

   private static z a(z var0) {
      if (var0 != null && var0.g != null) {
         z.a var1 = var0.a();
         var1.g = null;
         return var1.a();
      } else {
         return var0;
      }
   }

   private static boolean a(String var0) {
      return !"Connection".equalsIgnoreCase(var0) && !"Keep-Alive".equalsIgnoreCase(var0) && !"Proxy-Authenticate".equalsIgnoreCase(var0) && !"Proxy-Authorization".equalsIgnoreCase(var0) && !"TE".equalsIgnoreCase(var0) && !"Trailers".equalsIgnoreCase(var0) && !"Transfer-Encoding".equalsIgnoreCase(var0) && !"Upgrade".equalsIgnoreCase(var0);
   }

   public final z a(s.a var1) {
      z var14;
      if (this.a != null) {
         var14 = this.a.a();
      } else {
         var14 = null;
      }

      c.a var17 = new c.a(System.currentTimeMillis(), var1.a(), var14);
      c var13;
      StringBuilder var16;
      z.a var41;
      if (var17.c == null) {
         var13 = new c(var17.b, (z)null);
      } else if (var17.b.a.b() && var17.c.e == null) {
         var13 = new c(var17.b, (z)null);
      } else if (!c.a(var17.c, var17.b)) {
         var13 = new c(var17.b, (z)null);
      } else {
         label432: {
            a.d var15 = var17.b.b();
            if (!var15.c) {
               x var26 = var17.b;
               boolean var2;
               if (var26.a("If-Modified-Since") == null && var26.a("If-None-Match") == null) {
                  var2 = false;
               } else {
                  var2 = true;
               }

               if (!var2) {
                  Date var27 = var17.d;
                  long var9 = 0L;
                  long var3;
                  if (var27 != null) {
                     var3 = Math.max(0L, var17.j - var17.d.getTime());
                  } else {
                     var3 = 0L;
                  }

                  long var5 = var3;
                  if (var17.l != -1) {
                     var5 = Math.max(var3, TimeUnit.SECONDS.toMillis((long)var17.l));
                  }

                  long var11 = var5 + (var17.j - var17.i) + (var17.a - var17.j);
                  a.d var28 = var17.c.b();
                  String var31;
                  if (var28.e != -1) {
                     var3 = TimeUnit.SECONDS.toMillis((long)var28.e);
                  } else {
                     label447: {
                        if (var17.h != null) {
                           if (var17.d != null) {
                              var3 = var17.d.getTime();
                           } else {
                              var3 = var17.j;
                           }

                           var3 = var17.h.getTime() - var3;
                           if (var3 > 0L) {
                              break label447;
                           }
                        } else if (var17.f != null) {
                           r var30 = var17.c.a.a;
                           if (var30.d == null) {
                              var31 = null;
                           } else {
                              var16 = new StringBuilder();
                              r.b(var16, var30.d);
                              var31 = var16.toString();
                           }

                           if (var31 == null) {
                              if (var17.d != null) {
                                 var3 = var17.d.getTime();
                              } else {
                                 var3 = var17.i;
                              }

                              var3 -= var17.f.getTime();
                              if (var3 > 0L) {
                                 var3 /= 10L;
                                 break label447;
                              }
                           }
                        }

                        var3 = 0L;
                     }
                  }

                  var5 = var3;
                  if (var15.e != -1) {
                     var5 = Math.min(var3, TimeUnit.SECONDS.toMillis((long)var15.e));
                  }

                  if (var15.j != -1) {
                     var3 = TimeUnit.SECONDS.toMillis((long)var15.j);
                  } else {
                     var3 = 0L;
                  }

                  var28 = var17.c.b();
                  long var7 = var9;
                  if (!var28.h) {
                     var7 = var9;
                     if (var15.i != -1) {
                        var7 = TimeUnit.SECONDS.toMillis((long)var15.i);
                     }
                  }

                  if (!var28.c) {
                     var3 += var11;
                     if (var3 < var7 + var5) {
                        var41 = var17.c.a();
                        if (var3 >= var5) {
                           var41.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }

                        if (var11 > 86400000L) {
                           if (var17.c.b().e == -1 && var17.h == null) {
                              var2 = true;
                           } else {
                              var2 = false;
                           }

                           if (var2) {
                              var41.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                           }
                        }

                        var13 = new c((x)null, var41.a());
                        break label432;
                     }
                  }

                  String var33;
                  if (var17.k != null) {
                     var31 = "If-None-Match";
                     var33 = var17.k;
                  } else if (var17.f != null) {
                     var31 = "If-Modified-Since";
                     var33 = var17.g;
                  } else {
                     if (var17.d == null) {
                        var13 = new c(var17.b, (z)null);
                        break label432;
                     }

                     var31 = "If-Modified-Since";
                     var33 = var17.e;
                  }

                  q.a var36 = var17.b.c.a();
                  a.a.a.a.a(var36, var31, var33);
                  x.a var40 = var17.b.a();
                  var40.c = var36.a().a();
                  var13 = new c(var40.a(), var17.c);
                  break label432;
               }
            }

            var13 = new c(var17.b, (z)null);
         }
      }

      var16 = null;
      c var37 = var13;
      if (var13.a != null) {
         var37 = var13;
         if (var17.b.b().k) {
            var37 = new c((x)null, (z)null);
         }
      }

      x var38 = var37.a;
      z var42 = var37.b;
      if (var14 != null && var42 == null) {
         a.a.c.a((Closeable)var14.g);
      }

      if (var38 == null && var42 == null) {
         var41 = new z.a();
         var41.a = var1.a();
         var41.b = v.b;
         var41.c = 504;
         var41.d = "Unsatisfiable Request (only-if-cached)";
         var41.g = a.a.c.c;
         var41.k = -1L;
         var41.l = System.currentTimeMillis();
         return var41.a();
      } else if (var38 == null) {
         return var42.a().b(a(var42)).a();
      } else {
         boolean var19 = false;

         z var39;
         try {
            var19 = true;
            var39 = var1.a(var38);
            var19 = false;
         } finally {
            if (var19) {
               if (var14 != null) {
                  a.a.c.a((Closeable)var14.g);
               }

            }
         }

         if (var39 == null && var14 != null) {
            a.a.c.a((Closeable)var14.g);
         }

         z var21;
         if (var42 != null) {
            if (var39.c == 304) {
               z.a var25 = var42.a().a(a(var42.f, var39.f));
               var25.k = var39.k;
               var25.l = var39.l;
               var21 = var25.b(a(var42)).a(a(var39)).a();
               var39.g.close();
               return var21;
            }

            a.a.c.a((Closeable)var42.g);
         }

         var42 = var39.a().b(a(var42)).a(a(var39)).a();
         var21 = var42;
         if (a.a.c.e.b(var42)) {
            x var22 = var39.a;
            e var29 = this.a;
            final b var23;
            if (var29 == null) {
               var23 = var16;
            } else if (!c.a(var42, var22)) {
               String var32 = var22.b;
               var23 = var16;
               if (!var32.equals("POST")) {
                  var23 = var16;
                  if (!var32.equals("PATCH")) {
                     var23 = var16;
                     if (!var32.equals("PUT")) {
                        var23 = var16;
                        if (!var32.equals("DELETE")) {
                           var32.equals("MOVE");
                           var23 = var16;
                        }
                     }
                  }
               }
            } else {
               var23 = var29.b();
            }

            if (var23 == null) {
               return var42;
            }

            b.q var34 = var23.a();
            if (var34 == null) {
               return var42;
            }

            b.r var24 = new b.r(var42.g.c(), k.a(var34)) {
               boolean a;
               // $FF: synthetic field
               final b.e b;
               // $FF: synthetic field
               final b.d d;

               {
                  this.b = var2;
                  this.d = var4;
               }

               public final long a(b.c var1, long var2) {
                  try {
                     var2 = this.b.a(var1, var2);
                  } catch (IOException var4) {
                     if (!this.a) {
                        this.a = true;
                     }

                     throw var4;
                  }

                  if (var2 == -1L) {
                     if (!this.a) {
                        this.a = true;
                        this.d.close();
                     }

                     return -1L;
                  } else {
                     var1.a(this.d.b(), var1.b - var2, var2);
                     this.d.q();
                     return var2;
                  }
               }

               public final b.s a() {
                  return this.b.a();
               }

               public final void close() {
                  if (!this.a && !a.a.c.a((b.r)this, (TimeUnit)TimeUnit.MILLISECONDS)) {
                     this.a = true;
                  }

                  this.b.close();
               }
            };
            z.a var35 = var42.a();
            var35.g = new h(var42.f, k.a(var24));
            var21 = var35.a();
         }

         return var21;
      }
   }
}
