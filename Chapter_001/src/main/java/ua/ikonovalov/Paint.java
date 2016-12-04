package ua.ikonovalov;

/** Class Paint, построение пирамиды.
 * @author Ivan Konovalov.
 * @since 03.12.16.
 * @version 1.0.
 */
public class Paint {
/**
	* @param height заданная высота пирамиды.
	* @return возвращает строку пирамиды.
	*/
    String piramid(int height) {
        StringBuilder pyramid = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int k = 0; k < height - 1; k++) {
				pyramid.append(" ");
			}
                for (int j = 0; j < i * 2 + 1; j++) {
						if (j % 2 != 0) {
						pyramid.append(" ");
                } else {
					pyramid.append("^");
				}
			}
            pyramid.append("\r\n");
       }
        return pyramid.toString();
    }
}
