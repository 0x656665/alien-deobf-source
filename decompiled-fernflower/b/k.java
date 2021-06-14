package b;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class k {
   static final Logger a = Logger.getLogger(k.class.getName());

   private k() {
   }

   public static d a(q var0) {
      return new l(var0);
   }

   public static e a(r var0) {
      return new m(var0);
   }

   public static q a(Socket var0) {
      if (var0 != null) {
         final a var1 = c(var0);
         final OutputStream var2 = var0.getOutputStream();
         if (var2 != null) {
            return new q(new q() {
               public final s a() {
                  return var1;
               }

               public final void a_(c var1x, long var2x) {
                  t.a(var1x.b, 0L, var2x);

                  while(var2x > 0L) {
                     var1.f_();
                     n var9 = var1x.a;
                     int var4 = (int)Math.min(var2x, (long)(var9.c - var9.b));
                     var2.write(var9.a, var9.b, var4);
                     var9.b += var4;
                     long var7 = (long)var4;
                     long var5 = var2x - var7;
                     var1x.b -= var7;
                     var2x = var5;
                     if (var9.b == var9.c) {
                        var1x.a = var9.a();
                        o.a(var9);
                        var2x = var5;
                     }
                  }

               }

               public final void close() {
                  var2.close();
               }

               public final void flush() {
                  var2.flush();
               }

               public final String toString() {
                  StringBuilder var1x = new StringBuilder("sink(");
                  var1x.append(var2);
                  var1x.append(")");
                  return var1x.toString();
               }
            }) {
               // $FF: synthetic field
               final q a;
               // $FF: synthetic field
               final a b;

               {
                  this.b = var1;
                  this.a = var2;
               }

               public final s a() {
                  return this.b;
               }

               public final void a_(c var1, long var2) {
                  t.a(var1.b, 0L, var2);

                  while(true) {
                     long var4 = 0L;
                     if (var2 <= 0L) {
                        return;
                     }

                     long var6;
                     while(true) {
                        var6 = var4;
                        if (var4 >= 65536L) {
                           break;
                        }

                        var6 = var4 + (long)(var1.a.c - var1.a.b);
                        var4 = var6;
                        if (var6 >= var2) {
                           var6 = var2;
                           break;
                        }
                     }

                     this.b.a_();
                     boolean var10 = false;

                     try {
                        var10 = true;
                        this.a.a_(var1, var6);
                        var10 = false;
                     } catch (IOException var11) {
                        throw this.b.b(var11);
                     } finally {
                        if (var10) {
                           this.b.a(false);
                        }
                     }

                     var2 -= var6;
                     this.b.a(true);
                  }
               }

               public final void close() {
                  this.b.a_();
                  boolean var4 = false;

                  try {
                     var4 = true;
                     this.a.close();
                     var4 = false;
                  } catch (IOException var5) {
                     throw this.b.b(var5);
                  } finally {
                     if (var4) {
                        this.b.a(false);
                     }
                  }

                  this.b.a(true);
               }

               public final void flush() {
                  this.b.a_();
                  boolean var4 = false;

                  try {
                     var4 = true;
                     this.a.flush();
                     var4 = false;
                  } catch (IOException var5) {
                     throw this.b.b(var5);
                  } finally {
                     if (var4) {
                        this.b.a(false);
                     }
                  }

                  this.b.a(true);
               }

               public final String toString() {
                  StringBuilder var1 = new StringBuilder("AsyncTimeout.sink(");
                  var1.append(this.a);
                  var1.append(")");
                  return var1.toString();
               }
            };
         } else {
            throw new IllegalArgumentException("out == null");
         }
      } else {
         throw new IllegalArgumentException("socket == null");
      }
   }

   static boolean a(AssertionError var0) {
      return var0.getCause() != null && var0.getMessage() != null && var0.getMessage().contains("getsockname failed");
   }

   public static r b(Socket var0) {
      if (var0 != null) {
         final a var1 = c(var0);
         final InputStream var2 = var0.getInputStream();
         if (var2 != null) {
            return new r(new r() {
               public final long a(c var1x, long var2x) {
                  if (var2x < 0L) {
                     throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(var2x)));
                  } else if (var2x == 0L) {
                     return 0L;
                  } else {
                     AssertionError var10000;
                     label45: {
                        boolean var10001;
                        int var4;
                        n var7;
                        try {
                           var1.f_();
                           var7 = var1x.e(1);
                           var4 = (int)Math.min(var2x, (long)(8192 - var7.c));
                           var4 = var2.read(var7.a, var7.c, var4);
                        } catch (AssertionError var10) {
                           var10000 = var10;
                           var10001 = false;
                           break label45;
                        }

                        if (var4 == -1) {
                           return -1L;
                        }

                        try {
                           var7.c += var4;
                           var2x = var1x.b;
                        } catch (AssertionError var9) {
                           var10000 = var9;
                           var10001 = false;
                           break label45;
                        }

                        long var5 = (long)var4;

                        try {
                           var1x.b = var2x + var5;
                           return var5;
                        } catch (AssertionError var8) {
                           var10000 = var8;
                           var10001 = false;
                        }
                     }

                     AssertionError var11 = var10000;
                     if (k.a(var11)) {
                        throw new IOException(var11);
                     } else {
                        throw var11;
                     }
                  }
               }

               public final s a() {
                  return var1;
               }

               public final void close() {
                  var2.close();
               }

               public final String toString() {
                  StringBuilder var1x = new StringBuilder("source(");
                  var1x.append(var2);
                  var1x.append(")");
                  return var1x.toString();
               }
            }) {
               // $FF: synthetic field
               final r a;
               // $FF: synthetic field
               final a b;

               {
                  this.b = var1;
                  this.a = var2;
               }

               public final long a(c var1, long var2) {
                  this.b.a_();
                  boolean var6 = false;

                  try {
                     var6 = true;
                     var2 = this.a.a(var1, var2);
                     var6 = false;
                  } catch (IOException var7) {
                     throw this.b.b(var7);
                  } finally {
                     if (var6) {
                        this.b.a(false);
                     }
                  }

                  this.b.a(true);
                  return var2;
               }

               public final s a() {
                  return this.b;
               }

               public final void close() {
                  boolean var4 = false;

                  try {
                     var4 = true;
                     this.a.close();
                     var4 = false;
                  } catch (IOException var5) {
                     throw this.b.b(var5);
                  } finally {
                     if (var4) {
                        this.b.a(false);
                     }
                  }

                  this.b.a(true);
               }

               public final String toString() {
                  StringBuilder var1 = new StringBuilder("AsyncTimeout.source(");
                  var1.append(this.a);
                  var1.append(")");
                  return var1.toString();
               }
            };
         } else {
            throw new IllegalArgumentException("in == null");
         }
      } else {
         throw new IllegalArgumentException("socket == null");
      }
   }

   private static a c(final Socket var0) {
      return new a() {
         protected final IOException a(IOException var1) {
            SocketTimeoutException var2 = new SocketTimeoutException("timeout");
            if (var1 != null) {
               var2.initCause(var1);
            }

            return var2;
         }

         protected final void a() {
            Logger var2;
            Level var3;
            StringBuilder var4;
            try {
               var0.close();
            } catch (Exception var5) {
               var2 = k.a;
               var3 = Level.WARNING;
               var4 = new StringBuilder("Failed to close timed out socket ");
               var4.append(var0);
               var2.log(var3, var4.toString(), var5);
            } catch (AssertionError var6) {
               if (k.a(var6)) {
                  var2 = k.a;
                  var3 = Level.WARNING;
                  var4 = new StringBuilder("Failed to close timed out socket ");
                  var4.append(var0);
                  var2.log(var3, var4.toString(), var6);
               } else {
                  throw var6;
               }
            }
         }
      };
   }
}
