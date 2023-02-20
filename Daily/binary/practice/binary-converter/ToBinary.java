
import java.util.Scanner;
import java.util.Stack;

public class ToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter a positive integer: ");
        int i = scanner.nextInt();

        digitList(i);

    }

    public static void digitList(int i) {
        Stack<Integer> digitList = new Stack();
        while (i>0) {
            int digit = i%2;
            digitList.add(digit);
            i = i/2;
        }
        System.out.println(digitList.toString().replace(",",""));

    }
}
