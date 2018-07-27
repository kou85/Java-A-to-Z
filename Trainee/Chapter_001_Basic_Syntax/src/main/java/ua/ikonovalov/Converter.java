package ua.ikonovalov;

/**
 * Created by Ivan on 27.07.18.
 */
public class Converter {
    /**
     * It`s converting rubles in euros.
     * @param value rubles.
     * @return euros.
     */
    public int rublesToEuros(int value) {
        return value/70;
    }

    /**
     * It`s converting rubles to dollars
     * @param value rubles.
     * @return  dollars
     */
    public int rublesToDollars(int value) {
        return value/60;
    }

    /**
     * It`s convarting Euros to rubles
     * @param value euros
     * @return rubles
     */
    public int eurosToRubles (int value) {
        return value*70;
    }

    /**
     * It`s converting Dollars to rubles
     * @param value dollars
     * @return rubles
     */
    public int dollarsToRubles (int value) {
        return value*60;
    }

}
