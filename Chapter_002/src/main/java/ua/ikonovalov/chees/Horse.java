package ua.ikonovalov.chees;

import static ua.ikonovalov.chees.Cell.getObjectCell;

/**
 * Class Horse.
 *
 * @author Konovalov.
 * @since 11.04.2017.
 * @version 1.0.
 */
public class Horse extends Figure {
    /**
     * An array field of the movement of an horse.
     */
    private Cell[] direction = new Cell[2];

    /**
     * The constructor of the Horse class generates the class object.
     * @param position position of the figure on the Board.
     */
    public Horse(Cell position) {
        super(position);
    }

    /**
     * Way overridden method of the abstract class Figure.
     * @param distance the specified cell on the Board.
     * @return array of the path of movement of the horse.
     * @throws ImpossibleMoveException error of the impossibility of motion horse.
     */
    @Override
    public Cell[] way(Cell distance) throws ImpossibleMoveException {
        int spot = 0;
        int posX = getPosition().getCoordinateX();
        int posY = getPosition().getCoordinateY();
        int distX = distance.getCoordinateX();
        int distY = distance.getCoordinateY();

        int vectorX = Math.abs(distX - posX);
        int vectorY = Math.abs(distY - posY);

        if (vectorX + vectorY == 3 && posX != distX && posY != distY) {
            direction[spot++] = getObjectCell(distX, distY);
        } else {
            throw new ImpossibleMoveException("Horse can't walk.");
        }
        return direction;
    }
}
