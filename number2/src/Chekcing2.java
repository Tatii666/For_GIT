import java.util.Arrays;

public class Chekcing2 {
    public static void main(String[] args) {

        int[] array = {6, 7, 3, 1, 12, 3, 0};


        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length - 1];

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

    }
}
