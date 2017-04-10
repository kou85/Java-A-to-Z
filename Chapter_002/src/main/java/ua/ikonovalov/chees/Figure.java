package ua.ikonovalov.chees;

import static ua.ikonovalov.chees.Cell.getObjectCell;


/**
 * @author Konovalov;
 * @since 03.04.17;
 * version 1.0;
 */
public abstract class Figure {
    /**
     * The field position of the figure on the Board.
     */
    private Cell position;
    /**
     * Field X coordinate of the destination cell speed figure.
     */
    private int coordinateToX;
    /**
     * Field Y coordinate of the destination cell speed figure.
     */
    private int coordinateToY;
    /**
     * The array length of the path of movement of the figure.
     */
    private int lengthPath;

    /**
     * The constructor of the Figure class generates the class object.
     * @param position position of the figure on the Board.
     */
    public  Figure(Cell position) {
        this.position = position;
    }
    public abstract Cell[] way(Cell distance) throws ImpossibleMoveException;

    public Cell[] motionDirection(Cell distance) throws ImpossibleMoveException {

        int posX = position.getCoordinateX();
        int posY = position.getCoordinateY();
        int distX = distance.getCoordinateX();
        int distY = distance.getCoordinateY();


        coordinateToX = distX > posX ? 1 : distX < posX ? -1 : 0;
        coordinateToY = distY > posY ? 1 : distY < posY ? -1 : 0;

        int vectorX = Math.abs(distX - posX);
        int vectorY = Math.abs(distY - posY);

        lengthPath = vectorX > vectorY ? vectorX : vectorY;

        Cell[] direction = new Cell[lengthPath];
        for (int value = 0; value != lengthPath; value++) {
            posX += coordinateToX;
            posY += coordinateToY;
            direction[value] = getObjectCell(posX, posY);
        }
        return direction;
    }

    /**
     * Getter for position.
     * @return position.
     */
    public Cell getPosition() {
        return position;
    }
    /**
     * Method replaces the coordinates of the figure on a new.
     * @param dist the cell move figure.
     */
    public void replace(Cell dist) {
        this.position = dist;
    }
}
