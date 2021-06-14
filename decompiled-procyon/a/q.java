package a;

import java.util.*;
import a.a.*;

public final class q
{
    public final String[] a;
    
    q(final a a) {
        super();
        this.a = a.a.toArray(new String[a.a.size()]);
    }
    
    public final a a() {
        final a a = new a();
        Collections.addAll(a.a, this.a);
        return a;
    }
    
    public final String a(final int n) {
        return this.a[n * 2];
    }
    
    public final String a(final String s) {
        final String[] a = this.a;
        for (int i = a.length - 2; i >= 0; i -= 2) {
            if (s.equalsIgnoreCase(a[i])) {
                return a[i + 1];
            }
        }
        return null;
    }
    
    public final String b(final int n) {
        return this.a[n * 2 + 1];
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof q && Arrays.equals(((q)o).a, this.a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int n = this.a.length / 2, i = 0; i < n; ++i) {
            sb.append(this.a(i));
            sb.append(": ");
            sb.append(this.b(i));
            sb.append("\n");
        }
        return sb.toString();
    }
    
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
}
