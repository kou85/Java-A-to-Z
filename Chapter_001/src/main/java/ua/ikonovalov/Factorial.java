package ua.ikonovalov;

/**
* Class Factorial вычисление суммы четных чисел.
* @author Konovalov.
* @since 30.11.16.
*/
public class Factorial {
	/**
	* Вычисление факториала.
	* @param number - начальное значение.
	* @return - возврат вычисленный факториал.
	*/
	public int resultFactorial(int number) {
		int result = 1;
		if (number == 0 && number < 0) {
			throw new IllegalArgumentException("Введите число больше 0");
		}
		for (int i = 2; i <= number; i++) {
		result *= i;
		}
	return result;
	}
}