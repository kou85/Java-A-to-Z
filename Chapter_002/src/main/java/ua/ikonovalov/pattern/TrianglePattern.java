package ua.ikonovalov.pattern;

/**
 * class TrianglePattern.
 * @author Konovalov.
 * @since 19.03.2017.
 * @version 1.0.
 */
public class TrianglePattern implements Shape{
    /**
     * The heightTriangle field.
     */
    private int heightTriangle;

    /**
     * Constructor of TrianglePattern class.
     * @param heightTriangle height figure.
     */
    public TrianglePattern(int heightTriangle) {
        this.heightTriangle = heightTriangle;
    }

    /**
     * Method picPattern.
     * @param shape shape.
     * @return returns a string.
     */
    @Override
    public String picPattern(Shape shape) {

        StringBuilder triangle = new StringBuilder();

        for (int external = 0; external < heightTriangle; external++) {
            for (int leftPart = 0; leftPart < heightTriangle - external; leftPart++) {
                triangle.append(" ");
            }
            for (int middlePart = 0; middlePart < external * 2 + 1; middlePart++) {
                if (middlePart % 2 == 0) {
                    triangle.append("*");
                } else {
                    triangle.append(" ");
                }

            }
            for (int rightPart = 0; rightPart < heightTriangle - external; rightPart++) {
                triangle.append(" ");
            }
            triangle.append("\r\n");
        }
        return triangle.toString();
    }
}
