package a;

import java.util.*;
import java.net.*;

static final class n$1 implements n {
    n$1() {
        super();
    }
    
    @Override
    public final List<InetAddress> a(final String s) {
        if (s != null) {
            return Arrays.asList(InetAddress.getAllByName(s));
        }
        throw new UnknownHostException("hostname == null");
    }
}