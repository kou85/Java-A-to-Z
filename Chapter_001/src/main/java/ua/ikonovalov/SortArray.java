package ua.ikonovalov;
/**
* Class SortArray сортировка массива.
* @author Ivan Konovalov.
* version 1.0.
* @since 07.12.16.
*/

public class SortArray {

    /**
    * Метод Sort сортировка пузырьком.
    * @param values целочисленные значения.
    * @return отсортированного массива.
    */
    public int[] sort(int[] values) {
            for (int i = values.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        return values;
    }
 }