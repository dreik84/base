package org.example;

public class BaseApp {
    public static void main(String[] args) {
        int op = 0b0;
        BaseLogic base = new BaseLogic(op);
        int notOp = base.not().res();

        System.out.println(Integer.toBinaryString(op));
        System.out.println(Integer.toBinaryString(notOp));
        System.out.println(notOp);
        base.and(1, 0).show();
        base.or(0, 0).show();
        base.xor(1, 1).show();
        base.xor2(0, 1).show();
        base.xor2(1, 0).show();
        base.xor2(0, 0).show();
        base.xor2(1, 1).show();

        System.out.println();

        base.halfAdder(0, 0);
        base.halfAdder(0, 1);
        base.halfAdder(1, 0);
        base.halfAdder(1, 1);
    }
}
