package warmup1;

public class Diff21 {
    public static int main(String[] args) {
        System.out.println(diff21(9));
    }

    public static int diff21(int n) {
        if (n < 21) {
            return n - 21;
        }
        else {
            return 2 * (n - 21);
        }

    }
}

