package ua.ikonovalov;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author Konovalov
 * @since 27.04.17
 * @version 1.0
 */
public class TestingPerformanceCollection {
    public long add(Collection<String> collection, String line, int amount) {
        long startTime = System.currentTimeMillis();
        for (int index = 0; index < amount; index++) {
            collection.add(String.format("%s - %s", line, index));
        }
        return System.currentTimeMillis() - startTime;
    }
    public long delete(Collection<String> collection, int amount) {
        long startTime = System.currentTimeMillis();
        Iterator<String> iterator = collection.iterator();
        for (int index = 0; index < amount; index++) {

            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }
        return System.currentTimeMillis() - startTime;
    }
}

