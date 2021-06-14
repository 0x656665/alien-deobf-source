/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.h;

import javax.security.auth.x500.X500Principal;

final class c {
    final String a;
    final int b;
    int c;
    int d;
    int e;
    int f;
    char[] g;

    public c(X500Principal x500Principal) {
        this.a = x500Principal.getName("RFC2253");
        this.b = this.a.length();
    }

    private int a(int n2) {
        block10 : {
            int n3;
            block8 : {
                block9 : {
                    block7 : {
                        n3 = n2 + 1;
                        if (n3 >= this.b) {
                            StringBuilder stringBuilder = new StringBuilder("Malformed DN: ");
                            stringBuilder.append(this.a);
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                        if ((n2 = this.g[n2]) < 48 || n2 > 57) break block7;
                        n2 -= 48;
                        break block8;
                    }
                    if (n2 < 97 || n2 > 102) break block9;
                    n2 -= 87;
                    break block8;
                }
                if (n2 < 65 || n2 > 70) break block10;
                n2 -= 55;
            }
            n3 = this.g[n3];
            if (n3 >= 48 && n3 <= 57) {
                return (n2 << 4) + (n3 -= 48);
            }
            if (n3 >= 97 && n3 <= 102) {
                return (n2 << 4) + (n3 -= 87);
            }
            if (n3 >= 65 && n3 <= 70) {
                n3 -= 55;
                return (n2 << 4) + n3;
            }
            StringBuilder stringBuilder = new StringBuilder("Malformed DN: ");
            stringBuilder.append(this.a);
            throw new IllegalStateException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder("Malformed DN: ");
        stringBuilder.append(this.a);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private char e() {
        int n2;
        int n3 = this.a(this.c);
        ++this.c;
        if (n3 < 128) {
            return (char)n3;
        }
        if (n3 < 192) return '?';
        if (n3 > 247) return '?';
        if (n3 <= 223) {
            n3 &= 31;
            n2 = 1;
        } else if (n3 <= 239) {
            n2 = 2;
            n3 &= 15;
        } else {
            n2 = 3;
            n3 &= 7;
        }
        int n4 = 0;
        while (n4 < n2) {
            ++this.c;
            if (this.c == this.b) return '?';
            if (this.g[this.c] != '\\') {
                return '?';
            }
            ++this.c;
            int n5 = this.a(this.c);
            ++this.c;
            if ((n5 & 192) != 128) {
                return '?';
            }
            n3 = (n3 << 6) + (n5 & 63);
            ++n4;
        }
        return (char)n3;
    }

    final String a() {
        while (this.c < this.b && this.g[this.c] == ' ') {
            ++this.c;
        }
        if (this.c == this.b) {
            return null;
        }
        this.d = this.c++;
        while (this.c < this.b && this.g[this.c] != '=' && this.g[this.c] != ' ') {
            ++this.c;
        }
        if (this.c >= this.b) {
            StringBuilder stringBuilder = new StringBuilder("Unexpected end of DN: ");
            stringBuilder.append(this.a);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.e = this.c;
        if (this.g[this.c] == ' ') {
            while (this.c < this.b && this.g[this.c] != '=' && this.g[this.c] == ' ') {
                ++this.c;
            }
            if (this.g[this.c] != '=' || this.c == this.b) {
                StringBuilder stringBuilder = new StringBuilder("Unexpected end of DN: ");
                stringBuilder.append(this.a);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        do {
            ++this.c;
        } while (this.c < this.b && this.g[this.c] == ' ');
        if (this.e - this.d <= 4) return new String(this.g, this.d, this.e - this.d);
        if (this.g[this.d + 3] != '.') return new String(this.g, this.d, this.e - this.d);
        if (this.g[this.d] != 'O') {
            if (this.g[this.d] != 'o') return new String(this.g, this.d, this.e - this.d);
        }
        if (this.g[this.d + 1] != 'I') {
            if (this.g[this.d + 1] != 'i') return new String(this.g, this.d, this.e - this.d);
        }
        if (this.g[this.d + 2] != 'D') {
            if (this.g[this.d + 2] != 'd') return new String(this.g, this.d, this.e - this.d);
        }
        this.d += 4;
        return new String(this.g, this.d, this.e - this.d);
    }

    final String b() {
        int n2;
        Object[] arrobject;
        int n3;
        block7 : {
            if (this.c + 4 >= this.b) {
                StringBuilder stringBuilder = new StringBuilder("Unexpected end of DN: ");
                stringBuilder.append(this.a);
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.d = this.c++;
            while (this.c != this.b && this.g[this.c] != '+' && this.g[this.c] != ',' && this.g[this.c] != ';') {
                if (this.g[this.c] == ' ') {
                    this.e = this.c++;
                    while (this.c < this.b && this.g[this.c] == ' ') {
                        ++this.c;
                    }
                    break block7;
                }
                if (this.g[this.c] >= 'A' && this.g[this.c] <= 'F') {
                    arrobject = this.g;
                    n3 = this.c;
                    arrobject[n3] = (char)(arrobject[n3] + 32);
                }
                ++this.c;
            }
            this.e = this.c;
        }
        if ((n2 = this.e - this.d) >= 5 && (n2 & 1) != 0) {
            arrobject = new byte[n2 / 2];
            n3 = 0;
            int n4 = this.d + 1;
            while (n3 < arrobject.length) {
                arrobject[n3] = (byte)this.a(n4);
                n4 += 2;
                ++n3;
            }
            return new String(this.g, this.d, n2);
        }
        arrobject = new StringBuilder("Unexpected end of DN: ");
        arrobject.append(this.a);
        throw new IllegalStateException(arrobject.toString());
    }

    /*
     * Exception decompiling
     */
    final String c() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:478)
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

    final char d() {
        ++this.c;
        if (this.c == this.b) {
            StringBuilder stringBuilder = new StringBuilder("Unexpected end of DN: ");
            stringBuilder.append(this.a);
            throw new IllegalStateException(stringBuilder.toString());
        }
        char c2 = this.g[this.c];
        if (c2 == ' ') return this.g[this.c];
        if (c2 == '%') return this.g[this.c];
        if (c2 == '\\') return this.g[this.c];
        if (c2 == '_') return this.g[this.c];
        switch (c2) {
            default: {
                switch (c2) {
                    default: {
                        switch (c2) {
                            default: {
                                return this.e();
                            }
                            case ';': 
                            case '<': 
                            case '=': 
                            case '>': 
                        }
                    }
                    case '*': 
                    case '+': 
                    case ',': 
                }
            }
            case '\"': 
            case '#': 
        }
        return this.g[this.c];
    }
}

