package ua.ikonovalov.tracker.models;

import java.util.Arrays;

/**
 * Class Comment.
 *
 * @author Konovalov.
 * @since 29.01.2017.
 * @version 1.0.
 */
public class Comment {

    /**
     * The field position in array.
     */
    private int position = 0;

    /**
     * The field remark array.
     */
    private String[] remark;

    /**
     * Getter method for remark.
     *
     * @return remark remark array of comments.
     */
    public String[] getRemark() {

        return this.remark;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<position; i++)
        sb.append(remark[i]);
        return  sb.toString();
    }



    /**
     * Add method for comment.
     *
     * @param comment string comment.
     */

    public void addComment(String comment) {
            if (remark == null) {
                remark = new String[1];
            } else {
                String[] temp = new String[position + 1];
                System.arraycopy(remark, 0, temp, 0, position);
                this.remark = temp;
            }
            remark[position++] = comment;

    }

}