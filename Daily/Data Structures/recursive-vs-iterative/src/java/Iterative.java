public class Iterative {
    public static void main(String[] args) {
        int i = 27;
        System.out.println(i);
        div(i);
        System.out.println("\n");
        sub(i);
    }

    public static void div(int i) {
        while (i > 0) {
            i = i/2;
            System.out.println(i);
        }
        System.out.println("End Iterative Division");
    }

    public static void sub(int i) {
        while (i > 0) {
            i--;
            System.out.println(i);
        }
        System.out.println("End Iterative Subtraction");
    }
}
