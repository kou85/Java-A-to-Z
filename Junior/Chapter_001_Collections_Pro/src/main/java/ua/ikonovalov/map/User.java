package ua.ikonovalov.map;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Strong on 30.01.19.
 */
public class User {

    private String name;
    private int children;
    private Calendar birthday;

    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getChildren() {
        return children;
    }

    public Calendar getBirthday() {
        return birthday;
    }



    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + children;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }

    public static void main(String[] arg) {
        User user1 = new User("Tom", 2, new GregorianCalendar(2011, 07, 11));
        User user2 = new User("Tom", 2, new GregorianCalendar(2011, 07, 11));
        Map<User, Object> map = new HashMap<>();
        map.put(user1, "one");
        map.put(user2, "two");

        System.out.println("Первый юзер: " + map.get(user1) + " Второй юзер: " + map.get(user2));
        //Результат: выводит опять оба объекта, хоть хєш коді одинаковые но equals выдает false т.к.
        // по умолчанию его реализация сравнивает ссылки на один и тот же объект а не содержимое. .


    }
}
