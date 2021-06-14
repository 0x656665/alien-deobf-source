package a.a.b;

import a.a.*;
import a.*;
import java.net.*;
import java.util.*;

public final class f
{
    final a a;
    final d b;
    private Proxy c;
    private InetSocketAddress d;
    private List<Proxy> e;
    private int f;
    private List<InetSocketAddress> g;
    private int h;
    private final List<ab> i;
    
    public f(final a a, final d b) {
        super();
        this.e = Collections.emptyList();
        this.g = Collections.emptyList();
        this.i = new ArrayList<ab>();
        this.a = a;
        this.b = b;
        final r a2 = a.a;
        final Proxy h = a.h;
        List<Proxy> e;
        if (h != null) {
            e = Collections.singletonList(h);
        }
        else {
            final List<Proxy> select = this.a.g.select(a2.a());
            if (select != null && !select.isEmpty()) {
                e = a.a.c.a(select);
            }
            else {
                e = a.a.c.a(Proxy.NO_PROXY);
            }
        }
        this.e = e;
        this.f = 0;
    }
    
    private void a(final Proxy proxy) {
        this.g = new ArrayList<InetSocketAddress>();
        String s;
        int n;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            final SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                final StringBuilder sb = new StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                sb.append(((InetSocketAddress)address).getClass());
                throw new IllegalArgumentException(sb.toString());
            }
            final InetSocketAddress \u0131netSocketAddress = (InetSocketAddress)address;
            final InetAddress address2 = \u0131netSocketAddress.getAddress();
            if (address2 == null) {
                s = \u0131netSocketAddress.getHostName();
            }
            else {
                s = address2.getHostAddress();
            }
            n = \u0131netSocketAddress.getPort();
        }
        else {
            s = this.a.a.b;
            n = this.a.a.c;
        }
        if (n > 0 && n <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.g.add(InetSocketAddress.createUnresolved(s, n));
            }
            else {
                final List<InetAddress> a = this.a.b.a(s);
                for (int size = a.size(), i = 0; i < size; ++i) {
                    this.g.add(new InetSocketAddress(a.get(i), n));
                }
            }
            this.h = 0;
            return;
        }
        final StringBuilder sb2 = new StringBuilder("No route to ");
        sb2.append(s);
        sb2.append(":");
        sb2.append(n);
        sb2.append("; port is out of range");
        throw new SocketException(sb2.toString());
    }
    
    public final ab a() {
        while (true) {
            if (!this.c()) {
                if (!this.b()) {
                    if (this.d()) {
                        return this.i.remove(0);
                    }
                    throw new NoSuchElementException();
                }
                else {
                    if (!this.b()) {
                        final StringBuilder sb = new StringBuilder("No route to ");
                        sb.append(this.a.a.b);
                        sb.append("; exhausted proxy configurations: ");
                        sb.append(this.e);
                        throw new SocketException(sb.toString());
                    }
                    final Proxy c = this.e.get(this.f++);
                    this.a(c);
                    this.c = c;
                }
            }
            if (!this.c()) {
                final StringBuilder sb2 = new StringBuilder("No route to ");
                sb2.append(this.a.a.b);
                sb2.append("; exhausted inet socket addresses: ");
                sb2.append(this.g);
                throw new SocketException(sb2.toString());
            }
            this.d = this.g.get(this.h++);
            final ab ab = new ab(this.a, this.c, this.d);
            if (!this.b.c(ab)) {
                return ab;
            }
            this.i.add(ab);
        }
    }
    
    final boolean b() {
        return this.f < this.e.size();
    }
    
    final boolean c() {
        return this.h < this.g.size();
    }
    
    final boolean d() {
        return !this.i.isEmpty();
    }
}
