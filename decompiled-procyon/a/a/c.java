package a.a;

import java.nio.charset.*;
import java.util.regex.*;
import a.*;
import b.*;
import java.util.*;
import java.net.*;
import java.util.concurrent.*;
import java.io.*;
import java.lang.reflect.*;

public final class c
{
    public static final byte[] a;
    public static final String[] b;
    public static final aa c;
    public static final y d;
    public static final Charset e;
    public static final TimeZone f;
    private static final f g;
    private static final f h;
    private static final f i;
    private static final f j;
    private static final f k;
    private static final Charset l;
    private static final Charset m;
    private static final Charset n;
    private static final Charset o;
    private static final Pattern p;
    
    static {
        a = new byte[0];
        b = new String[0];
        c = aa.a(a.a.c.a);
        final byte[] a2 = a.a.c.a;
        final int length = a2.length;
        if (a2 != null) {
            a(a2.length, length);
            d = new y() {
                final /* synthetic */ t a;
                final /* synthetic */ int b;
                final /* synthetic */ byte[] c;
                final /* synthetic */ int d;
                
                public y$1() {
                    this.a = null;
                    this.d = 0;
                    super();
                }
                
                @Override
                public final t a() {
                    return this.a;
                }
                
                @Override
                public final void a(final d d) {
                    d.b(a2, this.d, length);
                }
                
                @Override
                public final long b() {
                    return length;
                }
            };
            g = b.f.b("efbbbf");
            h = b.f.b("feff");
            i = b.f.b("fffe");
            j = b.f.b("0000ffff");
            k = b.f.b("ffff0000");
            e = Charset.forName("UTF-8");
            l = Charset.forName("UTF-16BE");
            m = Charset.forName("UTF-16LE");
            n = Charset.forName("UTF-32BE");
            o = Charset.forName("UTF-32LE");
            f = TimeZone.getTimeZone("GMT");
            p = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
            return;
        }
        throw new NullPointerException("content == null");
    }
    
    public static int a(final String s, int i, final int n) {
        while (i < n) {
            switch (s.charAt(i)) {
                default: {
                    return i;
                }
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ': {
                    ++i;
                    continue;
                }
            }
        }
        return n;
    }
    
    public static int a(final String s, int i, final int n, final char c) {
        while (i < n) {
            if (s.charAt(i) == c) {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static int a(final String s, int i, final int n, final String s2) {
        while (i < n) {
            if (s2.indexOf(s.charAt(i)) != -1) {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static <T> int a(final T[] array, final T t) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (a(array[i], t)) {
                return i;
            }
        }
        return -1;
    }
    
    public static String a(final r r, final boolean b) {
        String s;
        if (r.b.contains(":")) {
            final StringBuilder sb = new StringBuilder("[");
            sb.append(r.b);
            sb.append("]");
            s = sb.toString();
        }
        else {
            s = r.b;
        }
        if (!b && r.c == r.a(r.a)) {
            return s;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append(":");
        sb2.append(r.c);
        return sb2.toString();
    }
    
    public static String a(String lowerCase) {
        while (true) {
            int length;
            int n;
            int n2;
            int n3;
            char char1;
            Block_4_Outer:Block_6_Outer:
            while (true) {
                Label_0098: {
                    try {
                        lowerCase = IDN.toASCII(lowerCase).toLowerCase(Locale.US);
                        if (lowerCase.isEmpty()) {
                            return null;
                        }
                        break Label_0098;
                        length = lowerCase.length();
                        n = 1;
                        // \u0131ftrue(Label_0085:, n2 >= length)
                        // \u0131ftrue(Label_0060:, char1 < '\u007f')
                        // \u0131ftrue(Label_0087:, char1 <= '\u001f')
                        while (true) {
                            Label_0087: {
                                while (true) {
                                    Block_3: {
                                        break Block_3;
                                        Label_0085: {
                                            n3 = 0;
                                        }
                                        break Label_0087;
                                        n3 = n;
                                        break Label_0087;
                                        Label_0078:
                                        ++n2;
                                        continue Block_4_Outer;
                                        n3 = n;
                                        break Label_0087;
                                        Label_0093:
                                        return lowerCase;
                                    }
                                    char1 = lowerCase.charAt(n2);
                                    n3 = n;
                                    continue Block_6_Outer;
                                }
                            }
                            return null;
                            Label_0060: {
                                continue;
                            }
                        }
                    }
                    // \u0131ftrue(Label_0093:, n3 == 0)
                    // \u0131ftrue(Label_0078:, " #%/:?@[\\]".indexOf((int)char1) == -1)
                    catch (IllegalArgumentException ex) {
                        return null;
                    }
                }
                n2 = 0;
                continue;
            }
        }
    }
    
    public static String a(final String s, final Object... array) {
        return String.format(Locale.US, s, array);
    }
    
    public static Charset a(final e e, final Charset charset) {
        if (e.b(a.a.c.g)) {
            e.f(a.a.c.g.g());
            return a.a.c.e;
        }
        if (e.b(a.a.c.h)) {
            e.f(a.a.c.h.g());
            return a.a.c.l;
        }
        if (e.b(a.a.c.i)) {
            e.f(a.a.c.i.g());
            return a.a.c.m;
        }
        if (e.b(a.a.c.j)) {
            e.f(a.a.c.j.g());
            return a.a.c.n;
        }
        if (e.b(a.a.c.k)) {
            e.f(a.a.c.k.g());
            return a.a.c.o;
        }
        return charset;
    }
    
    public static <T> List<T> a(final List<T> list) {
        return Collections.unmodifiableList((List<? extends T>)new ArrayList<T>((Collection<? extends T>)list));
    }
    
    public static <T> List<T> a(final T... array) {
        return Collections.unmodifiableList((List<? extends T>)Arrays.asList((T[])array.clone()));
    }
    
    public static ThreadFactory a(final String s, final boolean b) {
        return new ThreadFactory() {
            final /* synthetic */ String a;
            final /* synthetic */ boolean b;
            
            c$1() {
                super();
            }
            
            @Override
            public final Thread newThread(final Runnable runnable) {
                final Thread thread = new Thread(runnable, s);
                thread.setDaemon(b);
                return thread;
            }
        };
    }
    
    public static void a(final long n, final long n2) {
        if ((n2 | 0x0L) >= 0L && 0L <= n && n - 0L >= n2) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public static void a(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0014;
        }
        try {
            closeable.close();
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (Exception ex2) {}
    }
    
    public static void a(final Socket socket) {
        if (socket == null) {
            goto Label_0023;
        }
        try {
            socket.close();
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (AssertionError assertionError) {
            if (a(assertionError)) {
                return;
            }
            throw assertionError;
        }
        catch (Exception ex2) {}
    }
    
    public static boolean a(final b.r r, final int n, final TimeUnit timeUnit) {
        final long nanoTime = System.nanoTime();
        long n2;
        if (r.a().d_()) {
            n2 = r.a().c() - nanoTime;
        }
        else {
            n2 = Long.MAX_VALUE;
        }
        r.a().a(Math.min(n2, timeUnit.toNanos(n)) + nanoTime);
        try {
            final b.c c = new b.c();
            while (r.a(c, 8192L) != -1L) {
                c.o();
            }
            return true;
        }
        catch (InterruptedIOException ex) {
            goto Label_0167;
        }
        finally {
            if (n2 == Long.MAX_VALUE) {
                r.a().e_();
            }
            else {
                r.a().a(nanoTime + n2);
            }
        }
    }
    
    public static boolean a(final b.r r, final TimeUnit timeUnit) {
        try {
            return a(r, 100, timeUnit);
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    public static boolean a(final AssertionError assertionError) {
        return assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains("getsockname failed");
    }
    
    public static boolean a(final Object o, final Object o2) {
        return o == o2 || (o != null && o.equals(o2));
    }
    
    public static <T> T[] a(final Class<T> clazz, final T[] array, final T[] array2) {
        final ArrayList<T> list = new ArrayList<T>();
        for (int length = array.length, i = 0; i < length; ++i) {
            final T t = array[i];
            for (int length2 = array2.length, j = 0; j < length2; ++j) {
                final T t2 = array2[j];
                if (t.equals(t2)) {
                    list.add(t2);
                    break;
                }
            }
        }
        return list.toArray((T[])Array.newInstance(clazz, list.size()));
    }
    
    public static String[] a(final String[] array, final String s) {
        final String[] array2 = new String[array.length + 1];
        System.arraycopy(array, 0, array2, 0, array.length);
        array2[array2.length - 1] = s;
        return array2;
    }
    
    public static int b(final String s) {
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 <= '\u001f') {
                return i;
            }
            if (char1 >= '\u007f') {
                return i;
            }
        }
        return -1;
    }
    
    public static int b(final String s, final int n, int i) {
        --i;
        while (i >= n) {
            switch (s.charAt(i)) {
                default: {
                    return i + 1;
                }
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ': {
                    --i;
                    continue;
                }
            }
        }
        return n;
    }
    
    public static String c(final String s, int a, final int n) {
        a = a(s, a, n);
        return s.substring(a, b(s, a, n));
    }
    
    public static boolean c(final String s) {
        return a.a.c.p.matcher(s).matches();
    }
}
