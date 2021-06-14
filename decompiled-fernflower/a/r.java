package a;

import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class r {
   private static final char[] e = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   public final String a;
   public final String b;
   public final int c;
   public final List d;
   private final String f;
   private final String g;
   private final List h;
   private final String i;
   private final String j;

   r(r.a var1) {
      this.a = var1.a;
      this.f = a(var1.b, false);
      this.g = a(var1.c, false);
      this.b = var1.d;
      this.c = var1.a();
      this.h = a(var1.f, false);
      List var2 = var1.g;
      Object var3 = null;
      if (var2 != null) {
         var2 = a(var1.g, true);
      } else {
         var2 = null;
      }

      this.d = var2;
      String var4 = (String)var3;
      if (var1.h != null) {
         var4 = a(var1.h, false);
      }

      this.i = var4;
      this.j = var1.toString();
   }

   static int a(char var0) {
      if (var0 >= '0' && var0 <= '9') {
         return var0 - 48;
      } else if (var0 >= 'a' && var0 <= 'f') {
         return var0 - 97 + 10;
      } else {
         return var0 >= 'A' && var0 <= 'F' ? var0 - 65 + 10 : -1;
      }
   }

   public static int a(String var0) {
      if (var0.equals("http")) {
         return 80;
      } else {
         return var0.equals("https") ? 443 : -1;
      }
   }

   static String a(String var0, int var1, int var2, String var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      int var9;
      for(int var8 = var1; var8 < var2; var8 += Character.charCount(var9)) {
         var9 = var0.codePointAt(var8);
         if (var9 < 32 || var9 == 127 || var9 >= 128 && var7 || var3.indexOf(var9) != -1 || var9 == 37 && (!var4 || var5 && !a(var0, var8, var2)) || var9 == 43 && var6) {
            b.c var12 = new b.c();
            var12.a(var0, var1, var8);

            for(b.c var10 = null; var8 < var2; var8 += Character.charCount(var1)) {
               var1 = var0.codePointAt(var8);
               if (!var4 || var1 != 9 && var1 != 10 && var1 != 12 && var1 != 13) {
                  if (var1 == 43 && var6) {
                     String var13;
                     if (var4) {
                        var13 = "+";
                     } else {
                        var13 = "%2B";
                     }

                     var12.a(var13);
                  } else if (var1 < 32 || var1 == 127 || var1 >= 128 && var7 || var3.indexOf(var1) != -1 || var1 == 37 && (!var4 || var5 && !a(var0, var8, var2))) {
                     b.c var11 = var10;
                     if (var10 == null) {
                        var11 = new b.c();
                     }

                     var11.a(var1);

                     while(true) {
                        var10 = var11;
                        if (var11.c()) {
                           break;
                        }

                        var9 = var11.e() & 255;
                        var12.b(37);
                        var12.b(e[var9 >> 4 & 15]);
                        var12.b(e[var9 & 15]);
                     }
                  } else {
                     var12.a(var1);
                  }
               }
            }

            return var12.l();
         }
      }

      return var0.substring(var1, var2);
   }

   static String a(String var0, int var1, int var2, boolean var3) {
      for(int var4 = var1; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 == '%' || var5 == '+' && var3) {
            b.c var6 = new b.c();
            var6.a(var0, var1, var4);
            a(var6, var0, var4, var2, var3);
            return var6.l();
         }
      }

      return var0.substring(var1, var2);
   }

   static String a(String var0, String var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      return a(var0, 0, var0.length(), var1, var2, var3, var4, var5);
   }

   private static String a(String var0, boolean var1) {
      return a(var0, 0, var0.length(), var1);
   }

   private static List a(List var0, boolean var1) {
      int var3 = var0.size();
      ArrayList var5 = new ArrayList(var3);

      for(int var2 = 0; var2 < var3; ++var2) {
         String var4 = (String)var0.get(var2);
         if (var4 != null) {
            var4 = a(var4, var1);
         } else {
            var4 = null;
         }

         var5.add(var4);
      }

      return Collections.unmodifiableList(var5);
   }

   private static void a(b.c var0, String var1, int var2, int var3, boolean var4) {
      int var6;
      for(; var2 < var3; var2 += Character.charCount(var6)) {
         label25: {
            var6 = var1.codePointAt(var2);
            if (var6 == 37) {
               int var5 = var2 + 2;
               if (var5 < var3) {
                  int var7 = a(var1.charAt(var2 + 1));
                  int var8 = a(var1.charAt(var5));
                  if (var7 != -1 && var8 != -1) {
                     var0.b((var7 << 4) + var8);
                     var2 = var5;
                     continue;
                  }
                  break label25;
               }
            }

            if (var6 == 43 && var4) {
               var0.b(32);
               continue;
            }
         }

         var0.a(var6);
      }

   }

   static void a(StringBuilder var0, List var1) {
      int var3 = var1.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         var0.append('/');
         var0.append((String)var1.get(var2));
      }

   }

   private static boolean a(String var0, int var1, int var2) {
      int var3 = var1 + 2;
      return var3 < var2 && var0.charAt(var1) == '%' && a(var0.charAt(var1 + 1)) != -1 && a(var0.charAt(var3)) != -1;
   }

   static List b(String var0) {
      ArrayList var4 = new ArrayList();

      int var2;
      for(int var1 = 0; var1 <= var0.length(); var1 = var2 + 1) {
         int var3 = var0.indexOf(38, var1);
         var2 = var3;
         if (var3 == -1) {
            var2 = var0.length();
         }

         var3 = var0.indexOf(61, var1);
         if (var3 != -1 && var3 <= var2) {
            var4.add(var0.substring(var1, var3));
            var4.add(var0.substring(var3 + 1, var2));
         } else {
            var4.add(var0.substring(var1, var2));
            var4.add((Object)null);
         }
      }

      return var4;
   }

   public static void b(StringBuilder var0, List var1) {
      int var3 = var1.size();

      for(int var2 = 0; var2 < var3; var2 += 2) {
         String var4 = (String)var1.get(var2);
         String var5 = (String)var1.get(var2 + 1);
         if (var2 > 0) {
            var0.append('&');
         }

         var0.append(var4);
         if (var5 != null) {
            var0.append('=');
            var0.append(var5);
         }
      }

   }

   public static r d(String var0) {
      r.a var1 = new r.a();
      return var1.a((r)null, var0) == r.a.a.a ? var1.b() : null;
   }

   public final URI a() {
      r.a var5 = new r.a();
      var5.a = this.a;
      var5.b = this.c();
      var5.c = this.d();
      var5.d = this.b;
      int var1;
      if (this.c != a(this.a)) {
         var1 = this.c;
      } else {
         var1 = -1;
      }

      var5.e = var1;
      var5.f.clear();
      var5.f.addAll(this.f());
      var5.a(this.g());
      String var4;
      if (this.i == null) {
         var4 = null;
      } else {
         var1 = this.j.indexOf(35);
         var4 = this.j.substring(var1 + 1);
      }

      var5.h = var4;
      int var3 = var5.f.size();
      byte var2 = 0;

      for(var1 = 0; var1 < var3; ++var1) {
         var4 = (String)var5.f.get(var1);
         var5.f.set(var1, a(var4, "[]", true, true, false, true));
      }

      if (var5.g != null) {
         var3 = var5.g.size();

         for(var1 = var2; var1 < var3; ++var1) {
            var4 = (String)var5.g.get(var1);
            if (var4 != null) {
               var5.g.set(var1, a(var4, "\\^`{|}", true, true, true, true));
            }
         }
      }

      if (var5.h != null) {
         var5.h = a(var5.h, " \"#<>\\^`{|}", true, true, false, false);
      }

      String var8 = var5.toString();

      try {
         URI var9 = new URI(var8);
         return var9;
      } catch (URISyntaxException var7) {
         try {
            URI var10 = URI.create(var8.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            return var10;
         } catch (Exception var6) {
            throw new RuntimeException(var7);
         }
      }
   }

   public final boolean b() {
      return this.a.equals("https");
   }

   public final r.a c(String var1) {
      r.a var2 = new r.a();
      return var2.a(this, var1) == r.a.a.a ? var2 : null;
   }

   public final String c() {
      if (this.f.isEmpty()) {
         return "";
      } else {
         int var1 = this.a.length() + 3;
         String var3 = this.j;
         int var2 = a.a.c.a(var3, var1, var3.length(), ":@");
         return this.j.substring(var1, var2);
      }
   }

   public final String d() {
      if (this.g.isEmpty()) {
         return "";
      } else {
         int var1 = this.j.indexOf(58, this.a.length() + 3);
         int var2 = this.j.indexOf(64);
         return this.j.substring(var1 + 1, var2);
      }
   }

   public final String e() {
      int var1 = this.j.indexOf(47, this.a.length() + 3);
      String var3 = this.j;
      int var2 = a.a.c.a(var3, var1, var3.length(), "?#");
      return this.j.substring(var1, var2);
   }

   public final boolean equals(Object var1) {
      return var1 instanceof r && ((r)var1).j.equals(this.j);
   }

   public final List f() {
      int var1 = this.j.indexOf(47, this.a.length() + 3);
      String var4 = this.j;
      int var2 = a.a.c.a(var4, var1, var4.length(), "?#");
      ArrayList var5 = new ArrayList();

      while(var1 < var2) {
         int var3 = var1 + 1;
         var1 = a.a.c.a(this.j, var3, var2, '/');
         var5.add(this.j.substring(var3, var1));
      }

      return var5;
   }

   public final String g() {
      if (this.d == null) {
         return null;
      } else {
         int var1 = this.j.indexOf(63) + 1;
         int var2 = a.a.c.a(this.j, var1 + 1, this.j.length(), '#');
         return this.j.substring(var1, var2);
      }
   }

   public final int hashCode() {
      return this.j.hashCode();
   }

   public final String toString() {
      return this.j;
   }

   public static final class a {
      String a;
      String b = "";
      String c = "";
      String d;
      int e = -1;
      final List f = new ArrayList();
      List g;
      String h;

      public a() {
         this.f.add("");
      }

      static String a(String var0, int var1, int var2) {
         var0 = r.a(var0, var1, var2, false);
         if (!var0.contains(":")) {
            return a.a.c.a(var0);
         } else {
            InetAddress var3;
            if (var0.startsWith("[") && var0.endsWith("]")) {
               var3 = f(var0, 1, var0.length() - 1);
            } else {
               var3 = f(var0, 0, var0.length());
            }

            if (var3 == null) {
               return null;
            } else {
               byte[] var4 = var3.getAddress();
               if (var4.length == 16) {
                  return a(var4);
               } else {
                  throw new AssertionError();
               }
            }
         }
      }

      private static String a(byte[] var0) {
         byte var6 = 0;
         int var1 = 0;
         int var2 = 0;

         int var3;
         int var4;
         int var5;
         for(var3 = -1; var1 < var0.length; var2 = var5) {
            for(var4 = var1; var4 < 16 && var0[var4] == 0 && var0[var4 + 1] == 0; var4 += 2) {
            }

            int var7 = var4 - var1;
            var5 = var2;
            if (var7 > var2) {
               var5 = var7;
               var3 = var1;
            }

            var1 = var4 + 2;
         }

         b.c var8 = new b.c();
         var1 = var6;

         while(var1 < var0.length) {
            if (var1 == var3) {
               var8.b(58);
               var4 = var1 + var2;
               var1 = var4;
               if (var4 == 16) {
                  var8.b(58);
                  var1 = var4;
               }
            } else {
               if (var1 > 0) {
                  var8.b(58);
               }

               var8.h((long)((var0[var1] & 255) << 8 | var0[var1 + 1] & 255));
               var1 += 2;
            }
         }

         return var8.l();
      }

      private void b(String var1, int var2, int var3) {
         if (var2 != var3) {
            char var4 = var1.charAt(var2);
            if (var4 != '/' && var4 != '\\') {
               this.f.set(this.f.size() - 1, "");
            } else {
               this.f.clear();
               this.f.add("");
               ++var2;
            }

            while(var2 < var3) {
               int var5 = a.a.c.a(var1, var2, var3, "/\\");
               boolean var6 = false;
               boolean var9;
               if (var5 < var3) {
                  var9 = true;
               } else {
                  var9 = false;
               }

               String var7 = r.a(var1, var2, var5, " \"<>^`{}|/\\?#", true, false, false, true);
               boolean var8;
               if (!var7.equals(".") && !var7.equalsIgnoreCase("%2e")) {
                  var8 = false;
               } else {
                  var8 = true;
               }

               if (!var8) {
                  label65: {
                     if (!var7.equals("..") && !var7.equalsIgnoreCase("%2e.") && !var7.equalsIgnoreCase(".%2e")) {
                        var8 = var6;
                        if (!var7.equalsIgnoreCase("%2e%2e")) {
                           break label65;
                        }
                     }

                     var8 = true;
                  }

                  if (var8) {
                     if (((String)this.f.remove(this.f.size() - 1)).isEmpty() && !this.f.isEmpty()) {
                        this.f.set(this.f.size() - 1, "");
                     } else {
                        this.f.add("");
                     }
                  } else {
                     if (((String)this.f.get(this.f.size() - 1)).isEmpty()) {
                        this.f.set(this.f.size() - 1, var7);
                     } else {
                        this.f.add(var7);
                     }

                     if (var9) {
                        this.f.add("");
                     }
                  }
               }

               var2 = var5;
               if (var9) {
                  var2 = var5 + 1;
               }
            }

         }
      }

      private static int c(String var0, int var1, int var2) {
         if (var2 - var1 < 2) {
            return -1;
         } else {
            int var3;
            char var4;
            label63: {
               var4 = var0.charAt(var1);
               if (var4 >= 'a') {
                  var3 = var1;
                  if (var4 <= 'z') {
                     break label63;
                  }
               }

               if (var4 < 'A') {
                  return -1;
               }

               var3 = var1;
               if (var4 > 'Z') {
                  return -1;
               }
            }

            while(true) {
               do {
                  do {
                     do {
                        var1 = var3 + 1;
                        if (var1 >= var2) {
                           return -1;
                        }

                        var4 = var0.charAt(var1);
                        if (var4 < 'a') {
                           break;
                        }

                        var3 = var1;
                     } while(var4 <= 'z');

                     if (var4 < 'A') {
                        break;
                     }

                     var3 = var1;
                  } while(var4 <= 'Z');

                  if (var4 < '0') {
                     break;
                  }

                  var3 = var1;
               } while(var4 <= '9');

               var3 = var1;
               if (var4 != '+') {
                  var3 = var1;
                  if (var4 != '-') {
                     var3 = var1;
                     if (var4 != '.') {
                        if (var4 == ':') {
                           return var1;
                        }

                        return -1;
                     }
                  }
               }
            }
         }
      }

      private static int d(String var0, int var1, int var2) {
         int var3;
         for(var3 = 0; var1 < var2; ++var1) {
            char var4 = var0.charAt(var1);
            if (var4 != '\\' && var4 != '/') {
               break;
            }

            ++var3;
         }

         return var3;
      }

      private static int e(String var0, int var1, int var2) {
         int var3;
         label26:
         for(; var1 < var2; var1 = var3 + 1) {
            char var4 = var0.charAt(var1);
            if (var4 == ':') {
               return var1;
            }

            var3 = var1;
            if (var4 != '[') {
               var3 = var1;
            } else {
               do {
                  var1 = var3 + 1;
                  var3 = var1;
                  if (var1 >= var2) {
                     continue label26;
                  }

                  var3 = var1;
               } while(var0.charAt(var1) != ']');

               var3 = var1;
            }
         }

         return var2;
      }

      private static InetAddress f(String var0, int var1, int var2) {
         byte[] var10 = new byte[16];
         int var5 = var1;
         var1 = 0;
         int var4 = -1;
         int var3 = -1;

         int var6;
         int var7;
         while(true) {
            var6 = var1;
            var7 = var4;
            if (var5 >= var2) {
               break;
            }

            if (var1 == 16) {
               return null;
            }

            var6 = var5 + 2;
            if (var6 <= var2 && var0.regionMatches(var5, "::", 0, 2)) {
               if (var4 != -1) {
                  return null;
               }

               var1 += 2;
               if (var6 == var2) {
                  var7 = var1;
                  var6 = var1;
                  break;
               }

               var4 = var1;
               var3 = var6;
            } else {
               var6 = var5;
               if (var1 != 0) {
                  if (!var0.regionMatches(var5, ":", 0, 1)) {
                     if (!var0.regionMatches(var5, ".", 0, 1)) {
                        return null;
                     }

                     int var8 = var1 - 2;
                     var6 = var8;
                     var5 = var3;

                     boolean var13;
                     label111: {
                        label110:
                        while(true) {
                           boolean var14 = false;
                           if (var5 >= var2) {
                              if (var6 == var8 + 4) {
                                 var13 = true;
                                 break label111;
                              }
                              break;
                           }

                           if (var6 == 16) {
                              var13 = var14;
                              break label111;
                           }

                           var3 = var5;
                           if (var6 != var8) {
                              if (var0.charAt(var5) != '.') {
                                 var13 = var14;
                                 break label111;
                              }

                              var3 = var5 + 1;
                           }

                           var5 = var3;

                           for(var7 = 0; var5 < var2; ++var5) {
                              char var9 = var0.charAt(var5);
                              if (var9 < '0' || var9 > '9') {
                                 break;
                              }

                              if (var7 == 0 && var3 != var5) {
                                 break label110;
                              }

                              var7 = var7 * 10 + var9 - 48;
                              if (var7 > 255) {
                                 break label110;
                              }
                           }

                           if (var5 - var3 == 0) {
                              break;
                           }

                           var10[var6] = (byte)var7;
                           ++var6;
                        }

                        var13 = false;
                     }

                     if (!var13) {
                        return null;
                     }

                     var6 = var1 + 2;
                     var7 = var4;
                     break;
                  }

                  var6 = var5 + 1;
               }

               var3 = var6;
            }

            var5 = var3;

            for(var6 = 0; var5 < var2; ++var5) {
               var7 = r.a(var0.charAt(var5));
               if (var7 == -1) {
                  break;
               }

               var6 = (var6 << 4) + var7;
            }

            var7 = var5 - var3;
            if (var7 == 0) {
               return null;
            }

            if (var7 > 4) {
               return null;
            }

            var7 = var1 + 1;
            var10[var1] = (byte)(var6 >>> 8 & 255);
            var1 = var7 + 1;
            var10[var7] = (byte)(var6 & 255);
         }

         if (var6 != 16) {
            if (var7 == -1) {
               return null;
            }

            var1 = var6 - var7;
            System.arraycopy(var10, var7, var10, 16 - var1, var1);
            Arrays.fill(var10, var7, 16 - var6 + var7, (byte)0);
         }

         try {
            InetAddress var12 = InetAddress.getByAddress(var10);
            return var12;
         } catch (UnknownHostException var11) {
            throw new AssertionError();
         }
      }

      private static int g(String var0, int var1, int var2) {
         try {
            var1 = Integer.parseInt(r.a(var0, var1, var2, "", false, false, false, true));
         } catch (NumberFormatException var3) {
            return -1;
         }

         return var1 > 0 && var1 <= 65535 ? var1 : -1;
      }

      final int a() {
         return this.e != -1 ? this.e : r.a(this.a);
      }

      final int a(r var1, String var2) {
         int var3 = a.a.c.a(var2, 0, var2.length());
         int var8 = a.a.c.b(var2, var3, var2.length());
         if (c(var2, var3, var8) != -1) {
            if (var2.regionMatches(true, var3, "https:", 0, 6)) {
               this.a = "https";
               var3 += 6;
            } else {
               if (!var2.regionMatches(true, var3, "http:", 0, 5)) {
                  return r.a.a.c;
               }

               this.a = "http";
               var3 += 5;
            }
         } else {
            if (var1 == null) {
               return r.a.a.b;
            }

            this.a = var1.a;
         }

         int var4 = d(var2, var3, var8);
         int var5;
         if (var4 < 2 && var1 != null && var1.a.equals(this.a)) {
            this.b = var1.c();
            this.c = var1.d();
            this.d = var1.b;
            this.e = var1.c;
            this.f.clear();
            this.f.addAll(var1.f());
            if (var3 == var8 || var2.charAt(var3) == '#') {
               this.a(var1.g());
            }

            var5 = var3;
         } else {
            var4 += var3;
            boolean var13 = false;
            boolean var6 = false;

            label90:
            while(true) {
               var5 = a.a.c.a(var2, var4, var8, "@/\\?#");
               int var7;
               if (var5 != var8) {
                  var7 = var2.charAt(var5);
               } else {
                  var7 = -1;
               }

               if (var7 == -1 || var7 == 35 || var7 == 47 || var7 == 92) {
                  break;
               }

               switch(var7) {
               case 63:
                  break label90;
               case 64:
                  StringBuilder var12;
                  if (!var13) {
                     int var9 = a.a.c.a(var2, var4, var5, ':');
                     String var10 = r.a(var2, var4, var9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                     String var11 = var10;
                     if (var6) {
                        var12 = new StringBuilder();
                        var12.append(this.b);
                        var12.append("%40");
                        var12.append(var10);
                        var11 = var12.toString();
                     }

                     this.b = var11;
                     if (var9 != var5) {
                        this.c = r.a(var2, var9 + 1, var5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        var13 = true;
                     }

                     var6 = true;
                  } else {
                     var12 = new StringBuilder();
                     var12.append(this.c);
                     var12.append("%40");
                     var12.append(r.a(var2, var4, var5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true));
                     this.c = var12.toString();
                  }

                  var4 = var5 + 1;
               }
            }

            var3 = e(var2, var4, var5);
            int var14 = var3 + 1;
            if (var14 < var5) {
               this.d = a(var2, var4, var3);
               this.e = g(var2, var14, var5);
               if (this.e == -1) {
                  return r.a.a.d;
               }
            } else {
               this.d = a(var2, var4, var3);
               this.e = r.a(this.a);
            }

            if (this.d == null) {
               return r.a.a.e;
            }
         }

         var4 = a.a.c.a(var2, var5, var8, "?#");
         this.b(var2, var5, var4);
         var3 = var4;
         if (var4 < var8) {
            var3 = var4;
            if (var2.charAt(var4) == '?') {
               var3 = a.a.c.a(var2, var4, var8, '#');
               this.g = r.b(r.a(var2, var4 + 1, var3, " \"'<>#", true, false, true, true));
            }
         }

         if (var3 < var8 && var2.charAt(var3) == '#') {
            this.h = r.a(var2, 1 + var3, var8, "", true, false, false, false);
         }

         return r.a.a.a;
      }

      public final r.a a(String var1) {
         List var2;
         if (var1 != null) {
            var2 = r.b(r.a(var1, " \"'<>#", true, false, true, true));
         } else {
            var2 = null;
         }

         this.g = var2;
         return this;
      }

      public final r b() {
         if (this.a != null) {
            if (this.d != null) {
               return new r(this);
            } else {
               throw new IllegalStateException("host == null");
            }
         } else {
            throw new IllegalStateException("scheme == null");
         }
      }

      public final String toString() {
         StringBuilder var2 = new StringBuilder();
         var2.append(this.a);
         var2.append("://");
         if (!this.b.isEmpty() || !this.c.isEmpty()) {
            var2.append(this.b);
            if (!this.c.isEmpty()) {
               var2.append(':');
               var2.append(this.c);
            }

            var2.append('@');
         }

         if (this.d.indexOf(58) != -1) {
            var2.append('[');
            var2.append(this.d);
            var2.append(']');
         } else {
            var2.append(this.d);
         }

         int var1 = this.a();
         if (var1 != r.a(this.a)) {
            var2.append(':');
            var2.append(var1);
         }

         r.a(var2, this.f);
         if (this.g != null) {
            var2.append('?');
            r.b(var2, this.g);
         }

         if (this.h != null) {
            var2.append('#');
            var2.append(this.h);
         }

         return var2.toString();
      }

      static enum a {
         public static final int a = 1;
         public static final int b = 2;
         public static final int c = 3;
         public static final int d = 4;
         public static final int e = 5;
         // $FF: synthetic field
         private static final int[] f;

         static {
            f = new int[]{a, b, c, d, e};
         }
      }
   }
}
