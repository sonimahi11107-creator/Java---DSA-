public class ReverseNumber {

    static int reverse = 0;

    public static void reverseNumber(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        reverse = reverse * 10 + (n % 10);
        reverseNumber(n / 10);
    }

    public static void main(String[] args) {

        int num = 1234;
        reverseNumber(num);
        System.out.println(reverse);
    }
}
