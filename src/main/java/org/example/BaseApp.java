package org.example;

public class BaseApp {
    public static void main(String[] args) {
        int op = 0b0;
        BaseLogic base = new BaseLogic(op);
        int notOp = base.not().getRes();

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

        Adders adders = new Adders();

        adders.halfAdder(0, 0).show();
        adders.halfAdder(0, 1).show();
        adders.halfAdder(1, 0).show();
        adders.halfAdder(1, 1).show();

        System.out.println();

        adders.halfAdder2(0, 0).show();
        adders.halfAdder2(0, 1).show();
        adders.halfAdder2(1, 0).show();
        adders.halfAdder2(1, 1).show();

        System.out.println();

        adders.halfAdderNandGate(0, 0).show();
        adders.halfAdderNandGate(0, 1).show();
        adders.halfAdderNandGate(1, 0).show();
        adders.halfAdderNandGate(1, 1).show();

        System.out.println();

        adders.fullAdder(0, 0, 0).show();
        adders.fullAdder(0, 0, 1).show();
        adders.fullAdder(0, 1, 0).show();
        adders.fullAdder(1, 0, 0).show();
        adders.fullAdder(1, 0, 1).show();
        adders.fullAdder(0, 1, 1).show();
        adders.fullAdder(1, 1, 0).show();
        adders.fullAdder(1, 1, 1).show();

        System.out.println();

        adders.fullAdderNandGate(0, 0, 0).show();
        adders.fullAdderNandGate(0, 0, 1).show();
        adders.fullAdderNandGate(0, 1, 0).show();
        adders.fullAdderNandGate(1, 0, 0).show();
        adders.fullAdderNandGate(1, 0, 1).show();
        adders.fullAdderNandGate(0, 1, 1).show();
        adders.fullAdderNandGate(1, 1, 0).show();
        adders.fullAdderNandGate(1, 1, 1).show();

        System.out.println();

        adders.fullAdderNorGate(0, 0, 0).show();
        adders.fullAdderNorGate(0, 0, 1).show();
        adders.fullAdderNorGate(0, 1, 0).show();
        adders.fullAdderNorGate(1, 0, 0).show();
        adders.fullAdderNorGate(1, 0, 1).show();
        adders.fullAdderNorGate(0, 1, 1).show();
        adders.fullAdderNorGate(1, 1, 0).show();
        adders.fullAdderNorGate(1, 1, 1).show();
    }
}
