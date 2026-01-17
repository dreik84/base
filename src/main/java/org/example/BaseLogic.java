package org.example;

public class BaseLogic {
    private int operand;

    public BaseLogic(int operand) {
        this.operand = operand;
    }

    public BaseLogic() {
    }

    public BaseLogic not() {
        operand = ~operand;
        return this;
    }

    public BaseLogic and(int op) {
        operand = operand & op;
        return this;
    }

    public BaseLogic and(int op1, int op2) {
        operand = op1 & op2;
        return this;
    }

    public BaseLogic or(int op) {
        operand = operand | op;
        return this;
    }

    public BaseLogic or(int op1, int op2) {
        operand = op1 | op2;
        return this;
    }

    public BaseLogic xor(int op) {
        operand = operand ^ op;
        return this;
    }

    public BaseLogic xor(int op1, int op2) {
        operand = op1 ^ op2;
        return this;
    }

    public BaseLogic xor2(int op1, int op2) {
        int or = op1 | op2;
        int and = op1 & op2;
        int andNot = ~and;
        operand = or & andNot;
        return this;
    }

    // Peirce arrow - NOR Gate
    public BaseLogic nor(int op1, int op2) {
        operand = ~(op1 | op2);
        return this;
    }

    // Sheffer stroke - NAND Gate
    public BaseLogic nand(int op1, int op2) {
        operand = ~(op1 & op2);
        return this;
    }

    public BaseLogic halfAdder(int op1, int op2) {
        int sum = op1 ^ op2;
        int carry = op1 & op2;

        String res = carry + "" + sum;
        System.out.println(res);
        operand = Integer.parseInt(res, 2);

        return this;
    }

    public BaseLogic halfAdder2(int op1, int op2) {
        int nand1 = ~op1 & op2;
        int nand2 = ~op2 & op1;
        int carry = op1 & op2;
        int sum = nand1 | nand2;

        String res = carry + "" + sum;
        System.out.println(res);
        operand = Integer.parseInt(res, 2);

        return this;
    }

    public BaseLogic halfAdderNandGate(int op1, int op2) {
        int nand4 = ~(op1 & op2);
        int nand1 = ~(op1 & nand4);
        int nand2 = ~(nand4 & op2);
        int nand3 = ~(nand1 & nand2); // sum
        int nand5 = ~(nand4 & nand4); // carry

        int sum = nand3;
        int carry = nand5;

        String res = carry + "" + sum;
        System.out.println(res);
        operand = Integer.parseInt(res, 2);

        return this;
    }

    public BaseLogic fullAdder(int op1, int op2, int carryIn) {
        int xor = op1 ^ op2;
        int and1 = xor & carryIn;
        int and2 = op1 & op2;
        int sum = xor ^ carryIn;
        int carryOut = and1 | and2;

        String res = carryOut + "" + sum;
        System.out.println(res);
        operand = Integer.parseInt(res, 2);

        return this;
    }

    public BaseLogic fullAdderNandGate(int op1, int op2, int carryIn) {
        int nand1 = ~(op1 & op2);
        int nand2 = ~(op1 & nand1);
        int nand3 = ~(nand1 & op2);
        int nand4 = ~(nand2 & nand3);
        int nand5 = ~(nand4 & carryIn);
        int nand6 = ~(nand4 & nand5);
        int nand7 = ~(nand5 & carryIn);
        int nand8 = ~(nand6 & nand7); // sum
        int nand9 = ~(nand5 & nand1); // carry out

        int sum = nand8;
        int carryOut = nand9;

        String res = carryOut + "" + sum;
        System.out.println(res);
        operand = Integer.parseInt(res, 2);

        return this;
    }

    public int res() {
        return operand;
    }

    public void show() {
        System.out.println(Integer.toBinaryString(operand));
    }
}
