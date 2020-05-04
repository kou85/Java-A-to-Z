package ua.ikonovalov;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.*;
import java.util.StringJoiner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * @author ikonovalov.
 * @since 05.05.20
 */
public class AnalizyTest {
    public Analizy analizy;
    public StringBuilder stringBuilder;
    public StringJoiner stringJoiner;

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Before
    public void init() throws IOException {
        analizy = new Analizy();
        File target = folder.newFile("target1.csv");
      //  File target = folder.newFile("target3.csv");
        InputStream inputSource = Analizy.class.getClassLoader().getResourceAsStream("serverlog.txt");
        analizy.unavailable(inputSource, target.getAbsolutePath());
       // analizy.unavailable(inputSource, target);
        stringBuilder = new StringBuilder(" 10:58:01; 10:59:01").append(System.lineSeparator())
                .append(" 11:01:02; 11:02:02").append(System.lineSeparator())
                .append(" 11:02:06; 11:02:08");

        stringJoiner = new StringJoiner(System.lineSeparator());
       // try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( new FileInputStream("target1.csv")))) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( new FileInputStream(target.getAbsoluteFile())))) {
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
