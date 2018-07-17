package ua.ikonovalov;

/**
 * Created by Ivan on 17.07.18.
 */
public class EvenInterator {

    public int lineArray;
    public int [] numbers;


    public EvenInterator(final int[] numbers) {

    }


    @Override
    public boolean hasNext() {
        boolean result = true;


        return false;
        //  return array < data.size();
    }

    @Override
    public Object next() {


        return numbers;
    }
}
