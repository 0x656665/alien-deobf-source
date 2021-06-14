package a.a.c;

import java.util.*;
import java.text.*;
import a.a.*;

static final class d$1 extends ThreadLocal<DateFormat> {
    d$1() {
        super();
    }
    
    @Override
    protected final /* synthetic */ Object initialValue() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(a.a.c.f);
        return simpleDateFormat;
    }
}