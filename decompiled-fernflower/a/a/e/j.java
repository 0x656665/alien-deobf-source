package a.a.e;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class j implements Closeable {
   private static final Logger c = Logger.getLogger(e.class.getName());
   int a;
   final d.b b;
   private final b.d d;
   private final boolean e;
   private final b.c f;
   private boolean g;

   public j(b.d var1, boolean var2) {
      this.d = var1;
      this.e = var2;
      this.f = new b.c();
      this.b = new d.b(this.f);
      this.a = 16384;
   }

   private void a(int var1, int var2, byte var3, byte var4) {
      if (c.isLoggable(Level.FINE)) {
         c.fine(a.a.e.e.a(false, var1, var2, var3, var4));
      }

      if (var2 <= this.a) {
         if ((Integer.MIN_VALUE & var1) == 0) {
            a(this.d, var2);
            this.d.h(var3 & 255);
            this.d.h(var4 & 255);
            this.d.f(var1 & Integer.MAX_VALUE);
         } else {
            throw a.a.e.e.a("reserved bit set: %s", var1);
         }
      } else {
         throw a.a.e.e.a("FRAME_SIZE_ERROR length > %d: %d", this.a, var2);
      }
   }

   private static void a(b.d var0, int var1) {
      var0.h(var1 >>> 16 & 255);
      var0.h(var1 >>> 8 & 255);
      var0.h(var1 & 255);
   }

   private void b(int var1, long var2) {
      while(var2 > 0L) {
         int var5 = (int)Math.min((long)this.a, var2);
         long var6 = (long)var5;
         var2 -= var6;
         byte var4;
         if (var2 == 0L) {
            var4 = 4;
         } else {
            var4 = 0;
         }

         this.a(var1, var5, (byte)9, var4);
         this.d.a_(this.f, var6);
      }

   }

   public final void blockBack() {
      synchronized(this){}

      Throwable var10000;
      label224: {
         boolean var1;
         boolean var10001;
         label219: {
            try {
               if (!this.g) {
                  var1 = this.e;
                  break label219;
               }
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label224;
            }

            try {
               throw new IOException("closed");
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label224;
            }
         }

         if (!var1) {
            return;
         }

         try {
            if (c.isLoggable(Level.FINE)) {
               c.fine(a.a.c.a(">> CONNECTION %s", a.a.e.e.a.e()));
            }
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label224;
         }

         try {
            this.d.b(a.a.e.e.a.h());
            this.d.flush();
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            break label224;
         }

         return;
      }

      Throwable var2 = var10000;
      throw var2;
   }

   public final void a(int var1, long var2) {
      synchronized(this){}

      Throwable var10000;
      label195: {
         boolean var10001;
         label190: {
            try {
               if (!this.g) {
                  break label190;
               }
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label195;
            }

            try {
               throw new IOException("closed");
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label195;
            }
         }

         if (var2 != 0L && var2 <= 2147483647L) {
            label177: {
               try {
                  this.a(var1, 4, (byte)8, (byte)0);
                  this.d.f((int)var2);
                  this.d.flush();
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label177;
               }

               return;
            }
         } else {
            label179:
            try {
               throw a.a.e.e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", var2);
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label179;
            }
         }
      }

      Throwable var4 = var10000;
      throw var4;
   }

   public final void a(int var1, b var2) {
      synchronized(this){}

      try {
         if (this.g) {
            throw new IOException("closed");
         }

         if (var2.g == -1) {
            throw new IllegalArgumentException();
         }

         this.a(var1, 4, (byte)3, (byte)0);
         this.d.f(var2.g);
         this.d.flush();
      } finally {
         ;
      }

   }

   public final void a(int var1, b var2, byte[] var3) {
      synchronized(this){}

      try {
         if (this.g) {
            throw new IOException("closed");
         }

         if (var2.g == -1) {
            throw a.a.e.e.a("errorCode.httpCode == -1");
         }

         this.a(0, var3.length + 8, (byte)7, (byte)0);
         this.d.f(var1);
         this.d.f(var2.g);
         if (var3.length > 0) {
            this.d.b(var3);
         }

         this.d.flush();
      } finally {
         ;
      }

   }

   public final void a(n var1) {
      synchronized(this){}

      try {
         if (this.g) {
            throw new IOException("closed");
         }

         int var2 = this.a;
         if ((var1.a & 32) != 0) {
            var2 = var1.b[5];
         }

         this.a = var2;
         if (var1.a() != -1) {
            this.b.a(var1.a());
         }

         this.a(0, 0, (byte)4, (byte)1);
         this.d.flush();
      } finally {
         ;
      }

   }

   public final void a(boolean var1, int var2, int var3) {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
   }

   public final void a(boolean var1, int var2, b.c var3, int var4) {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
   }

   public final void a(boolean var1, int var2, List var3) {
      synchronized(this){}

      Throwable var10000;
      label365: {
         int var6;
         long var7;
         boolean var10001;
         label357: {
            label356: {
               try {
                  if (!this.g) {
                     if (this.g) {
                        break label356;
                     }

                     this.b.a(var3);
                     var7 = this.f.b;
                     var6 = (int)Math.min((long)this.a, var7);
                     break label357;
                  }
               } catch (Throwable var40) {
                  var10000 = var40;
                  var10001 = false;
                  break label365;
               }

               try {
                  throw new IOException("closed");
               } catch (Throwable var39) {
                  var10000 = var39;
                  var10001 = false;
                  break label365;
               }
            }

            try {
               throw new IOException("closed");
            } catch (Throwable var38) {
               var10000 = var38;
               var10001 = false;
               break label365;
            }
         }

         long var9 = (long)var6;
         byte var4;
         if (var7 == var9) {
            var4 = 4;
         } else {
            var4 = 0;
         }

         byte var5 = var4;
         if (var1) {
            var5 = (byte)(var4 | 1);
         }

         try {
            this.a(var2, var6, (byte)1, var5);
            this.d.a_(this.f, var9);
         } catch (Throwable var37) {
            var10000 = var37;
            var10001 = false;
            break label365;
         }

         if (var7 > var9) {
            try {
               this.b(var2, var7 - var9);
            } catch (Throwable var36) {
               var10000 = var36;
               var10001 = false;
               break label365;
            }
         }

         return;
      }

      Throwable var41 = var10000;
      throw var41;
   }

   public final void blockBack2() {
      synchronized(this){}

      try {
         if (this.g) {
            throw new IOException("closed");
         }

         this.d.flush();
      } finally {
         ;
      }

   }

   public final void b(n var1) {
      synchronized(this){}

      Throwable var10000;
      label447: {
         int var3;
         boolean var10001;
         label442: {
            try {
               if (!this.g) {
                  var3 = Integer.bitCount(var1.a);
                  break label442;
               }
            } catch (Throwable var45) {
               var10000 = var45;
               var10001 = false;
               break label447;
            }

            try {
               throw new IOException("closed");
            } catch (Throwable var44) {
               var10000 = var44;
               var10001 = false;
               break label447;
            }
         }

         int var2 = 0;

         try {
            this.a(0, var3 * 6, (byte)4, (byte)0);
         } catch (Throwable var42) {
            var10000 = var42;
            var10001 = false;
            break label447;
         }

         while(true) {
            if (var2 >= 10) {
               try {
                  this.d.flush();
               } catch (Throwable var40) {
                  var10000 = var40;
                  var10001 = false;
                  break;
               }

               return;
            }

            label449: {
               try {
                  if (!var1.a(var2)) {
                     break label449;
                  }
               } catch (Throwable var43) {
                  var10000 = var43;
                  var10001 = false;
                  break;
               }

               if (var2 == 4) {
                  var3 = 3;
               } else if (var2 == 7) {
                  var3 = 4;
               } else {
                  var3 = var2;
               }

               try {
                  this.d.g(var3);
                  this.d.f(var1.b[var2]);
               } catch (Throwable var41) {
                  var10000 = var41;
                  var10001 = false;
                  break;
               }
            }

            ++var2;
         }
      }

      Throwable var46 = var10000;
      throw var46;
   }

   public final void close() {
      synchronized(this){}

      try {
         this.g = true;
         this.d.close();
      } finally {
         ;
      }

   }
}
