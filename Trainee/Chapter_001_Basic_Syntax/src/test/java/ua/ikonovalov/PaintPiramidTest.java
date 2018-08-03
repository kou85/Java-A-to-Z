package ua.ikonovalov;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
/**
 * Created by Ivan on 02.08.18.
 */
public class PaintPiramidTest {
    @Test
    public void whenFourPiramid() {
        PaintPiramid paintPiramid = new PaintPiramid();
        String rst = paintPiramid.piramid(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }

    @Test
    public void whenSevenPiramid() {
        PaintPiramid paintPiramid = new PaintPiramid();
        String rst = paintPiramid.piramid(7);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("      ^      ")
                                .add("     ^^^     ")
                                .add("    ^^^^^    ")
                                .add("   ^^^^^^^   ")
                                .add("  ^^^^^^^^^  ")
                                .add(" ^^^^^^^^^^^ ")
                                .add("^^^^^^^^^^^^^")
                                .toString()
                )
        );
    }
}


