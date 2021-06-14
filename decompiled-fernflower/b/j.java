package b;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class j implements r {
   private final e a;
   private final Inflater b;
   private int c;
   private boolean d;

   j(e var1, Inflater var2) {
      if (var1 != null) {
         if (var2 != null) {
            this.a = var1;
            this.b = var2;
         } else {
            throw new IllegalArgumentException("inflater == null");
         }
      } else {
         throw new IllegalArgumentException("source == null");
      }
   }

   private void blockBack2() {
      if (this.c != 0) {
         int var1 = this.c - this.b.getRemaining();
         this.c -= var1;
         this.a.f((long)var1);
      }
   }

   public final long a(c var1, long var2) {
      if (var2 < 0L) {
         throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(var2)));
      } else if (this.d) {
         throw new IllegalStateException("closed");
      } else if (var2 == 0L) {
         return 0L;
      } else {
         while(true) {
            boolean var8 = this.b.needsInput();
            boolean var4 = false;
            n var9;
            if (var8) {
               this.blockBack2();
               if (this.b.getRemaining() != 0) {
                  throw new IllegalStateException("?");
               }

               if (this.a.c()) {
                  var4 = true;
               } else {
                  var9 = this.a.b().a;
                  this.c = var9.c - var9.b;
                  this.b.setInput(var9.a, var9.b, this.c);
               }
            }

            DataFormatException var10000;
            label86: {
               int var5;
               boolean var10001;
               try {
                  var9 = var1.e(1);
                  var5 = this.b.inflate(var9.a, var9.c, 8192 - var9.c);
               } catch (DataFormatException var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label86;
               }

               if (var5 > 0) {
                  label94: {
                     try {
                        var9.c += var5;
                        var2 = var1.b;
                     } catch (DataFormatException var11) {
                        var10000 = var11;
                        var10001 = false;
                        break label94;
                     }

                     long var6 = (long)var5;

                     try {
                        var1.b = var2 + var6;
                        return var6;
                     } catch (DataFormatException var10) {
                        var10000 = var10;
                        var10001 = false;
                     }
                  }
               } else {
                  label95: {
                     label96: {
                        try {
                           if (!this.b.finished() && !this.b.needsDictionary()) {
                              break label96;
                           }
                        } catch (DataFormatException var14) {
                           var10000 = var14;
                           var10001 = false;
                           break label95;
                        }

                        try {
                           this.blockBack2();
                           if (var9.b == var9.c) {
                              var1.a = var9.a();
                              o.a(var9);
                           }

                           return -1L;
                        } catch (DataFormatException var13) {
                           var10000 = var13;
                           var10001 = false;
                           break label95;
                        }
                     }

                     if (!var4) {
                        continue;
                     }

                     try {
                        throw new EOFException("source exhausted prematurely");
                     } catch (DataFormatException var12) {
                        var10000 = var12;
                        var10001 = false;
                     }
                  }
               }
            }

            DataFormatException var16 = var10000;
            throw new IOException(var16);
         }
      }
   }

   public final s a() {
      return this.a.a();
   }

   public final void close() {
      if (!this.d) {
         this.b.end();
         this.d = true;
         this.a.close();
      }
   }
}
