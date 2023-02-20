import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //from decimal to hex
        //1. quotient: n/16;
        //2. remainder: n%16;
        //3. Keep dividing the quotient by 16 until the quotient becomes 0.
        //4. hex: 0 1 2 3 4 5 6 7 8 9 A B C D E F
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter a positive integer: ");
        int i = scanner.nextInt();

        digitList(i);

    }
    public static void digitList(int i) {
        int quotient = i;
        int remainder = i;
        Stack<Integer> digitList = new Stack<>();

        while(quotient > 0) {
            remainder = quotient%16;
            digitList.add(remainder);
            quotient = quotient/16;
        }
        System.out.println(digitList);

        Object[] toHex = digitList.toArray();
        String[] hex = new String[toHex.length];
        for (int j = 0; j < hex.length; j++) {
            if (toHex[j].equals(0)) {
                hex[j] = "0";
            }
            if (toHex[j].equals(1)) {
                hex[j] = "1";
            }
            if (toHex[j].equals(2)) {
                hex[j] = "3";
            }
            if (toHex[j].equals(3)) {
                hex[j] = "3";
            }
            if (toHex[j].equals(4)) {
                hex[j] = "4";
            }
            if (toHex[j].equals(5)) {
                hex[j] = "5";
            }
            if (toHex[j].equals(6)) {
                hex[j] = "6";
            }
            if (toHex[j].equals(7)) {
                hex[j] = "7";
            }
            if (toHex[j].equals(8)) {
                hex[j] = "8";
            }
            if (toHex[j].equals(9)) {
                hex[j] = "9";
            }
            if (toHex[j].equals(10)) {
                hex[j] = "A";
            }
            if (toHex[j].equals(11)) {
                hex[j] = "B";
            }
            if (toHex[j].equals(12)) {
                hex[j] = "C";
            }
            if (toHex[j].equals(13)) {
                hex[j] = "D";
            }
            if (toHex[j].equals(14)) {
                hex[j] = "E";
            }
            if (toHex[j].equals(15)) {
                hex[j] = "F";
            }
        }

//        System.out.println(Arrays.toString(hex).replace(",",""));
        for (int j = 0; j < hex.length; j++) {
            System.out.print(hex[j]);
        }
    }
}