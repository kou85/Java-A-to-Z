package ua.ikonovalov;
import java.util.Comparator;

/**
 * class User
 * @author ikonovalov
 * @since 20.11.18.
 * @version 1.0
 */
public class User implements Comparable<User> {
    private int id;
    private String name;
    private String city;
    private int age;

    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    public User(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User o) {
        return Integer.compare(age, o.getAge());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        if (id != user.id) {
            return false;
        }
        if (age != user.age) {
            return false;
        }
        if (name != null ? !name.equals(user.name) : user.name != null) {
            return false;
        }
        return city != null ? city.equals(user.city) : user.city == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "User{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", city='" + city + '\''
                + ", age=" + age
                + '}';
    }
}
