package org.example;

import java.util.EnumSet;
import java.util.Set;

public class BitMask {

    public static void main(String[] args) {
        Text text = new Text();
        text.applyStyle(Text.STYLE_BOLD | Text.STYLE_ITALIC);

        TextEnum textEnum = new TextEnum();
        textEnum.applyStyle(EnumSet.of(TextEnum.Style.BOLD, TextEnum.Style.ITALIC));

        System.out.println(isSetBit(7, 2));
        System.out.println(isSetBit(7, 3));
        System.out.println(setBit(5, 1));
        System.out.println(inverseBit(7, 1));
        System.out.println(resetBit(7, 1));
    }

    // 0000 0111 num = 7
    // 0000 0010 index = 2
    // 0000 0100 1 << index
    // 0000 0100 != 0 true

    // проверка бита
    private static boolean isSetBit(int num, int index) {
        return (num & (1 << index)) != 0;
    }

    // 0000 0101 num = 5
    // 0000 0001 index = 1
    // 0000 0010 1 << index
    // 0000 0111 | return 7

    // установка бита в 1
    private static int setBit(int num, int index) {
        return (num | (1 << index));
    }

    // 0000 0111 num = 7
    // 0000 0001 index = 1
    // 0000 0010 1 << index
    // 0000 0101 ^ return 5

    // инверсия бита
    private static int inverseBit(int num, int index) {
        return (num ^ (1 << index));
    }

    // 0000 0111 num = 7
    // 0000 0001 index = 1
    // 0000 0010 1 << index
    // 1111 1101 ~
    // 0000 0101 & return 5

    // установка бита в 0
    private static int resetBit(int num, int index) {
        return (num & ~(1 << index));
    }


    public static class Text {

        public static final int STYLE_BOLD = 1 << 0; // 1
        public static final int STYLE_ITALIC = 1 << 1; // 2
        public static final int STYLE_UNDERLINE = 1 << 2; // 4
        public static final int STYLE_STRIKE = 1 << 4; // 8

        public void applyStyle(int styles) {
        }
    }

    public static class TextEnum {

        public enum Style {BOLD, ITALIC, UNDERLINE, STRIKE}

        public void applyStyle(Set<Style> styles) {
        }
    }
}
