package ua.ikonovalov;

/**
 * Created by Ivan on 03.08.18.
 */
public class TurnArray {
    /**
     * turn Array First To End
     * @param array
     * @return
     */
    public int [] turn(int [] array) {
            for(int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;

        } return array;
    }
}
