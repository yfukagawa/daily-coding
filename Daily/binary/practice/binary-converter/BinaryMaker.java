import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BinaryMaker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter an integer: ");
        int i = scanner.nextInt();

        if (i >= 0) {
            digitList(i);
        } else {
            negativeDigits(i);
        }
    }

    public static void digitList(int i) {
        //from decimal (positive integer) to binary
        //1. quotient: n/2;
        //2. remainder: n%2;
        //3. Keep dividing the quotient by 2 until the quotient becomes 0.
        //4. the reminders (0 and 1) become the digits for the binary representation
        //5. *code skips this step by using Deque; reorder the digits in the reverse order; i.e. the final remainder becomes the MSB, and the first reminder becomes LSB.
        //6. print from left to right (from MSB to LSB);
        Deque<Integer> digitList = new ArrayDeque<>();
        while (i>0) {
            int digit = i%2;
            digitList.push(digit);
            i = i/2;
        }
        Object[] binary = digitList.toArray();
        for (int j = 0; j < binary.length ; j++) {
            System.out.print(binary[j]);
        }
    }

    public static void negativeDigits(int i) {
        //from decimal (negative integer) to binary
        //1. make it into a positive value
        //2. quotient: n/2;
        //3. remainder: n%2;
        //4. Keep dividing the quotient by 2 until the quotient becomes 0.
        //5. the reminders (0 and 1) become the digits for the binary representation
        //6a. if the lengths is <16, add 0s after the last remainder so that it will be 16 bits
        //6b. if the length is 16<n<32, add 0s after the last remainder so that it will be 32 bits
        //7. *code skips this step by using Deque; reorder the digits in the reverse order; i.e. the final remainder becomes the MSB, and the first reminder becomes LSB.
        //8. invert the digits; i.e, if it is currently 0, change it to 1, and vice versa.
        //9. add "1"; starting from LSB, if it's 0, change it to 1, and that is all.
        //   If the bit is already 1, change it to 0 and move up (to left) to the next bit.
        //   repeat the process until you reach the bit with 0; then change it to 1.
        //10. print from left to right (from MSB to LSB);
        Deque<Integer> digitList = new ArrayDeque<>();
        i = i*(-1);
        while (i>0) {
            int digit = i%2;
            digitList.add(digit);
            i = i/2;
        }

        if (digitList.size() < 16) {
            for (int j = digitList.size(); j < 16 ; j++) {
                digitList.add(0);
            }
        }
        if (digitList.size() > 16 && digitList.size() <= 32) {
            for (int j = digitList.size(); j < 32 ; j++) {
                digitList.add(0);
            }
        }

        Object[] toBinary = digitList.toArray();

        int n = toBinary.length;
        int[] binary = new int[n];
        for (int j = 0; j < toBinary.length; j++) {
            binary[n-1] = (int) toBinary[j];
            n--;
        }

        for (int k = 0; k < binary.length; k++) {
            if(binary[k] == 0) {
                binary[k] = 1;
            } else {
                binary[k] = 0;
            }
        }

        for (int l = 0; l < binary.length ; l++) {
            if (binary[l] == 1) {
                binary[l] = 0;
            } else {
                binary[l] = 1;
                l = 0;
            }
        }

        for (int m = 0; m < binary.length; m++) {
            System.out.print(binary[m]);
        }
    }

}
