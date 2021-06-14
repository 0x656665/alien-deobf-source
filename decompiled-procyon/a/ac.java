package a;

public enum ac
{
    a("TLSv1.3"), 
    b("TLSv1.2"), 
    c("TLSv1.1"), 
    d("TLSv1"), 
    e("SSLv3");
    
    private static final /* synthetic */ ac[] g;
    final String f;
    
    static {
        g = new ac[] { ac.a, ac.b, ac.c, ac.d, ac.e };
    }
    
    private ac(final String f) {
        this.f = f;
    }
    
    public static ac a(final String s) {
        final int hashCode = s.hashCode();
        int n = 0;
        Label_0119: {
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070501: {
                            if (s.equals("TLSv1.3")) {
                                n = 0;
                                break Label_0119;
                            }
                            break;
                        }
                        case -503070502: {
                            if (s.equals("TLSv1.2")) {
                                n = 1;
                                break Label_0119;
                            }
                            break;
                        }
                        case -503070503: {
                            if (s.equals("TLSv1.1")) {
                                n = 2;
                                break Label_0119;
                            }
                            break;
                        }
                    }
                }
                else if (s.equals("TLSv1")) {
                    n = 3;
                    break Label_0119;
                }
            }
            else if (s.equals("SSLv3")) {
                n = 4;
                break Label_0119;
            }
            n = -1;
        }
        switch (n) {
            default: {
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(s)));
            }
            case 4: {
                return ac.e;
            }
            case 3: {
                return ac.d;
            }
            case 2: {
                return ac.c;
            }
            case 1: {
                return ac.b;
            }
            case 0: {
                return ac.a;
            }
        }
    }
    
    public static ac valueOf(final String s) {
        return Enum.valueOf(ac.class, s);
    }
    
    public static ac[] values() {
        return ac.g.clone();
    }
}
