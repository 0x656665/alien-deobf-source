/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public interface n {
    public static final n a = new n(){

        @Override
        public final List<InetAddress> a(String string) {
            if (string == null) throw new UnknownHostException("hostname == null");
            return Arrays.asList(InetAddress.getAllByName(string));
        }
    };

    public List<InetAddress> a(String var1);

}

