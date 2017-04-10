package ua.ikonovalov.chees;

/**
 * Class Bishop.
 *
 * @author Konovalov.
 * @since 06.04.2017.
 * @version 1.0.
 */
public class Bishop extends Figure {

    /**
     * An array field of the movement of an bishop.
     */
    private Cell[] direction;

    /**
     * The constructor of the Bishop class generates the class object.
     * @param position position of the figure on the Board.
     */
    public Bishop(Cell position) {
        super(position);
    }

    /**
     * Way overridden method of the abstract class Figure.
     * @param distance the specified cell on the Board.
     * @return array of the path of movement of the bishop.
     * @throws ImpossibleMoveException error of the impossibility of motion bishop.
     */
    @Override
    public Cell[] way(Cell distance) throws ImpossibleMoveException {
        int posX = getPosition().getCoordinateX();
        int posY = getPosition().getCoordinateY();
        int distX = distance.getCoordinateX();
        int distY = distance.getCoordinateY();

        if (Math.abs(distX - posX) == Math.abs(distY - posY)) {
            direction = motionDirection(distance);
        } else {
            throw new ImpossibleMoveException("Bishop can't walk.");
        }
        return direction;
    }

}