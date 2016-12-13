package ua.ikonovalov;
/**
* Class RotationArray поворот массива на 90 градусов.
* @author Ivan Konovalov.
* version 1.0.
* @since 13.12.16.
*/

public class  RotationArray {

    /**
    * Method turn method array rotates 90 degrees.
    * @param value array of integer values.
    * @return turned array.
    */
    public int[][] turn(int[][] value) {
        for (int lgth = 0; lgth < value.length / 2; lgth++) {
            for (int column = 0; column < value.length - 1 - lgth; column++) {
            int tmpCell = value[lgth][column];
            value[lgth][column] = value[column][value.length - 1 - lgth];
            value[column][value.length - 1 - lgth] = value[value.length - 1 - lgth][value.length - 1 - column];
            value[value.length - 1 - lgth][value.length - 1 - column] = value[value.length - 1 - column][lgth];
            value[value.length - 1 - column][lgth] = tmpCell;
            }
        }
        return value;
    }
 }