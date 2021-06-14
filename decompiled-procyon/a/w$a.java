package a;

import a.a.*;
import java.io.*;
import a.a.g.*;

final class a extends b
{
    final /* synthetic */ w a;
    
    final String a() {
        return this.a.c.a.b;
    }
    
    public final void blockBack2() {
        int n = 0;
        while (true) {
            try {
                try {
                    this.a.b();
                    n = n;
                    if (this.a.b.b) {
                        n = 1;
                        new IOException("Canceled");
                    }
                    final m m = this.a.a.c;
                    m.a(this);
                }
                finally {}
            }
            catch (IOException ex) {
                if (n != 0) {
                    final a.a.g.e b = a.a.g.e.b();
                    final StringBuilder sb = new StringBuilder("Callback failure for ");
                    final w a = this.a;
                    final StringBuilder sb2 = new StringBuilder();
                    String s;
                    if (a.b.b) {
                        s = "canceled ";
                    }
                    else {
                        s = "";
                    }
                    sb2.append(s);
                    String s2;
                    if (a.d) {
                        s2 = "web socket";
                    }
                    else {
                        s2 = "call";
                    }
                    sb2.append(s2);
                    sb2.append(" to ");
                    final r.a c = a.c.a.c("/...");
                    c.b = r.a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                    c.c = r.a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                    sb2.append(c.b().toString());
                    sb.append(sb2.toString());
                    b.a(4, sb.toString(), ex);
                }
                final m m = this.a.a.c;
                continue;
                this.a.a.c.a(this);
                throw;
            }
            break;
        }
    }
}
