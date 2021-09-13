public class Factorial {

    private static long number;

    private static final Factorial FACTORIAL = new Factorial();


    private static long factorial(long x) {
        if (x == 1) {
            return 1;
        }

        return x * factorial(x - 1);
    }

    public static long getNumber() {
        return number;
    }

    public static synchronized Factorial getFactorial(long x) {

        number = factorial(x);

        return FACTORIAL;


//        if ( factorial == null){
//            factorial = ;
//        }
//        return factorial;
    }


}
