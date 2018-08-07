package ua.ikonovalov;

/**
 * Created by Ivan on 03.08.18.
 */
public class CheckArray {

    public boolean mono(boolean[] data) {
        boolean result = true;

        for (int i = 0; i<data.length-1; i++) {
            if ((data[i] == true && data[i+1] == false) ||  (data[i] == false && data[i+1] == true)){
               result = false;
            }

        } return result;

    }
}
