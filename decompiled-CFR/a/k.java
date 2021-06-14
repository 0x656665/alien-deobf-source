/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.c.d;
import a.q;
import a.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public final class k {
    private static final Pattern c = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern d = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern e = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern f = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    private k(String string, String string2, long l2, String string3, String string4, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.a = string;
        this.b = string2;
        this.g = l2;
        this.h = string3;
        this.i = string4;
        this.j = bl;
        this.k = bl2;
        this.m = bl3;
        this.l = bl4;
    }

    private static int a(String string, int n2, int n3, boolean bl) {
        while (n2 < n3) {
            char c2 = string.charAt(n2);
            c2 = !(c2 < ' ' && c2 != '\t' || c2 >= '' || c2 >= '0' && c2 <= '9' || c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z' || c2 == ':') ? (char)'\u0000' : '\u0001';
            if (c2 == (bl ^ true)) {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    private static long a(String string) {
        try {
            long l2 = Long.parseLong(string);
            if (l2 > 0L) return l2;
            return Long.MIN_VALUE;
        }
        catch (NumberFormatException numberFormatException) {
            if (!string.matches("-?\\d+")) throw numberFormatException;
            if (!string.startsWith("-")) return Long.MAX_VALUE;
            return Long.MIN_VALUE;
        }
    }

    /*
     * Exception decompiling
     */
    private static k a(long var0, r var2_1, String var3_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 9[WHILELOOP]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:427)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:479)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:696)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:184)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:129)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:397)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:906)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:797)
        // org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:225)
        // org.benf.cfr.reader.Driver.doJar(Driver.java:109)
        // org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
        // org.benf.cfr.reader.Main.main(Main.java:48)
        // the.bytecode.club.bytecodeviewer.decompilers.CFRDecompiler.decompileToZip(CFRDecompiler.java:311)
        // the.bytecode.club.bytecodeviewer.gui.MainViewerGUI$14$1$3.run(MainViewerGUI.java:1211)
        throw new IllegalStateException("Decompilation failed");
    }

    public static List<k> a(r r2, q object) {
        int n2;
        List list;
        int n3 = ((q)object).a.length / 2;
        int n4 = 0;
        k k2 = null;
        ArrayList<k> arrayList = null;
        for (n2 = 0; n2 < n3; ++n2) {
            list = arrayList;
            if ("Set-Cookie".equalsIgnoreCase(((q)object).a(n2))) {
                list = arrayList;
                if (arrayList == null) {
                    list = new ArrayList(2);
                }
                list.add(((q)object).b(n2));
            }
            arrayList = list;
        }
        list = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
        n3 = list.size();
        object = k2;
        n2 = n4;
        do {
            if (n2 >= n3) {
                if (object == null) return Collections.emptyList();
                return Collections.unmodifiableList(object);
            }
            arrayList = (String)list.get(n2);
            k2 = k.a(System.currentTimeMillis(), r2, (String)((Object)arrayList));
            arrayList = object;
            if (k2 != null) {
                arrayList = object;
                if (object == null) {
                    arrayList = new ArrayList<k>();
                }
                arrayList.add(k2);
            }
            ++n2;
            object = arrayList;
        } while (true);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof k)) {
            return false;
        }
        object = (k)object;
        if (!((k)object).a.equals(this.a)) return false;
        if (!((k)object).b.equals(this.b)) return false;
        if (!((k)object).h.equals(this.h)) return false;
        if (!((k)object).i.equals(this.i)) return false;
        if (((k)object).g != this.g) return false;
        if (((k)object).j != this.j) return false;
        if (((k)object).k != this.k) return false;
        if (((k)object).l != this.l) return false;
        if (((k)object).m != this.m) return false;
        return true;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.h.hashCode()) * 31 + this.i.hashCode()) * 31 + (int)(this.g ^ this.g >>> 32)) * 31 + (this.j ^ true)) * 31 + (this.k ^ true)) * 31 + (this.l ^ true)) * 31 + (this.m ^ true);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append('=');
        stringBuilder.append(this.b);
        if (this.l) {
            if (this.g == Long.MIN_VALUE) {
                stringBuilder.append("; max-age=0");
            } else {
                stringBuilder.append("; expires=");
                stringBuilder.append(d.a(new Date(this.g)));
            }
        }
        if (!this.m) {
            stringBuilder.append("; domain=");
            stringBuilder.append(this.h);
        }
        stringBuilder.append("; path=");
        stringBuilder.append(this.i);
        if (this.j) {
            stringBuilder.append("; secure");
        }
        if (!this.k) return stringBuilder.toString();
        stringBuilder.append("; httponly");
        return stringBuilder.toString();
    }
}

