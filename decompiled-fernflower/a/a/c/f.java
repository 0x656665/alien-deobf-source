package a.a.c;

public final class f {
   public static boolean a(String var0) {
      return var0.equals("POST") || var0.equals("PUT") || var0.equals("PATCH") || var0.equals("PROPPATCH") || var0.equals("REPORT");
   }

   public static boolean b(String var0) {
      return a(var0) || var0.equals("OPTIONS") || var0.equals("DELETE") || var0.equals("PROPFIND") || var0.equals("MKCOL") || var0.equals("LOCK");
   }
}
