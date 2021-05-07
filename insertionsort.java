import java.util.Arrays;
class insertionsort {
    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };
        for (int firstunsortedindex = 1; firstunsortedindex < array.length; firstunsortedindex++) {
            int element = array[firstunsortedindex];// the selected firstindecvalue will be saved in element
            int j;
                    //[-15, 20, 35, 7, 55, 1, -22]//
            for (j = firstunsortedindex; j > 0 && array[j - 1] > element; j--) { //it uses new element instead of array[j]..
                                                                                //becuse after a loop the j will be decreamenet 
                                                                                //but new elemetn don't
                array[j] = array[j - 1];
            }
            array[j] = element; //this will apply when the condition is wrong or when j=0
            System.out.println(Arrays.toString(array));
            
        }
   }
}