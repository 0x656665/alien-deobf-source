package a.a.h;

import java.security.cert.*;
import java.util.*;
import a.a.*;
import javax.net.ssl.*;

public final class d implements HostnameVerifier
{
    public static final d a;
    
    static {
        a = new d();
    }
    
    private d() {
        super();
    }
    
    public static List<String> a(final X509Certificate x509Certificate) {
        final List<String> a = a(x509Certificate, 7);
        final List<String> a2 = a(x509Certificate, 2);
        final ArrayList list = new ArrayList<Object>(a.size() + a2.size());
        list.addAll((Collection<?>)a);
        list.addAll((Collection<?>)a2);
        return (List<String>)list;
    }
    
    private static List<String> a(final X509Certificate x509Certificate, final int n) {
        final ArrayList<String> list = new ArrayList<String>();
        try {
            final Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (final List<Integer> list2 : subjectAlternativeNames) {
                if (list2 != null && list2.size() >= 2) {
                    final Integer n2 = list2.get(0);
                    if (n2 == null || n2 != n) {
                        continue;
                    }
                    final String s = (String)list2.get(1);
                    if (s == null) {
                        continue;
                    }
                    list.add(s);
                }
            }
            return list;
        }
        catch (CertificateParsingException ex) {
            return Collections.emptyList();
        }
    }
    
    private static boolean a(String s, final String s2) {
        if (s == null || s.length() == 0 || s.startsWith(".")) {
            return false;
        }
        if (s.endsWith("..")) {
            return false;
        }
        if (s2 == null || s2.length() == 0 || s2.startsWith(".")) {
            return false;
        }
        if (s2.endsWith("..")) {
            return false;
        }
        String string = s;
        if (!s.endsWith(".")) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append('.');
            string = sb.toString();
        }
        s = s2;
        if (!s2.endsWith(".")) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s2);
            sb2.append('.');
            s = sb2.toString();
        }
        s = s.toLowerCase(Locale.US);
        if (!s.contains("*")) {
            return string.equals(s);
        }
        if (!s.startsWith("*.")) {
            return false;
        }
        if (s.indexOf(42, 1) != -1) {
            return false;
        }
        if (string.length() < s.length()) {
            return false;
        }
        if ("*.".equals(s)) {
            return false;
        }
        s = s.substring(1);
        if (!string.endsWith(s)) {
            return false;
        }
        final int n = string.length() - s.length();
        return n <= 0 || string.lastIndexOf(46, n - 1) == -1;
    }
    
    @Override
    public final boolean verify(String o, final SSLSession sslSession) {
        X509Certificate x509Certificate;
        List<String> a;
        int size;
        int n = 0;
        String lowerCase;
        List<String> a2;
        int size2;
        int n2 = 0;
        int n3;
        a.a.h.c c;
        Object o2;
        Object a3;
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        Label_0036_Outer:Label_0089_Outer:Label_0276_Outer:
        while (true) {
            while (true) {
            Label_0762:
                while (true) {
                Label_0752:
                    while (true) {
                        Label_0743: {
                            try {
                                x509Certificate = (X509Certificate)sslSession.getPeerCertificates()[0];
                            Label_0559:
                                while (true) {
                                    if (a.a.c.c((String)o)) {
                                        a = a(x509Certificate, 7);
                                        size = a.size();
                                        n = 0;
                                        if (n >= size) {
                                            break;
                                        }
                                        if (((String)o).equalsIgnoreCase(a.get(n))) {
                                            return true;
                                        }
                                        break Label_0743;
                                    }
                                    else {
                                        lowerCase = ((String)o).toLowerCase(Locale.US);
                                        a2 = a(x509Certificate, 2);
                                        size2 = a2.size();
                                        n2 = 0;
                                        n3 = 0;
                                        if (n2 >= size2) {
                                            if (n3 == 0) {
                                                c = new a.a.h.c(x509Certificate.getSubjectX500Principal());
                                                c.c = 0;
                                                c.d = 0;
                                                c.e = 0;
                                                c.f = 0;
                                                c.g = c.a.toCharArray();
                                                o = c.a();
                                                o2 = null;
                                                Label_0587: {
                                                    if ((a3 = o) == null) {
                                                        o = o2;
                                                        break Label_0587;
                                                    }
                                                    while (true) {
                                                        o = "";
                                                        if (c.c == c.b) {
                                                            o = o2;
                                                            break;
                                                        }
                                                        switch (c.g[c.c]) {
                                                            case '\"': {
                                                                ++c.c;
                                                                c.d = c.c;
                                                                c.e = c.d;
                                                                while (c.c != c.b) {
                                                                    if (c.g[c.c] == '\"') {
                                                                        ++c.c;
                                                                        while (c.c < c.b && c.g[c.c] == ' ') {
                                                                            ++c.c;
                                                                        }
                                                                        o = new String(c.g, c.d, c.e - c.d);
                                                                        break Label_0559;
                                                                    }
                                                                    if (c.g[c.c] == '\\') {
                                                                        c.g[c.e] = c.d();
                                                                    }
                                                                    else {
                                                                        c.g[c.e] = c.g[c.c];
                                                                    }
                                                                    ++c.c;
                                                                    ++c.e;
                                                                }
                                                                sb = new StringBuilder("Unexpected end of DN: ");
                                                                sb.append(c.a);
                                                                throw new IllegalStateException(sb.toString());
                                                            }
                                                            case '+':
                                                            case ',':
                                                            case ';': {
                                                                if ("cn".equalsIgnoreCase((String)a3)) {
                                                                    break Label_0587;
                                                                }
                                                                if (c.c >= c.b) {
                                                                    o = o2;
                                                                    break Label_0587;
                                                                }
                                                                if (c.g[c.c] != ',' && c.g[c.c] != ';' && c.g[c.c] != '+') {
                                                                    sb2 = new StringBuilder("Malformed DN: ");
                                                                    sb2.append(c.a);
                                                                    throw new IllegalStateException(sb2.toString());
                                                                }
                                                                ++c.c;
                                                                a3 = c.a();
                                                                if (a3 != null) {
                                                                    continue Label_0036_Outer;
                                                                }
                                                                sb3 = new StringBuilder("Malformed DN: ");
                                                                sb3.append(c.a);
                                                                throw new IllegalStateException(sb3.toString());
                                                            }
                                                            case '#': {
                                                                o = c.b();
                                                                continue Label_0559;
                                                            }
                                                            default: {
                                                                break Label_0762;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (o != null) {
                                                    return a(lowerCase, (String)o);
                                                }
                                            }
                                            return false;
                                        }
                                        if (a(lowerCase, a2.get(n2))) {
                                            return true;
                                        }
                                        break Label_0752;
                                    }
                                    o = c.c();
                                    continue Label_0559;
                                }
                            }
                            catch (SSLException ex) {
                                return false;
                            }
                        }
                        ++n;
                        continue Label_0089_Outer;
                    }
                    ++n2;
                    n3 = 1;
                    continue Label_0276_Outer;
                }
                continue;
            }
        }
        return false;
    }
}
