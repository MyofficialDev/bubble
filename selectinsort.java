import java.util.Arrays;

class swape {
    public static void swap(int[] array, int largest, int lastunsortedindex) {
        if (largest == lastunsortedindex) {
            return;
        }
        int temp = -1;
        temp = array[largest];
        array[largest] = array[lastunsortedindex];
        array[lastunsortedindex] = temp;

    }

    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };
        for (int lastunsortedindex = array.length - 1; lastunsortedindex > 0; lastunsortedindex--) {
            int largest = 0;
            for (int i = 1; i <= lastunsortedindex; i++) {
                System.out.println(Arrays.toString(array));
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }
            swap(array, largest, lastunsortedindex);
        }
    }
}