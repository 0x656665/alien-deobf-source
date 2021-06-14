package a;

import java.util.*;
import java.util.regex.*;

public final class t
{
    private static final Pattern b;
    private static final Pattern c;
    final String a;
    private final String d;
    private final String e;
    private final String f;
    
    static {
        b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
        c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    }
    
    private t(final String d, final String e, final String f, final String a) {
        super();
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = a;
    }
    
    public static t a(final String s) {
        final Matcher matcher = t.b.matcher(s);
        if (!matcher.lookingAt()) {
            return null;
        }
        final String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        final String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        final Matcher matcher2 = t.c.matcher(s);
        int i = matcher.end();
        String s2 = null;
        while (i < s.length()) {
            matcher2.region(i, s.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            final String group = matcher2.group(1);
            String s3 = s2;
            if (group != null) {
                s3 = s2;
                if (group.equalsIgnoreCase("charset")) {
                    final String group2 = matcher2.group(2);
                    if (group2 != null) {
                        s3 = group2;
                        if (group2.startsWith("'")) {
                            s3 = group2;
                            if (group2.endsWith("'")) {
                                s3 = group2;
                                if (group2.length() > 2) {
                                    s3 = group2.substring(1, group2.length() - 1);
                                }
                            }
                        }
                    }
                    else {
                        s3 = matcher2.group(3);
                    }
                    if (s2 != null) {
                        if (!s3.equalsIgnoreCase(s2)) {
                            throw new IllegalArgumentException("Multiple different charsets: ".concat(String.valueOf(s)));
                        }
                    }
                }
            }
            i = matcher2.end();
            s2 = s3;
        }
        return new t(s, lowerCase, lowerCase2, s2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof t && ((t)o).d.equals(this.d);
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.d;
    }
}
