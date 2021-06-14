/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.b;

import a.a.a;
import a.j;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class b {
    boolean a;
    boolean b;
    private final List<j> c;
    private int d = 0;

    public b(List<j> list) {
        this.c = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        int n2 = this.d;
        while (n2 < this.c.size()) {
            if (this.c.get(n2).a(sSLSocket)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public final j a(SSLSocket sSLSocket) {
        Object object;
        block2 : {
            int n2 = this.c.size();
            for (int i2 = this.d; i2 < n2; ++i2) {
                object = this.c.get(i2);
                if (!((j)object).a(sSLSocket)) continue;
                this.d = i2 + 1;
                break block2;
            }
            object = null;
        }
        if (object != null) {
            this.a = this.b(sSLSocket);
            a.a.a((j)object, sSLSocket, this.b);
            return object;
        }
        object = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        ((StringBuilder)object).append(this.b);
        ((StringBuilder)object).append(", modes=");
        ((StringBuilder)object).append(this.c);
        ((StringBuilder)object).append(", supported protocols=");
        ((StringBuilder)object).append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(((StringBuilder)object).toString());
    }
}

