package ua.ikonovalov.TestColection;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Strong on 12.11.18.
 */
public class ListExampl {

    public static void main(String [] args) {



        List <Integer> list = new LinkedList<>();
        list.add(425);
        Integer value = list.get(0);
        System.out.println(value);
        list.add(1,32);
        System.out.println(list.get(1));

        List<Integer> flats = new ArrayList<>();
        flats.add(4);
        flats.add(3);
        list.addAll(flats);

        System.out.println("fined 4 index = " + list.indexOf(4));
        System.out.println("fined 4 index = " + list.lastIndexOf(4));

        list.remove(2);
        System.out.println("fined 4 index = " + list.indexOf(4));

        System.out.println("fined 3 index = " + list.indexOf(3));




    }

}
