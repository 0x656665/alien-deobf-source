package com.example.mmm.unmapped;

import com.example.mmm.constants;
import com.example.mmm.API.RequestHttp;

public final class Geri {
   constants consts = new constants();

   public final String _blood(String var1, String var2) {
      var2 = "{'null':'null'}";
      RequestHttp var3 = new RequestHttp(this);
      var3.execute(new String[]{var1, var2});
      var1 = (String)var3.get();
      return var1;
   }
}
