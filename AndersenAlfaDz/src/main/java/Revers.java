import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Revers {

    public static void main(Strings[] args) {
        reversColl();
        reversMassiv();
    }

    public static void reversColl() {

        List<Integer> list = Arrays.asList(1, 4, 9, 16, 9, 7, 4, 9, 11);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
    public static void reversMassiv(){

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int a;
        System.out.println(array[1]);
        for (a = 0; a < array.length / 2; a++) {
            int temp = array[a];
            array[a] = array[array.length - 1 - a];
            array[array.length - 1 - a] = temp;
            System.out.println(array[1]);

        }
    }
}
