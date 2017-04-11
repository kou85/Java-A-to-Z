package ua.ikonovalov.chees;

/**
 * Class King.
 *
 * @author Konovalov.
 * @since 11.04.2017.
 * @version 1.0.
 */
public class King extends Figure {

    /**
     * An array field of the movement of an king.
     */
    private Cell[] direction;

    /**
     * The constructor of the King class generates the class object.
     * @param position position of the figure on the Board.
     */
    public King(Cell position) {
        super(position);
    }

    /**
     * Way overridden method of the abstract class Figure.
     * @param distance the specified cell on the Board.
     * @return array of the path of movement of the king.
     * @throws ImpossibleMoveException error of the impossibility of motion king.
     */
    @Override
    public Cell[] way(Cell distance) throws ImpossibleMoveException {

        int posX = getPosition().getCoordinateX();
        int posY = getPosition().getCoordinateY();
        int distX = distance.getCoordinateX();
        int distY = distance.getCoordinateY();

        int vectorX = Math.abs(distX - posX);
        int vectorY = Math.abs(distY - posY);

        if (vectorX + vectorY == 1 || vectorX == vectorY) {
            direction = motionDirection(distance);
        } else {
            throw new ImpossibleMoveException("King can't walk.");
        }
        return direction;
    }

}
