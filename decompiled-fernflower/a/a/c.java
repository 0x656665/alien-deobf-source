package a.a;

import a.aa;
import a.r;
import a.t;
import a.y;
import b.d;
import b.e;
import b.f;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.IDN;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class c {
   public static final byte[] a = new byte[0];
   public static final String[] b = new String[0];
   public static final aa c;
   public static final y d;
   public static final Charset e;
   public static final TimeZone f;
   private static final f g;
   private static final f h;
   private static final f i;
   private static final f j;
   private static final f k;
   private static final Charset l;
   private static final Charset m;
   private static final Charset n;
   private static final Charset o;
   private static final Pattern p;

   static {
      c = aa.a(a);
      byte[] var1 = a;
      int var0 = var1.length;
      if (var1 != null) {
         a((long)var1.length, (long)var0);
         d = new y(var1) {
            // $FF: synthetic field
            final t a = null;
            // $FF: synthetic field
            final int b;
            // $FF: synthetic field
            final byte[] c;
            // $FF: synthetic field
            final int d;

            public {
               this.b = var1;
               this.c = var2;
               this.d = 0;
               super();
            }

            public final t a() {
               return this.a;
            }

            public final void a(d var1) {
               var1.b(this.c, this.d, this.b);
            }

            public final long b() {
               return (long)this.b;
            }
         };
         g = b.f.b("efbbbf");
         h = b.f.b("feff");
         i = b.f.b("fffe");
         j = b.f.b("0000ffff");
         k = b.f.b("ffff0000");
         e = Charset.forName("UTF-8");
         l = Charset.forName("UTF-16BE");
         m = Charset.forName("UTF-16LE");
         n = Charset.forName("UTF-32BE");
         o = Charset.forName("UTF-32LE");
         f = TimeZone.getTimeZone("GMT");
         p = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
      } else {
         throw new NullPointerException("content == null");
      }
   }

   public static int a(String var0, int var1, int var2) {
      while(var1 < var2) {
         switch(var0.charAt(var1)) {
         case '\t':
         case '\n':
         case '\f':
         case '\r':
         case ' ':
            ++var1;
            break;
         default:
            return var1;
         }
      }

      return var2;
   }

   public static int a(String var0, int var1, int var2, char var3) {
      while(var1 < var2) {
         if (var0.charAt(var1) == var3) {
            return var1;
         }

         ++var1;
      }

      return var2;
   }

   public static int a(String var0, int var1, int var2, String var3) {
      while(var1 < var2) {
         if (var3.indexOf(var0.charAt(var1)) != -1) {
            return var1;
         }

         ++var1;
      }

      return var2;
   }

   public static int a(Object[] var0, Object var1) {
      int var3 = var0.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         if (a(var0[var2], var1)) {
            return var2;
         }
      }

      return -1;
   }

   public static String a(r var0, boolean var1) {
      String var4;
      if (var0.b.contains(":")) {
         StringBuilder var2 = new StringBuilder("[");
         var2.append(var0.b);
         var2.append("]");
         var4 = var2.toString();
      } else {
         var4 = var0.b;
      }

      if (!var1 && var0.c == r.a(var0.a)) {
         return var4;
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append(var4);
         var3.append(":");
         var3.append(var0.c);
         return var3.toString();
      }
   }

   public static String a(String var0) {
      boolean var10001;
      try {
         var0 = IDN.toASCII(var0).toLowerCase(Locale.US);
         if (var0.isEmpty()) {
            return null;
         }
      } catch (IllegalArgumentException var8) {
         var10001 = false;
         return null;
      }

      int var1 = 0;

      while(true) {
         int var2;
         try {
            var2 = var0.length();
         } catch (IllegalArgumentException var7) {
            var10001 = false;
            break;
         }

         boolean var3 = true;
         boolean var9;
         if (var1 < var2) {
            char var4;
            try {
               var4 = var0.charAt(var1);
            } catch (IllegalArgumentException var6) {
               var10001 = false;
               break;
            }

            var9 = var3;
            if (var4 > 31) {
               if (var4 >= 127) {
                  var9 = var3;
               } else {
                  try {
                     var2 = " #%/:?@[\\]".indexOf(var4);
                  } catch (IllegalArgumentException var5) {
                     var10001 = false;
                     break;
                  }

                  if (var2 == -1) {
                     ++var1;
                     continue;
                  }

                  var9 = var3;
               }
            }
         } else {
            var9 = false;
         }

         if (var9) {
            return null;
         }

         return var0;
      }

      return null;
   }

   public static String a(String var0, Object... var1) {
      return String.format(Locale.US, var0, var1);
   }

   public static Charset a(e var0, Charset var1) {
      if (var0.b(g)) {
         var0.f((long)g.g());
         return e;
      } else if (var0.b(h)) {
         var0.f((long)h.g());
         return l;
      } else if (var0.b(i)) {
         var0.f((long)i.g());
         return m;
      } else if (var0.b(j)) {
         var0.f((long)j.g());
         return n;
      } else if (var0.b(k)) {
         var0.f((long)k.g());
         return o;
      } else {
         return var1;
      }
   }

   public static List a(List var0) {
      return Collections.unmodifiableList(new ArrayList(var0));
   }

   public static List a(Object... var0) {
      return Collections.unmodifiableList(Arrays.asList((Object[])var0.clone()));
   }

   public static ThreadFactory a(final String var0, final boolean var1) {
      return new ThreadFactory() {
         public final Thread newThread(Runnable var1x) {
            Thread var2 = new Thread(var1x, var0);
            var2.setDaemon(var1);
            return var2;
         }
      };
   }

   public static void a(long var0, long var2) {
      if ((var2 | 0L) < 0L || 0L > var0 || var0 - 0L < var2) {
         throw new ArrayIndexOutOfBoundsException();
      }
   }

   public static void a(Closeable var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (RuntimeException var1) {
            throw var1;
         } catch (Exception var2) {
         }
      }
   }

   public static void a(Socket var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (AssertionError var1) {
            if (!a(var1)) {
               throw var1;
            }
         } catch (RuntimeException var2) {
            throw var2;
         } catch (Exception var3) {
         }
      }
   }

   public static boolean a(b.r param0, int param1, TimeUnit param2) {
      // $FF: Couldn't be decompiled
   }

   public static boolean a(b.r var0, TimeUnit var1) {
      try {
         boolean var2 = a(var0, 100, var1);
         return var2;
      } catch (IOException var3) {
         return false;
      }
   }

   public static boolean a(AssertionError var0) {
      return var0.getCause() != null && var0.getMessage() != null && var0.getMessage().contains("getsockname failed");
   }

   public static boolean a(Object var0, Object var1) {
      return var0 == var1 || var0 != null && var0.equals(var1);
   }

   public static Object[] a(Class var0, Object[] var1, Object[] var2) {
      ArrayList var7 = new ArrayList();
      int var5 = var1.length;

      for(int var3 = 0; var3 < var5; ++var3) {
         Object var8 = var1[var3];
         int var6 = var2.length;

         for(int var4 = 0; var4 < var6; ++var4) {
            Object var9 = var2[var4];
            if (var8.equals(var9)) {
               var7.add(var9);
               break;
            }
         }
      }

      return var7.toArray((Object[])Array.newInstance(var0, var7.size()));
   }

   public static String[] a(String[] var0, String var1) {
      String[] var2 = new String[var0.length + 1];
      System.arraycopy(var0, 0, var2, 0, var0.length);
      var2[var2.length - 1] = var1;
      return var2;
   }

   public static int b(String var0) {
      int var2 = var0.length();

      for(int var1 = 0; var1 < var2; ++var1) {
         char var3 = var0.charAt(var1);
         if (var3 <= 31) {
            return var1;
         }

         if (var3 >= 127) {
            return var1;
         }
      }

      return -1;
   }

   public static int b(String var0, int var1, int var2) {
      --var2;

      while(var2 >= var1) {
         switch(var0.charAt(var2)) {
         case '\t':
         case '\n':
         case '\f':
         case '\r':
         case ' ':
            --var2;
            break;
         default:
            return var2 + 1;
         }
      }

      return var1;
   }

   public static String c(String var0, int var1, int var2) {
      var1 = a(var0, var1, var2);
      return var0.substring(var1, b(var0, var1, var2));
   }

   public static boolean c(String var0) {
      return p.matcher(var0).matches();
   }
}
