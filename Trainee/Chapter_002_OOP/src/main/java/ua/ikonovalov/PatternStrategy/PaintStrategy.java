package ua.ikonovalov.PatternStrategy;
/**
 * class PaintStrategy.
* @author Konovalov.
* @since 23.10.2018.
* @version 1.0.
*/
public class PaintStrategy {

    /**
     * The shape field.
     */
    private Shape shape;

    /**
     *  Constructor of PaintPattern class.
     * @param shape shape.
     */
    public PaintStrategy(Shape shape) {
        this.shape = shape;
    }

    /**
     * Method draw.
     * @param shape shape.
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw(shape));
    }
}
