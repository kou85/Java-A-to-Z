package ua.ikonovalov;

/**
 * Created by Ivan on 27.07.18.
 */
public class Fit {

    /**
     * calculate the perfect weight for man
     * @param height man
     * @return perfect weight man
     */
    public double manWeight(double height) {
        return (height - 100D) * 1.15D;
    }

    /**
     * calculate the perfect weight for woman
     * @param height woman
     * @return perfect weight woman
     */
    public double womanWeight(double height) {
        return (height - 110D) * 1.15D;
    }

}
