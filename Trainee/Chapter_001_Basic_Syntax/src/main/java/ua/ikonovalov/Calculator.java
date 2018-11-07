package ua.ikonovalov;

/**
 * Created by Ivan on 24.07.18.
 */
public class Calculator {
    double result;

    /**
     *
     * @param first
     * @param second
     */
    void add(double first, double second) {
        this.result = first + second;
    }

    /**
     *
     * @param first
     * @param second
     */
    void  substact(double first, double second) {
        this.result = first - second;
    }

    /**
     *
     * @param first
     * @param second
     */
    void div(double first, double second) {
        this.result = first / second;

    }

    /**
     *
     * @param first
     * @param second
     */
    void multiple(double first, double second) {
        this.result = first * second;
    }

    double getResult() {
        return this.result;
    }

}
