package ua.ikonovalov;

/**
 * Created by Strong on 28.08.18.
 */
public class MatrixCheck {
    /**
     *
     * @param data
     * @return
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0, j = data.length - 1; i < data.length - 1 && j >= 1; i++, j--) {
             if ((data[i][i] != data[i + 1][i + 1]) || (data[i][j] != data[i + 1][j - 1])) {
             return false;
              }
         } return result;
     }
}

