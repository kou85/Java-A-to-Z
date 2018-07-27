package ua.ikonovalov;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
/**
 * Created by Ivan on 27.07.18.
 */
public class FitTest {
    /**
     * calculate the perfect weight for man
     */
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double result = fit.manWeight(180);
        assertThat(result, closeTo(92.0, 0.1));
    }

    /**
     * calculate the perfect weight for woman
     */
    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double result = fit.womanWeight(170);
        assertThat(result, closeTo(69.0, 0.1));
    }
}
