package ua.ikonovalov;

/**
* Class Max вычисление максимального значения.
* @author Konovalov.
* @since 23.11.16.
*/
public class Max {
	/**
	* Вычисление максимального значения из 2х чисел.
	* @param first - первое значение.
	* @param second - второе значение.
	* @return - возврат большего.
	*/
	public int max(int first, int second) {
        return first > second ? first : second;
	}
	/**
	* Вычисление максимального значения из 3х чисел.
	* @param first - первое значение.
	* @param second - второе значение.
	* @param third - третье значение.
	* @return - возврат большего значения.
	*/
	public int max(int first, int second, int third) {
		return this.max(first, this.max(second, third));
	}
}