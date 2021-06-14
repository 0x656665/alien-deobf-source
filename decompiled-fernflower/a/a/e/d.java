package a.a.e;

import b.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class d {
   static final c[] a;
   static final Map b;

   static {
      c var1 = new c(c.f, "");
      int var0 = 0;
      a = new c[]{var1, new c(c.c, "GET"), new c(c.c, "POST"), new c(c.d, "/"), new c(c.d, "/index.html"), new c(c.e, "http"), new c(c.e, "https"), new c(c.b, "200"), new c(c.b, "204"), new c(c.b, "206"), new c(c.b, "304"), new c(c.b, "400"), new c(c.b, "404"), new c(c.b, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};

      LinkedHashMap var2;
      for(var2 = new LinkedHashMap(a.length); var0 < a.length; ++var0) {
         if (!var2.containsKey(a[var0].g)) {
            var2.put(a[var0].g, var0);
         }
      }

      b = Collections.unmodifiableMap(var2);
   }

   static b.f a(b.f var0) {
      int var2 = var0.g();

      for(int var1 = 0; var1 < var2; ++var1) {
         byte var3 = var0.a(var1);
         if (var3 >= 65 && var3 <= 90) {
            StringBuilder var4 = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
            var4.append(var0.a());
            throw new IOException(var4.toString());
         }
      }

      return var0;
   }

   static final class a {
      c[] a;
      int b;
      int c;
      int d;
      private final List e;
      private final b.e f;
      private final int g;
      private int h;

      a(r var1) {
         this(var1, (byte)0);
      }

      private a(r var1, byte var2) {
         this.e = new ArrayList();
         this.a = new c[8];
         this.b = this.a.length - 1;
         this.c = 0;
         this.d = 0;
         this.g = 4096;
         this.h = 4096;
         this.f = b.k.a(var1);
      }

      private int a(int var1) {
         int var2 = 0;
         byte var4 = 0;
         if (var1 > 0) {
            var2 = this.a.length - 1;
            int var3 = var1;

            for(var1 = var4; var2 >= this.b && var3 > 0; --var2) {
               var3 -= this.a[var2].i;
               this.d -= this.a[var2].i;
               --this.c;
               ++var1;
            }

            System.arraycopy(this.a, this.b + 1, this.a, this.b + 1 + var1, this.c);
            this.b += var1;
            var2 = var1;
         }

         return var2;
      }

      private int a(int var1, int var2) {
         var1 &= var2;
         if (var1 < var2) {
            return var1;
         } else {
            var1 = 0;

            while(true) {
               int var3 = this.e();
               if ((var3 & 128) == 0) {
                  return var2 + (var3 << var1);
               }

               var2 += (var3 & 127) << var1;
               var1 += 7;
            }
         }
      }

      private void a(c var1) {
         this.e.add(var1);
         int var2 = var1.i;
         if (var2 > this.h) {
            this.d();
         } else {
            this.a(this.d + var2 - this.h);
            if (this.c + 1 > this.a.length) {
               c[] var4 = new c[this.a.length * 2];
               System.arraycopy(this.a, 0, var4, this.a.length, this.a.length);
               this.b = this.a.length - 1;
               this.a = var4;
            }

            int var3 = this.b--;
            this.a[var3] = var1;
            ++this.c;
            this.d += var2;
         }
      }

      private int b(int var1) {
         return this.b + 1 + var1;
      }

      private b.f c(int var1) {
         return d(var1) ? d.a[var1].g : this.a[this.b(var1 - d.a.length)].g;
      }

      private void c() {
         if (this.h < this.d) {
            if (this.h == 0) {
               this.d();
               return;
            }

            this.a(this.d - this.h);
         }

      }

      private void d() {
         Arrays.fill(this.a, (Object)null);
         this.b = this.a.length - 1;
         this.c = 0;
         this.d = 0;
      }

      private static boolean d(int var0) {
         return var0 >= 0 && var0 <= d.a.length - 1;
      }

      private int e() {
         return this.f.e() & 255;
      }

      private b.f f() {
         int var2 = this.e();
         boolean var1;
         if ((var2 & 128) == 128) {
            var1 = true;
         } else {
            var1 = false;
         }

         var2 = this.a(var2, 127);
         return var1 ? b.f.a(k.a().a(this.f.e((long)var2))) : this.f.c((long)var2);
      }

      final void a() {
         while(true) {
            if (!this.f.c()) {
               int var1 = this.f.e() & 255;
               if (var1 != 128) {
                  StringBuilder var5;
                  if ((var1 & 128) == 128) {
                     var1 = this.a(var1, 127) - 1;
                     if (d(var1)) {
                        c var6 = d.a[var1];
                        this.e.add(var6);
                        continue;
                     }

                     int var2 = this.b(var1 - d.a.length);
                     if (var2 >= 0 && var2 <= this.a.length - 1) {
                        this.e.add(this.a[var2]);
                        continue;
                     }

                     var5 = new StringBuilder("Header index too large ");
                     var5.append(var1 + 1);
                     throw new IOException(var5.toString());
                  }

                  if (var1 == 64) {
                     this.a(new c(d.a(this.f()), this.f()));
                     continue;
                  }

                  if ((var1 & 64) == 64) {
                     this.a(new c(this.c(this.a(var1, 63) - 1), this.f()));
                     continue;
                  }

                  if ((var1 & 32) == 32) {
                     this.h = this.a(var1, 31);
                     if (this.h >= 0 && this.h <= this.g) {
                        this.c();
                        continue;
                     }

                     var5 = new StringBuilder("Invalid dynamic table size update ");
                     var5.append(this.h);
                     throw new IOException(var5.toString());
                  }

                  b.f var3;
                  b.f var4;
                  if (var1 != 16 && var1 != 0) {
                     var3 = this.c(this.a(var1, 15) - 1);
                     var4 = this.f();
                     this.e.add(new c(var3, var4));
                     continue;
                  }

                  var3 = d.a(this.f());
                  var4 = this.f();
                  this.e.add(new c(var3, var4));
                  continue;
               }

               throw new IOException("index == 0");
            }

            return;
         }
      }

      public final List b() {
         ArrayList var1 = new ArrayList(this.e);
         this.e.clear();
         return var1;
      }
   }

   static final class b {
      int a;
      int b;
      c[] c;
      int d;
      int e;
      int f;
      private final b.c g;
      private final boolean h;
      private int i;
      private boolean j;

      b(b.c var1) {
         this(var1, (byte)0);
      }

      private b(b.c var1, byte var2) {
         this.i = Integer.MAX_VALUE;
         this.c = new c[8];
         this.d = this.c.length - 1;
         this.e = 0;
         this.f = 0;
         this.a = 4096;
         this.b = 4096;
         this.h = true;
         this.g = var1;
      }

      private void a() {
         Arrays.fill(this.c, (Object)null);
         this.d = this.c.length - 1;
         this.e = 0;
         this.f = 0;
      }

      private void a(int var1, int var2, int var3) {
         if (var1 < var2) {
            this.g.b(var1 | var3);
         } else {
            this.g.b(var3 | var2);

            for(var1 -= var2; var1 >= 128; var1 >>>= 7) {
               this.g.b(128 | var1 & 127);
            }

            this.g.b(var1);
         }
      }

      private void a(c var1) {
         int var2 = var1.i;
         if (var2 > this.b) {
            this.a();
         } else {
            this.b(this.f + var2 - this.b);
            if (this.e + 1 > this.c.length) {
               c[] var4 = new c[this.c.length * 2];
               System.arraycopy(this.c, 0, var4, this.c.length, this.c.length);
               this.d = this.c.length - 1;
               this.c = var4;
            }

            int var3 = this.d--;
            this.c[var3] = var1;
            ++this.e;
            this.f += var2;
         }
      }

      private void a(b.f var1) {
         if (this.h) {
            k.a();
            if (k.a(var1) < var1.g()) {
               b.c var2 = new b.c();
               k.a();
               k.a(var1, var2);
               var1 = var2.k();
               this.a(var1.g(), 127, 128);
               this.g.a(var1);
               return;
            }
         }

         this.a(var1.g(), 127, 0);
         this.g.a(var1);
      }

      private int b(int var1) {
         int var2 = 0;
         byte var4 = 0;
         if (var1 > 0) {
            var2 = this.c.length - 1;
            int var3 = var1;

            for(var1 = var4; var2 >= this.d && var3 > 0; --var2) {
               var3 -= this.c[var2].i;
               this.f -= this.c[var2].i;
               --this.e;
               ++var1;
            }

            System.arraycopy(this.c, this.d + 1, this.c, this.d + 1 + var1, this.e);
            Arrays.fill(this.c, this.d + 1, this.d + 1 + var1, (Object)null);
            this.d += var1;
            var2 = var1;
         }

         return var2;
      }

      final void a(int var1) {
         this.a = var1;
         var1 = Math.min(var1, 16384);
         if (this.b != var1) {
            if (var1 < this.b) {
               this.i = Math.min(this.i, var1);
            }

            this.j = true;
            this.b = var1;
            if (this.b < this.f) {
               if (this.b == 0) {
                  this.a();
                  return;
               }

               this.b(this.f - this.b);
            }

         }
      }

      final void a(List var1) {
         if (this.j) {
            if (this.i < this.b) {
               this.a(this.i, 31, 32);
            }

            this.j = false;
            this.i = Integer.MAX_VALUE;
            this.a(this.b, 31, 32);
         }

         int var8 = var1.size();

         for(int var4 = 0; var4 < var8; ++var4) {
            c var10 = (c)var1.get(var4);
            b.f var11 = var10.g.f();
            b.f var12 = var10.h;
            Integer var13 = (Integer)d.b.get(var11);
            int var2;
            int var3;
            if (var13 != null) {
               label50: {
                  var3 = var13 + 1;
                  if (var3 > 1 && var3 < 8) {
                     if (a.a.c.a((Object)d.a[var3 - 1].h, (Object)var12)) {
                        var2 = var3;
                        break label50;
                     }

                     if (a.a.c.a((Object)d.a[var3].h, (Object)var12)) {
                        var2 = var3++;
                        break label50;
                     }
                  }

                  var2 = var3;
                  var3 = -1;
               }
            } else {
               var3 = -1;
               var2 = -1;
            }

            int var6 = var3;
            int var7 = var2;
            if (var3 == -1) {
               int var5 = this.d + 1;
               int var9 = this.c.length;

               while(true) {
                  var6 = var3;
                  var7 = var2;
                  if (var5 >= var9) {
                     break;
                  }

                  var6 = var2;
                  if (a.a.c.a((Object)this.c[var5].g, (Object)var11)) {
                     if (a.a.c.a((Object)this.c[var5].h, (Object)var12)) {
                        var3 = this.d;
                        var6 = d.a.length + (var5 - var3);
                        var7 = var2;
                        break;
                     }

                     var6 = var2;
                     if (var2 == -1) {
                        var6 = var5 - this.d + d.a.length;
                     }
                  }

                  ++var5;
                  var2 = var6;
               }
            }

            if (var6 != -1) {
               this.a(var6, 127, 128);
            } else if (var7 == -1) {
               this.g.b(64);
               this.a(var11);
               this.a(var12);
               this.a(var10);
            } else {
               b.f var14 = c.a;
               if (var11.a(0, (b.f)var14, 0, var14.g()) && !c.f.equals(var11)) {
                  this.a(var7, 15, 0);
                  this.a(var12);
               } else {
                  this.a(var7, 63, 64);
                  this.a(var12);
                  this.a(var10);
               }
            }
         }

      }
   }
}
