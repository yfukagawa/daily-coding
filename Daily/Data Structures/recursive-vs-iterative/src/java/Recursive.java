public class Recursive {
    public static void main(String[] args) {
        int i = 27;
        System.out.println(i);
        div(i);
        System.out.println("\n");
        sub(i);
    }

    public static int div(int i) {
        if (i > 0) {
            i = i/2;
            System.out.println(i);
            return div(i);
        } else {
            System.out.println("End Recursive Division");
            return 0;
        }
    }

    public static int sub(int i) {
        if (i > 0) {
            i--;
            System.out.println(i);
            return sub(i);
        } else {
            System.out.println("End Recursive Subtraction");
            return 0;
        }
    }
}
