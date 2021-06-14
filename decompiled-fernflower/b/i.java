package b;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class i implements r {
   private int a = 0;
   private final e b;
   private final Inflater c;
   private final j d;
   private final CRC32 e = new CRC32();

   public i(r var1) {
      if (var1 != null) {
         this.c = new Inflater(true);
         this.b = k.a(var1);
         this.d = new j(this.b, this.c);
      } else {
         throw new IllegalArgumentException("source == null");
      }
   }

   private void a(c var1, long var2, long var4) {
      n var8;
      for(var8 = var1.a; var2 >= (long)(var8.c - var8.b); var8 = var8.f) {
         var2 -= (long)(var8.c - var8.b);
      }

      while(var4 > 0L) {
         int var6 = (int)((long)var8.b + var2);
         int var7 = (int)Math.min((long)(var8.c - var6), var4);
         this.e.update(var8.a, var6, var7);
         var4 -= (long)var7;
         var8 = var8.f;
         var2 = 0L;
      }

   }

   private static void a(String var0, int var1, int var2) {
      if (var2 != var1) {
         throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", var0, var2, var1));
      }
   }

   public final long a(c var1, long var2) {
      if (var2 >= 0L) {
         if (var2 == 0L) {
            return 0L;
         } else {
            long var7;
            if (this.a == 0) {
               this.b.a(10L);
               byte var5 = this.b.b().b(3L);
               boolean var4;
               if ((var5 >> 1 & 1) == 1) {
                  var4 = true;
               } else {
                  var4 = false;
               }

               if (var4) {
                  this.a(this.b.b(), 0L, 10L);
               }

               a("ID1ID2", 8075, this.b.f());
               this.b.f(8L);
               if ((var5 >> 2 & 1) == 1) {
                  this.b.a(2L);
                  if (var4) {
                     this.a(this.b.b(), 0L, 2L);
                  }

                  short var6 = this.b.b().h();
                  e var9 = this.b;
                  var7 = (long)var6;
                  var9.a(var7);
                  if (var4) {
                     this.a(this.b.b(), 0L, var7);
                  }

                  this.b.f(var7);
               }

               if ((var5 >> 3 & 1) == 1) {
                  var7 = this.b.p();
                  if (var7 == -1L) {
                     throw new EOFException();
                  }

                  if (var4) {
                     this.a(this.b.b(), 0L, var7 + 1L);
                  }

                  this.b.f(var7 + 1L);
               }

               if ((var5 >> 4 & 1) == 1) {
                  var7 = this.b.p();
                  if (var7 == -1L) {
                     throw new EOFException();
                  }

                  if (var4) {
                     this.a(this.b.b(), 0L, var7 + 1L);
                  }

                  this.b.f(var7 + 1L);
               }

               if (var4) {
                  a("FHCRC", this.b.h(), (short)((int)this.e.getValue()));
                  this.e.reset();
               }

               this.a = 1;
            }

            if (this.a == 1) {
               var7 = var1.b;
               var2 = this.d.a(var1, var2);
               if (var2 != -1L) {
                  this.a(var1, var7, var2);
                  return var2;
               }

               this.a = 2;
            }

            if (this.a == 2) {
               a("CRC", this.b.i(), (int)this.e.getValue());
               a("ISIZE", this.b.i(), (int)this.c.getBytesWritten());
               this.a = 3;
               if (this.b.c()) {
                  return -1L;
               } else {
                  throw new IOException("gzip finished without exhausting source");
               }
            } else {
               return -1L;
            }
         }
      } else {
         throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(var2)));
      }
   }

   public final s a() {
      return this.b.a();
   }

   public final void close() {
      this.d.close();
   }
}
