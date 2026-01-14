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
        int res1 = op1 & op2;
        int res2 = op1 ^ op2;

        String res = res1 + "" + res2;
        System.out.println(res);
        operand = Integer.parseInt(res);

        return this;
    }

    public int res() {
        return operand;
    }

    public void show() {
        System.out.println(Integer.toBinaryString(operand));
    }
}
