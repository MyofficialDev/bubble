import java.util.Arrays;;

class Main {
    public static void swap(int[] array, int a, int b) {
        if (a == b) {
            return;
        }
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = { 5, 9, 3, 9, 8, 4 };
        System.out.println(array.length - 1);
        for (int unsortedlastindex = array.length - 1; unsortedlastindex > 0; unsortedlastindex--) {

            for (int i = 0; i < unsortedlastindex; i++) {

                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    System.out.println(Arrays.toString(array));
                }
            }
        }

    }
}