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
            br = new BufferedReader(new FileReader("ua/ikonovalov/app.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int character;
        StringBuilder sb = new StringBuilder();
        try {
            while ((character = br.read()) != -1) {
                char ch = (char) character;
                if (character == ' ' || ch == '#' || ch == '=') break;
                sb.append(ch);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public String value(String key) {
        throw new UnsupportedOperationException("Don't impl this method yet");
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
}
