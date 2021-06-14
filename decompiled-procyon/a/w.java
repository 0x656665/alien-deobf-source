package a;

import java.io.*;
import java.util.*;
import a.a.c.*;

public final class w implements e
{
    final u a;
    final j b;
    final x c;
    final boolean d;
    private boolean e;
    
    public w(final u a, final x c, final boolean d) {
        super();
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = new j(a, d);
    }
    
    @Override
    public final z a() {
        synchronized (this) {
            if (!this.e) {
                this.e = true;
                // monitorexit(this)
                this.b.a = a.a.g.e.b().a("response.body().close()");
                try {
                    this.a.c.a(this);
                    final z b = this.b();
                    if (b != null) {
                        return b;
                    }
                    throw new IOException("Canceled");
                }
                finally {
                    this.a.c.b(this);
                }
            }
            throw new IllegalStateException("Already Executed");
        }
    }
    
    final z b() {
        final ArrayList<Object> list = new ArrayList<Object>();
        list.addAll(this.a.g);
        list.add(this.b);
        list.add(new a.a.c.a(this.a.j));
        list.add(new a.a.a.a(this.a.a()));
        list.add(new a.a.b.a(this.a));
        if (!this.d) {
            list.addAll(this.a.h);
        }
        list.add(new b(this.d));
        return ((s.a)new g((List<s>)list, null, null, null, 0, this.c)).a(this.c);
    }
    
    public final /* synthetic */ Object clone() {
        return new w(this.a, this.c, this.d);
    }
    
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
}
