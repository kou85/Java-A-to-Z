package java.ua.ikonovalov;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Konovalov Ivan
 * @version 00
 * @since 23.02.2020
 */
public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator comparator =  new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);
        // Здесь создайте компаратор на основании анонимного класса.
        Comparator<Attachment> attachment = new Comparator<Attachment>() {

            @Override
            public int compare(Attachment o1, Attachment o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getName().length() - right.getName().length();
            }
        };
    }
}
