package a;

import java.util.regex.*;
import java.util.*;
import a.a.c.*;

public final class k
{
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern f;
    public final String a;
    public final String b;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    
    static {
        c = Pattern.compile("(\\d{2,4})[^\\d]*");
        d = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
        e = Pattern.compile("(\\d{1,2})[^\\d]*");
        f = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    }
    
    private k(final String a, final String b, final long g, final String h, final String i, final boolean j, final boolean k, final boolean m, final boolean l) {
        super();
        this.a = a;
        this.b = b;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.m = m;
        this.l = l;
    }
    
    private static int a(final String s, int i, final int n, final boolean b) {
        while (i < n) {
            final char char1 = s.charAt(i);
            if (((char1 < ' ' && char1 != '\t') || char1 >= '\u007f' || (char1 >= '0' && char1 <= '9') || (char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z') || char1 == ':') == (b ^ true)) {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    private static long a(final String s) {
        try {
            final long long1 = Long.parseLong(s);
            if (long1 <= 0L) {
                return Long.MIN_VALUE;
            }
            return long1;
        }
        catch (NumberFormatException ex) {
            if (!s.matches("-?\\d+")) {
                throw ex;
            }
            if (s.startsWith("-")) {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
    }
    
    private static k a(final long p0, final r p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          31
        //     3: aload_3        
        //     4: \u0131nvokev\u0131rtual   java/lang/String.length:()I
        //     7: \u0131store          4
        //     9: aload           31
        //    11: \u0131const_0       
        //    12: \u0131load           4
        //    14: b\u0131push          59
        //    16: \u0131nvokestat\u0131c    a/a/c.a:(Ljava/lang/String;IIC)I
        //    19: \u0131store          5
        //    21: aload           31
        //    23: \u0131const_0       
        //    24: \u0131load           5
        //    26: b\u0131push          61
        //    28: \u0131nvokestat\u0131c    a/a/c.a:(Ljava/lang/String;IIC)I
        //    31: \u0131store          6
        //    33: aconst_null    
        //    34: astore          33
        //    36: \u0131load           6
        //    38: \u0131load           5
        //    40: \u0131f_\u0131cmpne       45
        //    43: aconst_null    
        //    44: areturn        
        //    45: aload           31
        //    47: \u0131const_0       
        //    48: \u0131load           6
        //    50: \u0131nvokestat\u0131c    a/a/c.c:(Ljava/lang/String;II)Ljava/lang/String;
        //    53: astore          35
        //    55: aload           35
        //    57: \u0131nvokev\u0131rtual   java/lang/String.isEmpty:()Z
        //    60: \u0131fne            1546
        //    63: aload           35
        //    65: \u0131nvokestat\u0131c    a/a/c.b:(Ljava/lang/String;)I
        //    68: \u0131const_m1      
        //    69: \u0131f_\u0131cmpeq       75
        //    72: goto            1546
        //    75: aload           31
        //    77: \u0131load           6
        //    79: \u0131const_1       
        //    80: \u0131add           
        //    81: \u0131load           5
        //    83: \u0131nvokestat\u0131c    a/a/c.c:(Ljava/lang/String;II)Ljava/lang/String;
        //    86: astore          36
        //    88: aload           36
        //    90: \u0131nvokestat\u0131c    a/a/c.b:(Ljava/lang/String;)I
        //    93: \u0131const_m1      
        //    94: \u0131f_\u0131cmpeq       99
        //    97: aconst_null    
        //    98: areturn        
        //    99: \u0131load           5
        //   101: \u0131const_1       
        //   102: \u0131add           
        //   103: \u0131store          5
        //   105: aconst_null    
        //   106: astore          32
        //   108: ldc2_w          253402300799999
        //   111: lstore          16
        //   113: ldc2_w          -1
        //   116: lstore          18
        //   118: \u0131const_0       
        //   119: \u0131store          26
        //   121: \u0131const_0       
        //   122: \u0131store          27
        //   124: \u0131const_1       
        //   125: \u0131store          25
        //   127: \u0131const_0       
        //   128: \u0131store          24
        //   130: \u0131const_m1      
        //   131: \u0131store          11
        //   133: aload_3        
        //   134: astore          31
        //   136: \u0131load           5
        //   138: \u0131load           4
        //   140: \u0131f_\u0131cmpge       1278
        //   143: aload           31
        //   145: \u0131load           5
        //   147: \u0131load           4
        //   149: b\u0131push          59
        //   151: \u0131nvokestat\u0131c    a/a/c.a:(Ljava/lang/String;IIC)I
        //   154: \u0131store          13
        //   156: aload           31
        //   158: \u0131load           5
        //   160: \u0131load           13
        //   162: b\u0131push          61
        //   164: \u0131nvokestat\u0131c    a/a/c.a:(Ljava/lang/String;IIC)I
        //   167: \u0131store          6
        //   169: aload           31
        //   171: \u0131load           5
        //   173: \u0131load           6
        //   175: \u0131nvokestat\u0131c    a/a/c.c:(Ljava/lang/String;II)Ljava/lang/String;
        //   178: astore          37
        //   180: \u0131load           6
        //   182: \u0131load           13
        //   184: \u0131f_\u0131cmpge       203
        //   187: aload           31
        //   189: \u0131load           6
        //   191: \u0131const_1       
        //   192: \u0131add           
        //   193: \u0131load           13
        //   195: \u0131nvokestat\u0131c    a/a/c.c:(Ljava/lang/String;II)Ljava/lang/String;
        //   198: astore          31
        //   200: goto            207
        //   203: ldc             ""
        //   205: astore          31
        //   207: aload           37
        //   209: ldc             "expires"
        //   211: \u0131nvokev\u0131rtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   214: \u0131feq            888
        //   217: \u0131load           4
        //   219: \u0131store          8
        //   221: aload           31
        //   223: \u0131nvokev\u0131rtual   java/lang/String.length:()I
        //   226: \u0131store          14
        //   228: \u0131load           4
        //   230: \u0131store          8
        //   232: aload           31
        //   234: \u0131const_0       
        //   235: \u0131load           14
        //   237: \u0131const_0       
        //   238: \u0131nvokestat\u0131c    a/k.a:(Ljava/lang/String;IIZ)I
        //   241: \u0131store          12
        //   243: \u0131load           4
        //   245: \u0131store          8
        //   247: getstat\u0131c       a/k.f:Ljava/util/regex/Pattern;
        //   250: aload           31
        //   252: \u0131nvokev\u0131rtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   255: astore          34
        //   257: \u0131const_m1      
        //   258: \u0131store          6
        //   260: \u0131const_m1      
        //   261: \u0131store          7
        //   263: \u0131const_m1      
        //   264: \u0131store          5
        //   266: \u0131const_m1      
        //   267: \u0131store          10
        //   269: \u0131const_m1      
        //   270: \u0131store          9
        //   272: \u0131load           12
        //   274: \u0131load           14
        //   276: \u0131f_\u0131cmpge       528
        //   279: \u0131load           4
        //   281: \u0131store          8
        //   283: aload           31
        //   285: \u0131load           12
        //   287: \u0131const_1       
        //   288: \u0131add           
        //   289: \u0131load           14
        //   291: \u0131const_1       
        //   292: \u0131nvokestat\u0131c    a/k.a:(Ljava/lang/String;IIZ)I
        //   295: \u0131store          15
        //   297: \u0131load           4
        //   299: \u0131store          8
        //   301: aload           34
        //   303: \u0131load           12
        //   305: \u0131load           15
        //   307: \u0131nvokev\u0131rtual   java/util/regex/Matcher.region:(II)Ljava/util/regex/Matcher;
        //   310: pop            
        //   311: \u0131load           11
        //   313: \u0131const_m1      
        //   314: \u0131f_\u0131cmpne       383
        //   317: \u0131load           4
        //   319: \u0131store          8
        //   321: aload           34
        //   323: getstat\u0131c       a/k.f:Ljava/util/regex/Pattern;
        //   326: \u0131nvokev\u0131rtual   java/util/regex/Matcher.usePattern:(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;
        //   329: \u0131nvokev\u0131rtual   java/util/regex/Matcher.matches:()Z
        //   332: \u0131feq            383
        //   335: \u0131load           4
        //   337: \u0131store          8
        //   339: aload           34
        //   341: \u0131const_1       
        //   342: \u0131nvokev\u0131rtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   345: \u0131nvokestat\u0131c    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   348: \u0131store          11
        //   350: \u0131load           4
        //   352: \u0131store          8
        //   354: aload           34
        //   356: \u0131const_2       
        //   357: \u0131nvokev\u0131rtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   360: \u0131nvokestat\u0131c    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   363: \u0131store          10
        //   365: \u0131load           4
        //   367: \u0131store          8
        //   369: aload           34
        //   371: \u0131const_3       
        //   372: \u0131nvokev\u0131rtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   375: \u0131nvokestat\u0131c    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   378: \u0131store          9
        //   380: goto            511
        //   383: \u0131load           5
        //   385: \u0131const_m1      
        //   386: \u0131f_\u0131cmpne       425
        //   389: \u0131load           4
        //   391: \u0131store          8
        //   393: aload           34
        //   395: getstat\u0131c       a/k.e:Ljava/util/regex/Pattern;
        //   398: \u0131nvokev\u0131rtual   java/util/regex/Matcher.usePattern:(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;
        //   401: \u0131nvokev\u0131rtual   java/util/regex/Matcher.matches:()Z
        //   404: \u0131feq            425
        //   407: \u0131load           4
        //   409: \u0131store          8
        //   411: aload           34
        //   413: \u0131const_1       
        //   414: \u0131nvokev\u0131rtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   417: \u0131nvokestat\u0131c    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   420: \u0131store          5
        //   422: goto            511
        //   425: \u0131load           7
        //   427: \u0131const_m1      
        //   428: \u0131f_\u0131cmpne       477
        //   431: aload           34
        //   433: getstat\u0131c       a/k.d:Ljava/util/regex/Pattern;
        //   436: \u0131nvokev\u0131rtual   java/util/regex/Matcher.usePattern:(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;
        //   439: \u0131nvokev\u0131rtual   java/util/regex/Matcher.matches:()Z
        //   442: \u0131feq            1595
        //   445: aload           34
        //   447: \u0131const_1       
        //   448: \u0131nvokev\u0131rtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   451: getstat\u0131c       java/util/Locale.US:Ljava/util/Locale;
        //   454: \u0131nvokev\u0131rtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   457: astore          37
        //   459: getstat\u0131c       a/k.d:Ljava/util/regex/Pattern;
        //   462: \u0131nvokev\u0131rtual   java/util/regex/Pattern.pattern:()Ljava/lang/String;
        //   465: aload           37
        //   467: \u0131nvokev\u0131rtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   470: \u0131const_4       
        //   471: \u0131d\u0131v           
        //   472: \u0131store          7
        //   474: goto            511
        //   477: \u0131load           6
        //   479: \u0131const_m1      
        //   480: \u0131f_\u0131cmpne       1598
        //   483: aload           34
        //   485: getstat\u0131c       a/k.c:Ljava/util/regex/Pattern;
        //   488: \u0131nvokev\u0131rtual   java/util/regex/Matcher.usePattern:(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;
        //   491: \u0131nvokev\u0131rtual   java/util/regex/Matcher.matches:()Z
        //   494: \u0131feq            1598
        //   497: aload           34
        //   499: \u0131const_1       
        //   500: \u0131nvokev\u0131rtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   503: \u0131nvokestat\u0131c    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   506: \u0131store          6
        //   508: goto            1598
        //   511: aload           31
        //   513: \u0131load           15
        //   515: \u0131const_1       
        //   516: \u0131add           
        //   517: \u0131load           14
        //   519: \u0131const_0       
        //   520: \u0131nvokestat\u0131c    a/k.a:(Ljava/lang/String;IIZ)I
        //   523: \u0131store          12
        //   525: goto            272
        //   528: \u0131load           6
        //   530: \u0131store          8
        //   532: \u0131load           6
        //   534: b\u0131push          70
        //   536: \u0131f_\u0131cmplt       558
        //   539: \u0131load           6
        //   541: \u0131store          8
        //   543: \u0131load           6
        //   545: b\u0131push          99
        //   547: \u0131f_\u0131cmpgt       558
        //   550: \u0131load           6
        //   552: s\u0131push          1900
        //   555: \u0131add           
        //   556: \u0131store          8
        //   558: \u0131load           8
        //   560: \u0131store          12
        //   562: \u0131load           8
        //   564: \u0131flt            586
        //   567: \u0131load           8
        //   569: \u0131store          12
        //   571: \u0131load           8
        //   573: b\u0131push          69
        //   575: \u0131f_\u0131cmpgt       586
        //   578: \u0131load           8
        //   580: s\u0131push          2000
        //   583: \u0131add           
        //   584: \u0131store          12
        //   586: \u0131load           12
        //   588: s\u0131push          1601
        //   591: \u0131f_\u0131cmplt       841
        //   594: \u0131load           7
        //   596: \u0131const_m1      
        //   597: \u0131f_\u0131cmpeq       829
        //   600: \u0131load           5
        //   602: \u0131fle            817
        //   605: \u0131load           5
        //   607: b\u0131push          31
        //   609: \u0131f_\u0131cmpgt       817
        //   612: \u0131load           11
        //   614: \u0131flt            805
        //   617: \u0131load           11
        //   619: b\u0131push          23
        //   621: \u0131f_\u0131cmpgt       805
        //   624: \u0131load           10
        //   626: \u0131flt            1601
        //   629: \u0131load           10
        //   631: b\u0131push          59
        //   633: \u0131f_\u0131cmpgt       793
        //   636: \u0131load           9
        //   638: \u0131flt            781
        //   641: \u0131load           9
        //   643: b\u0131push          59
        //   645: \u0131f_\u0131cmpgt       781
        //   648: \u0131load           4
        //   650: \u0131store          6
        //   652: new             Ljava/util/GregorianCalendar;
        //   655: dup            
        //   656: getstat\u0131c       a/a/c.f:Ljava/util/TimeZone;
        //   659: \u0131nvokespec\u0131al   java/util/GregorianCalendar.<init>:(Ljava/util/TimeZone;)V
        //   662: astore          31
        //   664: \u0131load           4
        //   666: \u0131store          6
        //   668: aload           31
        //   670: \u0131const_0       
        //   671: \u0131nvokev\u0131rtual   java/util/Calendar.setLenient:(Z)V
        //   674: \u0131load           4
        //   676: \u0131store          6
        //   678: aload           31
        //   680: \u0131const_1       
        //   681: \u0131load           12
        //   683: \u0131nvokev\u0131rtual   java/util/Calendar.set:(II)V
        //   686: \u0131load           4
        //   688: \u0131store          6
        //   690: aload           31
        //   692: \u0131const_2       
        //   693: \u0131load           7
        //   695: \u0131const_1       
        //   696: \u0131sub           
        //   697: \u0131nvokev\u0131rtual   java/util/Calendar.set:(II)V
        //   700: \u0131load           4
        //   702: \u0131store          6
        //   704: aload           31
        //   706: \u0131const_5       
        //   707: \u0131load           5
        //   709: \u0131nvokev\u0131rtual   java/util/Calendar.set:(II)V
        //   712: \u0131load           4
        //   714: \u0131store          6
        //   716: aload           31
        //   718: b\u0131push          11
        //   720: \u0131load           11
        //   722: \u0131nvokev\u0131rtual   java/util/Calendar.set:(II)V
        //   725: \u0131load           4
        //   727: \u0131store          6
        //   729: aload           31
        //   731: b\u0131push          12
        //   733: \u0131load           10
        //   735: \u0131nvokev\u0131rtual   java/util/Calendar.set:(II)V
        //   738: \u0131load           4
        //   740: \u0131store          6
        //   742: aload           31
        //   744: b\u0131push          13
        //   746: \u0131load           9
        //   748: \u0131nvokev\u0131rtual   java/util/Calendar.set:(II)V
        //   751: \u0131load           4
        //   753: \u0131store          6
        //   755: aload           31
        //   757: b\u0131push          14
        //   759: \u0131const_0       
        //   760: \u0131nvokev\u0131rtual   java/util/Calendar.set:(II)V
        //   763: \u0131load           4
        //   765: \u0131store          6
        //   767: aload           31
        //   769: \u0131nvokev\u0131rtual   java/util/Calendar.getTimeInMillis:()J
        //   772: lstore          20
        //   774: lload           20
        //   776: lstore          16
        //   778: goto            921
        //   781: \u0131load           4
        //   783: \u0131store          6
        //   785: new             Ljava/lang/IllegalArgumentException;
        //   788: dup            
        //   789: \u0131nvokespec\u0131al   java/lang/IllegalArgumentException.<init>:()V
        //   792: athrow         
        //   793: \u0131load           4
        //   795: \u0131store          6
        //   797: new             Ljava/lang/IllegalArgumentException;
        //   800: dup            
        //   801: \u0131nvokespec\u0131al   java/lang/IllegalArgumentException.<init>:()V
        //   804: athrow         
        //   805: \u0131load           4
        //   807: \u0131store          6
        //   809: new             Ljava/lang/IllegalArgumentException;
        //   812: dup            
        //   813: \u0131nvokespec\u0131al   java/lang/IllegalArgumentException.<init>:()V
        //   816: athrow         
        //   817: \u0131load           4
        //   819: \u0131store          6
        //   821: new             Ljava/lang/IllegalArgumentException;
        //   824: dup            
        //   825: \u0131nvokespec\u0131al   java/lang/IllegalArgumentException.<init>:()V
        //   828: athrow         
        //   829: \u0131load           4
        //   831: \u0131store          6
        //   833: new             Ljava/lang/IllegalArgumentException;
        //   836: dup            
        //   837: \u0131nvokespec\u0131al   java/lang/IllegalArgumentException.<init>:()V
        //   840: athrow         
        //   841: \u0131load           4
        //   843: \u0131store          6
        //   845: new             Ljava/lang/IllegalArgumentException;
        //   848: dup            
        //   849: \u0131nvokespec\u0131al   java/lang/IllegalArgumentException.<init>:()V
        //   852: athrow         
        //   853: \u0131load           8
        //   855: \u0131store          4
        //   857: aload           33
        //   859: astore          31
        //   861: lload           18
        //   863: lstore          20
        //   865: lload           16
        //   867: lstore          22
        //   869: aload           32
        //   871: astore          34
        //   873: \u0131load           26
        //   875: \u0131store          28
        //   877: \u0131load           25
        //   879: \u0131store          29
        //   881: \u0131load           24
        //   883: \u0131store          30
        //   885: goto            1241
        //   888: \u0131load           4
        //   890: \u0131store          5
        //   892: aload           37
        //   894: ldc             "max-age"
        //   896: \u0131nvokev\u0131rtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   899: \u0131feq            951
        //   902: \u0131load           5
        //   904: \u0131store          6
        //   906: aload           31
        //   908: \u0131nvokestat\u0131c    a/k.a:(Ljava/lang/String;)J
        //   911: lstore          20
        //   913: lload           20
        //   915: lstore          18
        //   917: \u0131load           5
        //   919: \u0131store          4
        //   921: \u0131const_1       
        //   922: \u0131store          30
        //   924: aload           33
        //   926: astore          31
        //   928: lload           18
        //   930: lstore          20
        //   932: lload           16
        //   934: lstore          22
        //   936: aload           32
        //   938: astore          34
        //   940: \u0131load           26
        //   942: \u0131store          28
        //   944: \u0131load           25
        //   946: \u0131store          29
        //   948: goto            1241
        //   951: aload           37
        //   953: ldc             "domain"
        //   955: \u0131nvokev\u0131rtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   958: \u0131feq            1075
        //   961: \u0131load           5
        //   963: \u0131store          6
        //   965: aload           31
        //   967: ldc             "."
        //   969: \u0131nvokev\u0131rtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   972: \u0131fne            1063
        //   975: aload           31
        //   977: astore          34
        //   979: \u0131load           5
        //   981: \u0131store          6
        //   983: aload           31
        //   985: ldc             "."
        //   987: \u0131nvokev\u0131rtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   990: \u0131feq            1005
        //   993: \u0131load           5
        //   995: \u0131store          6
        //   997: aload           31
        //   999: \u0131const_1       
        //  1000: \u0131nvokev\u0131rtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  1003: astore          34
        //  1005: \u0131load           5
        //  1007: \u0131store          6
        //  1009: aload           34
        //  1011: \u0131nvokestat\u0131c    a/a/c.a:(Ljava/lang/String;)Ljava/lang/String;
        //  1014: astore          31
        //  1016: aload           31
        //  1018: \u0131fnull          1051
        //  1021: \u0131const_0       
        //  1022: \u0131store          29
        //  1024: lload           18
        //  1026: lstore          20
        //  1028: lload           16
        //  1030: lstore          22
        //  1032: aload           32
        //  1034: astore          34
        //  1036: \u0131load           26
        //  1038: \u0131store          28
        //  1040: \u0131load           24
        //  1042: \u0131store          30
        //  1044: \u0131load           5
        //  1046: \u0131store          4
        //  1048: goto            1241
        //  1051: \u0131load           5
        //  1053: \u0131store          6
        //  1055: new             Ljava/lang/IllegalArgumentException;
        //  1058: dup            
        //  1059: \u0131nvokespec\u0131al   java/lang/IllegalArgumentException.<init>:()V
        //  1062: athrow         
        //  1063: \u0131load           5
        //  1065: \u0131store          6
        //  1067: new             Ljava/lang/IllegalArgumentException;
        //  1070: dup            
        //  1071: \u0131nvokespec\u0131al   java/lang/IllegalArgumentException.<init>:()V
        //  1074: athrow         
        //  1075: aload           37
        //  1077: ldc             "path"
        //  1079: \u0131nvokev\u0131rtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  1082: \u0131feq            1120
        //  1085: aload           31
        //  1087: astore          34
        //  1089: aload           33
        //  1091: astore          31
        //  1093: lload           18
        //  1095: lstore          20
        //  1097: lload           16
        //  1099: lstore          22
        //  1101: \u0131load           26
        //  1103: \u0131store          28
        //  1105: \u0131load           25
        //  1107: \u0131store          29
        //  1109: \u0131load           24
        //  1111: \u0131store          30
        //  1113: \u0131load           5
        //  1115: \u0131store          4
        //  1117: goto            1241
        //  1120: aload           37
        //  1122: ldc             "secure"
        //  1124: \u0131nvokev\u0131rtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  1127: \u0131feq            1164
        //  1130: \u0131const_1       
        //  1131: \u0131store          28
        //  1133: aload           33
        //  1135: astore          31
        //  1137: lload           18
        //  1139: lstore          20
        //  1141: lload           16
        //  1143: lstore          22
        //  1145: aload           32
        //  1147: astore          34
        //  1149: \u0131load           25
        //  1151: \u0131store          29
        //  1153: \u0131load           24
        //  1155: \u0131store          30
        //  1157: \u0131load           5
        //  1159: \u0131store          4
        //  1161: goto            1241
        //  1164: aload           33
        //  1166: astore          31
        //  1168: lload           18
        //  1170: lstore          20
        //  1172: lload           16
        //  1174: lstore          22
        //  1176: aload           32
        //  1178: astore          34
        //  1180: \u0131load           26
        //  1182: \u0131store          28
        //  1184: \u0131load           25
        //  1186: \u0131store          29
        //  1188: \u0131load           24
        //  1190: \u0131store          30
        //  1192: \u0131load           5
        //  1194: \u0131store          4
        //  1196: aload           37
        //  1198: ldc             "httponly"
        //  1200: \u0131nvokev\u0131rtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  1203: \u0131feq            1241
        //  1206: \u0131const_1       
        //  1207: \u0131store          27
        //  1209: \u0131load           5
        //  1211: \u0131store          4
        //  1213: \u0131load           24
        //  1215: \u0131store          30
        //  1217: \u0131load           25
        //  1219: \u0131store          29
        //  1221: \u0131load           26
        //  1223: \u0131store          28
        //  1225: aload           32
        //  1227: astore          34
        //  1229: lload           16
        //  1231: lstore          22
        //  1233: lload           18
        //  1235: lstore          20
        //  1237: aload           33
        //  1239: astore          31
        //  1241: \u0131load           13
        //  1243: \u0131const_1       
        //  1244: \u0131add           
        //  1245: \u0131store          5
        //  1247: aload           31
        //  1249: astore          33
        //  1251: lload           20
        //  1253: lstore          18
        //  1255: lload           22
        //  1257: lstore          16
        //  1259: aload           34
        //  1261: astore          32
        //  1263: \u0131load           28
        //  1265: \u0131store          26
        //  1267: \u0131load           29
        //  1269: \u0131store          25
        //  1271: \u0131load           30
        //  1273: \u0131store          24
        //  1275: goto            130
        //  1278: ldc2_w          -9223372036854775808
        //  1281: lstore          20
        //  1283: lload           18
        //  1285: ldc2_w          -9223372036854775808
        //  1288: lcmp           
        //  1289: \u0131fne            1298
        //  1292: lload           20
        //  1294: lstore_0       
        //  1295: goto            1367
        //  1298: lload           18
        //  1300: ldc2_w          -1
        //  1303: lcmp           
        //  1304: \u0131feq            1364
        //  1307: lload           18
        //  1309: ldc2_w          9223372036854775
        //  1312: lcmp           
        //  1313: \u0131fgt            1327
        //  1316: lload           18
        //  1318: ldc2_w          1000
        //  1321: lmul           
        //  1322: lstore          16
        //  1324: goto            1332
        //  1327: ldc2_w          9223372036854775807
        //  1330: lstore          16
        //  1332: lload_0        
        //  1333: lload           16
        //  1335: ladd           
        //  1336: lstore          16
        //  1338: lload           16
        //  1340: lload_0        
        //  1341: lcmp           
        //  1342: \u0131flt            1357
        //  1345: lload           16
        //  1347: lstore_0       
        //  1348: lload           16
        //  1350: ldc2_w          253402300799999
        //  1353: lcmp           
        //  1354: \u0131fle            1295
        //  1357: ldc2_w          253402300799999
        //  1360: lstore_0       
        //  1361: goto            1367
        //  1364: lload           16
        //  1366: lstore_0       
        //  1367: aload           33
        //  1369: \u0131fnonnull       1380
        //  1372: aload_2        
        //  1373: getf\u0131eld        a/r.b:Ljava/lang/String;
        //  1376: astore_3       
        //  1377: goto            1467
        //  1380: aload_2        
        //  1381: getf\u0131eld        a/r.b:Ljava/lang/String;
        //  1384: astore_3       
        //  1385: aload_3        
        //  1386: aload           33
        //  1388: \u0131nvokev\u0131rtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1391: \u0131feq            1400
        //  1394: \u0131const_1       
        //  1395: \u0131store          4
        //  1397: goto            1454
        //  1400: aload_3        
        //  1401: aload           33
        //  1403: \u0131nvokev\u0131rtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //  1406: \u0131feq            1451
        //  1409: aload_3        
        //  1410: \u0131nvokev\u0131rtual   java/lang/String.length:()I
        //  1413: \u0131store          5
        //  1415: aload           33
        //  1417: \u0131nvokev\u0131rtual   java/lang/String.length:()I
        //  1420: \u0131store          6
        //  1422: \u0131const_1       
        //  1423: \u0131store          4
        //  1425: aload_3        
        //  1426: \u0131load           5
        //  1428: \u0131load           6
        //  1430: \u0131sub           
        //  1431: \u0131const_1       
        //  1432: \u0131sub           
        //  1433: \u0131nvokev\u0131rtual   java/lang/String.charAt:(I)C
        //  1436: b\u0131push          46
        //  1438: \u0131f_\u0131cmpne       1451
        //  1441: aload_3        
        //  1442: \u0131nvokestat\u0131c    a/a/c.c:(Ljava/lang/String;)Z
        //  1445: \u0131fne            1451
        //  1448: goto            1454
        //  1451: \u0131const_0       
        //  1452: \u0131store          4
        //  1454: \u0131load           4
        //  1456: \u0131fne            1461
        //  1459: aconst_null    
        //  1460: areturn        
        //  1461: aload           33
        //  1463: astore_3       
        //  1464: goto            1377
        //  1467: aload           32
        //  1469: \u0131fnull          1491
        //  1472: aload           32
        //  1474: ldc             "/"
        //  1476: \u0131nvokev\u0131rtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //  1479: \u0131fne            1485
        //  1482: goto            1491
        //  1485: aload           32
        //  1487: astore_2       
        //  1488: goto            1523
        //  1491: aload_2        
        //  1492: \u0131nvokev\u0131rtual   a/r.e:()Ljava/lang/String;
        //  1495: astore_2       
        //  1496: aload_2        
        //  1497: b\u0131push          47
        //  1499: \u0131nvokev\u0131rtual   java/lang/String.lastIndexOf:(I)I
        //  1502: \u0131store          4
        //  1504: \u0131load           4
        //  1506: \u0131feq            1520
        //  1509: aload_2        
        //  1510: \u0131const_0       
        //  1511: \u0131load           4
        //  1513: \u0131nvokev\u0131rtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1516: astore_2       
        //  1517: goto            1523
        //  1520: ldc             "/"
        //  1522: astore_2       
        //  1523: new             La/k;
        //  1526: dup            
        //  1527: aload           35
        //  1529: aload           36
        //  1531: lload_0        
        //  1532: aload_3        
        //  1533: aload_2        
        //  1534: \u0131load           26
        //  1536: \u0131load           27
        //  1538: \u0131load           25
        //  1540: \u0131load           24
        //  1542: \u0131nvokespec\u0131al   a/k.<init>:(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V
        //  1545: areturn        
        //  1546: aconst_null    
        //  1547: areturn        
        //  1548: astore          31
        //  1550: goto            853
        //  1553: astore          31
        //  1555: goto            857
        //  1558: astore          31
        //  1560: aload           33
        //  1562: astore          31
        //  1564: lload           18
        //  1566: lstore          20
        //  1568: lload           16
        //  1570: lstore          22
        //  1572: aload           32
        //  1574: astore          34
        //  1576: \u0131load           26
        //  1578: \u0131store          28
        //  1580: \u0131load           25
        //  1582: \u0131store          29
        //  1584: \u0131load           24
        //  1586: \u0131store          30
        //  1588: \u0131load           6
        //  1590: \u0131store          4
        //  1592: goto            1241
        //  1595: goto            477
        //  1598: goto            511
        //  1601: goto            793
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  221    228    1548   857    Ljava/lang/IllegalArgumentException;
        //  232    243    1548   857    Ljava/lang/IllegalArgumentException;
        //  247    257    1548   857    Ljava/lang/IllegalArgumentException;
        //  283    297    1548   857    Ljava/lang/IllegalArgumentException;
        //  301    311    1548   857    Ljava/lang/IllegalArgumentException;
        //  321    335    1548   857    Ljava/lang/IllegalArgumentException;
        //  339    350    1548   857    Ljava/lang/IllegalArgumentException;
        //  354    365    1548   857    Ljava/lang/IllegalArgumentException;
        //  369    380    1548   857    Ljava/lang/IllegalArgumentException;
        //  393    407    1548   857    Ljava/lang/IllegalArgumentException;
        //  411    422    1548   857    Ljava/lang/IllegalArgumentException;
        //  431    474    1553   1558   Ljava/lang/IllegalArgumentException;
        //  483    508    1553   1558   Ljava/lang/IllegalArgumentException;
        //  511    525    1553   1558   Ljava/lang/IllegalArgumentException;
        //  652    664    1558   1595   Ljava/lang/IllegalArgumentException;
        //  668    674    1558   1595   Ljava/lang/IllegalArgumentException;
        //  678    686    1558   1595   Ljava/lang/IllegalArgumentException;
        //  690    700    1558   1595   Ljava/lang/IllegalArgumentException;
        //  704    712    1558   1595   Ljava/lang/IllegalArgumentException;
        //  716    725    1558   1595   Ljava/lang/IllegalArgumentException;
        //  729    738    1558   1595   Ljava/lang/IllegalArgumentException;
        //  742    751    1558   1595   Ljava/lang/IllegalArgumentException;
        //  755    763    1558   1595   Ljava/lang/IllegalArgumentException;
        //  767    774    1558   1595   Ljava/lang/IllegalArgumentException;
        //  785    793    1558   1595   Ljava/lang/IllegalArgumentException;
        //  797    805    1558   1595   Ljava/lang/IllegalArgumentException;
        //  809    817    1558   1595   Ljava/lang/IllegalArgumentException;
        //  821    829    1558   1595   Ljava/lang/IllegalArgumentException;
        //  833    841    1558   1595   Ljava/lang/IllegalArgumentException;
        //  845    853    1558   1595   Ljava/lang/IllegalArgumentException;
        //  906    913    1558   1595   Ljava/lang/NumberFormatException;
        //  965    975    1558   1595   Ljava/lang/IllegalArgumentException;
        //  983    993    1558   1595   Ljava/lang/IllegalArgumentException;
        //  997    1005   1558   1595   Ljava/lang/IllegalArgumentException;
        //  1009   1016   1558   1595   Ljava/lang/IllegalArgumentException;
        //  1055   1063   1558   1595   Ljava/lang/IllegalArgumentException;
        //  1067   1075   1558   1595   Ljava/lang/IllegalArgumentException;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static List<k> a(final r r, final q q) {
        final int n = q.a.length / 2;
        final int n2 = 0;
        final List<k> list = null;
        List<? extends String> list2 = null;
        List<? extends String> list3;
        for (int i = 0; i < n; ++i, list2 = list3) {
            list3 = list2;
            if ("Set-Cookie".equalsIgnoreCase(q.a(i))) {
                if ((list3 = list2) == null) {
                    list3 = new ArrayList<String>(2);
                }
                list3.add(q.b(i));
            }
        }
        List<Object> list4;
        if (list2 != null) {
            list4 = Collections.unmodifiableList((List<?>)list2);
        }
        else {
            list4 = Collections.emptyList();
        }
        final int size = list4.size();
        List<k> list5 = list;
        List<k> list6;
        for (int j = n2; j < size; ++j, list5 = list6) {
            final k a = a(System.currentTimeMillis(), r, list4.get(j));
            list6 = list5;
            if (a != null) {
                if ((list6 = list5) == null) {
                    list6 = new ArrayList<k>();
                }
                list6.add(a);
            }
        }
        if (list5 != null) {
            return (List<k>)Collections.unmodifiableList((List<?>)list5);
        }
        return Collections.emptyList();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof k)) {
            return false;
        }
        final k k = (k)o;
        return k.a.equals(this.a) && k.b.equals(this.b) && k.h.equals(this.h) && k.i.equals(this.i) && k.g == this.g && k.j == this.j && k.k == this.k && k.l == this.l && k.m == this.m;
    }
    
    @Override
    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.h.hashCode()) * 31 + this.i.hashCode()) * 31 + (int)(this.g ^ this.g >>> 32)) * 31 + ((this.j ^ true) ? 1 : 0)) * 31 + ((this.k ^ true) ? 1 : 0)) * 31 + ((this.l ^ true) ? 1 : 0)) * 31 + ((this.m ^ true) ? 1 : 0);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.l) {
            if (this.g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            }
            else {
                sb.append("; expires=");
                sb.append(a.a.c.d.a(new Date(this.g)));
            }
        }
        if (!this.m) {
            sb.append("; domain=");
            sb.append(this.h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
