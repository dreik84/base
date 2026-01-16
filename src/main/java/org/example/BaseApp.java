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

        base.nor(0, 0).show();
        base.nor(0, 1).show();
        base.nor(1, 0).show();
        base.nor(1, 1).show();

        System.out.println();

        base.nand(0, 0).show();
        base.nand(0, 1).show();
        base.nand(1, 0).show();
        base.nand(1, 1).show();

        System.out.println();

        base.halfAdder(0, 0);
        base.halfAdder(0, 1);
        base.halfAdder(1, 0);
        base.halfAdder(1, 1);

        System.out.println();

        base.halfAdder2(0, 0);
        base.halfAdder2(0, 1);
        base.halfAdder2(1, 0);
        base.halfAdder2(1, 1);

        System.out.println();

        base.halfAdderNandGate(0, 0);
        base.halfAdderNandGate(0, 1);
        base.halfAdderNandGate(1, 0);
        base.halfAdderNandGate(1, 1);

        System.out.println();

        base.fullAdder(0, 0, 0);
        base.fullAdder(0, 0, 1);
        base.fullAdder(0, 1, 0);
        base.fullAdder(1, 0, 0);
        base.fullAdder(1, 0, 1);
        base.fullAdder(0, 1, 1);
        base.fullAdder(1, 1, 0);
        base.fullAdder(1, 1, 1);
    }
}
