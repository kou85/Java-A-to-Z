package ua.ikonovalov;

/**
* Class SeachDublicates поиск дубликатов.
* @author Ivan Konovalov.
* version 1.0.
* @since 10.01.16.
*/

public class  SearchDublicates {
    /**
    * Method findDublicates - Поиск и удаление дубликатов.
    * @param array массив тип String.
    * @return массив с оннулированными дубликатами.
    */
    public boolean findDublicates(String[] array) {
        boolean result = false;
        for (int i = 0; i < array.length - 1; i++) {
                for (int k = i + 1; k < array.length; k++) {
                    if (array[i] != null && array[k] != null && array[i].equals(array[k])) {
                        result = true;
                    }
                }
        }
        return result;
    }
 }