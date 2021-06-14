/*
 * Decompiled with CFR <Could not determine version>.
 */
package a;

public enum ac {
    a("TLSv1.3"),
    b("TLSv1.2"),
    c("TLSv1.1"),
    d("TLSv1"),
    e("SSLv3");
    
    final String f;

    private ac(String string2) {
        this.f = string2;
    }

    /*
     * Unable to fully structure code
     */
    public static ac a(String var0) {
        block19 : {
            block17 : {
                block18 : {
                    var1_1 = var0.hashCode();
                    if (var1_1 == 79201641) break block17;
                    if (var1_1 == 79923350) break block18;
                    switch (var1_1) {
                        default: {
                            ** GOTO lbl-1000
                        }
                        case -503070501: {
                            if (var0.equals("TLSv1.3")) {
                                var1_1 = 0;
                                ** break;
                            }
                            ** GOTO lbl-1000
                        }
                        case -503070502: {
                            if (var0.equals("TLSv1.2")) {
                                var1_1 = 1;
                                ** break;
                            }
                            ** GOTO lbl-1000
                        }
                        case -503070503: {
                            if (var0.equals("TLSv1.1")) {
                                var1_1 = 2;
                                ** break;
                            }
                            ** GOTO lbl-1000
lbl22: // 3 sources:
                            break;
                        }
                    }
                    break block19;
                }
                if (!var0.equals("TLSv1")) ** GOTO lbl-1000
                var1_1 = 3;
                break block19;
            }
            if (var0.equals("SSLv3")) {
                var1_1 = 4;
            } else lbl-1000: // 6 sources:
            {
                var1_1 = -1;
            }
        }
        switch (var1_1) {
            default: {
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(var0)));
            }
            case 4: {
                return ac.e;
            }
            case 3: {
                return ac.d;
            }
            case 2: {
                return ac.c;
            }
            case 1: {
                return ac.b;
            }
            case 0: 
        }
        return ac.a;
    }
}

