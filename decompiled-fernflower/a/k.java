package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class k {
   private static final Pattern c = Pattern.compile("(\\d{2,4})[^\\d]*");
   private static final Pattern d = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
   private static final Pattern e = Pattern.compile("(\\d{1,2})[^\\d]*");
   private static final Pattern f = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
   public final String a;
   public final String b;
   private final long g;
   private final String h;
   private final String i;
   private final boolean j;
   private final boolean k;
   private final boolean l;
   private final boolean m;

   private k(String var1, String var2, long var3, String var5, String var6, boolean var7, boolean var8, boolean var9, boolean var10) {
      this.a = var1;
      this.b = var2;
      this.g = var3;
      this.h = var5;
      this.i = var6;
      this.j = var7;
      this.k = var8;
      this.m = var9;
      this.l = var10;
   }

   private static int a(String var0, int var1, int var2, boolean var3) {
      while(var1 < var2) {
         char var4 = var0.charAt(var1);
         boolean var5;
         if ((var4 >= ' ' || var4 == '\t') && var4 < 127 && (var4 < '0' || var4 > '9') && (var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && var4 != ':') {
            var5 = false;
         } else {
            var5 = true;
         }

         if (var5 == (var3 ^ true)) {
            return var1;
         }

         ++var1;
      }

      return var2;
   }

   private static long a(String var0) {
      long var1;
      try {
         var1 = Long.parseLong(var0);
      } catch (NumberFormatException var4) {
         if (var0.matches("-?\\d+")) {
            if (var0.startsWith("-")) {
               return Long.MIN_VALUE;
            }

            return Long.MAX_VALUE;
         }

         throw var4;
      }

      return var1 <= 0L ? Long.MIN_VALUE : var1;
   }

   private static k a(long var0, r var2, String var3) {
      int var4 = var3.length();
      int var5 = a.a.c.a(var3, 0, var4, ';');
      int var6 = a.a.c.a(var3, 0, var5, '=');
      String var33 = null;
      if (var6 == var5) {
         return null;
      } else {
         String var35 = a.a.c.c(var3, 0, var6);
         if (!var35.isEmpty() && a.a.c.b(var35) == -1) {
            String var36 = a.a.c.c(var3, var6 + 1, var5);
            if (a.a.c.b(var36) != -1) {
               return null;
            } else {
               ++var5;
               String var32 = null;
               long var16 = 253402300799999L;
               long var18 = -1L;
               boolean var26 = false;
               boolean var27 = false;
               boolean var25 = true;
               boolean var24 = false;

               while(true) {
                  int var11 = -1;
                  long var20;
                  if (var5 >= var4) {
                     var20 = Long.MIN_VALUE;
                     if (var18 == Long.MIN_VALUE) {
                        var0 = var20;
                     } else if (var18 != -1L) {
                        label507: {
                           if (var18 <= 9223372036854775L) {
                              var16 = var18 * 1000L;
                           } else {
                              var16 = Long.MAX_VALUE;
                           }

                           var16 += var0;
                           if (var16 >= var0) {
                              var0 = var16;
                              if (var16 <= 253402300799999L) {
                                 break label507;
                              }
                           }

                           var0 = 253402300799999L;
                        }
                     } else {
                        var0 = var16;
                     }

                     if (var33 == null) {
                        var3 = var2.b;
                     } else {
                        var3 = var2.b;
                        boolean var76;
                        if (var3.equals(var33)) {
                           var76 = true;
                        } else {
                           label514: {
                              if (var3.endsWith(var33)) {
                                 var5 = var3.length();
                                 var6 = var33.length();
                                 var76 = true;
                                 if (var3.charAt(var5 - var6 - 1) == '.' && !a.a.c.c(var3)) {
                                    break label514;
                                 }
                              }

                              var76 = false;
                           }
                        }

                        if (!var76) {
                           return null;
                        }

                        var3 = var33;
                     }

                     String var75;
                     if (var32 != null && var32.startsWith("/")) {
                        var75 = var32;
                     } else {
                        var75 = var2.e();
                        var4 = var75.lastIndexOf(47);
                        if (var4 != 0) {
                           var75 = var75.substring(0, var4);
                        } else {
                           var75 = "/";
                        }
                     }

                     return new k(var35, var36, var0, var3, var75, var26, var27, var25, var24);
                  }

                  int var13 = a.a.c.a(var3, var5, var4, ';');
                  var6 = a.a.c.a(var3, var5, var13, '=');
                  String var37 = a.a.c.c(var3, var5, var6);
                  String var31;
                  if (var6 < var13) {
                     var31 = a.a.c.c(var3, var6 + 1, var13);
                  } else {
                     var31 = "";
                  }

                  String var78;
                  long var22;
                  boolean var28;
                  boolean var29;
                  boolean var30;
                  label477: {
                     label476: {
                        int var8;
                        label523: {
                           label473: {
                              boolean var10001;
                              if (var37.equalsIgnoreCase("expires")) {
                                 var8 = var4;

                                 int var14;
                                 try {
                                    var14 = var31.length();
                                 } catch (IllegalArgumentException var58) {
                                    var10001 = false;
                                    break label523;
                                 }

                                 var8 = var4;

                                 int var12;
                                 try {
                                    var12 = a(var31, 0, var14, false);
                                 } catch (IllegalArgumentException var57) {
                                    var10001 = false;
                                    break label523;
                                 }

                                 var8 = var4;

                                 Matcher var34;
                                 try {
                                    var34 = f.matcher(var31);
                                 } catch (IllegalArgumentException var56) {
                                    var10001 = false;
                                    break label523;
                                 }

                                 var6 = -1;
                                 int var7 = -1;
                                 var5 = -1;
                                 int var10 = -1;
                                 int var9 = -1;

                                 while(var12 < var14) {
                                    var8 = var4;

                                    int var15;
                                    try {
                                       var15 = a(var31, var12 + 1, var14, true);
                                    } catch (IllegalArgumentException var55) {
                                       var10001 = false;
                                       break label523;
                                    }

                                    var8 = var4;

                                    try {
                                       var34.region(var12, var15);
                                    } catch (IllegalArgumentException var54) {
                                       var10001 = false;
                                       break label523;
                                    }

                                    label517: {
                                       if (var11 == -1) {
                                          label511: {
                                             var8 = var4;

                                             try {
                                                if (!var34.usePattern(f).matches()) {
                                                   break label511;
                                                }
                                             } catch (IllegalArgumentException var74) {
                                                var10001 = false;
                                                break label523;
                                             }

                                             var8 = var4;

                                             try {
                                                var11 = Integer.parseInt(var34.group(1));
                                             } catch (IllegalArgumentException var53) {
                                                var10001 = false;
                                                break label523;
                                             }

                                             var8 = var4;

                                             try {
                                                var10 = Integer.parseInt(var34.group(2));
                                             } catch (IllegalArgumentException var52) {
                                                var10001 = false;
                                                break label523;
                                             }

                                             var8 = var4;

                                             try {
                                                var9 = Integer.parseInt(var34.group(3));
                                                break label517;
                                             } catch (IllegalArgumentException var51) {
                                                var10001 = false;
                                                break label523;
                                             }
                                          }
                                       }

                                       if (var5 == -1) {
                                          label512: {
                                             var8 = var4;

                                             try {
                                                if (!var34.usePattern(e).matches()) {
                                                   break label512;
                                                }
                                             } catch (IllegalArgumentException var73) {
                                                var10001 = false;
                                                break label523;
                                             }

                                             var8 = var4;

                                             try {
                                                var5 = Integer.parseInt(var34.group(1));
                                                break label517;
                                             } catch (IllegalArgumentException var50) {
                                                var10001 = false;
                                                break label523;
                                             }
                                          }
                                       }

                                       if (var7 == -1) {
                                          try {
                                             if (var34.usePattern(d).matches()) {
                                                var37 = var34.group(1).toLowerCase(Locale.US);
                                                var7 = d.pattern().indexOf(var37) / 4;
                                                break label517;
                                             }
                                          } catch (IllegalArgumentException var72) {
                                             var10001 = false;
                                             break label476;
                                          }
                                       }

                                       if (var6 == -1) {
                                          try {
                                             if (var34.usePattern(c).matches()) {
                                                var6 = Integer.parseInt(var34.group(1));
                                             }
                                          } catch (IllegalArgumentException var71) {
                                             var10001 = false;
                                             break label476;
                                          }
                                       }
                                    }

                                    try {
                                       var12 = a(var31, var15 + 1, var14, false);
                                    } catch (IllegalArgumentException var59) {
                                       var10001 = false;
                                       break label476;
                                    }
                                 }

                                 var8 = var6;
                                 if (var6 >= 70) {
                                    var8 = var6;
                                    if (var6 <= 99) {
                                       var8 = var6 + 1900;
                                    }
                                 }

                                 var12 = var8;
                                 if (var8 >= 0) {
                                    var12 = var8;
                                    if (var8 <= 69) {
                                       var12 = var8 + 2000;
                                    }
                                 }

                                 if (var12 >= 1601) {
                                    if (var7 != -1) {
                                       if (var5 > 0 && var5 <= 31) {
                                          if (var11 >= 0 && var11 <= 23) {
                                             if (var10 >= 0 && var10 <= 59) {
                                                if (var9 >= 0 && var9 <= 59) {
                                                   label502: {
                                                      var6 = var4;

                                                      GregorianCalendar var77;
                                                      try {
                                                         var77 = new GregorianCalendar(a.a.c.f);
                                                      } catch (IllegalArgumentException var70) {
                                                         var10001 = false;
                                                         break label502;
                                                      }

                                                      var6 = var4;

                                                      try {
                                                         var77.setLenient(false);
                                                      } catch (IllegalArgumentException var69) {
                                                         var10001 = false;
                                                         break label502;
                                                      }

                                                      var6 = var4;

                                                      try {
                                                         var77.set(1, var12);
                                                      } catch (IllegalArgumentException var68) {
                                                         var10001 = false;
                                                         break label502;
                                                      }

                                                      var6 = var4;

                                                      try {
                                                         var77.set(2, var7 - 1);
                                                      } catch (IllegalArgumentException var67) {
                                                         var10001 = false;
                                                         break label502;
                                                      }

                                                      var6 = var4;

                                                      try {
                                                         var77.set(5, var5);
                                                      } catch (IllegalArgumentException var66) {
                                                         var10001 = false;
                                                         break label502;
                                                      }

                                                      var6 = var4;

                                                      try {
                                                         var77.set(11, var11);
                                                      } catch (IllegalArgumentException var65) {
                                                         var10001 = false;
                                                         break label502;
                                                      }

                                                      var6 = var4;

                                                      try {
                                                         var77.set(12, var10);
                                                      } catch (IllegalArgumentException var64) {
                                                         var10001 = false;
                                                         break label502;
                                                      }

                                                      var6 = var4;

                                                      try {
                                                         var77.set(13, var9);
                                                      } catch (IllegalArgumentException var63) {
                                                         var10001 = false;
                                                         break label502;
                                                      }

                                                      var6 = var4;

                                                      try {
                                                         var77.set(14, 0);
                                                      } catch (IllegalArgumentException var62) {
                                                         var10001 = false;
                                                         break label502;
                                                      }

                                                      var6 = var4;

                                                      try {
                                                         var20 = var77.getTimeInMillis();
                                                      } catch (IllegalArgumentException var61) {
                                                         var10001 = false;
                                                         break label502;
                                                      }

                                                      var16 = var20;
                                                      break label473;
                                                   }
                                                } else {
                                                   var6 = var4;

                                                   try {
                                                      throw new IllegalArgumentException();
                                                   } catch (IllegalArgumentException var45) {
                                                      var10001 = false;
                                                   }
                                                }
                                             } else {
                                                var6 = var4;

                                                try {
                                                   throw new IllegalArgumentException();
                                                } catch (IllegalArgumentException var42) {
                                                   var10001 = false;
                                                }
                                             }
                                          } else {
                                             var6 = var4;

                                             try {
                                                throw new IllegalArgumentException();
                                             } catch (IllegalArgumentException var39) {
                                                var10001 = false;
                                             }
                                          }
                                       } else {
                                          var6 = var4;

                                          try {
                                             throw new IllegalArgumentException();
                                          } catch (IllegalArgumentException var41) {
                                             var10001 = false;
                                          }
                                       }
                                    } else {
                                       var6 = var4;

                                       try {
                                          throw new IllegalArgumentException();
                                       } catch (IllegalArgumentException var43) {
                                          var10001 = false;
                                       }
                                    }
                                 } else {
                                    var6 = var4;

                                    try {
                                       throw new IllegalArgumentException();
                                    } catch (IllegalArgumentException var44) {
                                       var10001 = false;
                                    }
                                 }
                              } else {
                                 var5 = var4;
                                 if (var37.equalsIgnoreCase("max-age")) {
                                    label503: {
                                       var6 = var4;

                                       try {
                                          var20 = a(var31);
                                       } catch (NumberFormatException var60) {
                                          var10001 = false;
                                          break label503;
                                       }

                                       var18 = var20;
                                       var4 = var4;
                                       break label473;
                                    }
                                 } else {
                                    label504: {
                                       if (!var37.equalsIgnoreCase("domain")) {
                                          if (var37.equalsIgnoreCase("path")) {
                                             var78 = var31;
                                             var31 = var33;
                                             var20 = var18;
                                             var22 = var16;
                                             var28 = var26;
                                             var29 = var25;
                                             var30 = var24;
                                             var4 = var4;
                                          } else if (var37.equalsIgnoreCase("secure")) {
                                             var28 = true;
                                             var31 = var33;
                                             var20 = var18;
                                             var22 = var16;
                                             var78 = var32;
                                             var29 = var25;
                                             var30 = var24;
                                             var4 = var4;
                                          } else {
                                             var31 = var33;
                                             var20 = var18;
                                             var22 = var16;
                                             var78 = var32;
                                             var28 = var26;
                                             var29 = var25;
                                             var30 = var24;
                                             var4 = var4;
                                             if (var37.equalsIgnoreCase("httponly")) {
                                                var27 = true;
                                                var4 = var5;
                                                var30 = var24;
                                                var29 = var25;
                                                var28 = var26;
                                                var78 = var32;
                                                var22 = var16;
                                                var20 = var18;
                                                var31 = var33;
                                             }
                                          }
                                          break label477;
                                       }

                                       var6 = var4;

                                       label505: {
                                          try {
                                             if (!var31.endsWith(".")) {
                                                break label505;
                                             }
                                          } catch (IllegalArgumentException var49) {
                                             var10001 = false;
                                             break label504;
                                          }

                                          var6 = var4;

                                          try {
                                             throw new IllegalArgumentException();
                                          } catch (IllegalArgumentException var40) {
                                             var10001 = false;
                                             break label504;
                                          }
                                       }

                                       var78 = var31;
                                       var6 = var4;

                                       label506: {
                                          try {
                                             if (!var31.startsWith(".")) {
                                                break label506;
                                             }
                                          } catch (IllegalArgumentException var48) {
                                             var10001 = false;
                                             break label504;
                                          }

                                          var6 = var4;

                                          try {
                                             var78 = var31.substring(1);
                                          } catch (IllegalArgumentException var47) {
                                             var10001 = false;
                                             break label504;
                                          }
                                       }

                                       var6 = var4;

                                       try {
                                          var31 = a.a.c.a(var78);
                                       } catch (IllegalArgumentException var46) {
                                          var10001 = false;
                                          break label504;
                                       }

                                       if (var31 != null) {
                                          var29 = false;
                                          var20 = var18;
                                          var22 = var16;
                                          var78 = var32;
                                          var28 = var26;
                                          var30 = var24;
                                          var4 = var4;
                                          break label477;
                                       }

                                       var6 = var4;

                                       try {
                                          throw new IllegalArgumentException();
                                       } catch (IllegalArgumentException var38) {
                                          var10001 = false;
                                       }
                                    }
                                 }
                              }

                              var31 = var33;
                              var20 = var18;
                              var22 = var16;
                              var78 = var32;
                              var28 = var26;
                              var29 = var25;
                              var30 = var24;
                              var4 = var6;
                              break label477;
                           }

                           var30 = true;
                           var31 = var33;
                           var20 = var18;
                           var22 = var16;
                           var78 = var32;
                           var28 = var26;
                           var29 = var25;
                           break label477;
                        }

                        var4 = var8;
                     }

                     var31 = var33;
                     var20 = var18;
                     var22 = var16;
                     var78 = var32;
                     var28 = var26;
                     var29 = var25;
                     var30 = var24;
                  }

                  var5 = var13 + 1;
                  var33 = var31;
                  var18 = var20;
                  var16 = var22;
                  var32 = var78;
                  var26 = var28;
                  var25 = var29;
                  var24 = var30;
               }
            }
         } else {
            return null;
         }
      }
   }

   public static List a(r var0, q var1) {
      int var4 = var1.a.length / 2;
      byte var3 = 0;
      k var7 = null;
      ArrayList var5 = null;

      int var2;
      ArrayList var6;
      for(var2 = 0; var2 < var4; var5 = var6) {
         var6 = var5;
         if ("Set-Cookie".equalsIgnoreCase(var1.a(var2))) {
            var6 = var5;
            if (var5 == null) {
               var6 = new ArrayList(2);
            }

            var6.add(var1.b(var2));
         }

         ++var2;
      }

      List var10;
      if (var5 != null) {
         var10 = Collections.unmodifiableList(var5);
      } else {
         var10 = Collections.emptyList();
      }

      var4 = var10.size();
      ArrayList var8 = var7;

      for(var2 = var3; var2 < var4; var8 = var5) {
         String var9 = (String)var10.get(var2);
         var7 = a(System.currentTimeMillis(), var0, var9);
         var5 = var8;
         if (var7 != null) {
            var5 = var8;
            if (var8 == null) {
               var5 = new ArrayList();
            }

            var5.add(var7);
         }

         ++var2;
      }

      if (var8 != null) {
         return Collections.unmodifiableList(var8);
      } else {
         return Collections.emptyList();
      }
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof k)) {
         return false;
      } else {
         k var2 = (k)var1;
         return var2.a.equals(this.a) && var2.b.equals(this.b) && var2.h.equals(this.h) && var2.i.equals(this.i) && var2.g == this.g && var2.j == this.j && var2.k == this.k && var2.l == this.l && var2.m == this.m;
      }
   }

   public final int hashCode() {
      return ((((((((this.a.hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.h.hashCode()) * 31 + this.i.hashCode()) * 31 + (int)(this.g ^ this.g >>> 32)) * 31 + (this.j ^ 1)) * 31 + (this.k ^ 1)) * 31 + (this.l ^ 1)) * 31 + (this.m ^ 1);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.a);
      var1.append('=');
      var1.append(this.b);
      if (this.l) {
         if (this.g == Long.MIN_VALUE) {
            var1.append("; max-age=0");
         } else {
            var1.append("; expires=");
            var1.append(a.a.c.d.a(new Date(this.g)));
         }
      }

      if (!this.m) {
         var1.append("; domain=");
         var1.append(this.h);
      }

      var1.append("; path=");
      var1.append(this.i);
      if (this.j) {
         var1.append("; secure");
      }

      if (this.k) {
         var1.append("; httponly");
      }

      return var1.toString();
   }
}
