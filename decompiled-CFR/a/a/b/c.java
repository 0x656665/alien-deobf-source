/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.b;

import a.a;
import a.a.b.g;
import a.a.e.b;
import a.a.e.g;
import a.a.g.e;
import a.ab;
import a.h;
import a.i;
import a.p;
import a.r;
import a.v;
import b.d;
import b.k;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;

public final class c
extends g.b
implements h {
    public final ab a;
    public Socket b;
    public p c;
    a.a.e.g d;
    b.e e;
    d f;
    public boolean g;
    public int h;
    public int i = 1;
    public final List<Reference<g>> j = new ArrayList<Reference<g>>();
    public long k = Long.MAX_VALUE;
    private final i m;
    private Socket n;
    private v o;

    public c(i i2, ab ab2) {
        this.m = i2;
        this.a = ab2;
    }

    private void a(int n2, int n3) {
        Object object = this.a.b;
        Object object2 = this.a.a;
        object = ((Proxy)object).type() != Proxy.Type.DIRECT && ((Proxy)object).type() != Proxy.Type.HTTP ? new Socket((Proxy)object) : ((a)object2).c.createSocket();
        this.n = object;
        this.n.setSoTimeout(n3);
        try {
            e.b().a(this.n, this.a.c, n2);
        }
        catch (ConnectException connectException) {
            object2 = new StringBuilder("Failed to connect to ");
            ((StringBuilder)object2).append(this.a.c);
            object2 = new ConnectException(((StringBuilder)object2).toString());
            ((Throwable)object2).initCause(connectException);
            throw object2;
        }
        this.e = k.a(k.b(this.n));
        this.f = k.a(k.a(this.n));
    }

    @Override
    public final ab a() {
        return this.a;
    }

    /*
     * Exception decompiling
     */
    public final void a(int var1_1, int var2_2, int var3_3, boolean var4_4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:414)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:226)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:580)
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

    @Override
    public final void a(a.a.e.g g2) {
        i i2 = this.m;
        synchronized (i2) {
            this.i = g2.a();
            return;
        }
    }

    @Override
    public final void a(a.a.e.i i2) {
        i2.a(b.e);
    }

    public final boolean a(a a2) {
        if (this.j.size() >= this.i) return false;
        if (!a2.equals(this.a.a)) return false;
        if (this.g) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    public final boolean a(boolean var1_1) {
        if (this.b.isClosed() != false) return false;
        if (this.b.isInputShutdown() != false) return false;
        if (this.b.isOutputShutdown()) {
            return false;
        }
        if (this.d != null) {
            if (this.d.b() != false) return false;
            return true;
        }
        if (var1_1 == false) return true;
        var2_2 = this.b.getSoTimeout();
        this.b.setSoTimeout(1);
        var1_1 = this.e.c();
        if (!var1_1) ** GOTO lbl21
        {
            catch (Throwable var3_3) {
                this.b.setSoTimeout(var2_2);
                throw var3_3;
            }
        }
        try {
            this.b.setSoTimeout(var2_2);
            return false;
lbl21: // 1 sources:
            this.b.setSoTimeout(var2_2);
            return true;
        }
        catch (SocketTimeoutException var3_4) {
            return true;
        }
        catch (IOException var3_5) {
            return false;
        }
    }

    public final boolean b() {
        if (this.d == null) return false;
        return true;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Connection{");
        stringBuilder.append(this.a.a.a.b);
        stringBuilder.append(":");
        stringBuilder.append(this.a.a.a.c);
        stringBuilder.append(", proxy=");
        stringBuilder.append(this.a.b);
        stringBuilder.append(" hostAddress=");
        stringBuilder.append(this.a.c);
        stringBuilder.append(" cipherSuite=");
        Object object = this.c != null ? this.c.a : "none";
        stringBuilder.append(object);
        stringBuilder.append(" protocol=");
        stringBuilder.append((Object)this.o);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

