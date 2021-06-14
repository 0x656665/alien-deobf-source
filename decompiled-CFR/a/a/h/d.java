/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.h;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class d
implements HostnameVerifier {
    public static final d a = new d();

    private d() {
    }

    public static List<String> a(X509Certificate object) {
        List<String> list = d.a((X509Certificate)object, 7);
        object = d.a((X509Certificate)object, 2);
        ArrayList<String> arrayList = new ArrayList<String>(list.size() + object.size());
        arrayList.addAll(list);
        arrayList.addAll((Collection<String>)object);
        return arrayList;
    }

    private static List<String> a(X509Certificate iterator, int n2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            iterator = ((X509Certificate)((Object)iterator)).getSubjectAlternativeNames();
            if (iterator == null) {
                return Collections.emptyList();
            }
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Integer n3;
                Object object = (List)iterator.next();
                if (object == null || object.size() < 2 || (n3 = (Integer)object.get(0)) == null || n3 != n2 || (object = (String)object.get(1)) == null) continue;
                arrayList.add((String)object);
            }
            return arrayList;
        }
        catch (CertificateParsingException certificateParsingException) {
            return Collections.emptyList();
        }
    }

    private static boolean a(String charSequence, String string) {
        if (charSequence == null) return false;
        if (((String)charSequence).length() == 0) return false;
        if (((String)charSequence).startsWith(".")) return false;
        if (((String)charSequence).endsWith("..")) {
            return false;
        }
        if (string == null) return false;
        if (string.length() == 0) return false;
        if (string.startsWith(".")) return false;
        if (string.endsWith("..")) {
            return false;
        }
        CharSequence charSequence2 = charSequence;
        if (!((String)charSequence).endsWith(".")) {
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append((String)charSequence);
            ((StringBuilder)charSequence2).append('.');
            charSequence2 = ((StringBuilder)charSequence2).toString();
        }
        charSequence = string;
        if (!string.endsWith(".")) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append('.');
            charSequence = ((StringBuilder)charSequence).toString();
        }
        if (!((String)(charSequence = ((String)charSequence).toLowerCase(Locale.US))).contains("*")) {
            return ((String)charSequence2).equals(charSequence);
        }
        if (!((String)charSequence).startsWith("*.")) return false;
        if (((String)charSequence).indexOf(42, 1) != -1) {
            return false;
        }
        if (((String)charSequence2).length() < ((String)charSequence).length()) {
            return false;
        }
        if ("*.".equals(charSequence)) {
            return false;
        }
        if (!((String)charSequence2).endsWith((String)(charSequence = ((String)charSequence).substring(1)))) {
            return false;
        }
        int n2 = ((String)charSequence2).length() - ((String)charSequence).length();
        if (n2 <= 0) return true;
        if (((String)charSequence2).lastIndexOf(46, n2 - 1) == -1) return true;
        return false;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final boolean verify(String var1_1, SSLSession var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:358)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:61)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:376)
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
}

