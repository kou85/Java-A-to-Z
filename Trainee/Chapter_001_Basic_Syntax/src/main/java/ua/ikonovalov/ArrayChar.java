package ua.ikonovalov;

/**
 * Created by Ivan on 07.08.18.
 */
public class ArrayChar {

    /**
     *
     */
    private char[] data;

    /**
     *
     * @param line
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     *
     * @param prefix
     * @return
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        //Проверка условия
        for(int i = 0; i<value.length; i++)
            if (data[i] != value[i]){
        result = false;
        }
        return result;
    }
}
