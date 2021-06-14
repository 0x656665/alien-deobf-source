package a.a.b;

import a.ab;
import a.i;
import a.u;
import a.a.e.o;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.Proxy.Type;

public final class g {
   // $FF: synthetic field
   public static final boolean e = g.class.desiredAssertionStatus() ^ true;
   public final a.a a;
   public final i b;
   public c c;
   public a.a.c.c d;
   private ab f;
   private final Object g;
   private final f h;
   private int i;
   private boolean j;
   private boolean k;

   public g(i var1, a.a var2, Object var3) {
      this.b = var1;
      this.a = var2;
      this.h = new f(var2, this.f());
      this.g = var3;
   }

   private c a(int var1, int var2, int var3, boolean var4) {
      i var5 = this.b;
      synchronized(var5){}

      Throwable var10000;
      boolean var10001;
      label2315: {
         label2314: {
            label2319: {
               c var6;
               label2312: {
                  try {
                     if (this.j) {
                        break label2319;
                     }

                     if (this.d != null) {
                        break label2314;
                     }

                     if (!this.k) {
                        var6 = this.c;
                        break label2312;
                     }
                  } catch (Throwable var248) {
                     var10000 = var248;
                     var10001 = false;
                     break label2315;
                  }

                  try {
                     throw new IOException("Canceled");
                  } catch (Throwable var243) {
                     var10000 = var243;
                     var10001 = false;
                     break label2315;
                  }
               }

               if (var6 != null) {
                  try {
                     if (!var6.g) {
                        return var6;
                     }
                  } catch (Throwable var246) {
                     var10000 = var246;
                     var10001 = false;
                     break label2315;
                  }
               }

               try {
                  a.a.a.a.a(this.b, this.a, this);
                  if (this.c != null) {
                     var6 = this.c;
                     return var6;
                  }
               } catch (Throwable var247) {
                  var10000 = var247;
                  var10001 = false;
                  break label2315;
               }

               ab var250;
               try {
                  var250 = this.f;
               } catch (Throwable var242) {
                  var10000 = var242;
                  var10001 = false;
                  break label2315;
               }

               ab var249 = var250;
               if (var250 == null) {
                  var249 = this.h.a();
               }

               i var252 = this.b;
               synchronized(var252){}

               c var7;
               Throwable var251;
               label2321: {
                  label2275: {
                     try {
                        this.f = var249;
                        this.i = 0;
                        var7 = new c(this.b, var249);
                        this.a(var7);
                        if (!this.k) {
                           break label2321;
                        }
                     } catch (Throwable var241) {
                        var10000 = var241;
                        var10001 = false;
                        break label2275;
                     }

                     label2268:
                     try {
                        throw new IOException("Canceled");
                     } catch (Throwable var240) {
                        var10000 = var240;
                        var10001 = false;
                        break label2268;
                     }
                  }

                  while(true) {
                     var251 = var10000;

                     try {
                        throw var251;
                     } catch (Throwable var236) {
                        var10000 = var236;
                        var10001 = false;
                        continue;
                     }
                  }
               }

               var7.a(var1, var2, var3, var4);
               this.f().b(var7.a);
               Socket var254 = null;
               i var8 = this.b;
               synchronized(var8){}

               c var253;
               label2322: {
                  label2323: {
                     try {
                        a.a.a.a.b(this.b, var7);
                     } catch (Throwable var239) {
                        var10000 = var239;
                        var10001 = false;
                        break label2323;
                     }

                     var253 = var7;

                     try {
                        if (var7.b()) {
                           var254 = a.a.a.a.b(this.b, this.a, this);
                           var253 = this.c;
                        }
                     } catch (Throwable var238) {
                        var10000 = var238;
                        var10001 = false;
                        break label2323;
                     }

                     label2255:
                     try {
                        break label2322;
                     } catch (Throwable var237) {
                        var10000 = var237;
                        var10001 = false;
                        break label2255;
                     }
                  }

                  while(true) {
                     var251 = var10000;

                     try {
                        throw var251;
                     } catch (Throwable var234) {
                        var10000 = var234;
                        var10001 = false;
                        continue;
                     }
                  }
               }

               a.a.c.a(var254);
               return var253;
            }

            try {
               throw new IllegalStateException("released");
            } catch (Throwable var245) {
               var10000 = var245;
               var10001 = false;
               break label2315;
            }
         }

         label2288:
         try {
            throw new IllegalStateException("codec != null");
         } catch (Throwable var244) {
            var10000 = var244;
            var10001 = false;
            break label2288;
         }
      }

      while(true) {
         Throwable var255 = var10000;

         try {
            throw var255;
         } catch (Throwable var235) {
            var10000 = var235;
            var10001 = false;
            continue;
         }
      }
   }

   private c a(int var1, int var2, int var3, boolean var4, boolean var5) {
      while(true) {
         c var7 = this.a(var1, var2, var3, var4);
         i var6 = this.b;
         synchronized(var6){}

         Throwable var10000;
         boolean var10001;
         label157: {
            try {
               if (var7.h == 0) {
                  return var7;
               }
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label157;
            }

            try {
               ;
            } catch (Throwable var18) {
               var10000 = var18;
               var10001 = false;
               break label157;
            }

            if (!var7.a(var5)) {
               this.d();
               continue;
            }

            return var7;
         }

         while(true) {
            Throwable var20 = var10000;

            try {
               throw var20;
            } catch (Throwable var17) {
               var10000 = var17;
               var10001 = false;
               continue;
            }
         }
      }
   }

   private void b(c var1) {
      int var3 = var1.j.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         if (((Reference)var1.j.get(var2)).get() == this) {
            var1.j.remove(var2);
            return;
         }
      }

      throw new IllegalStateException();
   }

   private d f() {
      return a.a.a.a.a(this.b);
   }

   public final a.a.c.c a() {
      // $FF: Couldn't be decompiled
   }

   public final a.a.c.c a(u param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public final Socket a(boolean var1, boolean var2, boolean var3) {
      if (!e && !Thread.holdsLock(this.b)) {
         throw new AssertionError();
      } else {
         if (var3) {
            this.d = null;
         }

         if (var2) {
            this.j = true;
         }

         if (this.c != null) {
            if (var1) {
               this.c.g = true;
            }

            if (this.d == null && (this.j || this.c.g)) {
               Socket var4;
               label31: {
                  this.b(this.c);
                  if (this.c.j.isEmpty()) {
                     this.c.k = System.nanoTime();
                     if (a.a.a.a.a(this.b, this.c)) {
                        var4 = this.c.b;
                        break label31;
                     }
                  }

                  var4 = null;
               }

               this.c = null;
               return var4;
            }
         }

         return null;
      }
   }

   public final void a(c var1) {
      if (!e && !Thread.holdsLock(this.b)) {
         throw new AssertionError();
      } else if (this.c == null) {
         this.c = var1;
         var1.j.add(new g.a(this, this.g));
      } else {
         throw new IllegalStateException();
      }
   }

   public final void a(IOException var1) {
      i var3 = this.b;
      synchronized(var3){}

      Socket var118;
      label1109: {
         Throwable var10000;
         boolean var10001;
         label1104: {
            boolean var2;
            label1103: {
               label1110: {
                  label1101: {
                     label1100: {
                        label1111: {
                           o var116;
                           try {
                              if (!(var1 instanceof o)) {
                                 break label1111;
                              }

                              var116 = (o)var1;
                              if (var116.a == a.a.e.b.e) {
                                 ++this.i;
                              }
                           } catch (Throwable var115) {
                              var10000 = var115;
                              var10001 = false;
                              break label1104;
                           }

                           try {
                              if (var116.a == a.a.e.b.e && this.i <= 1) {
                                 break label1100;
                              }
                           } catch (Throwable var113) {
                              var10000 = var113;
                              var10001 = false;
                              break label1104;
                           }

                           try {
                              this.f = null;
                              break label1110;
                           } catch (Throwable var110) {
                              var10000 = var110;
                              var10001 = false;
                              break label1104;
                           }
                        }

                        try {
                           if (this.c != null && (!this.c.b() || var1 instanceof a.a.e.a)) {
                              break label1101;
                           }
                        } catch (Throwable var114) {
                           var10000 = var114;
                           var10001 = false;
                           break label1104;
                        }
                     }

                     var2 = false;
                     break label1103;
                  }

                  label1078: {
                     try {
                        if (this.c.h != 0) {
                           break label1110;
                        }

                        if (this.f == null) {
                           break label1078;
                        }
                     } catch (Throwable var112) {
                        var10000 = var112;
                        var10001 = false;
                        break label1104;
                     }

                     if (var1 != null) {
                        f var4;
                        ab var5;
                        try {
                           var4 = this.h;
                           var5 = this.f;
                           if (var5.b.type() != Type.DIRECT && var4.a.g != null) {
                              var4.a.g.connectFailed(var4.a.a.a(), var5.b.address(), var1);
                           }
                        } catch (Throwable var111) {
                           var10000 = var111;
                           var10001 = false;
                           break label1104;
                        }

                        try {
                           var4.b.a(var5);
                        } catch (Throwable var109) {
                           var10000 = var109;
                           var10001 = false;
                           break label1104;
                        }
                     }
                  }

                  try {
                     this.f = null;
                  } catch (Throwable var108) {
                     var10000 = var108;
                     var10001 = false;
                     break label1104;
                  }
               }

               var2 = true;
            }

            label1060:
            try {
               var118 = this.a(var2, false, true);
               break label1109;
            } catch (Throwable var107) {
               var10000 = var107;
               var10001 = false;
               break label1060;
            }
         }

         while(true) {
            Throwable var117 = var10000;

            try {
               throw var117;
            } catch (Throwable var106) {
               var10000 = var106;
               var10001 = false;
               continue;
            }
         }
      }

      a.a.c.a(var118);
   }

   public final void a(boolean var1, a.a.c.c var2) {
      Throwable var10000;
      boolean var10001;
      label259: {
         label255: {
            i var3 = this.b;
            synchronized(var3){}
            if (var2 != null) {
               try {
                  if (var2 == this.d) {
                     break label255;
                  }
               } catch (Throwable var34) {
                  var10000 = var34;
                  var10001 = false;
                  break label259;
               }
            }

            try {
               StringBuilder var4 = new StringBuilder("expected ");
               var4.append(this.d);
               var4.append(" but was ");
               var4.append(var2);
               throw new IllegalStateException(var4.toString());
            } catch (Throwable var33) {
               var10000 = var33;
               var10001 = false;
               break label259;
            }
         }

         if (!var1) {
            try {
               c var35 = this.c;
               ++var35.h;
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label259;
            }
         }

         Socket var37;
         try {
            var37 = this.a(var1, false, true);
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            break label259;
         }

         a.a.c.a(var37);
         return;
      }

      while(true) {
         Throwable var36 = var10000;

         try {
            throw var36;
         } catch (Throwable var30) {
            var10000 = var30;
            var10001 = false;
            continue;
         }
      }
   }

   public final c b() {
      synchronized(this){}

      c var1;
      try {
         var1 = this.c;
      } finally {
         ;
      }

      return var1;
   }

   public final void c() {
      // $FF: Couldn't be decompiled
   }

   public final void d() {
      // $FF: Couldn't be decompiled
   }

   public final boolean e() {
      if (this.f != null) {
         return true;
      } else {
         f var2 = this.h;
         boolean var1;
         if (!var2.c() && !var2.b() && !var2.d()) {
            var1 = false;
         } else {
            var1 = true;
         }

         return var1;
      }
   }

   public final String toString() {
      c var1 = this.b();
      return var1 != null ? var1.toString() : this.a.toString();
   }

   public static final class a extends WeakReference {
      public final Object a;

      a(g var1, Object var2) {
         super(var1);
         this.a = var2;
      }
   }
}
