package a;

import java.util.*;
import a.a.*;

public static final class a
{
    final List<String> a;
    
    public a() {
        super();
        this.a = new ArrayList<String>(20);
    }
    
    static void b(final String s, final String s2) {
        if (s == null) {
            throw new NullPointerException("name == null");
        }
        if (s.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 <= ' ' || char1 >= '\u007f') {
                throw new IllegalArgumentException(c.a("Unexpected char %#04x at %d in header name: %s", new Object[] { (int)char1, i, s }));
            }
        }
        if (s2 != null) {
            for (int length2 = s2.length(), j = 0; j < length2; ++j) {
                final char char2 = s2.charAt(j);
                if ((char2 <= '\u001f' && char2 != '\t') || char2 >= '\u007f') {
                    throw new IllegalArgumentException(c.a("Unexpected char %#04x at %d in %s value: %s", (int)char2, j, s, s2));
                }
            }
            return;
        }
        throw new NullPointerException("value == null");
    }
    
    public final a a(final String s) {
        int n;
        for (int i = 0; i < this.a.size(); i = n + 2) {
            n = i;
            if (s.equalsIgnoreCase(this.a.get(i))) {
                this.a.remove(i);
                this.a.remove(i);
                n = i - 2;
            }
        }
        return this;
    }
    
    final a a(final String s, final String s2) {
        this.a.add(s);
        this.a.add(s2.trim());
        return this;
    }
    
    public final q a() {
        return new q(this);
    }
}
