/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a;

import a.aa;
import a.r;
import a.y;
import b.e;
import b.f;
import b.s;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Array;
import java.net.IDN;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c {
    public static final byte[] a = new byte[0];
    public static final String[] b = new String[0];
    public static final aa c = aa.a(a);
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
        byte[] arrby = a;
        int n2 = arrby.length;
        if (arrby == null) throw new NullPointerException("content == null");
        c.a(arrby.length, n2);
        d = new y(n2, arrby){
            final /* synthetic */ a.t a;
            final /* synthetic */ int b;
            final /* synthetic */ byte[] c;
            final /* synthetic */ int d;
            {
                this.a = null;
                this.b = n2;
                this.c = arrby;
                this.d = 0;
            }

            @Override
            public final a.t a() {
                return this.a;
            }

            @Override
            public final void a(b.d d2) {
                d2.b(this.c, this.d, this.b);
            }

            @Override
            public final long b() {
                return this.b;
            }
        };
        g = f.b("efbbbf");
        h = f.b("feff");
        i = f.b("fffe");
        j = f.b("0000ffff");
        k = f.b("ffff0000");
        e = Charset.forName("UTF-8");
        l = Charset.forName("UTF-16BE");
        m = Charset.forName("UTF-16LE");
        n = Charset.forName("UTF-32BE");
        o = Charset.forName("UTF-32LE");
        f = TimeZone.getTimeZone("GMT");
        p = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /*
     * WARNING - bad return control flow
     */
    public static int a(String string, int n2, int n3) {
        block3 : while (n2 < n3) {
            switch (string.charAt(n2)) {
                case '\t': 
                case '\n': 
                case '\f': 
                case '\r': 
                case ' ': {
                    ++n2;
                    continue block3;
                }
            }
        }
        return n3;
        return n2;
    }

    public static int a(String string, int n2, int n3, char c2) {
        while (n2 < n3) {
            if (string.charAt(n2) == c2) {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    public static int a(String string, int n2, int n3, String string2) {
        while (n2 < n3) {
            if (string2.indexOf(string.charAt(n2)) != -1) {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    public static <T> int a(T[] arrT, T t2) {
        int n2 = arrT.length;
        int n3 = 0;
        while (n3 < n2) {
            if (c.a(arrT[n3], t2)) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static String a(r r2, boolean bl) {
        CharSequence charSequence;
        if (r2.b.contains(":")) {
            charSequence = new StringBuilder("[");
            ((StringBuilder)charSequence).append(r2.b);
            ((StringBuilder)charSequence).append("]");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = r2.b;
        }
        if (!bl) {
            if (r2.c == r.a(r2.a)) return charSequence;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append(":");
        stringBuilder.append(r2.c);
        return stringBuilder.toString();
    }

    public static String a(String string) {
        try {
            int n2;
            block6 : {
                string = IDN.toASCII(string).toLowerCase(Locale.US);
                if (string.isEmpty()) {
                    return null;
                }
                int n3 = 0;
                do {
                    n2 = string.length();
                    int n4 = 1;
                    if (n3 >= n2) break;
                    char c2 = string.charAt(n3);
                    n2 = n4;
                    if (c2 <= '\u001f') break block6;
                    if (c2 >= '') {
                        n2 = n4;
                        break block6;
                    }
                    n2 = " #%/:?@[\\]".indexOf(c2);
                    if (n2 != -1) {
                        n2 = n4;
                        break block6;
                    }
                    ++n3;
                } while (true);
                n2 = 0;
            }
            if (n2 == 0) return string;
            return null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public static String a(String string, Object ... arrobject) {
        return String.format(Locale.US, string, arrobject);
    }

    public static Charset a(e e2, Charset charset) {
        if (e2.b(g)) {
            e2.f(g.g());
            return e;
        }
        if (e2.b(h)) {
            e2.f(h.g());
            return l;
        }
        if (e2.b(i)) {
            e2.f(i.g());
            return m;
        }
        if (e2.b(j)) {
            e2.f(j.g());
            return n;
        }
        if (!e2.b(k)) return charset;
        e2.f(k.g());
        return o;
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList<T>(list));
    }

    public static <T> List<T> a(T ... arrT) {
        return Collections.unmodifiableList(Arrays.asList((Object[])arrT.clone()));
    }

    public static ThreadFactory a(final String string, final boolean bl) {
        return new ThreadFactory(){

            @Override
            public final Thread newThread(Runnable runnable) {
                runnable = new Thread(runnable, string);
                ((Thread)runnable).setDaemon(bl);
                return runnable;
            }
        };
    }

    public static void a(long l2, long l3) {
        if ((l3 | 0L) < 0L) throw new ArrayIndexOutOfBoundsException();
        if (0L > l2) throw new ArrayIndexOutOfBoundsException();
        if (l2 - 0L < l3) throw new ArrayIndexOutOfBoundsException();
    }

    public static void a(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void a(Socket socket) {
        if (socket == null) return;
        try {
            socket.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (AssertionError assertionError) {
            if (!c.a(assertionError)) throw assertionError;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static boolean a(b.r r2, int n2, TimeUnit object) {
        long l2;
        long l3;
        block6 : {
            l2 = System.nanoTime();
            l3 = r2.a().d_() ? r2.a().c() - l2 : Long.MAX_VALUE;
            r2.a().a(Math.min(l3, ((TimeUnit)((Object)object)).toNanos(n2)) + l2);
            try {
                object = new b.c();
                while (r2.a((b.c)object, 8192L) != -1L) {
                    ((b.c)object).o();
                }
                if (l3 != Long.MAX_VALUE) break block6;
                r2.a().e_();
            }
            catch (Throwable throwable) {
                if (l3 == Long.MAX_VALUE) {
                    r2.a().e_();
                    throw throwable;
                }
                r2.a().a(l2 + l3);
                throw throwable;
            }
            catch (InterruptedIOException interruptedIOException) {}
            return true;
        }
        r2.a().a(l2 + l3);
        return true;
        if (l3 == Long.MAX_VALUE) {
            r2.a().e_();
            return false;
        }
        r2.a().a(l2 + l3);
        return false;
    }

    public static boolean a(b.r r2, TimeUnit timeUnit) {
        try {
            return c.a(r2, 100, timeUnit);
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static boolean a(AssertionError assertionError) {
        if (((Throwable)((Object)assertionError)).getCause() == null) return false;
        if (((Throwable)((Object)assertionError)).getMessage() == null) return false;
        if (!((Throwable)((Object)assertionError)).getMessage().contains("getsockname failed")) return false;
        return true;
    }

    public static boolean a(Object object, Object object2) {
        if (object == object2) return true;
        if (object == null) return false;
        if (!object.equals(object2)) return false;
        return true;
    }

    public static <T> T[] a(Class<T> class_, T[] arrT, T[] arrT2) {
        ArrayList<T> arrayList = new ArrayList<T>();
        int n2 = arrT.length;
        int n3 = 0;
        while (n3 < n2) {
            T t2 = arrT[n3];
            for (T t3 : arrT2) {
                if (!t2.equals(t3)) continue;
                arrayList.add(t3);
                break;
            }
            ++n3;
        }
        return arrayList.toArray((Object[])Array.newInstance(class_, arrayList.size()));
    }

    public static String[] a(String[] arrstring, String string) {
        String[] arrstring2 = new String[arrstring.length + 1];
        System.arraycopy(arrstring, 0, arrstring2, 0, arrstring.length);
        arrstring2[arrstring2.length - 1] = string;
        return arrstring2;
    }

    public static int b(String string) {
        int n2 = string.length();
        int n3 = 0;
        while (n3 < n2) {
            char c2 = string.charAt(n3);
            if (c2 <= '\u001f') return n3;
            if (c2 >= '') {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    /*
     * WARNING - bad return control flow
     */
    public static int b(String string, int n2, int n3) {
        --n3;
        block3 : while (n3 >= n2) {
            switch (string.charAt(n3)) {
                case '\t': 
                case '\n': 
                case '\f': 
                case '\r': 
                case ' ': {
                    --n3;
                    continue block3;
                }
            }
        }
        return n2;
        return n3 + 1;
    }

    public static String c(String string, int n2, int n3) {
        n2 = c.a(string, n2, n3);
        return string.substring(n2, c.b(string, n2, n3));
    }

    public static boolean c(String string) {
        return p.matcher(string).matches();
    }

}

