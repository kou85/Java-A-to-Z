package ua.ikonovalov.PatternStrategy;

public class TriangleStrategy implements Shape {

    @Override
    public String draw(Shape shape) {
        StringBuilder pic = new StringBuilder();
        pic.append("   +   ");
        pic.append("  +++  ");
        pic.append(" +++++ ");
        pic.append("+++++++");
        return pic.toString();
    }
}
