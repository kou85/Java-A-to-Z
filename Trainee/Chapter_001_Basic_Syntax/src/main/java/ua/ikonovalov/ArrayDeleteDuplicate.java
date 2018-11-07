package ua.ikonovalov;

import java.util.Arrays;

/**
 * Created by Strong on 30.08.18.
 */
public class ArrayDeleteDuplicate {
    /**
     *
     * @param array
     * @return
     */
    public String[] removeDuplicate(String[] array) {
       int countDublicates = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] != null && array[k] != null && array[i].equals(array[k])) {
                    array[k] = null;
                    countDublicates++;
                }
            }
            for (int n = array.length - 1; n >= 0; n--) {
                for (int j = 0; j < n; j++) {
                    if (array[j] == null) {
                        array[j] = array[j + 1];
                        array[j + 1] = null;
                    }
                }
            }
        }
        return Arrays.copyOf(array, array.length - countDublicates);
    }

}

