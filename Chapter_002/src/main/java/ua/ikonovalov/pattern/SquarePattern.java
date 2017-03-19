package ua.ikonovalov.pattern;

/**
 * class SquarePattern.
 * @author Konovalov.
 * @since 19.03.2017.
 * @version 1.0.
 */
public class SquarePattern implements Shape {

    /**
     * @param heightSquare height;
     */
    private int heightSquare;

    /**
     * Constructor SquarePattern
     *
     * @param heightSquare height;
     */
    public SquarePattern(int heightSquare) {
        this.heightSquare = heightSquare;
    }

    @Override
    public String picPattern(Shape shape) {
        StringBuilder square = new StringBuilder();
        for (int line = 0; line < heightSquare; line++) {
            for (int column = 0; column < heightSquare * 2 - 1; column++) {
                if (column % 2 == 0) {
                    square.append("*");
                } else {
                    square.append(" ");
                }
            }
            square.append("\r\n");
        }
        return square.toString();
    }
}

