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


    public static void main(String[] args) {

        BitSet bitSet = new BitSet();

        BitVector bitVector = new BitVector(100);
        bitVector.set(1);
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
