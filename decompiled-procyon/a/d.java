package a;

import java.util.concurrent.*;
import a.a.c.*;

public final class d
{
    public static final d a;
    public static final d b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final boolean k;
    String l;
    private final int m;
    private final boolean n;
    
    static {
        final a a2 = new a();
        a2.a = true;
        a = a2.a();
        final a a3 = new a();
        a3.f = true;
        final long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        int d;
        if (seconds > 2147483647L) {
            d = Integer.MAX_VALUE;
        }
        else {
            d = (int)seconds;
        }
        a3.d = d;
        b = a3.a();
    }
    
    d(final a a) {
        super();
        this.c = a.a;
        this.d = a.b;
        this.e = a.c;
        this.m = -1;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = a.d;
        this.j = a.e;
        this.k = a.f;
        this.n = a.g;
    }
    
    private d(final boolean c, final boolean d, final int e, final int m, final boolean f, final boolean g, final boolean h, final int i, final int j, final boolean k, final boolean n, final String l) {
        super();
        this.c = c;
        this.d = d;
        this.e = e;
        this.m = m;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.n = n;
        this.l = l;
    }
    
    public static d a(final q q) {
        final int n = q.a.length / 2;
        int i = 0;
        int n2 = 1;
        String s = null;
        boolean b = false;
        boolean b2 = false;
        int n3 = -1;
        int n4 = -1;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;
        int n5 = -1;
        int n6 = -1;
        boolean b6 = false;
        boolean b7 = false;
        while (i < n) {
            final String a = q.a(i);
            final String b8 = q.b(i);
            int n7 = 0;
            String s2 = null;
            boolean b9 = false;
            boolean b10 = false;
            int n8 = 0;
            int n9 = 0;
            boolean b11 = false;
            boolean b12 = false;
            boolean b13 = false;
            int n10 = 0;
            int n11 = 0;
            boolean b14 = false;
            boolean b15 = false;
            Label_0670: {
                Label_0162: {
                    if (a.equalsIgnoreCase("Cache-Control")) {
                        if (s == null) {
                            s = b8;
                            break Label_0162;
                        }
                    }
                    else {
                        n7 = n2;
                        s2 = s;
                        b9 = b;
                        b10 = b2;
                        n8 = n3;
                        n9 = n4;
                        b11 = b3;
                        b12 = b4;
                        b13 = b5;
                        n10 = n5;
                        n11 = n6;
                        b14 = b6;
                        b15 = b7;
                        if (!a.equalsIgnoreCase("Pragma")) {
                            break Label_0670;
                        }
                    }
                    n2 = 0;
                }
                int a2 = 0;
                while (true) {
                    n7 = n2;
                    s2 = s;
                    b9 = b;
                    b10 = b2;
                    n8 = n3;
                    n9 = n4;
                    b11 = b3;
                    b12 = b4;
                    b13 = b5;
                    n10 = n5;
                    n11 = n6;
                    b14 = b6;
                    b15 = b7;
                    if (a2 >= b8.length()) {
                        break;
                    }
                    final int a3 = e.a(b8, a2, "=,;");
                    final String trim = b8.substring(a2, a3).trim();
                    String s3;
                    if (a3 != b8.length() && b8.charAt(a3) != ',' && b8.charAt(a3) != ';') {
                        final int a4 = e.a(b8, a3 + 1);
                        if (a4 < b8.length() && b8.charAt(a4) == '\"') {
                            final int n12 = a4 + 1;
                            final int a5 = e.a(b8, n12, "\"");
                            s3 = b8.substring(n12, a5);
                            a2 = a5 + 1;
                        }
                        else {
                            a2 = e.a(b8, a4, ",;");
                            s3 = b8.substring(a4, a2).trim();
                        }
                    }
                    else {
                        a2 = a3 + 1;
                        s3 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(trim)) {
                        b = true;
                    }
                    else if ("no-store".equalsIgnoreCase(trim)) {
                        b2 = true;
                    }
                    else {
                        int b16;
                        int b17;
                        int b18;
                        int b19;
                        if ("max-age".equalsIgnoreCase(trim)) {
                            b16 = e.b(s3, -1);
                            b17 = n6;
                            b18 = n5;
                            b19 = n4;
                        }
                        else if ("s-maxage".equalsIgnoreCase(trim)) {
                            b19 = e.b(s3, -1);
                            b16 = n3;
                            b18 = n5;
                            b17 = n6;
                        }
                        else {
                            if ("private".equalsIgnoreCase(trim)) {
                                b3 = true;
                                continue;
                            }
                            if ("public".equalsIgnoreCase(trim)) {
                                b4 = true;
                                continue;
                            }
                            if ("must-revalidate".equalsIgnoreCase(trim)) {
                                b5 = true;
                                continue;
                            }
                            if ("max-stale".equalsIgnoreCase(trim)) {
                                b18 = e.b(s3, Integer.MAX_VALUE);
                                b16 = n3;
                                b19 = n4;
                                b17 = n6;
                            }
                            else if ("min-fresh".equalsIgnoreCase(trim)) {
                                b17 = e.b(s3, -1);
                                b16 = n3;
                                b19 = n4;
                                b18 = n5;
                            }
                            else {
                                if ("only-if-cached".equalsIgnoreCase(trim)) {
                                    b6 = true;
                                    continue;
                                }
                                b16 = n3;
                                b19 = n4;
                                b18 = n5;
                                b17 = n6;
                                if ("no-transform".equalsIgnoreCase(trim)) {
                                    b7 = true;
                                    b16 = n3;
                                    b19 = n4;
                                    b18 = n5;
                                    b17 = n6;
                                }
                            }
                        }
                        n3 = b16;
                        n4 = b19;
                        n5 = b18;
                        n6 = b17;
                    }
                }
            }
            ++i;
            n2 = n7;
            s = s2;
            b = b9;
            b2 = b10;
            n3 = n8;
            n4 = n9;
            b3 = b11;
            b4 = b12;
            b5 = b13;
            n5 = n10;
            n6 = n11;
            b6 = b14;
            b7 = b15;
        }
        if (n2 == 0) {
            s = null;
        }
        return new d(b, b2, n3, n4, b3, b4, b5, n5, n6, b6, b7, s);
    }
    
    @Override
    public final String toString() {
        final String l = this.l;
        if (l != null) {
            return l;
        }
        final StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("no-cache, ");
        }
        if (this.d) {
            sb.append("no-store, ");
        }
        if (this.e != -1) {
            sb.append("max-age=");
            sb.append(this.e);
            sb.append(", ");
        }
        if (this.m != -1) {
            sb.append("s-maxage=");
            sb.append(this.m);
            sb.append(", ");
        }
        if (this.f) {
            sb.append("private, ");
        }
        if (this.g) {
            sb.append("public, ");
        }
        if (this.h) {
            sb.append("must-revalidate, ");
        }
        if (this.i != -1) {
            sb.append("max-stale=");
            sb.append(this.i);
            sb.append(", ");
        }
        if (this.j != -1) {
            sb.append("min-fresh=");
            sb.append(this.j);
            sb.append(", ");
        }
        if (this.k) {
            sb.append("only-if-cached, ");
        }
        if (this.n) {
            sb.append("no-transform, ");
        }
        String string;
        if (sb.length() == 0) {
            string = "";
        }
        else {
            sb.delete(sb.length() - 2, sb.length());
            string = sb.toString();
        }
        return this.l = string;
    }
    
    public static final class a
    {
        boolean a;
        boolean b;
        int c;
        int d;
        int e;
        boolean f;
        boolean g;
        
        public a() {
            super();
            this.c = -1;
            this.d = -1;
            this.e = -1;
        }
        
        public final d a() {
            return new d(this);
        }
    }
}
