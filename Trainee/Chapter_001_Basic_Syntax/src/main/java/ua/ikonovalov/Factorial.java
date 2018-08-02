package ua.ikonovalov;

/**
 * Created by Strong on 01.08.18.
 */
public class Factorial {

    /**
     *
     * @param n
     * @return
     */
    public int calc(int n){
        int count = 1;
        for(int i = 2; i<=n; i++){
            if(i !=0 || i != 1) {
                count *= i;
            }
        } return count;
    }
}
