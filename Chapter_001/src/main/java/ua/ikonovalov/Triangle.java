package ua.ikonovalov;
/**
* Class Triangle вычисление площади треугольника.
* @author Ivan Konovalov.
* version 1.0.
* @since 23.11.16.
*/

public class Triangle {
	    /**
    *  Добавляем поле Point a.
    */
	private Point a;
    /**
    *  Добавляем поле Point b.
    */
	private Point b;
    /**
    *  Добавляем поле Point c.
    */
	private Point c;

/**
    * Конструктор Triangle для создания обьекта класса.
    * @param a точка a.
    * @param b точка b.
    * @param c точка c.
    */
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
 /**
    * Метод area.
    * Метод вычисления площади треугольника.
    * Соблюдая условие прикотором треугольник не возможно построить.
    * @return либо значение площади треугольника, либо 0.
    * Если не возможно построить треугольник.
    */
	public double area() {
		double lineAB = this.a.distanceTo(this.b);
		double lineBC = this.b.distanceTo(this.c);
		double lineCA = this.c.distanceTo(this.a);
		double perimeter = (lineAB + lineBC + lineCA) / 2;
		if (lineAB > 0 && lineBC > 0 && lineCA > 0 && (lineAB + lineBC) > lineCA && (lineBC + lineCA) > lineAB && (lineCA + lineAB) > lineBC) {
		return Math.sqrt(perimeter * (perimeter - lineAB) * (perimeter - lineBC) * (perimeter - lineCA));
		} else {
			return 0;
		}
	}
}
