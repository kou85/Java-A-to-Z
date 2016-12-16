package ua.ikonovalov;

import java.util.Arrays;
/**
* Class RemoveDublicates поиск и удаление дубликатов.
* @author Ivan Konovalov.
* version 1.0.
* @since 16.12.16.
*/

public class  RemoveDublicates {

    /**
    * Method findDestroy - Поиск и удаление дубликатов.
    * @param array массив тип String.
    * @return новый массив без дубликатов.
    */
    public String[] findDublicatesRemove(String[] array) {
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