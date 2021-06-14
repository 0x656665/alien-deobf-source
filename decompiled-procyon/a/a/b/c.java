package a.a.b;

import java.lang.ref.*;
import java.util.*;
import b.*;
import a.*;
import a.a.e.*;
import java.net.*;
import java.io.*;

public final class c extends b implements h
{
    public final ab a;
    public Socket b;
    public p c;
    g d;
    e e;
    d f;
    public boolean g;
    public int h;
    public int i;
    public final List<Reference<a.a.b.g>> j;
    public long k;
    private final i m;
    private Socket n;
    private v o;
    
    public c(final i m, final ab a) {
        super();
        this.i = 1;
        this.j = new ArrayList<Reference<a.a.b.g>>();
        this.k = Long.MAX_VALUE;
        this.m = m;
        this.a = a;
    }
    
    private void a(final int n, final int soTimeout) {
        final Proxy b = this.a.b;
        final a.a a = this.a.a;
        Socket socket;
        if (b.type() != Proxy.Type.DIRECT && b.type() != Proxy.Type.HTTP) {
            socket = new Socket(b);
        }
        else {
            socket = a.c.createSocket();
        }
        (this.n = socket).setSoTimeout(soTimeout);
        try {
            a.a.g.e.b().a(this.n, this.a.c, n);
            this.e = b.k.a(b.k.b(this.n));
            this.f = b.k.a(b.k.a(this.n));
        }
        catch (ConnectException ex2) {
            final StringBuilder sb = new StringBuilder("Failed to connect to ");
            sb.append(this.a.c);
            final ConnectException ex = new ConnectException(sb.toString());
            ex.initCause(ex2);
            throw ex;
        }
    }
    
    @Override
    public final ab a() {
        return this.a;
    }
    
    public final void a(final int p0, final int p1, final int p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getf\u0131eld        a/a/b/c.o:La/v;
        //     4: \u0131fnonnull       1593
        //     7: aload_0        
        //     8: getf\u0131eld        a/a/b/c.a:La/ab;
        //    11: getf\u0131eld        a/ab.a:La/a;
        //    14: getf\u0131eld        a/a.f:Ljava/util/List;
        //    17: astore          12
        //    19: new             La/a/b/b;
        //    22: dup            
        //    23: aload           12
        //    25: \u0131nvokespec\u0131al   a/a/b/b.<init>:(Ljava/util/List;)V
        //    28: astore          16
        //    30: aload_0        
        //    31: getf\u0131eld        a/a/b/c.a:La/ab;
        //    34: getf\u0131eld        a/ab.a:La/a;
        //    37: getf\u0131eld        a/a.i:Ljavax/net/ssl/SSLSocketFactory;
        //    40: \u0131fnonnull       149
        //    43: aload           12
        //    45: getstat\u0131c       a/j.c:La/j;
        //    48: \u0131nvoke\u0131nterface java/util/List.contains:(Ljava/lang/Object;)Z
        //    53: \u0131feq            132
        //    56: aload_0        
        //    57: getf\u0131eld        a/a/b/c.a:La/ab;
        //    60: getf\u0131eld        a/ab.a:La/a;
        //    63: getf\u0131eld        a/a.a:La/r;
        //    66: getf\u0131eld        a/r.b:Ljava/lang/String;
        //    69: astore          12
        //    71: \u0131nvokestat\u0131c    a/a/g/e.b:()La/a/g/e;
        //    74: aload           12
        //    76: \u0131nvokev\u0131rtual   a/a/g/e.b:(Ljava/lang/String;)Z
        //    79: \u0131feq            85
        //    82: goto            149
        //    85: new             Ljava/lang/StringBuilder;
        //    88: dup            
        //    89: ldc             "CLEARTEXT communication to "
        //    91: \u0131nvokespec\u0131al   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    94: astore          13
        //    96: aload           13
        //    98: aload           12
        //   100: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: pop            
        //   104: aload           13
        //   106: ldc             " not permitted by network security policy"
        //   108: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   111: pop            
        //   112: new             La/a/b/e;
        //   115: dup            
        //   116: new             Ljava/net/UnknownServiceException;
        //   119: dup            
        //   120: aload           13
        //   122: \u0131nvokev\u0131rtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   125: \u0131nvokespec\u0131al   java/net/UnknownServiceException.<init>:(Ljava/lang/String;)V
        //   128: \u0131nvokespec\u0131al   a/a/b/e.<init>:(Ljava/io/IOException;)V
        //   131: athrow         
        //   132: new             La/a/b/e;
        //   135: dup            
        //   136: new             Ljava/net/UnknownServiceException;
        //   139: dup            
        //   140: ldc             "CLEARTEXT communication not enabled for client"
        //   142: \u0131nvokespec\u0131al   java/net/UnknownServiceException.<init>:(Ljava/lang/String;)V
        //   145: \u0131nvokespec\u0131al   a/a/b/e.<init>:(Ljava/io/IOException;)V
        //   148: athrow         
        //   149: aconst_null    
        //   150: astore          12
        //   152: \u0131const_1       
        //   153: \u0131store          6
        //   155: aload_0        
        //   156: getf\u0131eld        a/a/b/c.a:La/ab;
        //   159: astore          13
        //   161: aload           13
        //   163: getf\u0131eld        a/ab.a:La/a;
        //   166: getf\u0131eld        a/a.i:Ljavax/net/ssl/SSLSocketFactory;
        //   169: \u0131fnull          1604
        //   172: aload           13
        //   174: getf\u0131eld        a/ab.b:Ljava/net/Proxy;
        //   177: \u0131nvokev\u0131rtual   java/net/Proxy.type:()Ljava/net/Proxy$Type;
        //   180: getstat\u0131c       java/net/Proxy$Type.HTTP:Ljava/net/Proxy$Type;
        //   183: \u0131f_acmpne       1604
        //   186: \u0131const_1       
        //   187: \u0131store          5
        //   189: goto            192
        //   192: \u0131load           5
        //   194: \u0131feq            581
        //   197: new             La/x$a;
        //   200: dup            
        //   201: \u0131nvokespec\u0131al   a/x$a.<init>:()V
        //   204: aload_0        
        //   205: getf\u0131eld        a/a/b/c.a:La/ab;
        //   208: getf\u0131eld        a/ab.a:La/a;
        //   211: getf\u0131eld        a/a.a:La/r;
        //   214: \u0131nvokev\u0131rtual   a/x$a.a:(La/r;)La/x$a;
        //   217: ldc             "Host"
        //   219: aload_0        
        //   220: getf\u0131eld        a/a/b/c.a:La/ab;
        //   223: getf\u0131eld        a/ab.a:La/a;
        //   226: getf\u0131eld        a/a.a:La/r;
        //   229: \u0131const_1       
        //   230: \u0131nvokestat\u0131c    a/a/c.a:(La/r;Z)Ljava/lang/String;
        //   233: \u0131nvokev\u0131rtual   a/x$a.a:(Ljava/lang/String;Ljava/lang/String;)La/x$a;
        //   236: ldc             "Proxy-Connection"
        //   238: ldc             "Keep-Alive"
        //   240: \u0131nvokev\u0131rtual   a/x$a.a:(Ljava/lang/String;Ljava/lang/String;)La/x$a;
        //   243: ldc             "User-Agent"
        //   245: ldc             "okhttp/3.6.0"
        //   247: \u0131nvokev\u0131rtual   a/x$a.a:(Ljava/lang/String;Ljava/lang/String;)La/x$a;
        //   250: \u0131nvokev\u0131rtual   a/x$a.a:()La/x;
        //   253: astore          13
        //   255: aload           13
        //   257: getf\u0131eld        a/x.a:La/r;
        //   260: astore          14
        //   262: aload_0        
        //   263: \u0131load_1        
        //   264: \u0131load_2        
        //   265: \u0131nvokespec\u0131al   a/a/b/c.a:(II)V
        //   268: new             Ljava/lang/StringBuilder;
        //   271: dup            
        //   272: ldc             "CONNECT "
        //   274: \u0131nvokespec\u0131al   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   277: astore          15
        //   279: aload           15
        //   281: aload           14
        //   283: \u0131const_1       
        //   284: \u0131nvokestat\u0131c    a/a/c.a:(La/r;Z)Ljava/lang/String;
        //   287: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   290: pop            
        //   291: aload           15
        //   293: ldc             " HTTP/1.1"
        //   295: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: pop            
        //   299: aload           15
        //   301: \u0131nvokev\u0131rtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   304: astore          15
        //   306: new             La/a/d/a;
        //   309: dup            
        //   310: aconst_null    
        //   311: aconst_null    
        //   312: aload_0        
        //   313: getf\u0131eld        a/a/b/c.e:Lb/e;
        //   316: aload_0        
        //   317: getf\u0131eld        a/a/b/c.f:Lb/d;
        //   320: \u0131nvokespec\u0131al   a/a/d/a.<init>:(La/u;La/a/b/g;Lb/e;Lb/d;)V
        //   323: astore          14
        //   325: aload_0        
        //   326: getf\u0131eld        a/a/b/c.e:Lb/e;
        //   329: \u0131nvoke\u0131nterface b/e.a:()Lb/s;
        //   334: astore          17
        //   336: \u0131load_2        
        //   337: \u01312l            
        //   338: lstore          8
        //   340: aload           17
        //   342: lload           8
        //   344: getstat\u0131c       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //   347: \u0131nvokev\u0131rtual   b/s.a:(JLjava/util/concurrent/TimeUnit;)Lb/s;
        //   350: pop            
        //   351: aload_0        
        //   352: getf\u0131eld        a/a/b/c.f:Lb/d;
        //   355: \u0131nvoke\u0131nterface b/d.a:()Lb/s;
        //   360: astore          17
        //   362: \u0131load_3        
        //   363: \u01312l            
        //   364: lstore          8
        //   366: aload           17
        //   368: lload           8
        //   370: getstat\u0131c       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //   373: \u0131nvokev\u0131rtual   b/s.a:(JLjava/util/concurrent/TimeUnit;)Lb/s;
        //   376: pop            
        //   377: aload           14
        //   379: aload           13
        //   381: getf\u0131eld        a/x.c:La/q;
        //   384: aload           15
        //   386: \u0131nvokev\u0131rtual   a/a/d/a.a:(La/q;Ljava/lang/String;)V
        //   389: aload           14
        //   391: \u0131nvokev\u0131rtual   a/a/d/a.b:()V
        //   394: aload           14
        //   396: \u0131const_0       
        //   397: \u0131nvokev\u0131rtual   a/a/d/a.a:(Z)La/z$a;
        //   400: astore          15
        //   402: aload           15
        //   404: aload           13
        //   406: putf\u0131eld        a/z$a.a:La/x;
        //   409: aload           15
        //   411: \u0131nvokev\u0131rtual   a/z$a.a:()La/z;
        //   414: astore          13
        //   416: aload           13
        //   418: \u0131nvokestat\u0131c    a/a/c/e.a:(La/z;)J
        //   421: lstore          10
        //   423: lload           10
        //   425: lstore          8
        //   427: lload           10
        //   429: ldc2_w          -1
        //   432: lcmp           
        //   433: \u0131fne            439
        //   436: lconst_0       
        //   437: lstore          8
        //   439: aload           14
        //   441: lload           8
        //   443: \u0131nvokev\u0131rtual   a/a/d/a.a:(J)Lb/r;
        //   446: astore          14
        //   448: aload           14
        //   450: ldc_w           2147483647
        //   453: getstat\u0131c       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //   456: \u0131nvokestat\u0131c    a/a/c.a:(Lb/r;ILjava/util/concurrent/TimeUnit;)Z
        //   459: pop            
        //   460: aload           14
        //   462: \u0131nvoke\u0131nterface b/r.close:()V
        //   467: aload           13
        //   469: getf\u0131eld        a/z.c:I
        //   472: \u0131store          5
        //   474: \u0131load           5
        //   476: s\u0131push          200
        //   479: \u0131f_\u0131cmpeq       537
        //   482: \u0131load           5
        //   484: s\u0131push          407
        //   487: \u0131f_\u0131cmpeq       526
        //   490: new             Ljava/lang/StringBuilder;
        //   493: dup            
        //   494: ldc_w           "Unexpected response code for CONNECT: "
        //   497: \u0131nvokespec\u0131al   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   500: astore          14
        //   502: aload           14
        //   504: aload           13
        //   506: getf\u0131eld        a/z.c:I
        //   509: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   512: pop            
        //   513: new             Ljava/io/IOException;
        //   516: dup            
        //   517: aload           14
        //   519: \u0131nvokev\u0131rtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   522: \u0131nvokespec\u0131al   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   525: athrow         
        //   526: new             Ljava/io/IOException;
        //   529: dup            
        //   530: ldc_w           "Failed to authenticate with proxy"
        //   533: \u0131nvokespec\u0131al   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   536: athrow         
        //   537: aload_0        
        //   538: getf\u0131eld        a/a/b/c.e:Lb/e;
        //   541: \u0131nvoke\u0131nterface b/e.b:()Lb/c;
        //   546: \u0131nvokev\u0131rtual   b/c.c:()Z
        //   549: \u0131feq            570
        //   552: aload_0        
        //   553: getf\u0131eld        a/a/b/c.f:Lb/d;
        //   556: \u0131nvoke\u0131nterface b/d.b:()Lb/c;
        //   561: \u0131nvokev\u0131rtual   b/c.c:()Z
        //   564: \u0131feq            570
        //   567: goto            587
        //   570: new             Ljava/io/IOException;
        //   573: dup            
        //   574: ldc_w           "TLS tunnel buffered too many bytes!"
        //   577: \u0131nvokespec\u0131al   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   580: athrow         
        //   581: aload_0        
        //   582: \u0131load_1        
        //   583: \u0131load_2        
        //   584: \u0131nvokespec\u0131al   a/a/b/c.a:(II)V
        //   587: aload_0        
        //   588: getf\u0131eld        a/a/b/c.a:La/ab;
        //   591: getf\u0131eld        a/ab.a:La/a;
        //   594: getf\u0131eld        a/a.i:Ljavax/net/ssl/SSLSocketFactory;
        //   597: \u0131fnonnull       618
        //   600: aload_0        
        //   601: getstat\u0131c       a/v.b:La/v;
        //   604: putf\u0131eld        a/a/b/c.o:La/v;
        //   607: aload_0        
        //   608: aload_0        
        //   609: getf\u0131eld        a/a/b/c.n:Ljava/net/Socket;
        //   612: putf\u0131eld        a/a/b/c.b:Ljava/net/Socket;
        //   615: goto            1112
        //   618: aload_0        
        //   619: getf\u0131eld        a/a/b/c.a:La/ab;
        //   622: getf\u0131eld        a/ab.a:La/a;
        //   625: astore          15
        //   627: aload           15
        //   629: getf\u0131eld        a/a.i:Ljavax/net/ssl/SSLSocketFactory;
        //   632: astore          13
        //   634: aload           13
        //   636: aload_0        
        //   637: getf\u0131eld        a/a/b/c.n:Ljava/net/Socket;
        //   640: aload           15
        //   642: getf\u0131eld        a/a.a:La/r;
        //   645: getf\u0131eld        a/r.b:Ljava/lang/String;
        //   648: aload           15
        //   650: getf\u0131eld        a/a.a:La/r;
        //   653: getf\u0131eld        a/r.c:I
        //   656: \u0131const_1       
        //   657: \u0131nvokev\u0131rtual   javax/net/ssl/SSLSocketFactory.createSocket:(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
        //   660: checkcast       Ljavax/net/ssl/SSLSocket;
        //   663: astore          14
        //   665: aload           14
        //   667: astore          13
        //   669: aload           16
        //   671: aload           14
        //   673: \u0131nvokev\u0131rtual   a/a/b/b.a:(Ljavax/net/ssl/SSLSocket;)La/j;
        //   676: astore          18
        //   678: aload           14
        //   680: astore          13
        //   682: aload           18
        //   684: getf\u0131eld        a/j.e:Z
        //   687: \u0131feq            715
        //   690: aload           14
        //   692: astore          13
        //   694: \u0131nvokestat\u0131c    a/a/g/e.b:()La/a/g/e;
        //   697: aload           14
        //   699: aload           15
        //   701: getf\u0131eld        a/a.a:La/r;
        //   704: getf\u0131eld        a/r.b:Ljava/lang/String;
        //   707: aload           15
        //   709: getf\u0131eld        a/a.e:Ljava/util/List;
        //   712: \u0131nvokev\u0131rtual   a/a/g/e.a:(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
        //   715: aload           14
        //   717: astore          13
        //   719: aload           14
        //   721: \u0131nvokev\u0131rtual   javax/net/ssl/SSLSocket.startHandshake:()V
        //   724: aload           14
        //   726: astore          13
        //   728: aload           14
        //   730: \u0131nvokev\u0131rtual   javax/net/ssl/SSLSocket.getSession:()Ljavax/net/ssl/SSLSession;
        //   733: \u0131nvokestat\u0131c    a/p.a:(Ljavax/net/ssl/SSLSession;)La/p;
        //   736: astore          17
        //   738: aload           14
        //   740: astore          13
        //   742: aload           15
        //   744: getf\u0131eld        a/a.j:Ljavax/net/ssl/HostnameVerifier;
        //   747: aload           15
        //   749: getf\u0131eld        a/a.a:La/r;
        //   752: getf\u0131eld        a/r.b:Ljava/lang/String;
        //   755: aload           14
        //   757: \u0131nvokev\u0131rtual   javax/net/ssl/SSLSocket.getSession:()Ljavax/net/ssl/SSLSession;
        //   760: \u0131nvoke\u0131nterface javax/net/ssl/HostnameVerifier.verify:(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
        //   765: \u0131feq            1152
        //   768: aload           14
        //   770: astore          13
        //   772: aload           15
        //   774: getf\u0131eld        a/a.k:La/f;
        //   777: aload           15
        //   779: getf\u0131eld        a/a.a:La/r;
        //   782: getf\u0131eld        a/r.b:Ljava/lang/String;
        //   785: aload           17
        //   787: getf\u0131eld        a/p.b:Ljava/util/List;
        //   790: \u0131nvokev\u0131rtual   a/f.a:(Ljava/lang/String;Ljava/util/List;)V
        //   793: aload           14
        //   795: astore          13
        //   797: aload           18
        //   799: getf\u0131eld        a/j.e:Z
        //   802: \u0131feq            1615
        //   805: aload           14
        //   807: astore          13
        //   809: \u0131nvokestat\u0131c    a/a/g/e.b:()La/a/g/e;
        //   812: aload           14
        //   814: \u0131nvokev\u0131rtual   a/a/g/e.a:(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
        //   817: astore          15
        //   819: goto            822
        //   822: aload           14
        //   824: astore          13
        //   826: aload_0        
        //   827: aload           14
        //   829: putf\u0131eld        a/a/b/c.b:Ljava/net/Socket;
        //   832: aload           14
        //   834: astore          13
        //   836: aload_0        
        //   837: aload_0        
        //   838: getf\u0131eld        a/a/b/c.b:Ljava/net/Socket;
        //   841: \u0131nvokestat\u0131c    b/k.b:(Ljava/net/Socket;)Lb/r;
        //   844: \u0131nvokestat\u0131c    b/k.a:(Lb/r;)Lb/e;
        //   847: putf\u0131eld        a/a/b/c.e:Lb/e;
        //   850: aload           14
        //   852: astore          13
        //   854: aload_0        
        //   855: aload_0        
        //   856: getf\u0131eld        a/a/b/c.b:Ljava/net/Socket;
        //   859: \u0131nvokestat\u0131c    b/k.a:(Ljava/net/Socket;)Lb/q;
        //   862: \u0131nvokestat\u0131c    b/k.a:(Lb/q;)Lb/d;
        //   865: putf\u0131eld        a/a/b/c.f:Lb/d;
        //   868: aload           14
        //   870: astore          13
        //   872: aload_0        
        //   873: aload           17
        //   875: putf\u0131eld        a/a/b/c.c:La/p;
        //   878: aload           15
        //   880: \u0131fnull          897
        //   883: aload           14
        //   885: astore          13
        //   887: aload           15
        //   889: \u0131nvokestat\u0131c    a/v.a:(Ljava/lang/String;)La/v;
        //   892: astore          15
        //   894: goto            906
        //   897: aload           14
        //   899: astore          13
        //   901: getstat\u0131c       a/v.b:La/v;
        //   904: astore          15
        //   906: aload           14
        //   908: astore          13
        //   910: aload_0        
        //   911: aload           15
        //   913: putf\u0131eld        a/a/b/c.o:La/v;
        //   916: aload           14
        //   918: \u0131fnull          929
        //   921: \u0131nvokestat\u0131c    a/a/g/e.b:()La/a/g/e;
        //   924: aload           14
        //   926: \u0131nvokev\u0131rtual   a/a/g/e.b:(Ljavax/net/ssl/SSLSocket;)V
        //   929: aload_0        
        //   930: getf\u0131eld        a/a/b/c.o:La/v;
        //   933: getstat\u0131c       a/v.d:La/v;
        //   936: \u0131f_acmpne       1112
        //   939: aload_0        
        //   940: getf\u0131eld        a/a/b/c.b:Ljava/net/Socket;
        //   943: \u0131const_0       
        //   944: \u0131nvokev\u0131rtual   java/net/Socket.setSoTimeout:(I)V
        //   947: new             La/a/e/g$a;
        //   950: dup            
        //   951: \u0131nvokespec\u0131al   a/a/e/g$a.<init>:()V
        //   954: astore          13
        //   956: aload_0        
        //   957: getf\u0131eld        a/a/b/c.b:Ljava/net/Socket;
        //   960: astore          14
        //   962: aload_0        
        //   963: getf\u0131eld        a/a/b/c.a:La/ab;
        //   966: getf\u0131eld        a/ab.a:La/a;
        //   969: getf\u0131eld        a/a.a:La/r;
        //   972: getf\u0131eld        a/r.b:Ljava/lang/String;
        //   975: astore          15
        //   977: aload_0        
        //   978: getf\u0131eld        a/a/b/c.e:Lb/e;
        //   981: astore          17
        //   983: aload_0        
        //   984: getf\u0131eld        a/a/b/c.f:Lb/d;
        //   987: astore          18
        //   989: aload           13
        //   991: aload           14
        //   993: putf\u0131eld        a/a/e/g$a.a:Ljava/net/Socket;
        //   996: aload           13
        //   998: aload           15
        //  1000: putf\u0131eld        a/a/e/g$a.b:Ljava/lang/String;
        //  1003: aload           13
        //  1005: aload           17
        //  1007: putf\u0131eld        a/a/e/g$a.c:Lb/e;
        //  1010: aload           13
        //  1012: aload           18
        //  1014: putf\u0131eld        a/a/e/g$a.d:Lb/d;
        //  1017: aload           13
        //  1019: aload_0        
        //  1020: putf\u0131eld        a/a/e/g$a.e:La/a/e/g$b;
        //  1023: aload_0        
        //  1024: new             La/a/e/g;
        //  1027: dup            
        //  1028: aload           13
        //  1030: \u0131nvokespec\u0131al   a/a/e/g.<init>:(La/a/e/g$a;)V
        //  1033: putf\u0131eld        a/a/b/c.d:La/a/e/g;
        //  1036: aload_0        
        //  1037: getf\u0131eld        a/a/b/c.d:La/a/e/g;
        //  1040: astore          13
        //  1042: aload           13
        //  1044: getf\u0131eld        a/a/e/g.q:La/a/e/j;
        //  1047: \u0131nvokev\u0131rtual   a/a/e/j.blockBack:()V
        //  1050: aload           13
        //  1052: getf\u0131eld        a/a/e/g.q:La/a/e/j;
        //  1055: aload           13
        //  1057: getf\u0131eld        a/a/e/g.m:La/a/e/n;
        //  1060: \u0131nvokev\u0131rtual   a/a/e/j.b:(La/a/e/n;)V
        //  1063: aload           13
        //  1065: getf\u0131eld        a/a/e/g.m:La/a/e/n;
        //  1068: \u0131nvokev\u0131rtual   a/a/e/n.b:()I
        //  1071: \u0131store          5
        //  1073: \u0131load           5
        //  1075: ldc_w           65535
        //  1078: \u0131f_\u0131cmpeq       1097
        //  1081: aload           13
        //  1083: getf\u0131eld        a/a/e/g.q:La/a/e/j;
        //  1086: \u0131const_0       
        //  1087: \u0131load           5
        //  1089: ldc_w           65535
        //  1092: \u0131sub           
        //  1093: \u01312l            
        //  1094: \u0131nvokev\u0131rtual   a/a/e/j.a:(IJ)V
        //  1097: new             Ljava/lang/Thread;
        //  1100: dup            
        //  1101: aload           13
        //  1103: getf\u0131eld        a/a/e/g.r:La/a/e/g$c;
        //  1106: \u0131nvokespec\u0131al   java/lang/Thread.<init>:(Ljava/lang/Runnable;)V
        //  1109: \u0131nvokev\u0131rtual   java/lang/Thread.start:()V
        //  1112: aload_0        
        //  1113: getf\u0131eld        a/a/b/c.d:La/a/e/g;
        //  1116: \u0131fnull          1151
        //  1119: aload_0        
        //  1120: getf\u0131eld        a/a/b/c.m:La/i;
        //  1123: astore          12
        //  1125: aload           12
        //  1127: mon\u0131torenter   
        //  1128: aload_0        
        //  1129: aload_0        
        //  1130: getf\u0131eld        a/a/b/c.d:La/a/e/g;
        //  1133: \u0131nvokev\u0131rtual   a/a/e/g.a:()I
        //  1136: putf\u0131eld        a/a/b/c.i:I
        //  1139: aload           12
        //  1141: mon\u0131torex\u0131t    
        //  1142: return         
        //  1143: astore          13
        //  1145: aload           12
        //  1147: mon\u0131torex\u0131t    
        //  1148: aload           13
        //  1150: athrow         
        //  1151: return         
        //  1152: aload           14
        //  1154: astore          13
        //  1156: aload           17
        //  1158: getf\u0131eld        a/p.b:Ljava/util/List;
        //  1161: \u0131const_0       
        //  1162: \u0131nvoke\u0131nterface java/util/List.get:(I)Ljava/lang/Object;
        //  1167: checkcast       Ljava/security/cert/X509Certificate;
        //  1170: astore          17
        //  1172: aload           14
        //  1174: astore          13
        //  1176: new             Ljava/lang/StringBuilder;
        //  1179: dup            
        //  1180: ldc_w           "Hostname "
        //  1183: \u0131nvokespec\u0131al   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1186: astore          18
        //  1188: aload           14
        //  1190: astore          13
        //  1192: aload           18
        //  1194: aload           15
        //  1196: getf\u0131eld        a/a.a:La/r;
        //  1199: getf\u0131eld        a/r.b:Ljava/lang/String;
        //  1202: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1205: pop            
        //  1206: aload           14
        //  1208: astore          13
        //  1210: aload           18
        //  1212: ldc_w           " not verified:\n    certificate: "
        //  1215: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1218: pop            
        //  1219: aload           14
        //  1221: astore          13
        //  1223: aload           18
        //  1225: aload           17
        //  1227: \u0131nvokestat\u0131c    a/f.a:(Ljava/security/cert/Certificate;)Ljava/lang/String;
        //  1230: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1233: pop            
        //  1234: aload           14
        //  1236: astore          13
        //  1238: aload           18
        //  1240: ldc_w           "\n    DN: "
        //  1243: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1246: pop            
        //  1247: aload           14
        //  1249: astore          13
        //  1251: aload           18
        //  1253: aload           17
        //  1255: \u0131nvokev\u0131rtual   java/security/cert/X509Certificate.getSubjectDN:()Ljava/security/Principal;
        //  1258: \u0131nvoke\u0131nterface java/security/Principal.getName:()Ljava/lang/String;
        //  1263: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1266: pop            
        //  1267: aload           14
        //  1269: astore          13
        //  1271: aload           18
        //  1273: ldc_w           "\n    subjectAltNames: "
        //  1276: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1279: pop            
        //  1280: aload           14
        //  1282: astore          13
        //  1284: aload           18
        //  1286: aload           17
        //  1288: \u0131nvokestat\u0131c    a/a/h/d.a:(Ljava/security/cert/X509Certificate;)Ljava/util/List;
        //  1291: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1294: pop            
        //  1295: aload           14
        //  1297: astore          13
        //  1299: new             Ljavax/net/ssl/SSLPeerUnverifiedException;
        //  1302: dup            
        //  1303: aload           18
        //  1305: \u0131nvokev\u0131rtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1308: \u0131nvokespec\u0131al   javax/net/ssl/SSLPeerUnverifiedException.<init>:(Ljava/lang/String;)V
        //  1311: athrow         
        //  1312: astore          15
        //  1314: goto            1330
        //  1317: astore          13
        //  1319: aconst_null    
        //  1320: astore          14
        //  1322: goto            1373
        //  1325: astore          15
        //  1327: aconst_null    
        //  1328: astore          14
        //  1330: aload           14
        //  1332: astore          13
        //  1334: aload           15
        //  1336: \u0131nvokestat\u0131c    a/a/c.a:(Ljava/lang/AssertionError;)Z
        //  1339: \u0131feq            1356
        //  1342: aload           14
        //  1344: astore          13
        //  1346: new             Ljava/io/IOException;
        //  1349: dup            
        //  1350: aload           15
        //  1352: \u0131nvokespec\u0131al   java/io/IOException.<init>:(Ljava/lang/Throwable;)V
        //  1355: athrow         
        //  1356: aload           14
        //  1358: astore          13
        //  1360: aload           15
        //  1362: athrow         
        //  1363: astore          15
        //  1365: aload           13
        //  1367: astore          14
        //  1369: aload           15
        //  1371: astore          13
        //  1373: aload           14
        //  1375: \u0131fnull          1386
        //  1378: \u0131nvokestat\u0131c    a/a/g/e.b:()La/a/g/e;
        //  1381: aload           14
        //  1383: \u0131nvokev\u0131rtual   a/a/g/e.b:(Ljavax/net/ssl/SSLSocket;)V
        //  1386: aload           14
        //  1388: \u0131nvokestat\u0131c    a/a/c.a:(Ljava/net/Socket;)V
        //  1391: aload           13
        //  1393: athrow         
        //  1394: astore          13
        //  1396: goto            1401
        //  1399: astore          13
        //  1401: aload_0        
        //  1402: getf\u0131eld        a/a/b/c.b:Ljava/net/Socket;
        //  1405: \u0131nvokestat\u0131c    a/a/c.a:(Ljava/net/Socket;)V
        //  1408: aload_0        
        //  1409: getf\u0131eld        a/a/b/c.n:Ljava/net/Socket;
        //  1412: \u0131nvokestat\u0131c    a/a/c.a:(Ljava/net/Socket;)V
        //  1415: aload_0        
        //  1416: aconst_null    
        //  1417: putf\u0131eld        a/a/b/c.b:Ljava/net/Socket;
        //  1420: aload_0        
        //  1421: aconst_null    
        //  1422: putf\u0131eld        a/a/b/c.n:Ljava/net/Socket;
        //  1425: aload_0        
        //  1426: aconst_null    
        //  1427: putf\u0131eld        a/a/b/c.e:Lb/e;
        //  1430: aload_0        
        //  1431: aconst_null    
        //  1432: putf\u0131eld        a/a/b/c.f:Lb/d;
        //  1435: aload_0        
        //  1436: aconst_null    
        //  1437: putf\u0131eld        a/a/b/c.c:La/p;
        //  1440: aload_0        
        //  1441: aconst_null    
        //  1442: putf\u0131eld        a/a/b/c.o:La/v;
        //  1445: aload_0        
        //  1446: aconst_null    
        //  1447: putf\u0131eld        a/a/b/c.d:La/a/e/g;
        //  1450: aload           12
        //  1452: \u0131fnonnull       1469
        //  1455: new             La/a/b/e;
        //  1458: dup            
        //  1459: aload           13
        //  1461: \u0131nvokespec\u0131al   a/a/b/e.<init>:(Ljava/io/IOException;)V
        //  1464: astore          12
        //  1466: goto            1489
        //  1469: aload           13
        //  1471: aload           12
        //  1473: getf\u0131eld        a/a/b/e.a:Ljava/io/IOException;
        //  1476: \u0131nvokestat\u0131c    a/a/b/e.a:(Ljava/io/IOException;Ljava/io/IOException;)V
        //  1479: aload           12
        //  1481: aload           13
        //  1483: putf\u0131eld        a/a/b/e.a:Ljava/io/IOException;
        //  1486: goto            1466
        //  1489: \u0131load           4
        //  1491: \u0131feq            1590
        //  1494: aload           16
        //  1496: \u0131const_1       
        //  1497: putf\u0131eld        a/a/b/b.b:Z
        //  1500: aload           16
        //  1502: getf\u0131eld        a/a/b/b.a:Z
        //  1505: \u0131feq            1579
        //  1508: aload           13
        //  1510: \u0131nstanceof      Ljava/net/ProtocolException;
        //  1513: \u0131fne            1579
        //  1516: aload           13
        //  1518: \u0131nstanceof      Ljava/io/InterruptedIOException;
        //  1521: \u0131fne            1579
        //  1524: aload           13
        //  1526: \u0131nstanceof      Ljavax/net/ssl/SSLHandshakeException;
        //  1529: \u0131store          7
        //  1531: \u0131load           7
        //  1533: \u0131feq            1547
        //  1536: aload           13
        //  1538: \u0131nvokev\u0131rtual   java/io/IOException.getCause:()Ljava/lang/Throwable;
        //  1541: \u0131nstanceof      Ljava/security/cert/CertificateException;
        //  1544: \u0131fne            1579
        //  1547: aload           13
        //  1549: \u0131nstanceof      Ljavax/net/ssl/SSLPeerUnverifiedException;
        //  1552: \u0131fne            1579
        //  1555: \u0131load           6
        //  1557: \u0131store          5
        //  1559: \u0131load           7
        //  1561: \u0131fne            1582
        //  1564: aload           13
        //  1566: \u0131nstanceof      Ljavax/net/ssl/SSLProtocolException;
        //  1569: \u0131feq            1579
        //  1572: \u0131load           6
        //  1574: \u0131store          5
        //  1576: goto            1582
        //  1579: \u0131const_0       
        //  1580: \u0131store          5
        //  1582: \u0131load           5
        //  1584: \u0131feq            1590
        //  1587: goto            152
        //  1590: aload           12
        //  1592: athrow         
        //  1593: new             Ljava/lang/IllegalStateException;
        //  1596: dup            
        //  1597: ldc_w           "already connected"
        //  1600: \u0131nvokespec\u0131al   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1603: athrow         
        //  1604: \u0131const_0       
        //  1605: \u0131store          5
        //  1607: goto            192
        //  1610: astore          13
        //  1612: goto            1401
        //  1615: aconst_null    
        //  1616: astore          15
        //  1618: goto            822
        //    StackMapTable: 00 2C FF 00 55 00 11 07 00 02 01 01 01 01 00 00 00 00 00 00 00 07 00 C0 00 00 00 07 00 A2 00 00 FF 00 2E 00 11 07 00 02 01 01 01 01 00 00 00 00 00 00 00 07 00 AF 00 00 00 07 00 A2 00 00 FF 00 10 00 11 07 00 02 01 01 01 01 00 00 00 00 00 00 00 07 00 D3 00 00 00 07 00 A2 00 00 FF 00 02 00 11 07 00 02 01 01 01 01 00 00 00 00 00 00 00 07 00 C9 00 00 00 07 00 A2 00 00 FF 00 27 00 11 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 00 3A 00 00 07 00 A2 00 00 FF 00 F6 00 10 07 00 02 01 01 01 01 01 01 00 04 04 07 00 C9 07 01 2B 07 00 F9 07 01 1C 07 00 A2 07 01 09 00 00 FF 00 56 00 10 07 00 02 01 01 01 01 01 01 00 04 04 07 00 C9 07 01 2B 07 01 34 07 01 1C 07 00 A2 07 01 09 00 00 0A 20 FF 00 0A 00 11 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 00 3A 00 00 07 00 A2 00 00 FF 00 05 00 11 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 00 D3 00 00 07 00 A2 00 00 1E FF 00 60 00 13 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 01 5A 07 01 5A 07 00 51 07 00 A2 00 07 00 AA 00 00 FF 00 6A 00 13 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 01 5A 07 01 5A 07 00 C0 07 00 A2 07 01 6D 07 00 AA 00 00 FB 00 4A FF 00 08 00 13 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 01 5A 07 01 5A 07 01 4E 07 00 A2 07 01 6D 07 00 AA 00 00 16 FF 00 A7 00 13 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 01 9F 07 00 53 07 00 C0 07 00 A2 07 00 FE 07 01 0E 00 00 FF 00 0E 00 11 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 00 D3 00 00 07 00 A2 00 00 FF 00 1E 00 11 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 01 CC 07 00 D3 00 00 07 00 A2 00 01 07 01 CE FF 00 07 00 11 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 00 D3 00 00 07 00 A2 00 00 FF 00 00 00 13 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 01 5A 07 01 5A 07 00 51 07 00 A2 07 01 6D 07 00 AA 00 00 FF 00 9F 00 11 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 01 5A 07 01 5A 07 00 D3 07 00 A2 00 01 07 00 9C FF 00 04 00 11 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 01 55 00 07 00 51 07 00 A2 00 01 07 01 CE 47 07 00 9C FF 00 04 00 11 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 00 D3 07 01 5A 07 00 9C 07 00 A2 00 00 FF 00 19 00 11 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 01 5A 07 01 5A 07 00 9C 07 00 A2 00 00 FF 00 06 00 11 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 01 5A 07 01 5A 07 00 D3 07 00 A2 00 01 07 01 CE FF 00 09 00 11 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 01 CE 07 01 5A 07 00 D3 07 00 A2 00 00 0C FF 00 07 00 11 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 00 D3 00 00 07 00 A2 00 01 07 00 9A FF 00 04 00 11 07 00 02 01 01 01 01 00 01 00 00 00 00 00 07 00 C9 00 00 00 07 00 A2 00 01 07 00 9A FF 00 01 00 11 07 00 02 01 01 01 01 00 01 00 00 00 00 00 07 00 C9 07 00 9A 00 00 07 00 A2 00 00 FB 00 40 02 13 FF 00 39 00 11 07 00 02 01 01 01 01 00 01 01 00 00 00 00 07 00 C9 07 00 9A 00 00 07 00 A2 00 00 FF 00 1F 00 11 07 00 02 01 01 01 01 00 01 00 00 00 00 00 07 00 C9 07 00 9A 00 00 07 00 A2 00 00 FF 00 02 00 11 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 00 9A 00 00 07 00 A2 00 00 FF 00 07 00 11 07 00 02 01 01 01 01 00 01 00 00 00 00 00 07 00 C9 07 00 9A 00 00 07 00 A2 00 00 FF 00 02 00 05 07 00 02 01 01 01 01 00 00 FF 00 0A 00 11 07 00 02 01 01 01 01 00 01 00 00 00 00 00 07 00 C9 07 00 3A 00 00 07 00 A2 00 00 FF 00 05 00 11 07 00 02 01 01 01 01 01 01 00 04 00 00 07 00 C9 07 00 F0 07 00 F9 07 00 C0 07 00 A2 07 01 09 00 01 07 00 9A FF 00 04 00 13 07 00 02 01 01 01 01 01 01 00 00 00 00 00 07 00 C9 07 01 5A 07 01 5A 07 00 51 07 00 A2 07 01 6D 07 00 AA 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  155    186    1399   1401   Ljava/io/IOException;
        //  197    336    1399   1401   Ljava/io/IOException;
        //  340    362    1610   1615   Ljava/io/IOException;
        //  366    423    1394   1399   Ljava/io/IOException;
        //  439    474    1394   1399   Ljava/io/IOException;
        //  490    526    1394   1399   Ljava/io/IOException;
        //  526    537    1394   1399   Ljava/io/IOException;
        //  537    567    1394   1399   Ljava/io/IOException;
        //  570    581    1394   1399   Ljava/io/IOException;
        //  581    587    1394   1399   Ljava/io/IOException;
        //  587    615    1394   1399   Ljava/io/IOException;
        //  618    634    1394   1399   Ljava/io/IOException;
        //  634    665    1325   1330   Ljava/lang/AssertionError;
        //  634    665    1317   1325   Any
        //  669    678    1312   1317   Ljava/lang/AssertionError;
        //  669    678    1363   1373   Any
        //  682    690    1312   1317   Ljava/lang/AssertionError;
        //  682    690    1363   1373   Any
        //  694    715    1312   1317   Ljava/lang/AssertionError;
        //  694    715    1363   1373   Any
        //  719    724    1312   1317   Ljava/lang/AssertionError;
        //  719    724    1363   1373   Any
        //  728    738    1312   1317   Ljava/lang/AssertionError;
        //  728    738    1363   1373   Any
        //  742    768    1312   1317   Ljava/lang/AssertionError;
        //  742    768    1363   1373   Any
        //  772    793    1312   1317   Ljava/lang/AssertionError;
        //  772    793    1363   1373   Any
        //  797    805    1312   1317   Ljava/lang/AssertionError;
        //  797    805    1363   1373   Any
        //  809    819    1312   1317   Ljava/lang/AssertionError;
        //  809    819    1363   1373   Any
        //  826    832    1312   1317   Ljava/lang/AssertionError;
        //  826    832    1363   1373   Any
        //  836    850    1312   1317   Ljava/lang/AssertionError;
        //  836    850    1363   1373   Any
        //  854    868    1312   1317   Ljava/lang/AssertionError;
        //  854    868    1363   1373   Any
        //  872    878    1312   1317   Ljava/lang/AssertionError;
        //  872    878    1363   1373   Any
        //  887    894    1312   1317   Ljava/lang/AssertionError;
        //  887    894    1363   1373   Any
        //  901    906    1312   1317   Ljava/lang/AssertionError;
        //  901    906    1363   1373   Any
        //  910    916    1312   1317   Ljava/lang/AssertionError;
        //  910    916    1363   1373   Any
        //  921    929    1394   1399   Ljava/io/IOException;
        //  929    1073   1394   1399   Ljava/io/IOException;
        //  1081   1097   1394   1399   Ljava/io/IOException;
        //  1097   1112   1394   1399   Ljava/io/IOException;
        //  1128   1142   1143   1151   Any
        //  1145   1148   1143   1151   Any
        //  1156   1172   1312   1317   Ljava/lang/AssertionError;
        //  1156   1172   1363   1373   Any
        //  1176   1188   1312   1317   Ljava/lang/AssertionError;
        //  1176   1188   1363   1373   Any
        //  1192   1206   1312   1317   Ljava/lang/AssertionError;
        //  1192   1206   1363   1373   Any
        //  1210   1219   1312   1317   Ljava/lang/AssertionError;
        //  1210   1219   1363   1373   Any
        //  1223   1234   1312   1317   Ljava/lang/AssertionError;
        //  1223   1234   1363   1373   Any
        //  1238   1247   1312   1317   Ljava/lang/AssertionError;
        //  1238   1247   1363   1373   Any
        //  1251   1267   1312   1317   Ljava/lang/AssertionError;
        //  1251   1267   1363   1373   Any
        //  1271   1280   1312   1317   Ljava/lang/AssertionError;
        //  1271   1280   1363   1373   Any
        //  1284   1295   1312   1317   Ljava/lang/AssertionError;
        //  1284   1295   1363   1373   Any
        //  1299   1312   1312   1317   Ljava/lang/AssertionError;
        //  1299   1312   1363   1373   Any
        //  1334   1342   1363   1373   Any
        //  1346   1356   1363   1373   Any
        //  1360   1363   1363   1373   Any
        //  1378   1386   1394   1399   Ljava/io/IOException;
        //  1386   1394   1394   1399   Ljava/io/IOException;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public final void a(final g g) {
        synchronized (this.m) {
            this.i = g.a();
        }
    }
    
    @Override
    public final void a(final a.a.e.i i) {
        i.a(a.a.e.b.e);
    }
    
    public final boolean a(final a.a a) {
        return this.j.size() < this.i && a.equals(this.a.a) && !this.g;
    }
    
    public final boolean a(final boolean b) {
        if (this.b.isClosed() || this.b.isInputShutdown()) {
            return false;
        }
        if (this.b.isOutputShutdown()) {
            return false;
        }
        if (this.d != null) {
            return !this.d.b();
        }
        if (!b) {
            return true;
        }
        try {
            final int soTimeout = this.b.getSoTimeout();
            try {
                this.b.setSoTimeout(1);
                return !this.e.c();
            }
            finally {
                this.b.setSoTimeout(soTimeout);
            }
            return true;
        }
        catch (SocketTimeoutException ex) {
            return true;
        }
        catch (IOException ex2) {
            return false;
        }
    }
    
    public final boolean b() {
        return this.d != null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.a.a.a.b);
        sb.append(":");
        sb.append(this.a.a.a.c);
        sb.append(", proxy=");
        sb.append(this.a.b);
        sb.append(" hostAddress=");
        sb.append(this.a.c);
        sb.append(" cipherSuite=");
        Object a;
        if (this.c != null) {
            a = this.c.a;
        }
        else {
            a = "none";
        }
        sb.append(a);
        sb.append(" protocol=");
        sb.append(this.o);
        sb.append('}');
        return sb.toString();
    }
}
