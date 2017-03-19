package ua.ikonovalov.pattern;

/**
 * class PaintPattern.
 * @author Konovalov.
 * @since 19.03.2017.
 * @version 1.0.
 */
public class PaintPattern {
    /**
     * The shape field.
     */
    private Shape shape;

    /**
     *  Constructor of PaintPattern class.
     * @param shape shape.
     */
    public PaintPattern(Shape shape) {
        this.shape = shape;
    }

    /**
     * Method drawPattern.
     * @param shape shape.
     */
    public  void  drawPattern(Shape shape) {
        System.out.print(shape.picPattern(shape));
    }

}
