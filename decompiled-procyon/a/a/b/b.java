package a.a.b;

import a.*;
import javax.net.ssl.*;
import a.a.*;
import java.util.*;
import java.net.*;

public final class b
{
    boolean a;
    boolean b;
    private final List<j> c;
    private int d;
    
    public b(final List<j> c) {
        super();
        this.d = 0;
        this.c = c;
    }
    
    private boolean b(final SSLSocket sslSocket) {
        for (int i = this.d; i < this.c.size(); ++i) {
            if (this.c.get(i).a(sslSocket)) {
                return true;
            }
        }
        return false;
    }
    
    public final j a(final SSLSocket sslSocket) {
        int i = this.d;
        while (true) {
            while (i < this.c.size()) {
                final j j = this.c.get(i);
                if (j.a(sslSocket)) {
                    this.d = i + 1;
                    if (j != null) {
                        this.a = this.b(sslSocket);
                        a.a.a.a.a(j, sslSocket, this.b);
                        return j;
                    }
                    final StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
                    sb.append(this.b);
                    sb.append(", modes=");
                    sb.append(this.c);
                    sb.append(", supported protocols=");
                    sb.append(Arrays.toString(sslSocket.getEnabledProtocols()));
                    throw new UnknownServiceException(sb.toString());
                }
                else {
                    ++i;
                }
            }
            final j j = null;
            continue;
        }
    }
}
