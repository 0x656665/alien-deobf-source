/*
 * Decompiled with CFR <Could not determine version>.
 */
package a.a.c;

import a.r;

public final class i {
    public static String a(r object) {
        String string = ((r)object).e();
        if ((object = ((r)object).g()) == null) return string;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append('?');
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }
}

