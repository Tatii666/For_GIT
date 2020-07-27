public class Checking {
    public static void main(String[] args) {
        System.out.println(checkBalance(new int[]{2, 3, 1,  1, 0, 1, 5, 2}));
        System.out.println(checkBalance(new int[]{1, 1, 2, 2, 1, 1}));
        System.out.println(checkBalance(new int[]{4, 4}));
        System.out.println(checkBalance(new int[]{1, 2, 1, 0, 0, 3, 1}));
    }
    private static boolean checkBalance(int[]array) {
        System.out.println();
        boolean result = false;
        int leftSum = 0;
        int rightSum = 0;

        rightSum = sum(array, 0, array.length);

        for (int i = 0; i < array.length; i++){


            leftSum += array[i];
            rightSum -= array[i];

            if (leftSum == rightSum){
                System.out.println(i);
                result = true;
            }
        }
        return result;
    }
    private static int sum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
