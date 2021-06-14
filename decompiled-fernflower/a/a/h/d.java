package a.a.h;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class d implements HostnameVerifier {
   public static final d a = new d();

   private d() {
   }

   public static List a(X509Certificate var0) {
      List var1 = a(var0, 7);
      List var3 = a(var0, 2);
      ArrayList var2 = new ArrayList(var1.size() + var3.size());
      var2.addAll(var1);
      var2.addAll(var3);
      return var2;
   }

   private static List a(X509Certificate var0, int var1) {
      ArrayList var2 = new ArrayList();

      boolean var10001;
      Collection var12;
      try {
         var12 = var0.getSubjectAlternativeNames();
      } catch (CertificateParsingException var11) {
         var10001 = false;
         return Collections.emptyList();
      }

      if (var12 == null) {
         try {
            return Collections.emptyList();
         } catch (CertificateParsingException var5) {
            var10001 = false;
         }
      } else {
         Iterator var13;
         try {
            var13 = var12.iterator();
         } catch (CertificateParsingException var10) {
            var10001 = false;
            return Collections.emptyList();
         }

         while(true) {
            List var3;
            try {
               if (!var13.hasNext()) {
                  return var2;
               }

               var3 = (List)var13.next();
            } catch (CertificateParsingException var9) {
               var10001 = false;
               break;
            }

            if (var3 != null) {
               Integer var4;
               try {
                  if (var3.size() < 2) {
                     continue;
                  }

                  var4 = (Integer)var3.get(0);
               } catch (CertificateParsingException var8) {
                  var10001 = false;
                  break;
               }

               if (var4 != null) {
                  String var14;
                  try {
                     if (var4 != var1) {
                        continue;
                     }

                     var14 = (String)var3.get(1);
                  } catch (CertificateParsingException var7) {
                     var10001 = false;
                     break;
                  }

                  if (var14 != null) {
                     try {
                        var2.add(var14);
                     } catch (CertificateParsingException var6) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }
         }
      }

      return Collections.emptyList();
   }

   private static boolean a(String var0, String var1) {
      if (var0 != null && var0.length() != 0 && !var0.startsWith(".")) {
         if (var0.endsWith("..")) {
            return false;
         } else if (var1 != null && var1.length() != 0 && !var1.startsWith(".")) {
            if (var1.endsWith("..")) {
               return false;
            } else {
               String var3 = var0;
               if (!var0.endsWith(".")) {
                  StringBuilder var5 = new StringBuilder();
                  var5.append(var0);
                  var5.append('.');
                  var3 = var5.toString();
               }

               var0 = var1;
               if (!var1.endsWith(".")) {
                  StringBuilder var4 = new StringBuilder();
                  var4.append(var1);
                  var4.append('.');
                  var0 = var4.toString();
               }

               var0 = var0.toLowerCase(Locale.US);
               if (!var0.contains("*")) {
                  return var3.equals(var0);
               } else if (var0.startsWith("*.")) {
                  if (var0.indexOf(42, 1) != -1) {
                     return false;
                  } else if (var3.length() < var0.length()) {
                     return false;
                  } else if ("*.".equals(var0)) {
                     return false;
                  } else {
                     var0 = var0.substring(1);
                     if (!var3.endsWith(var0)) {
                        return false;
                     } else {
                        int var2 = var3.length() - var0.length();
                        return var2 <= 0 || var3.lastIndexOf(46, var2 - 1) == -1;
                     }
                  }
               } else {
                  return false;
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public final boolean verify(String var1, SSLSession var2) {
      int var3;
      List var37;
      int var38;
      boolean var10001;
      label284: {
         X509Certificate var34;
         try {
            var34 = (X509Certificate)var2.getPeerCertificates()[0];
            if (a.a.c.c(var1)) {
               var37 = a(var34, 7);
               var38 = var37.size();
               break label284;
            }
         } catch (SSLException var32) {
            var10001 = false;
            return false;
         }

         List var33;
         int var5;
         String var7;
         try {
            var7 = var1.toLowerCase(Locale.US);
            var33 = a(var34, 2);
            var5 = var33.size();
         } catch (SSLException var22) {
            var10001 = false;
            return false;
         }

         var3 = 0;

         boolean var4;
         for(var4 = false; var3 < var5; var4 = true) {
            try {
               if (a(var7, (String)var33.get(var3))) {
                  return true;
               }
            } catch (SSLException var31) {
               var10001 = false;
               return false;
            }

            ++var3;
         }

         StringBuilder var36;
         c var8;
         label281: {
            if (!var4) {
               try {
                  var8 = new c(var34.getSubjectX500Principal());
                  var8.c = 0;
                  var8.d = 0;
                  var8.e = 0;
                  var8.f = 0;
                  var8.g = var8.a.toCharArray();
                  var1 = var8.a();
               } catch (SSLException var21) {
                  var10001 = false;
                  return false;
               }

               Object var6 = null;
               String var35 = var1;
               if (var1 == null) {
                  var1 = (String)var6;
               } else {
                  while(true) {
                     var1 = "";

                     label277: {
                        try {
                           if (var8.c == var8.b) {
                              break label277;
                           }
                        } catch (SSLException var30) {
                           var10001 = false;
                           return false;
                        }

                        label268: {
                           label269: {
                              label270: {
                                 try {
                                    switch(var8.g[var8.c]) {
                                    case '"':
                                       break;
                                    case '#':
                                       break label269;
                                    case '+':
                                    case ',':
                                    case ';':
                                       break label268;
                                    default:
                                       break label270;
                                    }
                                 } catch (SSLException var29) {
                                    var10001 = false;
                                    return false;
                                 }

                                 try {
                                    ++var8.c;
                                    var8.d = var8.c;
                                    var8.e = var8.d;
                                 } catch (SSLException var18) {
                                    var10001 = false;
                                    return false;
                                 }

                                 while(true) {
                                    label209: {
                                       label272: {
                                          try {
                                             if (var8.c == var8.b) {
                                                break label272;
                                             }

                                             if (var8.g[var8.c] != '"') {
                                                break label209;
                                             }

                                             ++var8.c;
                                          } catch (SSLException var28) {
                                             var10001 = false;
                                             return false;
                                          }

                                          while(true) {
                                             try {
                                                if (var8.c >= var8.b || var8.g[var8.c] != ' ') {
                                                   break;
                                                }

                                                ++var8.c;
                                             } catch (SSLException var26) {
                                                var10001 = false;
                                                return false;
                                             }
                                          }

                                          try {
                                             var1 = new String(var8.g, var8.d, var8.e - var8.d);
                                             break label268;
                                          } catch (SSLException var15) {
                                             var10001 = false;
                                             return false;
                                          }
                                       }

                                       try {
                                          var36 = new StringBuilder("Unexpected end of DN: ");
                                          var36.append(var8.a);
                                          throw new IllegalStateException(var36.toString());
                                       } catch (SSLException var10) {
                                          var10001 = false;
                                          return false;
                                       }
                                    }

                                    label198: {
                                       try {
                                          if (var8.g[var8.c] == '\\') {
                                             var8.g[var8.e] = var8.d();
                                             break label198;
                                          }
                                       } catch (SSLException var27) {
                                          var10001 = false;
                                          return false;
                                       }

                                       try {
                                          var8.g[var8.e] = var8.g[var8.c];
                                       } catch (SSLException var17) {
                                          var10001 = false;
                                          return false;
                                       }
                                    }

                                    try {
                                       ++var8.c;
                                       ++var8.e;
                                    } catch (SSLException var16) {
                                       var10001 = false;
                                       return false;
                                    }
                                 }
                              }

                              try {
                                 var1 = var8.c();
                                 break label268;
                              } catch (SSLException var20) {
                                 var10001 = false;
                                 return false;
                              }
                           }

                           try {
                              var1 = var8.b();
                           } catch (SSLException var19) {
                              var10001 = false;
                              return false;
                           }
                        }

                        try {
                           if ("cn".equalsIgnoreCase(var35)) {
                              break;
                           }
                        } catch (SSLException var23) {
                           var10001 = false;
                           return false;
                        }

                        label176: {
                           try {
                              if (var8.c < var8.b) {
                                 break label176;
                              }
                           } catch (SSLException var25) {
                              var10001 = false;
                              return false;
                           }

                           var1 = (String)var6;
                           break;
                        }

                        try {
                           if (var8.g[var8.c] != ',' && var8.g[var8.c] != ';' && var8.g[var8.c] != '+') {
                              break label281;
                           }
                        } catch (SSLException var24) {
                           var10001 = false;
                           return false;
                        }

                        try {
                           ++var8.c;
                           var35 = var8.a();
                        } catch (SSLException var14) {
                           var10001 = false;
                           return false;
                        }

                        if (var35 == null) {
                           try {
                              var36 = new StringBuilder("Malformed DN: ");
                              var36.append(var8.a);
                              throw new IllegalStateException(var36.toString());
                           } catch (SSLException var13) {
                              var10001 = false;
                              return false;
                           }
                        }
                        continue;
                     }

                     var1 = (String)var6;
                     break;
                  }
               }

               if (var1 != null) {
                  try {
                     return a(var7, var1);
                  } catch (SSLException var11) {
                     var10001 = false;
                     return false;
                  }
               }
            }

            return false;
         }

         try {
            var36 = new StringBuilder("Malformed DN: ");
            var36.append(var8.a);
            throw new IllegalStateException(var36.toString());
         } catch (SSLException var12) {
            var10001 = false;
            return false;
         }
      }

      for(var3 = 0; var3 < var38; ++var3) {
         try {
            if (var1.equalsIgnoreCase((String)var37.get(var3))) {
               return true;
            }
         } catch (SSLException var9) {
            var10001 = false;
            return false;
         }
      }

      return false;
   }
}
