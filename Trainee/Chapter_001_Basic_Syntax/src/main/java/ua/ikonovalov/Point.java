package ua.ikonovalov;

/**
 * Created by Ivan on 30.07.18.
 */
public class Point {
    /**
     * x -
     * y -
     */
    private int x;
    private int y;

    /**
     *
     * @param x
     * @param y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @param that
     * @return
     */
    public double distanceTo(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));

    }

}
