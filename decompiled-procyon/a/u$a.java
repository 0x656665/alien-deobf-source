package a;

import java.net.*;
import a.a.a.*;
import javax.net.*;
import javax.net.ssl.*;
import java.util.*;
import a.a.h.*;

public static final class a
{
    m a;
    Proxy b;
    List<v> c;
    List<j> d;
    final List<s> e;
    final List<s> f;
    ProxySelector g;
    l h;
    c i;
    e j;
    SocketFactory k;
    SSLSocketFactory l;
    b m;
    HostnameVerifier n;
    f o;
    a.b p;
    a.b q;
    i r;
    n s;
    boolean t;
    boolean u;
    boolean v;
    int w;
    int x;
    int y;
    int z;
    
    public a() {
        super();
        this.e = new ArrayList<s>();
        this.f = new ArrayList<s>();
        this.a = new m();
        this.c = u.a;
        this.d = u.b;
        this.g = ProxySelector.getDefault();
        this.h = l.a;
        this.k = SocketFactory.getDefault();
        this.n = d.a;
        this.o = f.a;
        this.p = a.b.a;
        this.q = a.b.a;
        this.r = new i();
        this.s = n.a;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = 10000;
        this.x = 10000;
        this.y = 10000;
        this.z = 0;
    }
}
