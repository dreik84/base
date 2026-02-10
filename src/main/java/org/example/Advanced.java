package org.example;

public class Advanced {
    public static void main(String[] args) {
        System.out.println(getSing(0));
        System.out.println(getSing(-12));
        System.out.println(getSing(25));

        System.out.println(checkSings(1, 2));
        System.out.println(checkSings(-1, -2));
        System.out.println(checkSings(0, 0));
        System.out.println(checkSings(1, -2));
        System.out.println(checkSings(-1, 2));

    }

    // return -1, 0 or 1
    public static int getSing(int num) {
        int mask = (num == 0) ? 0 : 1;

//        System.out.println(Integer.toBinaryString(num >> 31));

        return mask | (num >> 31);
    }

    public static boolean checkSings(int x, int y) {
        return (x ^ y) >= 0;
    }
}
