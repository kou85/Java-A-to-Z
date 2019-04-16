package ua.ikonovalov;

import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Strong on 10.04.19.
 */
public class Config {
    private final String path;
    private final Map<String, String> value = new HashMap<String, String>();

    public Config(final String path) {
        this.path = path;
    }

    public void load() {

    }

    public String value(String key) {
        throw new UnsupportedOperationException("Don't impl this method yet");
    }
}
