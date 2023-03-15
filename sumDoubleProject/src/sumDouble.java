public class sumDouble {
    public static void main(String[] args) {
        System.out.println(sumDouble(2, 3));
        System.out.println(sumDouble(4, 5));
        System.out.println(sumDouble(9, 9));
    }


    public static int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        } else {
            return 2 * (a + b);
        }
    }
}
