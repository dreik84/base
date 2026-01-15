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

    public BaseLogic halfAdder(int op1, int op2) {
        int sum = op1 ^ op2;
        int carry = op1 & op2;

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

    public int res() {
        return operand;
    }

    public void show() {
        System.out.println(Integer.toBinaryString(operand));
    }
}
