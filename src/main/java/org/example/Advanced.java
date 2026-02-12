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
}
