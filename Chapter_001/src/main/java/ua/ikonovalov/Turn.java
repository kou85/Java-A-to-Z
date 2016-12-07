package ua.ikonovalov;
/**
* Class Turn отзеркаливание массива.
* @author Ivan Konovalov.
* version 1.0.
* @since 06.12.16.
*/

public class Turn {
	/**
    * Метод back возвращает зеркальный массив.
    * @param arr массив.
    * @return зеркальній массив.
    */
	public int[] back(int[] arr) {
	    for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
