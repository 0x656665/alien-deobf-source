package a.a.c;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class d {
   private static final ThreadLocal a = new ThreadLocal() {
      // $FF: synthetic method
      protected final Object initialValue() {
         SimpleDateFormat var1 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
         var1.setLenient(false);
         var1.setTimeZone(a.a.c.f);
         return var1;
      }
   };
   private static final String[] b = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
   private static final DateFormat[] c = new DateFormat[15];

   public static String a(Date var0) {
      return ((DateFormat)a.get()).format(var0);
   }

   public static Date a(String var0) {
      if (var0.length() == 0) {
         return null;
      } else {
         ParsePosition var5 = new ParsePosition(0);
         Date var3 = ((DateFormat)a.get()).parse(var0, var5);
         if (var5.getIndex() == var0.length()) {
            return var3;
         } else {
            String[] var6 = b;
            synchronized(var6){}

            Throwable var10000;
            boolean var10001;
            label449: {
               int var2;
               try {
                  var2 = b.length;
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label449;
               }

               int var1 = 0;

               while(true) {
                  if (var1 >= var2) {
                     try {
                        return null;
                     } catch (Throwable var44) {
                        var10000 = var44;
                        var10001 = false;
                        break;
                     }
                  }

                  DateFormat var4;
                  try {
                     var4 = c[var1];
                  } catch (Throwable var46) {
                     var10000 = var46;
                     var10001 = false;
                     break;
                  }

                  Object var50 = var4;
                  if (var4 == null) {
                     try {
                        var50 = new SimpleDateFormat(b[var1], Locale.US);
                        ((DateFormat)var50).setTimeZone(a.a.c.f);
                        c[var1] = (DateFormat)var50;
                     } catch (Throwable var45) {
                        var10000 = var45;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var5.setIndex(0);
                     var3 = ((DateFormat)var50).parse(var0, var5);
                     if (var5.getIndex() != 0) {
                        return var3;
                     }
                  } catch (Throwable var48) {
                     var10000 = var48;
                     var10001 = false;
                     break;
                  }

                  ++var1;
               }
            }

            while(true) {
               Throwable var49 = var10000;

               try {
                  throw var49;
               } catch (Throwable var43) {
                  var10000 = var43;
                  var10001 = false;
                  continue;
               }
            }
         }
      }
   }
}
