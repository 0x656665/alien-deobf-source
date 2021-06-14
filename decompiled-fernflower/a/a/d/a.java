package a.a.d;

import a.aa;
import a.r;
import a.u;
import a.x;
import a.z;
import a.a.b.g;
import a.a.c.i;
import b.h;
import b.k;
import b.q;
import b.s;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.util.concurrent.TimeUnit;

public final class a implements a.a.c.c {
   final u a;
   final g b;
   final b.e c;
   final b.d d;
   int e = 0;

   public a(u var1, g var2, b.e var3, b.d var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   static void a(h var0) {
      s var1 = var0.a;
      s var2 = s.b;
      if (var2 != null) {
         var0.a = var2;
         var1.e_();
         var1.d();
      } else {
         throw new IllegalArgumentException("delegate == null");
      }
   }

   public final aa a(z var1) {
      Object var4;
      if (!a.a.c.e.b(var1)) {
         var4 = this.a(0L);
      } else {
         StringBuilder var5;
         if ("chunked".equalsIgnoreCase(var1.decrypt_str("Transfer-Encoding"))) {
            r var6 = var1.a.a;
            if (this.e != 4) {
               var5 = new StringBuilder("state: ");
               var5.append(this.e);
               throw new IllegalStateException(var5.toString());
            }

            this.e = 5;
            var4 = new a.a.d.a.c(var6);
         } else {
            long var2 = a.a.c.e.a(var1);
            if (var2 != -1L) {
               var4 = this.a(var2);
            } else {
               if (this.e != 4) {
                  var5 = new StringBuilder("state: ");
                  var5.append(this.e);
                  throw new IllegalStateException(var5.toString());
               }

               if (this.b == null) {
                  throw new IllegalStateException("streamAllocation == null");
               }

               this.e = 5;
               this.b.d();
               var4 = new a.a.d.a.f();
            }
         }
      }

      return new a.a.c.h(var1.f, k.a((b.r)var4));
   }

   public final z.a a(boolean var1) {
      if (this.e != 1 && this.e != 3) {
         StringBuilder var8 = new StringBuilder("state: ");
         var8.append(this.e);
         throw new IllegalStateException(var8.toString());
      } else {
         EOFException var10000;
         label38: {
            a.a.c.k var2;
            z.a var3;
            boolean var10001;
            try {
               var2 = a.a.c.k.a(this.c.m());
               var3 = new z.a();
               var3.b = var2.a;
               var3.c = var2.b;
               var3.d = var2.c;
               var3 = var3.a(this.c());
            } catch (EOFException var6) {
               var10000 = var6;
               var10001 = false;
               break label38;
            }

            if (var1) {
               try {
                  if (var2.b == 100) {
                     return null;
                  }
               } catch (EOFException var5) {
                  var10000 = var5;
                  var10001 = false;
                  break label38;
               }
            }

            try {
               this.e = 4;
               return var3;
            } catch (EOFException var4) {
               var10000 = var4;
               var10001 = false;
            }
         }

         EOFException var7 = var10000;
         StringBuilder var9 = new StringBuilder("unexpected end of stream on ");
         var9.append(this.b);
         IOException var10 = new IOException(var9.toString());
         var10.initCause(var7);
         throw var10;
      }
   }

   public final q a(x var1, long var2) {
      StringBuilder var4;
      if ("chunked".equalsIgnoreCase(var1.a("Transfer-Encoding"))) {
         if (this.e == 1) {
            this.e = 2;
            return new a.a.d.a.b();
         } else {
            var4 = new StringBuilder("state: ");
            var4.append(this.e);
            throw new IllegalStateException(var4.toString());
         }
      } else if (var2 != -1L) {
         if (this.e == 1) {
            this.e = 2;
            return new a.a.d.a.d(var2);
         } else {
            var4 = new StringBuilder("state: ");
            var4.append(this.e);
            throw new IllegalStateException(var4.toString());
         }
      } else {
         throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
      }
   }

   public final b.r a(long var1) {
      if (this.e == 4) {
         this.e = 5;
         return new a.a.d.a.e(var1);
      } else {
         StringBuilder var3 = new StringBuilder("state: ");
         var3.append(this.e);
         throw new IllegalStateException(var3.toString());
      }
   }

   public final void a() {
      this.d.flush();
   }

   public final void a(a.q var1, String var2) {
      if (this.e != 0) {
         StringBuilder var5 = new StringBuilder("state: ");
         var5.append(this.e);
         throw new IllegalStateException(var5.toString());
      } else {
         this.d.b(var2).b("\r\n");
         int var3 = 0;

         for(int var4 = var1.a.length / 2; var3 < var4; ++var3) {
            this.d.b(var1.a(var3)).b(": ").b(var1.b(var3)).b("\r\n");
         }

         this.d.b("\r\n");
         this.e = 1;
      }
   }

   public final void a(x var1) {
      Type var3 = this.b.b().a.b.type();
      StringBuilder var4 = new StringBuilder();
      var4.append(var1.b);
      var4.append(' ');
      boolean var2;
      if (!var1.a.b() && var3 == Type.HTTP) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (var2) {
         var4.append(var1.a);
      } else {
         var4.append(i.a(var1.a));
      }

      var4.append(" HTTP/1.1");
      String var5 = var4.toString();
      this.a(var1.c, var5);
   }

   public final void b() {
      this.d.flush();
   }

   public final a.q c() {
      a.q.a var1 = new a.q.a();

      while(true) {
         String var2 = this.c.m();
         if (var2.length() == 0) {
            return var1.a();
         }

         a.a.a.a.a(var1, var2);
      }
   }

   abstract class a implements b.r {
      protected final h a;
      protected boolean b;

      private a() {
         this.a = new h(a.this.c.a());
      }

      // $FF: synthetic method
      a(byte var2) {
         this();
      }

      public final s a() {
         return this.a;
      }

      protected final void a(boolean var1) {
         if (a.this.e != 6) {
            if (a.this.e == 5) {
               a.a.d.a.a(this.a);
               a.this.e = 6;
               if (a.this.b != null) {
                  a.this.b.a(var1 ^ true, a.this);
               }

            } else {
               StringBuilder var2 = new StringBuilder("state: ");
               var2.append(a.this.e);
               throw new IllegalStateException(var2.toString());
            }
         }
      }
   }

   final class b implements q {
      private final h b;
      private boolean c;

      b() {
         this.b = new h(a.this.d.a());
      }

      public final s a() {
         return this.b;
      }

      public final void a_(b.c var1, long var2) {
         if (!this.c) {
            if (var2 != 0L) {
               a.this.d.i(var2);
               a.this.d.b("\r\n");
               a.this.d.a_(var1, var2);
               a.this.d.b("\r\n");
            }
         } else {
            throw new IllegalStateException("closed");
         }
      }

      public final void close() {
         synchronized(this){}

         Throwable var10000;
         label78: {
            boolean var1;
            boolean var10001;
            try {
               var1 = this.c;
            } catch (Throwable var8) {
               var10000 = var8;
               var10001 = false;
               break label78;
            }

            if (var1) {
               return;
            }

            try {
               this.c = true;
               a.this.d.b("0\r\n\r\n");
               a.a.d.a.a(this.b);
               a.this.e = 3;
            } catch (Throwable var7) {
               var10000 = var7;
               var10001 = false;
               break label78;
            }

            return;
         }

         Throwable var2 = var10000;
         throw var2;
      }

      public final void flush() {
         synchronized(this){}

         Throwable var10000;
         label78: {
            boolean var1;
            boolean var10001;
            try {
               var1 = this.c;
            } catch (Throwable var8) {
               var10000 = var8;
               var10001 = false;
               break label78;
            }

            if (var1) {
               return;
            }

            try {
               a.this.d.flush();
            } catch (Throwable var7) {
               var10000 = var7;
               var10001 = false;
               break label78;
            }

            return;
         }

         Throwable var2 = var10000;
         throw var2;
      }
   }

   final class c extends a.a.d.a.a {
      private final r e;
      private long f = -1L;
      private boolean g = true;

      c(r var2) {
         super((byte)0);
         this.e = var2;
      }

      public final long a(b.c var1, long var2) {
         if (var2 < 0L) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(var2)));
         } else if (!this.b) {
            if (!this.g) {
               return -1L;
            } else {
               if (this.f == 0L || this.f == -1L) {
                  if (this.f != -1L) {
                     a.this.c.m();
                  }

                  label57: {
                     NumberFormatException var10000;
                     label56: {
                        boolean var10001;
                        String var5;
                        label55: {
                           boolean var4;
                           try {
                              this.f = a.this.c.j();
                              var5 = a.this.c.m().trim();
                              if (this.f < 0L) {
                                 break label55;
                              }

                              if (var5.isEmpty()) {
                                 break label57;
                              }

                              var4 = var5.startsWith(";");
                           } catch (NumberFormatException var7) {
                              var10000 = var7;
                              var10001 = false;
                              break label56;
                           }

                           if (var4) {
                              break label57;
                           }
                        }

                        try {
                           StringBuilder var9 = new StringBuilder("expected chunk size and optional extensions but was \"");
                           var9.append(this.f);
                           var9.append(var5);
                           var9.append("\"");
                           throw new ProtocolException(var9.toString());
                        } catch (NumberFormatException var6) {
                           var10000 = var6;
                           var10001 = false;
                        }
                     }

                     NumberFormatException var8 = var10000;
                     throw new ProtocolException(var8.getMessage());
                  }

                  if (this.f == 0L) {
                     this.g = false;
                     a.a.c.e.a(a.this.a.j, this.e, a.this.c());
                     this.a(true);
                  }

                  if (!this.g) {
                     return -1L;
                  }
               }

               var2 = a.this.c.a(var1, Math.min(var2, this.f));
               if (var2 != -1L) {
                  this.f -= var2;
                  return var2;
               } else {
                  this.a(false);
                  throw new ProtocolException("unexpected end of stream");
               }
            }
         } else {
            throw new IllegalStateException("closed");
         }
      }

      public final void close() {
         if (!this.b) {
            if (this.g && !a.a.c.a((b.r)this, (TimeUnit)TimeUnit.MILLISECONDS)) {
               this.a(false);
            }

            this.b = true;
         }
      }
   }

   final class d implements q {
      private final h b;
      private boolean c;
      private long d;

      d(long var2) {
         this.b = new h(a.this.d.a());
         this.d = var2;
      }

      public final s a() {
         return this.b;
      }

      public final void a_(b.c var1, long var2) {
         if (!this.c) {
            a.a.c.a(var1.b, var2);
            if (var2 <= this.d) {
               a.this.d.a_(var1, var2);
               this.d -= var2;
            } else {
               StringBuilder var4 = new StringBuilder("expected ");
               var4.append(this.d);
               var4.append(" bytes but received ");
               var4.append(var2);
               throw new ProtocolException(var4.toString());
            }
         } else {
            throw new IllegalStateException("closed");
         }
      }

      public final void close() {
         if (!this.c) {
            this.c = true;
            if (this.d <= 0L) {
               a.a.d.a.a(this.b);
               a.this.e = 3;
            } else {
               throw new ProtocolException("unexpected end of stream");
            }
         }
      }

      public final void flush() {
         if (!this.c) {
            a.this.d.flush();
         }
      }
   }

   final class e extends a.a.d.a.a {
      private long e;

      public e(long var2) {
         super((byte)0);
         this.e = var2;
         if (this.e == 0L) {
            this.a(true);
         }

      }

      public final long a(b.c var1, long var2) {
         if (var2 >= 0L) {
            if (!this.b) {
               if (this.e == 0L) {
                  return -1L;
               } else {
                  var2 = a.this.c.a(var1, Math.min(this.e, var2));
                  if (var2 != -1L) {
                     this.e -= var2;
                     if (this.e == 0L) {
                        this.a(true);
                     }

                     return var2;
                  } else {
                     this.a(false);
                     throw new ProtocolException("unexpected end of stream");
                  }
               }
            } else {
               throw new IllegalStateException("closed");
            }
         } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(var2)));
         }
      }

      public final void close() {
         if (!this.b) {
            if (this.e != 0L && !a.a.c.a((b.r)this, (TimeUnit)TimeUnit.MILLISECONDS)) {
               this.a(false);
            }

            this.b = true;
         }
      }
   }

   final class f extends a.a.d.a.a {
      private boolean e;

      f() {
         super((byte)0);
      }

      public final long a(b.c var1, long var2) {
         if (var2 >= 0L) {
            if (!this.b) {
               if (this.e) {
                  return -1L;
               } else {
                  var2 = a.this.c.a(var1, var2);
                  if (var2 == -1L) {
                     this.e = true;
                     this.a(true);
                     return -1L;
                  } else {
                     return var2;
                  }
               }
            } else {
               throw new IllegalStateException("closed");
            }
         } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(var2)));
         }
      }

      public final void close() {
         if (!this.b) {
            if (!this.e) {
               this.a(false);
            }

            this.b = true;
         }
      }
   }
}
