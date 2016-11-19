package ua.ikonovalov;

/**
 * Реализует операции калькулятора: сложение, вычитание, умножение, деление.
 * @author Ivan Konovalov.
 * @since 11.11.2016.
 */
 public class Calculator {
	/**
	* @param first, second аргументы.
	*/
 	private double result;
	/**
	* Операция сложение.
	* @param first - аргумент.
	* @param second - аргумент.
	*/
	public void add(double first, double second) {
		this.result = first + second;
	}
	/**
	* Операция вычитания.
	* @param first - аргумент.
	* @param second - аргумент.
	*/
	public void substract(double first, double second) {
	this.result = first - second;
	}
	/**
	* Операция деления.
	* @param first - аргумент.
	* @param second - аргумент.
	*/
	public void div(double first, double second) {
		 this.result = first / second;
	}
	/**
	* Операция умножения.
	* @param first - аргумент.
	* @param second - аргумент.
	*/
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	/**
	 * Возвращение результата.
	 * @return result - результат.
	*/
	public double getResult() {
		return this.result;
	}
}