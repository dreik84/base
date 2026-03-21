package org.example;

import java.util.BitSet;

public class BitVector {

    int[] numbers;

    public BitVector(int k) {
        numbers = new int[(k >> 5) + 1];
    }

    public void set(int k) {
        int remainder = k & 0x1F;
        int divide = k >> 5;
        numbers[divide] = numbers[divide] | (1 << remainder);
    }

    public void unset(int k) {
        int remainder = k & 0x1F;
        int divide = k >> 5;
        numbers[divide] = numbers[divide] & (~(1 << remainder));
    }

    public boolean isSet(int k) {
        int remainder = k & 0x1F;
        int divide = k >> 5;
        return (numbers[divide] & (1 << remainder)) != 0;
    }

    public void show() {
        for (int num : numbers) {
            System.out.println(Integer.toBinaryString(num));
        }
    }

    // 0000 0101 k = 5
    // 0001 1111 0x1F = 31
    // 0000 0101 & remainder = 5
    // 0000 0000 k >> 5 = divide
    // 0010 0000 1 << remainder = 32
    // 0010 0000 | 


    public static void main(String[] args) {

        BitSet bitSet = new BitSet();

        BitVector bitVector = new BitVector(100);
        bitVector.show();
        System.out.println();
        bitVector.set(31);
        bitVector.show();
        System.out.println();
        System.out.println(bitVector.isSet(1));
        bitVector.unset(1);
        System.out.println(bitVector.isSet(1));
    }

    private static int getRow(int bit) {
        return bit >> 4; // деление на 16
    }

    private static int getCol(int bit) {
        return bit % 16;
    }

    // проверка бита
    private static boolean isSetBit(int[] vector, int index) {
        int indexRow = getRow(index);
        int indexCol = getCol(index);
        return (vector[indexRow] & (1 << indexCol)) != 0;
    }
}
