import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter a positive integer: ");
        int i = scanner.nextInt();
//        int i = 223;

        toBinary(i);
        binaryToDecimal();


    }

    public static void toBinary(int i) {
        while (i > 0) {
            int binary = i % 2;
            System.out.print(binary);
            i = i / 2;
        }
    }

    public static void binaryToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow many digits in this binary representation?");
        int bLength = scanner.nextInt();
        System.out.println("Enter your binary, one at time: i.e type 0 or 1 and press enter/return key");
        int[] binary = new int[bLength];
        for (int i = 0; i < bLength; i++) {
            binary[i] = scanner.nextInt();
        }
        int base10 = decimal(binary);
        System.out.println(base10);
    }

    public static int decimal(int[] binary) {
//        bigendian
        int base10 = 0;
        for (int i = 0; i < binary.length; i++) {
            base10 += (int)(Math.pow(2,binary.length-i-1))*binary[i];
        }
        return base10;
    }
}
