package homeWork;


import java.util.Arrays;
import java.util.Scanner;

public class User {
    String symbol;
    Month month;

    public void getSymbol() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву:");
        symbol = scanner.next();

    }

    public void isVowel() {
        switch (symbol) {
            case "A":
            case "E":
            case "O":
            case "I":
            case "U":
            case "Y":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

    }

    public void ifVowel() {
        if (symbol.equals("A") ||
                symbol.equals("E") ||
                symbol.equals("O") ||
                symbol.equals("I") ||
                symbol.equals("U") ||
                symbol.equals("Y")) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

    }

    public void setMonth() {
        System.out.println("Введите месяц :");
        Scanner scanner = new Scanner(System.in);
        String m = scanner.next();
        for (Month month : Month.values()) {
            if (m.equals(month.toString())) {
                this.month = month;
                return;
            }
        }
        System.out.println("Ошибка в названии месяца!");
    }

    public void printSeason() {
        System.out.println(month.season);

    }

    public void word() {
        Scanner scanner = new Scanner(System.in);

        String word;

        do {
            System.out.println("Введите слово:");
            word = scanner.next();
            if (!word.equals("exit")) {
                System.out.println(word);
            }

        }
        while (!word.equals("exit"));
        {
        }
        System.exit(1);

    }

    //    @Description("4. Пользователь вводит два числа. Найти сумму всех чисел" +
//            "расположенных между ними и которые делятся на 3.")
    public void sum() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int one = scanner.nextInt();
        System.out.println("Введите второе число");
        int two = scanner.nextInt();

        int[] array = new int[two - one - 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = one + i + 1;
            System.out.println(array[i]);
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        System.out.println(sum);
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public void palindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String word = scanner.nextLine();
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        if (word.equals(builder.toString())) {
            System.out.println("palindrome");
            return;
        }
        System.out.println("not palindrome");
    }

    public void maxAndMin() {
        int[] array = new int[]{10, 52, 487, 87, 26, 7, 645, 52};

        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Максимальное число:" + max);
        System.out.println("Минимальное число:" + min);
    }

    public void mass() {
        int[] array = new int[]{10, 52, 487, 87, 26};
        System.out.println(Arrays.toString(array));
        for (int j = 0; j <array.length; j++) {

            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] = array[i + 1] + array[i];
                    array[i + 1] = array[i] - array[i + 1];
                    array[i] = array[i] - array[i + 1];
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


        static long fibonachi(long n) {

            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            } else {
                return fibonachi(n - 1) + fibonachi(n - 2);
            }
        }

        public void massiveFib(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        long[]array = new long[scanner.nextInt()];

            for (int i = 0; i < array.length ; i++) {
                array[i]=fibonachi(i);

            }
            System.out.println(Arrays.toString(array));
        }
        public void summaMinAndMax(){
            int[] array = new int[]{10, 52, 487, 87, 26, 7, 645, 52};

            int min = array[0];
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }

            System.out.println("Сумма минимальнго и максимального числа:" + (max + min));

        }
        public void even(){
            int[] array = new int[]{10, 52, 487, 87, 26, 7, 645, 52};

            int summEven = 0;
            int summNotEven = 0;
            for (int i = 0; i < array.length; i++) {
                if (i %2 ==0) {
                    summEven = summEven + array[i];
                }
              else {
                  summNotEven = summNotEven + array[i];
                }
            }
            System.out.println("Разница между суммой элементов стоящих на четных" +
                    " и нечетных местах: " + (summEven-summNotEven));
        }

        public void repeatNumber(){
        int[] array = new int[]{10, 52, 487, 87, 26, 7, 645, 7};

        int repeat = 0;
        int number = 0;

        int[] array2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
           number = array[i];
            for (int j = 0; j <array.length; j++) {
                if(number == array[j]){
                    repeat++;
                }

            }
            array2[i]=repeat;
            repeat =0;
            System.out.println(array2[i]);
        }

    }
}
