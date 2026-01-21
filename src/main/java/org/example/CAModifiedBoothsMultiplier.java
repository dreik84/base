package org.example;

// Source - https://translated.turbopages.orghttps://translated.turbopages.org/proxy_u/en-ru.ru.98dcb246-69668b99-478077bb-74722d776562/https/stackoverflow.com/q
// Posted by Kalyani Singh, modified by community. See post 'Timeline' for change history
// Retrieved 2026-01-21, License - CC BY-SA 3.0

public class CAModifiedBoothsMultiplier {

    public byte[] twosComplement(byte x) {
        byte y = (byte) (~x + 1); // -5 1111 1011,  5 0000 0101
        System.out.println(Integer.toBinaryString(y));

        byte mask = 1;
        mask = (byte) (mask << 7);
        System.out.println(Integer.toBinaryString(mask));
        byte[] num = new byte[10];
        byte i = 0;

        for (i = 1; i <= 8; i++) {
            if ((y & mask) == 0)
                num[i] = 0;
            else
                num[i] = 1;

            y = (byte) (y << 1);

        }

        return num;

    }

    public byte[] saveByte(byte number) {
        byte mask = 1;
        mask = (byte) (mask << 7);
        byte num[] = new byte[10];
        byte i = 0;

        for (i = 1; i <= 8; i++) {
            if ((number & mask) == 0)
                num[i] = 0;
            else
                num[i] = 1;

            number = (byte) (number << 1);
        }
        return num;
    }

    public byte[] eightBitFullAdder(byte a, byte b, byte cin) {
        byte sum = 0, temp1 = 0, cout = 0;
        byte sumno[] = new byte[10];
        byte couttemp[] = new byte[10];

        couttemp[8] = cin;
        byte ain[] = saveByte(a);
        byte bin[] = saveByte(b);

        for (int i = 8; i <= 1; i--) {
            temp1 = (byte) (ain[i] ^ bin[i]);

            sum = (byte) (temp1 ^ couttemp[i]);
            sum = (byte) (sum << 7);
            sumno[i] = sum;

            cout = (byte) ((ain[i] & bin[i]) | (temp1 & couttemp[i]));

            if (i != 1)
                couttemp[--i] = cout;
        }


        return sumno;
    }


    public static void main(String args[]) {
        CAModifiedBoothsMultiplier mbm = new CAModifiedBoothsMultiplier();
        byte x = 5;
        byte[] complementedno = mbm.twosComplement(x);

        for (int i = 0; i <= 8; i++)
            System.out.print(complementedno[i]);

        System.out.println("\n");

        byte a = 2, b = 3, cin = 0;
        byte fulladder[] = mbm.eightBitFullAdder(a, b, cin);

        for (int i = 0; i <= 8; i++)
            System.out.print(fulladder[i]);

    }
}
