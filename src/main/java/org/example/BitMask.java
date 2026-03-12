package org.example;

import java.util.EnumSet;
import java.util.Set;

public class BitMask {

    public static void main(String[] args) {
        Text text = new Text();
        text.applyStyle(Text.STYLE_BOLD | Text.STYLE_ITALIC);

        TextEnum textEnum = new TextEnum();
        textEnum.applyStyle(EnumSet.of(TextEnum.Style.BOLD, TextEnum.Style.ITALIC));
    }

    public static class Text {

        public static final int STYLE_BOLD = 1 << 0; // 1
        public static final int STYLE_ITALIC = 1 << 1; // 2
        public static final int STYLE_UNDERLINE = 1 << 2; // 4
        public static final int STYLE_STRIKE = 1 << 4; // 8

        public void applyStyle(int styles) {}
    }

    public static class TextEnum {

        public enum Style { BOLD, ITALIC, UNDERLINE, STRIKE }

        public void applyStyle(Set<Style> styles) {}
    }
}
