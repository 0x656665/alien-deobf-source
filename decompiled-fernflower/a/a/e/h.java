package a.a.e;

import b.r;
import b.s;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class h implements Closeable {
   static final Logger a = Logger.getLogger(e.class.getName());
   final b.e b;
   final boolean c;
   final d.a d;
   private final h.a e;

   public h(b.e var1, boolean var2) {
      this.b = var1;
      this.c = var2;
      this.e = new h.a(this.b);
      this.d = new d.a(this.e);
   }

   private static int a(int var0, byte var1, short var2) {
      int var3 = var0;
      if ((var1 & 8) != 0) {
         var3 = var0 - 1;
      }

      if (var2 <= var3) {
         return (short)(var3 - var2);
      } else {
         throw a.a.e.e.b("PROTOCOL_ERROR padding %s > remaining length %s", var2, var3);
      }
   }

   static int a(b.e var0) {
      byte var1 = var0.e();
      byte var2 = var0.e();
      return var0.e() & 255 | (var1 & 255) << 16 | (var2 & 255) << 8;
   }

   private List a(int var1, short var2, byte var3, int var4) {
      h.a var5 = this.e;
      this.e.d = var1;
      var5.a = var1;
      this.e.e = var2;
      this.e.b = var3;
      this.e.c = var4;
      this.d.a();
      return this.d.b();
   }

   private void blockBack() {
      this.b.g();
      this.b.e();
   }

   public final boolean a(boolean var1, h.b var2) {
      short var5 = 0;
      byte var6 = 0;
      byte var7 = 0;
      boolean var13 = false;

      try {
         this.b.a(9L);
      } catch (IOException var17) {
         return false;
      }

      int var10 = a(this.b);
      if (var10 >= 0 && var10 <= 16384) {
         byte var3 = (byte)(this.b.e() & 255);
         if (var1 && var3 != 4) {
            throw a.a.e.e.b("Expected a SETTINGS frame but was %s", var3);
         } else {
            byte var4 = (byte)(this.b.e() & 255);
            int var9 = this.b.g() & Integer.MAX_VALUE;
            if (a.isLoggable(Level.FINE)) {
               a.fine(a.a.e.e.a(true, var9, var10, var3, var4));
            }

            int var8;
            switch(var3) {
            case 0:
               if ((var4 & 1) != 0) {
                  var1 = true;
               } else {
                  var1 = false;
               }

               boolean var19;
               if ((var4 & 32) != 0) {
                  var19 = true;
               } else {
                  var19 = false;
               }

               if (!var19) {
                  var5 = var7;
                  if ((var4 & 8) != 0) {
                     var5 = (short)(this.b.e() & 255);
                  }

                  var8 = a(var10, var4, var5);
                  var2.a(var1, var9, this.b, var8);
                  this.b.f((long)var5);
                  return true;
               }

               throw a.a.e.e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            case 1:
               if (var9 != 0) {
                  if ((var4 & 1) != 0) {
                     var1 = true;
                  } else {
                     var1 = false;
                  }

                  var5 = var6;
                  if ((var4 & 8) != 0) {
                     var5 = (short)(this.b.e() & 255);
                  }

                  var8 = var10;
                  if ((var4 & 32) != 0) {
                     this.blockBack();
                     var8 = var10 - 5;
                  }

                  var2.a(var1, var9, this.a(a(var8, var4, var5), var5, var4, var9));
                  return true;
               }

               throw a.a.e.e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            case 2:
               if (var10 == 5) {
                  if (var9 != 0) {
                     this.blockBack();
                     return true;
                  }

                  throw a.a.e.e.b("TYPE_PRIORITY streamId == 0");
               }

               throw a.a.e.e.b("TYPE_PRIORITY length: %d != 5", var10);
            case 3:
               if (var10 == 4) {
                  if (var9 != 0) {
                     var8 = this.b.g();
                     a.a.e.b var21 = a.a.e.b.a(var8);
                     if (var21 != null) {
                        var2.a(var9, var21);
                        return true;
                     }

                     throw a.a.e.e.b("TYPE_RST_STREAM unexpected error code: %d", var8);
                  }

                  throw a.a.e.e.b("TYPE_RST_STREAM streamId == 0");
               }

               throw a.a.e.e.b("TYPE_RST_STREAM length: %d != 4", var10);
            case 4:
               if (var9 != 0) {
                  throw a.a.e.e.b("TYPE_SETTINGS streamId != 0");
               } else if ((var4 & 1) != 0) {
                  if (var10 == 0) {
                     return true;
                  }

                  throw a.a.e.e.b("FRAME_SIZE_ERROR ack frame should be empty!");
               } else if (var10 % 6 != 0) {
                  throw a.a.e.e.b("TYPE_SETTINGS length %% 6 != 0: %s", var10);
               } else {
                  n var20 = new n();

                  for(var9 = 0; var9 < var10; var9 += 6) {
                     short var11 = this.b.f();
                     int var12 = this.b.g();
                     short var18 = var11;
                     switch(var11) {
                     case 1:
                        break;
                     case 2:
                        var18 = var11;
                        if (var12 != 0) {
                           if (var12 != 1) {
                              throw a.a.e.e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                           }

                           var18 = var11;
                        }
                        break;
                     case 3:
                        var18 = 4;
                        break;
                     case 4:
                        var18 = 7;
                        if (var12 < 0) {
                           throw a.a.e.e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        break;
                     case 5:
                        if (var12 < 16384 || var12 > 16777215) {
                           throw a.a.e.e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", var12);
                        }

                        var18 = var11;
                        break;
                     default:
                        var18 = var11;
                     }

                     var20.a(var18, var12);
                  }

                  var2.a(var20);
                  return true;
               }
            case 5:
               if (var9 != 0) {
                  if ((var4 & 8) != 0) {
                     var5 = (short)(this.b.e() & 255);
                  }

                  var2.a(this.b.g() & Integer.MAX_VALUE, this.a(a(var10 - 4, var4, var5), var5, var4, var9));
                  return true;
               }

               throw a.a.e.e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            case 6:
               if (var10 == 8) {
                  if (var9 == 0) {
                     var8 = this.b.g();
                     var9 = this.b.g();
                     var1 = var13;
                     if ((var4 & 1) != 0) {
                        var1 = true;
                     }

                     var2.a(var1, var8, var9);
                     return true;
                  }

                  throw a.a.e.e.b("TYPE_PING streamId != 0");
               }

               throw a.a.e.e.b("TYPE_PING length != 8: %s", var10);
            case 7:
               if (var10 >= 8) {
                  if (var9 == 0) {
                     var8 = this.b.g();
                     var9 = this.b.g();
                     var10 -= 8;
                     if (a.a.e.b.a(var9) != null) {
                        b.f var16 = b.f.b;
                        if (var10 > 0) {
                           this.b.c((long)var10);
                        }

                        var2.a(var8);
                        return true;
                     }

                     throw a.a.e.e.b("TYPE_GOAWAY unexpected error code: %d", var9);
                  }

                  throw a.a.e.e.b("TYPE_GOAWAY streamId != 0");
               }

               throw a.a.e.e.b("TYPE_GOAWAY length < 8: %s", var10);
            case 8:
               if (var10 == 4) {
                  long var14 = (long)this.b.g() & 2147483647L;
                  if (var14 != 0L) {
                     var2.a(var9, var14);
                     return true;
                  }

                  throw a.a.e.e.b("windowSizeIncrement was 0", var14);
               }

               throw a.a.e.e.b("TYPE_WINDOW_UPDATE length !=4: %s", var10);
            default:
               this.b.f((long)var10);
               return true;
            }
         }
      } else {
         throw a.a.e.e.b("FRAME_SIZE_ERROR: %s", var10);
      }
   }

   public final void close() {
      this.b.close();
   }

   static final class a implements r {
      int a;
      byte b;
      int c;
      int d;
      short e;
      private final b.e f;

      public a(b.e var1) {
         this.f = var1;
      }

      public final long a(b.c var1, long var2) {
         while(true) {
            if (this.d == 0) {
               this.f.f((long)this.e);
               this.e = 0;
               if ((this.b & 4) != 0) {
                  return -1L;
               }

               int var5 = this.c;
               int var6 = h.a(this.f);
               this.d = var6;
               this.a = var6;
               byte var4 = (byte)(this.f.e() & 255);
               this.b = (byte)(this.f.e() & 255);
               if (h.a.isLoggable(Level.FINE)) {
                  h.a.fine(a.a.e.e.a(true, this.c, this.a, var4, this.b));
               }

               this.c = this.f.g() & Integer.MAX_VALUE;
               if (var4 == 9) {
                  if (this.c == var5) {
                     continue;
                  }

                  throw a.a.e.e.b("TYPE_CONTINUATION streamId changed");
               }

               throw a.a.e.e.b("%s != TYPE_CONTINUATION", var4);
            }

            var2 = this.f.a(var1, Math.min(var2, (long)this.d));
            if (var2 == -1L) {
               return -1L;
            }

            this.d = (int)((long)this.d - var2);
            return var2;
         }
      }

      public final s a() {
         return this.f.a();
      }

      public final void close() {
      }
   }

   interface b {
      void a(int var1);

      void a(int var1, long var2);

      void a(int var1, a.a.e.b var2);

      void a(int var1, List var2);

      void a(n var1);

      void a(boolean var1, int var2, int var3);

      void a(boolean var1, int var2, b.e var3, int var4);

      void a(boolean var1, int var2, List var3);
   }
}
