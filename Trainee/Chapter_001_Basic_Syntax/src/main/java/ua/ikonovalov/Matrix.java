package ua.ikonovalov;
/**
 * Created by Strong on 28.08.18.
 */
public class Matrix {
    /**
     *
     * @param size matrix [size][size]
     * @return multiple i*j, start i = 1, j = 1.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i+1)*(j+1);
            }
        }
        return table;
    }
}
