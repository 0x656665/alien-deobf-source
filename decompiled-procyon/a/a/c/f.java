package a.a.c;

public final class f
{
    public static boolean a(final String s) {
        return s.equals("POST") || s.equals("PUT") || s.equals("PATCH") || s.equals("PROPPATCH") || s.equals("REPORT");
    }
    
    public static boolean b(final String s) {
        return a(s) || s.equals("OPTIONS") || s.equals("DELETE") || s.equals("PROPFIND") || s.equals("MKCOL") || s.equals("LOCK");
    }
}
