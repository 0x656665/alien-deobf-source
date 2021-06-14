/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.c.e;
import a.q;
import java.util.concurrent.TimeUnit;

public final class d {
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
        a a2 = new a();
        a2.a = true;
        a = a2.a();
        a2 = new a();
        a2.f = true;
        long l2 = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        int n2 = l2 > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l2;
        a2.d = n2;
        b = a2.a();
    }

    d(a a2) {
        this.c = a2.a;
        this.d = a2.b;
        this.e = a2.c;
        this.m = -1;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = a2.d;
        this.j = a2.e;
        this.k = a2.f;
        this.n = a2.g;
    }

    private d(boolean bl, boolean bl2, int n2, int n3, boolean bl3, boolean bl4, boolean bl5, int n4, int n5, boolean bl6, boolean bl7, String string) {
        this.c = bl;
        this.d = bl2;
        this.e = n2;
        this.m = n3;
        this.f = bl3;
        this.g = bl4;
        this.h = bl5;
        this.i = n4;
        this.j = n5;
        this.k = bl6;
        this.n = bl7;
        this.l = string;
    }

    public static d a(q q2) {
        int n2 = q2.a.length / 2;
        int n3 = 0;
        boolean bl = true;
        String string = null;
        boolean bl2 = false;
        boolean bl3 = false;
        int n4 = -1;
        int n5 = -1;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        int n6 = -1;
        int n7 = -1;
        boolean bl7 = false;
        boolean bl8 = false;
        do {
            int n8;
            boolean bl9;
            boolean bl10;
            boolean bl11;
            boolean bl12;
            boolean bl13;
            String string2;
            boolean bl14;
            boolean bl15;
            int n9;
            int n10;
            int n11;
            boolean bl16;
            block28 : {
                String string3;
                String string4;
                block27 : {
                    block26 : {
                        block25 : {
                            if (n3 >= n2) {
                                if (bl) return new d(bl2, bl3, n4, n5, bl4, bl5, bl6, n6, n7, bl7, bl8, string);
                                string = null;
                                return new d(bl2, bl3, n4, n5, bl4, bl5, bl6, n6, n7, bl7, bl8, string);
                            }
                            string4 = q2.a(n3);
                            string3 = q2.b(n3);
                            if (!string4.equalsIgnoreCase("Cache-Control")) break block25;
                            if (string != null) break block26;
                            string = string3;
                            break block27;
                        }
                        bl13 = bl;
                        string2 = string;
                        bl15 = bl2;
                        bl9 = bl3;
                        n8 = n4;
                        n10 = n5;
                        bl16 = bl4;
                        bl11 = bl5;
                        bl10 = bl6;
                        n9 = n6;
                        n11 = n7;
                        bl14 = bl7;
                        bl12 = bl8;
                        if (!string4.equalsIgnoreCase("Pragma")) break block28;
                    }
                    bl = false;
                }
                int n12 = 0;
                do {
                    bl13 = bl;
                    string2 = string;
                    bl15 = bl2;
                    bl9 = bl3;
                    n8 = n4;
                    n10 = n5;
                    bl16 = bl4;
                    bl11 = bl5;
                    bl10 = bl6;
                    n9 = n6;
                    n11 = n7;
                    bl14 = bl7;
                    bl12 = bl8;
                    if (n12 >= string3.length()) break;
                    n8 = e.a(string3, n12, "=,;");
                    string4 = string3.substring(n12, n8).trim();
                    if (n8 != string3.length() && string3.charAt(n8) != ',' && string3.charAt(n8) != ';') {
                        if ((n8 = e.a(string3, n8 + 1)) < string3.length() && string3.charAt(n8) == '\"') {
                            n12 = n8 + 1;
                            n8 = e.a(string3, n12, "\"");
                            string2 = string3.substring(n12, n8);
                            n12 = n8 + 1;
                        } else {
                            n12 = e.a(string3, n8, ",;");
                            string2 = string3.substring(n8, n12).trim();
                        }
                    } else {
                        n12 = n8 + 1;
                        string2 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(string4)) {
                        bl2 = true;
                        continue;
                    }
                    if ("no-store".equalsIgnoreCase(string4)) {
                        bl3 = true;
                        continue;
                    }
                    if ("max-age".equalsIgnoreCase(string4)) {
                        n8 = e.b(string2, -1);
                        n11 = n7;
                        n9 = n6;
                        n10 = n5;
                    } else if ("s-maxage".equalsIgnoreCase(string4)) {
                        n10 = e.b(string2, -1);
                        n8 = n4;
                        n9 = n6;
                        n11 = n7;
                    } else {
                        if ("private".equalsIgnoreCase(string4)) {
                            bl4 = true;
                            continue;
                        }
                        if ("public".equalsIgnoreCase(string4)) {
                            bl5 = true;
                            continue;
                        }
                        if ("must-revalidate".equalsIgnoreCase(string4)) {
                            bl6 = true;
                            continue;
                        }
                        if ("max-stale".equalsIgnoreCase(string4)) {
                            n9 = e.b(string2, Integer.MAX_VALUE);
                            n8 = n4;
                            n10 = n5;
                            n11 = n7;
                        } else if ("min-fresh".equalsIgnoreCase(string4)) {
                            n11 = e.b(string2, -1);
                            n8 = n4;
                            n10 = n5;
                            n9 = n6;
                        } else {
                            if ("only-if-cached".equalsIgnoreCase(string4)) {
                                bl7 = true;
                                continue;
                            }
                            n8 = n4;
                            n10 = n5;
                            n9 = n6;
                            n11 = n7;
                            if ("no-transform".equalsIgnoreCase(string4)) {
                                bl8 = true;
                                n8 = n4;
                                n10 = n5;
                                n9 = n6;
                                n11 = n7;
                            }
                        }
                    }
                    n4 = n8;
                    n5 = n10;
                    n6 = n9;
                    n7 = n11;
                } while (true);
            }
            ++n3;
            bl = bl13;
            string = string2;
            bl2 = bl15;
            bl3 = bl9;
            n4 = n8;
            n5 = n10;
            bl4 = bl16;
            bl5 = bl11;
            bl6 = bl10;
            n6 = n9;
            n7 = n11;
            bl7 = bl14;
            bl8 = bl12;
        } while (true);
    }

    public final String toString() {
        CharSequence charSequence = this.l;
        if (charSequence != null) {
            return charSequence;
        }
        charSequence = new StringBuilder();
        if (this.c) {
            ((StringBuilder)charSequence).append("no-cache, ");
        }
        if (this.d) {
            ((StringBuilder)charSequence).append("no-store, ");
        }
        if (this.e != -1) {
            ((StringBuilder)charSequence).append("max-age=");
            ((StringBuilder)charSequence).append(this.e);
            ((StringBuilder)charSequence).append(", ");
        }
        if (this.m != -1) {
            ((StringBuilder)charSequence).append("s-maxage=");
            ((StringBuilder)charSequence).append(this.m);
            ((StringBuilder)charSequence).append(", ");
        }
        if (this.f) {
            ((StringBuilder)charSequence).append("private, ");
        }
        if (this.g) {
            ((StringBuilder)charSequence).append("public, ");
        }
        if (this.h) {
            ((StringBuilder)charSequence).append("must-revalidate, ");
        }
        if (this.i != -1) {
            ((StringBuilder)charSequence).append("max-stale=");
            ((StringBuilder)charSequence).append(this.i);
            ((StringBuilder)charSequence).append(", ");
        }
        if (this.j != -1) {
            ((StringBuilder)charSequence).append("min-fresh=");
            ((StringBuilder)charSequence).append(this.j);
            ((StringBuilder)charSequence).append(", ");
        }
        if (this.k) {
            ((StringBuilder)charSequence).append("only-if-cached, ");
        }
        if (this.n) {
            ((StringBuilder)charSequence).append("no-transform, ");
        }
        if (((StringBuilder)charSequence).length() == 0) {
            charSequence = "";
        } else {
            ((StringBuilder)charSequence).delete(((StringBuilder)charSequence).length() - 2, ((StringBuilder)charSequence).length());
            charSequence = ((StringBuilder)charSequence).toString();
        }
        this.l = charSequence;
        return charSequence;
    }

    public static final class a {
        boolean a;
        boolean b;
        int c = -1;
        int d = -1;
        int e = -1;
        boolean f;
        boolean g;

        public final d a() {
            return new d(this);
        }
    }

}

