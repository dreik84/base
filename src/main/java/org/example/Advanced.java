package org.example;

public class Advanced {
    public static void main(String[] args) {
        System.out.println(getSing(0));
        System.out.println(getSing(-12));
        System.out.println(getSing(25));

        System.out.println(checkSameSings(1, 2));
        System.out.println(checkSameSings(-1, -2));
        System.out.println(checkSameSings(0, 0));
        System.out.println(checkSameSings(1, -2));
        System.out.println(checkSameSings(-1, 2));

        System.out.println(Integer.toBinaryString(-12 | 0b11111111));
        System.out.println(Integer.toBinaryString(-12 | 0b11111111).length());
        System.out.println((byte) 0b11111111);
        System.out.println(0b11111111111111111111111111111111);
        System.out.println();

        System.out.println(getAbs(123));
        System.out.println(getAbs(-123));
        System.out.println();

        System.out.println(getMin(10, 5));
        System.out.println(getMax(5, 10));
        System.out.println();

        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(32));

        // 0111 1011 - dec 123
        // 1000 0101 - dec -123
        // 1111 1111 - mask -1
        // 1000 0100 - dec -124
        // 0111 1011 - XOR

        // 00000001 - 1
        // 11111110 - обратный код
        // 11111111 - обратный код + 1 (дополнительный код) -1

    }

    // return -1, 0 or 1
    public static int getSing(int num) {
        int mask = (num == 0) ? 0 : 1;

//        System.out.println(Integer.toBinaryString(num >> 31));

        return mask | (num >> 31);
    }

    public static boolean checkSameSings(int x, int y) {
        return (x ^ y) >= 0;
    }

    public static int getAbs(int num) {
        int mask = num >> 31;

        return (num + mask) ^ mask;
    }

    // x = 10, y = 5
    // x - y = 5 -> 0b00000101
    // 00000000 >> 31
    // 00000101 &
    // 00000000 + y -> min

    // x = 5, y = 10
    // x - y = -5 -> 11111011
    // 11111111 >> 31
    // 11111011 &
    // 11111011 + y
    // 00001010 =
    // 00000101 -> min 5


    public static int getMin(int x, int y) {
        return y + ((x - y) & ((x - y) >> 31));
    }

    public static int getMax(int x, int y) {
        return x - ((x - y) & ((x - y) >> 31));
    }

    public static boolean isPowerOfTwo(int x) {
        int num = ~(x & (x - 1));
        num = num & x;
        System.out.println(num);
        return (x & ~(x & (x - 1))) == 1;
    }
}
