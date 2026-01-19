package org.example;

public class Adders extends BaseLogic {
    private int sum;
    private int carryOut;

    public Adders halfAdder(int op1, int op2) {
        sum = op1 ^ op2;
        carryOut = op1 & op2;
        return this;
    }

    public Adders halfAdder2(int op1, int op2) {
        int nand1 = ~op1 & op2;
        int nand2 = ~op2 & op1;
        sum = nand1 | nand2;
        carryOut = op1 & op2;
        return this;
    }

    public Adders halfAdderNandGate(int op1, int op2) {
        int nand4 = ~(op1 & op2);
        int nand1 = ~(op1 & nand4);
        int nand2 = ~(nand4 & op2);
        sum = ~(nand1 & nand2);
        carryOut = ~(nand4 & nand4);
        return this;
    }

    public Adders fullAdder(int op1, int op2, int carryIn) {
        int xor = op1 ^ op2;
        int and1 = xor & carryIn;
        int and2 = op1 & op2;
        sum = xor ^ carryIn;
        carryOut = and1 | and2;
        return this;
    }

    public Adders fullAdderNandGate(int op1, int op2, int carryIn) {
        int nand1 = ~(op1 & op2);
        int nand2 = ~(op1 & nand1);
        int nand3 = ~(nand1 & op2);
        int nand4 = ~(nand2 & nand3);
        int nand5 = ~(nand4 & carryIn);
        int nand6 = ~(nand4 & nand5);
        int nand7 = ~(nand5 & carryIn);
        sum = ~(nand6 & nand7);
        carryOut = ~(nand5 & nand1);
        return this;
    }

    public Adders fullAdderNorGate(int op1, int op2, int carryIn) {
        int nor1 = ~(op1 | op2);
        int nor2 = ~(op1 | nor1);
        int nor3 = ~(nor1 | op2);
        int nor4 = ~(nor2 | nor3);
        int nor5 = ~(nor4 | carryIn);
        int nor6 = ~(nor4 | nor5);
        int nor7 = ~(nor5 | carryIn);
        sum = ~(nor6 | nor7);
        carryOut = ~(nor5 | nor1);
        return this;
    }

    // Сумматор с последовательным переносом
    public Adders rippleCarryAdder(int[] nums) {
        sum = 0;
        carryOut = 0;
        int result = 0;
        StringBuilder sb = new StringBuilder();


        for (int num : nums) {
            sum = 0;
            fullAdder(num, sum, carryOut).show();
            sb.append(sum);
            result += sum;
        }

        System.out.println(sb.toString());
        System.out.println(Integer.toBinaryString(result));

        return this;
    }

    public int getCarryOut() {
        return carryOut;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void show() {
        System.out.println("CarryOut: " + Integer.toBinaryString(carryOut) + " Sum: " + Integer.toBinaryString(sum));
    }
}
