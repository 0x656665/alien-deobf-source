package a;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public interface n {
   n a = new n() {
      public final List a(String var1) {
         if (var1 != null) {
            return Arrays.asList(InetAddress.getAllByName(var1));
         } else {
            throw new UnknownHostException("hostname == null");
         }
      }
   };

   List a(String var1);
}
