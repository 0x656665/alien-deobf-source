package a.a.e;

import b.q;
import b.r;
import b.s;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;

public final class i {
   // $FF: synthetic field
   static final boolean l = i.class.desiredAssertionStatus() ^ true;
   long a = 0L;
   long b;
   final int c;
   final g d;
   List e;
   boolean f;
   final i.b g;
   final i.a h;
   final i.c i = new i.c();
   final i.c j = new i.c();
   a.a.e.b k = null;
   private final List m;

   i(int var1, g var2, boolean var3, boolean var4, List var5) {
      if (var2 != null) {
         if (var5 != null) {
            this.c = var1;
            this.d = var2;
            this.b = (long)var2.n.b();
            this.g = new i.b((long)var2.m.b());
            this.h = new i.a();
            this.g.b = var4;
            this.h.b = var3;
            this.m = var5;
         } else {
            throw new NullPointerException("requestHeaders == null");
         }
      } else {
         throw new NullPointerException("connection == null");
      }
   }

   private boolean d(a.a.e.b var1) {
      if (!l && Thread.holdsLock(this)) {
         throw new AssertionError();
      } else {
         synchronized(this){}

         label252: {
            Throwable var10000;
            boolean var10001;
            label253: {
               try {
                  if (this.k != null) {
                     return false;
                  }
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label253;
               }

               try {
                  if (this.g.b && this.h.b) {
                     return false;
                  }
               } catch (Throwable var20) {
                  var10000 = var20;
                  var10001 = false;
                  break label253;
               }

               label239:
               try {
                  this.k = var1;
                  this.notifyAll();
                  break label252;
               } catch (Throwable var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label239;
               }
            }

            while(true) {
               Throwable var22 = var10000;

               try {
                  throw var22;
               } catch (Throwable var18) {
                  var10000 = var18;
                  var10001 = false;
                  continue;
               }
            }
         }

         this.d.b(this.c);
         return true;
      }
   }

   final void a(long var1) {
      this.b += var1;
      if (var1 > 0L) {
         this.notifyAll();
      }

   }

   public final void a(a.a.e.b var1) {
      if (this.d(var1)) {
         this.d.b(this.c, var1);
      }
   }

   public final boolean a() {
      synchronized(this){}

      boolean var1;
      label240: {
         Throwable var10000;
         label245: {
            boolean var10001;
            a.a.e.b var2;
            try {
               var2 = this.k;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label245;
            }

            if (var2 != null) {
               return false;
            }

            try {
               if (!this.g.b && !this.g.a) {
                  return true;
               }
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label245;
            }

            try {
               if (!this.h.b && !this.h.a) {
                  return true;
               }
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label245;
            }

            label229:
            try {
               var1 = this.f;
               break label240;
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label229;
            }
         }

         Throwable var23 = var10000;
         throw var23;
      }

      if (var1) {
         return false;
      } else {
         return true;
      }
   }

   public final void b(a.a.e.b var1) {
      if (this.d(var1)) {
         this.d.a(this.c, var1);
      }
   }

   public final boolean b() {
      boolean var1;
      if ((this.c & 1) == 1) {
         var1 = true;
      } else {
         var1 = false;
      }

      return this.d.b == var1;
   }

   public final List c() {
      synchronized(this){}

      Throwable var10000;
      label501: {
         boolean var10001;
         label500: {
            try {
               if (!this.b()) {
                  break label500;
               }

               this.i.a_();
            } catch (Throwable var58) {
               var10000 = var58;
               var10001 = false;
               break label501;
            }

            while(true) {
               boolean var44 = false;

               try {
                  var44 = true;
                  if (this.e == null) {
                     if (this.k == null) {
                        this.h();
                        var44 = false;
                        continue;
                     }

                     var44 = false;
                  } else {
                     var44 = false;
                  }
               } finally {
                  if (var44) {
                     try {
                        this.i.b();
                     } catch (Throwable var52) {
                        var10000 = var52;
                        var10001 = false;
                        break label501;
                     }
                  }
               }

               List var1;
               try {
                  this.i.b();
                  var1 = this.e;
               } catch (Throwable var55) {
                  var10000 = var55;
                  var10001 = false;
                  break label501;
               }

               if (var1 != null) {
                  try {
                     this.e = null;
                  } catch (Throwable var53) {
                     var10000 = var53;
                     var10001 = false;
                     break label501;
                  }

                  return var1;
               } else {
                  try {
                     throw new o(this.k);
                  } catch (Throwable var54) {
                     var10000 = var54;
                     var10001 = false;
                     break label501;
                  }
               }
            }
         }

         label486:
         try {
            throw new IllegalStateException("servers cannot read response headers");
         } catch (Throwable var56) {
            var10000 = var56;
            var10001 = false;
            break label486;
         }
      }

      Throwable var59 = var10000;
      throw var59;
   }

   final void c(a.a.e.b var1) {
      synchronized(this){}

      try {
         if (this.k == null) {
            this.k = var1;
            this.notifyAll();
         }
      } finally {
         ;
      }

   }

   public final q d() {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label211: {
         label216: {
            try {
               if (!this.f && !this.b()) {
                  break label216;
               }
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label211;
            }

            try {
               ;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label211;
            }

            return this.h;
         }

         label198:
         try {
            throw new IllegalStateException("reply before requesting the sink");
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            break label198;
         }
      }

      while(true) {
         Throwable var1 = var10000;

         try {
            throw var1;
         } catch (Throwable var18) {
            var10000 = var18;
            var10001 = false;
            continue;
         }
      }
   }

   final void e() {
      // $FF: Couldn't be decompiled
   }

   final void f() {
      if (!l && Thread.holdsLock(this)) {
         throw new AssertionError();
      } else {
         synchronized(this){}

         boolean var1;
         boolean var2;
         label242: {
            Throwable var10000;
            boolean var10001;
            label235: {
               label234: {
                  label233: {
                     try {
                        if (!this.g.b && this.g.a && (this.h.b || this.h.a)) {
                           break label233;
                        }
                     } catch (Throwable var15) {
                        var10000 = var15;
                        var10001 = false;
                        break label235;
                     }

                     var1 = false;
                     break label234;
                  }

                  var1 = true;
               }

               label221:
               try {
                  var2 = this.a();
                  break label242;
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label221;
               }
            }

            while(true) {
               Throwable var3 = var10000;

               try {
                  throw var3;
               } catch (Throwable var13) {
                  var10000 = var13;
                  var10001 = false;
                  continue;
               }
            }
         }

         if (var1) {
            this.a(a.a.e.b.f);
         } else {
            if (!var2) {
               this.d.b(this.c);
            }

         }
      }
   }

   final void g() {
      if (!this.h.a) {
         if (!this.h.b) {
            if (this.k != null) {
               throw new o(this.k);
            }
         } else {
            throw new IOException("stream finished");
         }
      } else {
         throw new IOException("stream closed");
      }
   }

   final void h() {
      try {
         this.wait();
      } catch (InterruptedException var2) {
         throw new InterruptedIOException();
      }
   }

   final class a implements q {
      // $FF: synthetic field
      static final boolean c = i.class.desiredAssertionStatus() ^ true;
      boolean a;
      boolean b;
      private final b.c e = new b.c();

      private void a(boolean var1) {
         i var5 = i.this;
         synchronized(var5){}

         long var3;
         Throwable var10000;
         boolean var10001;
         label793: {
            label788: {
               try {
                  i.this.j.a_();
               } catch (Throwable var78) {
                  var10000 = var78;
                  var10001 = false;
                  break label788;
               }

               while(true) {
                  boolean var63 = false;

                  try {
                     var63 = true;
                     if (i.this.b <= 0L) {
                        if (!this.b) {
                           if (!this.a) {
                              if (i.this.k == null) {
                                 i.this.h();
                                 var63 = false;
                                 continue;
                              }

                              var63 = false;
                           } else {
                              var63 = false;
                           }
                        } else {
                           var63 = false;
                        }
                     } else {
                        var63 = false;
                     }
                  } finally {
                     if (var63) {
                        try {
                           i.this.j.b();
                        } catch (Throwable var76) {
                           var10000 = var76;
                           var10001 = false;
                           break;
                        }
                     }
                  }

                  try {
                     i.this.j.b();
                     i.this.g();
                     var3 = Math.min(i.this.b, this.e.b);
                     i var82 = i.this;
                     var82.b -= var3;
                     break label793;
                  } catch (Throwable var77) {
                     var10000 = var77;
                     var10001 = false;
                     break;
                  }
               }
            }

            while(true) {
               Throwable var6 = var10000;

               try {
                  throw var6;
               } catch (Throwable var72) {
                  var10000 = var72;
                  var10001 = false;
                  continue;
               }
            }
         }

         i.this.j.a_();

         label767: {
            label795: {
               int var2;
               g var80;
               try {
                  var80 = i.this.d;
                  var2 = i.this.c;
               } catch (Throwable var75) {
                  var10000 = var75;
                  var10001 = false;
                  break label795;
               }

               label798: {
                  if (var1) {
                     label797: {
                        try {
                           if (var3 != this.e.b) {
                              break label797;
                           }
                        } catch (Throwable var74) {
                           var10000 = var74;
                           var10001 = false;
                           break label795;
                        }

                        var1 = true;
                        break label798;
                     }
                  }

                  var1 = false;
               }

               label753:
               try {
                  var80.a(var2, var1, this.e, var3);
                  break label767;
               } catch (Throwable var73) {
                  var10000 = var73;
                  var10001 = false;
                  break label753;
               }
            }

            Throwable var81 = var10000;
            i.this.j.b();
            throw var81;
         }

         i.this.j.b();
      }

      public final s a() {
         return i.this.j;
      }

      public final void a_(b.c var1, long var2) {
         if (!c && Thread.holdsLock(i.this)) {
            throw new AssertionError();
         } else {
            this.e.a_(var1, var2);

            while(this.e.b >= 16384L) {
               this.a(false);
            }

         }
      }

      public final void close() {
         // $FF: Couldn't be decompiled
      }

      public final void flush() {
         // $FF: Couldn't be decompiled
      }
   }

   final class b implements r {
      // $FF: synthetic field
      static final boolean c = i.class.desiredAssertionStatus() ^ true;
      boolean a;
      boolean b;
      private final b.c e = new b.c();
      private final b.c f = new b.c();
      private final long g;

      b(long var2) {
         this.g = var2;
      }

      private void blockBack2() {
         i.this.i.a_();

         while(true) {
            boolean var3 = false;

            try {
               var3 = true;
               if (this.f.b == 0L) {
                  if (!this.b) {
                     if (!this.a) {
                        if (i.this.k == null) {
                           i.this.h();
                           var3 = false;
                           continue;
                        }

                        var3 = false;
                        break;
                     }

                     var3 = false;
                     break;
                  }

                  var3 = false;
                  break;
               }

               var3 = false;
               break;
            } finally {
               if (var3) {
                  i.this.i.b();
               }
            }
         }

         i.this.i.b();
      }

      public final long a(b.c var1, long var2) {
         if (var2 >= 0L) {
            i var4 = i.this;
            synchronized(var4){}

            Throwable var10000;
            boolean var10001;
            label907: {
               label900: {
                  label899: {
                     try {
                        this.blockBack2();
                        if (!this.a) {
                           if (i.this.k != null) {
                              break label899;
                           }

                           if (this.f.b == 0L) {
                              return -1L;
                           }
                           break label900;
                        }
                     } catch (Throwable var94) {
                        var10000 = var94;
                        var10001 = false;
                        break label907;
                     }

                     try {
                        throw new IOException("stream closed");
                     } catch (Throwable var93) {
                        var10000 = var93;
                        var10001 = false;
                        break label907;
                     }
                  }

                  try {
                     throw new o(i.this.k);
                  } catch (Throwable var92) {
                     var10000 = var92;
                     var10001 = false;
                     break label907;
                  }
               }

               try {
                  var2 = this.f.a(var1, Math.min(var2, this.f.b));
                  i var95 = i.this;
                  var95.a += var2;
                  if (i.this.a >= (long)(i.this.d.m.b() / 2)) {
                     i.this.d.a(i.this.c, i.this.a);
                     i.this.a = 0L;
                  }
               } catch (Throwable var91) {
                  var10000 = var91;
                  var10001 = false;
                  break label907;
               }

               try {
                  ;
               } catch (Throwable var90) {
                  var10000 = var90;
                  var10001 = false;
                  break label907;
               }

               g var96 = i.this.d;
               synchronized(var96){}

               label872: {
                  try {
                     g var98 = i.this.d;
                     var98.k += var2;
                     if (i.this.d.k >= (long)(i.this.d.m.b() / 2)) {
                        i.this.d.a(0, i.this.d.k);
                        i.this.d.k = 0L;
                     }
                  } catch (Throwable var89) {
                     var10000 = var89;
                     var10001 = false;
                     break label872;
                  }

                  label869:
                  try {
                     return var2;
                  } catch (Throwable var88) {
                     var10000 = var88;
                     var10001 = false;
                     break label869;
                  }
               }

               while(true) {
                  Throwable var99 = var10000;

                  try {
                     throw var99;
                  } catch (Throwable var87) {
                     var10000 = var87;
                     var10001 = false;
                     continue;
                  }
               }
            }

            while(true) {
               Throwable var97 = var10000;

               try {
                  throw var97;
               } catch (Throwable var86) {
                  var10000 = var86;
                  var10001 = false;
                  continue;
               }
            }
         } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(var2)));
         }
      }

      public final s a() {
         return i.this.i;
      }

      final void a(b.e var1, long var2) {
         long var6 = var2;
         if (!c) {
            if (Thread.holdsLock(i.this)) {
               throw new AssertionError();
            }

            var6 = var2;
         }

         while(true) {
            if (var6 > 0L) {
               i var11 = i.this;
               synchronized(var11){}

               boolean var4;
               boolean var5;
               boolean var10;
               Throwable var10000;
               boolean var10001;
               Throwable var84;
               label907: {
                  label908: {
                     long var8;
                     try {
                        var10 = this.b;
                        var2 = this.f.b;
                        var8 = this.g;
                     } catch (Throwable var83) {
                        var10000 = var83;
                        var10001 = false;
                        break label908;
                     }

                     var5 = false;
                     if (var2 + var6 > var8) {
                        var4 = true;
                     } else {
                        var4 = false;
                     }

                     label894:
                     try {
                        break label907;
                     } catch (Throwable var82) {
                        var10000 = var82;
                        var10001 = false;
                        break label894;
                     }
                  }

                  while(true) {
                     var84 = var10000;

                     try {
                        throw var84;
                     } catch (Throwable var76) {
                        var10000 = var76;
                        var10001 = false;
                        continue;
                     }
                  }
               }

               if (var4) {
                  var1.f(var6);
                  i.this.b(a.a.e.b.d);
                  return;
               }

               if (var10) {
                  var1.f(var6);
                  return;
               }

               var2 = var1.a(this.e, var6);
               if (var2 != -1L) {
                  var6 -= var2;
                  var11 = i.this;
                  synchronized(var11){}
                  var4 = var5;

                  label910: {
                     label883: {
                        try {
                           if (this.f.b != 0L) {
                              break label883;
                           }
                        } catch (Throwable var81) {
                           var10000 = var81;
                           var10001 = false;
                           break label910;
                        }

                        var4 = true;
                     }

                     try {
                        this.f.a((r)this.e);
                     } catch (Throwable var80) {
                        var10000 = var80;
                        var10001 = false;
                        break label910;
                     }

                     if (var4) {
                        try {
                           i.this.notifyAll();
                        } catch (Throwable var79) {
                           var10000 = var79;
                           var10001 = false;
                           break label910;
                        }
                     }

                     label871:
                     try {
                        continue;
                     } catch (Throwable var78) {
                        var10000 = var78;
                        var10001 = false;
                        break label871;
                     }
                  }

                  while(true) {
                     var84 = var10000;

                     try {
                        throw var84;
                     } catch (Throwable var77) {
                        var10000 = var77;
                        var10001 = false;
                        continue;
                     }
                  }
               }

               throw new EOFException();
            }

            return;
         }
      }

      public final void close() {
         // $FF: Couldn't be decompiled
      }
   }

   final class c extends b.a {
      public final IOException a(IOException var1) {
         SocketTimeoutException var2 = new SocketTimeoutException("timeout");
         if (var1 != null) {
            var2.initCause(var1);
         }

         return var2;
      }

      public final void a() {
         i.this.b(a.a.e.b.f);
      }

      public final void b() {
         if (this.b_()) {
            throw this.a((IOException)null);
         }
      }
   }
}
