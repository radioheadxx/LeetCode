package reverse_integer;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int n = x % 10;
            result = result*10 + n;
            x = x / 10;
        }


        return result;
    }
}
