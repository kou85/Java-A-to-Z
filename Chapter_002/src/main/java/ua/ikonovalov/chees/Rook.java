package ua.ikonovalov.chees;

/**
 * Class Rook.
 *
 * @author Konovalov.
 * @since 11.04.2017.
 * @version 1.0.
 */
public class Rook extends Figure {

    /**
     * An array field of the movement of an rook.
     */
    private Cell[] direction;

    /**
     * The constructor of the Rook class generates the class object.
     * @param position position of the figure on the Board.
     */
    public Rook(Cell position) {
        super(position);
    }

    /**
     * Way overridden method of the abstract class Figure.
     * @param distance the specified cell on the Board.
     * @return array of the path of movement of the rook.
     * @throws ImpossibleMoveException error of the impossibility of motion rook.
     */
    @Override
    public Cell[] way(Cell distance) throws ImpossibleMoveException {

        int posX = getPosition().getCoordinateX();
        int posY = getPosition().getCoordinateY();
        int distX = distance.getCoordinateX();
        int distY = distance.getCoordinateY();

        if (posX == distX || posY == distY) {
            direction = motionDirection(distance);
        } else {
            throw new ImpossibleMoveException("Rook can't walk.");
        }
        return direction;
    }

}
