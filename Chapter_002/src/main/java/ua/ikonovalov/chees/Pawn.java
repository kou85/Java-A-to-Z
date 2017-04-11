package ua.ikonovalov.chees;

/**
 * Class Pawn.
 *
 * @author Konovalov.
 * @since 11.04.2017.
 * @version 1.0.
 */
public class Pawn extends Figure {

    /**
     * An array field of the movement of an pawn.
     */
    private Cell[] direction;

    /**
     * The first stroke of the figure.
     */
    private boolean firstMove = true;

    /**
     * The constructor of the Pawn class generates the class object.
     * @param position position of the figure on the Board.
     */
    public Pawn(Cell position) {
        super(position);
    }

    /**
     * Way overridden method of the abstract class Figure.
     * @param distance the specified cell on the Board.
     * @return array of the path of movement of the pawn.
     * @throws ImpossibleMoveException error of the impossibility of motion pawn.
     */
    @Override
    public Cell[] way(Cell distance) throws ImpossibleMoveException {

        int posX = getPosition().getCoordinateX();
        int posY = getPosition().getCoordinateY();
        int distX = distance.getCoordinateX();
        int distY = distance.getCoordinateY();

        int vectorY =  Math.abs(distY - posY);

        if (posX == distX && (vectorY == 1 || firstMove && vectorY == 2)) {
            direction = motionDirection(distance);
            firstMove = false;
        } else {
            throw new ImpossibleMoveException("Pawn can't walk.");
        }
        return direction;
    }

}
