/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class t {
    private static final Pattern b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    final String a;
    private final String d;
    private final String e;
    private final String f;

    private t(String string, String string2, String string3, String string4) {
        this.d = string;
        this.e = string2;
        this.f = string3;
        this.a = string4;
    }

    public static t a(String string) {
        Object object = b.matcher(string);
        if (!((Matcher)object).lookingAt()) {
            return null;
        }
        String string2 = ((Matcher)object).group(1).toLowerCase(Locale.US);
        String string3 = ((Matcher)object).group(2).toLowerCase(Locale.US);
        Matcher matcher = c.matcher(string);
        int n2 = ((Matcher)object).end();
        Matcher matcher2 = null;
        while (n2 < string.length()) {
            matcher.region(n2, string.length());
            if (!matcher.lookingAt()) {
                return null;
            }
            String string4 = matcher.group(1);
            object = matcher2;
            if (string4 != null) {
                object = matcher2;
                if (string4.equalsIgnoreCase("charset")) {
                    string4 = matcher.group(2);
                    if (string4 != null) {
                        object = string4;
                        if (string4.startsWith("'")) {
                            object = string4;
                            if (string4.endsWith("'")) {
                                object = string4;
                                if (string4.length() > 2) {
                                    object = string4.substring(1, string4.length() - 1);
                                }
                            }
                        }
                    } else {
                        object = matcher.group(3);
                    }
                    if (matcher2 != null) {
                        if (!((String)object).equalsIgnoreCase((String)((Object)matcher2))) throw new IllegalArgumentException("Multiple different charsets: ".concat(String.valueOf(string)));
                    }
                }
            }
            n2 = matcher.end();
            matcher2 = object;
        }
        return new t(string, string2, string3, (String)((Object)matcher2));
    }

    public final boolean equals(Object object) {
        if (!(object instanceof t)) return false;
        if (!((t)object).d.equals(this.d)) return false;
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return this.d;
    }
}

