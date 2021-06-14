package b;

final class l implements d {
   public final c a = new c();
   public final q b;
   boolean c;

   l(q var1) {
      if (var1 != null) {
         this.b = var1;
      } else {
         throw new NullPointerException("sink == null");
      }
   }

   public final s a() {
      return this.b.a();
   }

   public final void a_(c var1, long var2) {
      if (!this.c) {
         this.a.a_(var1, var2);
         this.q();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   public final c b() {
      return this.a;
   }

   public final d b(String var1) {
      if (!this.c) {
         this.a.a(var1);
         return this.q();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   public final d b(byte[] var1) {
      if (!this.c) {
         this.a.a(var1);
         return this.q();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   public final d b(byte[] var1, int var2, int var3) {
      if (!this.c) {
         this.a.a(var1, var2, var3);
         return this.q();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   public final void close() {
      if (!this.c) {
         Throwable var2 = null;
         Throwable var1 = var2;

         label34: {
            try {
               if (this.a.b <= 0L) {
                  break label34;
               }

               this.b.a_(this.a, this.a.b);
            } catch (Throwable var5) {
               var1 = var5;
               break label34;
            }

            var1 = var2;
         }

         label28: {
            try {
               this.b.close();
            } catch (Throwable var4) {
               var2 = var1;
               if (var1 == null) {
                  var2 = var4;
               }
               break label28;
            }

            var2 = var1;
         }

         this.c = true;
         if (var2 != null) {
            t.a(var2);
         }

      }
   }

   public final d f(int var1) {
      if (!this.c) {
         this.a.d(var1);
         return this.q();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   public final void flush() {
      if (!this.c) {
         if (this.a.b > 0L) {
            this.b.a_(this.a, this.a.b);
         }

         this.b.flush();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   public final d g(int var1) {
      if (!this.c) {
         this.a.c(var1);
         return this.q();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   public final d h(int var1) {
      if (!this.c) {
         this.a.b(var1);
         return this.q();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   public final d i(long var1) {
      if (!this.c) {
         this.a.h(var1);
         return this.q();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   public final d j(long var1) {
      if (!this.c) {
         this.a.g(var1);
         return this.q();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   public final d q() {
      if (!this.c) {
         long var1 = this.a.d();
         if (var1 > 0L) {
            this.b.a_(this.a, var1);
         }

         return this;
      } else {
         throw new IllegalStateException("closed");
      }
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("buffer(");
      var1.append(this.b);
      var1.append(")");
      return var1.toString();
   }
}
