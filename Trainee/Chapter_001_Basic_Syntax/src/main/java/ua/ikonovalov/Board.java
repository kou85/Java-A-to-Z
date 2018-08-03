package ua.ikonovalov;

/**
 * Created by Strong on 01.08.18.
 */
public class Board {

    /**
     *
     * @param width
     * @param height
     * @return
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for(int i = 0; i<height; i++){
            for(int j = 0; j<width; j++) {
                if((i+j)%2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
