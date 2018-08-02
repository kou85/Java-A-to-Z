package ua.ikonovalov;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
/**
 * Created by Ivan on 30.07.18.
 */
public class PointTest {
    @Test
    public void distansTot() {
        Point a = new Point(0,1);
        Point b = new Point(2,5);
        double result = a.distanceTo(b);
        assertThat(result, closeTo(4.47213595499958, 0.0004));

    }



}

