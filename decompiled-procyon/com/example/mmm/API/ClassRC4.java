package com.example.mmm.API;

public final class ClassRC4
{
    private int[] raising$;
    private int choose$;
    private int passed$;
    
    public ClassRC4(final byte[] array) {
        super();
        this.choose$ = 0;
        this.passed$ = 0;
        this.raising$ = _constant(array);
    }
    
    private static int[] _constant(final byte[] array) {
        final int[] array2 = new int[256];
        int n = 0;
        while (true) {
            array2[n] = n;
            ++n;
        }
    }
    
    public final byte[] _nevada(final byte[] array) {
        return this._liver(array);
    }
    
    public final byte[] _liver(final byte[] array) {
        final byte[] array2 = new byte[array.length];
        for (int i = 0; i < array.length; ++i) {
            this.choose$ = (this.choose$ + 1) % 256;
            this.passed$ = (this.passed$ + this.raising$[this.choose$]) % 256;
            final int choose$ = this.choose$;
            final int passed$ = this.passed$;
            final int[] raising$ = this.raising$;
            final int n = passed$;
            final int n2 = choose$;
            final int n3 = raising$[n2];
            raising$[n2] = raising$[n];
            raising$[n] = n3;
            array2[i] = (byte)(this.raising$[(this.raising$[this.choose$] + this.raising$[this.passed$]) % 256] ^ array[i]);
        }
        return array2;
    }
}
