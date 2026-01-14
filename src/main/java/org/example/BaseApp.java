package org.example;

public class BaseApp {
    public static void main(String[] args) {
        int op = 0b0;
        BaseLogic base = new BaseLogic(op);
        int notOp = base.not().res();

        System.out.println(Integer.toBinaryString(op));
        System.out.println(Integer.toBinaryString(notOp));
        System.out.println(notOp);
        System.out.println(base.and(1, 0).res());
        System.out.println(base.or(0, 0).res());
        System.out.println(base.xor(1, 1).res());
        System.out.println(base.xor2(0, 1).res());
        System.out.println(base.xor2(1, 0).res());
        System.out.println(base.xor2(0, 0).res());
        System.out.println(base.xor2(1, 1).res());
    }
}
