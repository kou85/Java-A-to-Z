package ua.ikonovalov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Ivan on 02.08.18.
 */
public class BoardTest {
  @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
      Board board = new Board();
      String result = board.paint(3, 3);
      final String line = System.getProperty("line.separator");
      String expected = String.format("X X%s X %sX X%s", line, line, line);
      assertThat(result, is(expected));
  }

  @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
      Board board = new Board();
      String result = board.paint(5, 5);
      final String line = System.getProperty("line.separator");
      String expected = String.format("X X X%s X X %sX X X%s X X %sX X X%s", line, line, line, line, line);
      assertThat(result, is(expected));
  }

  @Test
  public void whenPaintBoardWithWidthTenAndHeightFourThenStringWithTenColsAndFourRows() {
      Board board = new Board();
      String result = board.paint(10, 10);
      final String line = System.getProperty("line.separator");
      String expected = String.format("X X X X X %s X X X X X%sX X X X X %s X X X X X%sX X X X X %s X X X X X%sX X X X X %s X X X X X%sX X X X X %s X X X X X%s", line, line, line, line, line, line, line, line, line, line);
      assertThat(result, is(expected));
  }
}
