public class Main {
    public static void main(String[] args) {
        //from decimal to hex
        //1. quotient: n/16;
        //2. remainder: n%16;
        //3. Keep dividing the quotient by 16 until the quotient becomes 0.
        //4. hex: 0 1 2 3 4 5 6 7 8 9 A B C D E F

        int n = 333;
        int quotient = n;
        int remainder = n;

        while(quotient > 0) {
            remainder = quotient%16;
            quotient = quotient/16;

            System.out.println("q " + quotient);
            System.out.println("r " + remainder);
        }


    }
}