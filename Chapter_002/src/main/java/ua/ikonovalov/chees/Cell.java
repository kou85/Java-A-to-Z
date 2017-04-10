package ua.ikonovalov.chees;

/**
 * class Cell
 * @author Konovalov.
 * @since 03.04.15
 * @version 1.0
 */
public class Cell {
    /**
     * coordinate X of the cell;
     */
    private int coordinateX;
    /**
     * coordinate Y of the cell;
     */
    private int coordinateY;

    /**
     *
     * @param coordinateX - coordinate of the cell X;
     * @param coordinateY- coordinate of the cell Y;
     */
    private Cell (int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    /**
     * Static method object of class Cell.
     * @param coordinateX The X-coordinate of the cell Board.
     * @param coordinateY The Y-coordinate of the cell Board.
     * @return Returns a new object of class.
     */
    public static Cell getObjectCell(int coordinateX, int coordinateY) {
        return new Cell(coordinateX, coordinateY);
    }
    /**
     *
     * @return
     */
    public int getCoordinateX() {
        return this.coordinateX;
    }

    /**
     *
     * @return
     */
    public int getCoordinateY() {
        return this.coordinateY;
    }

    /**
     *
     * @param coordinateX
     */
    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    /**
     *
     * @param coordinateY
     */
    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
}
