package com.example.mmm.unmapped;

import com.example.mmm.*;
import com.example.mmm.API.*;

public final class Geri
{
    constants consts;
    
    public Geri() {
        super();
        this.consts = new constants();
    }
    
    public final String _blood(String s, String s2) {
        s2 = "{'null':'null'}";
        final RequestHttp requestHttp = new RequestHttp(this);
        requestHttp.execute((Object[])new String[] { s, s2 });
        s = (String)requestHttp.get();
        return s;
    }
}
