package main.java.ua.ikonovalov;

import java.util.List;
import java.util.function.*;

/**
 * Created by Strong on 04.12.18.
 */
public class CountFunction {
/*Реализации функций.
    - линейная.
    - квадратичная.
    - логарифмическая. */

    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        return null;
    }

    public void multiple(int start, int finish, int value,
                         BiFunction<Integer, Integer, Double> op,
                         Consumer<Double> media) {
        for (int index = start; index != finish; index++) {
            media.accept(op.apply(value, index));
        }
    }
}
