package a.a.g;

import a.a.h.*;
import a.a.*;
import android.util.*;
import java.net.*;
import java.io.*;
import java.util.*;
import a.*;
import java.lang.reflect.*;
import java.security.cert.*;
import javax.net.ssl.*;

final class a extends e
{
    private final Class<?> a;
    private final d<Socket> b;
    private final d<Socket> d;
    private final d<Socket> e;
    private final d<Socket> f;
    private final b g;
    
    private a(final Class<?> a, final d<Socket> b, final d<Socket> d, final d<Socket> e, final d<Socket> f) {
        super();
        this.g = a.a.g.a.b.a();
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static e a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: \u0131nvokestat\u0131c    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //     5: astore_1       
        //     6: goto            18
        //     9: ldc             "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"
        //    11: \u0131nvokestat\u0131c    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    14: astore_1       
        //    15: goto            6
        //    18: new             La/a/g/d;
        //    21: dup            
        //    22: aconst_null    
        //    23: ldc             "setUseSessionTickets"
        //    25: \u0131const_1       
        //    26: anewarray       Ljava/lang/Class;
        //    29: dup            
        //    30: \u0131const_0       
        //    31: getstat\u0131c       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    34: aastore        
        //    35: \u0131nvokespec\u0131al   a/a/g/d.<init>:(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
        //    38: astore_3       
        //    39: new             La/a/g/d;
        //    42: dup            
        //    43: aconst_null    
        //    44: ldc             "setHostname"
        //    46: \u0131const_1       
        //    47: anewarray       Ljava/lang/Class;
        //    50: dup            
        //    51: \u0131const_0       
        //    52: ldc             Ljava/lang/String;.class
        //    54: aastore        
        //    55: \u0131nvokespec\u0131al   a/a/g/d.<init>:(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
        //    58: astore          4
        //    60: ldc             "android.net.Network"
        //    62: \u0131nvokestat\u0131c    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    65: pop            
        //    66: new             La/a/g/d;
        //    69: dup            
        //    70: ldc             [B.class
        //    72: ldc             "getAlpnSelectedProtocol"
        //    74: \u0131const_0       
        //    75: anewarray       Ljava/lang/Class;
        //    78: \u0131nvokespec\u0131al   a/a/g/d.<init>:(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
        //    81: astore_0       
        //    82: new             La/a/g/d;
        //    85: dup            
        //    86: aconst_null    
        //    87: ldc             "setAlpnProtocols"
        //    89: \u0131const_1       
        //    90: anewarray       Ljava/lang/Class;
        //    93: dup            
        //    94: \u0131const_0       
        //    95: ldc             [B.class
        //    97: aastore        
        //    98: \u0131nvokespec\u0131al   a/a/g/d.<init>:(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
        //   101: astore_2       
        //   102: goto            109
        //   105: aconst_null    
        //   106: astore_0       
        //   107: aconst_null    
        //   108: astore_2       
        //   109: new             La/a/g/a;
        //   112: dup            
        //   113: aload_1        
        //   114: aload_3        
        //   115: aload           4
        //   117: aload_0        
        //   118: aload_2        
        //   119: \u0131nvokespec\u0131al   a/a/g/a.<init>:(Ljava/lang/Class;La/a/g/d;La/a/g/d;La/a/g/d;La/a/g/d;)V
        //   122: astore_0       
        //   123: aload_0        
        //   124: areturn        
        //   125: astore_0       
        //   126: goto            9
        //   129: astore_0       
        //   130: aconst_null    
        //   131: areturn        
        //   132: astore_0       
        //   133: goto            105
        //   136: astore_2       
        //   137: goto            107
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  0      6      125    18     Ljava/lang/ClassNotFoundException;
        //  9      15     129    132    Ljava/lang/ClassNotFoundException;
        //  18     60     129    132    Ljava/lang/ClassNotFoundException;
        //  60     82     132    107    Ljava/lang/ClassNotFoundException;
        //  82     102    136    140    Ljava/lang/ClassNotFoundException;
        //  109    123    129    132    Ljava/lang/ClassNotFoundException;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public final a.a.h.b a(final X509TrustManager x509TrustManager) {
        try {
            final Class<?> forName = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(forName.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), forName.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        }
        catch (Exception ex) {
            return super.a(x509TrustManager);
        }
    }
    
    @Override
    public final Object a(final String s) {
        return this.g.a(s);
    }
    
    @Override
    public final String a(final SSLSocket sslSocket) {
        if (this.e == null) {
            return null;
        }
        if (!this.e.a(sslSocket)) {
            return null;
        }
        final byte[] array = (byte[])this.e.b(sslSocket, new Object[0]);
        if (array != null) {
            return new String(array, a.a.c.e);
        }
        return null;
    }
    
    @Override
    public final void a(int i, final String s, final Throwable t) {
        int n = 5;
        if (i != 5) {
            n = 3;
        }
        String string = s;
        if (t != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append('\n');
            sb.append(Log.getStackTraceString(t));
            string = sb.toString();
        }
        i = 0;
        int min;
        for (int length = string.length(); i < length; i = min + 1) {
            int index = string.indexOf(10, i);
            if (index == -1) {
                index = length;
            }
            while (true) {
                min = Math.min(index, i + 4000);
                Log.println(n, "OkHttp", string.substring(i, min));
                if (min >= index) {
                    break;
                }
                i = min;
            }
        }
    }
    
    @Override
    public final void a(final String s, final Object o) {
        if (!this.g.a(o)) {
            this.a(5, s, null);
        }
    }
    
    @Override
    public final void a(final Socket socket, final InetSocketAddress \u0131netSocketAddress, final int n) {
        try {
            socket.connect(\u0131netSocketAddress, n);
        }
        catch (SecurityException ex2) {
            final IOException ex = new IOException("Exception in connect");
            ex.initCause(ex2);
            throw ex;
        }
        catch (AssertionError assertionError) {
            if (a.a.c.a(assertionError)) {
                throw new IOException(assertionError);
            }
            throw assertionError;
        }
    }
    
    @Override
    public final void a(final SSLSocket sslSocket, final String s, final List<v> list) {
        if (s != null) {
            this.b.a(sslSocket, Boolean.TRUE);
            this.d.a(sslSocket, s);
        }
        if (this.f != null && this.f.a(sslSocket)) {
            final b.c c = new b.c();
            for (int size = list.size(), i = 0; i < size; ++i) {
                final v v = list.get(i);
                if (v != a.v.a) {
                    c.b(v.toString().length());
                    c.a(v.toString());
                }
            }
            this.f.b(sslSocket, c.n());
        }
    }
    
    @Override
    public final boolean b(String s) {
        while (true) {
            try {
                final Class<?> forName = Class.forName("android.security.NetworkSecurityPolicy");
                return (boolean)forName.getMethod("isCleartextTrafficPermitted", String.class).invoke(forName.getMethod("getInstance", (Class<?>[])new Class[0]).invoke(null, new Object[0]), s);
                throw new AssertionError();
            }
            catch (ClassNotFoundException | NoSuchMethodException ex) {
                return super.b(s);
            }
            catch (IllegalAccessException ex2) {}
            catch (IllegalArgumentException ex3) {}
            catch (InvocationTargetException s2) {}
            final String s2;
            s = s2;
            continue;
        }
    }
    
    static final class a extends b
    {
        private final Object a;
        private final Method b;
        
        a(final Object a, final Method b) {
            super();
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final List<Certificate> a(final List<Certificate> list, final String s) {
            try {
                return (List<Certificate>)this.b.invoke(this.a, list.toArray(new X509Certificate[list.size()]), "RSA", s);
            }
            catch (IllegalAccessException ex) {
                throw new AssertionError((Object)ex);
            }
            catch (InvocationTargetException ex3) {
                final SSLPeerUnverifiedException ex2 = new SSLPeerUnverifiedException(ex3.getMessage());
                ex2.initCause(ex3);
                throw ex2;
            }
        }
        
        @Override
        public final boolean equals(final Object o) {
            return o instanceof a;
        }
        
        @Override
        public final int hashCode() {
            return 0;
        }
    }
    
    static final class b
    {
        private final Method a;
        private final Method b;
        private final Method c;
        
        private b(final Method a, final Method b, final Method c) {
            super();
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        static b a() {
            Method method = null;
            while (true) {
                try {
                    final Class<?> forName = Class.forName("dalvik.system.CloseGuard");
                    final Method method2 = forName.getMethod("get", (Class<?>[])new Class[0]);
                    Method method3 = forName.getMethod("open", String.class);
                    Method method4 = forName.getMethod("warnIfOpen", (Class<?>[])new Class[0]);
                    method = method2;
                    return new b(method, method3, method4);
                    method4 = (method3 = null);
                    return new b(method, method3, method4);
                }
                catch (Exception ex) {}
                continue;
            }
        }
        
        final Object a(final String s) {
            Label_0039: {
                if (this.a == null) {
                    break Label_0039;
                }
                try {
                    final Object invoke = this.a.invoke(null, new Object[0]);
                    this.b.invoke(invoke, s);
                    return invoke;
                    return null;
                }
                catch (Exception ex) {
                    return null;
                }
            }
        }
        
        final boolean a(final Object o) {
            boolean b = false;
            if (o == null) {
                return b;
            }
            try {
                this.c.invoke(o, new Object[0]);
                b = true;
                return b;
            }
            catch (Exception ex) {
                return false;
            }
        }
    }
}
