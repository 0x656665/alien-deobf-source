/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import a.a.b;
import a.a.b.g;
import a.a.c.c;
import a.a.c.j;
import a.a.g.e;
import a.h;
import a.l;
import a.m;
import a.r;
import a.s;
import a.u;
import a.x;
import a.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class w
implements a.e {
    final u a;
    final j b;
    final x c;
    final boolean d;
    private boolean e;

    public w(u u2, x x2, boolean bl) {
        this.a = u2;
        this.c = x2;
        this.d = bl;
        this.b = new j(u2, bl);
    }

    /*
     * Enabled unnecessary exception pruning
     */
    @Override
    public final z a() {
        Object object;
        synchronized (this) {
            if (this.e) throw new IllegalStateException("Already Executed");
            this.e = true;
        }
        this.b.a = object = e.b().a("response.body().close()");
        try {
            this.a.c.a(this);
            object = this.b();
            if (object == null) throw new IOException("Canceled");
            this.a.c.b(this);
            return object;
        }
        catch (Throwable throwable) {
            this.a.c.b(this);
            throw throwable;
        }
    }

    final z b() {
        ArrayList<s> arrayList = new ArrayList<s>();
        arrayList.addAll(this.a.g);
        arrayList.add(this.b);
        arrayList.add(new a.a.c.a(this.a.j));
        arrayList.add(new a.a.a.a(this.a.a()));
        arrayList.add(new a.a.b.a(this.a));
        if (!this.d) {
            arrayList.addAll(this.a.h);
        }
        arrayList.add(new a.a.c.b(this.d));
        return new a.a.c.g(arrayList, null, null, null, 0, this.c).a(this.c);
    }

    public final /* synthetic */ Object clone() {
        return new w(this.a, this.c, this.d);
    }

    final class a
    extends b {
        final /* synthetic */ w a;

        final String a() {
            return this.a.c.a.b;
        }

        /*
         * Exception decompiling
         */
        @Override
        public final void blockBack2() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:404)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:482)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:607)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:696)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:184)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:129)
            // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.Method.analyse(Method.java:397)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:906)
            // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:778)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:886)
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

}

