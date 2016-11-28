package ua.ikonovalov;
/**
* Class Point координаты точек для треугольника .
* @author Konovalov.
* @since 23.11.16.
*/
public class Point {
	/**
	* Добавляем поле координаты x.
	*/
	private double x;
	/**
	* Добавляем поле координаты y.
	*/
	private double y;
	/**
	* Конструктор Point.
	* @param x - первый параметр.
	* @param y - второй параметр.
	*/
	public Point(double x, double y) {
	this.x = x;
	this.y = y;
	}
	/**
    * Метод distanceTo.
    * Метод определяет расстояние между двумя точками.
    * @param point вторая point.
    * @return расстояние между двумя точками.
    */
	public double distanceTo(Point point) {
	return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
	}
}
