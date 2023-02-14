import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter a positive integer: ");
        int i = scanner.nextInt();
//        int i = 223;

        binary(i);

    }

    public static void binary(int i) {
        while (i > 0) {
            int binary = i % 2;
            System.out.print(binary);
            i = i / 2;
        }
    }
}
