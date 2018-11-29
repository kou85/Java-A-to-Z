package ua.ikonovalov.bank;

/**
 * class User
 * @author ikonovalov
 * @since 27.11.18.
 * @version 1.0
 */
public class User implements Comparable {
    private String name;
    private String pasport;

    public User(String name, String pasport) {
        this.name = name;
        this.pasport = pasport;
    }
    public User() {

    }

    public String getName() {
        return name;
    }

    public String getPasport() {
        return pasport;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPasport(String pasport) {
        this.pasport = pasport;
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
        if (name != null ? !name.equals(user.name) : user.name != null) {
            return false;
        }
        return pasport != null ? pasport.equals(user.pasport) : user.pasport == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (pasport != null ? pasport.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
