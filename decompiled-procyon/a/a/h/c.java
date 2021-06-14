package a.a.h;

import javax.security.auth.x500.*;

final class c
{
    final String a;
    final int b;
    int c;
    int d;
    int e;
    int f;
    char[] g;
    
    public c(final X500Principal x500Principal) {
        super();
        this.a = x500Principal.getName("RFC2253");
        this.b = this.a.length();
    }
    
    private int a(int n) {
        final int n2 = n + 1;
        if (n2 < this.b) {
            n = this.g[n];
            if (n >= 48 && n <= 57) {
                n -= 48;
            }
            else if (n >= 97 && n <= 102) {
                n -= 87;
            }
            else {
                if (n < 65 || n > 70) {
                    final StringBuilder sb = new StringBuilder("Malformed DN: ");
                    sb.append(this.a);
                    throw new IllegalStateException(sb.toString());
                }
                n -= 55;
            }
            final char c = this.g[n2];
            int n3;
            if (c >= '0' && c <= '9') {
                n3 = c - '0';
            }
            else if (c >= 'a' && c <= 'f') {
                n3 = c - 'W';
            }
            else {
                if (c < 'A' || c > 'F') {
                    final StringBuilder sb2 = new StringBuilder("Malformed DN: ");
                    sb2.append(this.a);
                    throw new IllegalStateException(sb2.toString());
                }
                n3 = c - '7';
            }
            return (n << 4) + n3;
        }
        final StringBuilder sb3 = new StringBuilder("Malformed DN: ");
        sb3.append(this.a);
        throw new IllegalStateException(sb3.toString());
    }
    
    private char e() {
        final int a = this.a(this.c);
        ++this.c;
        if (a < 128) {
            return (char)a;
        }
        if (a >= 192 && a <= 247) {
            int n;
            int n2;
            if (a <= 223) {
                n = (a & 0x1F);
                n2 = 1;
            }
            else if (a <= 239) {
                n2 = 2;
                n = (a & 0xF);
            }
            else {
                n2 = 3;
                n = (a & 0x7);
            }
            for (int i = 0; i < n2; ++i) {
                ++this.c;
                if (this.c == this.b) {
                    return '?';
                }
                if (this.g[this.c] != '\\') {
                    return '?';
                }
                ++this.c;
                final int a2 = this.a(this.c);
                ++this.c;
                if ((a2 & 0xC0) != 0x80) {
                    return '?';
                }
                n = (n << 6) + (a2 & 0x3F);
            }
            return (char)n;
        }
        return '?';
    }
    
    final String a() {
        while (this.c < this.b && this.g[this.c] == ' ') {
            ++this.c;
        }
        if (this.c == this.b) {
            return null;
        }
        this.d = this.c;
        ++this.c;
        while (this.c < this.b && this.g[this.c] != '=' && this.g[this.c] != ' ') {
            ++this.c;
        }
        if (this.c < this.b) {
            this.e = this.c;
            if (this.g[this.c] == ' ') {
                while (this.c < this.b && this.g[this.c] != '=' && this.g[this.c] == ' ') {
                    ++this.c;
                }
                if (this.g[this.c] != '=' || this.c == this.b) {
                    final StringBuilder sb = new StringBuilder("Unexpected end of DN: ");
                    sb.append(this.a);
                    throw new IllegalStateException(sb.toString());
                }
            }
            do {
                ++this.c;
            } while (this.c < this.b && this.g[this.c] == ' ');
            if (this.e - this.d > 4 && this.g[this.d + 3] == '.' && (this.g[this.d] == 'O' || this.g[this.d] == 'o') && (this.g[this.d + 1] == 'I' || this.g[this.d + 1] == 'i') && (this.g[this.d + 2] == 'D' || this.g[this.d + 2] == 'd')) {
                this.d += 4;
            }
            return new String(this.g, this.d, this.e - this.d);
        }
        final StringBuilder sb2 = new StringBuilder("Unexpected end of DN: ");
        sb2.append(this.a);
        throw new IllegalStateException(sb2.toString());
    }
    
    final String b() {
        if (this.c + 4 < this.b) {
            this.d = this.c;
            ++this.c;
            while (true) {
                while (this.c != this.b && this.g[this.c] != '+' && this.g[this.c] != ',' && this.g[this.c] != ';') {
                    if (this.g[this.c] == ' ') {
                        this.e = this.c;
                        ++this.c;
                        while (this.c < this.b && this.g[this.c] == ' ') {
                            ++this.c;
                        }
                        final int n = this.e - this.d;
                        if (n >= 5 && (n & 0x1) != 0x0) {
                            final byte[] array = new byte[n / 2];
                            int i = 0;
                            int n2 = this.d + 1;
                            while (i < array.length) {
                                array[i] = (byte)this.a(n2);
                                n2 += 2;
                                ++i;
                            }
                            return new String(this.g, this.d, n);
                        }
                        final StringBuilder sb = new StringBuilder("Unexpected end of DN: ");
                        sb.append(this.a);
                        throw new IllegalStateException(sb.toString());
                    }
                    else {
                        if (this.g[this.c] >= 'A' && this.g[this.c] <= 'F') {
                            final char[] g = this.g;
                            final int c = this.c;
                            g[c] += ' ';
                        }
                        ++this.c;
                    }
                }
                this.e = this.c;
                continue;
            }
        }
        final StringBuilder sb2 = new StringBuilder("Unexpected end of DN: ");
        sb2.append(this.a);
        throw new IllegalStateException(sb2.toString());
    }
    
    final String c() {
        this.d = this.c;
        this.e = this.c;
        while (this.c < this.b) {
            final char c = this.g[this.c];
            if (c != ' ') {
                if (c != ';') {
                    if (c == '\\') {
                        this.g[this.e++] = this.d();
                        ++this.c;
                        continue;
                    }
                    switch (c) {
                        default: {
                            this.g[this.e++] = this.g[this.c];
                            ++this.c;
                            continue;
                        }
                        case 43:
                        case 44: {
                            break;
                        }
                    }
                }
                return new String(this.g, this.d, this.e - this.d);
            }
            this.f = this.e;
            ++this.c;
            this.g[this.e++] = ' ';
            while (this.c < this.b && this.g[this.c] == ' ') {
                this.g[this.e++] = ' ';
                ++this.c;
            }
            if (this.c == this.b || this.g[this.c] == ',' || this.g[this.c] == '+' || this.g[this.c] == ';') {
                return new String(this.g, this.d, this.f - this.d);
            }
        }
        return new String(this.g, this.d, this.e - this.d);
    }
    
    final char d() {
        ++this.c;
        if (this.c != this.b) {
            final char c = this.g[this.c];
            Label_0145: {
                if (c != ' ' && c != '%' && c != '\\' && c != '_') {
                    switch (c) {
                        default: {
                            switch (c) {
                                default: {
                                    switch (c) {
                                        default: {
                                            return this.e();
                                        }
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62: {
                                            break Label_0145;
                                        }
                                    }
                                    break;
                                }
                                case 42:
                                case 43:
                                case 44: {
                                    break Label_0145;
                                }
                            }
                            break;
                        }
                        case 34:
                        case 35: {
                            break;
                        }
                    }
                }
            }
            return this.g[this.c];
        }
        final StringBuilder sb = new StringBuilder("Unexpected end of DN: ");
        sb.append(this.a);
        throw new IllegalStateException(sb.toString());
    }
}
