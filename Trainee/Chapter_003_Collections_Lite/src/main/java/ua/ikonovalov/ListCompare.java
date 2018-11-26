package ua.ikonovalov;

import java.util.Comparator;

/**
 * Created by Strong on 24.11.18.
 */
public class ListCompare implements Comparator<String> {

  /*  @Override
    public int compare(String o1, String o2) {
        int min = o1.length();
            if (o1.length() > o2.length()) {
                min = o2.length();
            }
            int res = 0;
        for (int i = 0; i < min; i++) {
            if(Character.compare(o1.charAt(i), o2.charAt(i)) != 0 ) {
                res = Character.compare(o1.charAt(i), o2.charAt(i));
                //break;
                }
            }
        return res;
    }*/
    @Override
    public int compare(String o1, String o2) {
        int min = o1.length();
        if (o1.length() > o2.length()) {
            min = o2.length();
        }
        int res = 0;
        for (int i = 0; i < min; i++) {
            res = Character.compare(o1.charAt(i), o2.charAt(i));
                if(res != 0) {
                    break;
            }
        }
        if (res == 0) {
            res = o1.length() - o2.length();
            }
        return res;
        }
}
