import java.util.Scanner;

public class ToDecimal {
    Scanner scanner = new Scanner(System.in);
    public int[] binary() {
        System.out.println("how many digits in this binary representation?");
        int bLength = scanner.nextInt();
        System.out.println("Enter your binary, one at time: i.e type 0 or 1 and press enter/return key");
        int[] binary = new int[bLength];
        for (int i = 0; i < bLength; i++) {
            binary[i] = scanner.nextInt();
        }
        return binary;
    }

    public int decimal(int[] binary) {
//        bigendian
        int base10 = 0;
        for (int i = 0; i < binary.length; i++) {
            base10 += (int)(Math.pow(2,binary.length-i-1))*binary[i];
        }
        return base10;
    }
}
