package ua.ikonovalov.TestColection;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.axes.IteratorPool;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by Strong on 12.11.18.
 */
public class ListExampl {

    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        //переопределяем для правильной проверки идентичности обьектов
        @Override
        public boolean equals(Object o) {
            if (this == o) return true; //если ссілки одинаковіе сразу тру
            if (o == null || getClass() != o.getClass()) return false; // тип данных проверяет, если разные то фолс

            User user = (User) o;

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





    }

    public static void main(String [] args) {
        //--------------lessons Generics
        List<User> users = new ArrayList<>();
        users.add(new User("Petr"));
        //false, becouse ссылки с разнеых объектов, но если переопределить equels то вернет try т.к. в иквелсе проверка идет полей!
        boolean result = users.contains(new User("Petr"));
        System.out.println(result);
        //true, потому что ссылки одинаковые с одного объекта.
        User user = new User("Petr");
        users.add(user);
        boolean result2 = users.contains(user);
        System.out.println(result2);

        //----------- объединение в лист(addAll(Arrays.asList()) и вывод через цикл
        List<User> users2 = new ArrayList<>();
        users2.addAll(Arrays.asList(new User("petr"), new User("ivan"), new User("fed"),new User("pop"))); //Arrays.asList преобразовывает(добавляет пачку данных в лист)
        for (User usersI : users2) {
            System.out.println(usersI); //если ту стринг не переопределен то тогда надо usersI.name
        }

        //iterator
        Iterator<User> it = users2.iterator();
        System.out.println("iterator"+ it.next());
        System.out.println("iterator"+ it.next());

        //в цикле
        while (it.hasNext()) {
            System.out.println("iterator in while" + it.next());
        }

        // Stream API стрим
        users2.forEach(
                new Consumer<User>() {
                    @Override
                    public void accept(User user) {
                        System.out.println("stream" + users2);
                    }
                }
        );


        //---- stream + Lambda
        users2.forEach(user3 -> System.out.println("Lambda" + user3));
        //нестатический вызов объекта
        users2.forEach(System.out::println);


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
