package a;

import java.util.*;
import java.net.*;

public interface n
{
    public static final n a = new n() {
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
    };
    
    List<InetAddress> a(final String p0);
}
