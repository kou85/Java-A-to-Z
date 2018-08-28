package ua.ikonovalov;

/**
 * Created by Strong on 28.08.18.
 */
public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i <= data.length-1; i++) {
            for (int j = data.length-1; j >= 1; j--) {
                if ((data[i][i] !=  data[i+1][i+1])||(data[i][j] != data[i+1][j-1])) {
                    return false;
                }
            }
        }
        return result;
    }
}
