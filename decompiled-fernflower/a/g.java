package a;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class g {
   public static final g A = a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
   public static final g B = a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
   public static final g C = a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
   public static final g D = a("TLS_RSA_WITH_AES_128_CBC_SHA");
   public static final g E = a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
   public static final g F = a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
   public static final g G = a("TLS_DH_anon_WITH_AES_128_CBC_SHA");
   public static final g H = a("TLS_RSA_WITH_AES_256_CBC_SHA");
   public static final g I = a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
   public static final g J = a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
   public static final g K = a("TLS_DH_anon_WITH_AES_256_CBC_SHA");
   public static final g L = a("TLS_RSA_WITH_NULL_SHA256");
   public static final g M = a("TLS_RSA_WITH_AES_128_CBC_SHA256");
   public static final g N = a("TLS_RSA_WITH_AES_256_CBC_SHA256");
   public static final g O = a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
   public static final g P = a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
   public static final g Q = a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
   public static final g R = a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
   public static final g S = a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
   public static final g T = a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
   public static final g U = a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
   public static final g V = a("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
   public static final g W = a("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
   public static final g X = a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
   public static final g Y = a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
   public static final g Z = a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
   public static final g a = a("SSL_RSA_WITH_NULL_MD5");
   public static final g aA = a("TLS_ECDH_RSA_WITH_RC4_128_SHA");
   public static final g aB = a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
   public static final g aC = a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
   public static final g aD = a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
   public static final g aE = a("TLS_ECDHE_RSA_WITH_NULL_SHA");
   public static final g aF = a("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
   public static final g aG = a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
   public static final g aH = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
   public static final g aI = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
   public static final g aJ = a("TLS_ECDH_anon_WITH_NULL_SHA");
   public static final g aK = a("TLS_ECDH_anon_WITH_RC4_128_SHA");
   public static final g aL = a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
   public static final g aM = a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
   public static final g aN = a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
   public static final g aO = a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
   public static final g aP = a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
   public static final g aQ = a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
   public static final g aR = a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
   public static final g aS = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
   public static final g aT = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
   public static final g aU = a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
   public static final g aV = a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
   public static final g aW = a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
   public static final g aX = a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
   public static final g aY = a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
   public static final g aZ = a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
   public static final g aa = a("TLS_PSK_WITH_RC4_128_SHA");
   public static final g ab = a("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
   public static final g ac = a("TLS_PSK_WITH_AES_128_CBC_SHA");
   public static final g ad = a("TLS_PSK_WITH_AES_256_CBC_SHA");
   public static final g ae = a("TLS_RSA_WITH_SEED_CBC_SHA");
   public static final g af = a("TLS_RSA_WITH_AES_128_GCM_SHA256");
   public static final g ag = a("TLS_RSA_WITH_AES_256_GCM_SHA384");
   public static final g ah = a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
   public static final g ai = a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
   public static final g aj = a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
   public static final g ak = a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
   public static final g al = a("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
   public static final g am = a("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
   public static final g an = a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
   public static final g ao = a("TLS_FALLBACK_SCSV");
   public static final g ap = a("TLS_ECDH_ECDSA_WITH_NULL_SHA");
   public static final g aq = a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
   public static final g ar = a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
   public static final g as = a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
   public static final g at = a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
   public static final g au = a("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
   public static final g av = a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
   public static final g aw = a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
   public static final g ax = a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
   public static final g ay = a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
   public static final g az = a("TLS_ECDH_RSA_WITH_NULL_SHA");
   public static final g b = a("SSL_RSA_WITH_NULL_SHA");
   public static final g ba = a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
   public static final g bb = a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
   public static final g bc = a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
   public static final g bd = a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
   public static final g be = a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
   public static final g bf = a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
   public static final g bg = a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
   public static final g bh = a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
   private static final ConcurrentMap bj = new ConcurrentHashMap();
   public static final g c = a("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
   public static final g d = a("SSL_RSA_WITH_RC4_128_MD5");
   public static final g e = a("SSL_RSA_WITH_RC4_128_SHA");
   public static final g f = a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
   public static final g g = a("SSL_RSA_WITH_DES_CBC_SHA");
   public static final g h = a("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
   public static final g i = a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
   public static final g j = a("SSL_DHE_DSS_WITH_DES_CBC_SHA");
   public static final g k = a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
   public static final g l = a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
   public static final g m = a("SSL_DHE_RSA_WITH_DES_CBC_SHA");
   public static final g n = a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
   public static final g o = a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
   public static final g p = a("SSL_DH_anon_WITH_RC4_128_MD5");
   public static final g q = a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
   public static final g r = a("SSL_DH_anon_WITH_DES_CBC_SHA");
   public static final g s = a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
   public static final g t = a("TLS_KRB5_WITH_DES_CBC_SHA");
   public static final g u = a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
   public static final g v = a("TLS_KRB5_WITH_RC4_128_SHA");
   public static final g w = a("TLS_KRB5_WITH_DES_CBC_MD5");
   public static final g x = a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
   public static final g y = a("TLS_KRB5_WITH_RC4_128_MD5");
   public static final g z = a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
   final String bi;

   private g(String var1) {
      if (var1 != null) {
         this.bi = var1;
      } else {
         throw new NullPointerException();
      }
   }

   public static g a(String var0) {
      g var2 = (g)bj.get(var0);
      g var1 = var2;
      if (var2 == null) {
         var2 = new g(var0);
         var1 = (g)bj.putIfAbsent(var0, var2);
         if (var1 == null) {
            return var2;
         }
      }

      return var1;
   }

   public final String toString() {
      return this.bi;
   }
}
