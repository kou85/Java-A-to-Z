package ua.ikonovalov;

/**
 * Created by Ivan on 09.08.18.
 */
public class BubbleSort {
    /**
     *
     * @param array
     * @return
     */
    public int[] sort(int[] array) {
      for (int i = array.length-1; i >0; i--) {
        for (int j = 0; j<array.length-1; j++) {
          if (array[j] > array[j+1]) {
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
          }
        }
      } return array;
    }
}
