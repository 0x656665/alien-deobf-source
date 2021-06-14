package a;

import java.util.concurrent.TimeUnit;

public final class d {
   public static final d a;
   public static final d b;
   public final boolean c;
   public final boolean d;
   public final int e;
   public final boolean f;
   public final boolean g;
   public final boolean h;
   public final int i;
   public final int j;
   public final boolean k;
   String l;
   private final int m;
   private final boolean n;

   static {
      d.a var3 = new d.a();
      var3.a = true;
      a = var3.a();
      var3 = new d.a();
      var3.f = true;
      long var1 = TimeUnit.SECONDS.toSeconds(2147483647L);
      int var0;
      if (var1 > 2147483647L) {
         var0 = Integer.MAX_VALUE;
      } else {
         var0 = (int)var1;
      }

      var3.d = var0;
      b = var3.a();
   }

   d(d.a var1) {
      this.c = var1.a;
      this.d = var1.b;
      this.e = var1.c;
      this.m = -1;
      this.f = false;
      this.g = false;
      this.h = false;
      this.i = var1.d;
      this.j = var1.e;
      this.k = var1.f;
      this.n = var1.g;
   }

   private d(boolean var1, boolean var2, int var3, int var4, boolean var5, boolean var6, boolean var7, int var8, int var9, boolean var10, boolean var11, String var12) {
      this.c = var1;
      this.d = var2;
      this.e = var3;
      this.m = var4;
      this.f = var5;
      this.g = var6;
      this.h = var7;
      this.i = var8;
      this.j = var9;
      this.k = var10;
      this.n = var11;
      this.l = var12;
   }

   public static d a(q var0) {
      int var13 = var0.a.length / 2;
      int var7 = 0;
      boolean var2 = true;
      String var28 = null;
      boolean var20 = false;
      boolean var19 = false;
      int var6 = -1;
      int var5 = -1;
      boolean var18 = false;
      boolean var17 = false;
      boolean var16 = false;
      int var4 = -1;
      int var3 = -1;
      boolean var14 = false;

      boolean var15;
      boolean var27;
      for(var15 = false; var7 < var13; var15 = var27) {
         int var8;
         int var9;
         int var10;
         int var11;
         boolean var12;
         boolean var21;
         boolean var22;
         boolean var23;
         boolean var24;
         boolean var25;
         boolean var26;
         String var29;
         label99: {
            String var30;
            String var31;
            label92: {
               var31 = var0.a(var7);
               var30 = var0.b(var7);
               if (var31.equalsIgnoreCase("Cache-Control")) {
                  if (var28 == null) {
                     var28 = var30;
                     break label92;
                  }
               } else {
                  var12 = var2;
                  var29 = var28;
                  var21 = var20;
                  var22 = var19;
                  var8 = var6;
                  var9 = var5;
                  var23 = var18;
                  var24 = var17;
                  var25 = var16;
                  var10 = var4;
                  var11 = var3;
                  var26 = var14;
                  var27 = var15;
                  if (!var31.equalsIgnoreCase("Pragma")) {
                     break label99;
                  }
               }

               var2 = false;
            }

            int var1 = 0;

            label87:
            while(true) {
               while(true) {
                  var12 = var2;
                  var29 = var28;
                  var21 = var20;
                  var22 = var19;
                  var8 = var6;
                  var9 = var5;
                  var23 = var18;
                  var24 = var17;
                  var25 = var16;
                  var10 = var4;
                  var11 = var3;
                  var26 = var14;
                  var27 = var15;
                  if (var1 >= var30.length()) {
                     break label87;
                  }

                  var8 = a.a.c.e.a(var30, var1, "=,;");
                  var31 = var30.substring(var1, var8).trim();
                  if (var8 != var30.length() && var30.charAt(var8) != ',' && var30.charAt(var8) != ';') {
                     var8 = a.a.c.e.a(var30, var8 + 1);
                     if (var8 < var30.length() && var30.charAt(var8) == '"') {
                        var1 = var8 + 1;
                        var8 = a.a.c.e.a(var30, var1, "\"");
                        var29 = var30.substring(var1, var8);
                        var1 = var8 + 1;
                     } else {
                        var1 = a.a.c.e.a(var30, var8, ",;");
                        var29 = var30.substring(var8, var1).trim();
                     }
                  } else {
                     var1 = var8 + 1;
                     var29 = null;
                  }

                  if ("no-cache".equalsIgnoreCase(var31)) {
                     var20 = true;
                  } else if ("no-store".equalsIgnoreCase(var31)) {
                     var19 = true;
                  } else {
                     if ("max-age".equalsIgnoreCase(var31)) {
                        var8 = a.a.c.e.b(var29, -1);
                        var11 = var3;
                        var10 = var4;
                        var9 = var5;
                     } else if ("s-maxage".equalsIgnoreCase(var31)) {
                        var9 = a.a.c.e.b(var29, -1);
                        var8 = var6;
                        var10 = var4;
                        var11 = var3;
                     } else {
                        if ("private".equalsIgnoreCase(var31)) {
                           var18 = true;
                           continue;
                        }

                        if ("public".equalsIgnoreCase(var31)) {
                           var17 = true;
                           continue;
                        }

                        if ("must-revalidate".equalsIgnoreCase(var31)) {
                           var16 = true;
                           continue;
                        }

                        if ("max-stale".equalsIgnoreCase(var31)) {
                           var10 = a.a.c.e.b(var29, Integer.MAX_VALUE);
                           var8 = var6;
                           var9 = var5;
                           var11 = var3;
                        } else if ("min-fresh".equalsIgnoreCase(var31)) {
                           var11 = a.a.c.e.b(var29, -1);
                           var8 = var6;
                           var9 = var5;
                           var10 = var4;
                        } else {
                           if ("only-if-cached".equalsIgnoreCase(var31)) {
                              var14 = true;
                              continue;
                           }

                           var8 = var6;
                           var9 = var5;
                           var10 = var4;
                           var11 = var3;
                           if ("no-transform".equalsIgnoreCase(var31)) {
                              var15 = true;
                              var8 = var6;
                              var9 = var5;
                              var10 = var4;
                              var11 = var3;
                           }
                        }
                     }

                     var6 = var8;
                     var5 = var9;
                     var4 = var10;
                     var3 = var11;
                  }
               }
            }
         }

         ++var7;
         var2 = var12;
         var28 = var29;
         var20 = var21;
         var19 = var22;
         var6 = var8;
         var5 = var9;
         var18 = var23;
         var17 = var24;
         var16 = var25;
         var4 = var10;
         var3 = var11;
         var14 = var26;
      }

      if (!var2) {
         var28 = null;
      }

      return new d(var20, var19, var6, var5, var18, var17, var16, var4, var3, var14, var15, var28);
   }

   public final String toString() {
      String var1 = this.l;
      if (var1 != null) {
         return var1;
      } else {
         StringBuilder var2 = new StringBuilder();
         if (this.c) {
            var2.append("no-cache, ");
         }

         if (this.d) {
            var2.append("no-store, ");
         }

         if (this.e != -1) {
            var2.append("max-age=");
            var2.append(this.e);
            var2.append(", ");
         }

         if (this.m != -1) {
            var2.append("s-maxage=");
            var2.append(this.m);
            var2.append(", ");
         }

         if (this.f) {
            var2.append("private, ");
         }

         if (this.g) {
            var2.append("public, ");
         }

         if (this.h) {
            var2.append("must-revalidate, ");
         }

         if (this.i != -1) {
            var2.append("max-stale=");
            var2.append(this.i);
            var2.append(", ");
         }

         if (this.j != -1) {
            var2.append("min-fresh=");
            var2.append(this.j);
            var2.append(", ");
         }

         if (this.k) {
            var2.append("only-if-cached, ");
         }

         if (this.n) {
            var2.append("no-transform, ");
         }

         if (var2.length() == 0) {
            var1 = "";
         } else {
            var2.delete(var2.length() - 2, var2.length());
            var1 = var2.toString();
         }

         this.l = var1;
         return var1;
      }
   }

   public static final class a {
      boolean a;
      boolean b;
      int c = -1;
      int d = -1;
      int e = -1;
      boolean f;
      boolean g;

      public final d a() {
         return new d(this);
      }
   }
}
