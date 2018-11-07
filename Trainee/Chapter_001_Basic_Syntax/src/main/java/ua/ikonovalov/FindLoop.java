package ua.ikonovalov;

/**
 * Created by Ivan on 03.08.18.
 */
public class FindLoop {
    /**
     *
     * @param data
     * @param el
     * @return
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index <= data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        } return rst;
    }
}
