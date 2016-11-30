package ua.ikonovalov;

/**
* Class Counter вычисление суммы четных чисел.
* @author Konovalov.
* @since 30.11.16.
*/
public class Counter {
	/**
	* Вычисление суммы четных чисел.
	* @param start - начальное значение.
	* @param finish - конечное значение.
	* @return - возврат суммы четных чисел .
	*/
	public int add(int start, int finish) {
		int summ = 0;
		for (int i = start; i <= finish; i++) {
		if (i % 2 == 0) {
		summ += i;
		}
		}
        return summ;
	}
}