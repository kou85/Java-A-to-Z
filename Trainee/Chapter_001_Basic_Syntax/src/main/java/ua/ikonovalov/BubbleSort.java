package ua.ikonovalov;

/**
 * Created by Ivan on 09.08.18.
 */
public class BubbleSort {

    public int[] sort(int[] array) {
for (int i = 0; i<array.length-1; i++) {
    if (array[i] > array[i+1]) {
     int temp = array[i];
        array[i] = array[i+1];
        array[i+1] = temp;
    }
} return array;
    }
}
