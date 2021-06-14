/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.b;

import a.a;
import a.a.b.d;
import a.a.c;
import a.ab;
import a.n;
import a.r;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public final class f {
    final a a;
    final d b;
    private Proxy c;
    private InetSocketAddress d;
    private List<Proxy> e = Collections.emptyList();
    private int f;
    private List<InetSocketAddress> g = Collections.emptyList();
    private int h;
    private final List<ab> i = new ArrayList<ab>();

    public f(a list, d object) {
        this.a = list;
        this.b = object;
        object = ((a)list).a;
        list = ((a)list).h;
        list = list != null ? Collections.singletonList(list) : ((list = this.a.g.select(((r)object).a())) != null && !list.isEmpty() ? c.a(list) : c.a(Proxy.NO_PROXY));
        this.e = list;
        this.f = 0;
    }

    private void a(Proxy list) {
        int n2;
        Object object;
        this.g = new ArrayList<InetSocketAddress>();
        if (((Proxy)((Object)list)).type() != Proxy.Type.DIRECT && ((Proxy)((Object)list)).type() != Proxy.Type.SOCKS) {
            object = ((Proxy)((Object)list)).address();
            if (!(object instanceof InetSocketAddress)) {
                list = new StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                ((StringBuilder)((Object)list)).append(object.getClass());
                throw new IllegalArgumentException(((StringBuilder)((Object)list)).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress)object;
            object = inetSocketAddress.getAddress();
            object = object == null ? inetSocketAddress.getHostName() : ((InetAddress)object).getHostAddress();
            n2 = inetSocketAddress.getPort();
        } else {
            object = this.a.a.b;
            n2 = this.a.a.c;
        }
        if (n2 > 0 && n2 <= 65535) {
            if (((Proxy)((Object)list)).type() == Proxy.Type.SOCKS) {
                this.g.add(InetSocketAddress.createUnresolved((String)object, n2));
            } else {
                list = this.a.b.a((String)object);
                int n3 = list.size();
                for (int i2 = 0; i2 < n3; ++i2) {
                    object = list.get(i2);
                    this.g.add(new InetSocketAddress((InetAddress)object, n2));
                }
            }
            this.h = 0;
            return;
        }
        list = new StringBuilder("No route to ");
        ((StringBuilder)((Object)list)).append((String)object);
        ((StringBuilder)((Object)list)).append(":");
        ((StringBuilder)((Object)list)).append(n2);
        ((StringBuilder)((Object)list)).append("; port is out of range");
        throw new SocketException(((StringBuilder)((Object)list)).toString());
    }

    public final ab a() {
        do {
            int n2;
            Object object;
            if (!this.c()) {
                if (!this.b()) {
                    if (!this.d()) throw new NoSuchElementException();
                    return this.i.remove(0);
                }
                if (!this.b()) {
                    object = new StringBuilder("No route to ");
                    ((StringBuilder)object).append(this.a.a.b);
                    ((StringBuilder)object).append("; exhausted proxy configurations: ");
                    ((StringBuilder)object).append(this.e);
                    throw new SocketException(((StringBuilder)object).toString());
                }
                object = this.e;
                n2 = this.f;
                this.f = n2 + 1;
                object = (Proxy)object.get(n2);
                this.a((Proxy)object);
                this.c = object;
            }
            if (!this.c()) {
                object = new StringBuilder("No route to ");
                ((StringBuilder)object).append(this.a.a.b);
                ((StringBuilder)object).append("; exhausted inet socket addresses: ");
                ((StringBuilder)object).append(this.g);
                throw new SocketException(((StringBuilder)object).toString());
            }
            object = this.g;
            n2 = this.h;
            this.h = n2 + 1;
            this.d = (InetSocketAddress)object.get(n2);
            object = new ab(this.a, this.c, this.d);
            if (!this.b.c((ab)object)) return object;
            this.i.add((ab)object);
        } while (true);
    }

    final boolean b() {
        if (this.f >= this.e.size()) return false;
        return true;
    }

    final boolean c() {
        if (this.h >= this.g.size()) return false;
        return true;
    }

    final boolean d() {
        if (this.i.isEmpty()) return false;
        return true;
    }
}

