package ua.ikonovalov.TestColection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Strong on 13.11.18.
 */
public class SetExample {

        static class User1 implements Comparable<User1> { //имплементировали Comparable и переопределили метод compareTo для сортировки!!
            private String name;


            public User1(String name) {
                this.name = name;
            }

            //переопределяем для правильной проверки идентичности обьектов
            @Override
            public boolean equals(Object o) {
                if (this == o) return true; //если ссілки одинаковіе сразу тру
                if (o == null || getClass() != o.getClass()) return false; // тип данных проверяет, если разные то фолс

                User1 user = (User1) o;

                return name != null ? name.equals(user.name) : user.name == null; // проверяет поля

            }

            @Override
            public int hashCode() {
                return name != null ? name.hashCode() : 0;
            }

            //Переопределяем для отображения полезной информации, тобишь в віводе указіваем просто обьект(usersI), иначе надо было указывать usersI.name
            @Override
            public String toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        '}';
            }

            @Override
            public int compareTo(User1 o) {
                return this.name.compareTo(o.name);
            }
        }





    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); //HashSet выводит данные упорядоченно

        //Set<Integer> set = new TreeSet<>(); //отсортирует, сама трисет как дерево структура
        set.add(3);
        set.add(1);
        set.add(4);
        set.add(4);

        for (Integer value: set) {
            System.out.println(value);
        }
//sort name
        Set<User1> users5 = new TreeSet<>();
        users5.addAll(Arrays.asList(
                new User1("petr"),
                new User1("ivan"),
                new User1("ali"),
                new User1("pop"))); //Arrays.asList преобразовывает(добавляет пачку данных в лист)
        System.out.println("Sort Set"+ users5);

    }


}
