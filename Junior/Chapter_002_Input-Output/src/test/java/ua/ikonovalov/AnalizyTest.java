package ua.ikonovalov;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.StringJoiner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Strong on 05.09.19.
 */
public class AnalizyTest {
    public Analizy analizy;
    public StringBuilder stringBuilder;
    public StringJoiner stringJoiner;

    @Before
    public void init() {
        analizy = new Analizy();
        InputStream inputSource = Analizy.class.getClassLoader().getResourceAsStream("serverlog.txt");
        analizy.unavailable(inputSource, "target.csv");
        stringBuilder = new StringBuilder("400 10:58:01").append(System.lineSeparator())
                .append("200 10:59:01").append(System.lineSeparator())
                .append("500 11:01:02").append(System.lineSeparator())
                .append("200 11:02:02").append(System.lineSeparator())
                .append("400 11:02:06").append(System.lineSeparator())
                .append("200 11:02:08");

        stringJoiner = new StringJoiner(System.lineSeparator());
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( new FileInputStream("target.csv")))) {
            bufferedReader.lines().forEach(stringJoiner::add);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void unavailable() {
        assertEquals(stringBuilder.toString(), stringJoiner.toString());



    }

}
