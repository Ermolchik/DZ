public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(6));

    }

    public static long factorial(long n) {
        long ret = 1;
        for (int i = 1; i <= n; ++i) ret *= i;
        return ret;
    }

}
