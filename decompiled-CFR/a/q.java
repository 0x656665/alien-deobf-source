/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class q {
    public final String[] a;

    q(a a2) {
        this.a = a2.a.toArray(new String[a2.a.size()]);
    }

    public final a a() {
        a a2 = new a();
        Collections.addAll(a2.a, this.a);
        return a2;
    }

    public final String a(int n2) {
        return this.a[n2 * 2];
    }

    public final String a(String string) {
        String[] arrstring = this.a;
        int n2 = arrstring.length - 2;
        while (n2 >= 0) {
            if (string.equalsIgnoreCase(arrstring[n2])) {
                return arrstring[n2 + 1];
            }
            n2 -= 2;
        }
        return null;
    }

    public final String b(int n2) {
        return this.a[n2 * 2 + 1];
    }

    public final boolean equals(Object object) {
        if (!(object instanceof q)) return false;
        if (!Arrays.equals(((q)object).a, this.a)) return false;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = this.a.length / 2;
        int n3 = 0;
        while (n3 < n2) {
            stringBuilder.append(this.a(n3));
            stringBuilder.append(": ");
            stringBuilder.append(this.b(n3));
            stringBuilder.append("\n");
            ++n3;
        }
        return stringBuilder.toString();
    }

    public static final class a {
        final List<String> a = new ArrayList<String>(20);

        static void b(String string, String string2) {
            int n2;
            char c2;
            if (string == null) throw new NullPointerException("name == null");
            if (string.isEmpty()) throw new IllegalArgumentException("name is empty");
            int n3 = string.length();
            for (n2 = 0; n2 < n3; ++n2) {
                c2 = string.charAt(n2);
                if (c2 <= ' ' || c2 >= '') throw new IllegalArgumentException(c.a("Unexpected char %#04x at %d in header name: %s", new Object[]{(int)c2, n2, string}));
            }
            if (string2 == null) throw new NullPointerException("value == null");
            n3 = string2.length();
            n2 = 0;
            while (n2 < n3) {
                c2 = string2.charAt(n2);
                if (c2 <= '\u001f' && c2 != '\t' || c2 >= '') throw new IllegalArgumentException(c.a("Unexpected char %#04x at %d in %s value: %s", new Object[]{(int)c2, n2, string, string2}));
                ++n2;
            }
        }

        public final a a(String string) {
            int n2 = 0;
            while (n2 < this.a.size()) {
                int n3 = n2;
                if (string.equalsIgnoreCase(this.a.get(n2))) {
                    this.a.remove(n2);
                    this.a.remove(n2);
                    n3 = n2 - 2;
                }
                n2 = n3 + 2;
            }
            return this;
        }

        final a a(String string, String string2) {
            this.a.add(string);
            this.a.add(string2.trim());
            return this;
        }

        public final q a() {
            return new q(this);
        }
    }

}

