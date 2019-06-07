package ua.ikonovalov;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

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
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("app.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("=")) {
                    String[] str = line.split("=", 2);
                    this.value.put(str[0], str[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String value(String key) {
        //throw new UnsupportedOperationException("Don't impl this method yet");
        return this.value.get(key);
    }
    @Override
    public String toString() {
        StringJoiner out = new StringJoiner(System.lineSeparator());
        try (BufferedReader read = new BufferedReader(new FileReader(this.path))) {
            read.lines().forEach(out::add);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Config("app.properties"));

    }

    public String getPath() {
        return path;
    }

    public Map<String, String> getValue() {
        return value;
    }
}
