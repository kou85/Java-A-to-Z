package ua.ikonovalov.patternStrategy;

/**
 *
 */
public class SquareStrategy implements Shape {
    /**
     *
     * @param shape shape.
     * @return
     */
    @Override
    public String draw(Shape shape) {
        StringBuilder pic = new StringBuilder();
        pic.append("+++++");
        pic.append("+   +");
        pic.append("+   +");
        pic.append("+   +");
        pic.append("+++++");
        return pic.toString();
    }
}
